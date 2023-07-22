@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * Contains information about the configuration of destination connectors present in the flow.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * DestinationFlowConfigProperty destinationFlowConfigProperty =
 * DestinationFlowConfigProperty.builder()
 * .connectorType("connectorType")
 * .destinationConnectorProperties(DestinationConnectorPropertiesProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .apiVersion("apiVersion")
 * .connectorProfileName("connectorProfileName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-destinationflowconfig.html)
 */
@CdkDslMarker
public class CfnFlowDestinationFlowConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.DestinationFlowConfigProperty.Builder =
      CfnFlow.DestinationFlowConfigProperty.builder()

  /**
   * @param apiVersion The API version that the destination connector uses.
   */
  public fun apiVersion(apiVersion: String) {
    cdkBuilder.apiVersion(apiVersion)
  }

  /**
   * @param connectorProfileName The name of the connector profile.
   * This name must be unique for each connector profile in the AWS account .
   */
  public fun connectorProfileName(connectorProfileName: String) {
    cdkBuilder.connectorProfileName(connectorProfileName)
  }

  /**
   * @param connectorType The type of destination connector, such as Sales force, Amazon S3, and so
   * on. 
   * *Allowed Values* : `EventBridge | Redshift | S3 | Salesforce | Snowflake`
   */
  public fun connectorType(connectorType: String) {
    cdkBuilder.connectorType(connectorType)
  }

  /**
   * @param destinationConnectorProperties This stores the information that is required to query a
   * particular connector. 
   */
  public fun destinationConnectorProperties(destinationConnectorProperties: IResolvable) {
    cdkBuilder.destinationConnectorProperties(destinationConnectorProperties)
  }

  /**
   * @param destinationConnectorProperties This stores the information that is required to query a
   * particular connector. 
   */
  public
      fun destinationConnectorProperties(destinationConnectorProperties: CfnFlow.DestinationConnectorPropertiesProperty) {
    cdkBuilder.destinationConnectorProperties(destinationConnectorProperties)
  }

  public fun build(): CfnFlow.DestinationFlowConfigProperty = cdkBuilder.build()
}
