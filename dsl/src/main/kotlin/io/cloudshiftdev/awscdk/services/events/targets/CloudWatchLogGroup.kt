package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  /**
   * Returns a RuleTarget that can be used to log an event into a CloudWatch LogGroup.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(_rule: IRule): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to log an event into a CloudWatch LogGroup.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(_rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.CloudWatchLogGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
     * dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * (deprecated) The event to send to the CloudWatch LogGroup.
     *
     * This will be the event logged into the CloudWatch LogGroup
     *
     * Default: - the entire EventBridge event
     *
     * @deprecated use logEvent instead
     * @param event The event to send to the CloudWatch LogGroup. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun event(event: RuleTargetInput)

    /**
     * Whether the custom resource created wll default to install latest AWS SDK.
     *
     * Default: - install latest AWS SDK
     *
     * @param installLatestAwsSdk Whether the custom resource created wll default to install latest
     * AWS SDK. 
     */
    public fun installLatestAwsSdk(installLatestAwsSdk: Boolean)

    /**
     * The event to send to the CloudWatch LogGroup.
     *
     * This will be the event logged into the CloudWatch LogGroup
     *
     * Default: - the entire EventBridge event
     *
     * @param logEvent The event to send to the CloudWatch LogGroup. 
     */
    public fun logEvent(logEvent: LogGroupTargetInput)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    logGroup: AmazonAwscdkServicesLogsILogGroup,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.CloudWatchLogGroup.Builder =
        software.amazon.awscdk.services.events.targets.CloudWatchLogGroup.Builder.create(logGroup)

    /**
     * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
     * dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * (deprecated) The event to send to the CloudWatch LogGroup.
     *
     * This will be the event logged into the CloudWatch LogGroup
     *
     * Default: - the entire EventBridge event
     *
     * @deprecated use logEvent instead
     * @param event The event to send to the CloudWatch LogGroup. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
    }

    /**
     * Whether the custom resource created wll default to install latest AWS SDK.
     *
     * Default: - install latest AWS SDK
     *
     * @param installLatestAwsSdk Whether the custom resource created wll default to install latest
     * AWS SDK. 
     */
    override fun installLatestAwsSdk(installLatestAwsSdk: Boolean) {
      cdkBuilder.installLatestAwsSdk(installLatestAwsSdk)
    }

    /**
     * The event to send to the CloudWatch LogGroup.
     *
     * This will be the event logged into the CloudWatch LogGroup
     *
     * Default: - the entire EventBridge event
     *
     * @param logEvent The event to send to the CloudWatch LogGroup. 
     */
    override fun logEvent(logEvent: LogGroupTargetInput) {
      cdkBuilder.logEvent(logEvent.let(LogGroupTargetInput::unwrap))
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
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
