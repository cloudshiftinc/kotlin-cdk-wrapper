@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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

/**
 * Props for a ManagedComputeEnvironment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
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
public interface ManagedComputeEnvironmentProps : ComputeEnvironmentProps {
  /**
   * The maximum vCpus this `ManagedComputeEnvironment` can scale up to. Each vCPU is equivalent to
   * 1024 CPU shares.
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
  public fun maxvCpus(): Number? = unwrap(this).getMaxvCpus()

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
  public fun replaceComputeEnvironment(): Boolean? = unwrap(this).getReplaceComputeEnvironment()

  /**
   * The security groups this Compute Environment will launch instances in.
   *
   * Default: new security groups will be created
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * Whether or not to use spot instances.
   *
   * Spot instances are less expensive EC2 instances that can be
   * reclaimed by EC2 at any time; your job will be given two minutes
   * of notice before reclamation.
   *
   * Default: false
   */
  public fun spot(): Boolean? = unwrap(this).getSpot()

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
  public fun terminateOnUpdate(): Boolean? = unwrap(this).getTerminateOnUpdate()

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
  public fun updateTimeout(): Duration? = unwrap(this).getUpdateTimeout()?.let(Duration::wrap)

  /**
   * Whether or not the AMI is updated to the latest one supported by Batch when an infrastructure
   * update occurs.
   *
   * If you specify a specific AMI, this property will be ignored.
   *
   * Default: true
   */
  public fun updateToLatestImageVersion(): Boolean? = unwrap(this).getUpdateToLatestImageVersion()

  /**
   * VPC in which this Compute Environment will launch Instances.
   */
  public fun vpc(): IVpc

  /**
   * The VPC Subnets this Compute Environment will launch instances in.
   *
   * Default: new subnets will be created
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [ManagedComputeEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
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
    @JvmName("f9bf62da0a707045907e85d972f979eac708e2fb4f5e77cb3a673a9401b000ca")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.batch.ManagedComputeEnvironmentProps.Builder =
        software.amazon.awscdk.services.batch.ManagedComputeEnvironmentProps.builder()

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
    @JvmName("f9bf62da0a707045907e85d972f979eac708e2fb4f5e77cb3a673a9401b000ca")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.batch.ManagedComputeEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.ManagedComputeEnvironmentProps,
  ) : CdkObject(cdkObject), ManagedComputeEnvironmentProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): ManagedComputeEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.ManagedComputeEnvironmentProps):
        ManagedComputeEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        ManagedComputeEnvironmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManagedComputeEnvironmentProps):
        software.amazon.awscdk.services.batch.ManagedComputeEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.ManagedComputeEnvironmentProps
  }
}
