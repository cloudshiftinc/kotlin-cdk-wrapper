@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Props to configure a JobQueue.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .build())
 * .build();
 * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
 * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
 * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
 * .vpc(vpc)
 * .build())
 * .order(1)
 * .build()))
 * .priority(10)
 * .build();
 * User user = new User(this, "MyUser");
 * ecsJob.grantSubmitJob(user, queue);
 * ```
 */
public interface JobQueueProps {
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
   *
   * Default: none
   */
  public fun computeEnvironments(): List<OrderedComputeEnvironment> =
      unwrap(this).getComputeEnvironments()?.map(OrderedComputeEnvironment::wrap) ?: emptyList()

  /**
   * If the job queue is enabled, it is able to accept jobs.
   *
   * Otherwise, new jobs can't be added to the queue, but jobs already in the queue can finish.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The name of the job queue.
   *
   * It can be up to 128 letters long.
   * It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_)
   *
   * Default: - no name
   */
  public fun jobQueueName(): String? = unwrap(this).getJobQueueName()

  /**
   * The priority of the job queue.
   *
   * Job queues with a higher priority are evaluated first when associated with the same compute
   * environment.
   * Priority is determined in descending order.
   * For example, a job queue with a priority of 10 is given scheduling preference over a job queue
   * with a priority of 1.
   *
   * Default: 1
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * The SchedulingPolicy for this JobQueue.
   *
   * Instructs the Scheduler how to schedule different jobs.
   *
   * Default: - no scheduling policy
   */
  public fun schedulingPolicy(): ISchedulingPolicy? =
      unwrap(this).getSchedulingPolicy()?.let(ISchedulingPolicy::wrap)

  /**
   * A builder for [JobQueueProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param computeEnvironments The set of compute environments mapped to a job queue and their
     * order relative to each other.
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
    public fun computeEnvironments(computeEnvironments: List<OrderedComputeEnvironment>)

    /**
     * @param computeEnvironments The set of compute environments mapped to a job queue and their
     * order relative to each other.
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
    public fun computeEnvironments(vararg computeEnvironments: OrderedComputeEnvironment)

    /**
     * @param enabled If the job queue is enabled, it is able to accept jobs.
     * Otherwise, new jobs can't be added to the queue, but jobs already in the queue can finish.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param jobQueueName The name of the job queue.
     * It can be up to 128 letters long.
     * It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_)
     */
    public fun jobQueueName(jobQueueName: String)

    /**
     * @param priority The priority of the job queue.
     * Job queues with a higher priority are evaluated first when associated with the same compute
     * environment.
     * Priority is determined in descending order.
     * For example, a job queue with a priority of 10 is given scheduling preference over a job
     * queue with a priority of 1.
     */
    public fun priority(priority: Number)

    /**
     * @param schedulingPolicy The SchedulingPolicy for this JobQueue.
     * Instructs the Scheduler how to schedule different jobs.
     */
    public fun schedulingPolicy(schedulingPolicy: ISchedulingPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.JobQueueProps.Builder =
        software.amazon.awscdk.services.batch.JobQueueProps.builder()

    /**
     * @param computeEnvironments The set of compute environments mapped to a job queue and their
     * order relative to each other.
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
    override fun computeEnvironments(computeEnvironments: List<OrderedComputeEnvironment>) {
      cdkBuilder.computeEnvironments(computeEnvironments.map(OrderedComputeEnvironment::unwrap))
    }

    /**
     * @param computeEnvironments The set of compute environments mapped to a job queue and their
     * order relative to each other.
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
    override fun computeEnvironments(vararg computeEnvironments: OrderedComputeEnvironment): Unit =
        computeEnvironments(computeEnvironments.toList())

    /**
     * @param enabled If the job queue is enabled, it is able to accept jobs.
     * Otherwise, new jobs can't be added to the queue, but jobs already in the queue can finish.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param jobQueueName The name of the job queue.
     * It can be up to 128 letters long.
     * It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_)
     */
    override fun jobQueueName(jobQueueName: String) {
      cdkBuilder.jobQueueName(jobQueueName)
    }

    /**
     * @param priority The priority of the job queue.
     * Job queues with a higher priority are evaluated first when associated with the same compute
     * environment.
     * Priority is determined in descending order.
     * For example, a job queue with a priority of 10 is given scheduling preference over a job
     * queue with a priority of 1.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param schedulingPolicy The SchedulingPolicy for this JobQueue.
     * Instructs the Scheduler how to schedule different jobs.
     */
    override fun schedulingPolicy(schedulingPolicy: ISchedulingPolicy) {
      cdkBuilder.schedulingPolicy(schedulingPolicy.let(ISchedulingPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.JobQueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.JobQueueProps,
  ) : CdkObject(cdkObject), JobQueueProps {
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
     *
     * Default: none
     */
    override fun computeEnvironments(): List<OrderedComputeEnvironment> =
        unwrap(this).getComputeEnvironments()?.map(OrderedComputeEnvironment::wrap) ?: emptyList()

    /**
     * If the job queue is enabled, it is able to accept jobs.
     *
     * Otherwise, new jobs can't be added to the queue, but jobs already in the queue can finish.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The name of the job queue.
     *
     * It can be up to 128 letters long.
     * It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_)
     *
     * Default: - no name
     */
    override fun jobQueueName(): String? = unwrap(this).getJobQueueName()

    /**
     * The priority of the job queue.
     *
     * Job queues with a higher priority are evaluated first when associated with the same compute
     * environment.
     * Priority is determined in descending order.
     * For example, a job queue with a priority of 10 is given scheduling preference over a job
     * queue with a priority of 1.
     *
     * Default: 1
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The SchedulingPolicy for this JobQueue.
     *
     * Instructs the Scheduler how to schedule different jobs.
     *
     * Default: - no scheduling policy
     */
    override fun schedulingPolicy(): ISchedulingPolicy? =
        unwrap(this).getSchedulingPolicy()?.let(ISchedulingPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JobQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.JobQueueProps): JobQueueProps
        = CdkObjectWrappers.wrap(cdkObject) as? JobQueueProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: JobQueueProps): software.amazon.awscdk.services.batch.JobQueueProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.batch.JobQueueProps
  }
}
