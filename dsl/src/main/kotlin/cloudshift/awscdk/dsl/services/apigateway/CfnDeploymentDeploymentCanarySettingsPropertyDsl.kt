@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDeployment

/**
 * The `DeploymentCanarySettings` property type specifies settings for the canary deployment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * DeploymentCanarySettingsProperty deploymentCanarySettingsProperty =
 * DeploymentCanarySettingsProperty.builder()
 * .percentTraffic(123)
 * .stageVariableOverrides(Map.of(
 * "stageVariableOverridesKey", "stageVariableOverrides"))
 * .useStageCache(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-deploymentcanarysettings.html)
 */
@CdkDslMarker
public class CfnDeploymentDeploymentCanarySettingsPropertyDsl {
  private val cdkBuilder: CfnDeployment.DeploymentCanarySettingsProperty.Builder =
      CfnDeployment.DeploymentCanarySettingsProperty.builder()

  /**
   * @param percentTraffic The percentage (0.0-100.0) of traffic routed to the canary deployment.
   */
  public fun percentTraffic(percentTraffic: Number) {
    cdkBuilder.percentTraffic(percentTraffic)
  }

  /**
   * @param stageVariableOverrides A stage variable overrides used for the canary release
   * deployment.
   * They can override existing stage variables or add new stage variables for the canary release
   * deployment. These stage variables are represented as a string-to-string map between stage variable
   * names and their values.
   */
  public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
    cdkBuilder.stageVariableOverrides(stageVariableOverrides)
  }

  /**
   * @param stageVariableOverrides A stage variable overrides used for the canary release
   * deployment.
   * They can override existing stage variables or add new stage variables for the canary release
   * deployment. These stage variables are represented as a string-to-string map between stage variable
   * names and their values.
   */
  public fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
    cdkBuilder.stageVariableOverrides(stageVariableOverrides)
  }

  /**
   * @param useStageCache A Boolean flag to indicate whether the canary release deployment uses the
   * stage cache or not.
   */
  public fun useStageCache(useStageCache: Boolean) {
    cdkBuilder.useStageCache(useStageCache)
  }

  /**
   * @param useStageCache A Boolean flag to indicate whether the canary release deployment uses the
   * stage cache or not.
   */
  public fun useStageCache(useStageCache: IResolvable) {
    cdkBuilder.useStageCache(useStageCache)
  }

  public fun build(): CfnDeployment.DeploymentCanarySettingsProperty = cdkBuilder.build()
}
