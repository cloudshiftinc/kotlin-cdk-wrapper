@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options for creating a lazy string token.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * LazyStringValueOptions lazyStringValueOptions = LazyStringValueOptions.builder()
 * .displayHint("displayHint")
 * .build();
 * ```
 */
public interface LazyStringValueOptions {
  /**
   * Use the given name as a display hint.
   *
   * Default: - No hint
   */
  public fun displayHint(): String? = unwrap(this).getDisplayHint()

  /**
   * A builder for [LazyStringValueOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayHint Use the given name as a display hint.
     */
    public fun displayHint(displayHint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.LazyStringValueOptions.Builder =
        software.amazon.awscdk.LazyStringValueOptions.builder()

    /**
     * @param displayHint Use the given name as a display hint.
     */
    override fun displayHint(displayHint: String) {
      cdkBuilder.displayHint(displayHint)
    }

    public fun build(): software.amazon.awscdk.LazyStringValueOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.LazyStringValueOptions,
  ) : CdkObject(cdkObject), LazyStringValueOptions {
    /**
     * Use the given name as a display hint.
     *
     * Default: - No hint
     */
    override fun displayHint(): String? = unwrap(this).getDisplayHint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LazyStringValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.LazyStringValueOptions):
        LazyStringValueOptions = CdkObjectWrappers.wrap(cdkObject) as? LazyStringValueOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LazyStringValueOptions):
        software.amazon.awscdk.LazyStringValueOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.LazyStringValueOptions
  }
}
