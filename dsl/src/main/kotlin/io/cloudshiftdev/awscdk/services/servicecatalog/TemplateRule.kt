package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.ICfnRuleConditionExpression
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface TemplateRule {
  /**
   * A list of assertions that make up the rule.
   */
  public fun assertions(): List<TemplateRuleAssertion>

  /**
   * Specify when to apply rule with a rule-specific intrinsic function.
   *
   * Default: - no rule condition provided
   */
  public fun condition(): ICfnRuleConditionExpression? =
      unwrap(this).getCondition()?.let(ICfnRuleConditionExpression::wrap)

  /**
   * Name of the rule.
   */
  public fun ruleName(): String

  /**
   * A builder for [TemplateRule]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assertions A list of assertions that make up the rule. 
     */
    public fun assertions(assertions: List<TemplateRuleAssertion>)

    /**
     * @param assertions A list of assertions that make up the rule. 
     */
    public fun assertions(vararg assertions: TemplateRuleAssertion)

    /**
     * @param condition Specify when to apply rule with a rule-specific intrinsic function.
     */
    public fun condition(condition: ICfnRuleConditionExpression)

    /**
     * @param ruleName Name of the rule. 
     */
    public fun ruleName(ruleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.TemplateRule.Builder =
        software.amazon.awscdk.services.servicecatalog.TemplateRule.builder()

    /**
     * @param assertions A list of assertions that make up the rule. 
     */
    override fun assertions(assertions: List<TemplateRuleAssertion>) {
      cdkBuilder.assertions(assertions.map(TemplateRuleAssertion::unwrap))
    }

    /**
     * @param assertions A list of assertions that make up the rule. 
     */
    override fun assertions(vararg assertions: TemplateRuleAssertion): Unit =
        assertions(assertions.toList())

    /**
     * @param condition Specify when to apply rule with a rule-specific intrinsic function.
     */
    override fun condition(condition: ICfnRuleConditionExpression) {
      cdkBuilder.condition(condition.let(ICfnRuleConditionExpression::unwrap))
    }

    /**
     * @param ruleName Name of the rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TemplateRule =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicecatalog.TemplateRule,
  ) : TemplateRule {
    /**
     * A list of assertions that make up the rule.
     */
    override fun assertions(): List<TemplateRuleAssertion> =
        unwrap(this).getAssertions().map(TemplateRuleAssertion::wrap)

    /**
     * Specify when to apply rule with a rule-specific intrinsic function.
     *
     * Default: - no rule condition provided
     */
    override fun condition(): ICfnRuleConditionExpression? =
        unwrap(this).getCondition()?.let(ICfnRuleConditionExpression::wrap)

    /**
     * Name of the rule.
     */
    override fun ruleName(): String = unwrap(this).getRuleName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TemplateRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.TemplateRule):
        TemplateRule = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TemplateRule):
        software.amazon.awscdk.services.servicecatalog.TemplateRule = (wrapped as Wrapper).cdkObject
  }
}
