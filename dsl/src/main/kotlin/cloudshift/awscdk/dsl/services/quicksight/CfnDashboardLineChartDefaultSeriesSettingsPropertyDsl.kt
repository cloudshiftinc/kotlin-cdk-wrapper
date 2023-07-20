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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardLineChartDefaultSeriesSettingsPropertyDsl {
    private val cdkBuilder: CfnDashboard.LineChartDefaultSeriesSettingsProperty.Builder =
        CfnDashboard.LineChartDefaultSeriesSettingsProperty.builder()

    public fun axisBinding(axisBinding: String) {
        cdkBuilder.axisBinding(axisBinding)
    }

    public fun lineStyleSettings(lineStyleSettings: IResolvable) {
        cdkBuilder.lineStyleSettings(lineStyleSettings)
    }

    public fun lineStyleSettings(lineStyleSettings: CfnDashboard.LineChartLineStyleSettingsProperty) {
        cdkBuilder.lineStyleSettings(lineStyleSettings)
    }

    public fun markerStyleSettings(markerStyleSettings: IResolvable) {
        cdkBuilder.markerStyleSettings(markerStyleSettings)
    }

    public fun markerStyleSettings(markerStyleSettings: CfnDashboard.LineChartMarkerStyleSettingsProperty) {
        cdkBuilder.markerStyleSettings(markerStyleSettings)
    }

    public fun build(): CfnDashboard.LineChartDefaultSeriesSettingsProperty = cdkBuilder.build()
}
