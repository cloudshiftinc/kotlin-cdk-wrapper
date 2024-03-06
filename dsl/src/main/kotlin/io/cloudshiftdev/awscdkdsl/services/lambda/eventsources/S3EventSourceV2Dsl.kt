@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.lambda.eventsources

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.s3.NotificationKeyFilterDsl
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2
import software.amazon.awscdk.services.s3.EventType
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.NotificationKeyFilter

/**
 * S3EventSourceV2 Use S3 bucket notifications as an event source for AWS Lambda.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2;
 * Function fn;
 * IBucket bucket = Bucket.fromBucketName(this, "Bucket", "bucket-name");
 * fn.addEventSource(S3EventSourceV2.Builder.create(bucket)
 * .events(List.of(EventType.OBJECT_CREATED, EventType.OBJECT_REMOVED))
 * .filters(List.of(NotificationKeyFilter.builder().prefix("subdir/").build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class S3EventSourceV2Dsl(
    bucket: IBucket,
) {
    private val cdkBuilder: S3EventSourceV2.Builder = S3EventSourceV2.Builder.create(bucket)

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
     * Each filter must include a `prefix` and/or `suffix` that will be matched against the s3
     * object key. Refer to the S3 Developer Guide for details about allowed filter rules.
     *
     * @param filters S3 object key filter rules to determine which objects trigger this event.
     */
    public fun filters(filters: NotificationKeyFilterDsl.() -> Unit) {
        _filters.add(NotificationKeyFilterDsl().apply(filters).build())
    }

    /**
     * S3 object key filter rules to determine which objects trigger this event.
     *
     * Each filter must include a `prefix` and/or `suffix` that will be matched against the s3
     * object key. Refer to the S3 Developer Guide for details about allowed filter rules.
     *
     * @param filters S3 object key filter rules to determine which objects trigger this event.
     */
    public fun filters(filters: Collection<NotificationKeyFilter>) {
        _filters.addAll(filters)
    }

    public fun build(): S3EventSourceV2 {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
