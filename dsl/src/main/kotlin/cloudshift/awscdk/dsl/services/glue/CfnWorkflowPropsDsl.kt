@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnWorkflowProps

@CdkDslMarker
public class CfnWorkflowPropsDsl {
  private val cdkBuilder: CfnWorkflowProps.Builder = CfnWorkflowProps.builder()

  public fun defaultRunProperties(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.defaultRunProperties(builder.map)
  }

  public fun defaultRunProperties(defaultRunProperties: Any) {
    cdkBuilder.defaultRunProperties(defaultRunProperties)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun maxConcurrentRuns(maxConcurrentRuns: Number) {
    cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnWorkflowProps = cdkBuilder.build()
}
