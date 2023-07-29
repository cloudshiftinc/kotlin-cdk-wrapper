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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * Determines the gradient stop configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GradientStopProperty gradientStopProperty = GradientStopProperty.builder()
 * .gradientOffset(123)
 * // the properties below are optional
 * .color("color")
 * .dataValue(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-gradientstop.html)
 */
@CdkDslMarker
public class CfnAnalysisGradientStopPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GradientStopProperty.Builder =
        CfnAnalysis.GradientStopProperty.builder()

    /** @param color Determines the color. */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /** @param dataValue Determines the data value. */
    public fun dataValue(dataValue: Number) {
        cdkBuilder.dataValue(dataValue)
    }

    /** @param gradientOffset Determines gradient offset value. */
    public fun gradientOffset(gradientOffset: Number) {
        cdkBuilder.gradientOffset(gradientOffset)
    }

    public fun build(): CfnAnalysis.GradientStopProperty = cdkBuilder.build()
}
