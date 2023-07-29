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
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The map style options of the geospatial map.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GeospatialMapStyleOptionsProperty geospatialMapStyleOptionsProperty =
 * GeospatialMapStyleOptionsProperty.builder()
 * .baseMapStyle("baseMapStyle")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-geospatialmapstyleoptions.html)
 */
@CdkDslMarker
public class CfnDashboardGeospatialMapStyleOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.GeospatialMapStyleOptionsProperty.Builder =
        CfnDashboard.GeospatialMapStyleOptionsProperty.builder()

    /** @param baseMapStyle The base map style of the geospatial map. */
    public fun baseMapStyle(baseMapStyle: String) {
        cdkBuilder.baseMapStyle(baseMapStyle)
    }

    public fun build(): CfnDashboard.GeospatialMapStyleOptionsProperty = cdkBuilder.build()
}
