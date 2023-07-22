@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowDestinationConnectorPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.DestinationConnectorPropertiesProperty.Builder =
      CfnFlow.DestinationConnectorPropertiesProperty.builder()

  /**
   * @param customConnector The properties that are required to query the custom Connector.
   */
  public fun customConnector(customConnector: IResolvable) {
    cdkBuilder.customConnector(customConnector)
  }

  /**
   * @param customConnector The properties that are required to query the custom Connector.
   */
  public
      fun customConnector(customConnector: CfnFlow.CustomConnectorDestinationPropertiesProperty) {
    cdkBuilder.customConnector(customConnector)
  }

  /**
   * @param eventBridge The properties required to query Amazon EventBridge.
   */
  public fun eventBridge(eventBridge: IResolvable) {
    cdkBuilder.eventBridge(eventBridge)
  }

  /**
   * @param eventBridge The properties required to query Amazon EventBridge.
   */
  public fun eventBridge(eventBridge: CfnFlow.EventBridgeDestinationPropertiesProperty) {
    cdkBuilder.eventBridge(eventBridge)
  }

  /**
   * @param lookoutMetrics The properties required to query Amazon Lookout for Metrics.
   */
  public fun lookoutMetrics(lookoutMetrics: IResolvable) {
    cdkBuilder.lookoutMetrics(lookoutMetrics)
  }

  /**
   * @param lookoutMetrics The properties required to query Amazon Lookout for Metrics.
   */
  public fun lookoutMetrics(lookoutMetrics: CfnFlow.LookoutMetricsDestinationPropertiesProperty) {
    cdkBuilder.lookoutMetrics(lookoutMetrics)
  }

  /**
   * @param marketo The properties required to query Marketo.
   */
  public fun marketo(marketo: IResolvable) {
    cdkBuilder.marketo(marketo)
  }

  /**
   * @param marketo The properties required to query Marketo.
   */
  public fun marketo(marketo: CfnFlow.MarketoDestinationPropertiesProperty) {
    cdkBuilder.marketo(marketo)
  }

  /**
   * @param redshift The properties required to query Amazon Redshift.
   */
  public fun redshift(redshift: IResolvable) {
    cdkBuilder.redshift(redshift)
  }

  /**
   * @param redshift The properties required to query Amazon Redshift.
   */
  public fun redshift(redshift: CfnFlow.RedshiftDestinationPropertiesProperty) {
    cdkBuilder.redshift(redshift)
  }

  /**
   * @param s3 The properties required to query Amazon S3.
   */
  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param s3 The properties required to query Amazon S3.
   */
  public fun s3(s3: CfnFlow.S3DestinationPropertiesProperty) {
    cdkBuilder.s3(s3)
  }

  /**
   * @param salesforce The properties required to query Salesforce.
   */
  public fun salesforce(salesforce: IResolvable) {
    cdkBuilder.salesforce(salesforce)
  }

  /**
   * @param salesforce The properties required to query Salesforce.
   */
  public fun salesforce(salesforce: CfnFlow.SalesforceDestinationPropertiesProperty) {
    cdkBuilder.salesforce(salesforce)
  }

  /**
   * @param sapoData The properties required to query SAPOData.
   */
  public fun sapoData(sapoData: IResolvable) {
    cdkBuilder.sapoData(sapoData)
  }

  /**
   * @param sapoData The properties required to query SAPOData.
   */
  public fun sapoData(sapoData: CfnFlow.SAPODataDestinationPropertiesProperty) {
    cdkBuilder.sapoData(sapoData)
  }

  /**
   * @param snowflake The properties required to query Snowflake.
   */
  public fun snowflake(snowflake: IResolvable) {
    cdkBuilder.snowflake(snowflake)
  }

  /**
   * @param snowflake The properties required to query Snowflake.
   */
  public fun snowflake(snowflake: CfnFlow.SnowflakeDestinationPropertiesProperty) {
    cdkBuilder.snowflake(snowflake)
  }

  /**
   * @param upsolver The properties required to query Upsolver.
   */
  public fun upsolver(upsolver: IResolvable) {
    cdkBuilder.upsolver(upsolver)
  }

  /**
   * @param upsolver The properties required to query Upsolver.
   */
  public fun upsolver(upsolver: CfnFlow.UpsolverDestinationPropertiesProperty) {
    cdkBuilder.upsolver(upsolver)
  }

  /**
   * @param zendesk The properties required to query Zendesk.
   */
  public fun zendesk(zendesk: IResolvable) {
    cdkBuilder.zendesk(zendesk)
  }

  /**
   * @param zendesk The properties required to query Zendesk.
   */
  public fun zendesk(zendesk: CfnFlow.ZendeskDestinationPropertiesProperty) {
    cdkBuilder.zendesk(zendesk)
  }

  public fun build(): CfnFlow.DestinationConnectorPropertiesProperty = cdkBuilder.build()
}
