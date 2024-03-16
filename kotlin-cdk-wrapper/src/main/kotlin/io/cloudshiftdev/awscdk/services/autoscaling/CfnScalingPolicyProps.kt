@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnScalingPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * CfnScalingPolicyProps cfnScalingPolicyProps = CfnScalingPolicyProps.builder()
 * .autoScalingGroupName("autoScalingGroupName")
 * // the properties below are optional
 * .adjustmentType("adjustmentType")
 * .cooldown("cooldown")
 * .estimatedInstanceWarmup(123)
 * .metricAggregationType("metricAggregationType")
 * .minAdjustmentMagnitude(123)
 * .policyType("policyType")
 * .predictiveScalingConfiguration(PredictiveScalingConfigurationProperty.builder()
 * .metricSpecifications(List.of(PredictiveScalingMetricSpecificationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .customizedCapacityMetricSpecification(PredictiveScalingCustomizedCapacityMetricProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .customizedLoadMetricSpecification(PredictiveScalingCustomizedLoadMetricProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .customizedScalingMetricSpecification(PredictiveScalingCustomizedScalingMetricProperty.builder()
 * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .predefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .predefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .predefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .build()))
 * // the properties below are optional
 * .maxCapacityBreachBehavior("maxCapacityBreachBehavior")
 * .maxCapacityBuffer(123)
 * .mode("mode")
 * .schedulingBufferTime(123)
 * .build())
 * .scalingAdjustment(123)
 * .stepAdjustments(List.of(StepAdjustmentProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .metricIntervalLowerBound(123)
 * .metricIntervalUpperBound(123)
 * .build()))
 * .targetTrackingConfiguration(TargetTrackingConfigurationProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html)
 */
public interface CfnScalingPolicyProps {
  /**
   * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a
   * percentage).
   *
   * The valid values are `ChangeInCapacity` , `ExactCapacity` , and `PercentChangeInCapacity` .
   *
   * Required if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
   * [Scaling adjustment
   * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-adjustmenttype)
   */
  public fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

  /**
   * The name of the Auto Scaling group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-autoscalinggroupname)
   */
  public fun autoScalingGroupName(): String

  /**
   * A cooldown period, in seconds, that applies to a specific simple scaling policy.
   *
   * When a cooldown period is specified here, it overrides the default cooldown.
   *
   * Valid only if the policy type is `SimpleScaling` . For more information, see [Scaling cooldowns
   * for Amazon EC2 Auto Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   * Default: None
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-cooldown)
   */
  public fun cooldown(): String? = unwrap(this).getCooldown()

  /**
   * *Not needed if the default instance warmup is defined for the group.*.
   *
   * The estimated time, in seconds, until a newly launched instance can contribute to the
   * CloudWatch metrics. This warm-up period applies to instances launched due to a specific target
   * tracking or step scaling policy. When a warm-up period is specified here, it overrides the default
   * instance warmup.
   *
   * Valid only if the policy type is `TargetTrackingScaling` or `StepScaling` .
   *
   *
   * The default is to use the value for the default instance warmup defined for the group. If
   * default instance warmup is null, then `EstimatedInstanceWarmup` falls back to the value of default
   * cooldown.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-estimatedinstancewarmup)
   */
  public fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

  /**
   * The aggregation type for the CloudWatch metrics.
   *
   * The valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null,
   * the value is treated as `Average` .
   *
   * Valid only if the policy type is `StepScaling` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-metricaggregationtype)
   */
  public fun metricAggregationType(): String? = unwrap(this).getMetricAggregationType()

  /**
   * The minimum value to scale by when the adjustment type is `PercentChangeInCapacity` .
   *
   * For example, suppose that you create a step scaling policy to scale out an Auto Scaling group
   * by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the group has 4 instances and
   * the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a
   * `MinAdjustmentMagnitude` of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances.
   *
   * Valid only if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
   * [Scaling adjustment
   * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
   * in the *Amazon EC2 Auto Scaling User Guide* .
   *
   *
   * Some Auto Scaling groups use instance weights. In this case, set the `MinAdjustmentMagnitude`
   * to a value that is at least as large as your largest instance weight.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-minadjustmentmagnitude)
   */
  public fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

  /**
   * One of the following policy types:.
   *
   * * `TargetTrackingScaling`
   * * `StepScaling`
   * * `SimpleScaling` (default)
   * * `PredictiveScaling`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-policytype)
   */
  public fun policyType(): String? = unwrap(this).getPolicyType()

  /**
   * A predictive scaling policy. Provides support for predefined and custom metrics.
   *
   * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
   * request count.
   *
   * Required if the policy type is `PredictiveScaling` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration)
   */
  public fun predictiveScalingConfiguration(): Any? =
      unwrap(this).getPredictiveScalingConfiguration()

  /**
   * The amount by which to scale, based on the specified adjustment type.
   *
   * A positive value adds to the current capacity while a negative number removes from the current
   * capacity. For exact capacity, you must specify a non-negative value.
   *
   * Required if the policy type is `SimpleScaling` . (Not used with any other policy type.)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-scalingadjustment)
   */
  public fun scalingAdjustment(): Number? = unwrap(this).getScalingAdjustment()

  /**
   * A set of adjustments that enable you to scale based on the size of the alarm breach.
   *
   * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-stepadjustments)
   */
  public fun stepAdjustments(): Any? = unwrap(this).getStepAdjustments()

  /**
   * A target tracking scaling policy. Provides support for predefined or custom metrics.
   *
   * The following predefined metrics are available:
   *
   * * `ASGAverageCPUUtilization`
   * * `ASGAverageNetworkIn`
   * * `ASGAverageNetworkOut`
   * * `ALBRequestCountPerTarget`
   *
   * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the `ResourceLabel`
   * property with the `PredefinedMetricSpecification` .
   *
   * Required if the policy type is `TargetTrackingScaling` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
   */
  public fun targetTrackingConfiguration(): Any? = unwrap(this).getTargetTrackingConfiguration()

  /**
   * A builder for [CfnScalingPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adjustmentType Specifies how the scaling adjustment is interpreted (for example, an
     * absolute number or a percentage).
     * The valid values are `ChangeInCapacity` , `ExactCapacity` , and `PercentChangeInCapacity` .
     *
     * Required if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
     * [Scaling adjustment
     * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    public fun adjustmentType(adjustmentType: String)

    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * @param cooldown A cooldown period, in seconds, that applies to a specific simple scaling
     * policy.
     * When a cooldown period is specified here, it overrides the default cooldown.
     *
     * Valid only if the policy type is `SimpleScaling` . For more information, see [Scaling
     * cooldowns for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * Default: None
     */
    public fun cooldown(cooldown: String)

    /**
     * @param estimatedInstanceWarmup *Not needed if the default instance warmup is defined for the
     * group.*.
     * The estimated time, in seconds, until a newly launched instance can contribute to the
     * CloudWatch metrics. This warm-up period applies to instances launched due to a specific target
     * tracking or step scaling policy. When a warm-up period is specified here, it overrides the
     * default instance warmup.
     *
     * Valid only if the policy type is `TargetTrackingScaling` or `StepScaling` .
     *
     *
     * The default is to use the value for the default instance warmup defined for the group. If
     * default instance warmup is null, then `EstimatedInstanceWarmup` falls back to the value of
     * default cooldown.
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number)

    /**
     * @param metricAggregationType The aggregation type for the CloudWatch metrics.
     * The valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null,
     * the value is treated as `Average` .
     *
     * Valid only if the policy type is `StepScaling` .
     */
    public fun metricAggregationType(metricAggregationType: String)

    /**
     * @param minAdjustmentMagnitude The minimum value to scale by when the adjustment type is
     * `PercentChangeInCapacity` .
     * For example, suppose that you create a step scaling policy to scale out an Auto Scaling group
     * by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the group has 4 instances and
     * the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a
     * `MinAdjustmentMagnitude` of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances.
     *
     * Valid only if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
     * [Scaling adjustment
     * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     *
     * Some Auto Scaling groups use instance weights. In this case, set the `MinAdjustmentMagnitude`
     * to a value that is at least as large as your largest instance weight.
     */
    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number)

    /**
     * @param policyType One of the following policy types:.
     * * `TargetTrackingScaling`
     * * `StepScaling`
     * * `SimpleScaling` (default)
     * * `PredictiveScaling`
     */
    public fun policyType(policyType: String)

    /**
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics.
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     */
    public fun predictiveScalingConfiguration(predictiveScalingConfiguration: IResolvable)

    /**
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics.
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     */
    public
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: CfnScalingPolicy.PredictiveScalingConfigurationProperty)

    /**
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics.
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab94936888fe70631b90b42e78e604c81cf705303f9135f846552afef85e6452")
    public
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param scalingAdjustment The amount by which to scale, based on the specified adjustment
     * type.
     * A positive value adds to the current capacity while a negative number removes from the
     * current capacity. For exact capacity, you must specify a non-negative value.
     *
     * Required if the policy type is `SimpleScaling` . (Not used with any other policy type.)
     */
    public fun scalingAdjustment(scalingAdjustment: Number)

    /**
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     */
    public fun stepAdjustments(stepAdjustments: IResolvable)

    /**
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     */
    public fun stepAdjustments(stepAdjustments: List<Any>)

    /**
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     */
    public fun stepAdjustments(vararg stepAdjustments: Any)

    /**
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics.
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     */
    public fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable)

    /**
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics.
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     */
    public
        fun targetTrackingConfiguration(targetTrackingConfiguration: CfnScalingPolicy.TargetTrackingConfigurationProperty)

    /**
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics.
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a7fc8a719a21938b06d0cbe381769126e7e6c3611c0a8f3f8c0e28042755a89")
    public
        fun targetTrackingConfiguration(targetTrackingConfiguration: CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps.builder()

    /**
     * @param adjustmentType Specifies how the scaling adjustment is interpreted (for example, an
     * absolute number or a percentage).
     * The valid values are `ChangeInCapacity` , `ExactCapacity` , and `PercentChangeInCapacity` .
     *
     * Required if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
     * [Scaling adjustment
     * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     */
    override fun adjustmentType(adjustmentType: String) {
      cdkBuilder.adjustmentType(adjustmentType)
    }

    /**
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * @param cooldown A cooldown period, in seconds, that applies to a specific simple scaling
     * policy.
     * When a cooldown period is specified here, it overrides the default cooldown.
     *
     * Valid only if the policy type is `SimpleScaling` . For more information, see [Scaling
     * cooldowns for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * Default: None
     */
    override fun cooldown(cooldown: String) {
      cdkBuilder.cooldown(cooldown)
    }

    /**
     * @param estimatedInstanceWarmup *Not needed if the default instance warmup is defined for the
     * group.*.
     * The estimated time, in seconds, until a newly launched instance can contribute to the
     * CloudWatch metrics. This warm-up period applies to instances launched due to a specific target
     * tracking or step scaling policy. When a warm-up period is specified here, it overrides the
     * default instance warmup.
     *
     * Valid only if the policy type is `TargetTrackingScaling` or `StepScaling` .
     *
     *
     * The default is to use the value for the default instance warmup defined for the group. If
     * default instance warmup is null, then `EstimatedInstanceWarmup` falls back to the value of
     * default cooldown.
     */
    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
    }

    /**
     * @param metricAggregationType The aggregation type for the CloudWatch metrics.
     * The valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null,
     * the value is treated as `Average` .
     *
     * Valid only if the policy type is `StepScaling` .
     */
    override fun metricAggregationType(metricAggregationType: String) {
      cdkBuilder.metricAggregationType(metricAggregationType)
    }

    /**
     * @param minAdjustmentMagnitude The minimum value to scale by when the adjustment type is
     * `PercentChangeInCapacity` .
     * For example, suppose that you create a step scaling policy to scale out an Auto Scaling group
     * by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the group has 4 instances and
     * the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a
     * `MinAdjustmentMagnitude` of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances.
     *
     * Valid only if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
     * [Scaling adjustment
     * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     *
     * Some Auto Scaling groups use instance weights. In this case, set the `MinAdjustmentMagnitude`
     * to a value that is at least as large as your largest instance weight.
     */
    override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
      cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    /**
     * @param policyType One of the following policy types:.
     * * `TargetTrackingScaling`
     * * `StepScaling`
     * * `SimpleScaling` (default)
     * * `PredictiveScaling`
     */
    override fun policyType(policyType: String) {
      cdkBuilder.policyType(policyType)
    }

    /**
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics.
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     */
    override fun predictiveScalingConfiguration(predictiveScalingConfiguration: IResolvable) {
      cdkBuilder.predictiveScalingConfiguration(predictiveScalingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics.
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     */
    override
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: CfnScalingPolicy.PredictiveScalingConfigurationProperty) {
      cdkBuilder.predictiveScalingConfiguration(predictiveScalingConfiguration.let(CfnScalingPolicy.PredictiveScalingConfigurationProperty::unwrap))
    }

    /**
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics.
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab94936888fe70631b90b42e78e604c81cf705303f9135f846552afef85e6452")
    override
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        predictiveScalingConfiguration(CfnScalingPolicy.PredictiveScalingConfigurationProperty(predictiveScalingConfiguration))

    /**
     * @param scalingAdjustment The amount by which to scale, based on the specified adjustment
     * type.
     * A positive value adds to the current capacity while a negative number removes from the
     * current capacity. For exact capacity, you must specify a non-negative value.
     *
     * Required if the policy type is `SimpleScaling` . (Not used with any other policy type.)
     */
    override fun scalingAdjustment(scalingAdjustment: Number) {
      cdkBuilder.scalingAdjustment(scalingAdjustment)
    }

    /**
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     */
    override fun stepAdjustments(stepAdjustments: IResolvable) {
      cdkBuilder.stepAdjustments(stepAdjustments.let(IResolvable::unwrap))
    }

    /**
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     */
    override fun stepAdjustments(stepAdjustments: List<Any>) {
      cdkBuilder.stepAdjustments(stepAdjustments)
    }

    /**
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     */
    override fun stepAdjustments(vararg stepAdjustments: Any): Unit =
        stepAdjustments(stepAdjustments.toList())

    /**
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics.
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     */
    override fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable) {
      cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics.
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     */
    override
        fun targetTrackingConfiguration(targetTrackingConfiguration: CfnScalingPolicy.TargetTrackingConfigurationProperty) {
      cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(CfnScalingPolicy.TargetTrackingConfigurationProperty::unwrap))
    }

    /**
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics.
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a7fc8a719a21938b06d0cbe381769126e7e6c3611c0a8f3f8c0e28042755a89")
    override
        fun targetTrackingConfiguration(targetTrackingConfiguration: CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder.() -> Unit):
        Unit =
        targetTrackingConfiguration(CfnScalingPolicy.TargetTrackingConfigurationProperty(targetTrackingConfiguration))

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps,
  ) : CdkObject(cdkObject), CfnScalingPolicyProps {
    /**
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a
     * percentage).
     *
     * The valid values are `ChangeInCapacity` , `ExactCapacity` , and `PercentChangeInCapacity` .
     *
     * Required if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
     * [Scaling adjustment
     * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-adjustmenttype)
     */
    override fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-autoscalinggroupname)
     */
    override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

    /**
     * A cooldown period, in seconds, that applies to a specific simple scaling policy.
     *
     * When a cooldown period is specified here, it overrides the default cooldown.
     *
     * Valid only if the policy type is `SimpleScaling` . For more information, see [Scaling
     * cooldowns for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * Default: None
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-cooldown)
     */
    override fun cooldown(): String? = unwrap(this).getCooldown()

    /**
     * *Not needed if the default instance warmup is defined for the group.*.
     *
     * The estimated time, in seconds, until a newly launched instance can contribute to the
     * CloudWatch metrics. This warm-up period applies to instances launched due to a specific target
     * tracking or step scaling policy. When a warm-up period is specified here, it overrides the
     * default instance warmup.
     *
     * Valid only if the policy type is `TargetTrackingScaling` or `StepScaling` .
     *
     *
     * The default is to use the value for the default instance warmup defined for the group. If
     * default instance warmup is null, then `EstimatedInstanceWarmup` falls back to the value of
     * default cooldown.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-estimatedinstancewarmup)
     */
    override fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

    /**
     * The aggregation type for the CloudWatch metrics.
     *
     * The valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null,
     * the value is treated as `Average` .
     *
     * Valid only if the policy type is `StepScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-metricaggregationtype)
     */
    override fun metricAggregationType(): String? = unwrap(this).getMetricAggregationType()

    /**
     * The minimum value to scale by when the adjustment type is `PercentChangeInCapacity` .
     *
     * For example, suppose that you create a step scaling policy to scale out an Auto Scaling group
     * by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the group has 4 instances and
     * the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a
     * `MinAdjustmentMagnitude` of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances.
     *
     * Valid only if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
     * [Scaling adjustment
     * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     *
     * Some Auto Scaling groups use instance weights. In this case, set the `MinAdjustmentMagnitude`
     * to a value that is at least as large as your largest instance weight.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-minadjustmentmagnitude)
     */
    override fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

    /**
     * One of the following policy types:.
     *
     * * `TargetTrackingScaling`
     * * `StepScaling`
     * * `SimpleScaling` (default)
     * * `PredictiveScaling`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-policytype)
     */
    override fun policyType(): String? = unwrap(this).getPolicyType()

    /**
     * A predictive scaling policy. Provides support for predefined and custom metrics.
     *
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration)
     */
    override fun predictiveScalingConfiguration(): Any? =
        unwrap(this).getPredictiveScalingConfiguration()

    /**
     * The amount by which to scale, based on the specified adjustment type.
     *
     * A positive value adds to the current capacity while a negative number removes from the
     * current capacity. For exact capacity, you must specify a non-negative value.
     *
     * Required if the policy type is `SimpleScaling` . (Not used with any other policy type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-scalingadjustment)
     */
    override fun scalingAdjustment(): Number? = unwrap(this).getScalingAdjustment()

    /**
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     *
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-stepadjustments)
     */
    override fun stepAdjustments(): Any? = unwrap(this).getStepAdjustments()

    /**
     * A target tracking scaling policy. Provides support for predefined or custom metrics.
     *
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
     */
    override fun targetTrackingConfiguration(): Any? = unwrap(this).getTargetTrackingConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps):
        CfnScalingPolicyProps = CdkObjectWrappers.wrap(cdkObject) as CfnScalingPolicyProps

    internal fun unwrap(wrapped: CfnScalingPolicyProps):
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps
  }
}
