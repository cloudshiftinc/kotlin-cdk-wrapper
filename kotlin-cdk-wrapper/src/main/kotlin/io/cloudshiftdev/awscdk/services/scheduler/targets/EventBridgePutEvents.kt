@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.scheduler.IScheduleTarget
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetInput
import kotlin.String
import kotlin.Unit

/**
 * Send an event to an AWS EventBridge by AWS EventBridge Scheduler.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.events.*;
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
 * .target(new EventBridgePutEvents(eventEntry))
 * .build();
 * ```
 */
public open class EventBridgePutEvents(
  cdkObject: software.amazon.awscdk.services.scheduler.targets.EventBridgePutEvents,
) : ScheduleTargetBase(cdkObject),
    IScheduleTarget {
  public constructor(entry: EventBridgePutEventsEntry) :
      this(software.amazon.awscdk.services.scheduler.targets.EventBridgePutEvents(entry.let(EventBridgePutEventsEntry.Companion::unwrap))
  )

  public constructor(entry: EventBridgePutEventsEntry.Builder.() -> Unit) :
      this(EventBridgePutEventsEntry(entry)
  )

  public constructor(entry: EventBridgePutEventsEntry, props: ScheduleTargetBaseProps) :
      this(software.amazon.awscdk.services.scheduler.targets.EventBridgePutEvents(entry.let(EventBridgePutEventsEntry.Companion::unwrap),
      props.let(ScheduleTargetBaseProps.Companion::unwrap))
  )

  public constructor(entry: EventBridgePutEventsEntry,
      props: ScheduleTargetBaseProps.Builder.() -> Unit) : this(entry,
      ScheduleTargetBaseProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.scheduler.targets.EventBridgePutEvents].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The event body.
     *
     * Can either be provided as an object or as a JSON-serialized string
     *
     * Example:
     *
     * ```
     * ScheduleTargetInput.fromText("{\"instance-id\": \"i-1234567890abcdef0\", \"state\":
     * \"terminated\"}");
     * ScheduleTargetInput.fromObject(Map.of("Message", "Hello from a friendly event :)"));
     * ```
     *
     * @param detail The event body. 
     */
    public fun detail(detail: ScheduleTargetInput)

    /**
     * Used along with the source field to help identify the fields and values expected in the
     * detail field.
     *
     * For example, events by CloudTrail have detail type "AWS API Call via CloudTrail"
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-events.html)
     * @param detailType Used along with the source field to help identify the fields and values
     * expected in the detail field. 
     */
    public fun detailType(detailType: String)

    /**
     * The event bus the entry will be sent to.
     *
     * @param eventBus The event bus the entry will be sent to. 
     */
    public fun eventBus(eventBus: IEventBus)

    /**
     * The service or application that caused this event to be generated.
     *
     * Example value: `com.example.service`
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-events.html)
     * @param source The service or application that caused this event to be generated. 
     */
    public fun source(source: String)
  }

  private class BuilderImpl(
    props: software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBaseProps,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.targets.EventBridgePutEvents.Builder =
        software.amazon.awscdk.services.scheduler.targets.EventBridgePutEvents.Builder.create(props)

    /**
     * The event body.
     *
     * Can either be provided as an object or as a JSON-serialized string
     *
     * Example:
     *
     * ```
     * ScheduleTargetInput.fromText("{\"instance-id\": \"i-1234567890abcdef0\", \"state\":
     * \"terminated\"}");
     * ScheduleTargetInput.fromObject(Map.of("Message", "Hello from a friendly event :)"));
     * ```
     *
     * @param detail The event body. 
     */
    override fun detail(detail: ScheduleTargetInput) {
      cdkBuilder.detail(detail.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * Used along with the source field to help identify the fields and values expected in the
     * detail field.
     *
     * For example, events by CloudTrail have detail type "AWS API Call via CloudTrail"
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-events.html)
     * @param detailType Used along with the source field to help identify the fields and values
     * expected in the detail field. 
     */
    override fun detailType(detailType: String) {
      cdkBuilder.detailType(detailType)
    }

    /**
     * The event bus the entry will be sent to.
     *
     * @param eventBus The event bus the entry will be sent to. 
     */
    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus.Companion::unwrap))
    }

    /**
     * The service or application that caused this event to be generated.
     *
     * Example value: `com.example.service`
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-events.html)
     * @param source The service or application that caused this event to be generated. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.scheduler.targets.EventBridgePutEvents =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(props: ScheduleTargetBaseProps, block: Builder.() -> Unit = {}):
        EventBridgePutEvents {
      val builderImpl = BuilderImpl(ScheduleTargetBaseProps.unwrap(props))
      return EventBridgePutEvents(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.EventBridgePutEvents):
        EventBridgePutEvents = EventBridgePutEvents(cdkObject)

    internal fun unwrap(wrapped: EventBridgePutEvents):
        software.amazon.awscdk.services.scheduler.targets.EventBridgePutEvents = wrapped.cdkObject
        as software.amazon.awscdk.services.scheduler.targets.EventBridgePutEvents
  }
}
