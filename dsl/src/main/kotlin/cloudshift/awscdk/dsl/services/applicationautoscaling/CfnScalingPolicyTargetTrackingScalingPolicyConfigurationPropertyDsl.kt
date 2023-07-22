@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyTargetTrackingScalingPolicyConfigurationPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder
      = CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.builder()

  /**
   * @param customizedMetricSpecification A customized metric.
   * You can specify either a predefined metric or a customized metric.
   */
  public fun customizedMetricSpecification(customizedMetricSpecification: IResolvable) {
    cdkBuilder.customizedMetricSpecification(customizedMetricSpecification)
  }

  /**
   * @param customizedMetricSpecification A customized metric.
   * You can specify either a predefined metric or a customized metric.
   */
  public
      fun customizedMetricSpecification(customizedMetricSpecification: CfnScalingPolicy.CustomizedMetricSpecificationProperty) {
    cdkBuilder.customizedMetricSpecification(customizedMetricSpecification)
  }

  /**
   * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
   * disabled.
   * If the value is `true` , scale in is disabled and the target tracking scaling policy won't
   * remove capacity from the scalable target. Otherwise, scale in is enabled and the target tracking
   * scaling policy can remove capacity from the scalable target. The default value is `false` .
   */
  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  /**
   * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
   * disabled.
   * If the value is `true` , scale in is disabled and the target tracking scaling policy won't
   * remove capacity from the scalable target. Otherwise, scale in is enabled and the target tracking
   * scaling policy can remove capacity from the scalable target. The default value is `false` .
   */
  public fun disableScaleIn(disableScaleIn: IResolvable) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  /**
   * @param predefinedMetricSpecification A predefined metric.
   * You can specify either a predefined metric or a customized metric.
   */
  public fun predefinedMetricSpecification(predefinedMetricSpecification: IResolvable) {
    cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification)
  }

  /**
   * @param predefinedMetricSpecification A predefined metric.
   * You can specify either a predefined metric or a customized metric.
   */
  public
      fun predefinedMetricSpecification(predefinedMetricSpecification: CfnScalingPolicy.PredefinedMetricSpecificationProperty) {
    cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification)
  }

  /**
   * @param scaleInCooldown The amount of time, in seconds, after a scale-in activity completes
   * before another scale-in activity can start.
   * For more information and for default values, see [Define cooldown
   * periods](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html#target-tracking-cooldown)
   * in the *Application Auto Scaling User Guide* .
   */
  public fun scaleInCooldown(scaleInCooldown: Number) {
    cdkBuilder.scaleInCooldown(scaleInCooldown)
  }

  /**
   * @param scaleOutCooldown The amount of time, in seconds, to wait for a previous scale-out
   * activity to take effect.
   * For more information and for default values, see [Define cooldown
   * periods](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html#target-tracking-cooldown)
   * in the *Application Auto Scaling User Guide* .
   */
  public fun scaleOutCooldown(scaleOutCooldown: Number) {
    cdkBuilder.scaleOutCooldown(scaleOutCooldown)
  }

  /**
   * @param targetValue The target value for the metric. 
   * Although this property accepts numbers of type Double, it won't accept values that are either
   * too small or too large. Values must be in the range of -2^360 to 2^360. The value must be a valid
   * number based on the choice of metric. For example, if the metric is CPU utilization, then the
   * target value is a percent value that represents how much of the CPU can be used before scaling
   * out.
   */
  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty =
      cdkBuilder.build()
}
