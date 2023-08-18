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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes

/**
 * Properties to reference an existing target group.
 *
 * Example:
 * ```
 * Stack stack;
 * IApplicationTargetGroup targetGroup = ApplicationTargetGroup.fromTargetGroupAttributes(this,
 * "MyTargetGroup", TargetGroupAttributes.builder()
 * .targetGroupArn(Fn.importValue("TargetGroupArn"))
 * .loadBalancerArns(Fn.importValue("LoadBalancerArn"))
 * .build());
 * IApplicationTargetGroupMetrics targetGroupMetrics = targetGroup.getMetrics();
 * ```
 */
@CdkDslMarker
public class TargetGroupAttributesDsl {
    private val cdkBuilder: TargetGroupAttributes.Builder = TargetGroupAttributes.builder()

    /**
     * @param loadBalancerArns A Token representing the list of ARNs for the load balancer routing
     *   to this target group.
     */
    public fun loadBalancerArns(loadBalancerArns: String) {
        cdkBuilder.loadBalancerArns(loadBalancerArns)
    }

    /** @param targetGroupArn ARN of the target group. */
    public fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
    }

    public fun build(): TargetGroupAttributes = cdkBuilder.build()
}
