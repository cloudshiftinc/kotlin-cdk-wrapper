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
import io.cloudshiftdev.awscdk.services.kinesis.IStream as CloudshiftdevAwscdkServicesKinesisIStream
import software.amazon.awscdk.services.kinesis.IStream as AmazonAwscdkServicesKinesisIStream

/**
 * Use a Kinesis Stream as a target for AWS CloudWatch event rules.
 *
 * Example:
 *
 * ```
 * // put to a Kinesis stream every time code is committed
 * // to a CodeCommit repository
 * repository.onCommit("onCommit", OnCommitOptions.builder().target(new
 * KinesisStream(stream)).build());
 * ```
 */
public open class KinesisStream(
  cdkObject: software.amazon.awscdk.services.events.targets.KinesisStream,
) : CdkObject(cdkObject),
    IRuleTarget {
  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream) :
      this(software.amazon.awscdk.services.events.targets.KinesisStream(stream.let(CloudshiftdevAwscdkServicesKinesisIStream.Companion::unwrap))
  )

  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream, props: KinesisStreamProps) :
      this(software.amazon.awscdk.services.events.targets.KinesisStream(stream.let(CloudshiftdevAwscdkServicesKinesisIStream.Companion::unwrap),
      props.let(KinesisStreamProps.Companion::unwrap))
  )

  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream,
      props: KinesisStreamProps.Builder.() -> Unit) : this(stream, KinesisStreamProps(props)
  )

  /**
   * Returns a RuleTarget that can be used to trigger this Kinesis Stream as a result from a
   * CloudWatch event.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this Kinesis Stream as a result from a
   * CloudWatch event.
   *
   * @param _rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule.Companion::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.KinesisStream].
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
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire CloudWatch event
     *
     * @param message The message to send to the stream. 
     */
    public fun message(message: RuleTargetInput)

    /**
     * Partition Key Path for records sent to this stream.
     *
     * Default: - eventId as the partition key
     *
     * @param partitionKeyPath Partition Key Path for records sent to this stream. 
     */
    public fun partitionKeyPath(partitionKeyPath: String)

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
    stream: AmazonAwscdkServicesKinesisIStream,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.KinesisStream.Builder =
        software.amazon.awscdk.services.events.targets.KinesisStream.Builder.create(stream)

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
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
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
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire CloudWatch event
     *
     * @param message The message to send to the stream. 
     */
    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * Partition Key Path for records sent to this stream.
     *
     * Default: - eventId as the partition key
     *
     * @param partitionKeyPath Partition Key Path for records sent to this stream. 
     */
    override fun partitionKeyPath(partitionKeyPath: String) {
      cdkBuilder.partitionKeyPath(partitionKeyPath)
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

    public fun build(): software.amazon.awscdk.services.events.targets.KinesisStream =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(stream: CloudshiftdevAwscdkServicesKinesisIStream,
        block: Builder.() -> Unit = {}): KinesisStream {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesKinesisIStream.unwrap(stream))
      return KinesisStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.KinesisStream):
        KinesisStream = KinesisStream(cdkObject)

    internal fun unwrap(wrapped: KinesisStream):
        software.amazon.awscdk.services.events.targets.KinesisStream = wrapped.cdkObject as
        software.amazon.awscdk.services.events.targets.KinesisStream
  }
}
