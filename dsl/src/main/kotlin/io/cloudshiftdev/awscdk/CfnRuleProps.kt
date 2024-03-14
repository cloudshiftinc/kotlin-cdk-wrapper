package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.List

public interface CfnRuleProps {
  /**
   * Assertions which define the rule.
   *
   * Default: - No assertions for the rule.
   */
  public fun assertions(): List<CfnRuleAssertion> =
      unwrap(this).getAssertions()?.map(CfnRuleAssertion::wrap) ?: emptyList()

  /**
   * If the rule condition evaluates to false, the rule doesn't take effect.
   *
   * If the function in the rule condition evaluates to true, expressions in each assert are
   * evaluated and applied.
   *
   * Default: - Rule's assertions will always take effect.
   */
  public fun ruleCondition(): ICfnConditionExpression? =
      unwrap(this).getRuleCondition()?.let(ICfnConditionExpression::wrap)

  /**
   * A builder for [CfnRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assertions Assertions which define the rule.
     */
    public fun assertions(assertions: List<CfnRuleAssertion>)

    /**
     * @param assertions Assertions which define the rule.
     */
    public fun assertions(vararg assertions: CfnRuleAssertion)

    /**
     * @param ruleCondition If the rule condition evaluates to false, the rule doesn't take effect.
     * If the function in the rule condition evaluates to true, expressions in each assert are
     * evaluated and applied.
     */
    public fun ruleCondition(ruleCondition: ICfnConditionExpression)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnRuleProps.Builder =
        software.amazon.awscdk.CfnRuleProps.builder()

    /**
     * @param assertions Assertions which define the rule.
     */
    override fun assertions(assertions: List<CfnRuleAssertion>) {
      cdkBuilder.assertions(assertions.map(CfnRuleAssertion::unwrap))
    }

    /**
     * @param assertions Assertions which define the rule.
     */
    override fun assertions(vararg assertions: CfnRuleAssertion): Unit =
        assertions(assertions.toList())

    /**
     * @param ruleCondition If the rule condition evaluates to false, the rule doesn't take effect.
     * If the function in the rule condition evaluates to true, expressions in each assert are
     * evaluated and applied.
     */
    override fun ruleCondition(ruleCondition: ICfnConditionExpression) {
      cdkBuilder.ruleCondition(ruleCondition.let(ICfnConditionExpression::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnRuleProps,
  ) : CdkObject(cdkObject), CfnRuleProps {
    /**
     * Assertions which define the rule.
     *
     * Default: - No assertions for the rule.
     */
    override fun assertions(): List<CfnRuleAssertion> =
        unwrap(this).getAssertions()?.map(CfnRuleAssertion::wrap) ?: emptyList()

    /**
     * If the rule condition evaluates to false, the rule doesn't take effect.
     *
     * If the function in the rule condition evaluates to true, expressions in each assert are
     * evaluated and applied.
     *
     * Default: - Rule's assertions will always take effect.
     */
    override fun ruleCondition(): ICfnConditionExpression? =
        unwrap(this).getRuleCondition()?.let(ICfnConditionExpression::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnRuleProps): CfnRuleProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleProps): software.amazon.awscdk.CfnRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnRuleProps
  }
}
