@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The color to be used in the heatmap point style.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GeospatialHeatmapDataColorProperty geospatialHeatmapDataColorProperty =
 * GeospatialHeatmapDataColorProperty.builder()
 * .color("color")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-geospatialheatmapdatacolor.html)
 */
@CdkDslMarker
public class CfnAnalysisGeospatialHeatmapDataColorPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GeospatialHeatmapDataColorProperty.Builder =
        CfnAnalysis.GeospatialHeatmapDataColorProperty.builder()

    /**
     * @param color The hex color to be used in the heatmap point style.
     */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun build(): CfnAnalysis.GeospatialHeatmapDataColorProperty = cdkBuilder.build()
}
