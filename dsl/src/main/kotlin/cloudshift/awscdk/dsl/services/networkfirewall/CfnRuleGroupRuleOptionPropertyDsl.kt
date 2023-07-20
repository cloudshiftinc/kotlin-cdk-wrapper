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
public class CfnRuleGroupRuleOptionPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RuleOptionProperty.Builder =
        CfnRuleGroup.RuleOptionProperty.builder()

    private val _settings: MutableList<String> = mutableListOf()

    public fun keyword(keyword: String) {
        cdkBuilder.keyword(keyword)
    }

    public fun settings(vararg settings: String) {
        _settings.addAll(listOf(*settings))
    }

    public fun settings(settings: Collection<String>) {
        _settings.addAll(settings)
    }

    public fun build(): CfnRuleGroup.RuleOptionProperty {
        if (_settings.isNotEmpty()) cdkBuilder.settings(_settings)
        return cdkBuilder.build()
    }
}
