@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.EventBusProps

@CdkDslMarker
public class EventBusPropsDsl {
  private val cdkBuilder: EventBusProps.Builder = EventBusProps.builder()

  public fun eventBusName(eventBusName: String) {
    cdkBuilder.eventBusName(eventBusName)
  }

  public fun eventSourceName(eventSourceName: String) {
    cdkBuilder.eventSourceName(eventSourceName)
  }

  public fun build(): EventBusProps = cdkBuilder.build()
}
