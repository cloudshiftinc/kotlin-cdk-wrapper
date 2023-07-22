@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteHttpRouteActionPropertyDsl {
  private val cdkBuilder: CfnRoute.HttpRouteActionProperty.Builder =
      CfnRoute.HttpRouteActionProperty.builder()

  private val _weightedTargets: MutableList<Any> = mutableListOf()

  /**
   * @param weightedTargets An object that represents the targets that traffic is routed to when a
   * request matches the route. 
   */
  public fun weightedTargets(vararg weightedTargets: Any) {
    _weightedTargets.addAll(listOf(*weightedTargets))
  }

  /**
   * @param weightedTargets An object that represents the targets that traffic is routed to when a
   * request matches the route. 
   */
  public fun weightedTargets(weightedTargets: Collection<Any>) {
    _weightedTargets.addAll(weightedTargets)
  }

  /**
   * @param weightedTargets An object that represents the targets that traffic is routed to when a
   * request matches the route. 
   */
  public fun weightedTargets(weightedTargets: IResolvable) {
    cdkBuilder.weightedTargets(weightedTargets)
  }

  public fun build(): CfnRoute.HttpRouteActionProperty {
    if(_weightedTargets.isNotEmpty()) cdkBuilder.weightedTargets(_weightedTargets)
    return cdkBuilder.build()
  }
}
