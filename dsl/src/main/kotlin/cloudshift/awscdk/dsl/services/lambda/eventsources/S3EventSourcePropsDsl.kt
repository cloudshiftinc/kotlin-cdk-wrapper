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

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.s3.NotificationKeyFilterDsl
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps
import software.amazon.awscdk.services.s3.EventType
import software.amazon.awscdk.services.s3.NotificationKeyFilter

/**
 * Example:
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
public class S3EventSourcePropsDsl {
    private val cdkBuilder: S3EventSourceProps.Builder = S3EventSourceProps.builder()

    private val _events: MutableList<EventType> = mutableListOf()

    private val _filters: MutableList<NotificationKeyFilter> = mutableListOf()

    /** @param events The s3 event types that will trigger the notification. */
    public fun events(vararg events: EventType) {
        _events.addAll(listOf(*events))
    }

    /** @param events The s3 event types that will trigger the notification. */
    public fun events(events: Collection<EventType>) {
        _events.addAll(events)
    }

    /**
     * @param filters S3 object key filter rules to determine which objects trigger this event. Each
     *   filter must include a `prefix` and/or `suffix` that will be matched against the s3 object
     *   key. Refer to the S3 Developer Guide for details about allowed filter rules.
     */
    public fun filters(filters: NotificationKeyFilterDsl.() -> Unit) {
        _filters.add(NotificationKeyFilterDsl().apply(filters).build())
    }

    /**
     * @param filters S3 object key filter rules to determine which objects trigger this event. Each
     *   filter must include a `prefix` and/or `suffix` that will be matched against the s3 object
     *   key. Refer to the S3 Developer Guide for details about allowed filter rules.
     */
    public fun filters(filters: Collection<NotificationKeyFilter>) {
        _filters.addAll(filters)
    }

    public fun build(): S3EventSourceProps {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
