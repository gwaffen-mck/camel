
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirMeta}.
 */
@ApiParams(apiName = "meta", description = "",
           apiMethods = {@ApiMethod(methodName = "add"), @ApiMethod(methodName = "delete"), @ApiMethod(methodName = "getFromResource"), @ApiMethod(methodName = "getFromServer"), @ApiMethod(methodName = "getFromType")})
@UriParams
@Configurer
public final class FhirMetaEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "add"), @ApiMethod(methodName = "delete"), @ApiMethod(methodName = "getFromResource"), @ApiMethod(methodName = "getFromServer"), @ApiMethod(methodName = "getFromType")})
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "add"), @ApiMethod(methodName = "delete"), @ApiMethod(methodName = "getFromResource")})
    private org.hl7.fhir.instance.model.api.IIdType id;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "add"), @ApiMethod(methodName = "delete")})
    private org.hl7.fhir.instance.model.api.IBaseMetaType meta;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "getFromResource"), @ApiMethod(methodName = "getFromServer"), @ApiMethod(methodName = "getFromType")})
    private Class<org.hl7.fhir.instance.model.api.IBaseMetaType> metaType;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "getFromType")})
    private String theResourceName;

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters,Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public org.hl7.fhir.instance.model.api.IIdType getId() {
        return id;
    }

    public void setId(org.hl7.fhir.instance.model.api.IIdType id) {
        this.id = id;
    }

    public org.hl7.fhir.instance.model.api.IBaseMetaType getMeta() {
        return meta;
    }

    public void setMeta(org.hl7.fhir.instance.model.api.IBaseMetaType meta) {
        this.meta = meta;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseMetaType> getMetaType() {
        return metaType;
    }

    public void setMetaType(Class<org.hl7.fhir.instance.model.api.IBaseMetaType> metaType) {
        this.metaType = metaType;
    }

    public String getTheResourceName() {
        return theResourceName;
    }

    public void setTheResourceName(String theResourceName) {
        this.theResourceName = theResourceName;
    }
}
