@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

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
public interface HttpRetryPolicy {
  /**
   * Specify HTTP events on which to retry.
   *
   * You must specify at least one value
   * for at least one types of retry events.
   *
   * Default: - no retries for http events
   */
  public fun httpRetryEvents(): List<HttpRetryEvent> =
      unwrap(this).getHttpRetryEvents()?.map(HttpRetryEvent::wrap) ?: emptyList()

  /**
   * The maximum number of retry attempts.
   */
  public fun retryAttempts(): Number

  /**
   * The timeout for each retry attempt.
   */
  public fun retryTimeout(): Duration

  /**
   * TCP events on which to retry.
   *
   * The event occurs before any processing of a
   * request has started and is encountered when the upstream is temporarily or
   * permanently unavailable. You must specify at least one value for at least
   * one types of retry events.
   *
   * Default: - no retries for tcp events
   */
  public fun tcpRetryEvents(): List<TcpRetryEvent> =
      unwrap(this).getTcpRetryEvents()?.map(TcpRetryEvent::wrap) ?: emptyList()

  /**
   * A builder for [HttpRetryPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param httpRetryEvents Specify HTTP events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    public fun httpRetryEvents(httpRetryEvents: List<HttpRetryEvent>)

    /**
     * @param httpRetryEvents Specify HTTP events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    public fun httpRetryEvents(vararg httpRetryEvents: HttpRetryEvent)

    /**
     * @param retryAttempts The maximum number of retry attempts. 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param retryTimeout The timeout for each retry attempt. 
     */
    public fun retryTimeout(retryTimeout: Duration)

    /**
     * @param tcpRetryEvents TCP events on which to retry.
     * The event occurs before any processing of a
     * request has started and is encountered when the upstream is temporarily or
     * permanently unavailable. You must specify at least one value for at least
     * one types of retry events.
     */
    public fun tcpRetryEvents(tcpRetryEvents: List<TcpRetryEvent>)

    /**
     * @param tcpRetryEvents TCP events on which to retry.
     * The event occurs before any processing of a
     * request has started and is encountered when the upstream is temporarily or
     * permanently unavailable. You must specify at least one value for at least
     * one types of retry events.
     */
    public fun tcpRetryEvents(vararg tcpRetryEvents: TcpRetryEvent)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpRetryPolicy.Builder =
        software.amazon.awscdk.services.appmesh.HttpRetryPolicy.builder()

    /**
     * @param httpRetryEvents Specify HTTP events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    override fun httpRetryEvents(httpRetryEvents: List<HttpRetryEvent>) {
      cdkBuilder.httpRetryEvents(httpRetryEvents.map(HttpRetryEvent.Companion::unwrap))
    }

    /**
     * @param httpRetryEvents Specify HTTP events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    override fun httpRetryEvents(vararg httpRetryEvents: HttpRetryEvent): Unit =
        httpRetryEvents(httpRetryEvents.toList())

    /**
     * @param retryAttempts The maximum number of retry attempts. 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param retryTimeout The timeout for each retry attempt. 
     */
    override fun retryTimeout(retryTimeout: Duration) {
      cdkBuilder.retryTimeout(retryTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param tcpRetryEvents TCP events on which to retry.
     * The event occurs before any processing of a
     * request has started and is encountered when the upstream is temporarily or
     * permanently unavailable. You must specify at least one value for at least
     * one types of retry events.
     */
    override fun tcpRetryEvents(tcpRetryEvents: List<TcpRetryEvent>) {
      cdkBuilder.tcpRetryEvents(tcpRetryEvents.map(TcpRetryEvent.Companion::unwrap))
    }

    /**
     * @param tcpRetryEvents TCP events on which to retry.
     * The event occurs before any processing of a
     * request has started and is encountered when the upstream is temporarily or
     * permanently unavailable. You must specify at least one value for at least
     * one types of retry events.
     */
    override fun tcpRetryEvents(vararg tcpRetryEvents: TcpRetryEvent): Unit =
        tcpRetryEvents(tcpRetryEvents.toList())

    public fun build(): software.amazon.awscdk.services.appmesh.HttpRetryPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpRetryPolicy,
  ) : CdkObject(cdkObject), HttpRetryPolicy {
    /**
     * Specify HTTP events on which to retry.
     *
     * You must specify at least one value
     * for at least one types of retry events.
     *
     * Default: - no retries for http events
     */
    override fun httpRetryEvents(): List<HttpRetryEvent> =
        unwrap(this).getHttpRetryEvents()?.map(HttpRetryEvent::wrap) ?: emptyList()

    /**
     * The maximum number of retry attempts.
     */
    override fun retryAttempts(): Number = unwrap(this).getRetryAttempts()

    /**
     * The timeout for each retry attempt.
     */
    override fun retryTimeout(): Duration = unwrap(this).getRetryTimeout().let(Duration::wrap)

    /**
     * TCP events on which to retry.
     *
     * The event occurs before any processing of a
     * request has started and is encountered when the upstream is temporarily or
     * permanently unavailable. You must specify at least one value for at least
     * one types of retry events.
     *
     * Default: - no retries for tcp events
     */
    override fun tcpRetryEvents(): List<TcpRetryEvent> =
        unwrap(this).getTcpRetryEvents()?.map(TcpRetryEvent::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRetryPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRetryPolicy):
        HttpRetryPolicy = CdkObjectWrappers.wrap(cdkObject) as? HttpRetryPolicy ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRetryPolicy):
        software.amazon.awscdk.services.appmesh.HttpRetryPolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.HttpRetryPolicy
  }
}
