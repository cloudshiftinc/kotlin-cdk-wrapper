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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appstream.CfnFleet

/**
 * The desired capacity for a fleet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * ComputeCapacityProperty computeCapacityProperty = ComputeCapacityProperty.builder()
 * .desiredInstances(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html)
 */
@CdkDslMarker
public class CfnFleetComputeCapacityPropertyDsl {
    private val cdkBuilder: CfnFleet.ComputeCapacityProperty.Builder =
        CfnFleet.ComputeCapacityProperty.builder()

    /** @param desiredInstances The desired number of streaming instances. */
    public fun desiredInstances(desiredInstances: Number) {
        cdkBuilder.desiredInstances(desiredInstances)
    }

    public fun build(): CfnFleet.ComputeCapacityProperty = cdkBuilder.build()
}
