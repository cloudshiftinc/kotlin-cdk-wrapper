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
public class CfnAnalysisLineChartSeriesSettingsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LineChartSeriesSettingsProperty.Builder =
        CfnAnalysis.LineChartSeriesSettingsProperty.builder()

    public fun lineStyleSettings(lineStyleSettings: IResolvable) {
        cdkBuilder.lineStyleSettings(lineStyleSettings)
    }

    public fun lineStyleSettings(lineStyleSettings: CfnAnalysis.LineChartLineStyleSettingsProperty) {
        cdkBuilder.lineStyleSettings(lineStyleSettings)
    }

    public fun markerStyleSettings(markerStyleSettings: IResolvable) {
        cdkBuilder.markerStyleSettings(markerStyleSettings)
    }

    public fun markerStyleSettings(markerStyleSettings: CfnAnalysis.LineChartMarkerStyleSettingsProperty) {
        cdkBuilder.markerStyleSettings(markerStyleSettings)
    }

    public fun build(): CfnAnalysis.LineChartSeriesSettingsProperty = cdkBuilder.build()
}
