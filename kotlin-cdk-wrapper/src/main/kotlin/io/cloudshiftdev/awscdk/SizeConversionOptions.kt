@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Options for how to convert time to a different unit.
 *
 * Example:
 *
 * ```
 * Size.mebibytes(2).toKibibytes(); // yields 2048
 * Size.kibibytes(2050).toMebibytes(SizeConversionOptions.builder().rounding(SizeRoundingBehavior.FLOOR).build());
 * ```
 */
public interface SizeConversionOptions {
  /**
   * How conversions should behave when it encounters a non-integer result.
   *
   * Default: SizeRoundingBehavior.FAIL
   */
  public fun rounding(): SizeRoundingBehavior? =
      unwrap(this).getRounding()?.let(SizeRoundingBehavior::wrap)

  /**
   * A builder for [SizeConversionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param rounding How conversions should behave when it encounters a non-integer result.
     */
    public fun rounding(rounding: SizeRoundingBehavior)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.SizeConversionOptions.Builder =
        software.amazon.awscdk.SizeConversionOptions.builder()

    /**
     * @param rounding How conversions should behave when it encounters a non-integer result.
     */
    override fun rounding(rounding: SizeRoundingBehavior) {
      cdkBuilder.rounding(rounding.let(SizeRoundingBehavior::unwrap))
    }

    public fun build(): software.amazon.awscdk.SizeConversionOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.SizeConversionOptions,
  ) : CdkObject(cdkObject), SizeConversionOptions {
    /**
     * How conversions should behave when it encounters a non-integer result.
     *
     * Default: SizeRoundingBehavior.FAIL
     */
    override fun rounding(): SizeRoundingBehavior? =
        unwrap(this).getRounding()?.let(SizeRoundingBehavior::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SizeConversionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.SizeConversionOptions):
        SizeConversionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SizeConversionOptions):
        software.amazon.awscdk.SizeConversionOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.SizeConversionOptions
  }
}
