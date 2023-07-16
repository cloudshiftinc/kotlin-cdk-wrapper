@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.NetworkUtilizationScalingProps

@CdkDslMarker
public class NetworkUtilizationScalingPropsDsl {
  private val cdkBuilder: NetworkUtilizationScalingProps.Builder =
      NetworkUtilizationScalingProps.builder()

  public fun cooldown(cooldown: Duration) {
    cdkBuilder.cooldown(cooldown)
  }

  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
    cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
  }

  public fun targetBytesPerSecond(targetBytesPerSecond: Number) {
    cdkBuilder.targetBytesPerSecond(targetBytesPerSecond)
  }

  public fun build(): NetworkUtilizationScalingProps = cdkBuilder.build()
}
