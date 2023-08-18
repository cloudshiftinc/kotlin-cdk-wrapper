@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.SizeConversionOptions
import software.amazon.awscdk.SizeRoundingBehavior

/**
 * Options for how to convert time to a different unit.
 *
 * Example:
 * ```
 * Size.mebibytes(2).toKibibytes(); // yields 2048
 * Size.kibibytes(2050).toMebibytes(SizeConversionOptions.builder().rounding(SizeRoundingBehavior.FLOOR).build());
 * ```
 */
@CdkDslMarker
public class SizeConversionOptionsDsl {
    private val cdkBuilder: SizeConversionOptions.Builder = SizeConversionOptions.builder()

    /** @param rounding How conversions should behave when it encounters a non-integer result. */
    public fun rounding(rounding: SizeRoundingBehavior) {
        cdkBuilder.rounding(rounding)
    }

    public fun build(): SizeConversionOptions = cdkBuilder.build()
}
