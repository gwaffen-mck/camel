
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.sip.domain.CredentialListMapping}.
 */
@ApiParams(apiName = "sip-domain-credential-list-mapping", description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a CredentialListMappingCreator to execute create"), @ApiMethod(methodName = "deleter", description="Create a CredentialListMappingDeleter to execute delete"), @ApiMethod(methodName = "fetcher", description="Create a CredentialListMappingFetcher to execute fetch"), @ApiMethod(methodName = "reader", description="Create a CredentialListMappingReader to execute read"), })
@UriParams
@Configurer
public final class SipDomainCredentialListMappingEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="A string that identifies the CredentialList resource to map to the SIP domain")})
    private String credentialListSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="The unique sid that identifies this account"), @ApiMethod(methodName = "deleter", description="The unique sid that identifies this account"), @ApiMethod(methodName = "fetcher", description="The unique sid that identifies this account"), @ApiMethod(methodName = "reader", description="The unique sid that identifies this account")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "creator", description="A string that identifies the SIP Domain for which the CredentialList resource will be mapped"), @ApiMethod(methodName = "creator", description="A string that identifies the SIP Domain for which the CredentialList resource will be mapped"), @ApiMethod(methodName = "deleter", description="A string that identifies the SIP Domain that includes the resource to delete"), @ApiMethod(methodName = "deleter", description="A string that identifies the SIP Domain for which the CredentialList resource will be mapped"), @ApiMethod(methodName = "fetcher", description="A string that identifies the SIP Domain that includes the resource to fetch"), @ApiMethod(methodName = "fetcher", description="A string that identifies the SIP Domain for which the CredentialList resource will be mapped"), @ApiMethod(methodName = "reader", description="A string that identifies the SIP Domain that includes the resource to read"), @ApiMethod(methodName = "reader", description="A string that identifies the SIP Domain for which the CredentialList resource will be mapped")})
    private String pathDomainSid;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "deleter", description="A string that identifies the resource to delete"), @ApiMethod(methodName = "fetcher", description="A string that identifies the resource to fetch")})
    private String pathSid;

    public String getCredentialListSid() {
        return credentialListSid;
    }

    public void setCredentialListSid(String credentialListSid) {
        this.credentialListSid = credentialListSid;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathDomainSid() {
        return pathDomainSid;
    }

    public void setPathDomainSid(String pathDomainSid) {
        this.pathDomainSid = pathDomainSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
