@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface TopicSubscriptionConfig : SubscriptionOptions {
  public fun subscriberId(): String

  public fun subscriberScope(): Construct? = unwrap(this).getSubscriberScope()?.let(Construct::wrap)

  public fun subscriptionDependency(): IDependable? =
      unwrap(this).getSubscriptionDependency()?.let(IDependable::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun endpoint(endpoint: String)

    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>)

    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>)

    public fun protocol(protocol: SubscriptionProtocol)

    public fun rawMessageDelivery(rawMessageDelivery: Boolean)

    public fun region(region: String)

    public fun subscriberId(subscriberId: String)

    public fun subscriberScope(subscriberScope: Construct)

    public fun subscriptionDependency(subscriptionDependency: IDependable)

    public fun subscriptionRoleArn(subscriptionRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.TopicSubscriptionConfig.Builder =
        software.amazon.awscdk.services.sns.TopicSubscriptionConfig.builder()

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    override fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
      cdkBuilder.filterPolicy(filterPolicy.mapValues{SubscriptionFilter.unwrap(it.value)})
    }

    override
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
      cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody.mapValues{FilterOrPolicy.unwrap(it.value)})
    }

    override fun protocol(protocol: SubscriptionProtocol) {
      cdkBuilder.protocol(protocol.let(SubscriptionProtocol::unwrap))
    }

    override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun subscriberId(subscriberId: String) {
      cdkBuilder.subscriberId(subscriberId)
    }

    override fun subscriberScope(subscriberScope: Construct) {
      cdkBuilder.subscriberScope(subscriberScope.let(Construct::unwrap))
    }

    override fun subscriptionDependency(subscriptionDependency: IDependable) {
      cdkBuilder.subscriptionDependency(subscriptionDependency.let(IDependable::unwrap))
    }

    override fun subscriptionRoleArn(subscriptionRoleArn: String) {
      cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.TopicSubscriptionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.TopicSubscriptionConfig,
  ) : CdkObject(cdkObject), TopicSubscriptionConfig {
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    override fun endpoint(): String = unwrap(this).getEndpoint()

    override fun filterPolicy(): Map<String, SubscriptionFilter> =
        unwrap(this).getFilterPolicy()?.mapValues{SubscriptionFilter.wrap(it.value)} ?: emptyMap()

    override fun filterPolicyWithMessageBody(): Map<String, FilterOrPolicy> =
        unwrap(this).getFilterPolicyWithMessageBody()?.mapValues{FilterOrPolicy.wrap(it.value)} ?:
        emptyMap()

    override fun protocol(): SubscriptionProtocol =
        unwrap(this).getProtocol().let(SubscriptionProtocol::wrap)

    override fun rawMessageDelivery(): Boolean? = unwrap(this).getRawMessageDelivery()

    override fun region(): String? = unwrap(this).getRegion()

    override fun subscriberId(): String = unwrap(this).getSubscriberId()

    override fun subscriberScope(): Construct? =
        unwrap(this).getSubscriberScope()?.let(Construct::wrap)

    override fun subscriptionDependency(): IDependable? =
        unwrap(this).getSubscriptionDependency()?.let(IDependable::wrap)

    override fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TopicSubscriptionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicSubscriptionConfig):
        TopicSubscriptionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TopicSubscriptionConfig):
        software.amazon.awscdk.services.sns.TopicSubscriptionConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sns.TopicSubscriptionConfig
  }
}
