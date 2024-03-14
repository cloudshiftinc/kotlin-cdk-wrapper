package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.IPlacementGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.InstanceClass
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List

public interface IManagedEc2EcsComputeEnvironment : IManagedComputeEnvironment {
  /**
   * Add an instance class to this compute environment.
   *
   * @param instanceClass 
   */
  public fun addInstanceClass(instanceClass: InstanceClass)

  /**
   * Add an instance type to this compute environment.
   *
   * @param instanceType 
   */
  public fun addInstanceType(instanceType: InstanceType)

  /**
   * The allocation strategy to use if not enough instances of the best fitting instance type can be
   * allocated.
   *
   * Default: - `BEST_FIT_PROGRESSIVE` if not using Spot instances,
   * `SPOT_CAPACITY_OPTIMIZED` if using Spot instances.
   */
  public fun allocationStrategy(): AllocationStrategy? =
      unwrap(this).getAllocationStrategy()?.let(AllocationStrategy::wrap)

  /**
   * Configure which AMIs this Compute Environment can launch.
   *
   * Leave this `undefined` to allow Batch to choose the latest AMIs it supports for each instance
   * that it launches.
   *
   * Default: - ECS_AL2 compatible AMI ids for non-GPU instances, ECS_AL2_NVIDIA compatible AMI ids
   * for GPU instances
   */
  public fun images(): List<EcsMachineImage> = unwrap(this).getImages()?.map(EcsMachineImage::wrap)
      ?: emptyList()

  /**
   * The instance classes that this Compute Environment can launch.
   *
   * Which one is chosen depends on the `AllocationStrategy` used.
   * Batch will automatically choose the size.
   */
  public fun instanceClasses(): List<InstanceClass>

  /**
   * The execution Role that instances launched by this Compute Environment will use.
   *
   * Default: - a role will be created
   */
  public fun instanceRole(): IRole? = unwrap(this).getInstanceRole()?.let(IRole::wrap)

  /**
   * The instance types that this Compute Environment can launch.
   *
   * Which one is chosen depends on the `AllocationStrategy` used.
   */
  public fun instanceTypes(): List<InstanceType>

  /**
   * The Launch Template that this Compute Environment will use to provision EC2 Instances.
   *
   * *Note*: if `securityGroups` is specified on both your
   * launch template and this Compute Environment, **the
   * `securityGroup`s on the Compute Environment override the
   * ones on the launch template.
   *
   * Default: no launch template
   */
  public fun launchTemplate(): ILaunchTemplate? =
      unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

  /**
   * The minimum vCPUs that an environment should maintain, even if the compute environment is
   * DISABLED.
   *
   * Default: 0
   */
  public fun minvCpus(): Number? = unwrap(this).getMinvCpus()

  /**
   * The EC2 placement group to associate with your compute resources.
   *
   * If you intend to submit multi-node parallel jobs to this Compute Environment,
   * you should consider creating a cluster placement group and associate it with your compute
   * resources.
   * This keeps your multi-node parallel job on a logical grouping of instances
   * within a single Availability Zone with high network flow potential.
   *
   * Default: - no placement group
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html)
   */
  public fun placementGroup(): IPlacementGroup? =
      unwrap(this).getPlacementGroup()?.let(IPlacementGroup::wrap)

  /**
   * The maximum percentage that a Spot Instance price can be when compared with the On-Demand price
   * for that instance type before instances are launched.
   *
   * For example, if your maximum percentage is 20%, the Spot price must be
   * less than 20% of the current On-Demand price for that Instance.
   * You always pay the lowest market price and never more than your maximum percentage.
   * For most use cases, Batch recommends leaving this field empty.
   *
   * Default: - 100%
   */
  public fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

  /**
   * The service-linked role that Spot Fleet needs to launch instances on your behalf.
   *
   * Default: - a new Role will be created
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html)
   */
  public fun spotFleetRole(): IRole? = unwrap(this).getSpotFleetRole()?.let(IRole::wrap)

