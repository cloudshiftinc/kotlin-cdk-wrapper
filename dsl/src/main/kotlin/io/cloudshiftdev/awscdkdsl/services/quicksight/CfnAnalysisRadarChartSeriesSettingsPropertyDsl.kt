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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The series settings of a radar chart.
 *
 * Example:
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-radarchartseriessettings.html)
 */
@CdkDslMarker
public class CfnAnalysisRadarChartSeriesSettingsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.RadarChartSeriesSettingsProperty.Builder =
        CfnAnalysis.RadarChartSeriesSettingsProperty.builder()

    /** @param areaStyleSettings The area style settings of a radar chart. */
    public fun areaStyleSettings(areaStyleSettings: IResolvable) {
        cdkBuilder.areaStyleSettings(areaStyleSettings)
    }

    /** @param areaStyleSettings The area style settings of a radar chart. */
    public fun areaStyleSettings(
        areaStyleSettings: CfnAnalysis.RadarChartAreaStyleSettingsProperty
    ) {
        cdkBuilder.areaStyleSettings(areaStyleSettings)
    }

    public fun build(): CfnAnalysis.RadarChartSeriesSettingsProperty = cdkBuilder.build()
}
