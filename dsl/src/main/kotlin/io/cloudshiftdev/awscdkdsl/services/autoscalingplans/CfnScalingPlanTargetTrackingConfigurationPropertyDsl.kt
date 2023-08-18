@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.autoscalingplans

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

/**
 * `TargetTrackingConfiguration` is a subproperty of
 * [ScalingInstruction](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html)
 * that specifies a target tracking configuration to use with AWS Auto Scaling ( Auto Scaling Plans
 * ).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscalingplans.*;
 * TargetTrackingConfigurationProperty targetTrackingConfigurationProperty =
 * TargetTrackingConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .customizedScalingMetricSpecification(CustomizedScalingMetricSpecificationProperty.builder()
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
 * .estimatedInstanceWarmup(123)
 * .predefinedScalingMetricSpecification(PredefinedScalingMetricSpecificationProperty.builder()
 * .predefinedScalingMetricType("predefinedScalingMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-targettrackingconfiguration.html)
 */
@CdkDslMarker
public class CfnScalingPlanTargetTrackingConfigurationPropertyDsl {
    private val cdkBuilder: CfnScalingPlan.TargetTrackingConfigurationProperty.Builder =
        CfnScalingPlan.TargetTrackingConfigurationProperty.builder()

    /**
     * @param customizedScalingMetricSpecification A customized metric. You can specify either a
     *   predefined metric or a customized metric.
     */
    public fun customizedScalingMetricSpecification(
        customizedScalingMetricSpecification: IResolvable
    ) {
        cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification)
    }

    /**
     * @param customizedScalingMetricSpecification A customized metric. You can specify either a
     *   predefined metric or a customized metric.
     */
    public fun customizedScalingMetricSpecification(
        customizedScalingMetricSpecification:
            CfnScalingPlan.CustomizedScalingMetricSpecificationProperty
    ) {
        cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification)
    }

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
     *   disabled. If the value is `true` , scale in is disabled and the target tracking scaling
     *   policy doesn't remove capacity from the scalable resource. Otherwise, scale in is enabled
     *   and the target tracking scaling policy can remove capacity from the scalable resource.
     *
     * The default value is `false` .
     */
    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
     *   disabled. If the value is `true` , scale in is disabled and the target tracking scaling
     *   policy doesn't remove capacity from the scalable resource. Otherwise, scale in is enabled
     *   and the target tracking scaling policy can remove capacity from the scalable resource.
     *
     * The default value is `false` .
     */
    public fun disableScaleIn(disableScaleIn: IResolvable) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param estimatedInstanceWarmup The estimated time, in seconds, until a newly launched
     *   instance can contribute to the CloudWatch metrics. This value is used only if the resource
     *   is an Auto Scaling group.
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
        cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
    }

    /**
     * @param predefinedScalingMetricSpecification A predefined metric. You can specify either a
     *   predefined metric or a customized metric.
     */
    public fun predefinedScalingMetricSpecification(
        predefinedScalingMetricSpecification: IResolvable
    ) {
        cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification)
    }

    /**
     * @param predefinedScalingMetricSpecification A predefined metric. You can specify either a
     *   predefined metric or a customized metric.
     */
    public fun predefinedScalingMetricSpecification(
        predefinedScalingMetricSpecification:
            CfnScalingPlan.PredefinedScalingMetricSpecificationProperty
    ) {
        cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification)
    }

    /**
     * @param scaleInCooldown The amount of time, in seconds, after a scale-in activity completes
     *   before another scale in activity can start. This value is not used if the scalable resource
     *   is an Auto Scaling group.
     */
    public fun scaleInCooldown(scaleInCooldown: Number) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    /**
     * @param scaleOutCooldown The amount of time, in seconds, after a scale-out activity completes
     *   before another scale-out activity can start. This value is not used if the scalable
     *   resource is an Auto Scaling group.
     */
    public fun scaleOutCooldown(scaleOutCooldown: Number) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    /**
     * @param targetValue The target value for the metric. Although this property accepts numbers of
     *   type Double, it won't accept values that are either too small or too large. Values must be
     *   in the range of -2^360 to 2^360.
     */
    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): CfnScalingPlan.TargetTrackingConfigurationProperty = cdkBuilder.build()
}
