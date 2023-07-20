@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.BasicTargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.autoscaling.PredefinedMetric
import software.amazon.awscdk.services.cloudwatch.IMetric

@CdkDslMarker
public class BasicTargetTrackingScalingPolicyPropsDsl {
  private val cdkBuilder: BasicTargetTrackingScalingPolicyProps.Builder =
      BasicTargetTrackingScalingPolicyProps.builder()

  public fun cooldown(cooldown: Duration) {
    cdkBuilder.cooldown(cooldown)
  }

  public fun customMetric(customMetric: IMetric) {
    cdkBuilder.customMetric(customMetric)
  }

  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
    cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
  }

  public fun predefinedMetric(predefinedMetric: PredefinedMetric) {
    cdkBuilder.predefinedMetric(predefinedMetric)
  }

  public fun resourceLabel(resourceLabel: String) {
    cdkBuilder.resourceLabel(resourceLabel)
  }

  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): BasicTargetTrackingScalingPolicyProps = cdkBuilder.build()
}
