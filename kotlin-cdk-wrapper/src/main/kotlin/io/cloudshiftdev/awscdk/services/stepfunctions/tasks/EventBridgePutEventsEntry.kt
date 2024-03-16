@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskInput
import kotlin.String
import kotlin.Unit

/**
 * An entry to be sent to EventBridge.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * EventBus eventBus;
 * TaskInput taskInput;
 * EventBridgePutEventsEntry eventBridgePutEventsEntry = EventBridgePutEventsEntry.builder()
 * .detail(taskInput)
 * .detailType("detailType")
 * .source("source")
 * // the properties below are optional
 * .eventBus(eventBus)
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
   * TaskInput.fromText("{\"instance-id\": \"i-1234567890abcdef0\", \"state\": \"terminated\"}");
   * TaskInput.fromObject(Map.of("Message", "Hello from Step Functions"));
   * TaskInput.fromJsonPathAt("$.EventDetail");
   * ```
   */
  public fun detail(): TaskInput

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
   *
   * Default: - event is sent to account's default event bus
   */
  public fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

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
    public fun detail(detail: TaskInput)

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
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry.builder()

    /**
     * @param detail The event body. 
     * Can either be provided as an object or as a JSON-serialized string
     */
    override fun detail(detail: TaskInput) {
      cdkBuilder.detail(detail.let(TaskInput::unwrap))
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
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    /**
     * @param source The service or application that caused this event to be generated. 
     * Example value: `com.example.service`
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry,
  ) : CdkObject(cdkObject), EventBridgePutEventsEntry {
    /**
     * The event body.
     *
     * Can either be provided as an object or as a JSON-serialized string
     *
     * Example:
     *
     * ```
     * TaskInput.fromText("{\"instance-id\": \"i-1234567890abcdef0\", \"state\": \"terminated\"}");
     * TaskInput.fromObject(Map.of("Message", "Hello from Step Functions"));
     * TaskInput.fromJsonPathAt("$.EventDetail");
     * ```
     */
    override fun detail(): TaskInput = unwrap(this).getDetail().let(TaskInput::wrap)

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
     *
     * Default: - event is sent to account's default event bus
     */
    override fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

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
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry):
        EventBridgePutEventsEntry = CdkObjectWrappers.wrap(cdkObject) as EventBridgePutEventsEntry

    internal fun unwrap(wrapped: EventBridgePutEventsEntry):
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry
  }
}
