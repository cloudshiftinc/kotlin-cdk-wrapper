@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.HttpRetryPolicy
import software.amazon.awscdk.services.appmesh.HttpRouteMatch
import software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions
import software.amazon.awscdk.services.appmesh.HttpTimeout
import software.amazon.awscdk.services.appmesh.WeightedTarget

/**
 * Properties specific for HTTP Based Routes.
 *
 * Example:
 *
 * ```
 * VirtualRouter router;
 * VirtualNode node;
 * router.addRoute("route-http2-retry", RouteBaseProps.builder()
 * .routeSpec(RouteSpec.http2(HttpRouteSpecOptions.builder()
 * .weightedTargets(List.of(WeightedTarget.builder().virtualNode(node).build()))
 * .retryPolicy(HttpRetryPolicy.builder()
 * // Retry if the connection failed
 * .tcpRetryEvents(List.of(TcpRetryEvent.CONNECTION_ERROR))
 * // Retry if HTTP responds with a gateway error (502, 503, 504)
 * .httpRetryEvents(List.of(HttpRetryEvent.GATEWAY_ERROR))
 * // Retry five times
 * .retryAttempts(5)
 * // Use a 1 second timeout per retry
 * .retryTimeout(Duration.seconds(1))
 * .build())
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class HttpRouteSpecOptionsDsl {
  private val cdkBuilder: HttpRouteSpecOptions.Builder = HttpRouteSpecOptions.builder()

  private val _weightedTargets: MutableList<WeightedTarget> = mutableListOf()

  /**
   * @param match The criterion for determining a request match for this Route.
   */
  public fun match(match: HttpRouteMatchDsl.() -> Unit = {}) {
    val builder = HttpRouteMatchDsl()
    builder.apply(match)
    cdkBuilder.match(builder.build())
  }

  /**
   * @param match The criterion for determining a request match for this Route.
   */
  public fun match(match: HttpRouteMatch) {
    cdkBuilder.match(match)
  }

  /**
   * @param priority The priority for the route.
   * When a Virtual Router has multiple routes, route match is performed in the
   * order of specified value, where 0 is the highest priority, and first matched route is selected.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param retryPolicy The retry policy.
   */
  public fun retryPolicy(retryPolicy: HttpRetryPolicyDsl.() -> Unit = {}) {
    val builder = HttpRetryPolicyDsl()
    builder.apply(retryPolicy)
    cdkBuilder.retryPolicy(builder.build())
  }

  /**
   * @param retryPolicy The retry policy.
   */
  public fun retryPolicy(retryPolicy: HttpRetryPolicy) {
    cdkBuilder.retryPolicy(retryPolicy)
  }

  /**
   * @param timeout An object that represents a http timeout.
   */
  public fun timeout(timeout: HttpTimeoutDsl.() -> Unit = {}) {
    val builder = HttpTimeoutDsl()
    builder.apply(timeout)
    cdkBuilder.timeout(builder.build())
  }

  /**
   * @param timeout An object that represents a http timeout.
   */
  public fun timeout(timeout: HttpTimeout) {
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

  public fun build(): HttpRouteSpecOptions {
    if(_weightedTargets.isNotEmpty()) cdkBuilder.weightedTargets(_weightedTargets)
    return cdkBuilder.build()
  }
}
