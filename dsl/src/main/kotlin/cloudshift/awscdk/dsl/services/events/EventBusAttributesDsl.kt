@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.EventBusAttributes

@CdkDslMarker
public class EventBusAttributesDsl {
  private val cdkBuilder: EventBusAttributes.Builder = EventBusAttributes.builder()

  public fun eventBusArn(eventBusArn: String) {
    cdkBuilder.eventBusArn(eventBusArn)
  }

  public fun eventBusName(eventBusName: String) {
    cdkBuilder.eventBusName(eventBusName)
  }

  public fun eventBusPolicy(eventBusPolicy: String) {
    cdkBuilder.eventBusPolicy(eventBusPolicy)
  }

  public fun eventSourceName(eventSourceName: String) {
    cdkBuilder.eventSourceName(eventSourceName)
  }

  public fun build(): EventBusAttributes = cdkBuilder.build()
}
