@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions
import software.amazon.awscdk.services.appmesh.TcpTimeout
import software.amazon.awscdk.services.appmesh.WeightedTarget

@CdkDslMarker
public class TcpRouteSpecOptionsDsl {
  private val cdkBuilder: TcpRouteSpecOptions.Builder = TcpRouteSpecOptions.builder()

  private val _weightedTargets: MutableList<WeightedTarget> = mutableListOf()

  /**
   * @param priority The priority for the route.
   * When a Virtual Router has multiple routes, route match is performed in the
   * order of specified value, where 0 is the highest priority, and first matched route is selected.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param timeout An object that represents a tcp timeout.
   */
  public fun timeout(timeout: TcpTimeoutDsl.() -> Unit = {}) {
    val builder = TcpTimeoutDsl()
    builder.apply(timeout)
    cdkBuilder.timeout(builder.build())
  }

  /**
   * @param timeout An object that represents a tcp timeout.
   */
  public fun timeout(timeout: TcpTimeout) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param weightedTargets List of targets that traffic is routed to when a request matches the
   * route. 
   */
  public fun weightedTargets(weightedTargets: WeightedTargetDsl.() -> Unit) {
    _weightedTargets.add(WeightedTargetDsl().apply(weightedTargets).build())
  }

  /**
   * @param weightedTargets List of targets that traffic is routed to when a request matches the
   * route. 
   */
  public fun weightedTargets(weightedTargets: Collection<WeightedTarget>) {
    _weightedTargets.addAll(weightedTargets)
  }

  public fun build(): TcpRouteSpecOptions {
    if(_weightedTargets.isNotEmpty()) cdkBuilder.weightedTargets(_weightedTargets)
    return cdkBuilder.build()
  }
}
