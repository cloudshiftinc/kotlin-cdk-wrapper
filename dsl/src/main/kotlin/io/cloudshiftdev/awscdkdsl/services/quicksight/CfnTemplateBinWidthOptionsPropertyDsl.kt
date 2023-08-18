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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options that determine the bin width of a histogram.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * BinWidthOptionsProperty binWidthOptionsProperty = BinWidthOptionsProperty.builder()
 * .binCountLimit(123)
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-binwidthoptions.html)
 */
@CdkDslMarker
public class CfnTemplateBinWidthOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.BinWidthOptionsProperty.Builder =
        CfnTemplate.BinWidthOptionsProperty.builder()

    /** @param binCountLimit The options that determine the bin count limit. */
    public fun binCountLimit(binCountLimit: Number) {
        cdkBuilder.binCountLimit(binCountLimit)
    }

    /** @param value The options that determine the bin width value. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.BinWidthOptionsProperty = cdkBuilder.build()
}
