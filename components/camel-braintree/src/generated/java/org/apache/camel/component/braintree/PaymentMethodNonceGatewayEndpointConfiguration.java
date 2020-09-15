
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.PaymentMethodNonceGateway}.
 */
@ApiParams(apiName = "paymentMethodNonce", description = "",
           apiMethods = {@ApiMethod(methodName = "create"), @ApiMethod(methodName = "find")})
@UriParams
@Configurer
public final class PaymentMethodNonceGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "find")})
    private String paymentMethodNonce;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "create")})
    private String paymentMethodToken;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "create")})
    private com.braintreegateway.PaymentMethodNonceRequest request;

    public String getPaymentMethodNonce() {
        return paymentMethodNonce;
    }

    public void setPaymentMethodNonce(String paymentMethodNonce) {
        this.paymentMethodNonce = paymentMethodNonce;
    }

    public String getPaymentMethodToken() {
        return paymentMethodToken;
    }

    public void setPaymentMethodToken(String paymentMethodToken) {
        this.paymentMethodToken = paymentMethodToken;
    }

    public com.braintreegateway.PaymentMethodNonceRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.PaymentMethodNonceRequest request) {
        this.request = request;
    }
}
