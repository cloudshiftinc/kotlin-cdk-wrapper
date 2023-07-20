@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionResourcesPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.ResourcesProperty.Builder =
      CfnJobDefinition.ResourcesProperty.builder()

  public fun limits(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.limits(builder.map)
  }

  public fun limits(limits: Any) {
    cdkBuilder.limits(limits)
  }

  public fun requests(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.requests(builder.map)
  }

  public fun requests(requests: Any) {
    cdkBuilder.requests(requests)
  }

  public fun build(): CfnJobDefinition.ResourcesProperty = cdkBuilder.build()
}
