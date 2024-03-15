@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.ICfnRuleConditionExpression
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface TemplateRuleAssertion {
  public fun assertValue(): ICfnRuleConditionExpression

  public fun description(): String? = unwrap(this).getDescription()

  @CdkDslMarker
  public interface Builder {
    public fun assertValue(assertValue: ICfnRuleConditionExpression)

    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion.Builder =
        software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion.builder()

    override fun assertValue(assertValue: ICfnRuleConditionExpression) {
      cdkBuilder.assertValue(assertValue.let(ICfnRuleConditionExpression::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion,
  ) : CdkObject(cdkObject), TemplateRuleAssertion {
    override fun assertValue(): ICfnRuleConditionExpression =
        unwrap(this).getAssertValue().let(ICfnRuleConditionExpression::wrap)

    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TemplateRuleAssertion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion):
        TemplateRuleAssertion = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TemplateRuleAssertion):
        software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion
  }
}
