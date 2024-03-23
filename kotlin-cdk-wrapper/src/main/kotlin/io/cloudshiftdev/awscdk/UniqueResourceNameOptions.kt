@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Options for creating a unique resource name.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * UniqueResourceNameOptions uniqueResourceNameOptions = UniqueResourceNameOptions.builder()
 * .allowedSpecialCharacters("allowedSpecialCharacters")
 * .maxLength(123)
 * .separator("separator")
 * .build();
 * ```
 */
public interface UniqueResourceNameOptions {
  /**
   * Non-alphanumeric characters allowed in the unique resource name.
   *
   * Default: - none
   */
  public fun allowedSpecialCharacters(): String? = unwrap(this).getAllowedSpecialCharacters()

  /**
   * The maximum length of the unique resource name.
   *
   * Default: - 256
   */
  public fun maxLength(): Number? = unwrap(this).getMaxLength()

  /**
   * The separator used between the path components.
   *
   * Default: - none
   */
  public fun separator(): String? = unwrap(this).getSeparator()

  /**
   * A builder for [UniqueResourceNameOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedSpecialCharacters Non-alphanumeric characters allowed in the unique resource
     * name.
     */
    public fun allowedSpecialCharacters(allowedSpecialCharacters: String)

    /**
     * @param maxLength The maximum length of the unique resource name.
     */
    public fun maxLength(maxLength: Number)

    /**
     * @param separator The separator used between the path components.
     */
    public fun separator(separator: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.UniqueResourceNameOptions.Builder =
        software.amazon.awscdk.UniqueResourceNameOptions.builder()

    /**
     * @param allowedSpecialCharacters Non-alphanumeric characters allowed in the unique resource
     * name.
     */
    override fun allowedSpecialCharacters(allowedSpecialCharacters: String) {
      cdkBuilder.allowedSpecialCharacters(allowedSpecialCharacters)
    }

    /**
     * @param maxLength The maximum length of the unique resource name.
     */
    override fun maxLength(maxLength: Number) {
      cdkBuilder.maxLength(maxLength)
    }

    /**
     * @param separator The separator used between the path components.
     */
    override fun separator(separator: String) {
      cdkBuilder.separator(separator)
    }

    public fun build(): software.amazon.awscdk.UniqueResourceNameOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.UniqueResourceNameOptions,
  ) : CdkObject(cdkObject), UniqueResourceNameOptions {
    /**
     * Non-alphanumeric characters allowed in the unique resource name.
     *
     * Default: - none
     */
    override fun allowedSpecialCharacters(): String? = unwrap(this).getAllowedSpecialCharacters()

    /**
     * The maximum length of the unique resource name.
     *
     * Default: - 256
     */
    override fun maxLength(): Number? = unwrap(this).getMaxLength()

    /**
     * The separator used between the path components.
     *
     * Default: - none
     */
    override fun separator(): String? = unwrap(this).getSeparator()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UniqueResourceNameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.UniqueResourceNameOptions):
        UniqueResourceNameOptions = CdkObjectWrappers.wrap(cdkObject) as? UniqueResourceNameOptions
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UniqueResourceNameOptions):
        software.amazon.awscdk.UniqueResourceNameOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.UniqueResourceNameOptions
  }
}
