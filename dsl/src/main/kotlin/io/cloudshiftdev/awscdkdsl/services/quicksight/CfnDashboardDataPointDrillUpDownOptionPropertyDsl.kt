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
 * The drill down options for data points in a dashbaord.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataPointDrillUpDownOptionProperty dataPointDrillUpDownOptionProperty =
 * DataPointDrillUpDownOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datapointdrillupdownoption.html)
 */
@CdkDslMarker
public class CfnDashboardDataPointDrillUpDownOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.DataPointDrillUpDownOptionProperty.Builder =
        CfnDashboard.DataPointDrillUpDownOptionProperty.builder()

    /** @param availabilityStatus The status of the drill down options of data points. */
    public fun availabilityStatus(availabilityStatus: String) {
        cdkBuilder.availabilityStatus(availabilityStatus)
    }

    public fun build(): CfnDashboard.DataPointDrillUpDownOptionProperty = cdkBuilder.build()
}
