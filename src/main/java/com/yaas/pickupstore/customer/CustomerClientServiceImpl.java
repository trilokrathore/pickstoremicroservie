package com.yaas.pickupstore.customer;

import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Service;

import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import com.yaas.pickupstore.api.generated.YaasAwareParameters;
import com.yaas.pickupstore.client.customer.CustomerServiceClient;
import com.yaas.pickupstore.utility.ErrorHandler;

@Service("customerClientService")
public class CustomerClientServiceImpl implements CustomerClientService{

	private static final String ATT_CONTACT_EMAIL = "contactEmail";

	@Inject
	private CustomerServiceClient customerClient;

	public String getCustomer(final YaasAwareParameters yaasAware, final String customer, final AccessToken token) {
		final Response response = customerClient
				.tenant(yaasAware.getHybrisTenant())
				.customers()
				.customerNumber(customer)
				.prepareGet()
				.withAuthorization(token.toAuthorizationHeaderValue())
				.execute();
		

		if (response.getStatus() == Status.OK.getStatusCode()) {
			return (String) response.readEntity(Map.class).get(ATT_CONTACT_EMAIL);
		} else if (response.getStatus() == Status.NOT_FOUND.getStatusCode()) {
			throw new BadRequestException("Owner " + customer + " does not exist");
		}
		throw ErrorHandler.resolveErrorResponse(response, token);
	}
}
