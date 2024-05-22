@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * JobQueues can receive Jobs, which are removed from the queue when sent to the linked
 * ComputeEnvironment(s) to be executed.
 *
 * Jobs exit the queue in FIFO order unless a `SchedulingPolicy` is linked.
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
public open class JobQueue(
  cdkObject: software.amazon.awscdk.services.batch.JobQueue,
) : Resource(cdkObject), IJobQueue {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.batch.JobQueue(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: JobQueueProps,
  ) :
      this(software.amazon.awscdk.services.batch.JobQueue(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(JobQueueProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: JobQueueProps.Builder.() -> Unit,
  ) : this(scope, id, JobQueueProps(props)
  )

  /**
   * Add a `ComputeEnvironment` to this Queue.
   *
   * The Queue will prefer lower-order `ComputeEnvironment`s.
   *
   * @param computeEnvironment 
   * @param order 
   */
  public override fun addComputeEnvironment(computeEnvironment: IComputeEnvironment,
      order: Number) {
    unwrap(this).addComputeEnvironment(computeEnvironment.let(IComputeEnvironment.Companion::unwrap),
        order)
  }

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
  public override fun computeEnvironments(): List<OrderedComputeEnvironment> =
      unwrap(this).getComputeEnvironments().map(OrderedComputeEnvironment::wrap)

  /**
   * If the job queue is enabled, it is able to accept jobs.
   *
   * Otherwise, new jobs can't be added to the queue, but jobs already in the queue can finish.
   */
  public override fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The ARN of this job queue.
   */
  public override fun jobQueueArn(): String = unwrap(this).getJobQueueArn()

  /**
   * The name of the job queue.
   *
   * It can be up to 128 letters long.
   * It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_)
   */
  public override fun jobQueueName(): String = unwrap(this).getJobQueueName()

  /**
   * The priority of the job queue.
   *
   * Job queues with a higher priority are evaluated first when associated with the same compute
   * environment.
   * Priority is determined in descending order.
   * For example, a job queue with a priority value of 10 is given scheduling preference over a job
   * queue with a priority value of 1.
   */
  public override fun priority(): Number = unwrap(this).getPriority()

  /**
   * The SchedulingPolicy for this JobQueue.
   *
   * Instructs the Scheduler how to schedule different jobs.
   */
  public override fun schedulingPolicy(): ISchedulingPolicy? =
      unwrap(this).getSchedulingPolicy()?.let(ISchedulingPolicy::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.JobQueue].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param computeEnvironments The set of compute environments mapped to a job queue and their
     * order relative to each other. 
     */
    public fun computeEnvironments(computeEnvironments: List<OrderedComputeEnvironment>)

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
     *
     * @param computeEnvironments The set of compute environments mapped to a job queue and their
     * order relative to each other. 
     */
    public fun computeEnvironments(vararg computeEnvironments: OrderedComputeEnvironment)

    /**
     * If the job queue is enabled, it is able to accept jobs.
     *
     * Otherwise, new jobs can't be added to the queue, but jobs already in the queue can finish.
     *
     * Default: true
     *
     * @param enabled If the job queue is enabled, it is able to accept jobs. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The name of the job queue.
     *
     * It can be up to 128 letters long.
     * It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_)
     *
     * Default: - no name
     *
     * @param jobQueueName The name of the job queue. 
     */
    public fun jobQueueName(jobQueueName: String)

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
     *
     * @param priority The priority of the job queue. 
     */
    public fun priority(priority: Number)

    /**
     * The SchedulingPolicy for this JobQueue.
     *
     * Instructs the Scheduler how to schedule different jobs.
     *
     * Default: - no scheduling policy
     *
     * @param schedulingPolicy The SchedulingPolicy for this JobQueue. 
     */
    public fun schedulingPolicy(schedulingPolicy: ISchedulingPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.JobQueue.Builder =
        software.amazon.awscdk.services.batch.JobQueue.Builder.create(scope, id)

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
     *
     * @param computeEnvironments The set of compute environments mapped to a job queue and their
     * order relative to each other. 
     */
    override fun computeEnvironments(computeEnvironments: List<OrderedComputeEnvironment>) {
      cdkBuilder.computeEnvironments(computeEnvironments.map(OrderedComputeEnvironment.Companion::unwrap))
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
     *
     * Default: none
     *
     * @param computeEnvironments The set of compute environments mapped to a job queue and their
     * order relative to each other. 
     */
    override fun computeEnvironments(vararg computeEnvironments: OrderedComputeEnvironment): Unit =
        computeEnvironments(computeEnvironments.toList())

    /**
     * If the job queue is enabled, it is able to accept jobs.
     *
     * Otherwise, new jobs can't be added to the queue, but jobs already in the queue can finish.
     *
     * Default: true
     *
     * @param enabled If the job queue is enabled, it is able to accept jobs. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The name of the job queue.
     *
     * It can be up to 128 letters long.
     * It can contain uppercase and lowercase letters, numbers, hyphens (-), and underscores (_)
     *
     * Default: - no name
     *
     * @param jobQueueName The name of the job queue. 
     */
    override fun jobQueueName(jobQueueName: String) {
      cdkBuilder.jobQueueName(jobQueueName)
    }

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
     *
     * @param priority The priority of the job queue. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * The SchedulingPolicy for this JobQueue.
     *
     * Instructs the Scheduler how to schedule different jobs.
     *
     * Default: - no scheduling policy
     *
     * @param schedulingPolicy The SchedulingPolicy for this JobQueue. 
     */
    override fun schedulingPolicy(schedulingPolicy: ISchedulingPolicy) {
      cdkBuilder.schedulingPolicy(schedulingPolicy.let(ISchedulingPolicy.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.JobQueue = cdkBuilder.build()
  }

  public companion object {
    public fun fromJobQueueArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      jobQueueArn: String,
    ): IJobQueue =
        software.amazon.awscdk.services.batch.JobQueue.fromJobQueueArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, jobQueueArn).let(IJobQueue::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): JobQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return JobQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.JobQueue): JobQueue =
        JobQueue(cdkObject)

    internal fun unwrap(wrapped: JobQueue): software.amazon.awscdk.services.batch.JobQueue =
        wrapped.cdkObject as software.amazon.awscdk.services.batch.JobQueue
  }
}
