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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * This stores the information that is required to query a particular connector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * DestinationConnectorPropertiesProperty destinationConnectorPropertiesProperty =
 * DestinationConnectorPropertiesProperty.builder()
 * .customConnector(CustomConnectorDestinationPropertiesProperty.builder()
 * .entityName("entityName")
 * // the properties below are optional
 * .customProperties(Map.of(
 * "customPropertiesKey", "customProperties"))
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .writeOperationType("writeOperationType")
 * .build())
 * .eventBridge(EventBridgeDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build())
 * .lookoutMetrics(LookoutMetricsDestinationPropertiesProperty.builder()
 * .object("object")
 * .build())
 * .marketo(MarketoDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build())
 * .redshift(RedshiftDestinationPropertiesProperty.builder()
 * .intermediateBucketName("intermediateBucketName")
 * .object("object")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build())
 * .s3(S3DestinationPropertiesProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .s3OutputFormatConfig(S3OutputFormatConfigProperty.builder()
 * .aggregationConfig(AggregationConfigProperty.builder()
 * .aggregationType("aggregationType")
 * .targetFileSize(123)
 * .build())
 * .fileType("fileType")
 * .prefixConfig(PrefixConfigProperty.builder()
 * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
 * .prefixFormat("prefixFormat")
 * .prefixType("prefixType")
 * .build())
 * .preserveSourceDataTyping(false)
 * .build())
 * .build())
 * .salesforce(SalesforceDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .dataTransferApi("dataTransferApi")
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .writeOperationType("writeOperationType")
 * .build())
 * .sapoData(SAPODataDestinationPropertiesProperty.builder()
 * .objectPath("objectPath")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .successResponseHandlingConfig(SuccessResponseHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .build())
 * .writeOperationType("writeOperationType")
 * .build())
 * .snowflake(SnowflakeDestinationPropertiesProperty.builder()
 * .intermediateBucketName("intermediateBucketName")
 * .object("object")
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .build())
 * .upsolver(UpsolverDestinationPropertiesProperty.builder()
 * .bucketName("bucketName")
 * .s3OutputFormatConfig(UpsolverS3OutputFormatConfigProperty.builder()
 * .prefixConfig(PrefixConfigProperty.builder()
 * .pathPrefixHierarchy(List.of("pathPrefixHierarchy"))
 * .prefixFormat("prefixFormat")
 * .prefixType("prefixType")
 * .build())
 * // the properties below are optional
 * .aggregationConfig(AggregationConfigProperty.builder()
 * .aggregationType("aggregationType")
 * .targetFileSize(123)
 * .build())
 * .fileType("fileType")
 * .build())
 * // the properties below are optional
 * .bucketPrefix("bucketPrefix")
 * .build())
 * .zendesk(ZendeskDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .writeOperationType("writeOperationType")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationconnectorproperties.html)
 */
@CdkDslMarker
public class CfnFlowDestinationConnectorPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.DestinationConnectorPropertiesProperty.Builder =
        CfnFlow.DestinationConnectorPropertiesProperty.builder()

    /** @param customConnector The properties that are required to query the custom Connector. */
    public fun customConnector(customConnector: IResolvable) {
        cdkBuilder.customConnector(customConnector)
    }

    /** @param customConnector The properties that are required to query the custom Connector. */
    public fun customConnector(
        customConnector: CfnFlow.CustomConnectorDestinationPropertiesProperty
    ) {
        cdkBuilder.customConnector(customConnector)
    }

    /** @param eventBridge The properties required to query Amazon EventBridge. */
    public fun eventBridge(eventBridge: IResolvable) {
        cdkBuilder.eventBridge(eventBridge)
    }

    /** @param eventBridge The properties required to query Amazon EventBridge. */
    public fun eventBridge(eventBridge: CfnFlow.EventBridgeDestinationPropertiesProperty) {
        cdkBuilder.eventBridge(eventBridge)
    }

    /** @param lookoutMetrics The properties required to query Amazon Lookout for Metrics. */
    public fun lookoutMetrics(lookoutMetrics: IResolvable) {
        cdkBuilder.lookoutMetrics(lookoutMetrics)
    }

    /** @param lookoutMetrics The properties required to query Amazon Lookout for Metrics. */
    public fun lookoutMetrics(lookoutMetrics: CfnFlow.LookoutMetricsDestinationPropertiesProperty) {
        cdkBuilder.lookoutMetrics(lookoutMetrics)
    }

    /** @param marketo The properties required to query Marketo. */
    public fun marketo(marketo: IResolvable) {
        cdkBuilder.marketo(marketo)
    }

    /** @param marketo The properties required to query Marketo. */
    public fun marketo(marketo: CfnFlow.MarketoDestinationPropertiesProperty) {
        cdkBuilder.marketo(marketo)
    }

    /** @param redshift The properties required to query Amazon Redshift. */
    public fun redshift(redshift: IResolvable) {
        cdkBuilder.redshift(redshift)
    }

    /** @param redshift The properties required to query Amazon Redshift. */
    public fun redshift(redshift: CfnFlow.RedshiftDestinationPropertiesProperty) {
        cdkBuilder.redshift(redshift)
    }

    /** @param s3 The properties required to query Amazon S3. */
    public fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3)
    }

    /** @param s3 The properties required to query Amazon S3. */
    public fun s3(s3: CfnFlow.S3DestinationPropertiesProperty) {
        cdkBuilder.s3(s3)
    }

    /** @param salesforce The properties required to query Salesforce. */
    public fun salesforce(salesforce: IResolvable) {
        cdkBuilder.salesforce(salesforce)
    }

    /** @param salesforce The properties required to query Salesforce. */
    public fun salesforce(salesforce: CfnFlow.SalesforceDestinationPropertiesProperty) {
        cdkBuilder.salesforce(salesforce)
    }

    /** @param sapoData The properties required to query SAPOData. */
    public fun sapoData(sapoData: IResolvable) {
        cdkBuilder.sapoData(sapoData)
    }

    /** @param sapoData The properties required to query SAPOData. */
    public fun sapoData(sapoData: CfnFlow.SAPODataDestinationPropertiesProperty) {
        cdkBuilder.sapoData(sapoData)
    }

    /** @param snowflake The properties required to query Snowflake. */
    public fun snowflake(snowflake: IResolvable) {
        cdkBuilder.snowflake(snowflake)
    }

    /** @param snowflake The properties required to query Snowflake. */
    public fun snowflake(snowflake: CfnFlow.SnowflakeDestinationPropertiesProperty) {
        cdkBuilder.snowflake(snowflake)
    }

    /** @param upsolver The properties required to query Upsolver. */
    public fun upsolver(upsolver: IResolvable) {
        cdkBuilder.upsolver(upsolver)
    }

    /** @param upsolver The properties required to query Upsolver. */
    public fun upsolver(upsolver: CfnFlow.UpsolverDestinationPropertiesProperty) {
        cdkBuilder.upsolver(upsolver)
    }

    /** @param zendesk The properties required to query Zendesk. */
    public fun zendesk(zendesk: IResolvable) {
        cdkBuilder.zendesk(zendesk)
    }

    /** @param zendesk The properties required to query Zendesk. */
    public fun zendesk(zendesk: CfnFlow.ZendeskDestinationPropertiesProperty) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun build(): CfnFlow.DestinationConnectorPropertiesProperty = cdkBuilder.build()
}
