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
public class CfnDashboardDataFieldSeriesItemPropertyDsl {
    private val cdkBuilder: CfnDashboard.DataFieldSeriesItemProperty.Builder =
        CfnDashboard.DataFieldSeriesItemProperty.builder()

    public fun axisBinding(axisBinding: String) {
        cdkBuilder.axisBinding(axisBinding)
    }

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun fieldValue(fieldValue: String) {
        cdkBuilder.fieldValue(fieldValue)
    }

    public fun settings(settings: IResolvable) {
        cdkBuilder.settings(settings)
    }

    public fun settings(settings: CfnDashboard.LineChartSeriesSettingsProperty) {
        cdkBuilder.settings(settings)
    }

    public fun build(): CfnDashboard.DataFieldSeriesItemProperty = cdkBuilder.build()
}
