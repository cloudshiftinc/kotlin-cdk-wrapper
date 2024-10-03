@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A ManagedComputeEnvironment that uses ECS orchestration on Fargate instances.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * FargateComputeEnvironment sharedComputeEnv = FargateComputeEnvironment.Builder.create(this,
 * "spotEnv")
 * .vpc(vpc)
 * .spot(true)
 * .build();
 * JobQueue lowPriorityQueue = JobQueue.Builder.create(this, "JobQueue")
 * .priority(1)
 * .build();
 * JobQueue highPriorityQueue = JobQueue.Builder.create(this, "JobQueue")
 * .priority(10)
 * .build();
 * lowPriorityQueue.addComputeEnvironment(sharedComputeEnv, 1);
 * highPriorityQueue.addComputeEnvironment(sharedComputeEnv, 1);
 * ```
 */
public open class FargateComputeEnvironment(
  cdkObject: software.amazon.awscdk.services.batch.FargateComputeEnvironment,
) : Resource(cdkObject),
    IFargateComputeEnvironment,
    IManagedComputeEnvironment,
    IComputeEnvironment {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FargateComputeEnvironmentProps,
  ) :
      this(software.amazon.awscdk.services.batch.FargateComputeEnvironment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(FargateComputeEnvironmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FargateComputeEnvironmentProps.Builder.() -> Unit,
  ) : this(scope, id, FargateComputeEnvironmentProps(props)
  )

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.FargateComputeEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the ComputeEnvironment.
     *
     * Default: - generated by CloudFormation
     *
     * @param computeEnvironmentName The name of the ComputeEnvironment. 
     */
    public fun computeEnvironmentName(computeEnvironmentName: String)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94c272473fb16c36eda9db12bc80246d124b20b018b8bca84d7c02eaa75f53fa")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.FargateComputeEnvironment.Builder
        = software.amazon.awscdk.services.batch.FargateComputeEnvironment.Builder.create(scope, id)

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
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
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
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
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
      cdkBuilder.updateTimeout(updateTimeout.let(Duration.Companion::unwrap))
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
     * VPC in which this Compute Environment will launch Instances.
     *
     * @param vpc VPC in which this Compute Environment will launch Instances. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * The VPC Subnets this Compute Environment will launch instances in.
     *
     * Default: new subnets will be created
     *
     * @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * The VPC Subnets this Compute Environment will launch instances in.
     *
     * Default: new subnets will be created
     *
     * @param vpcSubnets The VPC Subnets this Compute Environment will launch instances in. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94c272473fb16c36eda9db12bc80246d124b20b018b8bca84d7c02eaa75f53fa")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.batch.FargateComputeEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromFargateComputeEnvironmentArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      fargateComputeEnvironmentArn: String,
    ): IFargateComputeEnvironment =
        software.amazon.awscdk.services.batch.FargateComputeEnvironment.fromFargateComputeEnvironmentArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, fargateComputeEnvironmentArn).let(IFargateComputeEnvironment::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FargateComputeEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FargateComputeEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.FargateComputeEnvironment):
        FargateComputeEnvironment = FargateComputeEnvironment(cdkObject)

    internal fun unwrap(wrapped: FargateComputeEnvironment):
        software.amazon.awscdk.services.batch.FargateComputeEnvironment = wrapped.cdkObject as
        software.amazon.awscdk.services.batch.FargateComputeEnvironment
  }
}
