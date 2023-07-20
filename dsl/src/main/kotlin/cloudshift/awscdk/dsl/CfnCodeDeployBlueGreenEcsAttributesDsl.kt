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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes
import software.amazon.awscdk.CfnTrafficRouting
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCodeDeployBlueGreenEcsAttributesDsl {
    private val cdkBuilder: CfnCodeDeployBlueGreenEcsAttributes.Builder =
        CfnCodeDeployBlueGreenEcsAttributes.builder()

    private val _taskDefinitions: MutableList<String> = mutableListOf()

    private val _taskSets: MutableList<String> = mutableListOf()

    public fun taskDefinitions(vararg taskDefinitions: String) {
        _taskDefinitions.addAll(listOf(*taskDefinitions))
    }

    public fun taskDefinitions(taskDefinitions: Collection<String>) {
        _taskDefinitions.addAll(taskDefinitions)
    }

    public fun taskSets(vararg taskSets: String) {
        _taskSets.addAll(listOf(*taskSets))
    }

    public fun taskSets(taskSets: Collection<String>) {
        _taskSets.addAll(taskSets)
    }

    public fun trafficRouting(block: CfnTrafficRoutingDsl.() -> Unit = {}) {
        val builder = CfnTrafficRoutingDsl()
        builder.apply(block)
        cdkBuilder.trafficRouting(builder.build())
    }

    public fun trafficRouting(trafficRouting: CfnTrafficRouting) {
        cdkBuilder.trafficRouting(trafficRouting)
    }

    public fun build(): CfnCodeDeployBlueGreenEcsAttributes {
        if (_taskDefinitions.isNotEmpty()) cdkBuilder.taskDefinitions(_taskDefinitions)
        if (_taskSets.isNotEmpty()) cdkBuilder.taskSets(_taskSets)
        return cdkBuilder.build()
    }
}
