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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.EventBusProps

/**
 * Properties to define an event bus.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.events.*;
 * EventBus eventBus = EventBus.Builder.create(this, "EventBus")
 * .eventBusName("DomainEvents")
 * .build();
 * EventBridgePutEventsEntry eventEntry = EventBridgePutEventsEntry.builder()
 * .eventBus(eventBus)
 * .source("PetService")
 * .detail(ScheduleTargetInput.fromObject(Map.of("Name", "Fluffy")))
 * .detailType("🐶")
 * .build();
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.hours(1)))
 * .target(EventBridgePutEvents.Builder.create(eventEntry).build())
 * .build();
 * ```
 */
@CdkDslMarker
public class EventBusPropsDsl {
    private val cdkBuilder: EventBusProps.Builder = EventBusProps.builder()

    /**
     * @param eventBusName The name of the event bus you are creating Note: If 'eventSourceName' is
     *   passed in, you cannot set this.
     */
    public fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
    }

    /**
     * @param eventSourceName The partner event source to associate with this event bus resource
     *   Note: If 'eventBusName' is passed in, you cannot set this.
     */
    public fun eventSourceName(eventSourceName: String) {
        cdkBuilder.eventSourceName(eventSourceName)
    }

    public fun build(): EventBusProps = cdkBuilder.build()
}
