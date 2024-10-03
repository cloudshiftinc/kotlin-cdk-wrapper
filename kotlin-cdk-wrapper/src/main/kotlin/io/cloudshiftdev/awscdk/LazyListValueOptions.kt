@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Options for creating a lazy list token.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * LazyListValueOptions lazyListValueOptions = LazyListValueOptions.builder()
 * .displayHint("displayHint")
 * .omitEmpty(false)
 * .build();
 * ```
 */
public interface LazyListValueOptions {
  /**
   * Use the given name as a display hint.
   *
   * Default: - No hint
   */
  public fun displayHint(): String? = unwrap(this).getDisplayHint()

  /**
   * If the produced list is empty, return 'undefined' instead.
   *
   * Default: false
   */
  public fun omitEmpty(): Boolean? = unwrap(this).getOmitEmpty()

  /**
   * A builder for [LazyListValueOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayHint Use the given name as a display hint.
     */
    public fun displayHint(displayHint: String)

    /**
     * @param omitEmpty If the produced list is empty, return 'undefined' instead.
     */
    public fun omitEmpty(omitEmpty: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.LazyListValueOptions.Builder =
        software.amazon.awscdk.LazyListValueOptions.builder()

    /**
     * @param displayHint Use the given name as a display hint.
     */
    override fun displayHint(displayHint: String) {
      cdkBuilder.displayHint(displayHint)
    }

    /**
     * @param omitEmpty If the produced list is empty, return 'undefined' instead.
     */
    override fun omitEmpty(omitEmpty: Boolean) {
      cdkBuilder.omitEmpty(omitEmpty)
    }

    public fun build(): software.amazon.awscdk.LazyListValueOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.LazyListValueOptions,
  ) : CdkObject(cdkObject),
      LazyListValueOptions {
    /**
     * Use the given name as a display hint.
     *
     * Default: - No hint
     */
    override fun displayHint(): String? = unwrap(this).getDisplayHint()

    /**
     * If the produced list is empty, return 'undefined' instead.
     *
     * Default: false
     */
    override fun omitEmpty(): Boolean? = unwrap(this).getOmitEmpty()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LazyListValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.LazyListValueOptions): LazyListValueOptions
        = CdkObjectWrappers.wrap(cdkObject) as? LazyListValueOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LazyListValueOptions): software.amazon.awscdk.LazyListValueOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.LazyListValueOptions
  }
}
