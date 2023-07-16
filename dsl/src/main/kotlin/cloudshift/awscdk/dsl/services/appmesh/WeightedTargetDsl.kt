@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.IVirtualNode
import software.amazon.awscdk.services.appmesh.WeightedTarget

@CdkDslMarker
public class WeightedTargetDsl {
  private val cdkBuilder: WeightedTarget.Builder = WeightedTarget.builder()

  public fun virtualNode(virtualNode: IVirtualNode) {
    cdkBuilder.virtualNode(virtualNode)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): WeightedTarget = cdkBuilder.build()
}
