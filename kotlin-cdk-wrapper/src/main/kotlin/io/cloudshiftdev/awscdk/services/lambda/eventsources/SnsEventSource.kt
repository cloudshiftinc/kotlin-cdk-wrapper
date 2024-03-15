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

public open class SnsEventSource internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.eventsources.SnsEventSource,
) : CdkObject(cdkObject), IEventSource {
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction::unwrap))
  }

  public open fun topic(): CloudshiftdevAwscdkServicesSnsITopic =
      unwrap(this).getTopic().let(CloudshiftdevAwscdkServicesSnsITopic::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>)

    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>)
  }

  private class BuilderImpl(
    topic: AmazonAwscdkServicesSnsITopic,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.SnsEventSource.Builder =
        software.amazon.awscdk.services.lambda.eventsources.SnsEventSource.Builder.create(topic)

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
        software.amazon.awscdk.services.lambda.eventsources.SnsEventSource = wrapped.cdkObject
  }
}
