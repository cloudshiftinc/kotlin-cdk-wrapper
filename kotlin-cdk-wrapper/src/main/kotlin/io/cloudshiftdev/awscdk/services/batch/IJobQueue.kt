@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List

/**
 * Represents a JobQueue.
 */
public interface IJobQueue : IResource {
  /**
   * Add a `ComputeEnvironment` to this Queue.
   *
   * The Queue will prefer lower-order `ComputeEnvironment`s.
   *
   * @param computeEnvironment 
   * @param order 
   */
  public fun addComputeEnvironment(computeEnvironment: IComputeEnvironment, order: Number)

  /**
   * The set of compute environments mapped to a job queue and their order relative to each other.
   *
   * The job scheduler uses this parameter to determine which compute environment runs a specific
   * job.
   * Compute environments must be in the VALID state before you can associate them with a job queue.
   * You can associate up to three compute environments with a job queue.
   * All of the compute environments must be either EC2 (EC2 or SPOT) or Fargate (FARGATE or
   * FARGATE_SPOT);
   * EC2 and Fargate compute environments can't be mixed.
   *
   * *Note*: All compute environments that are associated with a job queue must share the same
   * architecture.
   * AWS Batch doesn't support mixing compute environment architecture types in a single job queue.
   */
  public fun computeEnvironments(): List<OrderedComputeEnvironment>

  /**
   * If the job queue is enabled, it is able to accept jobs.
   *
   * Otherwise, new jobs can't be added to the queue, but jobs already in the queue can finish.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The ARN of this job queue.
   */
  public fun jobQueueArn(): String

  /**
   * The name of the job queue.
   *
   * It can be up to 128 letters long.
   * It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_)
   */
  public fun jobQueueName(): String

  /**
   * The priority of the job queue.
   *
   * Job queues with a higher priority are evaluated first when associated with the same compute
   * environment.
   * Priority is determined in descending order.
   * For example, a job queue with a priority value of 10 is given scheduling preference over a job
   * queue with a priority value of 1.
   */
  public fun priority(): Number

  /**
   * The SchedulingPolicy for this JobQueue.
   *
   * Instructs the Scheduler how to schedule different jobs.
   *
   * Default: - no scheduling policy
   */
  public fun schedulingPolicy(): ISchedulingPolicy? =
      unwrap(this).getSchedulingPolicy()?.let(ISchedulingPolicy::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.IJobQueue,
  ) : CdkObject(cdkObject),
      IJobQueue {
    /**
     * Add a `ComputeEnvironment` to this Queue.
     *
     * The Queue will prefer lower-order `ComputeEnvironment`s.
     *
     * @param computeEnvironment 
     * @param order 
     */
    override fun addComputeEnvironment(computeEnvironment: IComputeEnvironment, order: Number) {
      unwrap(this).addComputeEnvironment(computeEnvironment.let(IComputeEnvironment.Companion::unwrap),
          order)
    }

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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The set of compute environments mapped to a job queue and their order relative to each other.
     *
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job.
     * Compute environments must be in the VALID state before you can associate them with a job
     * queue.
     * You can associate up to three compute environments with a job queue.
     * All of the compute environments must be either EC2 (EC2 or SPOT) or Fargate (FARGATE or
     * FARGATE_SPOT);
     * EC2 and Fargate compute environments can't be mixed.
     *
     * *Note*: All compute environments that are associated with a job queue must share the same
     * architecture.
     * AWS Batch doesn't support mixing compute environment architecture types in a single job
     * queue.
     */
    override fun computeEnvironments(): List<OrderedComputeEnvironment> =
        unwrap(this).getComputeEnvironments().map(OrderedComputeEnvironment::wrap)

    /**
     * If the job queue is enabled, it is able to accept jobs.
     *
     * Otherwise, new jobs can't be added to the queue, but jobs already in the queue can finish.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

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
     * The ARN of this job queue.
     */
    override fun jobQueueArn(): String = unwrap(this).getJobQueueArn()

    /**
     * The name of the job queue.
     *
     * It can be up to 128 letters long.
     * It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_)
     */
    override fun jobQueueName(): String = unwrap(this).getJobQueueName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The priority of the job queue.
     *
     * Job queues with a higher priority are evaluated first when associated with the same compute
     * environment.
     * Priority is determined in descending order.
     * For example, a job queue with a priority value of 10 is given scheduling preference over a
     * job queue with a priority value of 1.
     */
    override fun priority(): Number = unwrap(this).getPriority()

    /**
     * The SchedulingPolicy for this JobQueue.
     *
     * Instructs the Scheduler how to schedule different jobs.
     *
     * Default: - no scheduling policy
     */
    override fun schedulingPolicy(): ISchedulingPolicy? =
        unwrap(this).getSchedulingPolicy()?.let(ISchedulingPolicy::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IJobQueue): IJobQueue =
        CdkObjectWrappers.wrap(cdkObject) as? IJobQueue ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IJobQueue): software.amazon.awscdk.services.batch.IJobQueue =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.batch.IJobQueue
  }
}
