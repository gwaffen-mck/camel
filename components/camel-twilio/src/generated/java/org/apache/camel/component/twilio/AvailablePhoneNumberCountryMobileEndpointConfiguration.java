
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.availablephonenumbercountry.Mobile}.
 */
@ApiParams(apiName = "available-phone-number-country-mobile", description = "",
           apiMethods = {@ApiMethod(methodName = "reader", description="Create a MobileReader to execute read"), })
@UriParams
@Configurer
public final class AvailablePhoneNumberCountryMobileEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "reader", description="The SID of the Account requesting the AvailablePhoneNumber resources")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "reader", description="The ISO Country code of the country from which to read phone numbers"), @ApiMethod(methodName = "reader", description="The ISO Country code of the country from which to read phone numbers")})
    private String pathCountryCode;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCountryCode() {
        return pathCountryCode;
    }

    public void setPathCountryCode(String pathCountryCode) {
        this.pathCountryCode = pathCountryCode;
    }
}
