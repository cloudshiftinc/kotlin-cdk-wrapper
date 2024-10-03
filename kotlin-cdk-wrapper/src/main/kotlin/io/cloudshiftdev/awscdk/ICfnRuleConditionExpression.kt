@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Interface to specify certain functions as Service Catalog rule-specific.
 *
 * These functions can only be used in `Rules` section of template.
 */
public interface ICfnRuleConditionExpression : ICfnConditionExpression {
  /**
   * This field is only needed to defeat TypeScript's structural typing.
   *
   * It is never used.
   */
  public fun disambiguator(): Boolean

  private class Wrapper(
    cdkObject: software.amazon.awscdk.ICfnRuleConditionExpression,
  ) : CdkObject(cdkObject),
      ICfnRuleConditionExpression {
    /**
     * The creation stack of this resolvable which will be appended to errors thrown during
     * resolution.
     *
     * This may return an array with a single informational element indicating how
     * to get this property populated, if it was skipped for performance reasons.
     */
    override fun creationStack(): List<String> = unwrap(this).getCreationStack()

    /**
     * This field is only needed to defeat TypeScript's structural typing.
     *
     * It is never used.
     */
    override fun disambiguator(): Boolean = unwrap(this).getDisambiguator()

    /**
     * Produce the Token's value at resolution time.
     *
     * @param context 
     */
    override fun resolve(context: IResolveContext): Any =
        unwrap(this).resolve(context.let(IResolveContext.Companion::unwrap))

    /**
     * Return a string representation of this resolvable object.
     *
     * Returns a reversible string representation.
     */
    override fun toString(): String = unwrap(this).toString()

    /**
     * The type that this token will likely resolve to.
     */
    override fun typeHint(): ResolutionTypeHint? =
        unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ICfnRuleConditionExpression):
        ICfnRuleConditionExpression = CdkObjectWrappers.wrap(cdkObject) as?
        ICfnRuleConditionExpression ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICfnRuleConditionExpression):
        software.amazon.awscdk.ICfnRuleConditionExpression = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.ICfnRuleConditionExpression
  }
}
