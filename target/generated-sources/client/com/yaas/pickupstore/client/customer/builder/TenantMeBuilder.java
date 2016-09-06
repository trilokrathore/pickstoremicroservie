
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/me</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #addresses()}</li>
 * <li>{@link #accounts()}</li>
 * </ul>
 * 
 */
public class TenantMeBuilder
    extends AbstractResourceBuilder<TenantMeBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/me";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] { };

    /**
     * Creates a new instance of the {@link TenantMeBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantMeBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantMeBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantMeBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantMeBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantMeBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/addresses</code>.
     * 
     * @return an instance of {@link TenantMeAddressesBuilder}
     * 
     */
    public TenantMeAddressesBuilder addresses() {
        return new TenantMeAddressesBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/accounts</code>.
     * 
     * @return an instance of {@link TenantMeAccountsBuilder}
     * 
     */
    public TenantMeAccountsBuilder accounts() {
        return new TenantMeAccountsBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantMeBuilder.GetActionBuilder prepareGet() {
        return new TenantMeBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for PUT action for this resource.
     * 
     * @return an instance of {@link PutActionBuilder}
     * 
     */
    public TenantMeBuilder.PutActionBuilder preparePut() {
        return new TenantMeBuilder.PutActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantMeBuilder.AnyActionBuilder prepareAny() {
        return new TenantMeBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantMeBuilder.ArbitraryActionBuilder<TenantMeBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantMeBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantMeBuilder.AnyActionBuilder>
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
        protected TenantMeBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantMeBuilder.AnyActionBuilder actionBuilder = new TenantMeBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantMeBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantMeBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantMeBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantMeBuilder.ArbitraryActionBuilder<?> >
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
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantMeBuilder.ArbitraryActionBuilder<TenantMeBuilder.GetActionBuilder>
    {


        /**
         * Creates a new instance of a {@link GetActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public GetActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.GET);
        }

        @Override
        protected TenantMeBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantMeBuilder.GetActionBuilder actionBuilder = new TenantMeBuilder.GetActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link GetActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantMeBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>expand</code> query parameter value.
         * 
         * @param expand the value of the <code>expand</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>expand</code> query parameter set
         * 
         */
        public TenantMeBuilder.GetActionBuilder withExpand(String expand) {
            return this.withSingleQuery("expand", expand);
        }

        /**
         * Registers callback to handle the 400 Bad Request response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantMeBuilder.GetActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantMeBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantMeBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantMeBuilder.GetActionBuilder onServiceUnavailable(ResponseCallback callback) {
            return this.withCallbackForCode(503, callback);
        }

    }


    /**
     * An implementation of the {@link PutActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for PUT action.	 
     * 
     */
    public static class PutActionBuilder
        extends TenantMeBuilder.ArbitraryActionBuilder<TenantMeBuilder.PutActionBuilder>
        implements ActionWithPayloadBuilder<TenantMeBuilder.PutActionBuilder, Object>
    {


        /**
         * Creates a new instance of a {@link PutActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public PutActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
            setHttpMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod.PUT);
        }

        @Override
        protected TenantMeBuilder.PutActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantMeBuilder.PutActionBuilder actionBuilder = new TenantMeBuilder.PutActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantMeBuilder.PutActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeBuilder.PutActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeBuilder.PutActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantMeBuilder.PutActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantMeBuilder.PutActionBuilder onNotFound(ResponseCallback callback) {
            return this.withCallbackForCode(404, callback);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantMeBuilder.PutActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantMeBuilder.PutActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantMeBuilder.PutActionBuilder onServiceUnavailable(ResponseCallback callback) {
            return this.withCallbackForCode(503, callback);
        }

    }

}
