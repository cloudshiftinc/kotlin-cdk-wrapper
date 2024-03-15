@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.sqs.IQueue as CloudshiftdevAwscdkServicesSqsIQueue
import software.amazon.awscdk.services.sqs.IQueue as AmazonAwscdkServicesSqsIQueue

public open class SqsQueue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.SqsQueue,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  public open fun queue(): CloudshiftdevAwscdkServicesSqsIQueue =
      unwrap(this).getQueue().let(CloudshiftdevAwscdkServicesSqsIQueue::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: CloudshiftdevAwscdkServicesSqsIQueue)

    public fun maxEventAge(maxEventAge: Duration)

    public fun message(message: RuleTargetInput)

    public fun messageGroupId(messageGroupId: String)

    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    queue: AmazonAwscdkServicesSqsIQueue,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.SqsQueue.Builder =
        software.amazon.awscdk.services.events.targets.SqsQueue.Builder.create(queue)

    override fun deadLetterQueue(deadLetterQueue: CloudshiftdevAwscdkServicesSqsIQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(CloudshiftdevAwscdkServicesSqsIQueue::unwrap))
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput::unwrap))
    }

    override fun messageGroupId(messageGroupId: String) {
      cdkBuilder.messageGroupId(messageGroupId)
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.SqsQueue = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(queue: CloudshiftdevAwscdkServicesSqsIQueue,
        block: Builder.() -> Unit = {}): SqsQueue {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesSqsIQueue.unwrap(queue))
      return SqsQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.SqsQueue): SqsQueue
        = SqsQueue(cdkObject)

    internal fun unwrap(wrapped: SqsQueue): software.amazon.awscdk.services.events.targets.SqsQueue
        = wrapped.cdkObject
  }
}
