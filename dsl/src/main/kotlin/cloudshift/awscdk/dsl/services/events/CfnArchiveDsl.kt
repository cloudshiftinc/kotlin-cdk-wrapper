@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnArchive
import software.constructs.Construct

@CdkDslMarker
public class CfnArchiveDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnArchive.Builder = CfnArchive.Builder.create(scope, id)

  public fun archiveName(archiveName: String) {
    cdkBuilder.archiveName(archiveName)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun eventPattern(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.eventPattern(builder.map)
  }

  public fun eventPattern(eventPattern: Any) {
    cdkBuilder.eventPattern(eventPattern)
  }

  public fun retentionDays(retentionDays: Number) {
    cdkBuilder.retentionDays(retentionDays)
  }

  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun build(): CfnArchive = cdkBuilder.build()
}
