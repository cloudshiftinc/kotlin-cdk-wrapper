@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.IPlacementGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceClass
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Props for a ManagedEc2EcsComputeEnvironment.
 *
 * Example:
 *
 * ```
 * IManagedEc2EcsComputeEnvironment computeEnv;
 * Vpc vpc = new Vpc(this, "VPC");
 * computeEnv.addInstanceClass(InstanceClass.M5AD);
 * // Or, specify it on the constructor:
 * // Or, specify it on the constructor:
 * ManagedEc2EcsComputeEnvironment.Builder.create(this, "myEc2ComputeEnv")
 * .vpc(vpc)
 * .instanceClasses(List.of(InstanceClass.R4))
 * .build();
 * ```
 */
public interface ManagedEc2EcsComputeEnvironmentProps : ManagedComputeEnvironmentProps {
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
   * If you specify this property with only `image` specified, then the
   * `imageType` will default to `ECS_AL2`. *If your image needs GPU resources,
   * specify `ECS_AL2_NVIDIA`; otherwise, the instances will not be able to properly
   * join the ComputeEnvironment*.
   *
   * Default: - ECS_AL2 for non-GPU instances, ECS_AL2_NVIDIA for GPU instances
   */
  public fun images(): List<EcsMachineImage> = unwrap(this).getImages()?.map(EcsMachineImage::wrap)
      ?: emptyList()

  /**
   * The instance classes that this Compute Environment can launch.
   *
   * Which one is chosen depends on the `AllocationStrategy` used.
   * Batch will automatically choose the instance size.
   *
   * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
   */
  public fun instanceClasses(): List<InstanceClass> =
      unwrap(this).getInstanceClasses()?.map(InstanceClass::wrap) ?: emptyList()

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
   *
   * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
   */
  public fun instanceTypes(): List<InstanceType> =
      unwrap(this).getInstanceTypes()?.map(InstanceType::wrap) ?: emptyList()

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
   * Implies `spot == true` if set
   *
   * Default: 100%
   */
  public fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

  /**
   * The service-linked role that Spot Fleet needs to launch instances on your behalf.
   *
   * Default: - a new role will be created
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

  /**
   * A builder for [ManagedEc2EcsComputeEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocationStrategy The allocation strategy to use if not enough instances of the best
     * fitting instance type can be allocated.
     */
    public fun allocationStrategy(allocationStrategy: AllocationStrategy)

    /**
     * @param computeEnvironmentName The name of the ComputeEnvironment.
     */
    public fun computeEnvironmentName(computeEnvironmentName: String)

    /**
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue.
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
    public fun enabled(enabled: Boolean)

    /**
     * @param images Configure which AMIs this Compute Environment can launch.
     * If you specify this property with only `image` specified, then the
     * `imageType` will default to `ECS_AL2`. *If your image needs GPU resources,
     * specify `ECS_AL2_NVIDIA`; otherwise, the instances will not be able to properly
     * join the ComputeEnvironment*.
     */
    public fun images(images: List<EcsMachineImage>)

    /**
     * @param images Configure which AMIs this Compute Environment can launch.
     * If you specify this property with only `image` specified, then the
     * `imageType` will default to `ECS_AL2`. *If your image needs GPU resources,
     * specify `ECS_AL2_NVIDIA`; otherwise, the instances will not be able to properly
     * join the ComputeEnvironment*.
     */
    public fun images(vararg images: EcsMachineImage)

    /**
     * @param instanceClasses The instance classes that this Compute Environment can launch.
     * Which one is chosen depends on the `AllocationStrategy` used.
     * Batch will automatically choose the instance size.
     */
    public fun instanceClasses(instanceClasses: List<InstanceClass>)

    /**
     * @param instanceClasses The instance classes that this Compute Environment can launch.
     * Which one is chosen depends on the `AllocationStrategy` used.
     * Batch will automatically choose the instance size.
     */
    public fun instanceClasses(vararg instanceClasses: InstanceClass)

    /**
     * @param instanceRole The execution Role that instances launched by this Compute Environment
     * will use.
     */
    public fun instanceRole(instanceRole: IRole)

