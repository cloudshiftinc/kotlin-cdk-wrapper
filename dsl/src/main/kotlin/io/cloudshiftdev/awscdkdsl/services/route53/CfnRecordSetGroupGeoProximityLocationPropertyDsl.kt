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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnRecordSetGroup

/**
 * (Resource record sets only): A complex type that lets you specify where your resources are
 * located.
 *
 * Only one of `LocalZoneGroup` , `Coordinates` , or `AWS Region` is allowed per request at a time.
 *
 * For more information about geoproximity routing, see
 * [Geoproximity routing](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy-geoproximity.html)
 * in the *Amazon Route 53 Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * GeoProximityLocationProperty geoProximityLocationProperty =
 * GeoProximityLocationProperty.builder()
 * .awsRegion("awsRegion")
 * .bias(123)
 * .coordinates(CoordinatesProperty.builder()
 * .latitude("latitude")
 * .longitude("longitude")
 * .build())
 * .localZoneGroup("localZoneGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-recordsetgroup-geoproximitylocation.html)
 */
@CdkDslMarker
public class CfnRecordSetGroupGeoProximityLocationPropertyDsl {
    private val cdkBuilder: CfnRecordSetGroup.GeoProximityLocationProperty.Builder =
        CfnRecordSetGroup.GeoProximityLocationProperty.builder()

    /** @param awsRegion The AWS Region the resource you are directing DNS traffic to, is in. */
    public fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
    }

    /**
     * @param bias The bias increases or decreases the size of the geographic region from which
     *   Route 53 routes traffic to a resource. To use `Bias` to change the size of the geographic
     *   region, specify the applicable value for the bias:
     * * To expand the size of the geographic region from which Route 53 routes traffic to a
     *   resource, specify a positive integer from 1 to 99 for the bias. Route 53 shrinks the size
     *   of adjacent regions.
     * * To shrink the size of the geographic region from which Route 53 routes traffic to a
     *   resource, specify a negative bias of -1 to -99. Route 53 expands the size of adjacent
     *   regions.
     */
    public fun bias(bias: Number) {
        cdkBuilder.bias(bias)
    }

    /** @param coordinates Contains the longitude and latitude for a geographic region. */
    public fun coordinates(coordinates: IResolvable) {
        cdkBuilder.coordinates(coordinates)
    }

    /** @param coordinates Contains the longitude and latitude for a geographic region. */
    public fun coordinates(coordinates: CfnRecordSetGroup.CoordinatesProperty) {
        cdkBuilder.coordinates(coordinates)
    }

    /**
     * @param localZoneGroup Specifies an AWS Local Zone Group. A local Zone Group is usually the
     *   Local Zone code without the ending character. For example, if the Local Zone is
     *   `us-east-1-bue-1a` the Local Zone Group is `us-east-1-bue-1` .
     *
     * You can identify the Local Zones Group for a specific Local Zone by using the
     * [describe-availability-zones](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-availability-zones.html)
     * CLI command:
     *
     * This command returns: `"GroupName": "us-west-2-den-1"` , specifying that the Local Zone
     * `us-west-2-den-1a` belongs to the Local Zone Group `us-west-2-den-1` .
     */
    public fun localZoneGroup(localZoneGroup: String) {
        cdkBuilder.localZoneGroup(localZoneGroup)
    }

    public fun build(): CfnRecordSetGroup.GeoProximityLocationProperty = cdkBuilder.build()
}
