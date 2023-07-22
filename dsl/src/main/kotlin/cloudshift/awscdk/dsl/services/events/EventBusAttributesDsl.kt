@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.EventBusAttributes

/**
 * Interface with properties necessary to import a reusable EventBus.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * EventBusAttributes eventBusAttributes = EventBusAttributes.builder()
 * .eventBusArn("eventBusArn")
 * .eventBusName("eventBusName")
 * .eventBusPolicy("eventBusPolicy")
 * // the properties below are optional
 * .eventSourceName("eventSourceName")
 * .build();
 * ```
 */
@CdkDslMarker
public class EventBusAttributesDsl {
  private val cdkBuilder: EventBusAttributes.Builder = EventBusAttributes.builder()

  /**
   * @param eventBusArn The ARN of this event bus resource. 
   */
  public fun eventBusArn(eventBusArn: String) {
    cdkBuilder.eventBusArn(eventBusArn)
  }

  /**
   * @param eventBusName The physical ID of this event bus resource. 
   */
  public fun eventBusName(eventBusName: String) {
    cdkBuilder.eventBusName(eventBusName)
  }

  /**
   * @param eventBusPolicy The JSON policy of this event bus resource. 
   */
  public fun eventBusPolicy(eventBusPolicy: String) {
    cdkBuilder.eventBusPolicy(eventBusPolicy)
  }

  /**
   * @param eventSourceName The partner event source to associate with this event bus resource.
   */
  public fun eventSourceName(eventSourceName: String) {
    cdkBuilder.eventSourceName(eventSourceName)
  }

  public fun build(): EventBusAttributes = cdkBuilder.build()
}
