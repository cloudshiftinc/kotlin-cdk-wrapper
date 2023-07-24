@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The data options for an axis.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * Object dataDriven;
 * AxisDataOptionsProperty axisDataOptionsProperty = AxisDataOptionsProperty.builder()
 * .dateAxisOptions(DateAxisOptionsProperty.builder()
 * .missingDateVisibility("missingDateVisibility")
 * .build())
 * .numericAxisOptions(NumericAxisOptionsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-axisdataoptions.html)
 */
@CdkDslMarker
public class CfnTemplateAxisDataOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.AxisDataOptionsProperty.Builder =
        CfnTemplate.AxisDataOptionsProperty.builder()

    /**
     * @param dateAxisOptions The options for an axis with a date field.
     */
    public fun dateAxisOptions(dateAxisOptions: IResolvable) {
        cdkBuilder.dateAxisOptions(dateAxisOptions)
    }

    /**
     * @param dateAxisOptions The options for an axis with a date field.
     */
    public fun dateAxisOptions(dateAxisOptions: CfnTemplate.DateAxisOptionsProperty) {
        cdkBuilder.dateAxisOptions(dateAxisOptions)
    }

    /**
     * @param numericAxisOptions The options for an axis with a numeric field.
     */
    public fun numericAxisOptions(numericAxisOptions: IResolvable) {
        cdkBuilder.numericAxisOptions(numericAxisOptions)
    }

    /**
     * @param numericAxisOptions The options for an axis with a numeric field.
     */
    public fun numericAxisOptions(numericAxisOptions: CfnTemplate.NumericAxisOptionsProperty) {
        cdkBuilder.numericAxisOptions(numericAxisOptions)
    }

    public fun build(): CfnTemplate.AxisDataOptionsProperty = cdkBuilder.build()
}
