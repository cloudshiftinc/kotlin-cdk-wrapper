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

@CdkDslMarker
public class CfnDashboardGeospatialHeatmapConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.GeospatialHeatmapConfigurationProperty.Builder =
        CfnDashboard.GeospatialHeatmapConfigurationProperty.builder()

    public fun heatmapColor(heatmapColor: IResolvable) {
        cdkBuilder.heatmapColor(heatmapColor)
    }

    public fun heatmapColor(heatmapColor: CfnDashboard.GeospatialHeatmapColorScaleProperty) {
        cdkBuilder.heatmapColor(heatmapColor)
    }

    public fun build(): CfnDashboard.GeospatialHeatmapConfigurationProperty = cdkBuilder.build()
}
