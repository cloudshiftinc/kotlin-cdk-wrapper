@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface BatchJobProps : TargetBaseProps {
  public fun attempts(): Number? = unwrap(this).getAttempts()

  public fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

  public fun jobName(): String? = unwrap(this).getJobName()

  public fun size(): Number? = unwrap(this).getSize()

  @CdkDslMarker
  public interface Builder {
    public fun attempts(attempts: Number)

    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun event(event: RuleTargetInput)

    public fun jobName(jobName: String)

    public fun maxEventAge(maxEventAge: Duration)

    public fun retryAttempts(retryAttempts: Number)

    public fun size(size: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.BatchJobProps.Builder =
        software.amazon.awscdk.services.events.targets.BatchJobProps.builder()

    override fun attempts(attempts: Number) {
      cdkBuilder.attempts(attempts)
    }

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
    }

    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    override fun size(size: Number) {
      cdkBuilder.size(size)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.BatchJobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.BatchJobProps,
  ) : CdkObject(cdkObject), BatchJobProps {
    override fun attempts(): Number? = unwrap(this).getAttempts()

    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    override fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

    override fun jobName(): String? = unwrap(this).getJobName()

    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    override fun size(): Number? = unwrap(this).getSize()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BatchJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.BatchJobProps):
        BatchJobProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchJobProps):
        software.amazon.awscdk.services.events.targets.BatchJobProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.BatchJobProps
  }
}
