@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns.subscriptions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.FilterOrPolicy
import io.cloudshiftdev.awscdk.services.sns.SubscriptionFilter
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Options for SMS subscriptions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * import io.cloudshiftdev.awscdk.services.sns.subscriptions.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * FilterOrPolicy filterOrPolicy;
 * Queue queue;
 * SubscriptionFilter subscriptionFilter;
 * SmsSubscriptionProps smsSubscriptionProps = SmsSubscriptionProps.builder()
 * .deadLetterQueue(queue)
 * .filterPolicy(Map.of(
 * "filterPolicyKey", subscriptionFilter))
 * .filterPolicyWithMessageBody(Map.of(
 * "filterPolicyWithMessageBodyKey", filterOrPolicy))
 * .build();
 * ```
 */
public interface SmsSubscriptionProps : SubscriptionProps {
  /**
   * A builder for [SmsSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueue Queue to be used as dead letter queue.
     * If not passed no dead letter queue is enabled.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param filterPolicy The filter policy.
     */
    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>)

    /**
     * @param filterPolicyWithMessageBody The filter policy that is applied on the message body.
     * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
     * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
     */
    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps.Builder =
        software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps.builder()

    /**
     * @param deadLetterQueue Queue to be used as dead letter queue.
     * If not passed no dead letter queue is enabled.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * @param filterPolicy The filter policy.
     */
    override fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
      cdkBuilder.filterPolicy(filterPolicy.mapValues{SubscriptionFilter.unwrap(it.value)})
    }

    /**
     * @param filterPolicyWithMessageBody The filter policy that is applied on the message body.
     * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
     * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
     */
    override
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
      cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody.mapValues{FilterOrPolicy.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps,
  ) : CdkObject(cdkObject), SmsSubscriptionProps {
    /**
     * Queue to be used as dead letter queue.
     *
     * If not passed no dead letter queue is enabled.
     *
     * Default: - No dead letter queue enabled.
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * The filter policy.
     *
     * Default: - all messages are delivered
     */
    override fun filterPolicy(): Map<String, SubscriptionFilter> =
        unwrap(this).getFilterPolicy()?.mapValues{SubscriptionFilter.wrap(it.value)} ?: emptyMap()

    /**
     * The filter policy that is applied on the message body.
     *
     * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
     * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
     *
     * Default: - all messages are delivered
     */
    override fun filterPolicyWithMessageBody(): Map<String, FilterOrPolicy> =
        unwrap(this).getFilterPolicyWithMessageBody()?.mapValues{FilterOrPolicy.wrap(it.value)} ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SmsSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps):
        SmsSubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as? SmsSubscriptionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SmsSubscriptionProps):
        software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps
  }
}
