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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnRuleAssertion
import software.amazon.awscdk.CfnRuleProps
import software.amazon.awscdk.ICfnConditionExpression

/**
 * A rule can include a RuleCondition property and must include an Assertions property.
 *
 * For each rule, you can define only one rule condition; you can define one or more asserts within
 * the Assertions property. You define a rule condition and assertions by using rule-specific
 * intrinsic functions.
 *
 * You can use the following rule-specific intrinsic functions to define rule conditions and
 * assertions:
 *
 * Fn::And Fn::Contains Fn::EachMemberEquals Fn::EachMemberIn Fn::Equals Fn::If Fn::Not Fn::Or
 * Fn::RefAll Fn::ValueOf Fn::ValueOfAll
 *
 * https://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * ICfnConditionExpression cfnConditionExpression;
 * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
 * .assertions(List.of(CfnRuleAssertion.builder()
 * .assert(cfnConditionExpression)
 * .assertDescription("assertDescription")
 * .build()))
 * .ruleCondition(cfnConditionExpression)
 * .build();
 * ```
 */
@CdkDslMarker
public class CfnRulePropsDsl {
    private val cdkBuilder: CfnRuleProps.Builder = CfnRuleProps.builder()

    private val _assertions: MutableList<CfnRuleAssertion> = mutableListOf()

    /** @param assertions Assertions which define the rule. */
    public fun assertions(assertions: CfnRuleAssertionDsl.() -> Unit) {
        _assertions.add(CfnRuleAssertionDsl().apply(assertions).build())
    }

    /** @param assertions Assertions which define the rule. */
    public fun assertions(assertions: Collection<CfnRuleAssertion>) {
        _assertions.addAll(assertions)
    }

    /**
     * @param ruleCondition If the rule condition evaluates to false, the rule doesn't take effect.
     *   If the function in the rule condition evaluates to true, expressions in each assert are
     *   evaluated and applied.
     */
    public fun ruleCondition(ruleCondition: ICfnConditionExpression) {
        cdkBuilder.ruleCondition(ruleCondition)
    }

    public fun build(): CfnRuleProps {
        if (_assertions.isNotEmpty()) cdkBuilder.assertions(_assertions)
        return cdkBuilder.build()
    }
}
