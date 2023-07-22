@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks

/**
 * Lifecycle events for blue-green deployments.
 *
 * The type of the `CfnCodeDeployBlueGreenHookProps.lifecycleEventHooks` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnCodeDeployBlueGreenLifecycleEventHooks cfnCodeDeployBlueGreenLifecycleEventHooks =
 * CfnCodeDeployBlueGreenLifecycleEventHooks.builder()
 * .afterAllowTestTraffic("afterAllowTestTraffic")
 * .afterAllowTraffic("afterAllowTraffic")
 * .afterInstall("afterInstall")
 * .beforeAllowTraffic("beforeAllowTraffic")
 * .beforeInstall("beforeInstall")
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnCodeDeployBlueGreenLifecycleEventHooksDsl {
  private val cdkBuilder: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder =
      CfnCodeDeployBlueGreenLifecycleEventHooks.builder()

  /**
   * @param afterAllowTestTraffic Function to use to run tasks after the test listener serves
   * traffic to the replacement task set.
   */
  public fun afterAllowTestTraffic(afterAllowTestTraffic: String) {
    cdkBuilder.afterAllowTestTraffic(afterAllowTestTraffic)
  }

  /**
   * @param afterAllowTraffic Function to use to run tasks after the second target group serves
   * traffic to the replacement task set.
   */
  public fun afterAllowTraffic(afterAllowTraffic: String) {
    cdkBuilder.afterAllowTraffic(afterAllowTraffic)
  }

  /**
   * @param afterInstall Function to use to run tasks after the replacement task set is created and
   * one of the target groups is associated with it.
   */
  public fun afterInstall(afterInstall: String) {
    cdkBuilder.afterInstall(afterInstall)
  }

  /**
   * @param beforeAllowTraffic Function to use to run tasks after the second target group is
   * associated with the replacement task set, but before traffic is shifted to the replacement task
   * set.
   */
  public fun beforeAllowTraffic(beforeAllowTraffic: String) {
    cdkBuilder.beforeAllowTraffic(beforeAllowTraffic)
  }

  /**
   * @param beforeInstall Function to use to run tasks before the replacement task set is created.
   */
  public fun beforeInstall(beforeInstall: String) {
    cdkBuilder.beforeInstall(beforeInstall)
  }

  public fun build(): CfnCodeDeployBlueGreenLifecycleEventHooks = cdkBuilder.build()
}
