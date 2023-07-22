@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.s3.NotificationKeyFilterDsl
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.eventsources.S3EventSource
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.EventType
import software.amazon.awscdk.services.s3.NotificationKeyFilter

/**
 * Use S3 bucket notifications as an event source for AWS Lambda.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.lambda.eventsources.*;
 * import software.amazon.awscdk.services.s3.*;
 * Function fn;
 * Bucket bucket = new Bucket(this, "Bucket");
 * fn.addEventSource(S3EventSource.Builder.create(bucket)
 * .events(List.of(EventType.OBJECT_CREATED, EventType.OBJECT_REMOVED))
 * .filters(List.of(NotificationKeyFilter.builder().prefix("subdir/").build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class S3EventSourceDsl(
  bucket: Bucket,
) {
  private val cdkBuilder: S3EventSource.Builder = S3EventSource.Builder.create(bucket)

  private val _events: MutableList<EventType> = mutableListOf()

  private val _filters: MutableList<NotificationKeyFilter> = mutableListOf()

  /**
   * The s3 event types that will trigger the notification.
   *
   * @param events The s3 event types that will trigger the notification. 
   */
  public fun events(vararg events: EventType) {
    _events.addAll(listOf(*events))
  }

  /**
   * The s3 event types that will trigger the notification.
   *
   * @param events The s3 event types that will trigger the notification. 
   */
  public fun events(events: Collection<EventType>) {
    _events.addAll(events)
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
  public fun filters(filters: NotificationKeyFilterDsl.() -> Unit) {
    _filters.add(NotificationKeyFilterDsl().apply(filters).build())
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
  public fun filters(filters: Collection<NotificationKeyFilter>) {
    _filters.addAll(filters)
  }

  public fun build(): S3EventSource {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
