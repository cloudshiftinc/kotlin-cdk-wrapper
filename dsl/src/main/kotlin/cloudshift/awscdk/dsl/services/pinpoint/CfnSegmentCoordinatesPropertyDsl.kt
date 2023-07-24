@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnSegment
import kotlin.Number

/**
 * Specifies the GPS coordinates of a location.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CoordinatesProperty coordinatesProperty = CoordinatesProperty.builder()
 * .latitude(123)
 * .longitude(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-coordinates.html)
 */
@CdkDslMarker
public class CfnSegmentCoordinatesPropertyDsl {
    private val cdkBuilder: CfnSegment.CoordinatesProperty.Builder =
        CfnSegment.CoordinatesProperty.builder()

    /**
     * @param latitude The latitude coordinate of the location.
     */
    public fun latitude(latitude: Number) {
        cdkBuilder.latitude(latitude)
    }

    /**
     * @param longitude The longitude coordinate of the location.
     */
    public fun longitude(longitude: Number) {
        cdkBuilder.longitude(longitude)
    }

    public fun build(): CfnSegment.CoordinatesProperty = cdkBuilder.build()
}
