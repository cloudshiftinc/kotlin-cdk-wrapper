@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.ICfnRuleConditionExpression
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface TemplateRule {
  public fun assertions(): List<TemplateRuleAssertion>

  public fun condition(): ICfnRuleConditionExpression? =
      unwrap(this).getCondition()?.let(ICfnRuleConditionExpression::wrap)

  public fun ruleName(): String

  @CdkDslMarker
  public interface Builder {
    public fun assertions(assertions: List<TemplateRuleAssertion>)

    public fun assertions(vararg assertions: TemplateRuleAssertion)

    public fun condition(condition: ICfnRuleConditionExpression)

    public fun ruleName(ruleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.TemplateRule.Builder =
        software.amazon.awscdk.services.servicecatalog.TemplateRule.builder()

    override fun assertions(assertions: List<TemplateRuleAssertion>) {
      cdkBuilder.assertions(assertions.map(TemplateRuleAssertion::unwrap))
    }

    override fun assertions(vararg assertions: TemplateRuleAssertion): Unit =
        assertions(assertions.toList())

    override fun condition(condition: ICfnRuleConditionExpression) {
      cdkBuilder.condition(condition.let(ICfnRuleConditionExpression::unwrap))
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TemplateRule =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.TemplateRule,
  ) : CdkObject(cdkObject), TemplateRule {
    override fun assertions(): List<TemplateRuleAssertion> =
        unwrap(this).getAssertions().map(TemplateRuleAssertion::wrap)

    override fun condition(): ICfnRuleConditionExpression? =
        unwrap(this).getCondition()?.let(ICfnRuleConditionExpression::wrap)

    override fun ruleName(): String = unwrap(this).getRuleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TemplateRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.TemplateRule):
        TemplateRule = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TemplateRule):
        software.amazon.awscdk.services.servicecatalog.TemplateRule = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.TemplateRule
  }
}
