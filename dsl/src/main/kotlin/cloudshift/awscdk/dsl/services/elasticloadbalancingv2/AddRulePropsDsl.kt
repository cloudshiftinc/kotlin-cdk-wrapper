@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AddRulePropsDsl {
    private val cdkBuilder: AddRuleProps.Builder = AddRuleProps.builder()

    private val _conditions: MutableList<ListenerCondition> = mutableListOf()

    public fun conditions(vararg conditions: ListenerCondition) {
        _conditions.addAll(listOf(*conditions))
    }

    public fun conditions(conditions: Collection<ListenerCondition>) {
        _conditions.addAll(conditions)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun build(): AddRuleProps {
        if (_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
        return cdkBuilder.build()
    }
}
