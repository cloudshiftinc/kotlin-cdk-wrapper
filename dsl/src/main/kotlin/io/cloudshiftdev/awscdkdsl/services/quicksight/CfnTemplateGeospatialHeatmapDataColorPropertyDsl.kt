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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The color to be used in the heatmap point style.
 *
 * Example:
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-geospatialheatmapdatacolor.html)
 */
@CdkDslMarker
public class CfnTemplateGeospatialHeatmapDataColorPropertyDsl {
    private val cdkBuilder: CfnTemplate.GeospatialHeatmapDataColorProperty.Builder =
        CfnTemplate.GeospatialHeatmapDataColorProperty.builder()

    /** @param color The hex color to be used in the heatmap point style. */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun build(): CfnTemplate.GeospatialHeatmapDataColorProperty = cdkBuilder.build()
}
