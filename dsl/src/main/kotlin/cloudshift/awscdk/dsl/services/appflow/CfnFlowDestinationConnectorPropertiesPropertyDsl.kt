@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowDestinationConnectorPropertiesPropertyDsl {
  private val cdkBuilder: CfnFlow.DestinationConnectorPropertiesProperty.Builder =
      CfnFlow.DestinationConnectorPropertiesProperty.builder()

  public fun customConnector(customConnector: IResolvable) {
    cdkBuilder.customConnector(customConnector)
  }

  public
      fun customConnector(customConnector: CfnFlow.CustomConnectorDestinationPropertiesProperty) {
    cdkBuilder.customConnector(customConnector)
  }

  public fun eventBridge(eventBridge: IResolvable) {
    cdkBuilder.eventBridge(eventBridge)
  }

  public fun eventBridge(eventBridge: CfnFlow.EventBridgeDestinationPropertiesProperty) {
    cdkBuilder.eventBridge(eventBridge)
  }

  public fun lookoutMetrics(lookoutMetrics: IResolvable) {
    cdkBuilder.lookoutMetrics(lookoutMetrics)
  }

  public fun lookoutMetrics(lookoutMetrics: CfnFlow.LookoutMetricsDestinationPropertiesProperty) {
    cdkBuilder.lookoutMetrics(lookoutMetrics)
  }

  public fun marketo(marketo: IResolvable) {
    cdkBuilder.marketo(marketo)
  }

  public fun marketo(marketo: CfnFlow.MarketoDestinationPropertiesProperty) {
    cdkBuilder.marketo(marketo)
  }

  public fun redshift(redshift: IResolvable) {
    cdkBuilder.redshift(redshift)
  }

  public fun redshift(redshift: CfnFlow.RedshiftDestinationPropertiesProperty) {
    cdkBuilder.redshift(redshift)
  }

  public fun s3(s3: IResolvable) {
    cdkBuilder.s3(s3)
  }

  public fun s3(s3: CfnFlow.S3DestinationPropertiesProperty) {
    cdkBuilder.s3(s3)
  }

  public fun salesforce(salesforce: IResolvable) {
    cdkBuilder.salesforce(salesforce)
  }

  public fun salesforce(salesforce: CfnFlow.SalesforceDestinationPropertiesProperty) {
    cdkBuilder.salesforce(salesforce)
  }

  public fun sapoData(sapoData: IResolvable) {
    cdkBuilder.sapoData(sapoData)
  }

  public fun sapoData(sapoData: CfnFlow.SAPODataDestinationPropertiesProperty) {
    cdkBuilder.sapoData(sapoData)
  }

  public fun snowflake(snowflake: IResolvable) {
    cdkBuilder.snowflake(snowflake)
  }

  public fun snowflake(snowflake: CfnFlow.SnowflakeDestinationPropertiesProperty) {
    cdkBuilder.snowflake(snowflake)
  }

  public fun upsolver(upsolver: IResolvable) {
    cdkBuilder.upsolver(upsolver)
  }

  public fun upsolver(upsolver: CfnFlow.UpsolverDestinationPropertiesProperty) {
    cdkBuilder.upsolver(upsolver)
  }

  public fun zendesk(zendesk: IResolvable) {
    cdkBuilder.zendesk(zendesk)
  }

  public fun zendesk(zendesk: CfnFlow.ZendeskDestinationPropertiesProperty) {
    cdkBuilder.zendesk(zendesk)
  }

  public fun build(): CfnFlow.DestinationConnectorPropertiesProperty = cdkBuilder.build()
}
