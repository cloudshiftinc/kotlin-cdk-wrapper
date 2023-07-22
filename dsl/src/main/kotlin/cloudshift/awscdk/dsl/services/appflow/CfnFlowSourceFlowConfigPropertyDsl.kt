@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * Contains information about the configuration of the source connector used in the flow.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SourceFlowConfigProperty sourceFlowConfigProperty = SourceFlowConfigProperty.builder()
 * .connectorType("connectorType")
 * .sourceConnectorProperties(SourceConnectorPropertiesProperty.builder()
 * .amplitude(AmplitudeSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .customConnector(CustomConnectorSourcePropertiesProperty.builder()
 * .entityName("entityName")
 * // the properties below are optional
 * .customProperties(Map.of(
 * "customPropertiesKey", "customProperties"))
 * .dataTransferApi(DataTransferApiProperty.builder()
 * .name("name")
 * .type("type")
 * .build())
 * .build())
 * .datadog(DatadogSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .dynatrace(DynatraceSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .googleAnalytics(GoogleAnalyticsSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .inforNexus(InforNexusSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .marketo(MarketoSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .pardot(PardotSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .s3(S3SourcePropertiesProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * // the properties below are optional
 * .s3InputFormatConfig(S3InputFormatConfigProperty.builder()
 * .s3InputFileType("s3InputFileType")
 * .build())
 * .build())
 * .salesforce(SalesforceSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .dataTransferApi("dataTransferApi")
 * .enableDynamicFieldUpdate(false)
 * .includeDeletedRecords(false)
 * .build())
 * .sapoData(SAPODataSourcePropertiesProperty.builder()
 * .objectPath("objectPath")
 * .build())
 * .serviceNow(ServiceNowSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .singular(SingularSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .slack(SlackSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .trendmicro(TrendmicroSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .veeva(VeevaSourcePropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .documentType("documentType")
 * .includeAllVersions(false)
 * .includeRenditions(false)
 * .includeSourceFiles(false)
 * .build())
 * .zendesk(ZendeskSourcePropertiesProperty.builder()
 * .object("object")
 * .build())
 * .build())
 * // the properties below are optional
 * .apiVersion("apiVersion")
 * .connectorProfileName("connectorProfileName")
 * .incrementalPullConfig(IncrementalPullConfigProperty.builder()
 * .datetimeTypeFieldName("datetimeTypeFieldName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sourceflowconfig.html)
 */
@CdkDslMarker
public class CfnFlowSourceFlowConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.SourceFlowConfigProperty.Builder =
      CfnFlow.SourceFlowConfigProperty.builder()

  /**
   * @param apiVersion The API version of the connector when it's used as a source in the flow.
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
   * @param connectorType The type of connector, such as Salesforce, Amplitude, and so on. 
   */
  public fun connectorType(connectorType: String) {
    cdkBuilder.connectorType(connectorType)
  }

  /**
   * @param incrementalPullConfig Defines the configuration for a scheduled incremental data pull.
   * If a valid configuration is provided, the fields specified in the configuration are used when
   * querying for the incremental data pull.
   */
  public fun incrementalPullConfig(incrementalPullConfig: IResolvable) {
    cdkBuilder.incrementalPullConfig(incrementalPullConfig)
  }

  /**
   * @param incrementalPullConfig Defines the configuration for a scheduled incremental data pull.
   * If a valid configuration is provided, the fields specified in the configuration are used when
   * querying for the incremental data pull.
   */
  public fun incrementalPullConfig(incrementalPullConfig: CfnFlow.IncrementalPullConfigProperty) {
    cdkBuilder.incrementalPullConfig(incrementalPullConfig)
  }

  /**
   * @param sourceConnectorProperties Specifies the information that is required to query a
   * particular source connector. 
   */
  public fun sourceConnectorProperties(sourceConnectorProperties: IResolvable) {
    cdkBuilder.sourceConnectorProperties(sourceConnectorProperties)
  }

  /**
   * @param sourceConnectorProperties Specifies the information that is required to query a
   * particular source connector. 
   */
  public
      fun sourceConnectorProperties(sourceConnectorProperties: CfnFlow.SourceConnectorPropertiesProperty) {
    cdkBuilder.sourceConnectorProperties(sourceConnectorProperties)
  }

  public fun build(): CfnFlow.SourceFlowConfigProperty = cdkBuilder.build()
}