  /**
   * Whether or not to use batch's optimal instance type.
   *
   * The optimal instance type is equivalent to adding the
   * C4, M4, and R4 instance classes. You can specify other instance classes
   * (of the same architecture) in addition to the optimal instance classes.
   *
   * Default: true
   */
  public fun useOptimalInstanceClasses(): Boolean? = unwrap(this).getUseOptimalInstanceClasses()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IManagedEc2EcsComputeEnvironment,
  ) : CdkObject(cdkObject), IManagedEc2EcsComputeEnvironment {
    /**
     * Add an instance class to this compute environment.
     *
     * @param instanceClass 
     */
    override fun addInstanceClass(instanceClass: InstanceClass) {
      unwrap(this).addInstanceClass(instanceClass.let(InstanceClass::unwrap))
    }

    /**
     * Add an instance type to this compute environment.
     *
     * @param instanceType 
     */
    override fun addInstanceType(instanceType: InstanceType) {
      unwrap(this).addInstanceType(instanceType.let(InstanceType::unwrap))
    }

    /**
     * The allocation strategy to use if not enough instances of the best fitting instance type can
     * be allocated.
     *
     * Default: - `BEST_FIT_PROGRESSIVE` if not using Spot instances,
     * `SPOT_CAPACITY_OPTIMIZED` if using Spot instances.
     */
    override fun allocationStrategy(): AllocationStrategy? =
        unwrap(this).getAllocationStrategy()?.let(AllocationStrategy::wrap)

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The ARN of this compute environment.
     */
    override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

    /**
     * The name of the ComputeEnvironment.
     */
    override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    /**
     * Whether or not this ComputeEnvironment can accept jobs from a Queue.
     *
     * Enabled ComputeEnvironments can accept jobs from a Queue and
     * can scale instances up or down.
     * Disabled ComputeEnvironments cannot accept jobs from a Queue or
     * scale instances up or down.
     *
     * If you change a ComputeEnvironment from enabled to disabled while it is executing jobs,
     * Jobs in the `STARTED` or `RUNNING` states will not
     * be interrupted. As jobs complete, the ComputeEnvironment will scale instances down to
     * `minvCpus`.
     *
     * To ensure you aren't billed for unused capacity, set `minvCpus` to `0`.
     */
    override fun enabled(): Boolean = unwrap(this).getEnabled()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Configure which AMIs this Compute Environment can launch.
     *
     * Leave this `undefined` to allow Batch to choose the latest AMIs it supports for each instance
     * that it launches.
     *
     * Default: - ECS_AL2 compatible AMI ids for non-GPU instances, ECS_AL2_NVIDIA compatible AMI
     * ids for GPU instances
     */
    override fun images(): List<EcsMachineImage> =
        unwrap(this).getImages()?.map(EcsMachineImage::wrap) ?: emptyList()

    /**
     * The instance classes that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     * Batch will automatically choose the size.
     */
    override fun instanceClasses(): List<InstanceClass> =
        unwrap(this).getInstanceClasses().map(InstanceClass::wrap)

    /**
     * The execution Role that instances launched by this Compute Environment will use.
     *
     * Default: - a role will be created
     */
    override fun instanceRole(): IRole? = unwrap(this).getInstanceRole()?.let(IRole::wrap)

    /**
     * The instance types that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     */
    override fun instanceTypes(): List<InstanceType> =
        unwrap(this).getInstanceTypes().map(InstanceType::wrap)

    /**
     * The Launch Template that this Compute Environment will use to provision EC2 Instances.
     *
     * *Note*: if `securityGroups` is specified on both your
     * launch template and this Compute Environment, **the
     * `securityGroup`s on the Compute Environment override the
     * ones on the launch template.
     *
     * Default: no launch template
     */
    override fun launchTemplate(): ILaunchTemplate? =
        unwrap(this).getLaunchTemplate()?.let(ILaunchTemplate::wrap)

    /**
     * The maximum vCpus this `ManagedComputeEnvironment` can scale up to.
     *
     * *Note*: if this Compute Environment uses EC2 resources (not Fargate) with either
     * `AllocationStrategy.BEST_FIT_PROGRESSIVE` or
     * `AllocationStrategy.SPOT_CAPACITY_OPTIMIZED`, or `AllocationStrategy.BEST_FIT` with Spot
     * instances,
     * The scheduler may exceed this number by at most one of the instances specified in
     * `instanceTypes`
     * or `instanceClasses`.
     */
    override fun maxvCpus(): Number = unwrap(this).getMaxvCpus()

    /**
     * The minimum vCPUs that an environment should maintain, even if the compute environment is
     * DISABLED.
     *
     * Default: 0
     */
    override fun minvCpus(): Number? = unwrap(this).getMinvCpus()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The EC2 placement group to associate with your compute resources.
     *
     * If you intend to submit multi-node parallel jobs to this Compute Environment,
     * you should consider creating a cluster placement group and associate it with your compute
     * resources.
     * This keeps your multi-node parallel job on a logical grouping of instances
     * within a single Availability Zone with high network flow potential.
     *
     * Default: - no placement group
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html)
     */
    override fun placementGroup(): IPlacementGroup? =
        unwrap(this).getPlacementGroup()?.let(IPlacementGroup::wrap)

    /**
     * Specifies whether this Compute Environment is replaced if an update is made that requires
     * replacing its instances.
     *
     * To enable more properties to be updated,
     * set this property to `false`. When changing the value of this property to false,
     * do not change any other properties at the same time.
     * If other properties are changed at the same time,
     * and the change needs to be rolled back but it can't,
     * it's possible for the stack to go into the UPDATE_ROLLBACK_FAILED state.
     * You can't update a stack that is in the UPDATE_ROLLBACK_FAILED state.
     * However, if you can continue to roll it back,
     * you can return the stack to its original settings and then try to update it again.
     *
     * The properties which require a replacement of the Compute Environment are:
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html)
     */
    override fun replaceComputeEnvironment(): Boolean? = unwrap(this).getReplaceComputeEnvironment()

    /**
     * The security groups this Compute Environment will launch instances in.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)

    /**
     * The role Batch uses to perform actions on your behalf in your account, such as provision
     * instances to run your jobs.
     *
     * Default: - a serviceRole will be created for managed CEs, none for unmanaged CEs
     */
    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    /**
     * Whether or not to use spot instances.
     *
     * Spot instances are less expensive EC2 instances that can be
     * reclaimed by EC2 at any time; your job will be given two minutes
     * of notice before reclamation.
     *
     * Default: false
     */
    override fun spot(): Boolean? = unwrap(this).getSpot()

    /**
     * The maximum percentage that a Spot Instance price can be when compared with the On-Demand
     * price for that instance type before instances are launched.
     *
     * For example, if your maximum percentage is 20%, the Spot price must be
     * less than 20% of the current On-Demand price for that Instance.
     * You always pay the lowest market price and never more than your maximum percentage.
     * For most use cases, Batch recommends leaving this field empty.
     *
     * Default: - 100%
     */
    override fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

    /**
     * The service-linked role that Spot Fleet needs to launch instances on your behalf.
     *
     * Default: - a new Role will be created
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html)
     */
    override fun spotFleetRole(): IRole? = unwrap(this).getSpotFleetRole()?.let(IRole::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * TagManager to set, remove and format tags.
     */
    override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /**
     * Whether or not any running jobs will be immediately terminated when an infrastructure update
     * occurs.
     *
     * If this is enabled, any terminated jobs may be retried, depending on the job's
     * retry policy.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     */
    override fun terminateOnUpdate(): Boolean? = unwrap(this).getTerminateOnUpdate()

    /**
     * Only meaningful if `terminateOnUpdate` is `false`.
     *
     * If so,
     * when an infrastructure update is triggered, any running jobs
     * will be allowed to run until `updateTimeout` has expired.
     *
     * Default: 30 minutes
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
     */
    override fun updateTimeout(): Duration? = unwrap(this).getUpdateTimeout()?.let(Duration::wrap)

    /**
     * Whether or not the AMI is updated to the latest one supported by Batch when an infrastructure
     * update occurs.
     *
     * If you specify a specific AMI, this property will be ignored.
     *
     * Note: the CDK will never set this value by default, `false` will set by CFN.
     * This is to avoid a deployment failure that occurs when this value is set.
     *
     * Default: false
     *
     * [Documentation](https://github.com/aws/aws-cdk/issues/27054)
     */
    override fun updateToLatestImageVersion(): Boolean? =
        unwrap(this).getUpdateToLatestImageVersion()

    /**
     * Whether or not to use batch's optimal instance type.
     *
     * The optimal instance type is equivalent to adding the
     * C4, M4, and R4 instance classes. You can specify other instance classes
     * (of the same architecture) in addition to the optimal instance classes.
     *
     * Default: true
     */
    override fun useOptimalInstanceClasses(): Boolean? = unwrap(this).getUseOptimalInstanceClasses()

    /**
     * The VPC Subnets this Compute Environment will launch instances in.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.IManagedEc2EcsComputeEnvironment):
        IManagedEc2EcsComputeEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IManagedEc2EcsComputeEnvironment):
        software.amazon.awscdk.services.batch.IManagedEc2EcsComputeEnvironment = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.IManagedEc2EcsComputeEnvironment
  }
}
