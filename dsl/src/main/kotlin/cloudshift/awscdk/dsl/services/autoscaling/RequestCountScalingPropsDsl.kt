@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.RequestCountScalingProps

@CdkDslMarker
public class RequestCountScalingPropsDsl {
  private val cdkBuilder: RequestCountScalingProps.Builder = RequestCountScalingProps.builder()

  public fun cooldown(cooldown: Duration) {
    cdkBuilder.cooldown(cooldown)
  }

  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
    cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
  }

  public fun targetRequestsPerMinute(targetRequestsPerMinute: Number) {
    cdkBuilder.targetRequestsPerMinute(targetRequestsPerMinute)
  }

  public fun build(): RequestCountScalingProps = cdkBuilder.build()
}
