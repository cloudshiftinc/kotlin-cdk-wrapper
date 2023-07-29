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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.gamelift.CfnFleet

/**
 * Current resource capacity settings in a specified fleet or location.
 *
 * The location value might refer to a fleet's remote location or its home Region.
 *
 * *Related actions*
 *
 * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
 * |
 * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
 * |
 * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * LocationCapacityProperty locationCapacityProperty = LocationCapacityProperty.builder()
 * .desiredEc2Instances(123)
 * .maxSize(123)
 * .minSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationcapacity.html)
 */
@CdkDslMarker
public class CfnFleetLocationCapacityPropertyDsl {
    private val cdkBuilder: CfnFleet.LocationCapacityProperty.Builder =
        CfnFleet.LocationCapacityProperty.builder()

    /**
     * @param desiredEc2Instances The number of Amazon EC2 instances you want to maintain in the
     *   specified fleet location. This value must fall between the minimum and maximum size limits.
     */
    public fun desiredEc2Instances(desiredEc2Instances: Number) {
        cdkBuilder.desiredEc2Instances(desiredEc2Instances)
    }

    /**
     * @param maxSize The maximum number of instances that are allowed in the specified fleet
     *   location. If this parameter is not set, the default is 1.
     */
    public fun maxSize(maxSize: Number) {
        cdkBuilder.maxSize(maxSize)
    }

    /**
     * @param minSize The minimum number of instances that are allowed in the specified fleet
     *   location. If this parameter is not set, the default is 0.
     */
    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    public fun build(): CfnFleet.LocationCapacityProperty = cdkBuilder.build()
}
