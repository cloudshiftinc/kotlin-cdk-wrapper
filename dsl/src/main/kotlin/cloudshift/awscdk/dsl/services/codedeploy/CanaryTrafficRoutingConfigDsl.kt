@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig

@CdkDslMarker
public class CanaryTrafficRoutingConfigDsl {
  private val cdkBuilder: CanaryTrafficRoutingConfig.Builder = CanaryTrafficRoutingConfig.builder()

  public fun canaryInterval(canaryInterval: Number) {
    cdkBuilder.canaryInterval(canaryInterval)
  }

  public fun canaryPercentage(canaryPercentage: Number) {
    cdkBuilder.canaryPercentage(canaryPercentage)
  }

  public fun build(): CanaryTrafficRoutingConfig = cdkBuilder.build()
}
