@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.EventType
import io.cloudshiftdev.awscdk.services.s3.NotificationKeyFilter
import kotlin.Unit
import kotlin.collections.List

public interface S3EventSourceProps {
  public fun events(): List<EventType>

  public fun filters(): List<NotificationKeyFilter> =
      unwrap(this).getFilters()?.map(NotificationKeyFilter::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun events(events: List<EventType>)

    public fun events(vararg events: EventType)

    public fun filters(filters: List<NotificationKeyFilter>)

    public fun filters(vararg filters: NotificationKeyFilter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps.builder()

    override fun events(events: List<EventType>) {
      cdkBuilder.events(events.map(EventType::unwrap))
    }

    override fun events(vararg events: EventType): Unit = events(events.toList())

    override fun filters(filters: List<NotificationKeyFilter>) {
      cdkBuilder.filters(filters.map(NotificationKeyFilter::unwrap))
    }

    override fun filters(vararg filters: NotificationKeyFilter): Unit = filters(filters.toList())

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps,
  ) : CdkObject(cdkObject), S3EventSourceProps {
    override fun events(): List<EventType> = unwrap(this).getEvents().map(EventType::wrap)

    override fun filters(): List<NotificationKeyFilter> =
        unwrap(this).getFilters()?.map(NotificationKeyFilter::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3EventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps):
        S3EventSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3EventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps
  }
}
