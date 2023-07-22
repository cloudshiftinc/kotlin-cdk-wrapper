@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDeployment
import software.constructs.Construct

@CdkDslMarker
public class CfnDeploymentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDeployment.Builder = CfnDeployment.Builder.create(scope, id)

  /**
   * The input configuration for a canary deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-deploymentcanarysettings)
   * @param deploymentCanarySettings The input configuration for a canary deployment. 
   */
  public fun deploymentCanarySettings(deploymentCanarySettings: IResolvable) {
    cdkBuilder.deploymentCanarySettings(deploymentCanarySettings)
  }

  /**
   * The input configuration for a canary deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-deploymentcanarysettings)
   * @param deploymentCanarySettings The input configuration for a canary deployment. 
   */
  public
      fun deploymentCanarySettings(deploymentCanarySettings: CfnDeployment.DeploymentCanarySettingsProperty) {
    cdkBuilder.deploymentCanarySettings(deploymentCanarySettings)
  }

  /**
   * The description for the Deployment resource to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description)
   * @param description The description for the Deployment resource to create. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid)
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  /**
   * The description of the Stage resource for the Deployment resource to create.
   *
   * To specify a stage description, you must also provide a stage name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
   * @param stageDescription The description of the Stage resource for the Deployment resource to
   * create. 
   */
  public fun stageDescription(stageDescription: IResolvable) {
    cdkBuilder.stageDescription(stageDescription)
  }

  /**
   * The description of the Stage resource for the Deployment resource to create.
   *
   * To specify a stage description, you must also provide a stage name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagedescription)
   * @param stageDescription The description of the Stage resource for the Deployment resource to
   * create. 
   */
  public fun stageDescription(stageDescription: CfnDeployment.StageDescriptionProperty) {
    cdkBuilder.stageDescription(stageDescription)
  }

  /**
   * The name of the Stage resource for the Deployment resource to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename)
   * @param stageName The name of the Stage resource for the Deployment resource to create. 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): CfnDeployment = cdkBuilder.build()
}
