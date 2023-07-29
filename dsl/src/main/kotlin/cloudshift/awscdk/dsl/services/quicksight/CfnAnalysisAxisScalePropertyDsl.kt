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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The scale setup options for a numeric axis display.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AxisScaleProperty axisScaleProperty = AxisScaleProperty.builder()
 * .linear(AxisLinearScaleProperty.builder()
 * .stepCount(123)
 * .stepSize(123)
 * .build())
 * .logarithmic(AxisLogarithmicScaleProperty.builder()
 * .base(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-axisscale.html)
 */
@CdkDslMarker
public class CfnAnalysisAxisScalePropertyDsl {
    private val cdkBuilder: CfnAnalysis.AxisScaleProperty.Builder =
        CfnAnalysis.AxisScaleProperty.builder()

    /** @param linear The linear axis scale setup. */
    public fun linear(linear: IResolvable) {
        cdkBuilder.linear(linear)
    }

    /** @param linear The linear axis scale setup. */
    public fun linear(linear: CfnAnalysis.AxisLinearScaleProperty) {
        cdkBuilder.linear(linear)
    }

    /** @param logarithmic The logarithmic axis scale setup. */
    public fun logarithmic(logarithmic: IResolvable) {
        cdkBuilder.logarithmic(logarithmic)
    }

    /** @param logarithmic The logarithmic axis scale setup. */
    public fun logarithmic(logarithmic: CfnAnalysis.AxisLogarithmicScaleProperty) {
        cdkBuilder.logarithmic(logarithmic)
    }

    public fun build(): CfnAnalysis.AxisScaleProperty = cdkBuilder.build()
}
