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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options for an axis with a numeric field.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * Object dataDriven;
 * NumericAxisOptionsProperty numericAxisOptionsProperty = NumericAxisOptionsProperty.builder()
 * .range(AxisDisplayRangeProperty.builder()
 * .dataDriven(dataDriven)
 * .minMax(AxisDisplayMinMaxRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build())
 * .scale(AxisScaleProperty.builder()
 * .linear(AxisLinearScaleProperty.builder()
 * .stepCount(123)
 * .stepSize(123)
 * .build())
 * .logarithmic(AxisLogarithmicScaleProperty.builder()
 * .base(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-numericaxisoptions.html)
 */
@CdkDslMarker
public class CfnTemplateNumericAxisOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.NumericAxisOptionsProperty.Builder =
        CfnTemplate.NumericAxisOptionsProperty.builder()

    /** @param range The range setup of a numeric axis. */
    public fun range(range: IResolvable) {
        cdkBuilder.range(range)
    }

    /** @param range The range setup of a numeric axis. */
    public fun range(range: CfnTemplate.AxisDisplayRangeProperty) {
        cdkBuilder.range(range)
    }

    /** @param scale The scale setup of a numeric axis. */
    public fun scale(scale: IResolvable) {
        cdkBuilder.scale(scale)
    }

    /** @param scale The scale setup of a numeric axis. */
    public fun scale(scale: CfnTemplate.AxisScaleProperty) {
        cdkBuilder.scale(scale)
    }

    public fun build(): CfnTemplate.NumericAxisOptionsProperty = cdkBuilder.build()
}
