
package com.yaas.pickupstore.client.email.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.ResponseCallback;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractActionBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.ActionWithPayloadBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.HttpActionSettable;


/**
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{tenant}/domains</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #domain()}</li>
 * </ul>
 * 
 */
public class TenantDomainsBuilder
    extends AbstractResourceBuilder<TenantDomainsBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{tenant}/domains";
    /**
     * The static field for the <code>tenant</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_TENANT = "tenant";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_TENANT };

    /**
     * Creates a new instance of the {@link TenantDomainsBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantDomainsBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantDomainsBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantDomainsBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantDomainsBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantDomainsBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantDomainsBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{domain}</code>.
     * 
     * @return an instance of {@link TenantDomainsDomainBuilder}
     * 
     */
    public TenantDomainsDomainBuilder domain() {
        return new TenantDomainsDomainBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{domain}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #domain()} method instead.
     * 
     * @return an instance of {@link TenantDomainsDomainBuilder}
     * @param domain the value of the <code>domain</code> URI parameter
     * 
     */
    public TenantDomainsDomainBuilder domain(String domain) {
        TenantDomainsDomainBuilder resourceBuilder = new TenantDomainsDomainBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillDomain(domain);
        return resourceBuilder;
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantDomainsBuilder.GetActionBuilder prepareGet() {
        return new TenantDomainsBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action for this resource.
     * 
     * @return an instance of {@link PostActionBuilder}
     * 
     */
    public TenantDomainsBuilder.PostActionBuilder preparePost() {
        return new TenantDomainsBuilder.PostActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantDomainsBuilder.AnyActionBuilder prepareAny() {
        return new TenantDomainsBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantDomainsBuilder.ArbitraryActionBuilder<TenantDomainsBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantDomainsBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantDomainsBuilder.AnyActionBuilder>
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
        protected TenantDomainsBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantDomainsBuilder.AnyActionBuilder actionBuilder = new TenantDomainsBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantDomainsBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantDomainsBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantDomainsBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantDomainsBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantDomainsBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantDomainsBuilder.ArbitraryActionBuilder<?> >
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
            return this.withUriParam(TenantDomainsBuilder.URI_PARAM_TENANT, tenant);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantDomainsBuilder.ArbitraryActionBuilder<TenantDomainsBuilder.GetActionBuilder>
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
        protected TenantDomainsBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantDomainsBuilder.GetActionBuilder actionBuilder = new TenantDomainsBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantDomainsBuilder.GetActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Sets the <code>pageNumber</code> query parameter value.
         * 
         * @param pageNumber the value of the <code>pageNumber</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>pageNumber</code> query parameter set
         * 
         */
        public TenantDomainsBuilder.GetActionBuilder withPageNumber(Integer pageNumber) {
            return this.withSingleQuery("pageNumber", pageNumber);
        }

        /**
         * Sets the <code>pageSize</code> query parameter value.
         * 
         * @param pageSize the value of the <code>pageSize</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>pageSize</code> query parameter set
         * 
         */
        public TenantDomainsBuilder.GetActionBuilder withPageSize(Integer pageSize) {
            return this.withSingleQuery("pageSize", pageSize);
        }

        /**
         * Sets the <code>totalCount</code> query parameter value.
         * 
         * @param totalCount the value of the <code>totalCount</code> query parameter
         * @return a new instance of {@link GetActionBuilder}, with the <code>totalCount</code> query parameter set
         * 
         */
        public TenantDomainsBuilder.GetActionBuilder withTotalCount(Boolean totalCount) {
            return this.withSingleQuery("totalCount", totalCount);
        }

        /**
         * Registers callback to handle the 400 Bad Request response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantDomainsBuilder.GetActionBuilder onBadRequest(ResponseCallback callback) {
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
        public TenantDomainsBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantDomainsBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

        /**
         * Registers callback to handle the 500 Internal Server Error response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantDomainsBuilder.GetActionBuilder onInternalServerError(ResponseCallback callback) {
            return this.withCallbackForCode(500, callback);
        }

    }


    /**
     * An implementation of the {@link PostActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for POST action.	 
     * 
     */
    public static class PostActionBuilder
        extends TenantDomainsBuilder.ArbitraryActionBuilder<TenantDomainsBuilder.PostActionBuilder>
        implements ActionWithPayloadBuilder<TenantDomainsBuilder.PostActionBuilder, Object>
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
        protected TenantDomainsBuilder.PostActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantDomainsBuilder.PostActionBuilder actionBuilder = new TenantDomainsBuilder.PostActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantDomainsBuilder.PostActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantDomainsBuilder.PostActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantDomainsBuilder.PostActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PostActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantDomainsBuilder.PostActionBuilder withAuthorization(String authorization) {
            return this.withSingleHeader("Authorization", authorization);
        }

        /**
         * Registers callback to handle the 401 Unauthorized response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantDomainsBuilder.PostActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantDomainsBuilder.PostActionBuilder onForbidden(ResponseCallback callback) {
            return this.withCallbackForCode(403, callback);
        }

        /**
         * Registers callback to handle the 400 Bad Request response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantDomainsBuilder.PostActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantDomainsBuilder.PostActionBuilder onConflict(ResponseCallback callback) {
            return this.withCallbackForCode(409, callback);
        }

        /**
         * Registers callback to handle the 500 Internal Server Error response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantDomainsBuilder.PostActionBuilder onInternalServerError(ResponseCallback callback) {
            return this.withCallbackForCode(500, callback);
        }

    }

}
