@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDeployment
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::Deployment` resource deploys an API Gateway `RestApi` resource to a stage
 * so that clients can call the API over the internet.
 *
 * The stage acts as an environment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
 * .restApiId("restApiId")
 * // the properties below are optional
 * .deploymentCanarySettings(DeploymentCanarySettingsProperty.builder()
 * .percentTraffic(123)
 * .stageVariableOverrides(Map.of(
 * "stageVariableOverridesKey", "stageVariableOverrides"))
 * .useStageCache(false)
 * .build())
 * .description("description")
 * .stageDescription(StageDescriptionProperty.builder()
 * .accessLogSetting(AccessLogSettingProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build())
 * .cacheClusterEnabled(false)
 * .cacheClusterSize("cacheClusterSize")
 * .cacheDataEncrypted(false)
 * .cacheTtlInSeconds(123)
 * .cachingEnabled(false)
 * .canarySetting(CanarySettingProperty.builder()
 * .percentTraffic(123)
 * .stageVariableOverrides(Map.of(
 * "stageVariableOverridesKey", "stageVariableOverrides"))
 * .useStageCache(false)
 * .build())
 * .clientCertificateId("clientCertificateId")
 * .dataTraceEnabled(false)
 * .description("description")
 * .documentationVersion("documentationVersion")
 * .loggingLevel("loggingLevel")
 * .methodSettings(List.of(MethodSettingProperty.builder()
 * .cacheDataEncrypted(false)
 * .cacheTtlInSeconds(123)
 * .cachingEnabled(false)
 * .dataTraceEnabled(false)
 * .httpMethod("httpMethod")
 * .loggingLevel("loggingLevel")
 * .metricsEnabled(false)
 * .resourcePath("resourcePath")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build()))
 * .metricsEnabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .tracingEnabled(false)
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build())
 * .stageName("stageName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html)
 */
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
