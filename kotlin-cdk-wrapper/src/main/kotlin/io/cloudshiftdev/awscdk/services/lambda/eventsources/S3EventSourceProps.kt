@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.EventType
import io.cloudshiftdev.awscdk.services.s3.NotificationKeyFilter
import kotlin.Unit
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.S3EventSource;
 * Function fn;
 * Bucket bucket = new Bucket(this, "mybucket");
 * fn.addEventSource(S3EventSource.Builder.create(bucket)
 * .events(List.of(EventType.OBJECT_CREATED, EventType.OBJECT_REMOVED))
 * .filters(List.of(NotificationKeyFilter.builder().prefix("subdir/").build()))
 * .build());
 * ```
 */
public interface S3EventSourceProps {
  /**
   * The s3 event types that will trigger the notification.
   */
  public fun events(): List<EventType>

  /**
   * S3 object key filter rules to determine which objects trigger this event.
   *
   * Each filter must include a `prefix` and/or `suffix` that will be matched
   * against the s3 object key. Refer to the S3 Developer Guide for details
   * about allowed filter rules.
   */
  public fun filters(): List<NotificationKeyFilter> =
      unwrap(this).getFilters()?.map(NotificationKeyFilter::wrap) ?: emptyList()

  /**
   * A builder for [S3EventSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param events The s3 event types that will trigger the notification. 
     */
    public fun events(events: List<EventType>)

    /**
     * @param events The s3 event types that will trigger the notification. 
     */
    public fun events(vararg events: EventType)

    /**
     * @param filters S3 object key filter rules to determine which objects trigger this event.
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     */
    public fun filters(filters: List<NotificationKeyFilter>)

    /**
     * @param filters S3 object key filter rules to determine which objects trigger this event.
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     */
    public fun filters(vararg filters: NotificationKeyFilter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps.builder()

    /**
     * @param events The s3 event types that will trigger the notification. 
     */
    override fun events(events: List<EventType>) {
      cdkBuilder.events(events.map(EventType::unwrap))
    }

    /**
     * @param events The s3 event types that will trigger the notification. 
     */
    override fun events(vararg events: EventType): Unit = events(events.toList())

    /**
     * @param filters S3 object key filter rules to determine which objects trigger this event.
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     */
    override fun filters(filters: List<NotificationKeyFilter>) {
      cdkBuilder.filters(filters.map(NotificationKeyFilter::unwrap))
    }

    /**
     * @param filters S3 object key filter rules to determine which objects trigger this event.
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     */
    override fun filters(vararg filters: NotificationKeyFilter): Unit = filters(filters.toList())

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps,
  ) : CdkObject(cdkObject), S3EventSourceProps {
    /**
     * The s3 event types that will trigger the notification.
     */
    override fun events(): List<EventType> = unwrap(this).getEvents().map(EventType::wrap)

    /**
     * S3 object key filter rules to determine which objects trigger this event.
     *
     * Each filter must include a `prefix` and/or `suffix` that will be matched
     * against the s3 object key. Refer to the S3 Developer Guide for details
     * about allowed filter rules.
     */
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
        S3EventSourceProps = CdkObjectWrappers.wrap(cdkObject) as? S3EventSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3EventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps
  }
}
