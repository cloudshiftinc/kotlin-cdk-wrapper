@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The series settings of a radar chart.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RadarChartSeriesSettingsProperty radarChartSeriesSettingsProperty =
 * RadarChartSeriesSettingsProperty.builder()
 * .areaStyleSettings(RadarChartAreaStyleSettingsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-radarchartseriessettings.html)
 */
@CdkDslMarker
public class CfnDashboardRadarChartSeriesSettingsPropertyDsl {
    private val cdkBuilder: CfnDashboard.RadarChartSeriesSettingsProperty.Builder =
        CfnDashboard.RadarChartSeriesSettingsProperty.builder()

    /**
     * @param areaStyleSettings The area style settings of a radar chart.
     */
    public fun areaStyleSettings(areaStyleSettings: IResolvable) {
        cdkBuilder.areaStyleSettings(areaStyleSettings)
    }

    /**
     * @param areaStyleSettings The area style settings of a radar chart.
     */
    public fun areaStyleSettings(areaStyleSettings: CfnDashboard.RadarChartAreaStyleSettingsProperty) {
        cdkBuilder.areaStyleSettings(areaStyleSettings)
    }

    public fun build(): CfnDashboard.RadarChartSeriesSettingsProperty = cdkBuilder.build()
}
