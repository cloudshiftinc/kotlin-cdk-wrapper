@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The point style of the geospatial map.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GeospatialPointStyleOptionsProperty geospatialPointStyleOptionsProperty =
 * GeospatialPointStyleOptionsProperty.builder()
 * .clusterMarkerConfiguration(ClusterMarkerConfigurationProperty.builder()
 * .clusterMarker(ClusterMarkerProperty.builder()
 * .simpleClusterMarker(SimpleClusterMarkerProperty.builder()
 * .color("color")
 * .build())
 * .build())
 * .build())
 * .heatmapConfiguration(GeospatialHeatmapConfigurationProperty.builder()
 * .heatmapColor(GeospatialHeatmapColorScaleProperty.builder()
 * .colors(List.of(GeospatialHeatmapDataColorProperty.builder()
 * .color("color")
 * .build()))
 * .build())
 * .build())
 * .selectedPointStyle("selectedPointStyle")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-geospatialpointstyleoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisGeospatialPointStyleOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GeospatialPointStyleOptionsProperty.Builder =
        CfnAnalysis.GeospatialPointStyleOptionsProperty.builder()

    /**
     * @param clusterMarkerConfiguration The cluster marker configuration of the geospatial point
     *   style.
     */
    public fun clusterMarkerConfiguration(clusterMarkerConfiguration: IResolvable) {
        cdkBuilder.clusterMarkerConfiguration(clusterMarkerConfiguration)
    }

    /**
     * @param clusterMarkerConfiguration The cluster marker configuration of the geospatial point
     *   style.
     */
    public fun clusterMarkerConfiguration(
        clusterMarkerConfiguration: CfnAnalysis.ClusterMarkerConfigurationProperty
    ) {
        cdkBuilder.clusterMarkerConfiguration(clusterMarkerConfiguration)
    }

    /** @param heatmapConfiguration The heatmap configuration of the geospatial point style. */
    public fun heatmapConfiguration(heatmapConfiguration: IResolvable) {
        cdkBuilder.heatmapConfiguration(heatmapConfiguration)
    }

    /** @param heatmapConfiguration The heatmap configuration of the geospatial point style. */
    public fun heatmapConfiguration(
        heatmapConfiguration: CfnAnalysis.GeospatialHeatmapConfigurationProperty
    ) {
        cdkBuilder.heatmapConfiguration(heatmapConfiguration)
    }

    /**
     * @param selectedPointStyle The selected point styles (point, cluster) of the geospatial map.
     */
    public fun selectedPointStyle(selectedPointStyle: String) {
        cdkBuilder.selectedPointStyle(selectedPointStyle)
    }

    public fun build(): CfnAnalysis.GeospatialPointStyleOptionsProperty = cdkBuilder.build()
}
