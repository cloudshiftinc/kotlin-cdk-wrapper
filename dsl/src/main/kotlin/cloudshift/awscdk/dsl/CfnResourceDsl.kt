@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CfnResource
import software.constructs.Construct

@CdkDslMarker
public class CfnResourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResource.Builder = CfnResource.Builder.create(scope, id)

  public fun properties(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.properties(builder.map)
  }

  public fun properties(properties: Map<String, *>) {
    cdkBuilder.properties(properties)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnResource = cdkBuilder.build()
}
