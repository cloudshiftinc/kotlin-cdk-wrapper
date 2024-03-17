@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.Number
import kotlin.String
import kotlin.collections.List

/**
 * Represents a Fairshare Scheduling Policy. Instructs the scheduler to allocate ComputeEnvironment
 * vCPUs based on Job shareIdentifiers.
 *
 * The Faireshare Scheduling Policy ensures that each share gets a certain amount of vCPUs.
 * It does this by deciding how many Jobs of each share to schedule *relative to how many jobs of
 * each share are currently being executed by the ComputeEnvironment*. The weight factors associated
 * with
 * each share determine the ratio of vCPUs allocated; see the readme for a more in-depth discussion
 * of
 * fairshare policies.
 */
public interface IFairshareSchedulingPolicy : ISchedulingPolicy {
  /**
   * Used to calculate the percentage of the maximum available vCPU to reserve for share identifiers
   * not present in the Queue.
   *
   * The percentage reserved is defined by the Scheduler as:
   * `(computeReservation/100)^ActiveFairShares` where `ActiveFairShares` is the number of active
   * fair share identifiers.
   *
   * For example, a computeReservation value of 50 indicates that AWS Batch reserves 50% of the
   * maximum available vCPU if there's only one fair share identifier.
   * It reserves 25% if there are two fair share identifiers.
   * It reserves 12.5% if there are three fair share identifiers.
   *
   * A computeReservation value of 25 indicates that AWS Batch should reserve 25% of the
   * maximum available vCPU if there's only one fair share identifier,
   * 6.25% if there are two fair share identifiers,
   * and 1.56% if there are three fair share identifiers.
   *
   * Default: - no vCPU is reserved
   */
  public fun computeReservation(): Number? = unwrap(this).getComputeReservation()

  /**
   * The amount of time to use to measure the usage of each job.
   *
   * The usage is used to calculate a fair share percentage for each fair share identifier currently
   * in the Queue.
   * A value of zero (0) indicates that only current usage is measured.
   * The decay is linear and gives preference to newer jobs.
   *
   * The maximum supported value is 604800 seconds (1 week).
   *
   * Default: - 0: only the current job usage is considered
   */
  public fun shareDecay(): Duration? = unwrap(this).getShareDecay()?.let(Duration::wrap)

  /**
   * The shares that this Scheduling Policy applies to.
   *
   * *Note*: It is possible to submit Jobs to the queue with Share Identifiers that
   * are not recognized by the Scheduling Policy.
   */
  public fun shares(): List<Share>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.IFairshareSchedulingPolicy,
  ) : CdkObject(cdkObject), IFairshareSchedulingPolicy {
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
     * Used to calculate the percentage of the maximum available vCPU to reserve for share
     * identifiers not present in the Queue.
     *
     * The percentage reserved is defined by the Scheduler as:
     * `(computeReservation/100)^ActiveFairShares` where `ActiveFairShares` is the number of active
     * fair share identifiers.
     *
     * For example, a computeReservation value of 50 indicates that AWS Batch reserves 50% of the
     * maximum available vCPU if there's only one fair share identifier.
     * It reserves 25% if there are two fair share identifiers.
     * It reserves 12.5% if there are three fair share identifiers.
     *
     * A computeReservation value of 25 indicates that AWS Batch should reserve 25% of the
     * maximum available vCPU if there's only one fair share identifier,
     * 6.25% if there are two fair share identifiers,
     * and 1.56% if there are three fair share identifiers.
     *
     * Default: - no vCPU is reserved
     */
    override fun computeReservation(): Number? = unwrap(this).getComputeReservation()

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

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The arn of this scheduling policy.
     */
    override fun schedulingPolicyArn(): String = unwrap(this).getSchedulingPolicyArn()

    /**
     * The name of this scheduling policy.
     */
    override fun schedulingPolicyName(): String = unwrap(this).getSchedulingPolicyName()

    /**
     * The amount of time to use to measure the usage of each job.
     *
     * The usage is used to calculate a fair share percentage for each fair share identifier
     * currently in the Queue.
     * A value of zero (0) indicates that only current usage is measured.
     * The decay is linear and gives preference to newer jobs.
     *
     * The maximum supported value is 604800 seconds (1 week).
     *
     * Default: - 0: only the current job usage is considered
     */
    override fun shareDecay(): Duration? = unwrap(this).getShareDecay()?.let(Duration::wrap)

    /**
     * The shares that this Scheduling Policy applies to.
     *
     * *Note*: It is possible to submit Jobs to the queue with Share Identifiers that
     * are not recognized by the Scheduling Policy.
     */
    override fun shares(): List<Share> = unwrap(this).getShares().map(Share::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IFairshareSchedulingPolicy):
        IFairshareSchedulingPolicy = CdkObjectWrappers.wrap(cdkObject) as?
        IFairshareSchedulingPolicy ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFairshareSchedulingPolicy):
        software.amazon.awscdk.services.batch.IFairshareSchedulingPolicy = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IFairshareSchedulingPolicy
  }
}
