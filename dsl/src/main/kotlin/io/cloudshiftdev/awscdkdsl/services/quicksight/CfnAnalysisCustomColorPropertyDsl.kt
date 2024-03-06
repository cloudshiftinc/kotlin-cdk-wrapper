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
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * Determines the color that's applied to a particular data value in a column.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomColorProperty customColorProperty = CustomColorProperty.builder()
 * .color("color")
 * // the properties below are optional
 * .fieldValue("fieldValue")
 * .specialValue("specialValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-customcolor.html)
 */
@CdkDslMarker
public class CfnAnalysisCustomColorPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CustomColorProperty.Builder =
        CfnAnalysis.CustomColorProperty.builder()

    /** @param color The color that is applied to the data value. */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /** @param fieldValue The data value that the color is applied to. */
    public fun fieldValue(fieldValue: String) {
        cdkBuilder.fieldValue(fieldValue)
    }

    /** @param specialValue The value of a special data value. */
    public fun specialValue(specialValue: String) {
        cdkBuilder.specialValue(specialValue)
    }

    public fun build(): CfnAnalysis.CustomColorProperty = cdkBuilder.build()
}
