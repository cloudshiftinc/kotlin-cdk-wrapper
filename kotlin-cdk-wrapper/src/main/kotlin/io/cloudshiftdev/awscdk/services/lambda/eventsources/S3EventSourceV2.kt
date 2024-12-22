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
import io.cloudshiftdev.awscdk.services.s3.IBucket as CloudshiftdevAwscdkServicesS3IBucket
import software.amazon.awscdk.services.s3.IBucket as AmazonAwscdkServicesS3IBucket

/**
 * S3EventSourceV2 Use S3 bucket notifications as an event source for AWS Lambda.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.S3EventSourceV2;
 * Function fn;
 * IBucket bucket = Bucket.fromBucketName(this, "Bucket", "amzn-s3-demo-bucket");
 * fn.addEventSource(S3EventSourceV2.Builder.create(bucket)
 * .events(List.of(EventType.OBJECT_CREATED, EventType.OBJECT_REMOVED))
 * .filters(List.of(NotificationKeyFilter.builder().prefix("subdir/").build()))
 * .build());
 * ```
 */
public open class S3EventSourceV2(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2,
) : CdkObject(cdkObject),
    IEventSource {
  public constructor(bucket: CloudshiftdevAwscdkServicesS3IBucket, props: S3EventSourceProps) :
      this(software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2(bucket.let(CloudshiftdevAwscdkServicesS3IBucket.Companion::unwrap),
      props.let(S3EventSourceProps.Companion::unwrap))
  )

  public constructor(bucket: CloudshiftdevAwscdkServicesS3IBucket,
      props: S3EventSourceProps.Builder.() -> Unit) : this(bucket, S3EventSourceProps(props)
  )

  /**
   * Called by `lambda.addEventSource` to allow the event source to bind to this function.
   *
   * @param target 
   */
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.eventsources.S3EventSourceV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The s3 event types that will trigger the notification.
     *
     * @param events The s3 event types that will trigger the notification. 
     */
    public fun events(events: List<EventType>)

    /**
     * The s3 event types that will trigger the notification.
     *
     * @param events The s3 event types that will trigger the notification. 
     */
    public fun events(vararg events: EventType)

    /**
     * S3 object key filter rules to determine which objects trigger this event.
     *
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     *
     * @param filters S3 object key filter rules to determine which objects trigger this event. 
     */
    public fun filters(filters: List<NotificationKeyFilter>)

    /**
     * S3 object key filter rules to determine which objects trigger this event.
     *
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     *
     * @param filters S3 object key filter rules to determine which objects trigger this event. 
     */
    public fun filters(vararg filters: NotificationKeyFilter)
  }

  private class BuilderImpl(
    bucket: AmazonAwscdkServicesS3IBucket,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2.Builder =
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2.Builder.create(bucket)

    /**
     * The s3 event types that will trigger the notification.
     *
     * @param events The s3 event types that will trigger the notification. 
     */
    override fun events(events: List<EventType>) {
      cdkBuilder.events(events.map(EventType.Companion::unwrap))
    }

    /**
     * The s3 event types that will trigger the notification.
     *
     * @param events The s3 event types that will trigger the notification. 
     */
    override fun events(vararg events: EventType): Unit = events(events.toList())

    /**
     * S3 object key filter rules to determine which objects trigger this event.
     *
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     *
     * @param filters S3 object key filter rules to determine which objects trigger this event. 
     */
    override fun filters(filters: List<NotificationKeyFilter>) {
      cdkBuilder.filters(filters.map(NotificationKeyFilter.Companion::unwrap))
    }

    /**
     * S3 object key filter rules to determine which objects trigger this event.
     *
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     *
     * @param filters S3 object key filter rules to determine which objects trigger this event. 
     */
    override fun filters(vararg filters: NotificationKeyFilter): Unit = filters(filters.toList())

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2 =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(bucket: CloudshiftdevAwscdkServicesS3IBucket,
        block: Builder.() -> Unit = {}): S3EventSourceV2 {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesS3IBucket.unwrap(bucket))
      return S3EventSourceV2(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2):
        S3EventSourceV2 = S3EventSourceV2(cdkObject)

    internal fun unwrap(wrapped: S3EventSourceV2):
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2 = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2
  }
}
