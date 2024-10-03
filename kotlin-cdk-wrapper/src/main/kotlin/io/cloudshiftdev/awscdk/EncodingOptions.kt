@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties to string encodings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * EncodingOptions encodingOptions = EncodingOptions.builder()
 * .displayHint("displayHint")
 * .build();
 * ```
 */
public interface EncodingOptions {
  /**
   * A hint for the Token's purpose when stringifying it.
   */
  public fun displayHint(): String? = unwrap(this).getDisplayHint()

  /**
   * A builder for [EncodingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param displayHint A hint for the Token's purpose when stringifying it.
     */
    public fun displayHint(displayHint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.EncodingOptions.Builder =
        software.amazon.awscdk.EncodingOptions.builder()

    /**
     * @param displayHint A hint for the Token's purpose when stringifying it.
     */
    override fun displayHint(displayHint: String) {
      cdkBuilder.displayHint(displayHint)
    }

    public fun build(): software.amazon.awscdk.EncodingOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.EncodingOptions,
  ) : CdkObject(cdkObject),
      EncodingOptions {
    /**
     * A hint for the Token's purpose when stringifying it.
     */
    override fun displayHint(): String? = unwrap(this).getDisplayHint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EncodingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.EncodingOptions): EncodingOptions =
        CdkObjectWrappers.wrap(cdkObject) as? EncodingOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncodingOptions): software.amazon.awscdk.EncodingOptions = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.EncodingOptions
  }
}
