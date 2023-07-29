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
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * The launch specification for Spot instances in the fleet, which determines the defined duration
 * and provisioning timeout behavior.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * InstanceFleetProvisioningSpecificationsProperty instanceFleetProvisioningSpecificationsProperty =
 * InstanceFleetProvisioningSpecificationsProperty.builder()
 * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
 * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().SWITCH_TO_ON_DEMAND)
 * .timeoutDurationMinutes(123)
 * // the properties below are optional
 * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
 * .blockDurationMinutes(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_InstanceFleetProvisioningSpecifications.html)
 */
@CdkDslMarker
public class EmrCreateClusterInstanceFleetProvisioningSpecificationsPropertyDsl {
    private val cdkBuilder:
        EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.Builder =
        EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.builder()

    /**
     * @param spotSpecification The launch specification for Spot instances in the fleet, which
     *   determines the defined duration and provisioning timeout behavior.
     */
    public fun spotSpecification(
        spotSpecification: EmrCreateClusterSpotProvisioningSpecificationPropertyDsl.() -> Unit = {}
    ) {
        val builder = EmrCreateClusterSpotProvisioningSpecificationPropertyDsl()
        builder.apply(spotSpecification)
        cdkBuilder.spotSpecification(builder.build())
    }

    /**
     * @param spotSpecification The launch specification for Spot instances in the fleet, which
     *   determines the defined duration and provisioning timeout behavior.
     */
    public fun spotSpecification(
        spotSpecification: EmrCreateCluster.SpotProvisioningSpecificationProperty
    ) {
        cdkBuilder.spotSpecification(spotSpecification)
    }

    public fun build(): EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty =
        cdkBuilder.build()
}
