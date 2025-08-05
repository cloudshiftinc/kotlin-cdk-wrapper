@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * Customize the SNS Topic Event Target.
 *
 * Example:
 *
 * ```
 * Rule onCommitRule;
 * Topic topic;
 * onCommitRule.addTarget(SnsTopic.Builder.create(topic)
 * .message(RuleTargetInput.fromObject(Map.of(
 * "DataType", String.format("custom_%s", EventField.fromPath("$.detail-type")))))
 * .build());
 * ```
 */
public interface SnsTopicProps : TargetBaseProps {
  /**
   * Specifies whether an IAM role should be used to publish to the topic.
   *
   * Default: - true if `role` is provided, false otherwise
   */
  public fun authorizeUsingRole(): Boolean? = unwrap(this).getAuthorizeUsingRole()

  /**
   * The message to send to the topic.
   *
   * Default: the entire EventBridge event
   */
  public fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)

  /**
   * The IAM role to be used to publish to the topic.
   *
   * Default: - a new role will be created if `authorizeUsingRole` is true
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [SnsTopicProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizeUsingRole Specifies whether an IAM role should be used to publish to the
     * topic.
     */
    public fun authorizeUsingRole(authorizeUsingRole: Boolean)

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
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param message The message to send to the topic.
     */
    public fun message(message: RuleTargetInput)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param role The IAM role to be used to publish to the topic.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.SnsTopicProps.Builder =
        software.amazon.awscdk.services.events.targets.SnsTopicProps.builder()

    /**
     * @param authorizeUsingRole Specifies whether an IAM role should be used to publish to the
     * topic.
     */
    override fun authorizeUsingRole(authorizeUsingRole: Boolean) {
      cdkBuilder.authorizeUsingRole(authorizeUsingRole)
    }

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
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param message The message to send to the topic.
     */
    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param role The IAM role to be used to publish to the topic.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.SnsTopicProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.SnsTopicProps,
  ) : CdkObject(cdkObject),
      SnsTopicProps {
    /**
     * Specifies whether an IAM role should be used to publish to the topic.
     *
     * Default: - true if `role` is provided, false otherwise
     */
    override fun authorizeUsingRole(): Boolean? = unwrap(this).getAuthorizeUsingRole()

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
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The message to send to the topic.
     *
     * Default: the entire EventBridge event
     */
    override fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * The IAM role to be used to publish to the topic.
     *
     * Default: - a new role will be created if `authorizeUsingRole` is true
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SnsTopicProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.SnsTopicProps):
        SnsTopicProps = CdkObjectWrappers.wrap(cdkObject) as? SnsTopicProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SnsTopicProps):
        software.amazon.awscdk.services.events.targets.SnsTopicProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.SnsTopicProps
  }
}
