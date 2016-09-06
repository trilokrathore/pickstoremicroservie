package com.yaas.pickupstore.email;

import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import com.yaas.pickupstore.api.generated.Pickupstore;
import com.yaas.pickupstore.api.generated.YaasAwareParameters;

public interface EmailClientService {

	public boolean createTemplate(final YaasAwareParameters yaasAware, final AccessToken token);
	
	public void uploadTemplateSubject(final YaasAwareParameters yaasAware, final AccessToken token) ;

	public void uploadTemplateBody(final YaasAwareParameters yaasAware, final AccessToken token);
	
	public void sendMail(final YaasAwareParameters yaasAware, final Pickupstore pickupstore, final String mail,
			final AccessToken token);
}
