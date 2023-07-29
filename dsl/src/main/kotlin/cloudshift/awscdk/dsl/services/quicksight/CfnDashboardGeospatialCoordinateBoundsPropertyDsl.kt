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
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The bound options (north, south, west, east) of the geospatial window options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GeospatialCoordinateBoundsProperty geospatialCoordinateBoundsProperty =
 * GeospatialCoordinateBoundsProperty.builder()
 * .east(123)
 * .north(123)
 * .south(123)
 * .west(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-geospatialcoordinatebounds.html)
 */
@CdkDslMarker
public class CfnDashboardGeospatialCoordinateBoundsPropertyDsl {
    private val cdkBuilder: CfnDashboard.GeospatialCoordinateBoundsProperty.Builder =
        CfnDashboard.GeospatialCoordinateBoundsProperty.builder()

    /** @param east The longitude of the east bound of the geospatial coordinate bounds. */
    public fun east(east: Number) {
        cdkBuilder.east(east)
    }

    /** @param north The latitude of the north bound of the geospatial coordinate bounds. */
    public fun north(north: Number) {
        cdkBuilder.north(north)
    }

    /** @param south The latitude of the south bound of the geospatial coordinate bounds. */
    public fun south(south: Number) {
        cdkBuilder.south(south)
    }

    /** @param west The longitude of the west bound of the geospatial coordinate bounds. */
    public fun west(west: Number) {
        cdkBuilder.west(west)
    }

    public fun build(): CfnDashboard.GeospatialCoordinateBoundsProperty = cdkBuilder.build()
}
