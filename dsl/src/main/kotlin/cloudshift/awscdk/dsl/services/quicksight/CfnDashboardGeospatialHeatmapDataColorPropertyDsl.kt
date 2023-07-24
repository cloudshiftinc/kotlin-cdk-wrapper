@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-geospatialheatmapdatacolor.html)
 */
@CdkDslMarker
public class CfnDashboardGeospatialHeatmapDataColorPropertyDsl {
    private val cdkBuilder: CfnDashboard.GeospatialHeatmapDataColorProperty.Builder =
        CfnDashboard.GeospatialHeatmapDataColorProperty.builder()

    /**
     * @param color The hex color to be used in the heatmap point style.
     */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun build(): CfnDashboard.GeospatialHeatmapDataColorProperty = cdkBuilder.build()
}
