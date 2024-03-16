@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * A rule assertion.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * ICfnConditionExpression cfnConditionExpression;
 * CfnRuleAssertion cfnRuleAssertion = CfnRuleAssertion.builder()
 * .assert(cfnConditionExpression)
 * .assertDescription("assertDescription")
 * .build();
 * ```
 */
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnRuleAssertion,
  ) : CdkObject(cdkObject), CfnRuleAssertion {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleAssertion {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnRuleAssertion): CfnRuleAssertion =
        CdkObjectWrappers.wrap(cdkObject) as CfnRuleAssertion

    internal fun unwrap(wrapped: CfnRuleAssertion): software.amazon.awscdk.CfnRuleAssertion =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnRuleAssertion
  }
}
