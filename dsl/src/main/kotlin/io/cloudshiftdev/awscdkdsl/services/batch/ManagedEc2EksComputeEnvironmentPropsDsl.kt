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
import software.amazon.awscdk.services.batch.AllocationStrategy
import software.amazon.awscdk.services.batch.EksMachineImage
import software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironmentProps
import software.amazon.awscdk.services.ec2.ILaunchTemplate
import software.amazon.awscdk.services.ec2.IPlacementGroup
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InstanceClass
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.iam.IRole

/**
 * Props for a ManagedEc2EksComputeEnvironment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.batch.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.eks.*;
 * import software.amazon.awscdk.services.iam.*;
 * Cluster cluster;
 * InstanceType instanceType;
 * LaunchTemplate launchTemplate;
 * IMachineImage machineImage;
 * PlacementGroup placementGroup;
 * Role role;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * ManagedEc2EksComputeEnvironmentProps managedEc2EksComputeEnvironmentProps =
 * ManagedEc2EksComputeEnvironmentProps.builder()
 * .eksCluster(cluster)
 * .kubernetesNamespace("kubernetesNamespace")
 * .vpc(vpc)
 * // the properties below are optional
 * .allocationStrategy(AllocationStrategy.BEST_FIT)
 * .computeEnvironmentName("computeEnvironmentName")
 * .enabled(false)
 * .images(List.of(EksMachineImage.builder()
 * .image(machineImage)
 * .imageType(EksMachineImageType.EKS_AL2)
 * .build()))
 * .instanceClasses(List.of(InstanceClass.STANDARD3))
 * .instanceRole(role)
 * .instanceTypes(List.of(instanceType))
 * .launchTemplate(launchTemplate)
 * .maxvCpus(123)
 * .minvCpus(123)
 * .placementGroup(placementGroup)
 * .replaceComputeEnvironment(false)
 * .securityGroups(List.of(securityGroup))
 * .serviceRole(role)
 * .spot(false)
 * .spotBidPercentage(123)
 * .terminateOnUpdate(false)
 * .updateTimeout(Duration.minutes(30))
 * .updateToLatestImageVersion(false)
 * .useOptimalInstanceClasses(false)
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
public class ManagedEc2EksComputeEnvironmentPropsDsl {
    private val cdkBuilder: ManagedEc2EksComputeEnvironmentProps.Builder =
        ManagedEc2EksComputeEnvironmentProps.builder()

    private val _images: MutableList<EksMachineImage> = mutableListOf()

    private val _instanceClasses: MutableList<InstanceClass> = mutableListOf()

    private val _instanceTypes: MutableList<InstanceType> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param allocationStrategy The allocation strategy to use if not enough instances of the best
     *   fitting instance type can be allocated.
     */
    public fun allocationStrategy(allocationStrategy: AllocationStrategy) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    /** @param computeEnvironmentName The name of the ComputeEnvironment. */
    public fun computeEnvironmentName(computeEnvironmentName: String) {
        cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    /**
     * @param eksCluster The cluster that backs this Compute Environment. Required for Compute
     *   Environments running Kubernetes jobs. Please ensure that you have followed the steps at
     *
     * https://docs.aws.amazon.com/batch/latest/userguide/getting-started-eks.html
     *
     * before attempting to deploy a `ManagedEc2EksComputeEnvironment` that uses this cluster. If
     * you do not follow the steps in the link, the deployment fail with a message that the compute
     * environment did not stabilize.
     */
    public fun eksCluster(eksCluster: ICluster) {
        cdkBuilder.eksCluster(eksCluster)
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

    /** @param images Configure which AMIs this Compute Environment can launch. */
    public fun images(images: EksMachineImageDsl.() -> Unit) {
        _images.add(EksMachineImageDsl().apply(images).build())
    }

    /** @param images Configure which AMIs this Compute Environment can launch. */
    public fun images(images: Collection<EksMachineImage>) {
        _images.addAll(images)
    }

    /**
     * @param instanceClasses The instance types that this Compute Environment can launch. Which one
     *   is chosen depends on the `AllocationStrategy` used. Batch will automatically choose the
     *   instance size.
     */
    public fun instanceClasses(vararg instanceClasses: InstanceClass) {
        _instanceClasses.addAll(listOf(*instanceClasses))
    }

    /**
     * @param instanceClasses The instance types that this Compute Environment can launch. Which one
     *   is chosen depends on the `AllocationStrategy` used. Batch will automatically choose the
     *   instance size.
     */
    public fun instanceClasses(instanceClasses: Collection<InstanceClass>) {
        _instanceClasses.addAll(instanceClasses)
    }

    /**
     * @param instanceRole The execution Role that instances launched by this Compute Environment
     *   will use.
     */
    public fun instanceRole(instanceRole: IRole) {
        cdkBuilder.instanceRole(instanceRole)
    }

    /**
     * @param instanceTypes The instance types that this Compute Environment can launch. Which one
     *   is chosen depends on the `AllocationStrategy` used.
     */
    public fun instanceTypes(vararg instanceTypes: InstanceType) {
        _instanceTypes.addAll(listOf(*instanceTypes))
    }

    /**
     * @param instanceTypes The instance types that this Compute Environment can launch. Which one
     *   is chosen depends on the `AllocationStrategy` used.
     */
    public fun instanceTypes(instanceTypes: Collection<InstanceType>) {
        _instanceTypes.addAll(instanceTypes)
    }

    /** @param kubernetesNamespace The namespace of the Cluster. */
    public fun kubernetesNamespace(kubernetesNamespace: String) {
        cdkBuilder.kubernetesNamespace(kubernetesNamespace)
    }

    /**
     * @param launchTemplate The Launch Template that this Compute Environment will use to provision
     *   EC2 Instances. *Note*: if `securityGroups` is specified on both your launch template and
     *   this Compute Environment, **the `securityGroup`s on the Compute Environment override the
     *   ones on the launch template.**
     */
    public fun launchTemplate(launchTemplate: ILaunchTemplate) {
        cdkBuilder.launchTemplate(launchTemplate)
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
     * @param minvCpus The minimum vCPUs that an environment should maintain, even if the compute
     *   environment is DISABLED.
     */
    public fun minvCpus(minvCpus: Number) {
        cdkBuilder.minvCpus(minvCpus)
    }

    /**
     * @param placementGroup The EC2 placement group to associate with your compute resources. If
     *   you intend to submit multi-node parallel jobs to this Compute Environment, you should
     *   consider creating a cluster placement group and associate it with your compute resources.
     *   This keeps your multi-node parallel job on a logical grouping of instances within a single
     *   Availability Zone with high network flow potential.
     */
    public fun placementGroup(placementGroup: IPlacementGroup) {
        cdkBuilder.placementGroup(placementGroup)
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
     * @param spotBidPercentage The maximum percentage that a Spot Instance price can be when
     *   compared with the On-Demand price for that instance type before instances are launched. For
     *   example, if your maximum percentage is 20%, the Spot price must be less than 20% of the
     *   current On-Demand price for that Instance. You always pay the lowest market price and never
     *   more than your maximum percentage. For most use cases, Batch recommends leaving this field
     *   empty.
     *
     * Implies `spot == true` if set
     */
    public fun spotBidPercentage(spotBidPercentage: Number) {
        cdkBuilder.spotBidPercentage(spotBidPercentage)
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

    /**
     * @param useOptimalInstanceClasses Whether or not to use batch's optimal instance type. The
     *   optimal instance type is equivalent to adding the C4, M4, and R4 instance classes. You can
     *   specify other instance classes (of the same architecture) in addition to the optimal
     *   instance classes.
     */
    public fun useOptimalInstanceClasses(useOptimalInstanceClasses: Boolean) {
        cdkBuilder.useOptimalInstanceClasses(useOptimalInstanceClasses)
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

    public fun build(): ManagedEc2EksComputeEnvironmentProps {
        if (_images.isNotEmpty()) cdkBuilder.images(_images)
        if (_instanceClasses.isNotEmpty()) cdkBuilder.instanceClasses(_instanceClasses)
        if (_instanceTypes.isNotEmpty()) cdkBuilder.instanceTypes(_instanceTypes)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
