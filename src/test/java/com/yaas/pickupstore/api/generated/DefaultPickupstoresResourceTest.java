package com.yaas.pickupstore.api.generated;

import java.util.Date;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sap.cloud.yaas.servicesdk.patternsupport.traits.YaasAwareTrait;


public final class DefaultPickupstoresResourceTest extends AbstractResourceTest
{
	private static final String TENANT = "onlinestore";

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
		this.yaasAware.setHybrisTenant(TENANT);

	}

	/* get() /pickupstores */
	@Test
	public void testGet()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");

		final Response response = target.request().header(YaasAwareTrait.Headers.TENANT,TENANT).get();

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
		
		entityBody.setActive(Boolean.TRUE);
		entityBody.setId("BL1"+new Date().getTime());
		entityBody.setName("Shoe STORE");
		entityBody.setLatitude("12.9716");
		entityBody.setLongitude("77.5946");
		entityBody.setOpeningschedule("10 AM");
		entityBody.setClosingschedule("9 PM");
		entityBody.setPincode("560066");
		final Response response = target.request().header(YaasAwareTrait.Headers.TENANT,TENANT).post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}


	/* put(entity) /pickupstores/storeId */
	@Test
	public void testPutByStoreIdWithPickupstore()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/").path("Test1473015431553");
		final Pickupstore entityBody =
		new Pickupstore();
		final javax.ws.rs.client.Entity<Pickupstore> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");
		
		entityBody.setId("Test"+new Date().getTime());
		entityBody.setTitle("UpdatedTitle"+new Date().getTime());


		final Response response = target.request().header(YaasAwareTrait.Headers.TENANT,TENANT).put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /pickupstores/storeId */
	@Test
	public void testDeleteByStoreId()
	{  
		//Test1473265592112
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/").path("id12");

		final Response response = target.request().header(YaasAwareTrait.Headers.TENANT,TENANT).delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultPickupstoresResource.class);
		return application;
	}
}
