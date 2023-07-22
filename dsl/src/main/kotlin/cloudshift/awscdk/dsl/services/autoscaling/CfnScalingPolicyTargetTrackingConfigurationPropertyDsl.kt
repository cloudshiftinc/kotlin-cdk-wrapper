@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

@CdkDslMarker
public class CfnScalingPolicyTargetTrackingConfigurationPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder =
      CfnScalingPolicy.TargetTrackingConfigurationProperty.builder()

  /**
   * @param customizedMetricSpecification A customized metric.
   * You must specify either a predefined metric or a customized metric.
   */
  public fun customizedMetricSpecification(customizedMetricSpecification: IResolvable) {
    cdkBuilder.customizedMetricSpecification(customizedMetricSpecification)
  }

  /**
   * @param customizedMetricSpecification A customized metric.
   * You must specify either a predefined metric or a customized metric.
   */
  public
      fun customizedMetricSpecification(customizedMetricSpecification: CfnScalingPolicy.CustomizedMetricSpecificationProperty) {
    cdkBuilder.customizedMetricSpecification(customizedMetricSpecification)
  }

  /**
   * @param disableScaleIn Indicates whether scaling in by the target tracking scaling policy is
   * disabled.
   * If scaling in is disabled, the target tracking scaling policy doesn't remove instances from the
   * Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances from the
   * Auto Scaling group. The default is `false` .
   */
  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  /**
   * @param disableScaleIn Indicates whether scaling in by the target tracking scaling policy is
   * disabled.
   * If scaling in is disabled, the target tracking scaling policy doesn't remove instances from the
   * Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances from the
   * Auto Scaling group. The default is `false` .
   */
  public fun disableScaleIn(disableScaleIn: IResolvable) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  /**
   * @param predefinedMetricSpecification A predefined metric.
   * You must specify either a predefined metric or a customized metric.
   */
  public fun predefinedMetricSpecification(predefinedMetricSpecification: IResolvable) {
    cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification)
  }

  /**
   * @param predefinedMetricSpecification A predefined metric.
   * You must specify either a predefined metric or a customized metric.
   */
  public
      fun predefinedMetricSpecification(predefinedMetricSpecification: CfnScalingPolicy.PredefinedMetricSpecificationProperty) {
    cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification)
  }

  /**
   * @param targetValue The target value for the metric. 
   *
   * Some metrics are based on a count instead of a percentage, such as the request count for an
   * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
   * specifies one of these metrics, specify the target utilization as the optimal average request or
   * message count per instance during any one-minute interval.
   */
  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): CfnScalingPolicy.TargetTrackingConfigurationProperty = cdkBuilder.build()
}
