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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnRecordSet

/**
 * A complex type that lists the coordinates for a geoproximity resource record.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * CoordinatesProperty coordinatesProperty = CoordinatesProperty.builder()
 * .latitude("latitude")
 * .longitude("longitude")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordset-coordinates.html)
 */
@CdkDslMarker
public class CfnRecordSetCoordinatesPropertyDsl {
    private val cdkBuilder: CfnRecordSet.CoordinatesProperty.Builder =
        CfnRecordSet.CoordinatesProperty.builder()

    /**
     * @param latitude Specifies a coordinate of the north–south position of a geographic point on
     *   the surface of the Earth (-90 - 90).
     */
    public fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
    }

    /**
     * @param longitude Specifies a coordinate of the east–west position of a geographic point on
     *   the surface of the Earth (-180 - 180).
     */
    public fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
    }

    public fun build(): CfnRecordSet.CoordinatesProperty = cdkBuilder.build()
}
