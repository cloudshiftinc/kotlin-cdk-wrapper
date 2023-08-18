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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnFleet

/**
 * A remote location where a multi-location fleet can deploy game servers for game hosting.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * LocationConfigurationProperty locationConfigurationProperty =
 * LocationConfigurationProperty.builder()
 * .location("location")
 * // the properties below are optional
 * .locationCapacity(LocationCapacityProperty.builder()
 * .desiredEc2Instances(123)
 * .maxSize(123)
 * .minSize(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-locationconfiguration.html)
 */
@CdkDslMarker
public class CfnFleetLocationConfigurationPropertyDsl {
    private val cdkBuilder: CfnFleet.LocationConfigurationProperty.Builder =
        CfnFleet.LocationConfigurationProperty.builder()

    /** @param location An AWS Region code, such as `us-west-2` . */
    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    /**
     * @param locationCapacity Current resource capacity settings in a specified fleet or location.
     *   The location value might refer to a fleet's remote location or its home Region.
     *
     * *Related actions*
     *
     * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
     * |
     * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
     * |
     * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
     */
    public fun locationCapacity(locationCapacity: IResolvable) {
        cdkBuilder.locationCapacity(locationCapacity)
    }

    /**
     * @param locationCapacity Current resource capacity settings in a specified fleet or location.
     *   The location value might refer to a fleet's remote location or its home Region.
     *
     * *Related actions*
     *
     * [DescribeFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html)
     * |
     * [DescribeFleetLocationCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html)
     * |
     * [UpdateFleetCapacity](https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html)
     */
    public fun locationCapacity(locationCapacity: CfnFleet.LocationCapacityProperty) {
        cdkBuilder.locationCapacity(locationCapacity)
    }

    public fun build(): CfnFleet.LocationConfigurationProperty = cdkBuilder.build()
}
