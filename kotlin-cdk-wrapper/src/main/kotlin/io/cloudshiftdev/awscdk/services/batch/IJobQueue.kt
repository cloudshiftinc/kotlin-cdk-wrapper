@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IJobQueue): IJobQueue =
        CdkObjectWrappers.wrap(cdkObject) as IJobQueue

    internal fun unwrap(wrapped: IJobQueue): software.amazon.awscdk.services.batch.IJobQueue =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.batch.IJobQueue
  }
}
