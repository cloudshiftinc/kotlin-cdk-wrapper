@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Options for creating lazy untyped tokens.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * LazyAnyValueOptions lazyAnyValueOptions = LazyAnyValueOptions.builder()
 * .displayHint("displayHint")
 * .omitEmptyArray(false)
 * .build();
 * ```
 */
public interface LazyAnyValueOptions {
  /**
   * Use the given name as a display hint.
   *
   * Default: - No hint
   */
  public fun displayHint(): String? = unwrap(this).getDisplayHint()

  /**
   * If the produced value is an array and it is empty, return 'undefined' instead.
   *
   * Default: false
   */
  public fun omitEmptyArray(): Boolean? = unwrap(this).getOmitEmptyArray()

  /**
   * A builder for [LazyAnyValueOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayHint Use the given name as a display hint.
     */
    public fun displayHint(displayHint: String)

    /**
     * @param omitEmptyArray If the produced value is an array and it is empty, return 'undefined'
     * instead.
     */
    public fun omitEmptyArray(omitEmptyArray: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.LazyAnyValueOptions.Builder =
        software.amazon.awscdk.LazyAnyValueOptions.builder()

    /**
     * @param displayHint Use the given name as a display hint.
     */
    override fun displayHint(displayHint: String) {
      cdkBuilder.displayHint(displayHint)
    }

    /**
     * @param omitEmptyArray If the produced value is an array and it is empty, return 'undefined'
     * instead.
     */
    override fun omitEmptyArray(omitEmptyArray: Boolean) {
      cdkBuilder.omitEmptyArray(omitEmptyArray)
    }

    public fun build(): software.amazon.awscdk.LazyAnyValueOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.LazyAnyValueOptions,
  ) : CdkObject(cdkObject), LazyAnyValueOptions {
    /**
     * Use the given name as a display hint.
     *
     * Default: - No hint
     */
    override fun displayHint(): String? = unwrap(this).getDisplayHint()

    /**
     * If the produced value is an array and it is empty, return 'undefined' instead.
     *
     * Default: false
     */
    override fun omitEmptyArray(): Boolean? = unwrap(this).getOmitEmptyArray()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LazyAnyValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.LazyAnyValueOptions): LazyAnyValueOptions =
        CdkObjectWrappers.wrap(cdkObject) as LazyAnyValueOptions

    internal fun unwrap(wrapped: LazyAnyValueOptions): software.amazon.awscdk.LazyAnyValueOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.LazyAnyValueOptions
  }
}
