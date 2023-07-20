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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleRunCommandParametersPropertyDsl {
    private val cdkBuilder: CfnRule.RunCommandParametersProperty.Builder =
        CfnRule.RunCommandParametersProperty.builder()

    private val _runCommandTargets: MutableList<Any> = mutableListOf()

    public fun runCommandTargets(vararg runCommandTargets: Any) {
        _runCommandTargets.addAll(listOf(*runCommandTargets))
    }

    public fun runCommandTargets(runCommandTargets: Collection<Any>) {
        _runCommandTargets.addAll(runCommandTargets)
    }

    public fun runCommandTargets(runCommandTargets: IResolvable) {
        cdkBuilder.runCommandTargets(runCommandTargets)
    }

    public fun build(): CfnRule.RunCommandParametersProperty {
        if (_runCommandTargets.isNotEmpty()) cdkBuilder.runCommandTargets(_runCommandTargets)
        return cdkBuilder.build()
    }
}
