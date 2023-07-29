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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * The launch specification for Spot instances in the instance fleet, which determines the defined
 * duration and provisioning timeout behavior.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * SpotProvisioningSpecificationProperty spotProvisioningSpecificationProperty =
 * SpotProvisioningSpecificationProperty.builder()
 * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().SWITCH_TO_ON_DEMAND)
 * .timeoutDurationMinutes(123)
 * // the properties below are optional
 * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
 * .blockDurationMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_SpotProvisioningSpecification.html)
 */
@CdkDslMarker
public class EmrCreateClusterSpotProvisioningSpecificationPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.SpotProvisioningSpecificationProperty.Builder =
        EmrCreateCluster.SpotProvisioningSpecificationProperty.builder()

    /**
     * @param allocationStrategy Specifies the strategy to use in launching Spot Instance fleets.
     */
    public fun allocationStrategy(allocationStrategy: EmrCreateCluster.SpotAllocationStrategy) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    /**
     * @param blockDurationMinutes The defined duration for Spot instances (also known as Spot
     *   blocks) in minutes.
     */
    public fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
    }

    /**
     * @param timeoutAction The action to take when TargetSpotCapacity has not been fulfilled when
     *   the TimeoutDurationMinutes has expired.
     */
    public fun timeoutAction(timeoutAction: EmrCreateCluster.SpotTimeoutAction) {
        cdkBuilder.timeoutAction(timeoutAction)
    }

    /** @param timeoutDurationMinutes The spot provisioning timeout period in minutes. */
    public fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
    }

    public fun build(): EmrCreateCluster.SpotProvisioningSpecificationProperty = cdkBuilder.build()
}
