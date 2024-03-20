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
import io.cloudshiftdev.awscdk.services.sns.ITopic as CloudshiftdevAwscdkServicesSnsITopic
import software.amazon.awscdk.services.sns.ITopic as AmazonAwscdkServicesSnsITopic

/**
 * Use an SNS topic as a target for Amazon EventBridge rules.
 *
 * Example:
 *
 * ```
 * // publish to an SNS topic every time code is committed
 * // to a CodeCommit repository
 * repository.onCommit("onCommit", OnCommitOptions.builder().target(new SnsTopic(topic)).build());
 * ```
 */
public open class SnsTopic internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.SnsTopic,
) : CdkObject(cdkObject), IRuleTarget {
  public constructor(topic: CloudshiftdevAwscdkServicesSnsITopic) :
      this(software.amazon.awscdk.services.events.targets.SnsTopic(topic.let(CloudshiftdevAwscdkServicesSnsITopic::unwrap))
  )

  public constructor(topic: CloudshiftdevAwscdkServicesSnsITopic, props: SnsTopicProps) :
      this(software.amazon.awscdk.services.events.targets.SnsTopic(topic.let(CloudshiftdevAwscdkServicesSnsITopic::unwrap),
      props.let(SnsTopicProps::unwrap))
  )

  public constructor(topic: CloudshiftdevAwscdkServicesSnsITopic,
      props: SnsTopicProps.Builder.() -> Unit) : this(topic, SnsTopicProps(props)
  )

  /**
   * Returns a RuleTarget that can be used to trigger this SNS topic as a result from an EventBridge
   * event.
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/resource-based-policies-eventbridge.html#sns-permissions)
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this SNS topic as a result from an EventBridge
   * event.
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/resource-based-policies-eventbridge.html#sns-permissions)
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   *
   */
  public open fun topic(): CloudshiftdevAwscdkServicesSnsITopic =
      unwrap(this).getTopic().let(CloudshiftdevAwscdkServicesSnsITopic::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.SnsTopic].
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
     * The message to send to the topic.
     *
     * Default: the entire EventBridge event
     *
     * @param message The message to send to the topic. 
     */
    public fun message(message: RuleTargetInput)

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
    topic: AmazonAwscdkServicesSnsITopic,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.SnsTopic.Builder =
        software.amazon.awscdk.services.events.targets.SnsTopic.Builder.create(topic)

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
     * The message to send to the topic.
     *
     * Default: the entire EventBridge event
     *
     * @param message The message to send to the topic. 
     */
    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput::unwrap))
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

    public fun build(): software.amazon.awscdk.services.events.targets.SnsTopic = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(topic: CloudshiftdevAwscdkServicesSnsITopic,
        block: Builder.() -> Unit = {}): SnsTopic {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesSnsITopic.unwrap(topic))
      return SnsTopic(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.SnsTopic): SnsTopic
        = SnsTopic(cdkObject)

    internal fun unwrap(wrapped: SnsTopic): software.amazon.awscdk.services.events.targets.SnsTopic
        = wrapped.cdkObject
  }
}
