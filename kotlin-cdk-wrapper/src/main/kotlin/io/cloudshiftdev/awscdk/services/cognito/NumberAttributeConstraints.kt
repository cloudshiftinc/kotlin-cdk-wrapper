@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Constraints that can be applied to a custom attribute of number type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * NumberAttributeConstraints numberAttributeConstraints = NumberAttributeConstraints.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 */
public interface NumberAttributeConstraints {
  /**
   * Maximum value of this attribute.
   *
   * Default: - no maximum value
   */
  public fun max(): Number? = unwrap(this).getMax()

  /**
   * Minimum value of this attribute.
   *
   * Default: - no minimum value
   */
  public fun min(): Number? = unwrap(this).getMin()

  /**
   * A builder for [NumberAttributeConstraints]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param max Maximum value of this attribute.
     */
    public fun max(max: Number)

    /**
     * @param min Minimum value of this attribute.
     */
    public fun min(min: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints.Builder =
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints.builder()

    /**
     * @param max Maximum value of this attribute.
     */
    override fun max(max: Number) {
      cdkBuilder.max(max)
    }

    /**
     * @param min Minimum value of this attribute.
     */
    override fun min(min: Number) {
      cdkBuilder.min(min)
    }

    public fun build(): software.amazon.awscdk.services.cognito.NumberAttributeConstraints =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeConstraints,
  ) : CdkObject(cdkObject),
      NumberAttributeConstraints {
    /**
     * Maximum value of this attribute.
     *
     * Default: - no maximum value
     */
    override fun max(): Number? = unwrap(this).getMax()

    /**
     * Minimum value of this attribute.
     *
     * Default: - no minimum value
     */
    override fun min(): Number? = unwrap(this).getMin()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NumberAttributeConstraints {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeConstraints):
        NumberAttributeConstraints = CdkObjectWrappers.wrap(cdkObject) as?
        NumberAttributeConstraints ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: NumberAttributeConstraints):
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.NumberAttributeConstraints
  }
}