    /**
     * @param instanceTypes The instance types that this Compute Environment can launch.
     * Which one is chosen depends on the `AllocationStrategy` used.
     */
    public fun instanceTypes(instanceTypes: List<InstanceType>)

    /**
     * @param instanceTypes The instance types that this Compute Environment can launch.
     * Which one is chosen depends on the `AllocationStrategy` used.
     */
    public fun instanceTypes(vararg instanceTypes: InstanceType)

    /**
     * @param launchTemplate The Launch Template that this Compute Environment will use to provision
     * EC2 Instances.
     * *Note*: if `securityGroups` is specified on both your
     * launch template and this Compute Environment, **the
     * `securityGroup`s on the Compute Environment override the
     * ones on the launch template.
     */
    public fun launchTemplate(launchTemplate: ILaunchTemplate)

    /**
     * @param maxvCpus The maximum vCpus this `ManagedComputeEnvironment` can scale up to. Each vCPU
     * is equivalent to 1024 CPU shares.
     * *Note*: if this Compute Environment uses EC2 resources (not Fargate) with either
     * `AllocationStrategy.BEST_FIT_PROGRESSIVE` or
     * `AllocationStrategy.SPOT_CAPACITY_OPTIMIZED`, or `AllocationStrategy.BEST_FIT` with Spot
     * instances,
     * The scheduler may exceed this number by at most one of the instances specified in
     * `instanceTypes`
     * or `instanceClasses`.
     */
    public fun maxvCpus(maxvCpus: Number)

    /**
     * @param minvCpus The minimum vCPUs that an environment should maintain, even if the compute
     * environment is DISABLED.
     */
    public fun minvCpus(minvCpus: Number)

    /**
     * @param placementGroup The EC2 placement group to associate with your compute resources.
     * If you intend to submit multi-node parallel jobs to this Compute Environment,
     * you should consider creating a cluster placement group and associate it with your compute
     * resources.
     * This keeps your multi-node parallel job on a logical grouping of instances
     * within a single Availability Zone with high network flow potential.
     */
    public fun placementGroup(placementGroup: IPlacementGroup)

