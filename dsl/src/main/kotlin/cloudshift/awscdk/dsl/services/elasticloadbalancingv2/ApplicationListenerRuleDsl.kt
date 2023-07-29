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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition
import software.constructs.Construct

/**
 * Define a new listener rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * ApplicationListener applicationListener;
 * ApplicationTargetGroup applicationTargetGroup;
 * ListenerAction listenerAction;
 * ListenerCondition listenerCondition;
 * ApplicationListenerRule applicationListenerRule = ApplicationListenerRule.Builder.create(this,
 * "MyApplicationListenerRule")
 * .listener(applicationListener)
 * .priority(123)
 * // the properties below are optional
 * .action(listenerAction)
 * .conditions(List.of(listenerCondition))
 * .targetGroups(List.of(applicationTargetGroup))
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationListenerRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ApplicationListenerRule.Builder =
        ApplicationListenerRule.Builder.create(scope, id)

    private val _conditions: MutableList<ListenerCondition> = mutableListOf()

    private val _targetGroups: MutableList<IApplicationTargetGroup> = mutableListOf()

    /**
     * Action to perform when requests are received.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Default: - No action
     *
     * @param action Action to perform when requests are received.
     */
    public fun action(action: ListenerAction) {
        cdkBuilder.action(action)
    }

    /**
     * Rule applies if matches the conditions.
     *
     * Default: - No conditions.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)
     *
     * @param conditions Rule applies if matches the conditions.
     */
    public fun conditions(vararg conditions: ListenerCondition) {
        _conditions.addAll(listOf(*conditions))
    }

    /**
     * Rule applies if matches the conditions.
     *
     * Default: - No conditions.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)
     *
     * @param conditions Rule applies if matches the conditions.
     */
    public fun conditions(conditions: Collection<ListenerCondition>) {
        _conditions.addAll(conditions)
    }

    /**
     * The listener to attach the rule to.
     *
     * @param listener The listener to attach the rule to.
     */
    public fun listener(listener: IApplicationListener) {
        cdkBuilder.listener(listener)
    }

    /**
     * Priority of the rule.
     *
     * The rule with the lowest priority will be used for every request.
     *
     * Priorities must be unique.
     *
     * @param priority Priority of the rule.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /**
     * Target groups to forward requests to.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     *
     * Default: - No target groups.
     *
     * @param targetGroups Target groups to forward requests to.
     */
    public fun targetGroups(vararg targetGroups: IApplicationTargetGroup) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    /**
     * Target groups to forward requests to.
     *
     * Only one of `action`, `fixedResponse`, `redirectResponse` or `targetGroups` can be specified.
     *
     * Implies a `forward` action.
     *
     * Default: - No target groups.
     *
     * @param targetGroups Target groups to forward requests to.
     */
    public fun targetGroups(targetGroups: Collection<IApplicationTargetGroup>) {
        _targetGroups.addAll(targetGroups)
    }

    public fun build(): ApplicationListenerRule {
        if (_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
