@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

/**
 * `TargetTrackingScalingPolicyConfiguration` is a property of the
 * [AWS::ApplicationAutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
 * resource that specifies a target tracking scaling policy configuration for Application Auto Scaling.
 * Use a target tracking scaling policy to adjust the capacity of the specified scalable target in
 * response to actual workloads, so that resource utilization remains at or near the target utilization
 * value.
 *
 * For more information, see [Target tracking scaling
 * policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html)
 * in the *Application Auto Scaling User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * TargetTrackingScalingPolicyConfigurationProperty targetTrackingScalingPolicyConfigurationProperty
 * = TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .customizedMetricSpecification(CustomizedMetricSpecificationProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .statistic("statistic")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build())
 * .disableScaleIn(false)
 * .predefinedMetricSpecification(PredefinedMetricSpecificationProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html)
 */
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
