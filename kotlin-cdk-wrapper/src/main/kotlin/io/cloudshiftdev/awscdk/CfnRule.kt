@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The Rules that define template constraints in an AWS Service Catalog portfolio describe when end
 * users can use the template and which values they can specify for parameters that are declared in the
 * AWS CloudFormation template used to create the product they are attempting to use.
 *
 * Rules
 * are useful for preventing end users from inadvertently specifying an incorrect value.
 * For example, you can add a rule to verify whether end users specified a valid subnet in a
 * given VPC or used m1.small instance types for test environments. AWS CloudFormation uses
 * rules to validate parameter values before it creates the resources for the product.
 *
 * A rule can include a RuleCondition property and must include an Assertions property.
 * For each rule, you can define only one rule condition; you can define one or more asserts within
 * the Assertions property.
 * You define a rule condition and assertions by using rule-specific intrinsic functions.
 *
 * Example:
 *
 * ```
 * CfnInclude cfnTemplate;
 * // mutating the rule
 * CfnParameter myParameter;
 * CfnRule rule = cfnTemplate.getRule("MyRule");
 * rule.addAssertion(Fn.conditionContains(List.of("m1.small"), myParameter.getValueAsString()),
 * "MyParameter has to be m1.small");
 * ```
 */
public open class CfnRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnRule,
) : CfnRefElement(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.CfnRule(scope.let(CloudshiftdevConstructsConstruct::unwrap), id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleProps,
  ) : this(software.amazon.awscdk.CfnRule(scope.let(CloudshiftdevConstructsConstruct::unwrap), id,
      props.let(CfnRuleProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRuleProps(props)
  )

  /**
   * Adds an assertion to the rule.
   *
   * @param condition The expression to evaluation. 
   * @param description The description of the assertion. 
   */
  public open fun addAssertion(condition: ICfnConditionExpression, description: String) {
    unwrap(this).addAssertion(condition.let(ICfnConditionExpression::unwrap), description)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Assertions which define the rule.
     *
     * Default: - No assertions for the rule.
     *
     * @param assertions Assertions which define the rule. 
     */
    public fun assertions(assertions: List<CfnRuleAssertion>)

    /**
     * Assertions which define the rule.
     *
     * Default: - No assertions for the rule.
     *
     * @param assertions Assertions which define the rule. 
     */
    public fun assertions(vararg assertions: CfnRuleAssertion)

    /**
     * If the rule condition evaluates to false, the rule doesn't take effect.
     *
     * If the function in the rule condition evaluates to true, expressions in each assert are
     * evaluated and applied.
     *
     * Default: - Rule's assertions will always take effect.
     *
     * @param ruleCondition If the rule condition evaluates to false, the rule doesn't take effect. 
     */
    public fun ruleCondition(ruleCondition: ICfnConditionExpression)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnRule.Builder =
        software.amazon.awscdk.CfnRule.Builder.create(scope, id)

    /**
     * Assertions which define the rule.
     *
     * Default: - No assertions for the rule.
     *
     * @param assertions Assertions which define the rule. 
     */
    override fun assertions(assertions: List<CfnRuleAssertion>) {
      cdkBuilder.assertions(assertions.map(CfnRuleAssertion::unwrap))
    }

    /**
     * Assertions which define the rule.
     *
     * Default: - No assertions for the rule.
     *
     * @param assertions Assertions which define the rule. 
     */
    override fun assertions(vararg assertions: CfnRuleAssertion): Unit =
        assertions(assertions.toList())

    /**
     * If the rule condition evaluates to false, the rule doesn't take effect.
     *
     * If the function in the rule condition evaluates to true, expressions in each assert are
     * evaluated and applied.
     *
     * Default: - Rule's assertions will always take effect.
     *
     * @param ruleCondition If the rule condition evaluates to false, the rule doesn't take effect. 
     */
    override fun ruleCondition(ruleCondition: ICfnConditionExpression) {
      cdkBuilder.ruleCondition(ruleCondition.let(ICfnConditionExpression::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnRule = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnRule): CfnRule = CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.CfnRule = wrapped.cdkObject
  }
}
