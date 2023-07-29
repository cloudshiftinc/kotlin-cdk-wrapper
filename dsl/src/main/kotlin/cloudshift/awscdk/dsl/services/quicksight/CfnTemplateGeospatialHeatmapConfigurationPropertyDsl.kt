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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The heatmap configuration of the geospatial point style.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GeospatialHeatmapConfigurationProperty geospatialHeatmapConfigurationProperty =
 * GeospatialHeatmapConfigurationProperty.builder()
 * .heatmapColor(GeospatialHeatmapColorScaleProperty.builder()
 * .colors(List.of(GeospatialHeatmapDataColorProperty.builder()
 * .color("color")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-geospatialheatmapconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateGeospatialHeatmapConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.GeospatialHeatmapConfigurationProperty.Builder =
        CfnTemplate.GeospatialHeatmapConfigurationProperty.builder()

    /** @param heatmapColor The color scale specification for the heatmap point style. */
    public fun heatmapColor(heatmapColor: IResolvable) {
        cdkBuilder.heatmapColor(heatmapColor)
    }

    /** @param heatmapColor The color scale specification for the heatmap point style. */
    public fun heatmapColor(heatmapColor: CfnTemplate.GeospatialHeatmapColorScaleProperty) {
        cdkBuilder.heatmapColor(heatmapColor)
    }

    public fun build(): CfnTemplate.GeospatialHeatmapConfigurationProperty = cdkBuilder.build()
}
