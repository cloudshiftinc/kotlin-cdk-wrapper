@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface CfnRuleProps {
  public fun assertions(): List<CfnRuleAssertion> =
      unwrap(this).getAssertions()?.map(CfnRuleAssertion::wrap) ?: emptyList()

  public fun ruleCondition(): ICfnConditionExpression? =
      unwrap(this).getRuleCondition()?.let(ICfnConditionExpression::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun assertions(assertions: List<CfnRuleAssertion>)

    public fun assertions(vararg assertions: CfnRuleAssertion)

    public fun ruleCondition(ruleCondition: ICfnConditionExpression)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnRuleProps.Builder =
        software.amazon.awscdk.CfnRuleProps.builder()

    override fun assertions(assertions: List<CfnRuleAssertion>) {
      cdkBuilder.assertions(assertions.map(CfnRuleAssertion::unwrap))
    }

    override fun assertions(vararg assertions: CfnRuleAssertion): Unit =
        assertions(assertions.toList())

    override fun ruleCondition(ruleCondition: ICfnConditionExpression) {
      cdkBuilder.ruleCondition(ruleCondition.let(ICfnConditionExpression::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnRuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnRuleProps,
  ) : CdkObject(cdkObject), CfnRuleProps {
    override fun assertions(): List<CfnRuleAssertion> =
        unwrap(this).getAssertions()?.map(CfnRuleAssertion::wrap) ?: emptyList()

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
