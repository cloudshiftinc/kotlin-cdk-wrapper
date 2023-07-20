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
import kotlin.String

@CdkDslMarker
public class CfnAnalysisGeospatialPointStyleOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GeospatialPointStyleOptionsProperty.Builder =
        CfnAnalysis.GeospatialPointStyleOptionsProperty.builder()

    public fun clusterMarkerConfiguration(clusterMarkerConfiguration: IResolvable) {
        cdkBuilder.clusterMarkerConfiguration(clusterMarkerConfiguration)
    }

    public fun clusterMarkerConfiguration(clusterMarkerConfiguration: CfnAnalysis.ClusterMarkerConfigurationProperty) {
        cdkBuilder.clusterMarkerConfiguration(clusterMarkerConfiguration)
    }

    public fun heatmapConfiguration(heatmapConfiguration: IResolvable) {
        cdkBuilder.heatmapConfiguration(heatmapConfiguration)
    }

    public fun heatmapConfiguration(heatmapConfiguration: CfnAnalysis.GeospatialHeatmapConfigurationProperty) {
        cdkBuilder.heatmapConfiguration(heatmapConfiguration)
    }

    public fun selectedPointStyle(selectedPointStyle: String) {
        cdkBuilder.selectedPointStyle(selectedPointStyle)
    }

    public fun build(): CfnAnalysis.GeospatialPointStyleOptionsProperty = cdkBuilder.build()
}
