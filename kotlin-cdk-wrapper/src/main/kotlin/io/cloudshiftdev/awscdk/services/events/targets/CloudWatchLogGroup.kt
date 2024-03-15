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
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.logs.ILogGroup as CloudshiftdevAwscdkServicesLogsILogGroup
import software.amazon.awscdk.services.logs.ILogGroup as AmazonAwscdkServicesLogsILogGroup

public open class CloudWatchLogGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.events.targets.CloudWatchLogGroup,
) : CdkObject(cdkObject), IRuleTarget {
  public override fun bind(_rule: IRule): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(_rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

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

  private class BuilderImpl(
    logGroup: AmazonAwscdkServicesLogsILogGroup,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.CloudWatchLogGroup.Builder =
        software.amazon.awscdk.services.events.targets.CloudWatchLogGroup.Builder.create(logGroup)

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

    public fun build(): software.amazon.awscdk.services.events.targets.CloudWatchLogGroup =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(logGroup: CloudshiftdevAwscdkServicesLogsILogGroup,
        block: Builder.() -> Unit = {}): CloudWatchLogGroup {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesLogsILogGroup.unwrap(logGroup))
      return CloudWatchLogGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.CloudWatchLogGroup):
        CloudWatchLogGroup = CloudWatchLogGroup(cdkObject)

    internal fun unwrap(wrapped: CloudWatchLogGroup):
        software.amazon.awscdk.services.events.targets.CloudWatchLogGroup = wrapped.cdkObject
  }
}
