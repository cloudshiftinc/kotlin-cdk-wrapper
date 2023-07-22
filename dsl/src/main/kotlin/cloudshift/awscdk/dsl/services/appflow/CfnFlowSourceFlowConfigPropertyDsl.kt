@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

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
