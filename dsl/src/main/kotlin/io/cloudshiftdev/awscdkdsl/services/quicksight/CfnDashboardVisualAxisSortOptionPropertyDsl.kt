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
 * The axis sort options for a visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * VisualAxisSortOptionProperty visualAxisSortOptionProperty =
 * VisualAxisSortOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-visualaxissortoption.html)
 */
@CdkDslMarker
public class CfnDashboardVisualAxisSortOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.VisualAxisSortOptionProperty.Builder =
        CfnDashboard.VisualAxisSortOptionProperty.builder()

    /** @param availabilityStatus The availaiblity status of a visual's axis sort options. */
    public fun availabilityStatus(availabilityStatus: String) {
        cdkBuilder.availabilityStatus(availabilityStatus)
    }

    public fun build(): CfnDashboard.VisualAxisSortOptionProperty = cdkBuilder.build()
}
