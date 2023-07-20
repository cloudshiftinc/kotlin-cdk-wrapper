@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.BaseArchiveProps
import software.amazon.awscdk.services.events.EventPattern

@CdkDslMarker
public class BaseArchivePropsDsl {
  private val cdkBuilder: BaseArchiveProps.Builder = BaseArchiveProps.builder()

  public fun archiveName(archiveName: String) {
    cdkBuilder.archiveName(archiveName)
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

  public fun retention(retention: Duration) {
    cdkBuilder.retention(retention)
  }

  public fun build(): BaseArchiveProps = cdkBuilder.build()
}
