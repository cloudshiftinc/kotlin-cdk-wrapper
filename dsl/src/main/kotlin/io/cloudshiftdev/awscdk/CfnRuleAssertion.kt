package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnRuleAssertion {
  /**
   * The assertion description.
   */
  public fun assertDescription(): String

  /**
   * The assertion.
   */
  public fun assertValue(): ICfnConditionExpression

  /**
   * A builder for [CfnRuleAssertion]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assertDescription The assertion description. 
     */
    public fun assertDescription(assertDescription: String)

    /**
     * @param assertValue The assertion. 
     */
    public fun assertValue(assertValue: ICfnConditionExpression)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnRuleAssertion.Builder =
        software.amazon.awscdk.CfnRuleAssertion.builder()

    /**
     * @param assertDescription The assertion description. 
     */
    override fun assertDescription(assertDescription: String) {
      cdkBuilder.assertDescription(assertDescription)
    }

    /**
     * @param assertValue The assertion. 
     */
    override fun assertValue(assertValue: ICfnConditionExpression) {
      cdkBuilder.assertValue(assertValue.let(ICfnConditionExpression::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnRuleAssertion = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnRuleAssertion,
  ) : CfnRuleAssertion {
    /**
     * The assertion description.
     */
    override fun assertDescription(): String = unwrap(this).getAssertDescription()

    /**
     * The assertion.
     */
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
