@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.PredefinedMetric
import software.amazon.awscdk.services.autoscaling.TargetTrackingScalingPolicy
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.constructs.Construct

@CdkDslMarker
public class TargetTrackingScalingPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: TargetTrackingScalingPolicy.Builder =
      TargetTrackingScalingPolicy.Builder.create(scope, id)

  public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    cdkBuilder.autoScalingGroup(autoScalingGroup)
  }

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

  public fun build(): TargetTrackingScalingPolicy = cdkBuilder.build()
}
