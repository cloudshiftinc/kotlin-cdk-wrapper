@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

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
