@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteWeightedTargetPropertyDsl {
  private val cdkBuilder: CfnRoute.WeightedTargetProperty.Builder =
      CfnRoute.WeightedTargetProperty.builder()

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun virtualNode(virtualNode: String) {
    cdkBuilder.virtualNode(virtualNode)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnRoute.WeightedTargetProperty = cdkBuilder.build()
}
