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

  public fun connectorProfileName(connectorProfileName: String) {
    cdkBuilder.connectorProfileName(connectorProfileName)
  }

  public fun connectorType(connectorType: String) {
    cdkBuilder.connectorType(connectorType)
  }

  public fun incrementalPullConfig(incrementalPullConfig: IResolvable) {
    cdkBuilder.incrementalPullConfig(incrementalPullConfig)
  }

  public
      fun incrementalPullConfig(incrementalPullConfig: CfnIntegration.IncrementalPullConfigProperty) {
    cdkBuilder.incrementalPullConfig(incrementalPullConfig)
  }

  public fun sourceConnectorProperties(sourceConnectorProperties: IResolvable) {
    cdkBuilder.sourceConnectorProperties(sourceConnectorProperties)
  }

  public
      fun sourceConnectorProperties(sourceConnectorProperties: CfnIntegration.SourceConnectorPropertiesProperty) {
    cdkBuilder.sourceConnectorProperties(sourceConnectorProperties)
  }

  public fun build(): CfnIntegration.SourceFlowConfigProperty = cdkBuilder.build()
}
