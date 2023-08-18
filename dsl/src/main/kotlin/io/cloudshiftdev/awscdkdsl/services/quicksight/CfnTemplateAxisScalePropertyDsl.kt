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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-axisscale.html)
 */
@CdkDslMarker
public class CfnTemplateAxisScalePropertyDsl {
    private val cdkBuilder: CfnTemplate.AxisScaleProperty.Builder =
        CfnTemplate.AxisScaleProperty.builder()

    /** @param linear The linear axis scale setup. */
    public fun linear(linear: IResolvable) {
        cdkBuilder.linear(linear)
    }

    /** @param linear The linear axis scale setup. */
    public fun linear(linear: CfnTemplate.AxisLinearScaleProperty) {
        cdkBuilder.linear(linear)
    }

    /** @param logarithmic The logarithmic axis scale setup. */
    public fun logarithmic(logarithmic: IResolvable) {
        cdkBuilder.logarithmic(logarithmic)
    }

    /** @param logarithmic The logarithmic axis scale setup. */
    public fun logarithmic(logarithmic: CfnTemplate.AxisLogarithmicScaleProperty) {
        cdkBuilder.logarithmic(logarithmic)
    }

    public fun build(): CfnTemplate.AxisScaleProperty = cdkBuilder.build()
}
