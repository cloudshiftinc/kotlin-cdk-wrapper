@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDeployment
import software.amazon.awscdk.services.apigateway.CfnDeploymentProps

@CdkDslMarker
public class CfnDeploymentPropsDsl {
  private val cdkBuilder: CfnDeploymentProps.Builder = CfnDeploymentProps.builder()

  public fun deploymentCanarySettings(deploymentCanarySettings: IResolvable) {
    cdkBuilder.deploymentCanarySettings(deploymentCanarySettings)
  }

  public
      fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty) {
    cdkBuilder.deploymentCanarySettings(deploymentCanarySettings)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun stageDescription(stageDescription: IResolvable) {
    cdkBuilder.stageDescription(stageDescription)
  }

  public fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty) {
    cdkBuilder.stageDescription(stageDescription)
  }

  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): CfnDeploymentProps = cdkBuilder.build()
}
