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

package io.cloudshiftdev.awscdkdsl.services.applicationautoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric
import software.amazon.awscdk.services.cloudwatch.IMetric

/**
 * Properties for a Target Tracking policy that include the metric but exclude the target.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Code code;
 * Function handler = Function.Builder.create(this, "MyFunction")
 * .runtime(Runtime.PYTHON_3_7)
 * .handler("index.handler")
 * .code(code)
 * .reservedConcurrentExecutions(2)
 * .build();
 * Version fnVer = handler.getCurrentVersion();
 * ScalableTarget target = ScalableTarget.Builder.create(this, "ScalableTarget")
 * .serviceNamespace(ServiceNamespace.LAMBDA)
 * .maxCapacity(100)
 * .minCapacity(10)
 * .resourceId(String.format("function:%s:%s", handler.getFunctionName(), fnVer.getVersion()))
 * .scalableDimension("lambda:function:ProvisionedConcurrency")
 * .build();
 * target.scaleToTrackMetric("PceTracking", BasicTargetTrackingScalingPolicyProps.builder()
 * .targetValue(0.9)
 * .predefinedMetric(PredefinedMetric.LAMBDA_PROVISIONED_CONCURRENCY_UTILIZATION)
 * .build());
 * ```
 */
@CdkDslMarker
public class BasicTargetTrackingScalingPolicyPropsDsl {
    private val cdkBuilder: BasicTargetTrackingScalingPolicyProps.Builder =
        BasicTargetTrackingScalingPolicyProps.builder()

    /**
     * @param customMetric A custom metric for application autoscaling. The metric must track
     *   utilization. Scaling out will happen if the metric is higher than the target value, scaling
     *   in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     */
    public fun customMetric(customMetric: IMetric) {
        cdkBuilder.customMetric(customMetric)
    }

    /**
     * @param disableScaleIn Indicates whether scale in by the target tracking policy is disabled.
     *   If the value is true, scale in is disabled and the target tracking policy won't remove
     *   capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking
     *   policy can remove capacity from the scalable resource.
     */
    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /** @param policyName A name for the scaling policy. */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * @param predefinedMetric A predefined metric for application autoscaling. The metric must
     *   track utilization. Scaling out will happen if the metric is higher than the target value,
     *   scaling in will happen in the metric is lower than the target value.
     *
     * Exactly one of customMetric or predefinedMetric must be specified.
     */
    public fun predefinedMetric(predefinedMetric: PredefinedMetric) {
        cdkBuilder.predefinedMetric(predefinedMetric)
    }

    /**
     * @param resourceLabel Identify the resource associated with the metric type. Only used for
     *   predefined metric ALBRequestCountPerTarget.
     *
     * Example value:
     * `app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;`
     */
    public fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
    }

    /**
     * @param scaleInCooldown Period after a scale in activity completes before another scale in
     *   activity can start.
     */
    public fun scaleInCooldown(scaleInCooldown: Duration) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    /**
     * @param scaleOutCooldown Period after a scale out activity completes before another scale out
     *   activity can start.
     */
    public fun scaleOutCooldown(scaleOutCooldown: Duration) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    /** @param targetValue The target value for the metric. */
    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): BasicTargetTrackingScalingPolicyProps = cdkBuilder.build()
}
