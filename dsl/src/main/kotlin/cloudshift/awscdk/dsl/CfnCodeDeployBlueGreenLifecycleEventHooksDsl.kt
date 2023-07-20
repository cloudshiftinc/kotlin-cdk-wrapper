@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks

@CdkDslMarker
public class CfnCodeDeployBlueGreenLifecycleEventHooksDsl {
  private val cdkBuilder: CfnCodeDeployBlueGreenLifecycleEventHooks.Builder =
      CfnCodeDeployBlueGreenLifecycleEventHooks.builder()

  public fun afterAllowTestTraffic(afterAllowTestTraffic: String) {
    cdkBuilder.afterAllowTestTraffic(afterAllowTestTraffic)
  }

  public fun afterAllowTraffic(afterAllowTraffic: String) {
    cdkBuilder.afterAllowTraffic(afterAllowTraffic)
  }

  public fun afterInstall(afterInstall: String) {
    cdkBuilder.afterInstall(afterInstall)
  }

  public fun beforeAllowTraffic(beforeAllowTraffic: String) {
    cdkBuilder.beforeAllowTraffic(beforeAllowTraffic)
  }

  public fun beforeInstall(beforeInstall: String) {
    cdkBuilder.beforeInstall(beforeInstall)
  }

  public fun build(): CfnCodeDeployBlueGreenLifecycleEventHooks = cdkBuilder.build()
}
