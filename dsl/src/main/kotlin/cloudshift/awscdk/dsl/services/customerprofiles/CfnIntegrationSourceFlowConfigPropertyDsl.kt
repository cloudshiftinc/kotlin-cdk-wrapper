@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@CdkDslMarker
public class CfnIntegrationSourceFlowConfigPropertyDsl {
  private val cdkBuilder: CfnIntegration.SourceFlowConfigProperty.Builder =
      CfnIntegration.SourceFlowConfigProperty.builder()

  /**
   * @param connectorProfileName The name of the Amazon AppFlow connector profile.
   * This name must be unique for each connector profile in the AWS account .
   */
  public fun connectorProfileName(connectorProfileName: String) {
    cdkBuilder.connectorProfileName(connectorProfileName)
  }

  /**
   * @param connectorType The type of connector, such as Salesforce, Marketo, and so on. 
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
  public
      fun incrementalPullConfig(incrementalPullConfig: CfnIntegration.IncrementalPullConfigProperty) {
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
      fun sourceConnectorProperties(sourceConnectorProperties: CfnIntegration.SourceConnectorPropertiesProperty) {
    cdkBuilder.sourceConnectorProperties(sourceConnectorProperties)
  }

  public fun build(): CfnIntegration.SourceFlowConfigProperty = cdkBuilder.build()
}
