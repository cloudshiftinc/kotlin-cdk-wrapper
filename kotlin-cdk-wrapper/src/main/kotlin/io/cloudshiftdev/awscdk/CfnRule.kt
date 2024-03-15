@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnRule,
) : CfnRefElement(cdkObject) {
  public open fun addAssertion(condition: ICfnConditionExpression, description: String) {
    unwrap(this).addAssertion(condition.let(ICfnConditionExpression::unwrap), description)
  }

  @CdkDslMarker
  public interface Builder {
    public fun assertions(assertions: List<CfnRuleAssertion>)

    public fun assertions(vararg assertions: CfnRuleAssertion)

    public fun ruleCondition(ruleCondition: ICfnConditionExpression)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnRule.Builder =
        software.amazon.awscdk.CfnRule.Builder.create(scope, id)

    override fun assertions(assertions: List<CfnRuleAssertion>) {
      cdkBuilder.assertions(assertions.map(CfnRuleAssertion::unwrap))
    }

    override fun assertions(vararg assertions: CfnRuleAssertion): Unit =
        assertions(assertions.toList())

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
