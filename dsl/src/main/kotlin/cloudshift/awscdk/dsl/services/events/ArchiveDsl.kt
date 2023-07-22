@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.Archive
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IEventBus
import software.constructs.Construct

/**
 * Define an EventBridge Archive.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.events.*;
 * Object detail;
 * EventBus eventBus;
 * Archive archive = Archive.Builder.create(this, "MyArchive")
 * .eventPattern(EventPattern.builder()
 * .account(List.of("account"))
 * .detail(Map.of(
 * "detailKey", detail))
 * .detailType(List.of("detailType"))
 * .id(List.of("id"))
 * .region(List.of("region"))
 * .resources(List.of("resources"))
 * .source(List.of("source"))
 * .time(List.of("time"))
 * .version(List.of("version"))
 * .build())
 * .sourceEventBus(eventBus)
 * // the properties below are optional
 * .archiveName("archiveName")
 * .description("description")
 * .retention(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class ArchiveDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Archive.Builder = Archive.Builder.create(scope, id)

  /**
   * The name of the archive.
   *
   * Default: - Automatically generated
   *
   * @param archiveName The name of the archive. 
   */
  public fun archiveName(archiveName: String) {
    cdkBuilder.archiveName(archiveName)
  }

  /**
   * A description for the archive.
   *
   * Default: - none
   *
   * @param description A description for the archive. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * An event pattern to use to filter events sent to the archive.
   *
   * @param eventPattern An event pattern to use to filter events sent to the archive. 
   */
  public fun eventPattern(eventPattern: EventPatternDsl.() -> Unit = {}) {
    val builder = EventPatternDsl()
    builder.apply(eventPattern)
    cdkBuilder.eventPattern(builder.build())
  }

  /**
   * An event pattern to use to filter events sent to the archive.
   *
   * @param eventPattern An event pattern to use to filter events sent to the archive. 
   */
  public fun eventPattern(eventPattern: EventPattern) {
    cdkBuilder.eventPattern(eventPattern)
  }

  /**
   * The number of days to retain events for.
   *
   * Default value is 0. If set to 0, events are retained indefinitely.
   *
   * Default: - Infinite
   *
   * @param retention The number of days to retain events for. 
   */
  public fun retention(retention: Duration) {
    cdkBuilder.retention(retention)
  }

  /**
   * The event source associated with the archive.
   *
   * @param sourceEventBus The event source associated with the archive. 
   */
  public fun sourceEventBus(sourceEventBus: IEventBus) {
    cdkBuilder.sourceEventBus(sourceEventBus)
  }

  public fun build(): Archive = cdkBuilder.build()
}
