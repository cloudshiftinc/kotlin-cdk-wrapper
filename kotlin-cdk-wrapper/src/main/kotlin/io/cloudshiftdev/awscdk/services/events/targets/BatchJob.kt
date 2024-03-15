@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.IConstruct as CloudshiftdevConstructsIConstruct
import software.constructs.IConstruct as SoftwareConstructsIConstruct

public open class BatchJob internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.BatchJob,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

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

  private class BuilderImpl(
    jobQueueArn: String,
    jobQueueScope: SoftwareConstructsIConstruct,
    jobDefinitionArn: String,
    jobDefinitionScope: SoftwareConstructsIConstruct,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.BatchJob.Builder =
        software.amazon.awscdk.services.events.targets.BatchJob.Builder.create(jobQueueArn,
        jobQueueScope, jobDefinitionArn, jobDefinitionScope)

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

    public fun build(): software.amazon.awscdk.services.events.targets.BatchJob = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      jobQueueArn: String,
      jobQueueScope: CloudshiftdevConstructsIConstruct,
      jobDefinitionArn: String,
      jobDefinitionScope: CloudshiftdevConstructsIConstruct,
      block: Builder.() -> Unit = {},
    ): BatchJob {
      val builderImpl = BuilderImpl(jobQueueArn,
          CloudshiftdevConstructsIConstruct.unwrap(jobQueueScope), jobDefinitionArn,
          CloudshiftdevConstructsIConstruct.unwrap(jobDefinitionScope))
      return BatchJob(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.BatchJob): BatchJob
        = BatchJob(cdkObject)

    internal fun unwrap(wrapped: BatchJob): software.amazon.awscdk.services.events.targets.BatchJob
        = wrapped.cdkObject
  }
}
