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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLineChartSeriesSettingsPropertyDsl {
    private val cdkBuilder: CfnTemplate.LineChartSeriesSettingsProperty.Builder =
        CfnTemplate.LineChartSeriesSettingsProperty.builder()

    public fun lineStyleSettings(lineStyleSettings: IResolvable) {
        cdkBuilder.lineStyleSettings(lineStyleSettings)
    }

    public fun lineStyleSettings(lineStyleSettings: CfnTemplate.LineChartLineStyleSettingsProperty) {
        cdkBuilder.lineStyleSettings(lineStyleSettings)
    }

    public fun markerStyleSettings(markerStyleSettings: IResolvable) {
        cdkBuilder.markerStyleSettings(markerStyleSettings)
    }

    public fun markerStyleSettings(markerStyleSettings: CfnTemplate.LineChartMarkerStyleSettingsProperty) {
        cdkBuilder.markerStyleSettings(markerStyleSettings)
    }

    public fun build(): CfnTemplate.LineChartSeriesSettingsProperty = cdkBuilder.build()
}
