@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.sns.FilterOrPolicy
import io.cloudshiftdev.awscdk.services.sns.SubscriptionFilter
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.sns.ITopic as CloudshiftdevAwscdkServicesSnsITopic
import software.amazon.awscdk.services.sns.ITopic as AmazonAwscdkServicesSnsITopic

/**
 * Use an Amazon SNS topic as an event source for AWS Lambda.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.SnsEventSource;
 * Topic topic;
 * Function fn;
 * Queue deadLetterQueue = new Queue(this, "deadLetterQueue");
 * fn.addEventSource(SnsEventSource.Builder.create(topic)
 * .filterPolicy(Map.of())
 * .deadLetterQueue(deadLetterQueue)
 * .build());
 * ```
 */
public open class SnsEventSource(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.SnsEventSource,
) : CdkObject(cdkObject), IEventSource {
  public constructor(topic: CloudshiftdevAwscdkServicesSnsITopic) :
      this(software.amazon.awscdk.services.lambda.eventsources.SnsEventSource(topic.let(CloudshiftdevAwscdkServicesSnsITopic::unwrap))
  )

  public constructor(topic: CloudshiftdevAwscdkServicesSnsITopic, props: SnsEventSourceProps) :
      this(software.amazon.awscdk.services.lambda.eventsources.SnsEventSource(topic.let(CloudshiftdevAwscdkServicesSnsITopic::unwrap),
      props.let(SnsEventSourceProps::unwrap))
  )

  public constructor(topic: CloudshiftdevAwscdkServicesSnsITopic,
      props: SnsEventSourceProps.Builder.() -> Unit) : this(topic, SnsEventSourceProps(props)
  )

  /**
   * Called by `lambda.addEventSource` to allow the event source to bind to this function.
   *
   * @param target 
   */
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction::unwrap))
  }

  /**
   *
   */
  public open fun topic(): CloudshiftdevAwscdkServicesSnsITopic =
      unwrap(this).getTopic().let(CloudshiftdevAwscdkServicesSnsITopic::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.eventsources.SnsEventSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Queue to be used as dead letter queue.
     *
     * If not passed no dead letter queue is enabled.
     *
     * Default: - No dead letter queue enabled.
     *
     * @param deadLetterQueue Queue to be used as dead letter queue. 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * The filter policy.
     *
     * Default: - all messages are delivered
     *
     * @param filterPolicy The filter policy. 
     */
    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>)

    /**
     * The filter policy that is applied on the message body.
     *
     * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
     * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
     *
     * Default: - all messages are delivered
     *
     * @param filterPolicyWithMessageBody The filter policy that is applied on the message body. 
     */
    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>)
  }

  private class BuilderImpl(
    topic: AmazonAwscdkServicesSnsITopic,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.SnsEventSource.Builder =
        software.amazon.awscdk.services.lambda.eventsources.SnsEventSource.Builder.create(topic)

    /**
     * Queue to be used as dead letter queue.
     *
     * If not passed no dead letter queue is enabled.
     *
     * Default: - No dead letter queue enabled.
     *
     * @param deadLetterQueue Queue to be used as dead letter queue. 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * The filter policy.
     *
     * Default: - all messages are delivered
     *
     * @param filterPolicy The filter policy. 
     */
    override fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
      cdkBuilder.filterPolicy(filterPolicy.mapValues{SubscriptionFilter.unwrap(it.value)})
    }

    /**
     * The filter policy that is applied on the message body.
     *
     * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
     * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
     *
     * Default: - all messages are delivered
     *
     * @param filterPolicyWithMessageBody The filter policy that is applied on the message body. 
     */
    override
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
      cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody.mapValues{FilterOrPolicy.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.SnsEventSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(topic: CloudshiftdevAwscdkServicesSnsITopic,
        block: Builder.() -> Unit = {}): SnsEventSource {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesSnsITopic.unwrap(topic))
      return SnsEventSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.SnsEventSource):
        SnsEventSource = SnsEventSource(cdkObject)

    internal fun unwrap(wrapped: SnsEventSource):
        software.amazon.awscdk.services.lambda.eventsources.SnsEventSource = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.SnsEventSource
  }
}
