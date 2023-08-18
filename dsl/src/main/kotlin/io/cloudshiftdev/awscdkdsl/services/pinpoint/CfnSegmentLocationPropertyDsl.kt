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

package io.cloudshiftdev.awscdkdsl.services.pinpoint

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

/**
 * Specifies location-based criteria, such as region or GPS coordinates, for the segment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * LocationProperty locationProperty = LocationProperty.builder()
 * .country(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .gpsPoint(GPSPointProperty.builder()
 * .coordinates(CoordinatesProperty.builder()
 * .latitude(123)
 * .longitude(123)
 * .build())
 * .rangeInKilometers(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-location.html)
 */
@CdkDslMarker
public class CfnSegmentLocationPropertyDsl {
    private val cdkBuilder: CfnSegment.LocationProperty.Builder =
        CfnSegment.LocationProperty.builder()

    /** @param country The country or region code, in ISO 3166-1 alpha-2 format, for the segment. */
    public fun country(country: IResolvable) {
        cdkBuilder.country(country)
    }

    /** @param country The country or region code, in ISO 3166-1 alpha-2 format, for the segment. */
    public fun country(country: CfnSegment.SetDimensionProperty) {
        cdkBuilder.country(country)
    }

    /** @param gpsPoint The GPS point dimension for the segment. */
    public fun gpsPoint(gpsPoint: IResolvable) {
        cdkBuilder.gpsPoint(gpsPoint)
    }

    /** @param gpsPoint The GPS point dimension for the segment. */
    public fun gpsPoint(gpsPoint: CfnSegment.GPSPointProperty) {
        cdkBuilder.gpsPoint(gpsPoint)
    }

    public fun build(): CfnSegment.LocationProperty = cdkBuilder.build()
}
