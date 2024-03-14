package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.ICfnRuleConditionExpression
import kotlin.String
import kotlin.Unit

public interface TemplateRuleAssertion {
  public fun assertValue(): ICfnRuleConditionExpression

  public fun description(): String? = unwrap(this).getDescription()

  public interface Builder {
    public fun assertValue(assertValue: ICfnRuleConditionExpression) {
    }

    public fun description(description: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion.Builder =
        software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion.builder()

    public override fun assertValue(assertValue: ICfnRuleConditionExpression) {
      cdkBuilder.assertValue(assertValue.let(ICfnRuleConditionExpression::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion,
  ) : TemplateRuleAssertion {
    public override fun assertValue(): ICfnRuleConditionExpression =
        unwrap(this).getAssertValue().let(ICfnRuleConditionExpression::wrap)

    public override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TemplateRuleAssertion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion):
        TemplateRuleAssertion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TemplateRuleAssertion):
        software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion = (wrapped as
        Wrapper).cdkObject
  }
}
