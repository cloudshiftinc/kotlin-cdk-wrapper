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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * The configuration that controls how Customer Profiles retrieves data from the source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * SourceFlowConfigProperty sourceFlowConfigProperty = SourceFlowConfigProperty.builder()
 * .connectorType("connectorType")
 * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
 * .marketo(MarketoSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .s3(S3SourcePropertiesProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .build())
 * .salesforce(SalesforceSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .enableDynamicFieldUpdate(false)
 * .includeDeletedRecords(false)
 * .build())
 * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .zendesk(ZendeskSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .build())
 * // the properties below are optional
 * .connectorProfileName("connectorProfileName")
 * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
 * .datetimeTypeFieldName("datetimeTypeFieldName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceflowconfig.html)
 */
@CdkDslMarker
public class CfnIntegrationSourceFlowConfigPropertyDsl {
    private val cdkBuilder: CfnIntegration.SourceFlowConfigProperty.Builder =
        CfnIntegration.SourceFlowConfigProperty.builder()

    /**
     * @param connectorProfileName The name of the Amazon AppFlow connector profile. This name must
     *   be unique for each connector profile in the AWS account .
     */
    public fun connectorProfileName(connectorProfileName: String) {
        cdkBuilder.connectorProfileName(connectorProfileName)
    }

    /** @param connectorType The type of connector, such as Salesforce, Marketo, and so on. */
    public fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
    }

    /**
     * @param incrementalPullConfig Defines the configuration for a scheduled incremental data pull.
     *   If a valid configuration is provided, the fields specified in the configuration are used
     *   when querying for the incremental data pull.
     */
    public fun incrementalPullConfig(incrementalPullConfig: IResolvable) {
        cdkBuilder.incrementalPullConfig(incrementalPullConfig)
    }

    /**
     * @param incrementalPullConfig Defines the configuration for a scheduled incremental data pull.
     *   If a valid configuration is provided, the fields specified in the configuration are used
     *   when querying for the incremental data pull.
     */
    public fun incrementalPullConfig(
        incrementalPullConfig: CfnIntegration.IncrementalPullConfigProperty
    ) {
        cdkBuilder.incrementalPullConfig(incrementalPullConfig)
    }

    /**
     * @param sourceConnectorProperties Specifies the information that is required to query a
     *   particular source connector.
     */
    public fun sourceConnectorProperties(sourceConnectorProperties: IResolvable) {
        cdkBuilder.sourceConnectorProperties(sourceConnectorProperties)
    }

    /**
     * @param sourceConnectorProperties Specifies the information that is required to query a
     *   particular source connector.
     */
    public fun sourceConnectorProperties(
        sourceConnectorProperties: CfnIntegration.SourceConnectorPropertiesProperty
    ) {
        cdkBuilder.sourceConnectorProperties(sourceConnectorProperties)
    }

    public fun build(): CfnIntegration.SourceFlowConfigProperty = cdkBuilder.build()
}
