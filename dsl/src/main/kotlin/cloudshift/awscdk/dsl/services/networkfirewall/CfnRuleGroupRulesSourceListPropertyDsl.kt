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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleGroupRulesSourceListPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RulesSourceListProperty.Builder =
        CfnRuleGroup.RulesSourceListProperty.builder()

    private val _targetTypes: MutableList<String> = mutableListOf()

    private val _targets: MutableList<String> = mutableListOf()

    public fun generatedRulesType(generatedRulesType: String) {
        cdkBuilder.generatedRulesType(generatedRulesType)
    }

    public fun targetTypes(vararg targetTypes: String) {
        _targetTypes.addAll(listOf(*targetTypes))
    }

    public fun targetTypes(targetTypes: Collection<String>) {
        _targetTypes.addAll(targetTypes)
    }

    public fun targets(vararg targets: String) {
        _targets.addAll(listOf(*targets))
    }

    public fun targets(targets: Collection<String>) {
        _targets.addAll(targets)
    }

    public fun build(): CfnRuleGroup.RulesSourceListProperty {
        if (_targetTypes.isNotEmpty()) cdkBuilder.targetTypes(_targetTypes)
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
