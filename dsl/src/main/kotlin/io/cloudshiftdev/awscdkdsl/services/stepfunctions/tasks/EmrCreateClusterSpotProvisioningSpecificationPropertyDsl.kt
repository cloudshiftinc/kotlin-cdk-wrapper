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
import kotlin.Deprecated
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * The launch specification for Spot instances in the instance fleet, which determines the defined
 * duration and provisioning timeout behavior.
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
     * @deprecated - Spot Instances with a defined duration (also known as Spot blocks) are no
     *   longer available to new customers from July 1, 2021. For customers who have previously used
     *   the feature, we will continue to support Spot Instances with a defined duration until
     *   December 31, 2022.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
    }

    /**
     * @param timeout The spot provisioning timeout period in minutes. The value must be between 5
     *   and 1440 minutes.
     *
     * You must specify one of `timeout` and `timeoutDurationMinutes`.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param timeoutAction The action to take when TargetSpotCapacity has not been fulfilled when
     *   the TimeoutDurationMinutes has expired.
     */
    public fun timeoutAction(timeoutAction: EmrCreateCluster.SpotTimeoutAction) {
        cdkBuilder.timeoutAction(timeoutAction)
    }

    /**
     * @param timeoutDurationMinutes The spot provisioning timeout period in minutes. The value must
     *   be between 5 and 1440 minutes.
     *
     * You must specify one of `timeout` and `timeoutDurationMinutes`.
     *
     * @deprecated - Use `timeout`.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
    }

    public fun build(): EmrCreateCluster.SpotProvisioningSpecificationProperty = cdkBuilder.build()
}
