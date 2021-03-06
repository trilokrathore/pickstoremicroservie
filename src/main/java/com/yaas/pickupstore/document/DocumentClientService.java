package com.yaas.pickupstore.document;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Value;

import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginatedCollection;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginationRequest;
import com.sap.cloud.yaas.servicesdk.patternsupport.schemas.ResourceLocation;
import com.yaas.pickupstore.api.generated.Pickupstore;
import com.yaas.pickupstore.api.generated.YaasAwareParameters;
import com.yaas.pickupstore.client.document.DocumentClient;
import com.yaas.pickupstore.utility.ErrorHandler;

@ManagedBean
public class DocumentClientService {
	private static final String PICKUPSTORE_PATH = "pickupstore";

	@Value("${YAAS_CLIENT}")
	private String client;

	@Inject
	private DocumentClient documentClient;

	public PaginatedCollection<Pickupstore> getPickupstores(final PaginationRequest paginationRequest,
			final YaasAwareParameters yaasAware, final AccessToken token) {

		final Response response = documentClient.tenant(yaasAware.getHybrisTenant())
				.client(client)
				.dataType(PICKUPSTORE_PATH)
				.prepareGet()
				.withPageNumber(paginationRequest.getPageNumber())
				.withPageSize(paginationRequest.getPageSize())
				.withTotalCount(paginationRequest.isCountingTotal())
				.withSort("id").withSort("pickupstore.name")
				.withAuthorization(token.toAuthorizationHeaderValue())
				.execute();

		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			final List<Pickupstore> pickupstorelist = Arrays.stream(response.readEntity(DocumentPickupstorelist[].class))
					.filter(document -> null!=document.getPickupstore())
					.filter(document -> null!=document.getPickupstore().isActive())
					.map(document -> transformPickupStoreList(document))
					.collect(Collectors.toList());
			
			//pickupstorelist.removeAll(null);

			return PaginatedCollection.<Pickupstore> of(pickupstorelist)
					.with(response, paginationRequest)
					.build();
		} else if (response.getStatus() == Status.NOT_FOUND.getStatusCode()) {
			return PaginatedCollection.of(Collections.<Pickupstore> emptyList()).build();
		}
		throw ErrorHandler.resolveErrorResponse(response, token);
	}

	private Pickupstore transformPickupStoreList(final DocumentPickupstorelist documentpickupstore) {

		Pickupstore pickupstore=documentpickupstore.getPickupstore();
		
		if(null!=pickupstore){
			pickupstore.setCreatedAt(documentpickupstore.getMetadata().getCreatedAt());
		}
		return documentpickupstore.getPickupstore();
	}

	public String createPickupStore(final YaasAwareParameters yaasAware, final Pickupstore pickupstore, final AccessToken token) {
		//TODO
		pickupstore.setActive(Boolean.TRUE);
		final DocumentPickupstorelist documentWishlist = new DocumentPickupstorelist();
		documentWishlist.setPickupstore(pickupstore);

		final Response response = documentClient
				.tenant(yaasAware.getHybrisTenant())
				.client(client)
				.dataType(PICKUPSTORE_PATH)
				.dataId(pickupstore.getId())
				.preparePost()
				.withAuthorization(token.toAuthorizationHeaderValue())
				.withPayload(Entity.json(documentWishlist))
				.execute();

		if (response.getStatus() == Status.CREATED.getStatusCode()) {
			System.out.println(response);
			return response.readEntity(ResourceLocation.class).getId();
		} else if (response.getStatus() == Status.CONFLICT.getStatusCode()) {
			throw new WebApplicationException("Duplicate ID. Please provide another ID for the wishlist.", response);
		}
		throw ErrorHandler.resolveErrorResponse(response, token);
	}
	
	public void updatePickupStore(final YaasAwareParameters yaasAware, final String pickupStoreID, final Pickupstore pickupstore,
			final AccessToken token) {

		final DocumentPickupstorelist documentWishlist = new DocumentPickupstorelist();
		documentWishlist.setPickupstore(pickupstore);

		final Response response = documentClient
				.tenant(yaasAware.getHybrisTenant())
				.client(client)
				.dataType(PICKUPSTORE_PATH)
				.dataId(pickupStoreID)
				.preparePut()
				.withAuthorization(token.toAuthorizationHeaderValue())
				.withPayload(Entity.json(documentWishlist))
				.execute();

		if (response.getStatus() == Status.OK.getStatusCode()) {
			return;
		} else if (response.getStatus() == Status.NOT_FOUND.getStatusCode()) {
			throw new NotFoundException("Cannot find pickupStoreID with ID " + pickupStoreID, response);
		}
		throw ErrorHandler.resolveErrorResponse(response, token);
	}
	
	public Optional<DocumentPickupstorelist> readPickupStore(final YaasAwareParameters yaasAware, final String pickupstore, final AccessToken token) {
   

		final Response response = documentClient.tenant(yaasAware.getHybrisTenant())
				.client(client)
				.dataType(PICKUPSTORE_PATH)
				.dataId(pickupstore)
				.prepareGet()
				.withAuthorization(token.toAuthorizationHeaderValue())
				.execute();
		DocumentPickupstorelist docPickStore=null;
		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			docPickStore=response.readEntity(DocumentPickupstorelist.class);
		}
		
		Optional<DocumentPickupstorelist> docsList=Optional.of(docPickStore);
		
		return docsList;
		
		//		final Response response = documentClient
