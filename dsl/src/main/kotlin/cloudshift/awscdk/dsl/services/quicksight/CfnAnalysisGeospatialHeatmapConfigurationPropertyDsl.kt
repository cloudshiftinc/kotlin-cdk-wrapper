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
public class CfnAnalysisGeospatialHeatmapConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GeospatialHeatmapConfigurationProperty.Builder =
        CfnAnalysis.GeospatialHeatmapConfigurationProperty.builder()

    public fun heatmapColor(heatmapColor: IResolvable) {
        cdkBuilder.heatmapColor(heatmapColor)
    }

    public fun heatmapColor(heatmapColor: CfnAnalysis.GeospatialHeatmapColorScaleProperty) {
        cdkBuilder.heatmapColor(heatmapColor)
    }

    public fun build(): CfnAnalysis.GeospatialHeatmapConfigurationProperty = cdkBuilder.build()
}
