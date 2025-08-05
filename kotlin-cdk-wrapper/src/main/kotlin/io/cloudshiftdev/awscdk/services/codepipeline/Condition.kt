@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * The condition for the stage.
 *
 * A condition is made up of the rules and the result for the condition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * Rule rule;
 * Condition condition = Condition.builder()
 * .result(Result.ROLLBACK)
 * .rules(List.of(rule))
 * .build();
 * ```
 */
public interface Condition {
  /**
   * The action to be done when the condition is met.
   *
   * Default: - No result action is taken
   */
  public fun result(): Result? = unwrap(this).getResult()?.let(Result::wrap)

  /**
   * The rules that make up the condition.
   *
   * Default: - No rules are applied
   */
  public fun rules(): List<Rule> = unwrap(this).getRules()?.map(Rule::wrap) ?: emptyList()

  /**
   * A builder for [Condition]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param result The action to be done when the condition is met.
     */
    public fun result(result: Result)

    /**
     * @param rules The rules that make up the condition.
     */
    public fun rules(rules: List<Rule>)

    /**
     * @param rules The rules that make up the condition.
     */
    public fun rules(vararg rules: Rule)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.Condition.Builder =
        software.amazon.awscdk.services.codepipeline.Condition.builder()

    /**
     * @param result The action to be done when the condition is met.
     */
    override fun result(result: Result) {
      cdkBuilder.result(result.let(Result.Companion::unwrap))
    }

    /**
     * @param rules The rules that make up the condition.
     */
    override fun rules(rules: List<Rule>) {
      cdkBuilder.rules(rules.map(Rule.Companion::unwrap))
    }

    /**
     * @param rules The rules that make up the condition.
     */
    override fun rules(vararg rules: Rule): Unit = rules(rules.toList())

    public fun build(): software.amazon.awscdk.services.codepipeline.Condition = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.Condition,
  ) : CdkObject(cdkObject),
      Condition {
    /**
     * The action to be done when the condition is met.
     *
     * Default: - No result action is taken
     */
    override fun result(): Result? = unwrap(this).getResult()?.let(Result::wrap)

    /**
     * The rules that make up the condition.
     *
     * Default: - No rules are applied
     */
    override fun rules(): List<Rule> = unwrap(this).getRules()?.map(Rule::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Condition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Condition): Condition
        = CdkObjectWrappers.wrap(cdkObject) as? Condition ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Condition): software.amazon.awscdk.services.codepipeline.Condition
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.Condition
  }
}
