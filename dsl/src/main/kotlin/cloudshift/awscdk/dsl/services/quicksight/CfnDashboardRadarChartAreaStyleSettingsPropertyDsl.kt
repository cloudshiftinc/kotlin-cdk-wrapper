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
 * The configured style settings of a radar chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RadarChartAreaStyleSettingsProperty radarChartAreaStyleSettingsProperty =
 * RadarChartAreaStyleSettingsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-radarchartareastylesettings.html)
 */
@CdkDslMarker
public class CfnDashboardRadarChartAreaStyleSettingsPropertyDsl {
    private val cdkBuilder: CfnDashboard.RadarChartAreaStyleSettingsProperty.Builder =
        CfnDashboard.RadarChartAreaStyleSettingsProperty.builder()

    /** @param visibility The visibility settings of a radar chart. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.RadarChartAreaStyleSettingsProperty = cdkBuilder.build()
}
