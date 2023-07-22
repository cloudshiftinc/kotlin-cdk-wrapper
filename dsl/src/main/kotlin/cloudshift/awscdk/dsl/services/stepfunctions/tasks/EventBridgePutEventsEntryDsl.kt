@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry

/**
 * An entry to be sent to EventBridge.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.stepfunctions.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
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
@CdkDslMarker
public class EventBridgePutEventsEntryDsl {
  private val cdkBuilder: EventBridgePutEventsEntry.Builder = EventBridgePutEventsEntry.builder()

  /**
   * @param detail The event body. 
   * Can either be provided as an object or as a JSON-serialized string
   */
  public fun detail(detail: TaskInput) {
    cdkBuilder.detail(detail)
  }

  /**
   * @param detailType Used along with the source field to help identify the fields and values
   * expected in the detail field. 
   * For example, events by CloudTrail have detail type "AWS API Call via CloudTrail"
   */
  public fun detailType(detailType: String) {
    cdkBuilder.detailType(detailType)
  }

  /**
   * @param eventBus The event bus the entry will be sent to.
   */
  public fun eventBus(eventBus: IEventBus) {
    cdkBuilder.eventBus(eventBus)
  }

  /**
   * @param source The service or application that caused this event to be generated. 
   * Example value: `com.example.service`
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun build(): EventBridgePutEventsEntry = cdkBuilder.build()
}
