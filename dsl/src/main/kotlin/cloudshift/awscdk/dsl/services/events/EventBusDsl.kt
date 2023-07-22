@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.EventBus
import software.constructs.Construct

@CdkDslMarker
public class EventBusDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EventBus.Builder = EventBus.Builder.create(scope, id)

  /**
   * The name of the event bus you are creating Note: If 'eventSourceName' is passed in, you cannot
   * set this.
   *
   * Default: - automatically generated name
   *
   * @param eventBusName The name of the event bus you are creating Note: If 'eventSourceName' is
   * passed in, you cannot set this. 
   */
  public fun eventBusName(eventBusName: String) {
    cdkBuilder.eventBusName(eventBusName)
  }

  /**
   * The partner event source to associate with this event bus resource Note: If 'eventBusName' is
   * passed in, you cannot set this.
   *
   * Default: - no partner event source
   *
   * @param eventSourceName The partner event source to associate with this event bus resource Note:
   * If 'eventBusName' is passed in, you cannot set this. 
   */
  public fun eventSourceName(eventSourceName: String) {
    cdkBuilder.eventSourceName(eventSourceName)
  }

  public fun build(): EventBus = cdkBuilder.build()
}
