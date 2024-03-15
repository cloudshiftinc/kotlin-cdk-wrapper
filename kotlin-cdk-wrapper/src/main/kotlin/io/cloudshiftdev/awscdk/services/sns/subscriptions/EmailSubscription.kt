@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns.subscriptions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.FilterOrPolicy
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sns.ITopicSubscription
import io.cloudshiftdev.awscdk.services.sns.SubscriptionFilter
import io.cloudshiftdev.awscdk.services.sns.TopicSubscriptionConfig
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public open class EmailSubscription internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.sns.subscriptions.EmailSubscription,
) : CdkObject(cdkObject), ITopicSubscription {
  public override fun bind(_topic: ITopic): TopicSubscriptionConfig =
      unwrap(this).bind(_topic.let(ITopic::unwrap)).let(TopicSubscriptionConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>)

    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>)

    public fun json(json: Boolean)
  }

  private class BuilderImpl(
    emailAddress: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sns.subscriptions.EmailSubscription.Builder =
        software.amazon.awscdk.services.sns.subscriptions.EmailSubscription.Builder.create(emailAddress)

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
      cdkBuilder.filterPolicy(filterPolicy.mapValues{SubscriptionFilter.unwrap(it.value)})
    }

    override
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
      cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody.mapValues{FilterOrPolicy.unwrap(it.value)})
    }

    override fun json(json: Boolean) {
      cdkBuilder.json(json)
    }

    public fun build(): software.amazon.awscdk.services.sns.subscriptions.EmailSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(emailAddress: String, block: Builder.() -> Unit = {}):
        EmailSubscription {
      val builderImpl = BuilderImpl(emailAddress)
      return EmailSubscription(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sns.subscriptions.EmailSubscription):
        EmailSubscription = EmailSubscription(cdkObject)

    internal fun unwrap(wrapped: EmailSubscription):
        software.amazon.awscdk.services.sns.subscriptions.EmailSubscription = wrapped.cdkObject
  }
}
