package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface SubscriptionOptions {
  public fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  public fun endpoint(): String

  public fun filterPolicy(): Map<String, SubscriptionFilter> =
      unwrap(this).getFilterPolicy()?.mapValues { SubscriptionFilter.wrap(it.value)} ?: emptyMap()

  public fun filterPolicyWithMessageBody(): Map<String, FilterOrPolicy> =
      unwrap(this).getFilterPolicyWithMessageBody()?.mapValues { FilterOrPolicy.wrap(it.value)} ?:
      emptyMap()

  public fun protocol(): SubscriptionProtocol

  public fun rawMessageDelivery(): Boolean? = unwrap(this).getRawMessageDelivery()

  public fun region(): String? = unwrap(this).getRegion()

  public fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()

  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
    }

    public fun endpoint(endpoint: String) {
    }

    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
    }

    public
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
    }

    public fun protocol(protocol: SubscriptionProtocol) {
    }

    public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
    }

    public fun region(region: String) {
    }

    public fun subscriptionRoleArn(subscriptionRoleArn: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.SubscriptionOptions.Builder =
        software.amazon.awscdk.services.sns.SubscriptionOptions.builder()

    public override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    public override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    public override fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
      cdkBuilder.filterPolicy(filterPolicy.mapValues { SubscriptionFilter.unwrap(it.value)})
    }

    public override
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
      cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody.mapValues {
          FilterOrPolicy.unwrap(it.value)})
    }

    public override fun protocol(protocol: SubscriptionProtocol) {
      cdkBuilder.protocol(protocol.let(SubscriptionProtocol::unwrap))
    }

    public override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun subscriptionRoleArn(subscriptionRoleArn: String) {
      cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.SubscriptionOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sns.SubscriptionOptions,
  ) : SubscriptionOptions {
    public override fun deadLetterQueue(): IQueue? =
        unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    public override fun endpoint(): String = unwrap(this).getEndpoint()

    public override fun filterPolicy(): Map<String, SubscriptionFilter> =
        unwrap(this).getFilterPolicy()?.mapValues { SubscriptionFilter.wrap(it.value)} ?: emptyMap()

    public override fun filterPolicyWithMessageBody(): Map<String, FilterOrPolicy> =
        unwrap(this).getFilterPolicyWithMessageBody()?.mapValues { FilterOrPolicy.wrap(it.value)} ?:
        emptyMap()

    public override fun protocol(): SubscriptionProtocol =
        unwrap(this).getProtocol().let(SubscriptionProtocol::wrap)

    public override fun rawMessageDelivery(): Boolean? = unwrap(this).getRawMessageDelivery()

    public override fun region(): String? = unwrap(this).getRegion()

    public override fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.SubscriptionOptions):
        SubscriptionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubscriptionOptions):
        software.amazon.awscdk.services.sns.SubscriptionOptions = (wrapped as Wrapper).cdkObject
  }
}
