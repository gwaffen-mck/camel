
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive$Revisions}.
 */
@ApiParams(apiName = "drive-revisions", description = "The revisions collection of methods",
           apiMethods = {@ApiMethod(methodName = "delete", description="Removes a revision"), @ApiMethod(methodName = "get", description="Gets a specific revision"), @ApiMethod(methodName = "list", description="Lists a file's revisions"), @ApiMethod(methodName = "patch", description="Updates a revision"), @ApiMethod(methodName = "update", description="Updates a revision")})
@UriParams
@Configurer
public final class DriveRevisionsEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "patch", description="The com.google.api.services.drive.model.Revision"), @ApiMethod(methodName = "update", description="The com.google.api.services.drive.model.Revision")})
    private com.google.api.services.drive.model.Revision content;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the file"), @ApiMethod(methodName = "get", description="The ID of the file"), @ApiMethod(methodName = "list", description="The ID of the file"), @ApiMethod(methodName = "patch", description="The ID for the file"), @ApiMethod(methodName = "update", description="The ID for the file")})
    private String fileId;
    @UriParam
    @ApiParam(apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the revision"), @ApiMethod(methodName = "get", description="The ID of the revision"), @ApiMethod(methodName = "patch", description="The ID for the revision"), @ApiMethod(methodName = "update", description="The ID for the revision")})
    private String revisionId;

    public com.google.api.services.drive.model.Revision getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.Revision content) {
        this.content = content;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }
}
