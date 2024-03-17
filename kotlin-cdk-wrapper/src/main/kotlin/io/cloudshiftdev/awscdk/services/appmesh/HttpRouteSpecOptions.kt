@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

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
public interface HttpRouteSpecOptions : RouteSpecOptionsBase {
  /**
   * The criterion for determining a request match for this Route.
   *
   * Default: - matches on '/'
   */
  public fun match(): HttpRouteMatch? = unwrap(this).getMatch()?.let(HttpRouteMatch::wrap)

  /**
   * The retry policy.
   *
   * Default: - no retry policy
   */
  public fun retryPolicy(): HttpRetryPolicy? =
      unwrap(this).getRetryPolicy()?.let(HttpRetryPolicy::wrap)

  /**
   * An object that represents a http timeout.
   *
   * Default: - None
   */
  public fun timeout(): HttpTimeout? = unwrap(this).getTimeout()?.let(HttpTimeout::wrap)

  /**
   * List of targets that traffic is routed to when a request matches the route.
   */
  public fun weightedTargets(): List<WeightedTarget>

  /**
   * A builder for [HttpRouteSpecOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param match The criterion for determining a request match for this Route.
     */
    public fun match(match: HttpRouteMatch)

    /**
     * @param match The criterion for determining a request match for this Route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("301f518003ed6ad74203ddf01ec361a6a61f6458dd635278fcead69b7ace9080")
    public fun match(match: HttpRouteMatch.Builder.() -> Unit)

    /**
     * @param priority The priority for the route.
     * When a Virtual Router has multiple routes, route match is performed in the
     * order of specified value, where 0 is the highest priority, and first matched route is
     * selected.
     */
    public fun priority(priority: Number)

    /**
     * @param retryPolicy The retry policy.
     */
    public fun retryPolicy(retryPolicy: HttpRetryPolicy)

    /**
     * @param retryPolicy The retry policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5eb15bd3c8b4a3fb74164bc800b27a4a5d7eb7eb7a7b91734dd3bdbc99ba802")
    public fun retryPolicy(retryPolicy: HttpRetryPolicy.Builder.() -> Unit)

    /**
     * @param timeout An object that represents a http timeout.
     */
    public fun timeout(timeout: HttpTimeout)

    /**
     * @param timeout An object that represents a http timeout.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("023b62167188f1bd7405b427b8836a88452ebd20627fca527e0f23dbfb622f0a")
    public fun timeout(timeout: HttpTimeout.Builder.() -> Unit)

    /**
     * @param weightedTargets List of targets that traffic is routed to when a request matches the
     * route. 
     */
    public fun weightedTargets(weightedTargets: List<WeightedTarget>)

    /**
     * @param weightedTargets List of targets that traffic is routed to when a request matches the
     * route. 
     */
    public fun weightedTargets(vararg weightedTargets: WeightedTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions.builder()

    /**
     * @param match The criterion for determining a request match for this Route.
     */
    override fun match(match: HttpRouteMatch) {
      cdkBuilder.match(match.let(HttpRouteMatch::unwrap))
    }

    /**
     * @param match The criterion for determining a request match for this Route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("301f518003ed6ad74203ddf01ec361a6a61f6458dd635278fcead69b7ace9080")
    override fun match(match: HttpRouteMatch.Builder.() -> Unit): Unit =
        match(HttpRouteMatch(match))

    /**
     * @param priority The priority for the route.
     * When a Virtual Router has multiple routes, route match is performed in the
     * order of specified value, where 0 is the highest priority, and first matched route is
     * selected.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param retryPolicy The retry policy.
     */
    override fun retryPolicy(retryPolicy: HttpRetryPolicy) {
      cdkBuilder.retryPolicy(retryPolicy.let(HttpRetryPolicy::unwrap))
    }

    /**
     * @param retryPolicy The retry policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5eb15bd3c8b4a3fb74164bc800b27a4a5d7eb7eb7a7b91734dd3bdbc99ba802")
    override fun retryPolicy(retryPolicy: HttpRetryPolicy.Builder.() -> Unit): Unit =
        retryPolicy(HttpRetryPolicy(retryPolicy))

    /**
     * @param timeout An object that represents a http timeout.
     */
    override fun timeout(timeout: HttpTimeout) {
      cdkBuilder.timeout(timeout.let(HttpTimeout::unwrap))
    }

    /**
     * @param timeout An object that represents a http timeout.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("023b62167188f1bd7405b427b8836a88452ebd20627fca527e0f23dbfb622f0a")
    override fun timeout(timeout: HttpTimeout.Builder.() -> Unit): Unit =
        timeout(HttpTimeout(timeout))

    /**
     * @param weightedTargets List of targets that traffic is routed to when a request matches the
     * route. 
     */
    override fun weightedTargets(weightedTargets: List<WeightedTarget>) {
      cdkBuilder.weightedTargets(weightedTargets.map(WeightedTarget::unwrap))
    }

    /**
     * @param weightedTargets List of targets that traffic is routed to when a request matches the
     * route. 
     */
    override fun weightedTargets(vararg weightedTargets: WeightedTarget): Unit =
        weightedTargets(weightedTargets.toList())

    public fun build(): software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions,
  ) : CdkObject(cdkObject), HttpRouteSpecOptions {
    /**
     * The criterion for determining a request match for this Route.
     *
     * Default: - matches on '/'
     */
    override fun match(): HttpRouteMatch? = unwrap(this).getMatch()?.let(HttpRouteMatch::wrap)

    /**
     * The priority for the route.
     *
     * When a Virtual Router has multiple routes, route match is performed in the
     * order of specified value, where 0 is the highest priority, and first matched route is
     * selected.
     *
     * Default: - no particular priority
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The retry policy.
     *
     * Default: - no retry policy
     */
    override fun retryPolicy(): HttpRetryPolicy? =
        unwrap(this).getRetryPolicy()?.let(HttpRetryPolicy::wrap)

    /**
     * An object that represents a http timeout.
     *
     * Default: - None
     */
    override fun timeout(): HttpTimeout? = unwrap(this).getTimeout()?.let(HttpTimeout::wrap)

    /**
     * List of targets that traffic is routed to when a request matches the route.
     */
    override fun weightedTargets(): List<WeightedTarget> =
        unwrap(this).getWeightedTargets().map(WeightedTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions):
        HttpRouteSpecOptions = CdkObjectWrappers.wrap(cdkObject) as? HttpRouteSpecOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions
  }
}
