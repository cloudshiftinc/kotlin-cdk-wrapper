@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.EventCommonOptions
import software.amazon.awscdk.services.events.EventPattern
import software.constructs.Construct

@CdkDslMarker
public class EventCommonOptionsDsl {
  private val cdkBuilder: EventCommonOptions.Builder = EventCommonOptions.builder()

  public fun crossStackScope(crossStackScope: Construct) {
    cdkBuilder.crossStackScope(crossStackScope)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun eventPattern(block: EventPatternDsl.() -> Unit = {}) {
    val builder = EventPatternDsl()
    builder.apply(block)
    cdkBuilder.eventPattern(builder.build())
  }

  public fun eventPattern(eventPattern: EventPattern) {
    cdkBuilder.eventPattern(eventPattern)
  }

  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun build(): EventCommonOptions = cdkBuilder.build()
}
