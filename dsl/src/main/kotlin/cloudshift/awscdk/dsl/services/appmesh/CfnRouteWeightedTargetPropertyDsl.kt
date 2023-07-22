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

  /**
   * @param port The targeted port of the weighted object.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param virtualNode The virtual node to associate with the weighted target. 
   */
  public fun virtualNode(virtualNode: String) {
    cdkBuilder.virtualNode(virtualNode)
  }

  /**
   * @param weight The relative weight of the weighted target. 
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnRoute.WeightedTargetProperty = cdkBuilder.build()
}
