@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisRadarChartSeriesSettingsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.RadarChartSeriesSettingsProperty.Builder =
        CfnAnalysis.RadarChartSeriesSettingsProperty.builder()

    public fun areaStyleSettings(areaStyleSettings: IResolvable) {
        cdkBuilder.areaStyleSettings(areaStyleSettings)
    }

    public fun areaStyleSettings(areaStyleSettings: CfnAnalysis.RadarChartAreaStyleSettingsProperty) {
        cdkBuilder.areaStyleSettings(areaStyleSettings)
    }

    public fun build(): CfnAnalysis.RadarChartSeriesSettingsProperty = cdkBuilder.build()
}
