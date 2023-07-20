@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.stepfunctions.TaskInput
import software.amazon.awscdk.services.stepfunctions.tasks.EventBridgePutEventsEntry

@CdkDslMarker
public class EventBridgePutEventsEntryDsl {
  private val cdkBuilder: EventBridgePutEventsEntry.Builder = EventBridgePutEventsEntry.builder()

  public fun detail(detail: TaskInput) {
    cdkBuilder.detail(detail)
  }

  public fun detailType(detailType: String) {
    cdkBuilder.detailType(detailType)
  }

  public fun eventBus(eventBus: IEventBus) {
    cdkBuilder.eventBus(eventBus)
  }

  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun build(): EventBridgePutEventsEntry = cdkBuilder.build()
}
