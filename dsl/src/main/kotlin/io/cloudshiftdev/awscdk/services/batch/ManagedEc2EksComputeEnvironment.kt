package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ILaunchTemplate
import io.cloudshiftdev.awscdk.services.ec2.IPlacementGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.InstanceClass
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.eks.ICluster
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ManagedEc2EksComputeEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironment,
) : Resource(cdkObject), IManagedComputeEnvironment, IComputeEnvironment {
  /**
   * Add an instance class to this compute environment.
   *
   * @param instanceClass 
   */
  public open fun addInstanceClass(instanceClass: InstanceClass) {
    unwrap(this).addInstanceClass(instanceClass.let(InstanceClass::unwrap))
  }

  /**
   * Add an instance type to this compute environment.
   *
   * @param instanceType 
   */
  public open fun addInstanceType(instanceType: InstanceType) {
    unwrap(this).addInstanceType(instanceType.let(InstanceType::unwrap))
  }

  /**
   * The allocation strategy to use if not enough instances of the best fitting instance type can be
   * allocated.
   */
  public open fun allocationStrategy(): AllocationStrategy? =
      unwrap(this).getAllocationStrategy()?.let(AllocationStrategy::wrap)

  /**
   * The ARN of this compute environment.
   */
  public override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

  /**
   * The name of the ComputeEnvironment.
   */
  public override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

  /**
   * The network connections associated with this resource.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The cluster that backs this Compute Environment. Required for Compute Environments running
   * Kubernetes jobs.
   *
   * Please ensure that you have followed the steps at
   *
   * https://docs.aws.amazon.com/batch/latest/userguide/getting-started-eks.html
   *
   * before attempting to deploy a `ManagedEc2EksComputeEnvironment` that uses this cluster.
   * If you do not follow the steps in the link, the deployment fail with a message that the
   * compute environment did not stabilize.
   */
  public open fun eksCluster(): ICluster = unwrap(this).getEksCluster().let(ICluster::wrap)

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
  public override fun enabled(): Boolean = unwrap(this).getEnabled()

  /**
   * Configure which AMIs this Compute Environment can launch.
   */
  public open fun images(): List<EksMachineImage> =
      unwrap(this).getImages()?.map(EksMachineImage::wrap) ?: emptyList()

  /**
   * The instance types that this Compute Environment can launch.
   *
   * Which one is chosen depends on the `AllocationStrategy` used.
   */
  public open fun instanceClasses(): List<InstanceClass> =
      unwrap(this).getInstanceClasses().map(InstanceClass::wrap)

  /**
   * The execution Role that instances launched by this Compute Environment will use.
   */
  public open fun instanceRole(): IRole? = unwrap(this).getInstanceRole()?.let(IRole::wrap)

  /**
   * The instance types that this Compute Environment can launch.
   *
   * Which one is chosen depends on the `AllocationStrategy` used.
   */
  public open fun instanceTypes(): List<InstanceType> =
      unwrap(this).getInstanceTypes().map(InstanceType::wrap)

  /**
   * The namespace of the Cluster.
   *
   * Cannot be 'default', start with 'kube-', or be longer than 64 characters.
   */
  public open fun kubernetesNamespace(): String? = unwrap(this).getKubernetesNamespace()

  /**
   * The Launch Template that this Compute Environment will use to provision EC2 Instances.
   *
   * *Note*: if `securityGroups` is specified on both your
   * launch template and this Compute Environment, **the
   * `securityGroup`s on the Compute Environment override the
   * ones on the launch template.
   */
  public open fun launchTemplate(): ILaunchTemplate? =
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
  public override fun maxvCpus(): Number = unwrap(this).getMaxvCpus()

  /**
   * The minimum vCPUs that an environment should maintain, even if the compute environment is
   * DISABLED.
   */
  public open fun minvCpus(): Number? = unwrap(this).getMinvCpus()

  /**
   * The EC2 placement group to associate with your compute resources.
   *
   * If you intend to submit multi-node parallel jobs to this Compute Environment,
   * you should consider creating a cluster placement group and associate it with your compute
   * resources.
   * This keeps your multi-node parallel job on a logical grouping of instances
   * within a single Availability Zone with high network flow potential.
   */
  public open fun placementGroup(): IPlacementGroup? =
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
   */
  public override fun replaceComputeEnvironment(): Boolean? =
      unwrap(this).getReplaceComputeEnvironment()

  /**
   * The security groups this Compute Environment will launch instances in.
   */
  public override fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)

  /**
   * The role Batch uses to perform actions on your behalf in your account, such as provision
   * instances to run your jobs.
   */
  public override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

  /**
   * Whether or not to use spot instances.
   *
   * Spot instances are less expensive EC2 instances that can be
   * reclaimed by EC2 at any time; your job will be given two minutes
   * of notice before reclamation.
   */
  public override fun spot(): Boolean? = unwrap(this).getSpot()

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
   */
  public open fun spotBidPercentage(): Number? = unwrap(this).getSpotBidPercentage()

  /**
   * TagManager to set, remove and format tags.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Whether or not any running jobs will be immediately terminated when an infrastructure update
   * occurs.
   *
   * If this is enabled, any terminated jobs may be retried, depending on the job's
   * retry policy.
   */
  public override fun terminateOnUpdate(): Boolean? = unwrap(this).getTerminateOnUpdate()

  /**
   * Only meaningful if `terminateOnUpdate` is `false`.
   *
   * If so,
   * when an infrastructure update is triggered, any running jobs
   * will be allowed to run until `updateTimeout` has expired.
   */
  public override fun updateTimeout(): Duration? =
      unwrap(this).getUpdateTimeout()?.let(Duration::wrap)

  /**
   * Whether or not the AMI is updated to the latest one supported by Batch when an infrastructure
   * update occurs.
   *
   * If you specify a specific AMI, this property will be ignored.
   *
   * Note: the CDK will never set this value by default, `false` will set by CFN.
   * This is to avoid a deployment failure that occurs when this value is set.
   */
  public override fun updateToLatestImageVersion(): Boolean? =
      unwrap(this).getUpdateToLatestImageVersion()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.ManagedEc2EksComputeEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The allocation strategy to use if not enough instances of the best fitting instance type can
     * be allocated.
     *
     * Default: - `BEST_FIT_PROGRESSIVE` if not using Spot instances,
     * `SPOT_CAPACITY_OPTIMIZED` if using Spot instances.
     *
     * @param allocationStrategy The allocation strategy to use if not enough instances of the best
     * fitting instance type can be allocated. 
     */
    public fun allocationStrategy(allocationStrategy: AllocationStrategy)

    /**
     * The name of the ComputeEnvironment.
     *
     * Default: - generated by CloudFormation
     *
     * @param computeEnvironmentName The name of the ComputeEnvironment. 
     */
    public fun computeEnvironmentName(computeEnvironmentName: String)

    /**
     * The cluster that backs this Compute Environment. Required for Compute Environments running
     * Kubernetes jobs.
     *
     * Please ensure that you have followed the steps at
     *
     * https://docs.aws.amazon.com/batch/latest/userguide/getting-started-eks.html
     *
     * before attempting to deploy a `ManagedEc2EksComputeEnvironment` that uses this cluster.
     * If you do not follow the steps in the link, the deployment fail with a message that the
     * compute environment did not stabilize.
     *
     * @param eksCluster The cluster that backs this Compute Environment. Required for Compute
     * Environments running Kubernetes jobs. 
     */
    public fun eksCluster(eksCluster: ICluster)

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
     *
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Configure which AMIs this Compute Environment can launch.
     *
     * Default: If `imageKubernetesVersion` is specified,
     * - EKS_AL2 for non-GPU instances, EKS_AL2_NVIDIA for GPU instances,
     * Otherwise,
     * - ECS_AL2 for non-GPU instances, ECS_AL2_NVIDIA for GPU instances,
     *
     * @param images Configure which AMIs this Compute Environment can launch. 
     */
    public fun images(images: List<EksMachineImage>)

    /**
     * Configure which AMIs this Compute Environment can launch.
     *
     * Default: If `imageKubernetesVersion` is specified,
     * - EKS_AL2 for non-GPU instances, EKS_AL2_NVIDIA for GPU instances,
     * Otherwise,
     * - ECS_AL2 for non-GPU instances, ECS_AL2_NVIDIA for GPU instances,
     *
     * @param images Configure which AMIs this Compute Environment can launch. 
     */
    public fun images(vararg images: EksMachineImage)

    /**
     * The instance types that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     * Batch will automatically choose the instance size.
     *
     * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
     *
     * @param instanceClasses The instance types that this Compute Environment can launch. 
     */
    public fun instanceClasses(instanceClasses: List<InstanceClass>)

    /**
     * The instance types that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     * Batch will automatically choose the instance size.
     *
     * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
     *
     * @param instanceClasses The instance types that this Compute Environment can launch. 
     */
    public fun instanceClasses(vararg instanceClasses: InstanceClass)

    /**
     * The execution Role that instances launched by this Compute Environment will use.
     *
     * Default: - a role will be created
     *
     * @param instanceRole The execution Role that instances launched by this Compute Environment
     * will use. 
     */
    public fun instanceRole(instanceRole: IRole)

    /**
     * The instance types that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     *
     * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
     *
     * @param instanceTypes The instance types that this Compute Environment can launch. 
     */
    public fun instanceTypes(instanceTypes: List<InstanceType>)

    /**
     * The instance types that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     *
     * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
     *
     * @param instanceTypes The instance types that this Compute Environment can launch. 
     */
    public fun instanceTypes(vararg instanceTypes: InstanceType)

    /**
     * The namespace of the Cluster.
     *
     * @param kubernetesNamespace The namespace of the Cluster. 
     */
    public fun kubernetesNamespace(kubernetesNamespace: String)

    /**
     * The Launch Template that this Compute Environment will use to provision EC2 Instances.
     *
     * *Note*: if `securityGroups` is specified on both your
     * launch template and this Compute Environment, **the
     * `securityGroup`s on the Compute Environment override the
     * ones on the launch template.**
     *
     * Default: - no launch template
     *
     * @param launchTemplate The Launch Template that this Compute Environment will use to provision
     * EC2 Instances. 
     */
    public fun launchTemplate(launchTemplate: ILaunchTemplate)

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
     *
     * @param maxvCpus The maximum vCpus this `ManagedComputeEnvironment` can scale up to. Each vCPU
     * is equivalent to 1024 CPU shares. 
     */
    public fun maxvCpus(maxvCpus: Number)

    /**
     * The minimum vCPUs that an environment should maintain, even if the compute environment is
     * DISABLED.
     *
     * Default: 0
     *
     * @param minvCpus The minimum vCPUs that an environment should maintain, even if the compute
     * environment is DISABLED. 
     */
    public fun minvCpus(minvCpus: Number)

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
     * @param placementGroup The EC2 placement group to associate with your compute resources. 
     */
    public fun placementGroup(placementGroup: IPlacementGroup)

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
     * @param replaceComputeEnvironment Specifies whether this Compute Environment is replaced if an
     * update is made that requires replacing its instances. 
     */
    public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean)

    /**
     * The security groups this Compute Environment will launch instances in.
     *
     * Default: new security groups will be created
     *
     * @param securityGroups The security groups this Compute Environment will launch instances in. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * The security groups this Compute Environment will launch instances in.
     *
     * Default: new security groups will be created
     *
     * @param securityGroups The security groups this Compute Environment will launch instances in. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * The role Batch uses to perform actions on your behalf in your account, such as provision
     * instances to run your jobs.
     *
     * Default: - a serviceRole will be created for managed CEs, none for unmanaged CEs
     *
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     * such as provision instances to run your jobs. 
     */
    public fun serviceRole(serviceRole: IRole)

    /**
     * Whether or not to use spot instances.
     *
     * Spot instances are less expensive EC2 instances that can be
     * reclaimed by EC2 at any time; your job will be given two minutes
     * of notice before reclamation.
     *
     * Default: false
     *
     * @param spot Whether or not to use spot instances. 
     */
    public fun spot(spot: Boolean)

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
     * Default: - 100%
     *
     * @param spotBidPercentage The maximum percentage that a Spot Instance price can be when
     * compared with the On-Demand price for that instance type before instances are launched. 
     */
    public fun spotBidPercentage(spotBidPercentage: Number)

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
     * @param terminateOnUpdate Whether or not any running jobs will be immediately terminated when
     * an infrastructure update occurs. 
     */
    public fun terminateOnUpdate(terminateOnUpdate: Boolean)

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
     * @param updateTimeout Only meaningful if `terminateOnUpdate` is `false`. 
     */
    public fun updateTimeout(updateTimeout: Duration)

    /**
     * Whether or not the AMI is updated to the latest one supported by Batch when an infrastructure
     * update occurs.
     *
     * If you specify a specific AMI, this property will be ignored.
     *
     * Default: true
     *
     * @param updateToLatestImageVersion Whether or not the AMI is updated to the latest one
     * supported by Batch when an infrastructure update occurs. 
     */
    public fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean)

    /**
     * Whether or not to use batch's optimal instance type.
     *
     * The optimal instance type is equivalent to adding the
     * C4, M4, and R4 instance classes. You can specify other instance classes
     * (of the same architecture) in addition to the optimal instance classes.
     *
     * Default: true
     *
     * @param useOptimalInstanceClasses Whether or not to use batch's optimal instance type. 
     */
    public fun useOptimalInstanceClasses(useOptimalInstanceClasses: Boolean)

    /**
     * VPC in which this Compute Environment will launch Instances.
     *
     * @param vpc VPC in which this Compute Environment will launch Instances. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * The VPC Subnets this Compute Environment will launch instances in.
     *
     * Default: new subnets will be created
     *
     * @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * The VPC Subnets this Compute Environment will launch instances in.
     *
     * Default: new subnets will be created
     *
     * @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f494c149f876a353599ab64cc20b8addbb5350474c095b562c52b586754f257c")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironment.Builder =
        software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironment.Builder.create(scope,
        id)

    /**
     * The allocation strategy to use if not enough instances of the best fitting instance type can
     * be allocated.
     *
     * Default: - `BEST_FIT_PROGRESSIVE` if not using Spot instances,
     * `SPOT_CAPACITY_OPTIMIZED` if using Spot instances.
     *
     * @param allocationStrategy The allocation strategy to use if not enough instances of the best
     * fitting instance type can be allocated. 
     */
    override fun allocationStrategy(allocationStrategy: AllocationStrategy) {
      cdkBuilder.allocationStrategy(allocationStrategy.let(AllocationStrategy::unwrap))
    }

    /**
     * The name of the ComputeEnvironment.
     *
     * Default: - generated by CloudFormation
     *
     * @param computeEnvironmentName The name of the ComputeEnvironment. 
     */
    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    /**
     * The cluster that backs this Compute Environment. Required for Compute Environments running
     * Kubernetes jobs.
     *
     * Please ensure that you have followed the steps at
     *
     * https://docs.aws.amazon.com/batch/latest/userguide/getting-started-eks.html
     *
     * before attempting to deploy a `ManagedEc2EksComputeEnvironment` that uses this cluster.
     * If you do not follow the steps in the link, the deployment fail with a message that the
     * compute environment did not stabilize.
     *
     * @param eksCluster The cluster that backs this Compute Environment. Required for Compute
     * Environments running Kubernetes jobs. 
     */
    override fun eksCluster(eksCluster: ICluster) {
      cdkBuilder.eksCluster(eksCluster.let(ICluster::unwrap))
    }

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
     *
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Configure which AMIs this Compute Environment can launch.
     *
     * Default: If `imageKubernetesVersion` is specified,
     * - EKS_AL2 for non-GPU instances, EKS_AL2_NVIDIA for GPU instances,
     * Otherwise,
     * - ECS_AL2 for non-GPU instances, ECS_AL2_NVIDIA for GPU instances,
     *
     * @param images Configure which AMIs this Compute Environment can launch. 
     */
    override fun images(images: List<EksMachineImage>) {
      cdkBuilder.images(images.map(EksMachineImage::unwrap))
    }

    /**
     * Configure which AMIs this Compute Environment can launch.
     *
     * Default: If `imageKubernetesVersion` is specified,
     * - EKS_AL2 for non-GPU instances, EKS_AL2_NVIDIA for GPU instances,
     * Otherwise,
     * - ECS_AL2 for non-GPU instances, ECS_AL2_NVIDIA for GPU instances,
     *
     * @param images Configure which AMIs this Compute Environment can launch. 
     */
    override fun images(vararg images: EksMachineImage): Unit = images(images.toList())

    /**
     * The instance types that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     * Batch will automatically choose the instance size.
     *
     * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
     *
     * @param instanceClasses The instance types that this Compute Environment can launch. 
     */
    override fun instanceClasses(instanceClasses: List<InstanceClass>) {
      cdkBuilder.instanceClasses(instanceClasses.map(InstanceClass::unwrap))
    }

    /**
     * The instance types that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     * Batch will automatically choose the instance size.
     *
     * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
     *
     * @param instanceClasses The instance types that this Compute Environment can launch. 
     */
    override fun instanceClasses(vararg instanceClasses: InstanceClass): Unit =
        instanceClasses(instanceClasses.toList())

    /**
     * The execution Role that instances launched by this Compute Environment will use.
     *
     * Default: - a role will be created
     *
     * @param instanceRole The execution Role that instances launched by this Compute Environment
     * will use. 
     */
    override fun instanceRole(instanceRole: IRole) {
      cdkBuilder.instanceRole(instanceRole.let(IRole::unwrap))
    }

    /**
     * The instance types that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     *
     * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
     *
     * @param instanceTypes The instance types that this Compute Environment can launch. 
     */
    override fun instanceTypes(instanceTypes: List<InstanceType>) {
      cdkBuilder.instanceTypes(instanceTypes.map(InstanceType::unwrap))
    }

    /**
     * The instance types that this Compute Environment can launch.
     *
     * Which one is chosen depends on the `AllocationStrategy` used.
     *
     * Default: - the instances Batch considers will be used (currently C4, M4, and R4)
     *
     * @param instanceTypes The instance types that this Compute Environment can launch. 
     */
    override fun instanceTypes(vararg instanceTypes: InstanceType): Unit =
        instanceTypes(instanceTypes.toList())

    /**
     * The namespace of the Cluster.
     *
     * @param kubernetesNamespace The namespace of the Cluster. 
     */
    override fun kubernetesNamespace(kubernetesNamespace: String) {
      cdkBuilder.kubernetesNamespace(kubernetesNamespace)
    }

    /**
     * The Launch Template that this Compute Environment will use to provision EC2 Instances.
     *
     * *Note*: if `securityGroups` is specified on both your
     * launch template and this Compute Environment, **the
     * `securityGroup`s on the Compute Environment override the
     * ones on the launch template.**
     *
     * Default: - no launch template
     *
     * @param launchTemplate The Launch Template that this Compute Environment will use to provision
     * EC2 Instances. 
     */
    override fun launchTemplate(launchTemplate: ILaunchTemplate) {
      cdkBuilder.launchTemplate(launchTemplate.let(ILaunchTemplate::unwrap))
    }

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
     *
     * @param maxvCpus The maximum vCpus this `ManagedComputeEnvironment` can scale up to. Each vCPU
     * is equivalent to 1024 CPU shares. 
     */
    override fun maxvCpus(maxvCpus: Number) {
      cdkBuilder.maxvCpus(maxvCpus)
    }

    /**
     * The minimum vCPUs that an environment should maintain, even if the compute environment is
     * DISABLED.
     *
     * Default: 0
     *
     * @param minvCpus The minimum vCPUs that an environment should maintain, even if the compute
     * environment is DISABLED. 
     */
    override fun minvCpus(minvCpus: Number) {
      cdkBuilder.minvCpus(minvCpus)
    }

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
     * @param placementGroup The EC2 placement group to associate with your compute resources. 
     */
    override fun placementGroup(placementGroup: IPlacementGroup) {
      cdkBuilder.placementGroup(placementGroup.let(IPlacementGroup::unwrap))
    }

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
     * @param replaceComputeEnvironment Specifies whether this Compute Environment is replaced if an
     * update is made that requires replacing its instances. 
     */
    override fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
      cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
    }

    /**
     * The security groups this Compute Environment will launch instances in.
     *
     * Default: new security groups will be created
     *
     * @param securityGroups The security groups this Compute Environment will launch instances in. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * The security groups this Compute Environment will launch instances in.
     *
     * Default: new security groups will be created
     *
     * @param securityGroups The security groups this Compute Environment will launch instances in. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * The role Batch uses to perform actions on your behalf in your account, such as provision
     * instances to run your jobs.
     *
     * Default: - a serviceRole will be created for managed CEs, none for unmanaged CEs
     *
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     * such as provision instances to run your jobs. 
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    /**
     * Whether or not to use spot instances.
     *
     * Spot instances are less expensive EC2 instances that can be
     * reclaimed by EC2 at any time; your job will be given two minutes
     * of notice before reclamation.
     *
     * Default: false
     *
     * @param spot Whether or not to use spot instances. 
     */
    override fun spot(spot: Boolean) {
      cdkBuilder.spot(spot)
    }

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
     * Default: - 100%
     *
     * @param spotBidPercentage The maximum percentage that a Spot Instance price can be when
     * compared with the On-Demand price for that instance type before instances are launched. 
     */
    override fun spotBidPercentage(spotBidPercentage: Number) {
      cdkBuilder.spotBidPercentage(spotBidPercentage)
    }

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
     * @param terminateOnUpdate Whether or not any running jobs will be immediately terminated when
     * an infrastructure update occurs. 
     */
    override fun terminateOnUpdate(terminateOnUpdate: Boolean) {
      cdkBuilder.terminateOnUpdate(terminateOnUpdate)
    }

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
     * @param updateTimeout Only meaningful if `terminateOnUpdate` is `false`. 
     */
    override fun updateTimeout(updateTimeout: Duration) {
      cdkBuilder.updateTimeout(updateTimeout.let(Duration::unwrap))
    }

    /**
     * Whether or not the AMI is updated to the latest one supported by Batch when an infrastructure
     * update occurs.
     *
     * If you specify a specific AMI, this property will be ignored.
     *
     * Default: true
     *
     * @param updateToLatestImageVersion Whether or not the AMI is updated to the latest one
     * supported by Batch when an infrastructure update occurs. 
     */
    override fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean) {
      cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion)
    }

    /**
     * Whether or not to use batch's optimal instance type.
     *
     * The optimal instance type is equivalent to adding the
     * C4, M4, and R4 instance classes. You can specify other instance classes
     * (of the same architecture) in addition to the optimal instance classes.
     *
     * Default: true
     *
     * @param useOptimalInstanceClasses Whether or not to use batch's optimal instance type. 
     */
    override fun useOptimalInstanceClasses(useOptimalInstanceClasses: Boolean) {
      cdkBuilder.useOptimalInstanceClasses(useOptimalInstanceClasses)
    }

    /**
     * VPC in which this Compute Environment will launch Instances.
     *
     * @param vpc VPC in which this Compute Environment will launch Instances. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * The VPC Subnets this Compute Environment will launch instances in.
     *
     * Default: new subnets will be created
     *
     * @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * The VPC Subnets this Compute Environment will launch instances in.
     *
     * Default: new subnets will be created
     *
     * @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f494c149f876a353599ab64cc20b8addbb5350474c095b562c52b586754f257c")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ManagedEc2EksComputeEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ManagedEc2EksComputeEnvironment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironment):
        ManagedEc2EksComputeEnvironment = ManagedEc2EksComputeEnvironment(cdkObject)

    internal fun unwrap(wrapped: ManagedEc2EksComputeEnvironment):
        software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironment = wrapped.cdkObject
  }
}
