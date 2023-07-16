@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.oam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.oam.CfnSink
import software.constructs.Construct

@CdkDslMarker
public class CfnSinkDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSink.Builder = CfnSink.Builder.create(scope, id)

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun policy(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.policy(builder.map)
  }

  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnSink = cdkBuilder.build()
}
