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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWebACLRuleGroupReferenceStatementPropertyDsl {
    private val cdkBuilder: CfnWebACL.RuleGroupReferenceStatementProperty.Builder =
        CfnWebACL.RuleGroupReferenceStatementProperty.builder()

    private val _excludedRules: MutableList<Any> = mutableListOf()

    private val _ruleActionOverrides: MutableList<Any> = mutableListOf()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun excludedRules(vararg excludedRules: Any) {
        _excludedRules.addAll(listOf(*excludedRules))
    }

    public fun excludedRules(excludedRules: Collection<Any>) {
        _excludedRules.addAll(excludedRules)
    }

    public fun excludedRules(excludedRules: IResolvable) {
        cdkBuilder.excludedRules(excludedRules)
    }

    public fun ruleActionOverrides(vararg ruleActionOverrides: Any) {
        _ruleActionOverrides.addAll(listOf(*ruleActionOverrides))
    }

    public fun ruleActionOverrides(ruleActionOverrides: Collection<Any>) {
        _ruleActionOverrides.addAll(ruleActionOverrides)
    }

    public fun ruleActionOverrides(ruleActionOverrides: IResolvable) {
        cdkBuilder.ruleActionOverrides(ruleActionOverrides)
    }

    public fun build(): CfnWebACL.RuleGroupReferenceStatementProperty {
        if (_excludedRules.isNotEmpty()) cdkBuilder.excludedRules(_excludedRules)
        if (_ruleActionOverrides.isNotEmpty()) cdkBuilder.ruleActionOverrides(_ruleActionOverrides)
        return cdkBuilder.build()
    }
}
