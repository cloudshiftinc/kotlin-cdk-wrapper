@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile properties required when using Salesforce.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SalesforceConnectorProfilePropertiesProperty salesforceConnectorProfilePropertiesProperty =
 * SalesforceConnectorProfilePropertiesProperty.builder()
 * .instanceUrl("instanceUrl")
 * .isSandboxEnvironment(false)
 * .usePrivateLinkForMetadataAndAuthorization(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-salesforceconnectorprofileproperties.html)
 */
@CdkDslMarker
public class CfnConnectorProfileSalesforceConnectorProfilePropertiesPropertyDsl {
    private val cdkBuilder:
        CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.Builder =
        CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.builder()

    /** @param instanceUrl The location of the Salesforce resource. */
    public fun instanceUrl(instanceUrl: String) {
        cdkBuilder.instanceUrl(instanceUrl)
    }

    /**
     * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
     *   production environment.
     */
    public fun isSandboxEnvironment(isSandboxEnvironment: Boolean) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
    }

    /**
     * @param isSandboxEnvironment Indicates whether the connector profile applies to a sandbox or
     *   production environment.
     */
    public fun isSandboxEnvironment(isSandboxEnvironment: IResolvable) {
        cdkBuilder.isSandboxEnvironment(isSandboxEnvironment)
    }

    /**
     * @param usePrivateLinkForMetadataAndAuthorization If the connection mode for the connector
     *   profile is private, this parameter sets whether Amazon AppFlow uses the private network to
     *   send metadata and authorization calls to Salesforce. Amazon AppFlow sends private calls
     *   through AWS PrivateLink . These calls travel through AWS infrastructure without being
     *   exposed to the public internet.
     *
     * Set either of the following values:
     * * **true** - Amazon AppFlow sends all calls to Salesforce over the private network.
     *
     * These private calls are:
     * * Calls to get metadata about your Salesforce records. This metadata describes your
     *   Salesforce objects and their fields.
     * * Calls to get or refresh access tokens that allow Amazon AppFlow to access your Salesforce
     *   records.
     * * Calls to transfer your Salesforce records as part of a flow run.
     * * **false** - The default value. Amazon AppFlow sends some calls to Salesforce privately and
     *   other calls over the public internet.
     *
     * The public calls are:
     * * Calls to get metadata about your Salesforce records.
     * * Calls to get or refresh access tokens.
     *
     * The private calls are:
     * * Calls to transfer your Salesforce records as part of a flow run.
     */
    public fun usePrivateLinkForMetadataAndAuthorization(
        usePrivateLinkForMetadataAndAuthorization: Boolean
    ) {
        cdkBuilder.usePrivateLinkForMetadataAndAuthorization(
            usePrivateLinkForMetadataAndAuthorization
        )
    }

    /**
     * @param usePrivateLinkForMetadataAndAuthorization If the connection mode for the connector
     *   profile is private, this parameter sets whether Amazon AppFlow uses the private network to
     *   send metadata and authorization calls to Salesforce. Amazon AppFlow sends private calls
     *   through AWS PrivateLink . These calls travel through AWS infrastructure without being
     *   exposed to the public internet.
     *
     * Set either of the following values:
     * * **true** - Amazon AppFlow sends all calls to Salesforce over the private network.
     *
     * These private calls are:
     * * Calls to get metadata about your Salesforce records. This metadata describes your
     *   Salesforce objects and their fields.
     * * Calls to get or refresh access tokens that allow Amazon AppFlow to access your Salesforce
     *   records.
     * * Calls to transfer your Salesforce records as part of a flow run.
     * * **false** - The default value. Amazon AppFlow sends some calls to Salesforce privately and
     *   other calls over the public internet.
     *
     * The public calls are:
     * * Calls to get metadata about your Salesforce records.
     * * Calls to get or refresh access tokens.
     *
     * The private calls are:
     * * Calls to transfer your Salesforce records as part of a flow run.
     */
    public fun usePrivateLinkForMetadataAndAuthorization(
        usePrivateLinkForMetadataAndAuthorization: IResolvable
    ) {
        cdkBuilder.usePrivateLinkForMetadataAndAuthorization(
            usePrivateLinkForMetadataAndAuthorization
        )
    }

    public fun build(): CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty =
        cdkBuilder.build()
}
