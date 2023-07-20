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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisLineChartMarkerStyleSettingsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LineChartMarkerStyleSettingsProperty.Builder =
        CfnAnalysis.LineChartMarkerStyleSettingsProperty.builder()

    public fun markerColor(markerColor: String) {
        cdkBuilder.markerColor(markerColor)
    }

    public fun markerShape(markerShape: String) {
        cdkBuilder.markerShape(markerShape)
    }

    public fun markerSize(markerSize: String) {
        cdkBuilder.markerSize(markerSize)
    }

    public fun markerVisibility(markerVisibility: String) {
        cdkBuilder.markerVisibility(markerVisibility)
    }

    public fun build(): CfnAnalysis.LineChartMarkerStyleSettingsProperty = cdkBuilder.build()
}
