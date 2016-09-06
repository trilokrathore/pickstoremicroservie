package com.yaas.pickupstore.email;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import com.yaas.pickupstore.client.email.EmailServiceClient;
import com.yaas.pickupstore.utility.ErrorHandler;
import com.yaas.pickupstore.api.generated.Pickupstore;
import com.yaas.pickupstore.api.generated.YaasAwareParameters;

@Service("emailClientService")
public class EmailClientServiceImpl implements EmailClientService{
	
	

	private static final String DESCRIPTION = "description";

	private static final String TITLE = "title";

	@Value("${YAAS_CLIENT}")
	private String client;
	
	@Inject
	private EmailServiceClient emailClient;
	
	@Value("${TEMPLATE_CODE}")
	private  String tempateCode;
	private final String locale = Locale.ENGLISH.getLanguage();

	@Override
	public boolean createTemplate(YaasAwareParameters yaasAware, AccessToken token) {
        
		 //Create data for email tempate and this is just pojo object
		final EmailTemplateDefinition emailTemplateDefinition = new EmailTemplateDefinition();
		emailTemplateDefinition.setCode(tempateCode);
		emailTemplateDefinition.setOwner(client);
		emailTemplateDefinition.setName("Wishlist Created Mail");
		emailTemplateDefinition.setDescription("Template for Wishlist Created Mail");

		final List<TemplateAttributeDefinition> templateAttributeDefinition = new ArrayList<TemplateAttributeDefinition>();
		templateAttributeDefinition.add(new TemplateAttributeDefinition(TITLE, false));
		templateAttributeDefinition.add(new TemplateAttributeDefinition(DESCRIPTION, false));
		emailTemplateDefinition.setTemplateAttributeDefinitions(templateAttributeDefinition);
		
		
		final Response response = emailClient
				.tenantTemplates(yaasAware.getHybrisTenant())
				.preparePost()
				.withAuthorization(token.toAuthorizationHeaderValue())
				.withPayload(Entity.json(emailTemplateDefinition))
				.execute();

		if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
			return true;
		} else if (response.getStatus() == Response.Status.CONFLICT.getStatusCode()) {
			return false;
		}
		throw ErrorHandler.resolveErrorResponse(response, token);
	}

	@Override
	public void uploadTemplateSubject(YaasAwareParameters yaasAware, AccessToken token) {
		uploadTemplateMedia(yaasAware, "subject", token);
		
	}

	@Override
	public void uploadTemplateBody(YaasAwareParameters yaasAware, AccessToken token) {
		uploadTemplateMedia(yaasAware, "body", token);
		
	}
	
	private void uploadTemplateMedia(final YaasAwareParameters yaasAware, final String type, final AccessToken token) {
		final EmailTemplate template = EmailTemplate.builder()
				.setFilePath("templates" + File.separator + type + ".vm")
				.setCode(tempateCode)
				.setOwner(yaasAware.getHybrisTenant())
				.setFileType(type)
				.setLocale(locale)
				.build();

		final Response response = emailClient
				.tenantTemplatesClient(yaasAware.getHybrisTenant(), client)
				.code(template.getCode())
				.fileType(template.getFileType())
				.preparePut()
				.withAuthorization(token.toAuthorizationHeaderValue())
				.withPayload(Entity.entity(template.getDataStream(), MediaType.APPLICATION_OCTET_STREAM_TYPE))
				.execute();

		if (response.getStatus() == Response.Status.CREATED.getStatusCode() || response.getStatus() == Response.Status.OK.getStatusCode()) {
			return;
		}
		throw ErrorHandler.resolveErrorResponse(response, token);
	}

	@Override
	public void sendMail(YaasAwareParameters yaasAware, Pickupstore pickupstore, String mail, AccessToken token) {
		final Email eMail = new Email();
		eMail.setToAddress(mail);
		eMail.setFromAddress("noreply@" + yaasAware.getHybrisTenant() + ".mail.yaas.io");
		eMail.setTemplateOwner(client);
		eMail.setTemplateCode(tempateCode);
		eMail.setLocale(locale);

		final List<TemplateAttributeValue> templateAttributeValue = new ArrayList<TemplateAttributeValue>();
		if (pickupstore.getTitle() != null) {
			templateAttributeValue.add(new TemplateAttributeValue(TITLE, pickupstore.getTitle()));
		}else{
			
		}
		if (pickupstore.getDescription() != null) {
			templateAttributeValue.add(new TemplateAttributeValue(DESCRIPTION, pickupstore.getDescription()));
		}
		eMail.setAttributes(templateAttributeValue);

		final Response response = emailClient
				.tenantSendAsync(yaasAware.getHybrisTenant())
				.preparePost()
				.withAuthorization(token.toAuthorizationHeaderValue())
				.withPayload(Entity.json(eMail)).execute();

		if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
			return;
		}
		throw ErrorHandler.resolveErrorResponse(response, token);
		
	}

}
