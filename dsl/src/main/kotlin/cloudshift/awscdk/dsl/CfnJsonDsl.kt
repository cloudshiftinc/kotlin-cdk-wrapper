@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnJson
import software.constructs.Construct

@CdkDslMarker
public class CfnJsonDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnJson.Builder = CfnJson.Builder.create(scope, id)

  public fun `value`(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.`value`(builder.map)
  }

  public fun `value`(`value`: Any) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnJson = cdkBuilder.build()
}
