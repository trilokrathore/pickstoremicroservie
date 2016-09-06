
package com.yaas.pickupstore.client.customer.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.sap.cloud.yaas.rammler.commons.RequestParams;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractActionBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.AbstractResourceBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.ActionWithPayloadBuilder;
import com.sap.cloud.yaas.rammler.commons.builder.HttpActionSettable;


/**
 * A {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the <code>/accounts</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #internal()}</li>
 * </ul>
 * 
 */
public class TenantCustomersCustomerNumberAccountsBuilder
    extends AbstractResourceBuilder<TenantCustomersCustomerNumberAccountsBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    public final static String RELATIVE_URI = "/accounts";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    public final static String[] URI_PARAMS_ALL = new String[] { };

    /**
     * Creates a new instance of the {@link TenantCustomersCustomerNumberAccountsBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantCustomersCustomerNumberAccountsBuilder} use a
     * builder method of the appropriate {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantCustomersCustomerNumberAccountsBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantCustomersCustomerNumberAccountsBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantCustomersCustomerNumberAccountsBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>customerNumber</code> URI parameter of this resource.
     * 
     * @param customerNumber the new value for the <code>customerNumber</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantCustomersCustomerNumberAccountsBuilder fillCustomerNumber(final String customerNumber) {
        return this.withUriParam(TenantCustomersCustomerNumberBuilder.URI_PARAM_CUSTOMER_NUMBER, customerNumber);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantCustomersCustomerNumberAccountsBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.sap.cloud.yaas.rammler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/internal</code>.
     * 
     * @return an instance of {@link TenantCustomersCustomerNumberAccountsInternalBuilder}
     * 
     */
    public TenantCustomersCustomerNumberAccountsInternalBuilder internal() {
        return new TenantCustomersCustomerNumberAccountsInternalBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder prepareAny() {
        return new TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantCustomersCustomerNumberAccountsBuilder.ArbitraryActionBuilder<TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder>
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
        protected TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder actionBuilder = new TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder fillMethod(com.sap.cloud.yaas.rammler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantCustomersCustomerNumberAccountsBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
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
    public static abstract class ArbitraryActionBuilder<T extends TenantCustomersCustomerNumberAccountsBuilder.ArbitraryActionBuilder<?> >
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

}
