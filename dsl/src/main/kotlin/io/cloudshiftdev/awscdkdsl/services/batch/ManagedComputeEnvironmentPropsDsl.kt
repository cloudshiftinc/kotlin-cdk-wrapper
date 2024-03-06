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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.batch.ManagedComputeEnvironmentProps
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole

/**
 * Props for a ManagedComputeEnvironment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.batch.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * ManagedComputeEnvironmentProps managedComputeEnvironmentProps =
 * ManagedComputeEnvironmentProps.builder()
 * .vpc(vpc)
 * // the properties below are optional
 * .computeEnvironmentName("computeEnvironmentName")
 * .enabled(false)
 * .maxvCpus(123)
 * .replaceComputeEnvironment(false)
 * .securityGroups(List.of(securityGroup))
 * .serviceRole(role)
 * .spot(false)
 * .terminateOnUpdate(false)
 * .updateTimeout(Duration.minutes(30))
 * .updateToLatestImageVersion(false)
 * .vpcSubnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ManagedComputeEnvironmentPropsDsl {
    private val cdkBuilder: ManagedComputeEnvironmentProps.Builder =
        ManagedComputeEnvironmentProps.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /** @param computeEnvironmentName The name of the ComputeEnvironment. */
    public fun computeEnvironmentName(computeEnvironmentName: String) {
        cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    /**
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue. Enabled
     *   ComputeEnvironments can accept jobs from a Queue and can scale instances up or down.
     *   Disabled ComputeEnvironments cannot accept jobs from a Queue or scale instances up or down.
     *
     * If you change a ComputeEnvironment from enabled to disabled while it is executing jobs, Jobs
     * in the `STARTED` or `RUNNING` states will not be interrupted. As jobs complete, the
     * ComputeEnvironment will scale instances down to `minvCpus`.
     *
     * To ensure you aren't billed for unused capacity, set `minvCpus` to `0`.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param maxvCpus The maximum vCpus this `ManagedComputeEnvironment` can scale up to. Each vCPU
     *   is equivalent to 1024 CPU shares. *Note*: if this Compute Environment uses EC2 resources
     *   (not Fargate) with either `AllocationStrategy.BEST_FIT_PROGRESSIVE` or
     *   `AllocationStrategy.SPOT_CAPACITY_OPTIMIZED`, or `AllocationStrategy.BEST_FIT` with Spot
     *   instances, The scheduler may exceed this number by at most one of the instances specified
     *   in `instanceTypes` or `instanceClasses`.
     */
    public fun maxvCpus(maxvCpus: Number) {
        cdkBuilder.maxvCpus(maxvCpus)
    }

    /**
     * @param replaceComputeEnvironment Specifies whether this Compute Environment is replaced if an
     *   update is made that requires replacing its instances. To enable more properties to be
     *   updated, set this property to `false`. When changing the value of this property to false,
     *   do not change any other properties at the same time. If other properties are changed at the
     *   same time, and the change needs to be rolled back but it can't, it's possible for the stack
     *   to go into the UPDATE_ROLLBACK_FAILED state. You can't update a stack that is in the
     *   UPDATE_ROLLBACK_FAILED state. However, if you can continue to roll it back, you can return
     *   the stack to its original settings and then try to update it again.
     *
     * The properties which require a replacement of the Compute Environment are:
     */
    public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
        cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
    }

    /**
     * @param securityGroups The security groups this Compute Environment will launch instances in.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups The security groups this Compute Environment will launch instances in.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     *   such as provision instances to run your jobs.
     */
    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * @param spot Whether or not to use spot instances. Spot instances are less expensive EC2
     *   instances that can be reclaimed by EC2 at any time; your job will be given two minutes of
     *   notice before reclamation.
     */
    public fun spot(spot: Boolean) {
        cdkBuilder.spot(spot)
    }

    /**
     * @param terminateOnUpdate Whether or not any running jobs will be immediately terminated when
     *   an infrastructure update occurs. If this is enabled, any terminated jobs may be retried,
     *   depending on the job's retry policy.
     */
    public fun terminateOnUpdate(terminateOnUpdate: Boolean) {
        cdkBuilder.terminateOnUpdate(terminateOnUpdate)
    }

    /**
     * @param updateTimeout Only meaningful if `terminateOnUpdate` is `false`. If so, when an
     *   infrastructure update is triggered, any running jobs will be allowed to run until
     *   `updateTimeout` has expired.
     */
    public fun updateTimeout(updateTimeout: Duration) {
        cdkBuilder.updateTimeout(updateTimeout)
    }

    /**
     * @param updateToLatestImageVersion Whether or not the AMI is updated to the latest one
     *   supported by Batch when an infrastructure update occurs. If you specify a specific AMI,
     *   this property will be ignored.
     */
    public fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean) {
        cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion)
    }

    /** @param vpc VPC in which this Compute Environment will launch Instances. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in. */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /** @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in. */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): ManagedComputeEnvironmentProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
