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

@CdkDslMarker
public class S3EventSourceDsl(
  bucket: Bucket,
) {
  private val cdkBuilder: S3EventSource.Builder = S3EventSource.Builder.create(bucket)

  private val _events: MutableList<EventType> = mutableListOf()

  private val _filters: MutableList<NotificationKeyFilter> = mutableListOf()

  public fun events(vararg events: EventType) {
    _events.addAll(listOf(*events))
  }

  public fun events(events: Collection<EventType>) {
    _events.addAll(events)
  }

  public fun filters(filters: NotificationKeyFilterDsl.() -> Unit) {
    _filters.add(NotificationKeyFilterDsl().apply(filters).build())
  }

  public fun filters(filters: Collection<NotificationKeyFilter>) {
    _filters.addAll(filters)
  }

  public fun build(): S3EventSource {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
