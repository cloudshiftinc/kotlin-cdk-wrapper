@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.Unit

/**
 * Customize the CloudWatch LogGroup Event Target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * LogGroup logGroup;
 * Rule rule;
 * rule.addTarget(CloudWatchLogGroup.Builder.create(logGroup)
 * .logEvent(LogGroupTargetInput.fromObject(LogGroupTargetInputOptions.builder()
 * .message(JSON.stringify(Map.of(
 * "CustomField", "CustomValue")))
 * .build()))
 * .build());
 * ```
 */
public interface LogGroupProps : TargetBaseProps {
  /**
   * (deprecated) The event to send to the CloudWatch LogGroup.
   *
   * This will be the event logged into the CloudWatch LogGroup
   *
   * Default: - the entire EventBridge event
   *
   * @deprecated use logEvent instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

  /**
   * Whether the custom resource created wll default to install latest AWS SDK.
   *
   * Default: - install latest AWS SDK
   */
  public fun installLatestAwsSdk(): Boolean? = unwrap(this).getInstallLatestAwsSdk()

  /**
   * The event to send to the CloudWatch LogGroup.
   *
   * This will be the event logged into the CloudWatch LogGroup
   *
   * Default: - the entire EventBridge event
   */
  public fun logEvent(): LogGroupTargetInput? =
      unwrap(this).getLogEvent()?.let(LogGroupTargetInput::wrap)

  /**
   * A builder for [LogGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param event The event to send to the CloudWatch LogGroup.
     * This will be the event logged into the CloudWatch LogGroup
     * @deprecated use logEvent instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun event(event: RuleTargetInput)

    /**
     * @param installLatestAwsSdk Whether the custom resource created wll default to install latest
     * AWS SDK.
     */
    public fun installLatestAwsSdk(installLatestAwsSdk: Boolean)

    /**
     * @param logEvent The event to send to the CloudWatch LogGroup.
     * This will be the event logged into the CloudWatch LogGroup
     */
    public fun logEvent(logEvent: LogGroupTargetInput)

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.LogGroupProps.Builder =
        software.amazon.awscdk.services.events.targets.LogGroupProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * @param event The event to send to the CloudWatch LogGroup.
     * This will be the event logged into the CloudWatch LogGroup
     * @deprecated use logEvent instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
    }

    /**
     * @param installLatestAwsSdk Whether the custom resource created wll default to install latest
     * AWS SDK.
     */
    override fun installLatestAwsSdk(installLatestAwsSdk: Boolean) {
      cdkBuilder.installLatestAwsSdk(installLatestAwsSdk)
    }

    /**
     * @param logEvent The event to send to the CloudWatch LogGroup.
     * This will be the event logged into the CloudWatch LogGroup
     */
    override fun logEvent(logEvent: LogGroupTargetInput) {
      cdkBuilder.logEvent(logEvent.let(LogGroupTargetInput::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.LogGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.LogGroupProps,
  ) : CdkObject(cdkObject), LogGroupProps {
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
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * (deprecated) The event to send to the CloudWatch LogGroup.
     *
     * This will be the event logged into the CloudWatch LogGroup
     *
     * Default: - the entire EventBridge event
     *
     * @deprecated use logEvent instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

    /**
     * Whether the custom resource created wll default to install latest AWS SDK.
     *
     * Default: - install latest AWS SDK
     */
    override fun installLatestAwsSdk(): Boolean? = unwrap(this).getInstallLatestAwsSdk()

    /**
     * The event to send to the CloudWatch LogGroup.
     *
     * This will be the event logged into the CloudWatch LogGroup
     *
     * Default: - the entire EventBridge event
     */
    override fun logEvent(): LogGroupTargetInput? =
        unwrap(this).getLogEvent()?.let(LogGroupTargetInput::wrap)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.LogGroupProps):
        LogGroupProps = CdkObjectWrappers.wrap(cdkObject) as? LogGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogGroupProps):
        software.amazon.awscdk.services.events.targets.LogGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.LogGroupProps
  }
}
