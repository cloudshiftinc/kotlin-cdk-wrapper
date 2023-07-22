@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.GrpcRetryEvent
import software.amazon.awscdk.services.appmesh.GrpcRetryPolicy
import software.amazon.awscdk.services.appmesh.HttpRetryEvent
import software.amazon.awscdk.services.appmesh.TcpRetryEvent

/**
 * gRPC retry policy.
 *
 * Example:
 *
 * ```
 * VirtualRouter router;
 * VirtualNode node;
 * router.addRoute("route-grpc-retry", RouteBaseProps.builder()
 * .routeSpec(RouteSpec.grpc(GrpcRouteSpecOptions.builder()
 * .weightedTargets(List.of(WeightedTarget.builder().virtualNode(node).build()))
 * .match(GrpcRouteMatch.builder().serviceName("servicename").build())
 * .retryPolicy(GrpcRetryPolicy.builder()
 * .tcpRetryEvents(List.of(TcpRetryEvent.CONNECTION_ERROR))
 * .httpRetryEvents(List.of(HttpRetryEvent.GATEWAY_ERROR))
 * // Retry if gRPC responds that the request was cancelled, a resource
 * // was exhausted, or if the service is unavailable
 * .grpcRetryEvents(List.of(GrpcRetryEvent.CANCELLED, GrpcRetryEvent.RESOURCE_EXHAUSTED,
 * GrpcRetryEvent.UNAVAILABLE))
 * .retryAttempts(5)
 * .retryTimeout(Duration.seconds(1))
 * .build())
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class GrpcRetryPolicyDsl {
  private val cdkBuilder: GrpcRetryPolicy.Builder = GrpcRetryPolicy.builder()

  private val _grpcRetryEvents: MutableList<GrpcRetryEvent> = mutableListOf()

  private val _httpRetryEvents: MutableList<HttpRetryEvent> = mutableListOf()

  private val _tcpRetryEvents: MutableList<TcpRetryEvent> = mutableListOf()

  /**
   * @param grpcRetryEvents gRPC events on which to retry.
   * You must specify at least one value
   * for at least one types of retry events.
   */
  public fun grpcRetryEvents(vararg grpcRetryEvents: GrpcRetryEvent) {
    _grpcRetryEvents.addAll(listOf(*grpcRetryEvents))
  }

  /**
   * @param grpcRetryEvents gRPC events on which to retry.
   * You must specify at least one value
   * for at least one types of retry events.
   */
  public fun grpcRetryEvents(grpcRetryEvents: Collection<GrpcRetryEvent>) {
    _grpcRetryEvents.addAll(grpcRetryEvents)
  }

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

  public fun build(): GrpcRetryPolicy {
    if(_grpcRetryEvents.isNotEmpty()) cdkBuilder.grpcRetryEvents(_grpcRetryEvents)
    if(_httpRetryEvents.isNotEmpty()) cdkBuilder.httpRetryEvents(_httpRetryEvents)
    if(_tcpRetryEvents.isNotEmpty()) cdkBuilder.tcpRetryEvents(_tcpRetryEvents)
    return cdkBuilder.build()
  }
}
