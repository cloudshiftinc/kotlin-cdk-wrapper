@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplication
import software.amazon.awscdk.CfnCodeDeployBlueGreenHook
import software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks
import software.amazon.awscdk.CfnTrafficRoutingConfig
import software.constructs.Construct

/**
 * A CloudFormation Hook for CodeDeploy blue-green ECS deployments.
 *
 * Example:
 *
 * ```
 * CfnInclude cfnTemplate;
 * // mutating the hook
 * Role myRole;
 * CfnHook hook = cfnTemplate.getHook("MyOutput");
 * CfnCodeDeployBlueGreenHook codeDeployHook = (CfnCodeDeployBlueGreenHook)hook;
 * codeDeployHook.getServiceRole() = myRole.getRoleArn();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/blue-green.html#blue-green-template-reference)
 */
@CdkDslMarker
public class CfnCodeDeployBlueGreenHookDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCodeDeployBlueGreenHook.Builder =
      CfnCodeDeployBlueGreenHook.Builder.create(scope, id)

  private val _applications: MutableList<CfnCodeDeployBlueGreenApplication> = mutableListOf()

  /**
   * Additional options for the blue/green deployment.
   *
   * Default: - no additional options
   *
   * @param additionalOptions Additional options for the blue/green deployment. 
   */
  public
      fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptionsDsl.() -> Unit
      = {}) {
    val builder = CfnCodeDeployBlueGreenAdditionalOptionsDsl()
    builder.apply(additionalOptions)
    cdkBuilder.additionalOptions(builder.build())
  }

  /**
   * Additional options for the blue/green deployment.
   *
   * Default: - no additional options
   *
   * @param additionalOptions Additional options for the blue/green deployment. 
   */
  public fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions) {
    cdkBuilder.additionalOptions(additionalOptions)
  }

  /**
   * Properties of the Amazon ECS applications being deployed.
   *
   * @param applications Properties of the Amazon ECS applications being deployed. 
   */
  public fun applications(applications: CfnCodeDeployBlueGreenApplicationDsl.() -> Unit) {
    _applications.add(CfnCodeDeployBlueGreenApplicationDsl().apply(applications).build())
  }

  /**
   * Properties of the Amazon ECS applications being deployed.
   *
   * @param applications Properties of the Amazon ECS applications being deployed. 
   */
  public fun applications(applications: Collection<CfnCodeDeployBlueGreenApplication>) {
    _applications.addAll(applications)
  }

  /**
   * Use lifecycle event hooks to specify a Lambda function that CodeDeploy can call to validate a
   * deployment.
   *
   * You can use the same function or a different one for deployment lifecycle events.
   * Following completion of the validation tests,
   * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
   * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
   *
   * Default: - no lifecycle event hooks
   *
   * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
   * CodeDeploy can call to validate a deployment. 
   */
  public
      fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooksDsl.() -> Unit
      = {}) {
    val builder = CfnCodeDeployBlueGreenLifecycleEventHooksDsl()
    builder.apply(lifecycleEventHooks)
    cdkBuilder.lifecycleEventHooks(builder.build())
  }

  /**
   * Use lifecycle event hooks to specify a Lambda function that CodeDeploy can call to validate a
   * deployment.
   *
   * You can use the same function or a different one for deployment lifecycle events.
   * Following completion of the validation tests,
   * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
   * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
   *
   * Default: - no lifecycle event hooks
   *
   * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
   * CodeDeploy can call to validate a deployment. 
   */
  public fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks) {
    cdkBuilder.lifecycleEventHooks(lifecycleEventHooks)
  }

  /**
   * The IAM Role for CloudFormation to use to perform blue-green deployments.
   *
   * @param serviceRole The IAM Role for CloudFormation to use to perform blue-green deployments. 
   */
  public fun serviceRole(serviceRole: String) {
    cdkBuilder.serviceRole(serviceRole)
  }

  /**
   * Traffic routing configuration settings.
   *
   * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
   * bake time
   *
   * @param trafficRoutingConfig Traffic routing configuration settings. 
   */
  public fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfigDsl.() -> Unit =
      {}) {
    val builder = CfnTrafficRoutingConfigDsl()
    builder.apply(trafficRoutingConfig)
    cdkBuilder.trafficRoutingConfig(builder.build())
  }

  /**
   * Traffic routing configuration settings.
   *
   * Default: - time-based canary traffic shifting, with a 15% step percentage and a five minute
   * bake time
   *
   * @param trafficRoutingConfig Traffic routing configuration settings. 
   */
  public fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig) {
    cdkBuilder.trafficRoutingConfig(trafficRoutingConfig)
  }

  public fun build(): CfnCodeDeployBlueGreenHook {
    if(_applications.isNotEmpty()) cdkBuilder.applications(_applications)
    return cdkBuilder.build()
  }
}
