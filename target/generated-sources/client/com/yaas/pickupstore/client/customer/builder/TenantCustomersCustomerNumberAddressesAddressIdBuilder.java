
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
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/{addressId}</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #tags()}</li>
 * </ul>
 * 
 */
public class TenantCustomersCustomerNumberAddressesAddressIdBuilder
    extends AbstractResourceBuilder<TenantCustomersCustomerNumberAddressesAddressIdBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/{addressId}";
    /**
     * The static field for the <code>addressId</code> URI parameter name.
     * 
     */
    public final static String URI_PARAM_ADDRESS_ID = "addressId";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_ADDRESS_ID };

    /**
     * Creates a new instance of the {@link TenantCustomersCustomerNumberAddressesAddressIdBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantCustomersCustomerNumberAddressesAddressIdBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantCustomersCustomerNumberAddressesAddressIdBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantCustomersCustomerNumberAddressesAddressIdBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantCustomersCustomerNumberAddressesAddressIdBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>addressId</code> URI parameter of this resource.
     * 
     * @param addressId the new value for the <code>addressId</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantCustomersCustomerNumberAddressesAddressIdBuilder fillAddressId(final String addressId) {
        return this.withUriParam(TenantCustomersCustomerNumberAddressesAddressIdBuilder.URI_PARAM_ADDRESS_ID, addressId);
    }

    /**
     * Fill the <code>customerNumber</code> URI parameter of this resource.
     * 
     * @param customerNumber the new value for the <code>customerNumber</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantCustomersCustomerNumberAddressesAddressIdBuilder fillCustomerNumber(final String customerNumber) {
        return this.withUriParam(TenantCustomersCustomerNumberBuilder.URI_PARAM_CUSTOMER_NUMBER, customerNumber);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantCustomersCustomerNumberAddressesAddressIdBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/tags</code>.
     * 
     * @return an instance of {@link TenantCustomersCustomerNumberAddressesAddressIdTagsBuilder}
     * 
     */
    public TenantCustomersCustomerNumberAddressesAddressIdTagsBuilder tags() {
        return new TenantCustomersCustomerNumberAddressesAddressIdTagsBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action for this resource.
     * 
     * @return an instance of {@link GetActionBuilder}
     * 
     */
    public TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder prepareGet() {
        return new TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for PUT action for this resource.
     * 
     * @return an instance of {@link PutActionBuilder}
     * 
     */
    public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder preparePut() {
        return new TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for DELETE action for this resource.
     * 
     * @return an instance of {@link DeleteActionBuilder}
     * 
     */
    public TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder prepareDelete() {
        return new TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder(getTarget(), getRequestParams());
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder prepareAny() {
        return new TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantCustomersCustomerNumberAddressesAddressIdBuilder.ArbitraryActionBuilder<TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder>
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
        protected TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder actionBuilder = new TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantCustomersCustomerNumberAddressesAddressIdBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantCustomersCustomerNumberAddressesAddressIdBuilder.ArbitraryActionBuilder<?> >
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
            return this.withUriParam(TenantCustomersCustomerNumberAddressesAddressIdBuilder.URI_PARAM_ADDRESS_ID, addressId);
        }

        /**
         * Fill the <code>customerNumber</code> URI parameter of this resource.
         * 
         * @param customerNumber the new value for the <code>customerNumber</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillCustomerNumber(final String customerNumber) {
            return this.withUriParam(TenantCustomersCustomerNumberBuilder.URI_PARAM_CUSTOMER_NUMBER, customerNumber);
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
        extends TenantCustomersCustomerNumberAddressesAddressIdBuilder.ArbitraryActionBuilder<TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder>
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
        protected TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder actionBuilder = new TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link DeleteActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder withAuthorization(String authorization) {
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder onServiceUnavailable(ResponseCallback callback) {
            return this.withCallbackForCode(503, callback);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder onNotFound(ResponseCallback callback) {
            return this.withCallbackForCode(404, callback);
        }

        /**
         * Registers callback to handle the 500 Internal Server Error response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.DeleteActionBuilder onInternalServerError(ResponseCallback callback) {
            return this.withCallbackForCode(500, callback);
        }

    }


    /**
     * An implementation of the {@link GetActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for GET action.	 
     * 
     */
    public static class GetActionBuilder
        extends TenantCustomersCustomerNumberAddressesAddressIdBuilder.ArbitraryActionBuilder<TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder>
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
        protected TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder actionBuilder = new TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder(getTarget(), newRequestParams);
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder withAuthorization(String authorization) {
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder onServiceUnavailable(ResponseCallback callback) {
            return this.withCallbackForCode(503, callback);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder onNotFound(ResponseCallback callback) {
            return this.withCallbackForCode(404, callback);
        }

        /**
         * Registers callback to handle the 500 Internal Server Error response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.GetActionBuilder onInternalServerError(ResponseCallback callback) {
            return this.withCallbackForCode(500, callback);
        }

    }


    /**
     * An implementation of the {@link PutActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for PUT action.	 
     * 
     */
    public static class PutActionBuilder
        extends TenantCustomersCustomerNumberAddressesAddressIdBuilder.ArbitraryActionBuilder<TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder>
        implements ActionWithPayloadBuilder<TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder, Object>
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
        protected TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder actionBuilder = new TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        /**
         * Sets the <code>Authorization</code> header value.
         * 
         * @param authorization the value of the <code>Authorization</code> header
         * @return a new instance of {@link PutActionBuilder}, with the <code>Authorization</code> header set
         * 
         */
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder withAuthorization(String authorization) {
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder onUnauthorized(ResponseCallback callback) {
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder onForbidden(ResponseCallback callback) {
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder onServiceUnavailable(ResponseCallback callback) {
            return this.withCallbackForCode(503, callback);
        }

        /**
         * Registers callback to handle the 400 Bad Request response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder onBadRequest(ResponseCallback callback) {
            return this.withCallbackForCode(400, callback);
        }

        /**
         * Registers callback to handle the 404 Not Found response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder onNotFound(ResponseCallback callback) {
            return this.withCallbackForCode(404, callback);
        }

        /**
         * Registers callback to handle the 409 Conflict response. If an exception is thrown inside this method it will not be processed 
         * by other callback processors but propagated outside.
         * 
         * @param callback callback to register
         * @return the new instance of the action builder
         * 
         */
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder onConflict(ResponseCallback callback) {
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
        public TenantCustomersCustomerNumberAddressesAddressIdBuilder.PutActionBuilder onInternalServerError(ResponseCallback callback) {
            return this.withCallbackForCode(500, callback);
        }

    }

}
