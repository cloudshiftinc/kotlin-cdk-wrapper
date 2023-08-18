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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Information for creating an action that distributes requests among one or more target groups.
 *
 * For Network Load Balancers, you can specify a single target group. Specify only when `Type` is
 * `forward` . If you specify both `ForwardConfig` and `TargetGroupArn` , you can specify only one
 * target group using `ForwardConfig` and it must be the same target group specified in
 * `TargetGroupArn` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * ForwardConfigProperty forwardConfigProperty = ForwardConfigProperty.builder()
 * .targetGroups(List.of(TargetGroupTupleProperty.builder()
 * .targetGroupArn("targetGroupArn")
 * .weight(123)
 * .build()))
 * .targetGroupStickinessConfig(TargetGroupStickinessConfigProperty.builder()
 * .durationSeconds(123)
 * .enabled(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-forwardconfig.html)
 */
@CdkDslMarker
public class CfnListenerRuleForwardConfigPropertyDsl {
    private val cdkBuilder: CfnListenerRule.ForwardConfigProperty.Builder =
        CfnListenerRule.ForwardConfigProperty.builder()

    private val _targetGroups: MutableList<Any> = mutableListOf()

    /**
     * @param targetGroupStickinessConfig Information about the target group stickiness for a rule.
     */
    public fun targetGroupStickinessConfig(targetGroupStickinessConfig: IResolvable) {
        cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig)
    }

    /**
     * @param targetGroupStickinessConfig Information about the target group stickiness for a rule.
     */
    public fun targetGroupStickinessConfig(
        targetGroupStickinessConfig: CfnListenerRule.TargetGroupStickinessConfigProperty
    ) {
        cdkBuilder.targetGroupStickinessConfig(targetGroupStickinessConfig)
    }

    /**
     * @param targetGroups Information about how traffic will be distributed between multiple target
     *   groups in a forward rule.
     */
    public fun targetGroups(vararg targetGroups: Any) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    /**
     * @param targetGroups Information about how traffic will be distributed between multiple target
     *   groups in a forward rule.
     */
    public fun targetGroups(targetGroups: Collection<Any>) {
        _targetGroups.addAll(targetGroups)
    }

    /**
     * @param targetGroups Information about how traffic will be distributed between multiple target
     *   groups in a forward rule.
     */
    public fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups)
    }

    public fun build(): CfnListenerRule.ForwardConfigProperty {
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
