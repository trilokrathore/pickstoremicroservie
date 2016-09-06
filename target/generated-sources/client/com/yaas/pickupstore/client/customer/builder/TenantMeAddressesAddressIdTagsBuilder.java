
package com.yaas.pickupstore.client.customer.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.ResponseCallback;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractActionBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.ActionWithPayloadBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.HttpActionSettable;


/**
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/tags</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * </ul>
 * 
 */
public class TenantMeAddressesAddressIdTagsBuilder
    extends AbstractResourceBuilder<TenantMeAddressesAddressIdTagsBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/tags";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] { };

    /**
     * Creates a new instance of the {@link TenantMeAddressesAddressIdTagsBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantMeAddressesAddressIdTagsBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantMeAddressesAddressIdTagsBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantMeAddressesAddressIdTagsBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantMeAddressesAddressIdTagsBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>addressId</code> URI parameter of this resource.
     * 
     * @param addressId the new value for the <code>addressId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantMeAddressesAddressIdTagsBuilder fillAddressId(final String addressId) {
        return this.withUriParam(TenantMeAddressesAddressIdBuilder.URI_PARAM_ADDRESS_ID, addressId);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantMeAddressesAddressIdTagsBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder preparePost() {
        return new TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantMeAddressesAddressIdTagsBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantMeAddressesAddressIdTagsBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder prepareAny() {
        return new TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantMeAddressesAddressIdTagsBuilder.ArbitraryActionBuilder<TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder>
    {


        /**
         * Creates a new instance of a {@link AnyActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public AnyActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        @Override
        protected TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder actionBuilder = new TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantMeAddressesAddressIdTagsBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
            actionBuilder.setHttpMethod(theMethod);
            return actionBuilder;
        }

    }


    /**
     * Base abstract class for all {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder}s for this resource.
     * 
     * @param <T> the type of the builder which will be produced by the builder methods
     * 
     */
    public static abstract class ArbitraryActionBuilder<T extends TenantMeAddressesAddressIdTagsBuilder.ArbitraryActionBuilder<?> >
        extends AbstractActionBuilder<T>
    {


        /**
         * Creates a new instance of the {@link ArbitraryActionBuilder}, for given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget instance
         * @param requestParams the given RequestParams instance
         * 
         */
        public ArbitraryActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        /**
         * Fill the <code>addressId</code> URI parameter of this resource.
         * 
         * @param addressId the new value for the <code>addressId</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillAddressId(final String addressId) {
            return this.withUriParam(TenantMeAddressesAddressIdBuilder.URI_PARAM_ADDRESS_ID, addressId);
        }

        /**
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
        }

    }


    /**
     * An implementation of the {@link DeleteActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action.	 
     * 
     */
    public static class DeleteActionBuilder
        extends TenantMeAddressesAddressIdTagsBuilder.ArbitraryActionBuilder<TenantMeAddressesAddressIdTagsBuilder.DeleteActionBuilder>
    {


        /**
         * Creates a new instance of a {@link DeleteActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public DeleteActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.DELETE);
        }

        @Override
        protected TenantMeAddressesAddressIdTagsBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantMeAddressesAddressIdTagsBuilder.DeleteActionBuilder actionBuilder = new TenantMeAddressesAddressIdTagsBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>tags</code> query parameter value.
         * 
         * @param tags the value of the <code>tags</code> query parameter
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>tags</code> query parameter set
         * 
         */
        public TenantMeAddressesAddressIdTagsBuilder.DeleteActionBuilder withTags(String tags) {
            return this.withSingleQuery("tags", tags);
        }

        /**
         * Registers callback to handle the 503 Service Unavailable response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantMeAddressesAddressIdTagsBuilder.DeleteActionBuilder onServiceUnavailable(ResponseCallback callback) {
            return this.withCallbackForCode(503, callback);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantMeAddressesAddressIdTagsBuilder.ArbitraryActionBuilder<TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder, Object>
    {


        /**
         * Creates a new instance of a {@link PostActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public PostActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.POST);
        }

        @Override
        protected TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder actionBuilder = new TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>tags</code> query parameter value.
         * 
         * @param tags the value of the <code>tags</code> query parameter
         * @return a new instance of {@link PostActionBuilder}, with the <code>tags</code> query parameter set
         * 
         */
        public TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder withTags(String tags) {
            return this.withSingleQuery("tags", tags);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder onUnauthorized(ResponseCallback callback) {
            return this.withCallbackForCode(401, callback);
        }

        /**
         * Registers callback to handle the 403 Forbidden response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

        /**
         * Registers callback to handle the 503 Service Unavailable response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantMeAddressesAddressIdTagsBuilder.PostActionBuilder onServiceUnavailable(ResponseCallback callback) {
            return this.withCallbackForCode(503, callback);
        }

    }

}
