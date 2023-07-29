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
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The data point tooltip options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataPointTooltipOptionProperty dataPointTooltipOptionProperty =
 * DataPointTooltipOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datapointtooltipoption.html)
 */
@CdkDslMarker
public class CfnDashboardDataPointTooltipOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.DataPointTooltipOptionProperty.Builder =
        CfnDashboard.DataPointTooltipOptionProperty.builder()

    /** @param availabilityStatus The status of the data point tool tip options. */
    public fun availabilityStatus(availabilityStatus: String) {
        cdkBuilder.availabilityStatus(availabilityStatus)
    }

    public fun build(): CfnDashboard.DataPointTooltipOptionProperty = cdkBuilder.build()
}
