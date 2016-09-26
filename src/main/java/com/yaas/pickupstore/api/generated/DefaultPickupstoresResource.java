
package com.yaas.pickupstore.api.generated;

import java.net.URI;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.glassfish.jersey.server.ContainerRequest;
import org.springframework.stereotype.Component;

import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginatedCollection;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginationRequest;
import com.sap.cloud.yaas.servicesdk.jerseysupport.pagination.PaginationSupport;
import com.yaas.pickupstore.service.PickupStoreServive;

/**
* Resource class containing the custom logic. Please put your logic here!
*/
@Component("apiPickupstoresResource")
@Singleton
public class DefaultPickupstoresResource implements com.yaas.pickupstore.api.generated.PickupstoresResource
{
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	@Context
	private ContainerRequest request;
	
	@Inject
	private PickupStoreServive  pickupStoreServive ;

	/* GET / */
	@Override
	public Response get(final CountableParameters countable,final PagedParameters paged, final YaasAwareParameters yaasAware)
	{
		
		final PaginatedCollection<Pickupstore> result = pickupStoreServive
				.getPickupStores(new PaginationRequest(paged.getPageNumber(), paged.getPageSize(), true), yaasAware);

		final ResponseBuilder responseBuilder = Response.ok(result);
		PaginationSupport.decorateResponseWithCount(responseBuilder, result);
		PaginationSupport.decorateResponseWithPage(uriInfo, responseBuilder, result);
		return responseBuilder.build();
		
//		// place some logic here
//		return Response.ok()
//			.entity(new java.util.ArrayList<Pickupstore>()).build();
	}

	/* POST / */
	@Override
	public Response post(final YaasAwareParameters yaasAware, final Pickupstore pickupstore)
	{
		final String id = pickupStoreServive.createPickupStore(yaasAware, pickupstore);

		final URI createdLocation = uriInfo.getRequestUriBuilder().path(id).build();
		return Response.created(createdLocation).build();
		
//		return Response.created(uriInfo.getAbsolutePath())
//			.build();
	}


	/* GET /{storeId} */
	@Override
	public Response getByStoreId(final YaasAwareParameters yaasAware, final java.lang.String storeId)
	{
		// place some logic here
		return Response.ok()
			.entity(new Pickupstore()).build();
	}

	/* PUT /{storeId} */
	@Override
	public Response putByStoreId(final YaasAwareParameters yaasAware, final java.lang.String storeId, final Pickupstore pickupstore)
	{
		pickupStoreServive.updatePickupStore(yaasAware, storeId, pickupstore);
		// place some logic here
		return Response.ok()
			.build();
	}

	@Override
	public Response deleteByStoreId(YaasAwareParameters yaasAware, String storeId) {
		
		pickupStoreServive.deletePickupStore(yaasAware, storeId);
		return Response.noContent().build();
	}

	@Override
	public Response getPincodeByPincode(YaasAwareParameters yaasAware, String pincode) {
		return Response.ok()
				.build();
	}

	 

}
