@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

@CdkDslMarker
public class CfnEntityStatusPropertyDsl {
  private val cdkBuilder: CfnEntity.StatusProperty.Builder = CfnEntity.StatusProperty.builder()

  public fun error(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.error(builder.map)
  }

  public fun error(error: Any) {
    cdkBuilder.error(error)
  }

  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun build(): CfnEntity.StatusProperty = cdkBuilder.build()
}
