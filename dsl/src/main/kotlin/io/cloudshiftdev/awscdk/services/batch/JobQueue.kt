package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class JobQueue internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.JobQueue,
) : Resource(cdkObject), IJobQueue {
  public override fun addComputeEnvironment(computeEnvironment: IComputeEnvironment,
      order: Number) {
    unwrap(this).addComputeEnvironment(computeEnvironment.let(IComputeEnvironment::unwrap), order)
  }

  public override fun computeEnvironments(): List<OrderedComputeEnvironment> =
      unwrap(this).getComputeEnvironments().map(OrderedComputeEnvironment::wrap)

  public override fun enabled(): Boolean? = unwrap(this).getEnabled()

  public override fun jobQueueArn(): String = unwrap(this).getJobQueueArn()

  public override fun jobQueueName(): String = unwrap(this).getJobQueueName()

  public override fun priority(): Number = unwrap(this).getPriority()

  public override fun schedulingPolicy(): ISchedulingPolicy? =
      unwrap(this).getSchedulingPolicy()?.let(ISchedulingPolicy::wrap)

  public interface Builder {
    public fun computeEnvironments(computeEnvironments: List<OrderedComputeEnvironment>) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun jobQueueName(jobQueueName: String) {
    }

    public fun priority(priority: Number) {
    }

    public fun schedulingPolicy(schedulingPolicy: ISchedulingPolicy) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.JobQueue.Builder =
        software.amazon.awscdk.services.batch.JobQueue.Builder.create(scope, id)

    public override fun computeEnvironments(computeEnvironments: List<OrderedComputeEnvironment>) {
      cdkBuilder.computeEnvironments(computeEnvironments.map(OrderedComputeEnvironment::unwrap))
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun jobQueueName(jobQueueName: String) {
      cdkBuilder.jobQueueName(jobQueueName)
    }

    public override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public override fun schedulingPolicy(schedulingPolicy: ISchedulingPolicy) {
      cdkBuilder.schedulingPolicy(schedulingPolicy.let(ISchedulingPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.JobQueue = cdkBuilder.build()
  }

  public companion object {
    public open fun fromJobQueueArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      jobQueueArn: String,
    ): IJobQueue =
        software.amazon.awscdk.services.batch.JobQueue.fromJobQueueArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
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
        wrapped.cdkObject
  }
}
