@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.HttpRetryEvent
import software.amazon.awscdk.services.appmesh.HttpRetryPolicy
import software.amazon.awscdk.services.appmesh.TcpRetryEvent

/**
 * HTTP retry policy.
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
public class HttpRetryPolicyDsl {
  private val cdkBuilder: HttpRetryPolicy.Builder = HttpRetryPolicy.builder()

  private val _httpRetryEvents: MutableList<HttpRetryEvent> = mutableListOf()

  private val _tcpRetryEvents: MutableList<TcpRetryEvent> = mutableListOf()

  /**
   * @param httpRetryEvents Specify HTTP events on which to retry.
   * You must specify at least one value
   * for at least one types of retry events.
   */
  public fun httpRetryEvents(vararg httpRetryEvents: HttpRetryEvent) {
    _httpRetryEvents.addAll(listOf(*httpRetryEvents))
  }

  /**
   * @param httpRetryEvents Specify HTTP events on which to retry.
   * You must specify at least one value
   * for at least one types of retry events.
   */
  public fun httpRetryEvents(httpRetryEvents: Collection<HttpRetryEvent>) {
    _httpRetryEvents.addAll(httpRetryEvents)
  }

  /**
   * @param retryAttempts The maximum number of retry attempts. 
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  /**
   * @param retryTimeout The timeout for each retry attempt. 
   */
  public fun retryTimeout(retryTimeout: Duration) {
    cdkBuilder.retryTimeout(retryTimeout)
  }

  /**
   * @param tcpRetryEvents TCP events on which to retry.
   * The event occurs before any processing of a
   * request has started and is encountered when the upstream is temporarily or
   * permanently unavailable. You must specify at least one value for at least
   * one types of retry events.
   */
  public fun tcpRetryEvents(vararg tcpRetryEvents: TcpRetryEvent) {
    _tcpRetryEvents.addAll(listOf(*tcpRetryEvents))
  }

  /**
   * @param tcpRetryEvents TCP events on which to retry.
   * The event occurs before any processing of a
   * request has started and is encountered when the upstream is temporarily or
   * permanently unavailable. You must specify at least one value for at least
   * one types of retry events.
   */
  public fun tcpRetryEvents(tcpRetryEvents: Collection<TcpRetryEvent>) {
    _tcpRetryEvents.addAll(tcpRetryEvents)
  }

  public fun build(): HttpRetryPolicy {
    if(_httpRetryEvents.isNotEmpty()) cdkBuilder.httpRetryEvents(_httpRetryEvents)
    if(_tcpRetryEvents.isNotEmpty()) cdkBuilder.tcpRetryEvents(_tcpRetryEvents)
    return cdkBuilder.build()
  }
}
