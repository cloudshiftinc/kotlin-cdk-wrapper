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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * Specifies the information that is required to query a particular Amazon AppFlow connector.
 *
 * Customer Profiles supports Salesforce, Zendesk, Marketo, ServiceNow and Amazon S3.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * SourceConnectorPropertiesProperty sourceConnectorPropertiesProperty =
 * SourceConnectorPropertiesProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-sourceconnectorproperties.html)
 */
@CdkDslMarker
public class CfnIntegrationSourceConnectorPropertiesPropertyDsl {
    private val cdkBuilder: CfnIntegration.SourceConnectorPropertiesProperty.Builder =
        CfnIntegration.SourceConnectorPropertiesProperty.builder()

    /** @param marketo The properties that are applied when Marketo is being used as a source. */
    public fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo)
    }

    /** @param marketo The properties that are applied when Marketo is being used as a source. */
    public fun marketo(marketo: CfnIntegration.MarketoSourcePropertiesProperty) {
        cdkBuilder.marketo(marketo)
    }

    /**
     * @param s3 The properties that are applied when Amazon S3 is being used as the flow source.
     */
    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    /**
     * @param s3 The properties that are applied when Amazon S3 is being used as the flow source.
     */
    public fun s3(s3: CfnIntegration.S3SourcePropertiesProperty) {
        cdkBuilder.s3(s3)
    }

    /**
     * @param salesforce The properties that are applied when Salesforce is being used as a source.
     */
    public fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce)
    }

    /**
     * @param salesforce The properties that are applied when Salesforce is being used as a source.
     */
    public fun salesforce(salesforce: CfnIntegration.SalesforceSourcePropertiesProperty) {
        cdkBuilder.salesforce(salesforce)
    }

    /**
     * @param serviceNow The properties that are applied when ServiceNow is being used as a source.
     */
    public fun serviceNow(serviceNow: IResolvable) {
        cdkBuilder.serviceNow(serviceNow)
    }

    /**
     * @param serviceNow The properties that are applied when ServiceNow is being used as a source.
     */
    public fun serviceNow(serviceNow: CfnIntegration.ServiceNowSourcePropertiesProperty) {
        cdkBuilder.serviceNow(serviceNow)
    }

    /** @param zendesk The properties that are applied when using Zendesk as a flow source. */
    public fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk)
    }

    /** @param zendesk The properties that are applied when using Zendesk as a flow source. */
    public fun zendesk(zendesk: CfnIntegration.ZendeskSourcePropertiesProperty) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun build(): CfnIntegration.SourceConnectorPropertiesProperty = cdkBuilder.build()
}
