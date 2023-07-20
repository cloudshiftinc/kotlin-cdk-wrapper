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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class EmrCreateClusterAutoScalingPolicyPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.AutoScalingPolicyProperty.Builder =
        EmrCreateCluster.AutoScalingPolicyProperty.builder()

    private val _rules: MutableList<EmrCreateCluster.ScalingRuleProperty> = mutableListOf()

    public fun constraints(block: EmrCreateClusterScalingConstraintsPropertyDsl.() -> Unit = {}) {
        val builder = EmrCreateClusterScalingConstraintsPropertyDsl()
        builder.apply(block)
        cdkBuilder.constraints(builder.build())
    }

    public fun constraints(constraints: EmrCreateCluster.ScalingConstraintsProperty) {
        cdkBuilder.constraints(constraints)
    }

    public fun rules(rules: EmrCreateClusterScalingRulePropertyDsl.() -> Unit) {
        _rules.add(EmrCreateClusterScalingRulePropertyDsl().apply(rules).build())
    }

    public fun rules(rules: Collection<EmrCreateCluster.ScalingRuleProperty>) {
        _rules.addAll(rules)
    }

    public fun build(): EmrCreateCluster.AutoScalingPolicyProperty {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
