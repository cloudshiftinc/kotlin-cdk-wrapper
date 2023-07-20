@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CfnResourceProps

@CdkDslMarker
public class CfnResourcePropsDsl {
  private val cdkBuilder: CfnResourceProps.Builder = CfnResourceProps.builder()

  public fun properties(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.properties(builder.map)
  }

  public fun properties(properties: Map<String, Any>) {
    cdkBuilder.properties(properties)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnResourceProps = cdkBuilder.build()
}
