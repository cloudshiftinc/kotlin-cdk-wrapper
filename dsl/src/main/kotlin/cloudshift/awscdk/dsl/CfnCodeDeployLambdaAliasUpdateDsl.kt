@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate

/**
 * To perform an AWS CodeDeploy deployment when the version changes on an AWS::Lambda::Alias
 * resource, use the CodeDeployLambdaAliasUpdate update policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnCodeDeployLambdaAliasUpdate cfnCodeDeployLambdaAliasUpdate =
 * CfnCodeDeployLambdaAliasUpdate.builder()
 * .applicationName("applicationName")
 * .deploymentGroupName("deploymentGroupName")
 * // the properties below are optional
 * .afterAllowTrafficHook("afterAllowTrafficHook")
 * .beforeAllowTrafficHook("beforeAllowTrafficHook")
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnCodeDeployLambdaAliasUpdateDsl {
  private val cdkBuilder: CfnCodeDeployLambdaAliasUpdate.Builder =
      CfnCodeDeployLambdaAliasUpdate.builder()

  /**
   * @param afterAllowTrafficHook The name of the Lambda function to run after traffic routing
   * completes.
   */
  public fun afterAllowTrafficHook(afterAllowTrafficHook: String) {
    cdkBuilder.afterAllowTrafficHook(afterAllowTrafficHook)
  }

  /**
   * @param applicationName The name of the AWS CodeDeploy application. 
   */
  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  /**
   * @param beforeAllowTrafficHook The name of the Lambda function to run before traffic routing
   * starts.
   */
  public fun beforeAllowTrafficHook(beforeAllowTrafficHook: String) {
    cdkBuilder.beforeAllowTrafficHook(beforeAllowTrafficHook)
  }

  /**
   * @param deploymentGroupName The name of the AWS CodeDeploy deployment group. 
   * This is where the traffic-shifting policy is set.
   */
  public fun deploymentGroupName(deploymentGroupName: String) {
    cdkBuilder.deploymentGroupName(deploymentGroupName)
  }

  public fun build(): CfnCodeDeployLambdaAliasUpdate = cdkBuilder.build()
}
