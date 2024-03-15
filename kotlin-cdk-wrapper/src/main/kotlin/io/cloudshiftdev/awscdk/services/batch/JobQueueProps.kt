@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface JobQueueProps {
  public fun computeEnvironments(): List<OrderedComputeEnvironment> =
      unwrap(this).getComputeEnvironments()?.map(OrderedComputeEnvironment::wrap) ?: emptyList()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun jobQueueName(): String? = unwrap(this).getJobQueueName()

  public fun priority(): Number? = unwrap(this).getPriority()

  public fun schedulingPolicy(): ISchedulingPolicy? =
      unwrap(this).getSchedulingPolicy()?.let(ISchedulingPolicy::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun computeEnvironments(computeEnvironments: List<OrderedComputeEnvironment>)

    public fun computeEnvironments(vararg computeEnvironments: OrderedComputeEnvironment)

    public fun enabled(enabled: Boolean)

    public fun jobQueueName(jobQueueName: String)

    public fun priority(priority: Number)

    public fun schedulingPolicy(schedulingPolicy: ISchedulingPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.JobQueueProps.Builder =
        software.amazon.awscdk.services.batch.JobQueueProps.builder()

    override fun computeEnvironments(computeEnvironments: List<OrderedComputeEnvironment>) {
      cdkBuilder.computeEnvironments(computeEnvironments.map(OrderedComputeEnvironment::unwrap))
    }

    override fun computeEnvironments(vararg computeEnvironments: OrderedComputeEnvironment): Unit =
        computeEnvironments(computeEnvironments.toList())

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun jobQueueName(jobQueueName: String) {
      cdkBuilder.jobQueueName(jobQueueName)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun schedulingPolicy(schedulingPolicy: ISchedulingPolicy) {
      cdkBuilder.schedulingPolicy(schedulingPolicy.let(ISchedulingPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.JobQueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.JobQueueProps,
  ) : CdkObject(cdkObject), JobQueueProps {
    override fun computeEnvironments(): List<OrderedComputeEnvironment> =
        unwrap(this).getComputeEnvironments()?.map(OrderedComputeEnvironment::wrap) ?: emptyList()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun jobQueueName(): String? = unwrap(this).getJobQueueName()

    override fun priority(): Number? = unwrap(this).getPriority()

    override fun schedulingPolicy(): ISchedulingPolicy? =
        unwrap(this).getSchedulingPolicy()?.let(ISchedulingPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JobQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.JobQueueProps): JobQueueProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JobQueueProps): software.amazon.awscdk.services.batch.JobQueueProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.batch.JobQueueProps
  }
}
