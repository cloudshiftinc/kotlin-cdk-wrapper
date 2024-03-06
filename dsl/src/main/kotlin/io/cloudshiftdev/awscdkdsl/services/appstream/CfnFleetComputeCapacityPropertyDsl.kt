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
 * .desiredSessions(123)
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

    /**
     * @param desiredSessions The desired capacity in terms of number of user sessions, for the
     *   multi-session fleet. This is not allowed for single-session fleets.
     *
     * When you create a fleet, you must set define either the DesiredSessions or DesiredInstances
     * attribute, based on the type of fleet you create. You can’t define both attributes or leave
     * both attributes blank.
     */
    public fun desiredSessions(desiredSessions: Number) {
        cdkBuilder.desiredSessions(desiredSessions)
    }

    public fun build(): CfnFleet.ComputeCapacityProperty = cdkBuilder.build()
}
