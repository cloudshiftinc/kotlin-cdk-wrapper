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
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition

/**
 * Properties for adding a new target group to a listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * ApplicationTargetGroup applicationTargetGroup;
 * ListenerCondition listenerCondition;
 * AddApplicationTargetGroupsProps addApplicationTargetGroupsProps =
 * AddApplicationTargetGroupsProps.builder()
 * .targetGroups(List.of(applicationTargetGroup))
 * // the properties below are optional
 * .conditions(List.of(listenerCondition))
 * .priority(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class AddApplicationTargetGroupsPropsDsl {
    private val cdkBuilder: AddApplicationTargetGroupsProps.Builder =
        AddApplicationTargetGroupsProps.builder()

    private val _conditions: MutableList<ListenerCondition> = mutableListOf()

    private val _targetGroups: MutableList<IApplicationTargetGroup> = mutableListOf()

    /** @param conditions Rule applies if matches the conditions. */
    public fun conditions(vararg conditions: ListenerCondition) {
        _conditions.addAll(listOf(*conditions))
    }

    /** @param conditions Rule applies if matches the conditions. */
    public fun conditions(conditions: Collection<ListenerCondition>) {
        _conditions.addAll(conditions)
    }

    /**
     * @param priority Priority of this target group. The rule with the lowest priority will be used
     *   for every request. If priority is not given, these target groups will be added as defaults,
     *   and must not have conditions.
     *
     * Priorities must be unique.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param targetGroups Target groups to forward requests to. */
    public fun targetGroups(vararg targetGroups: IApplicationTargetGroup) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    /** @param targetGroups Target groups to forward requests to. */
    public fun targetGroups(targetGroups: Collection<IApplicationTargetGroup>) {
        _targetGroups.addAll(targetGroups)
    }

    public fun build(): AddApplicationTargetGroupsProps {
        if (_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
