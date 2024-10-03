@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.collections.List

/**
 * Interface for values that can be resolvable later.
 *
 * Tokens are special objects that participate in synthesis.
 */
public interface IResolvable {
  /**
   * The creation stack of this resolvable which will be appended to errors thrown during
   * resolution.
   *
   * This may return an array with a single informational element indicating how
   * to get this property populated, if it was skipped for performance reasons.
   */
  public fun creationStack(): List<String>

  /**
   * Produce the Token's value at resolution time.
   *
   * @param context 
   */
  public fun resolve(context: IResolveContext): Any

  /**
   * The type that this token will likely resolve to.
   */
  public fun typeHint(): ResolutionTypeHint? =
      unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IResolvable,
  ) : CdkObject(cdkObject),
      IResolvable {
    /**
     * The creation stack of this resolvable which will be appended to errors thrown during
     * resolution.
     *
     * This may return an array with a single informational element indicating how
     * to get this property populated, if it was skipped for performance reasons.
     */
    override fun creationStack(): List<String> = unwrap(this).getCreationStack()

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
    internal fun wrap(cdkObject: software.amazon.awscdk.IResolvable): IResolvable =
        CdkObjectWrappers.wrap(cdkObject) as? IResolvable ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IResolvable): software.amazon.awscdk.IResolvable = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IResolvable
  }
}
