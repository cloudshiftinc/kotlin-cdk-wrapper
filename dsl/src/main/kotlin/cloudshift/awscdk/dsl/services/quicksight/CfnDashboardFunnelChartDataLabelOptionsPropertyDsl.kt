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
public class CfnDashboardFunnelChartDataLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.FunnelChartDataLabelOptionsProperty.Builder =
        CfnDashboard.FunnelChartDataLabelOptionsProperty.builder()

    public fun categoryLabelVisibility(categoryLabelVisibility: String) {
        cdkBuilder.categoryLabelVisibility(categoryLabelVisibility)
    }

    public fun labelColor(labelColor: String) {
        cdkBuilder.labelColor(labelColor)
    }

    public fun labelFontConfiguration(labelFontConfiguration: IResolvable) {
        cdkBuilder.labelFontConfiguration(labelFontConfiguration)
    }

    public fun labelFontConfiguration(labelFontConfiguration: CfnDashboard.FontConfigurationProperty) {
        cdkBuilder.labelFontConfiguration(labelFontConfiguration)
    }

    public fun measureDataLabelStyle(measureDataLabelStyle: String) {
        cdkBuilder.measureDataLabelStyle(measureDataLabelStyle)
    }

    public fun measureLabelVisibility(measureLabelVisibility: String) {
        cdkBuilder.measureLabelVisibility(measureLabelVisibility)
    }

    public fun position(position: String) {
        cdkBuilder.position(position)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.FunnelChartDataLabelOptionsProperty = cdkBuilder.build()
}
