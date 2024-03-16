@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.List

/**
 * Represents a Managed ComputeEnvironment.
 *
 * Batch will provision EC2 Instances to
 * meet the requirements of the jobs executing in this ComputeEnvironment.
 */
public interface IManagedComputeEnvironment : IComputeEnvironment, IConnectable, ITaggable {
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
  public fun maxvCpus(): Number

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
  public fun replaceComputeEnvironment(): Boolean? = unwrap(this).getReplaceComputeEnvironment()

  /**
   * The security groups this Compute Environment will launch instances in.
   */
  public fun securityGroups(): List<ISecurityGroup>

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
   * Note: the CDK will never set this value by default, `false` will set by CFN.
   * This is to avoid a deployment failure that occurs when this value is set.
   *
   * Default: false
   *
   * [Documentation](https://github.com/aws/aws-cdk/issues/27054)
   */
  public fun updateToLatestImageVersion(): Boolean? = unwrap(this).getUpdateToLatestImageVersion()

  /**
   * The VPC Subnets this Compute Environment will launch instances in.
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IManagedComputeEnvironment):
        IManagedComputeEnvironment = CdkObjectWrappers.wrap(cdkObject) as IManagedComputeEnvironment

    internal fun unwrap(wrapped: IManagedComputeEnvironment):
        software.amazon.awscdk.services.batch.IManagedComputeEnvironment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IManagedComputeEnvironment
  }
}