//				.tenant(yaasAware.getHybrisTenant())
//				.client(client)
//				.dataType(PICKUPSTORE_PATH)
//				.dataId(pickupstore)
//				.prepareDelete()
//				.withAuthorization(token.toAuthorizationHeaderValue())
//				.execute();
//
//		if (response.getStatus() == Status.NO_CONTENT.getStatusCode()) {
//			return;
//		} else if (response.getStatus() == Status.NOT_FOUND.getStatusCode()) {
//			throw new NotFoundException("Cannot find wishlist with ID " + pickupstore, response);
//		}
//		throw ErrorHandler.resolveErrorResponse(response, token);
	}
	
//	public void deletePickupStore(final YaasAwareParameters yaasAware, final String pickupstore, final AccessToken token) {
//		//TODO
//
//		final Response response = documentClient.tenant(yaasAware.getHybrisTenant()).client(client)
//				.dataType(PICKUPSTORE_PATH).dataId(pickupstore).prepareDelete()
//				.withAuthorization(token.toAuthorizationHeaderValue()).execute();
//
//		if (response.getStatus() == Status.NO_CONTENT.getStatusCode()) {
//			return;
//		} else if (response.getStatus() == Status.NOT_FOUND.getStatusCode()) {
//			throw new NotFoundException("Cannot find wishlist with ID " + pickupstore, response);
//		}
//		throw ErrorHandler.resolveErrorResponse(response, token);
//	}
	public List<Pickupstore> getPickupStoreByPincode(final YaasAwareParameters yaasAware, final String pincode, final AccessToken token) {
		   
		
		final Response response = documentClient.tenant(yaasAware.getHybrisTenant())
				.client(client)
				.dataType(PICKUPSTORE_PATH)
				.prepareGet()
				.withSort("id").withSort("pickupstore.name")
				.withQ("pickupstore.pincode:"+'"'+pincode+'"')
				//.withQuery("q","pickupstore.pincode \\:"+pincode)
				.withAuthorization(token.toAuthorizationHeaderValue())
				.execute();
		
		
		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			final List<Pickupstore> pickupstorelist = Arrays.stream(response.readEntity(DocumentPickupstorelist[].class))
					.filter(document -> null!=document.getPickupstore())
					.filter(document -> null!=document.getPickupstore().isActive())
					.map(document -> transformPickupStoreList(document))
					.collect(Collectors.toList());
			
			//pickupstorelist.removeAll(null);

			return pickupstorelist;
		} else if (response.getStatus() == Status.NOT_FOUND.getStatusCode()) {
			return Collections.<Pickupstore> emptyList();
		}
		throw ErrorHandler.resolveErrorResponse(response, token);
	}
	
}
