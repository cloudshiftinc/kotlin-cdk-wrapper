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
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * The launch specification for On-Demand Instances in the instance fleet, which determines the
 * allocation strategy.
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
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-ondemandprovisioningspecification.html)
 */
@CdkDslMarker
public class EmrCreateClusterOnDemandProvisioningSpecificationPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.OnDemandProvisioningSpecificationProperty.Builder =
        EmrCreateCluster.OnDemandProvisioningSpecificationProperty.builder()

    /**
     * @param allocationStrategy Specifies the strategy to use in launching On-Demand instance
     *   fleets.
     *
     * Currently, the only option is lowest-price (the default), which launches the lowest price
     * first.
     */
    public fun allocationStrategy(allocationStrategy: EmrCreateCluster.OnDemandAllocationStrategy) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    public fun build(): EmrCreateCluster.OnDemandProvisioningSpecificationProperty =
        cdkBuilder.build()
}
