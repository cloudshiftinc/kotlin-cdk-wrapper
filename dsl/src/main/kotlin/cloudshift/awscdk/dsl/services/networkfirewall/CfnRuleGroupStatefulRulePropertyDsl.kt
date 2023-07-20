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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleGroupStatefulRulePropertyDsl {
    private val cdkBuilder: CfnRuleGroup.StatefulRuleProperty.Builder =
        CfnRuleGroup.StatefulRuleProperty.builder()

    private val _ruleOptions: MutableList<Any> = mutableListOf()

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`)
    }

    public fun `header`(`header`: CfnRuleGroup.HeaderProperty) {
        cdkBuilder.`header`(`header`)
    }

    public fun ruleOptions(vararg ruleOptions: Any) {
        _ruleOptions.addAll(listOf(*ruleOptions))
    }

    public fun ruleOptions(ruleOptions: Collection<Any>) {
        _ruleOptions.addAll(ruleOptions)
    }

    public fun ruleOptions(ruleOptions: IResolvable) {
        cdkBuilder.ruleOptions(ruleOptions)
    }

    public fun build(): CfnRuleGroup.StatefulRuleProperty {
        if (_ruleOptions.isNotEmpty()) cdkBuilder.ruleOptions(_ruleOptions)
        return cdkBuilder.build()
    }
}
