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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The sheet layout maximization options of a dashbaord.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetLayoutElementMaximizationOptionProperty sheetLayoutElementMaximizationOptionProperty =
 * SheetLayoutElementMaximizationOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sheetlayoutelementmaximizationoption.html)
 */
@CdkDslMarker
public class CfnDashboardSheetLayoutElementMaximizationOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.SheetLayoutElementMaximizationOptionProperty.Builder =
        CfnDashboard.SheetLayoutElementMaximizationOptionProperty.builder()

    /**
     * @param availabilityStatus The status of the sheet layout maximization options of a dashbaord.
     */
    public fun availabilityStatus(availabilityStatus: String) {
        cdkBuilder.availabilityStatus(availabilityStatus)
    }

    public fun build(): CfnDashboard.SheetLayoutElementMaximizationOptionProperty =
        cdkBuilder.build()
}
