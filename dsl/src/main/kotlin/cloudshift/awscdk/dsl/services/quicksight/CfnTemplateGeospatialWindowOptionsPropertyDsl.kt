@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

/**
 * The window options of the geospatial map visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GeospatialWindowOptionsProperty geospatialWindowOptionsProperty =
 * GeospatialWindowOptionsProperty.builder()
 * .bounds(GeospatialCoordinateBoundsProperty.builder()
 * .east(123)
 * .north(123)
 * .south(123)
 * .west(123)
 * .build())
 * .mapZoomMode("mapZoomMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-geospatialwindowoptions.html)
 */
@CdkDslMarker
public class CfnTemplateGeospatialWindowOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.GeospatialWindowOptionsProperty.Builder =
        CfnTemplate.GeospatialWindowOptionsProperty.builder()

    /**
     * @param bounds The bounds options (north, south, west, east) of the geospatial window options.
     */
    public fun bounds(bounds: IResolvable) {
        cdkBuilder.bounds(bounds)
    }

    /**
     * @param bounds The bounds options (north, south, west, east) of the geospatial window options.
     */
    public fun bounds(bounds: CfnTemplate.GeospatialCoordinateBoundsProperty) {
        cdkBuilder.bounds(bounds)
    }

    /**
     * @param mapZoomMode The map zoom modes (manual, auto) of the geospatial window options.
     */
    public fun mapZoomMode(mapZoomMode: String) {
        cdkBuilder.mapZoomMode(mapZoomMode)
    }

    public fun build(): CfnTemplate.GeospatialWindowOptionsProperty = cdkBuilder.build()
}
