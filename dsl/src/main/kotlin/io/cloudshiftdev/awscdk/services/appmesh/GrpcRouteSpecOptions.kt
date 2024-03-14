package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface GrpcRouteSpecOptions : RouteSpecOptionsBase {
  /**
   * The criterion for determining a request match for this Route.
   */
  public fun match(): GrpcRouteMatch

  /**
   * The retry policy.
   *
   * Default: - no retry policy
   */
  public fun retryPolicy(): GrpcRetryPolicy? =
      unwrap(this).getRetryPolicy()?.let(GrpcRetryPolicy::wrap)

  /**
   * An object that represents a grpc timeout.
   *
   * Default: - None
   */
  public fun timeout(): GrpcTimeout? = unwrap(this).getTimeout()?.let(GrpcTimeout::wrap)

  /**
   * List of targets that traffic is routed to when a request matches the route.
   */
  public fun weightedTargets(): List<WeightedTarget>

  /**
   * A builder for [GrpcRouteSpecOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param match The criterion for determining a request match for this Route. 
     */
    public fun match(match: GrpcRouteMatch)

    /**
     * @param match The criterion for determining a request match for this Route. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c443c125c7e307cde08650895cc490bd331f5b0f32fa1bb2e182e68d29ad7566")
    public fun match(match: GrpcRouteMatch.Builder.() -> Unit)

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
    public fun retryPolicy(retryPolicy: GrpcRetryPolicy)

    /**
     * @param retryPolicy The retry policy.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0eaf43c24ce77189ff2d04f1dd89d3653fbfd69c6bd04ac7856362d6837f8ed9")
    public fun retryPolicy(retryPolicy: GrpcRetryPolicy.Builder.() -> Unit)

    /**
     * @param timeout An object that represents a grpc timeout.
     */
    public fun timeout(timeout: GrpcTimeout)

    /**
     * @param timeout An object that represents a grpc timeout.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("589c0e3c735f3163a5450e3579eda4be3603edf18107dca80bd9d145541d0582")
    public fun timeout(timeout: GrpcTimeout.Builder.() -> Unit)

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
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions.builder()

    /**
     * @param match The criterion for determining a request match for this Route. 
     */
    override fun match(match: GrpcRouteMatch) {
      cdkBuilder.match(match.let(GrpcRouteMatch::unwrap))
    }

    /**
     * @param match The criterion for determining a request match for this Route. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c443c125c7e307cde08650895cc490bd331f5b0f32fa1bb2e182e68d29ad7566")
    override fun match(match: GrpcRouteMatch.Builder.() -> Unit): Unit =
        match(GrpcRouteMatch(match))

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
    override fun retryPolicy(retryPolicy: GrpcRetryPolicy) {
      cdkBuilder.retryPolicy(retryPolicy.let(GrpcRetryPolicy::unwrap))
    }

    /**
     * @param retryPolicy The retry policy.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0eaf43c24ce77189ff2d04f1dd89d3653fbfd69c6bd04ac7856362d6837f8ed9")
    override fun retryPolicy(retryPolicy: GrpcRetryPolicy.Builder.() -> Unit): Unit =
        retryPolicy(GrpcRetryPolicy(retryPolicy))

    /**
     * @param timeout An object that represents a grpc timeout.
     */
    override fun timeout(timeout: GrpcTimeout) {
      cdkBuilder.timeout(timeout.let(GrpcTimeout::unwrap))
    }

    /**
     * @param timeout An object that represents a grpc timeout.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("589c0e3c735f3163a5450e3579eda4be3603edf18107dca80bd9d145541d0582")
    override fun timeout(timeout: GrpcTimeout.Builder.() -> Unit): Unit =
        timeout(GrpcTimeout(timeout))

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

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions,
  ) : GrpcRouteSpecOptions {
    /**
     * The criterion for determining a request match for this Route.
     */
    override fun match(): GrpcRouteMatch = unwrap(this).getMatch().let(GrpcRouteMatch::wrap)

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
    override fun retryPolicy(): GrpcRetryPolicy? =
        unwrap(this).getRetryPolicy()?.let(GrpcRetryPolicy::wrap)

    /**
     * An object that represents a grpc timeout.
     *
     * Default: - None
     */
    override fun timeout(): GrpcTimeout? = unwrap(this).getTimeout()?.let(GrpcTimeout::wrap)

    /**
     * List of targets that traffic is routed to when a request matches the route.
     */
    override fun weightedTargets(): List<WeightedTarget> =
        unwrap(this).getWeightedTargets().map(WeightedTarget::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions):
        GrpcRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions = (wrapped as
        Wrapper).cdkObject
  }
}
