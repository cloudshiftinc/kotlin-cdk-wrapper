@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

/**
 * Options for the 'reverse()' operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * ReverseOptions reverseOptions = ReverseOptions.builder()
 * .failConcat(false)
 * .build();
 * ```
 */
public interface ReverseOptions {
  /**
   * Fail if the given string is a concatenation.
   *
   * If `false`, just return `undefined`.
   *
   * Default: true
   */
  public fun failConcat(): Boolean? = unwrap(this).getFailConcat()

  /**
   * A builder for [ReverseOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param failConcat Fail if the given string is a concatenation.
     * If `false`, just return `undefined`.
     */
    public fun failConcat(failConcat: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ReverseOptions.Builder =
        software.amazon.awscdk.ReverseOptions.builder()

    /**
     * @param failConcat Fail if the given string is a concatenation.
     * If `false`, just return `undefined`.
     */
    override fun failConcat(failConcat: Boolean) {
      cdkBuilder.failConcat(failConcat)
    }

    public fun build(): software.amazon.awscdk.ReverseOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ReverseOptions,
  ) : CdkObject(cdkObject), ReverseOptions {
    /**
     * Fail if the given string is a concatenation.
     *
     * If `false`, just return `undefined`.
     *
     * Default: true
     */
    override fun failConcat(): Boolean? = unwrap(this).getFailConcat()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReverseOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ReverseOptions): ReverseOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReverseOptions): software.amazon.awscdk.ReverseOptions = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.ReverseOptions
  }
}
