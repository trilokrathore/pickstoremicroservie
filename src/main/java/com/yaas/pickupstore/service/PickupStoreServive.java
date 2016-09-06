package com.yaas.pickupstore.service;



import javax.annotation.ManagedBean;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginatedCollection;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginationRequest;
import com.yaas.pickupstore.api.generated.Pickupstore;
import com.yaas.pickupstore.api.generated.YaasAwareParameters;
import com.yaas.pickupstore.customer.CustomerClientService;
import com.yaas.pickupstore.document.DocumentClientService;
import com.yaas.pickupstore.email.EmailClientService;
import com.yaas.pickupstore.utility.AuthorizationHelper;

@ManagedBean
public class PickupStoreServive {

	private static final String SCOPE_DOCUMENT_VIEW = "hybris.document_view";
	private static final String SCOPE_DOCUMENT_MANAGE = "hybris.document_manage";
	private static final String SCOPE_CUSTOMER_VIEW = "hybris.customer_read";
	private static final String SCOPE_EMAIL_SEND = "hybris.email_send";
	private static final String SCOPE_EMAIL_MANAGE = "hybris.email_manage";
	@Inject
	private DocumentClientService documentClient;
	
	@Inject
	private AuthorizationHelper authHelper;
	
	@Autowired
	private CustomerClientService  customerClientService ;
	
	@Autowired
	private EmailClientService emailClientService;

	public PaginatedCollection<Pickupstore> getPickupStores(final PaginationRequest paginationRequest,
			final YaasAwareParameters yaasAware) {

		return authHelper.wrapWithAuthorization(yaasAware, SCOPE_DOCUMENT_VIEW,
				token -> documentClient.getPickupstores(paginationRequest, yaasAware, token));
	}

	public String createPickupStore(final YaasAwareParameters yaasAware, final Pickupstore pickupstore) {

//		final String email = authHelper.wrapWithAuthorization(yaasAware, SCOPE_CUSTOMER_VIEW,
//				token -> customerClient.getCustomer(yaasAware, pickupstore.getOwner(), token));
		
		
		final String email="trilok.rathore@sap.com";
		
		System.out.println("Customer Email ID"+ email);

		final String createdId = authHelper.wrapWithAuthorization(yaasAware, SCOPE_DOCUMENT_MANAGE,
				token -> {
					return documentClient.createPickupStore(yaasAware, pickupstore, token);
				});
		
		final boolean created = authHelper.wrapWithAuthorization(yaasAware, SCOPE_EMAIL_MANAGE,
				token -> emailClientService.createTemplate(yaasAware, token));

		if (created) {
			authHelper.wrapWithAuthorization(yaasAware, SCOPE_EMAIL_MANAGE,
					token -> {
						emailClientService.uploadTemplateSubject(yaasAware, token);
						return null;
					});

			authHelper.wrapWithAuthorization(yaasAware, SCOPE_EMAIL_MANAGE,
					token -> {
						emailClientService.uploadTemplateBody(yaasAware, token);
						return null;
					});
		}

		authHelper.wrapWithAuthorization(yaasAware, SCOPE_EMAIL_SEND,
				token -> {
					emailClientService.sendMail(yaasAware, pickupstore, email, token);
					return null;
				});

		return createdId;
	}
	
	public void updatePickupStore(final YaasAwareParameters yaasAware,
			final String pickupStoreId, final Pickupstore pickupstore) {

		authHelper.wrapWithAuthorization(yaasAware, SCOPE_DOCUMENT_MANAGE,
				token -> {
					documentClient.updatePickupStore(yaasAware, pickupStoreId, pickupstore, token);
					return null;
				});
	}

	
}

