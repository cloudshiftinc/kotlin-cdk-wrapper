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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.ICfnRuleConditionExpression
import software.amazon.awscdk.services.servicecatalog.TemplateRule
import software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class TemplateRuleDsl {
    private val cdkBuilder: TemplateRule.Builder = TemplateRule.builder()

    private val _assertions: MutableList<TemplateRuleAssertion> = mutableListOf()

    public fun assertions(assertions: TemplateRuleAssertionDsl.() -> Unit) {
        _assertions.add(TemplateRuleAssertionDsl().apply(assertions).build())
    }

    public fun assertions(assertions: Collection<TemplateRuleAssertion>) {
        _assertions.addAll(assertions)
    }

    public fun condition(condition: ICfnRuleConditionExpression) {
        cdkBuilder.condition(condition)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun build(): TemplateRule {
        if (_assertions.isNotEmpty()) cdkBuilder.assertions(_assertions)
        return cdkBuilder.build()
    }
}
