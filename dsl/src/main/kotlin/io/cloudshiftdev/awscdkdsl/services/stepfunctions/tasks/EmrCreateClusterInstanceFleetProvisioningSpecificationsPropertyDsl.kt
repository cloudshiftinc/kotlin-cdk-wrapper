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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * The launch specification for On-Demand and Spot instances in the fleet, which determines the
 * defined duration and provisioning timeout behavior, and allocation strategy.
 *
 * The instance fleet configuration is available only in Amazon EMR releases 4.8.0 and later,
 * excluding 5.0.x versions. On-Demand and Spot instance allocation strategies are available in
 * Amazon EMR releases 5.12.1 and later.
 *
 * Example:
 * ```
 * EmrCreateCluster.Builder.create(this, "OnDemandSpecification")
 * .instances(InstancesConfigProperty.builder()
 * .instanceFleets(List.of(InstanceFleetConfigProperty.builder()
 * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
 * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
 * .onDemandSpecification(OnDemandProvisioningSpecificationProperty.builder()
 * .allocationStrategy(EmrCreateCluster.getOnDemandAllocationStrategy().LOWEST_PRICE)
 * .build())
 * .build())
 * .build()))
 * .build())
 * .name("OnDemandCluster")
 * .integrationPattern(IntegrationPattern.RUN_JOB)
 * .build();
 * EmrCreateCluster.Builder.create(this, "SpotSpecification")
 * .instances(InstancesConfigProperty.builder()
 * .instanceFleets(List.of(InstanceFleetConfigProperty.builder()
 * .instanceFleetType(EmrCreateCluster.getInstanceRoleType().MASTER)
 * .launchSpecifications(InstanceFleetProvisioningSpecificationsProperty.builder()
 * .spotSpecification(SpotProvisioningSpecificationProperty.builder()
 * .allocationStrategy(EmrCreateCluster.getSpotAllocationStrategy().CAPACITY_OPTIMIZED)
 * .timeoutAction(EmrCreateCluster.getSpotTimeoutAction().TERMINATE_CLUSTER)
 * .timeout(Duration.minutes(5))
 * .build())
 * .build())
 * .build()))
 * .build())
 * .name("SpotCluster")
 * .integrationPattern(IntegrationPattern.RUN_JOB)
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
     * @param onDemandSpecification The launch specification for On-Demand Instances in the instance
     *   fleet, which determines the allocation strategy. The instance fleet configuration is
     *   available only in Amazon EMR releases 4.8.0 and later, excluding 5.0.x versions. On-Demand
     *   Instances allocation strategy is available in Amazon EMR releases 5.12.1 and later.
     */
    public fun onDemandSpecification(
        onDemandSpecification:
            EmrCreateClusterOnDemandProvisioningSpecificationPropertyDsl.() -> Unit =
            {}
    ) {
        val builder = EmrCreateClusterOnDemandProvisioningSpecificationPropertyDsl()
        builder.apply(onDemandSpecification)
        cdkBuilder.onDemandSpecification(builder.build())
    }

    /**
     * @param onDemandSpecification The launch specification for On-Demand Instances in the instance
     *   fleet, which determines the allocation strategy. The instance fleet configuration is
     *   available only in Amazon EMR releases 4.8.0 and later, excluding 5.0.x versions. On-Demand
     *   Instances allocation strategy is available in Amazon EMR releases 5.12.1 and later.
     */
    public fun onDemandSpecification(
        onDemandSpecification: EmrCreateCluster.OnDemandProvisioningSpecificationProperty
    ) {
        cdkBuilder.onDemandSpecification(onDemandSpecification)
    }

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
