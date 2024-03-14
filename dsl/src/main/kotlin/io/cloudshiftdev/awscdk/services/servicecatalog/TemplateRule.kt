package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.ICfnRuleConditionExpression
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface TemplateRule {
  public fun assertions(): List<TemplateRuleAssertion>

  public fun condition(): ICfnRuleConditionExpression? =
      unwrap(this).getCondition()?.let(ICfnRuleConditionExpression::wrap)

  public fun ruleName(): String

  public interface Builder {
    public fun assertions(assertions: List<TemplateRuleAssertion>) {
    }

    public fun condition(condition: ICfnRuleConditionExpression) {
    }

    public fun ruleName(ruleName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.TemplateRule.Builder =
        software.amazon.awscdk.services.servicecatalog.TemplateRule.builder()

    public override fun assertions(assertions: List<TemplateRuleAssertion>) {
      cdkBuilder.assertions(assertions.map(TemplateRuleAssertion::unwrap))
    }

    public override fun condition(condition: ICfnRuleConditionExpression) {
      cdkBuilder.condition(condition.let(ICfnRuleConditionExpression::unwrap))
    }

    public override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TemplateRule =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicecatalog.TemplateRule,
  ) : TemplateRule {
    public override fun assertions(): List<TemplateRuleAssertion> =
        unwrap(this).getAssertions().map(TemplateRuleAssertion::wrap)

    public override fun condition(): ICfnRuleConditionExpression? =
        unwrap(this).getCondition()?.let(ICfnRuleConditionExpression::wrap)

    public override fun ruleName(): String = unwrap(this).getRuleName()
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
