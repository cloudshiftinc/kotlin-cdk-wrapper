@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetInput
import kotlin.String
import kotlin.Unit

/**
 * An entry to be sent to EventBridge.
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
 *
 * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEventsRequestEntry.html)
 */
public interface EventBridgePutEventsEntry {
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
   */
  public fun detail(): ScheduleTargetInput

  /**
   * Used along with the source field to help identify the fields and values expected in the detail
   * field.
   *
   * For example, events by CloudTrail have detail type "AWS API Call via CloudTrail"
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-events.html)
   */
  public fun detailType(): String

  /**
   * The event bus the entry will be sent to.
   */
  public fun eventBus(): IEventBus

  /**
   * The service or application that caused this event to be generated.
   *
   * Example value: `com.example.service`
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-events.html)
   */
  public fun source(): String

  /**
   * A builder for [EventBridgePutEventsEntry]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param detail The event body. 
     * Can either be provided as an object or as a JSON-serialized string
     */
    public fun detail(detail: ScheduleTargetInput)

    /**
     * @param detailType Used along with the source field to help identify the fields and values
     * expected in the detail field. 
     * For example, events by CloudTrail have detail type "AWS API Call via CloudTrail"
     */
    public fun detailType(detailType: String)

    /**
     * @param eventBus The event bus the entry will be sent to. 
     */
    public fun eventBus(eventBus: IEventBus)

    /**
     * @param source The service or application that caused this event to be generated. 
     * Example value: `com.example.service`
     */
    public fun source(source: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.targets.EventBridgePutEventsEntry.Builder =
        software.amazon.awscdk.services.scheduler.targets.EventBridgePutEventsEntry.builder()

    /**
     * @param detail The event body. 
     * Can either be provided as an object or as a JSON-serialized string
     */
    override fun detail(detail: ScheduleTargetInput) {
      cdkBuilder.detail(detail.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * @param detailType Used along with the source field to help identify the fields and values
     * expected in the detail field. 
     * For example, events by CloudTrail have detail type "AWS API Call via CloudTrail"
     */
    override fun detailType(detailType: String) {
      cdkBuilder.detailType(detailType)
    }

    /**
     * @param eventBus The event bus the entry will be sent to. 
     */
    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus.Companion::unwrap))
    }

    /**
     * @param source The service or application that caused this event to be generated. 
     * Example value: `com.example.service`
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build(): software.amazon.awscdk.services.scheduler.targets.EventBridgePutEventsEntry
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.targets.EventBridgePutEventsEntry,
  ) : CdkObject(cdkObject),
      EventBridgePutEventsEntry {
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
     */
    override fun detail(): ScheduleTargetInput =
        unwrap(this).getDetail().let(ScheduleTargetInput::wrap)

    /**
     * Used along with the source field to help identify the fields and values expected in the
     * detail field.
     *
     * For example, events by CloudTrail have detail type "AWS API Call via CloudTrail"
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-events.html)
     */
    override fun detailType(): String = unwrap(this).getDetailType()

    /**
     * The event bus the entry will be sent to.
     */
    override fun eventBus(): IEventBus = unwrap(this).getEventBus().let(IEventBus::wrap)

    /**
     * The service or application that caused this event to be generated.
     *
     * Example value: `com.example.service`
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-events.html)
     */
    override fun source(): String = unwrap(this).getSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgePutEventsEntry {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.EventBridgePutEventsEntry):
        EventBridgePutEventsEntry = CdkObjectWrappers.wrap(cdkObject) as? EventBridgePutEventsEntry
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBridgePutEventsEntry):
        software.amazon.awscdk.services.scheduler.targets.EventBridgePutEventsEntry = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.scheduler.targets.EventBridgePutEventsEntry
  }
}
