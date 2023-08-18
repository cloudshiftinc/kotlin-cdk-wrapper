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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The liner axis scale setup.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AxisLinearScaleProperty axisLinearScaleProperty = AxisLinearScaleProperty.builder()
 * .stepCount(123)
 * .stepSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-axislinearscale.html)
 */
@CdkDslMarker
public class CfnDashboardAxisLinearScalePropertyDsl {
    private val cdkBuilder: CfnDashboard.AxisLinearScaleProperty.Builder =
        CfnDashboard.AxisLinearScaleProperty.builder()

    /** @param stepCount The step count setup of a linear axis. */
    public fun stepCount(stepCount: Number) {
        cdkBuilder.stepCount(stepCount)
    }

    /** @param stepSize The step size setup of a linear axis. */
    public fun stepSize(stepSize: Number) {
        cdkBuilder.stepSize(stepSize)
    }

    public fun build(): CfnDashboard.AxisLinearScaleProperty = cdkBuilder.build()
}
