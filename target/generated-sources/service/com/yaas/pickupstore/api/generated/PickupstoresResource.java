package com.yaas.pickupstore.api.generated;

import javax.ws.rs.core.Response;

@javax.ws.rs.Path("/pickupstores")
public interface PickupstoresResource
{
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response get(@javax.ws.rs.BeanParam @javax.validation.Valid final CountableParameters countable, @javax.ws.rs.BeanParam @javax.validation.Valid final PagedParameters paged, @javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware);

	@javax.ws.rs.POST
	@javax.ws.rs.Consumes({"application/json"})
	Response post(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.validation.Valid final Pickupstore pickupstore);

	@javax.ws.rs.Path("/pincodes/{pincodeId}")
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response getPincodesByPincodeId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("pincodeId") final java.lang.String pincodeId);

	@javax.ws.rs.Path("/{latitude}/{longitude}")
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response getByLatitudeByLongitude(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("latitude") final java.lang.String latitude, @javax.ws.rs.PathParam("longitude") final java.lang.String longitude);

	@javax.ws.rs.Path("/{storeId}")
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response getByStoreId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("storeId") final java.lang.String storeId);

	@javax.ws.rs.Path("/{storeId}")
	@javax.ws.rs.PUT
	@javax.ws.rs.Consumes({"application/json"})
	Response putByStoreId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("storeId") final java.lang.String storeId, @javax.validation.Valid final Pickupstore pickupstore);

	@javax.ws.rs.Path("/{storeId}")
	@javax.ws.rs.DELETE
	Response deleteByStoreId(@javax.ws.rs.PathParam("storeId") final java.lang.String storeId);

}
