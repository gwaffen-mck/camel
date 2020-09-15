
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.call.FeedbackSummary}.
 */
@ApiParams(apiName = "call-feedback-summary", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a FeedbackSummaryCreator to execute create"), @ApiMethod(methodName = "deleter", description="Create a FeedbackSummaryDeleter to execute delete"), @ApiMethod(methodName = "fetcher", description="Create a FeedbackSummaryFetcher to execute fetch"), })
@UriParams
@Configurer
public final class CallFeedbackSummaryEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="Only include feedback given on or before this date")})
    private org.joda.time.LocalDate endDate;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The unique sid that identifies this account"), @ApiMethod(methodName = "deleter", description="The unique sid that identifies this account"), @ApiMethod(methodName = "fetcher", description="The unique sid that identifies this account")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "deleter", description="A string that uniquely identifies this feedback summary resource"), @ApiMethod(methodName = "fetcher", description="A string that uniquely identifies this feedback summary resource")})
    private String pathSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="Only include feedback given on or after this date")})
    private org.joda.time.LocalDate startDate;

    public org.joda.time.LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(org.joda.time.LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public org.joda.time.LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(org.joda.time.LocalDate startDate) {
        this.startDate = startDate;
    }
}
