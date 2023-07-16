@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconvert

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnQueue
import software.constructs.Construct

@CdkDslMarker
public class CfnQueueDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnQueue.Builder = CfnQueue.Builder.create(scope, id)

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun pricingPlan(pricingPlan: String) {
    cdkBuilder.pricingPlan(pricingPlan)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnQueue = cdkBuilder.build()
}
