package com.yaas.pickupstore.api.generated;

import java.util.Date;
import java.util.UUID;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sap.cloud.yaas.servicesdk.patternsupport.traits.YaasAwareTrait;
import com.yaas.pickupstore.api.generated.YaasAwareParameters;


public final class DefaultPickupstoresResourceTest extends com.yaas.pickupstore.api.generated.AbstractResourceTest
{
	/**
	 * Server side root resource /pickupstores,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/pickupstores";
	
	private YaasAwareParameters yaasAware;
	
	@Before
	public void before() {
		this.yaasAware = new YaasAwareParameters();
		//this.yaasAware.setHybrisClient("");
		this.yaasAware.setHybrisTenant("onlinestore");

	}

	/* get() /pickupstores */
	@Test
	public void testGet()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");

		final Response response = target.request().header(YaasAwareTrait.Headers.TENANT,"onlinestore").get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* post(entity) /pickupstores */
	@Test
	public void testPostWithPickupstore()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");
		final Pickupstore entityBody =
		new Pickupstore();
		final javax.ws.rs.client.Entity<Pickupstore> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");
		
		entityBody.setId("Test"+new Date().getTime());
		entityBody.setTitle("TestTitle"+new Date().getTime());

		final Response response = target.request().header(YaasAwareTrait.Headers.TENANT,"onlinestore").post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* get() /pickupstores/pincodes/pincodeId */
//	@Test
//	public void testGetPincodesByPincodeId()
//	{
//		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/pincodes/pincodeId");
//
//		final Response response = target.request().get();
//
//		Assert.assertNotNull("Response must not be null", response);
//		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
//	}

	/* get() /pickupstores/latitude/longitude */
//	@Test
//	public void testGetByLatitudeByLongitude()
//	{
//		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/latitude/longitude");
//
//		final Response response = target.request().get();
//
//		Assert.assertNotNull("Response must not be null", response);
//		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
//	}

	/* get() /pickupstores/storeId */
//	@Test
//	public void testGetByStoreId()
//	{
//		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/storeId");
//
//		final Response response = target.request().get();
//
//		Assert.assertNotNull("Response must not be null", response);
//		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
//	}

	/* put(entity) /pickupstores/storeId */
//	@Test
//	public void testPutByStoreIdWithPickupstore()
//	{
//		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/storeId");
//		final Pickupstore entityBody =
//		new Pickupstore();
//		final javax.ws.rs.client.Entity<Pickupstore> entity =
//		javax.ws.rs.client.Entity.entity(entityBody,"application/json");
//
//		final Response response = target.request().put(entity);
//
//		Assert.assertNotNull("Response must not be null", response);
//		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
//	}

	/* delete() /pickupstores/storeId */
//	@Test
//	public void testDeleteByStoreId()
//	{
//		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/storeId");
//
//		final Response response = target.request().delete();
//
//		Assert.assertNotNull("Response must not be null", response);
//		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
//	}

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultPickupstoresResource.class);
		return application;
	}
}