    /**
     * @param replaceComputeEnvironment Specifies whether this Compute Environment is replaced if an
     * update is made that requires replacing its instances.
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
     */
    public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean)

    /**
     * @param securityGroups The security groups this Compute Environment will launch instances in.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups this Compute Environment will launch instances in.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     * such as provision instances to run your jobs.
     */
    public fun serviceRole(serviceRole: IRole)

    /**
     * @param spot Whether or not to use spot instances.
     * Spot instances are less expensive EC2 instances that can be
     * reclaimed by EC2 at any time; your job will be given two minutes
     * of notice before reclamation.
     */
    public fun spot(spot: Boolean)

    /**
     * @param spotBidPercentage The maximum percentage that a Spot Instance price can be when
     * compared with the On-Demand price for that instance type before instances are launched.
     * For example, if your maximum percentage is 20%, the Spot price must be
     * less than 20% of the current On-Demand price for that Instance.
     * You always pay the lowest market price and never more than your maximum percentage.
     * For most use cases, Batch recommends leaving this field empty.
     *
     * Implies `spot == true` if set
     */
    public fun spotBidPercentage(spotBidPercentage: Number)

    /**
     * @param spotFleetRole The service-linked role that Spot Fleet needs to launch instances on
     * your behalf.
     */
    public fun spotFleetRole(spotFleetRole: IRole)

    /**
     * @param terminateOnUpdate Whether or not any running jobs will be immediately terminated when
     * an infrastructure update occurs.
     * If this is enabled, any terminated jobs may be retried, depending on the job's
     * retry policy.
     */
    public fun terminateOnUpdate(terminateOnUpdate: Boolean)

    /**
     * @param updateTimeout Only meaningful if `terminateOnUpdate` is `false`.
     * If so,
     * when an infrastructure update is triggered, any running jobs
     * will be allowed to run until `updateTimeout` has expired.
     */
    public fun updateTimeout(updateTimeout: Duration)

    /**
     * @param updateToLatestImageVersion Whether or not the AMI is updated to the latest one
     * supported by Batch when an infrastructure update occurs.
     * If you specify a specific AMI, this property will be ignored.
     */
    public fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean)

    /**
     * @param useOptimalInstanceClasses Whether or not to use batch's optimal instance type.
     * The optimal instance type is equivalent to adding the
     * C4, M4, and R4 instance classes. You can specify other instance classes
     * (of the same architecture) in addition to the optimal instance classes.
     */
    public fun useOptimalInstanceClasses(useOptimalInstanceClasses: Boolean)

    /**
     * @param vpc VPC in which this Compute Environment will launch Instances. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d2612bc97625ac6a51bd6b731bebbe96f032039b1275643f9d4f910aa8d6f19")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps.Builder =
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps.builder()

    /**
     * @param allocationStrategy The allocation strategy to use if not enough instances of the best
     * fitting instance type can be allocated.
     */
    override fun allocationStrategy(allocationStrategy: AllocationStrategy) {
      cdkBuilder.allocationStrategy(allocationStrategy.let(AllocationStrategy::unwrap))
    }

    /**
     * @param computeEnvironmentName The name of the ComputeEnvironment.
     */
    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    /**
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue.
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
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param images Configure which AMIs this Compute Environment can launch.
     * If you specify this property with only `image` specified, then the
     * `imageType` will default to `ECS_AL2`. *If your image needs GPU resources,
     * specify `ECS_AL2_NVIDIA`; otherwise, the instances will not be able to properly
     * join the ComputeEnvironment*.
     */
    override fun images(images: List<EcsMachineImage>) {
      cdkBuilder.images(images.map(EcsMachineImage::unwrap))
    }

    /**
     * @param images Configure which AMIs this Compute Environment can launch.
     * If you specify this property with only `image` specified, then the
     * `imageType` will default to `ECS_AL2`. *If your image needs GPU resources,
     * specify `ECS_AL2_NVIDIA`; otherwise, the instances will not be able to properly
     * join the ComputeEnvironment*.
     */
    override fun images(vararg images: EcsMachineImage): Unit = images(images.toList())

    /**
     * @param instanceClasses The instance classes that this Compute Environment can launch.
     * Which one is chosen depends on the `AllocationStrategy` used.
     * Batch will automatically choose the instance size.
     */
    override fun instanceClasses(instanceClasses: List<InstanceClass>) {
      cdkBuilder.instanceClasses(instanceClasses.map(InstanceClass::unwrap))
    }

    /**
     * @param instanceClasses The instance classes that this Compute Environment can launch.
     * Which one is chosen depends on the `AllocationStrategy` used.
     * Batch will automatically choose the instance size.
     */
    override fun instanceClasses(vararg instanceClasses: InstanceClass): Unit =
        instanceClasses(instanceClasses.toList())

    /**
     * @param instanceRole The execution Role that instances launched by this Compute Environment
     * will use.
     */
    override fun instanceRole(instanceRole: IRole) {
      cdkBuilder.instanceRole(instanceRole.let(IRole::unwrap))
    }

    /**
     * @param instanceTypes The instance types that this Compute Environment can launch.
     * Which one is chosen depends on the `AllocationStrategy` used.
     */
    override fun instanceTypes(instanceTypes: List<InstanceType>) {
      cdkBuilder.instanceTypes(instanceTypes.map(InstanceType::unwrap))
    }

    /**
     * @param instanceTypes The instance types that this Compute Environment can launch.
     * Which one is chosen depends on the `AllocationStrategy` used.
     */
    override fun instanceTypes(vararg instanceTypes: InstanceType): Unit =
        instanceTypes(instanceTypes.toList())

    /**
     * @param launchTemplate The Launch Template that this Compute Environment will use to provision
     * EC2 Instances.
     * *Note*: if `securityGroups` is specified on both your
     * launch template and this Compute Environment, **the
     * `securityGroup`s on the Compute Environment override the
     * ones on the launch template.
     */
    override fun launchTemplate(launchTemplate: ILaunchTemplate) {
      cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
    }

    /**
     * @param maxvCpus The maximum vCpus this `ManagedComputeEnvironment` can scale up to. Each vCPU
     * is equivalent to 1024 CPU shares.
     * *Note*: if this Compute Environment uses EC2 resources (not Fargate) with either
     * `AllocationStrategy.BEST_FIT_PROGRESSIVE` or
     * `AllocationStrategy.SPOT_CAPACITY_OPTIMIZED`, or `AllocationStrategy.BEST_FIT` with Spot
     * instances,
     * The scheduler may exceed this number by at most one of the instances specified in
     * `instanceTypes`
     * or `instanceClasses`.
     */
    override fun maxvCpus(maxvCpus: Number) {
      cdkBuilder.maxvCpus(maxvCpus)
    }

    /**
     * @param minvCpus The minimum vCPUs that an environment should maintain, even if the compute
     * environment is DISABLED.
     */
    override fun minvCpus(minvCpus: Number) {
      cdkBuilder.minvCpus(minvCpus)
    }

    /**
     * @param placementGroup The EC2 placement group to associate with your compute resources.
     * If you intend to submit multi-node parallel jobs to this Compute Environment,
     * you should consider creating a cluster placement group and associate it with your compute
     * resources.
     * This keeps your multi-node parallel job on a logical grouping of instances
     * within a single Availability Zone with high network flow potential.
     */
    override fun placementGroup(placementGroup: IPlacementGroup) {
      cdkBuilder.placementGroup(placementGroup.let(IPlacementGroup::unwrap))
    }

    /**
     * @param replaceComputeEnvironment Specifies whether this Compute Environment is replaced if an
     * update is made that requires replacing its instances.
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
     */
    override fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
      cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
    }

    /**
     * @param securityGroups The security groups this Compute Environment will launch instances in.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The security groups this Compute Environment will launch instances in.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     * such as provision instances to run your jobs.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    /**
     * @param spot Whether or not to use spot instances.
     * Spot instances are less expensive EC2 instances that can be
     * reclaimed by EC2 at any time; your job will be given two minutes
     * of notice before reclamation.
     */
    override fun spot(spot: Boolean) {
      cdkBuilder.spot(spot)
    }

    /**
     * @param spotBidPercentage The maximum percentage that a Spot Instance price can be when
     * compared with the On-Demand price for that instance type before instances are launched.
     * For example, if your maximum percentage is 20%, the Spot price must be
     * less than 20% of the current On-Demand price for that Instance.
     * You always pay the lowest market price and never more than your maximum percentage.
     * For most use cases, Batch recommends leaving this field empty.
     *
     * Implies `spot == true` if set
     */
    override fun spotBidPercentage(spotBidPercentage: Number) {
      cdkBuilder.spotBidPercentage(spotBidPercentage)
    }

    /**
     * @param spotFleetRole The service-linked role that Spot Fleet needs to launch instances on
     * your behalf.
     */
    override fun spotFleetRole(spotFleetRole: IRole) {
      cdkBuilder.spotFleetRole(spotFleetRole.let(IRole::unwrap))
    }

    /**
     * @param terminateOnUpdate Whether or not any running jobs will be immediately terminated when
     * an infrastructure update occurs.
     * If this is enabled, any terminated jobs may be retried, depending on the job's
     * retry policy.
     */
    override fun terminateOnUpdate(terminateOnUpdate: Boolean) {
      cdkBuilder.terminateOnUpdate(terminateOnUpdate)
    }

    /**
     * @param updateTimeout Only meaningful if `terminateOnUpdate` is `false`.
     * If so,
     * when an infrastructure update is triggered, any running jobs
     * will be allowed to run until `updateTimeout` has expired.
     */
    override fun updateTimeout(updateTimeout: Duration) {
      cdkBuilder.updateTimeout(updateTimeout.let(Duration::unwrap))
    }

    /**
     * @param updateToLatestImageVersion Whether or not the AMI is updated to the latest one
     * supported by Batch when an infrastructure update occurs.
     * If you specify a specific AMI, this property will be ignored.
     */
    override fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean) {
      cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion)
    }

    /**
     * @param useOptimalInstanceClasses Whether or not to use batch's optimal instance type.
     * The optimal instance type is equivalent to adding the
     * C4, M4, and R4 instance classes. You can specify other instance classes
     * (of the same architecture) in addition to the optimal instance classes.
     */
    override fun useOptimalInstanceClasses(useOptimalInstanceClasses: Boolean) {
      cdkBuilder.useOptimalInstanceClasses(useOptimalInstanceClasses)
    }

    /**
     * @param vpc VPC in which this Compute Environment will launch Instances. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d2612bc97625ac6a51bd6b731bebbe96f032039b1275643f9d4f910aa8d6f19")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps,
  ) : CdkObject(cdkObject), ManagedEc2EcsComputeEnvironmentProps {
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
     * The name of the ComputeEnvironment.
     *
     * Default: - generated by CloudFormation
     */
    override fun computeEnvironmentName(): String? = unwrap(this).getComputeEnvironmentName()

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
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Configure which AMIs this Compute Environment can launch.
     *
     * If you specify this property with only `image` specified, then the
     * `imageType` will default to `ECS_AL2`. *If your image needs GPU resources,
     * specify `ECS_AL2_NVIDIA`; otherwise, the instances will not be able to properly
     * join the ComputeEnvironment*.
     *
     * Default: - ECS_AL2 for non-GPU instances, ECS_AL2_NVIDIA for GPU instances
     */
    override fun images(): List<EcsMachineImage> =
        unwrap(this).getImages()?.map(EcsMachineImage::wrap) ?: emptyList()

    /**
     * The instance classes that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     * Batch will automatically choose the instance size.
     *
     * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
     */
    override fun instanceClasses(): List<InstanceClass> =
        unwrap(this).getInstanceClasses()?.map(InstanceClass::wrap) ?: emptyList()

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
     *
     * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
     */
    override fun instanceTypes(): List<InstanceType> =
        unwrap(this).getInstanceTypes()?.map(InstanceType::wrap) ?: emptyList()

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
     * The maximum vCpus this `ManagedComputeEnvironment` can scale up to. Each vCPU is equivalent
     * to 1024 CPU shares.
     *
     * *Note*: if this Compute Environment uses EC2 resources (not Fargate) with either
     * `AllocationStrategy.BEST_FIT_PROGRESSIVE` or
     * `AllocationStrategy.SPOT_CAPACITY_OPTIMIZED`, or `AllocationStrategy.BEST_FIT` with Spot
     * instances,
     * The scheduler may exceed this number by at most one of the instances specified in
     * `instanceTypes`
     * or `instanceClasses`.
     *
     * Default: 256
     */
    override fun maxvCpus(): Number? = unwrap(this).getMaxvCpus()

    /**
     * The minimum vCPUs that an environment should maintain, even if the compute environment is
     * DISABLED.
     *
     * Default: 0
     */
    override fun minvCpus(): Number? = unwrap(this).getMinvCpus()

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
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html)
     */
    override fun replaceComputeEnvironment(): Boolean? = unwrap(this).getReplaceComputeEnvironment()

    /**
     * The security groups this Compute Environment will launch instances in.
     *
     * Default: new security groups will be created
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

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
     * Implies `spot == true` if set
     *
     * Default: 100%
     */
    override fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

    /**
     * The service-linked role that Spot Fleet needs to launch instances on your behalf.
     *
     * Default: - a new role will be created
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/spot_fleet_IAM_role.html)
     */
    override fun spotFleetRole(): IRole? = unwrap(this).getSpotFleetRole()?.let(IRole::wrap)

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
     * Default: true
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
     * VPC in which this Compute Environment will launch Instances.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * The VPC Subnets this Compute Environment will launch instances in.
     *
     * Default: new subnets will be created
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ManagedEc2EcsComputeEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps):
        ManagedEc2EcsComputeEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        ManagedEc2EcsComputeEnvironmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManagedEc2EcsComputeEnvironmentProps):
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps
  }
}
