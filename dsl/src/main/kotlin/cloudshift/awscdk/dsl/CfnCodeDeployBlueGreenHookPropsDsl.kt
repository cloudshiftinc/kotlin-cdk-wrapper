@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplication
import software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps
import software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks
import software.amazon.awscdk.CfnTrafficRoutingConfig

@CdkDslMarker
public class CfnCodeDeployBlueGreenHookPropsDsl {
  private val cdkBuilder: CfnCodeDeployBlueGreenHookProps.Builder =
      CfnCodeDeployBlueGreenHookProps.builder()

  private val _applications: MutableList<CfnCodeDeployBlueGreenApplication> = mutableListOf()

  /**
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
   * @param additionalOptions Additional options for the blue/green deployment.
   */
  public fun additionalOptions(additionalOptions: CfnCodeDeployBlueGreenAdditionalOptions) {
    cdkBuilder.additionalOptions(additionalOptions)
  }

  /**
   * @param applications Properties of the Amazon ECS applications being deployed. 
   */
  public fun applications(applications: CfnCodeDeployBlueGreenApplicationDsl.() -> Unit) {
    _applications.add(CfnCodeDeployBlueGreenApplicationDsl().apply(applications).build())
  }

  /**
   * @param applications Properties of the Amazon ECS applications being deployed. 
   */
  public fun applications(applications: Collection<CfnCodeDeployBlueGreenApplication>) {
    _applications.addAll(applications)
  }

  /**
   * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
   * CodeDeploy can call to validate a deployment.
   * You can use the same function or a different one for deployment lifecycle events.
   * Following completion of the validation tests,
   * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
   * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
   */
  public
      fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooksDsl.() -> Unit
      = {}) {
    val builder = CfnCodeDeployBlueGreenLifecycleEventHooksDsl()
    builder.apply(lifecycleEventHooks)
    cdkBuilder.lifecycleEventHooks(builder.build())
  }

  /**
   * @param lifecycleEventHooks Use lifecycle event hooks to specify a Lambda function that
   * CodeDeploy can call to validate a deployment.
   * You can use the same function or a different one for deployment lifecycle events.
   * Following completion of the validation tests,
   * the Lambda `CfnCodeDeployBlueGreenLifecycleEventHooks.afterAllowTraffic`
   * function calls back CodeDeploy and delivers a result of 'Succeeded' or 'Failed'.
   */
  public fun lifecycleEventHooks(lifecycleEventHooks: CfnCodeDeployBlueGreenLifecycleEventHooks) {
    cdkBuilder.lifecycleEventHooks(lifecycleEventHooks)
  }

  /**
   * @param serviceRole The IAM Role for CloudFormation to use to perform blue-green deployments. 
   */
  public fun serviceRole(serviceRole: String) {
    cdkBuilder.serviceRole(serviceRole)
  }

  /**
   * @param trafficRoutingConfig Traffic routing configuration settings.
   */
  public fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfigDsl.() -> Unit =
      {}) {
    val builder = CfnTrafficRoutingConfigDsl()
    builder.apply(trafficRoutingConfig)
    cdkBuilder.trafficRoutingConfig(builder.build())
  }

  /**
   * @param trafficRoutingConfig Traffic routing configuration settings.
   */
  public fun trafficRoutingConfig(trafficRoutingConfig: CfnTrafficRoutingConfig) {
    cdkBuilder.trafficRoutingConfig(trafficRoutingConfig)
  }

  public fun build(): CfnCodeDeployBlueGreenHookProps {
    if(_applications.isNotEmpty()) cdkBuilder.applications(_applications)
    return cdkBuilder.build()
  }
}
