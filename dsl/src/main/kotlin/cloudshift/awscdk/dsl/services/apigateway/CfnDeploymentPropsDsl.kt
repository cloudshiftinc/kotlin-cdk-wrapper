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

  /**
   * @param deploymentCanarySettings The input configuration for a canary deployment.
   */
  public fun deploymentCanarySettings(deploymentCanarySettings: IResolvable) {
    cdkBuilder.deploymentCanarySettings(deploymentCanarySettings)
  }

  /**
   * @param deploymentCanarySettings The input configuration for a canary deployment.
   */
  public
      fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty) {
    cdkBuilder.deploymentCanarySettings(deploymentCanarySettings)
  }

  /**
   * @param description The description for the Deployment resource to create.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  /**
   * @param stageDescription The description of the Stage resource for the Deployment resource to
   * create.
   * To specify a stage description, you must also provide a stage name.
   */
  public fun stageDescription(stageDescription: IResolvable) {
    cdkBuilder.stageDescription(stageDescription)
  }

  /**
   * @param stageDescription The description of the Stage resource for the Deployment resource to
   * create.
   * To specify a stage description, you must also provide a stage name.
   */
  public fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty) {
    cdkBuilder.stageDescription(stageDescription)
  }

  /**
   * @param stageName The name of the Stage resource for the Deployment resource to create.
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): CfnDeploymentProps = cdkBuilder.build()
}
