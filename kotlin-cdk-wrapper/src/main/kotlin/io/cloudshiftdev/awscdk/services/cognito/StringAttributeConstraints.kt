@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Constraints that can be applied to a custom attribute of string type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * StringAttributeConstraints stringAttributeConstraints = StringAttributeConstraints.builder()
 * .maxLen(123)
 * .minLen(123)
 * .build();
 * ```
 */
public interface StringAttributeConstraints {
  /**
   * Maximum length of this attribute.
   *
   * Default: 2048
   */
  public fun maxLen(): Number? = unwrap(this).getMaxLen()

  /**
   * Minimum length of this attribute.
   *
   * Default: 0
   */
  public fun minLen(): Number? = unwrap(this).getMinLen()

  /**
   * A builder for [StringAttributeConstraints]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxLen Maximum length of this attribute.
     */
    public fun maxLen(maxLen: Number)

    /**
     * @param minLen Minimum length of this attribute.
     */
    public fun minLen(minLen: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.StringAttributeConstraints.Builder =
        software.amazon.awscdk.services.cognito.StringAttributeConstraints.builder()

    /**
     * @param maxLen Maximum length of this attribute.
     */
    override fun maxLen(maxLen: Number) {
      cdkBuilder.maxLen(maxLen)
    }

    /**
     * @param minLen Minimum length of this attribute.
     */
    override fun minLen(minLen: Number) {
      cdkBuilder.minLen(minLen)
    }

    public fun build(): software.amazon.awscdk.services.cognito.StringAttributeConstraints =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.StringAttributeConstraints,
  ) : CdkObject(cdkObject),
      StringAttributeConstraints {
    /**
     * Maximum length of this attribute.
     *
     * Default: 2048
     */
    override fun maxLen(): Number? = unwrap(this).getMaxLen()

    /**
     * Minimum length of this attribute.
     *
     * Default: 0
     */
    override fun minLen(): Number? = unwrap(this).getMinLen()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringAttributeConstraints {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StringAttributeConstraints):
        StringAttributeConstraints = CdkObjectWrappers.wrap(cdkObject) as?
        StringAttributeConstraints ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringAttributeConstraints):
        software.amazon.awscdk.services.cognito.StringAttributeConstraints = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.StringAttributeConstraints
  }
}
