@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

/**
 * `TargetTrackingConfiguration` is a property of the
 * [AWS::AutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html)
 * resource that specifies a target tracking scaling policy configuration for Amazon EC2 Auto Scaling.
 *
 * For more information about scaling policies, see [Dynamic
 * scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html) in the
 * *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * TargetTrackingConfigurationProperty targetTrackingConfigurationProperty =
 * TargetTrackingConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html)
 */
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
