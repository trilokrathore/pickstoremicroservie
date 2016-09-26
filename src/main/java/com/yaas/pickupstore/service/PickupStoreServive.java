package com.yaas.pickupstore.service;



import java.util.List;
import java.util.Optional;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginatedCollection;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginationRequest;
import com.yaas.pickupstore.api.generated.Pickupstore;
import com.yaas.pickupstore.api.generated.YaasAwareParameters;
import com.yaas.pickupstore.customer.CustomerClientService;
import com.yaas.pickupstore.document.DocumentClientService;
import com.yaas.pickupstore.document.DocumentPickupstorelist;
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
		
		
		String email="trilok.rathore@sap.com";
		if(StringUtils.isNotBlank(pickupstore.getEmailId())){
			email=pickupstore.getEmailId();
		}
		
		final String finalEmailId=email;
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
					emailClientService.sendMail(yaasAware, pickupstore, finalEmailId, token);
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
	
	public Pickupstore readPickupStore(final YaasAwareParameters yaasAware, final String pickupstore) {
		Optional<DocumentPickupstorelist> docPickStore=authHelper.wrapWithAuthorization(yaasAware, SCOPE_DOCUMENT_VIEW,
				token -> {
					documentClient.readPickupStore(yaasAware, pickupstore, token);
					return null;
				});
		
		if(docPickStore.isPresent()){
			return docPickStore.get().getPickupstore();
		}else{
			return null;
		}
		
	}
	
	public void deletePickupStore(final YaasAwareParameters yaasAware, final String pickupstore) {

		Optional<DocumentPickupstorelist> docPickStore=authHelper.wrapWithAuthorization(yaasAware, SCOPE_DOCUMENT_VIEW,
				token -> {
					return documentClient.readPickupStore(yaasAware, pickupstore, token);
				});
		
		if(docPickStore.isPresent() && null!=docPickStore.get().getPickupstore()){
			Pickupstore store=docPickStore.get().getPickupstore();
			store.setActive(Boolean.FALSE);
			updatePickupStore(yaasAware, pickupstore, store);
		}
	}
	
	public List<Pickupstore> getPickupStorebyPincode(final YaasAwareParameters yaasAware, final String pincode) {
		return authHelper.wrapWithAuthorization(yaasAware, SCOPE_DOCUMENT_VIEW,
				token -> documentClient.getPickupStoreByPincode(yaasAware,pincode ,token));
	}

	
}

