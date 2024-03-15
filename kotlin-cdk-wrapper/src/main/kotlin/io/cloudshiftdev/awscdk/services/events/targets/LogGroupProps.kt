@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.Unit

public interface LogGroupProps : TargetBaseProps {
  @Deprecated(message = "deprecated in CDK")
  public fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

  public fun installLatestAwsSdk(): Boolean? = unwrap(this).getInstallLatestAwsSdk()

  public fun logEvent(): LogGroupTargetInput? =
      unwrap(this).getLogEvent()?.let(LogGroupTargetInput::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    @Deprecated(message = "deprecated in CDK")
    public fun event(event: RuleTargetInput)

    public fun installLatestAwsSdk(installLatestAwsSdk: Boolean)

    public fun logEvent(logEvent: LogGroupTargetInput)

    public fun maxEventAge(maxEventAge: Duration)

    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.LogGroupProps.Builder =
        software.amazon.awscdk.services.events.targets.LogGroupProps.builder()

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
    }

    override fun installLatestAwsSdk(installLatestAwsSdk: Boolean) {
      cdkBuilder.installLatestAwsSdk(installLatestAwsSdk)
    }

    override fun logEvent(logEvent: LogGroupTargetInput) {
      cdkBuilder.logEvent(logEvent.let(LogGroupTargetInput::unwrap))
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.LogGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.LogGroupProps,
  ) : CdkObject(cdkObject), LogGroupProps {
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

    override fun installLatestAwsSdk(): Boolean? = unwrap(this).getInstallLatestAwsSdk()

    override fun logEvent(): LogGroupTargetInput? =
        unwrap(this).getLogEvent()?.let(LogGroupTargetInput::wrap)

    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.LogGroupProps):
        LogGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogGroupProps):
        software.amazon.awscdk.services.events.targets.LogGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.LogGroupProps
  }
}
