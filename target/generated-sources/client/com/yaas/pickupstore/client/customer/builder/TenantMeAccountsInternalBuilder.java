
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/internal</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #email()}</li>
 * </ul>
 * 
 */
public class TenantMeAccountsInternalBuilder
    extends AbstractResourceBuilder<TenantMeAccountsInternalBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/internal";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] { };

    /**
     * Creates a new instance of the {@link TenantMeAccountsInternalBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantMeAccountsInternalBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantMeAccountsInternalBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantMeAccountsInternalBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantMeAccountsInternalBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantMeAccountsInternalBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/email</code>.
     * 
     * @return an instance of {@link TenantMeAccountsInternalEmailBuilder}
     * 
     */
    public TenantMeAccountsInternalEmailBuilder email() {
        return new TenantMeAccountsInternalEmailBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantMeAccountsInternalBuilder.PostActionBuilder preparePost() {
        return new TenantMeAccountsInternalBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantMeAccountsInternalBuilder.AnyActionBuilder prepareAny() {
        return new TenantMeAccountsInternalBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantMeAccountsInternalBuilder.ArbitraryActionBuilder<TenantMeAccountsInternalBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantMeAccountsInternalBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantMeAccountsInternalBuilder.AnyActionBuilder>
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
        protected TenantMeAccountsInternalBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantMeAccountsInternalBuilder.AnyActionBuilder actionBuilder = new TenantMeAccountsInternalBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantMeAccountsInternalBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeAccountsInternalBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeAccountsInternalBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantMeAccountsInternalBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantMeAccountsInternalBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantMeAccountsInternalBuilder.ArbitraryActionBuilder<?> >
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
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantMeAccountsInternalBuilder.ArbitraryActionBuilder<TenantMeAccountsInternalBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantMeAccountsInternalBuilder.PostActionBuilder, Object>
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
        protected TenantMeAccountsInternalBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantMeAccountsInternalBuilder.PostActionBuilder actionBuilder = new TenantMeAccountsInternalBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantMeAccountsInternalBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeAccountsInternalBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantMeAccountsInternalBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantMeAccountsInternalBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantMeAccountsInternalBuilder.PostActionBuilder onConflict(ResponseCallback callback) {
            return this.withCallbackForCode(409, callback);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantMeAccountsInternalBuilder.PostActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantMeAccountsInternalBuilder.PostActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantMeAccountsInternalBuilder.PostActionBuilder onServiceUnavailable(ResponseCallback callback) {
            return this.withCallbackForCode(503, callback);
        }

    }

}