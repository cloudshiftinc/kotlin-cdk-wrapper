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
import kotlin.String

@CdkDslMarker
public class CfnTemplateLineChartDefaultSeriesSettingsPropertyDsl {
    private val cdkBuilder: CfnTemplate.LineChartDefaultSeriesSettingsProperty.Builder =
        CfnTemplate.LineChartDefaultSeriesSettingsProperty.builder()

    public fun axisBinding(axisBinding: String) {
        cdkBuilder.axisBinding(axisBinding)
    }

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

    public fun build(): CfnTemplate.LineChartDefaultSeriesSettingsProperty = cdkBuilder.build()
}
