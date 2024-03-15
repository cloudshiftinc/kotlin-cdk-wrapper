@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.s3.EventType
import io.cloudshiftdev.awscdk.services.s3.NotificationKeyFilter
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.awscdk.services.s3.Bucket as CloudshiftdevAwscdkServicesS3Bucket
import software.amazon.awscdk.services.s3.Bucket as AmazonAwscdkServicesS3Bucket

public open class S3EventSource internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.eventsources.S3EventSource,
) : CdkObject(cdkObject), IEventSource {
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction::unwrap))
  }

  public open fun bucket(): CloudshiftdevAwscdkServicesS3Bucket =
      unwrap(this).getBucket().let(CloudshiftdevAwscdkServicesS3Bucket::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun events(events: List<EventType>)

    public fun events(vararg events: EventType)

    public fun filters(filters: List<NotificationKeyFilter>)

    public fun filters(vararg filters: NotificationKeyFilter)
  }

  private class BuilderImpl(
    bucket: AmazonAwscdkServicesS3Bucket,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.S3EventSource.Builder =
        software.amazon.awscdk.services.lambda.eventsources.S3EventSource.Builder.create(bucket)

    override fun events(events: List<EventType>) {
      cdkBuilder.events(events.map(EventType::unwrap))
    }

    override fun events(vararg events: EventType): Unit = events(events.toList())

    override fun filters(filters: List<NotificationKeyFilter>) {
      cdkBuilder.filters(filters.map(NotificationKeyFilter::unwrap))
    }

    override fun filters(vararg filters: NotificationKeyFilter): Unit = filters(filters.toList())

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.S3EventSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(bucket: CloudshiftdevAwscdkServicesS3Bucket,
        block: Builder.() -> Unit = {}): S3EventSource {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesS3Bucket.unwrap(bucket))
      return S3EventSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.S3EventSource):
        S3EventSource = S3EventSource(cdkObject)

    internal fun unwrap(wrapped: S3EventSource):
        software.amazon.awscdk.services.lambda.eventsources.S3EventSource = wrapped.cdkObject
  }
}
