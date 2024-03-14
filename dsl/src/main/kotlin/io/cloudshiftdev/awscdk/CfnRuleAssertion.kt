package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface CfnRuleAssertion {
  public fun assertDescription(): String

  public fun assertValue(): ICfnConditionExpression

  public interface Builder {
    public fun assertDescription(assertDescription: String)

    public fun assertValue(assertValue: ICfnConditionExpression)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnRuleAssertion.Builder =
        software.amazon.awscdk.CfnRuleAssertion.builder()

    override fun assertDescription(assertDescription: String) {
      cdkBuilder.assertDescription(assertDescription)
    }

    override fun assertValue(assertValue: ICfnConditionExpression) {
      cdkBuilder.assertValue(assertValue.let(ICfnConditionExpression::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnRuleAssertion = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnRuleAssertion,
  ) : CfnRuleAssertion {
    override fun assertDescription(): String = unwrap(this).getAssertDescription()

    override fun assertValue(): ICfnConditionExpression =
        unwrap(this).getAssertValue().let(ICfnConditionExpression::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleAssertion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnRuleAssertion): CfnRuleAssertion =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleAssertion): software.amazon.awscdk.CfnRuleAssertion =
        (wrapped as Wrapper).cdkObject
  }
}
