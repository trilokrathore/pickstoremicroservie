package com.yaas.pickupstore.customer;

import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import com.yaas.pickupstore.api.generated.YaasAwareParameters;

public interface CustomerClientService {
	public String getCustomer(final YaasAwareParameters yaasAware, final String customer, final AccessToken token);
}
