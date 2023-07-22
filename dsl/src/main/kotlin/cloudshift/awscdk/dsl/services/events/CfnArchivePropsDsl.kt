@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnArchiveProps

@CdkDslMarker
public class CfnArchivePropsDsl {
  private val cdkBuilder: CfnArchiveProps.Builder = CfnArchiveProps.builder()

  /**
   * @param archiveName The name for the archive to create.
   */
  public fun archiveName(archiveName: String) {
    cdkBuilder.archiveName(archiveName)
  }

  /**
   * @param description A description for the archive.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param eventPattern An event pattern to use to filter events sent to the archive.
   */
  public fun eventPattern(eventPattern: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(eventPattern)
    cdkBuilder.eventPattern(builder.map)
  }

  /**
   * @param eventPattern An event pattern to use to filter events sent to the archive.
   */
  public fun eventPattern(eventPattern: Any) {
    cdkBuilder.eventPattern(eventPattern)
  }

  /**
   * @param retentionDays The number of days to retain events for.
   * Default value is 0. If set to 0, events are retained indefinitely
   */
  public fun retentionDays(retentionDays: Number) {
    cdkBuilder.retentionDays(retentionDays)
  }

  /**
   * @param sourceArn The ARN of the event bus that sends events to the archive. 
   */
  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun build(): CfnArchiveProps = cdkBuilder.build()
}
