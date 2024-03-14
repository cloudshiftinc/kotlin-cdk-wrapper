package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface GrpcRouteSpecOptions : RouteSpecOptionsBase {
  public fun match(): GrpcRouteMatch

  public fun retryPolicy(): GrpcRetryPolicy? =
      unwrap(this).getRetryPolicy()?.let(GrpcRetryPolicy::wrap)

  public fun timeout(): GrpcTimeout? = unwrap(this).getTimeout()?.let(GrpcTimeout::wrap)

  public fun weightedTargets(): List<WeightedTarget>

  public interface Builder {
    public fun match(match: GrpcRouteMatch)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c443c125c7e307cde08650895cc490bd331f5b0f32fa1bb2e182e68d29ad7566")
    public fun match(match: GrpcRouteMatch.Builder.() -> Unit)

    public fun priority(priority: Number)

    public fun retryPolicy(retryPolicy: GrpcRetryPolicy)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0eaf43c24ce77189ff2d04f1dd89d3653fbfd69c6bd04ac7856362d6837f8ed9")
    public fun retryPolicy(retryPolicy: GrpcRetryPolicy.Builder.() -> Unit)

    public fun timeout(timeout: GrpcTimeout)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("589c0e3c735f3163a5450e3579eda4be3603edf18107dca80bd9d145541d0582")
    public fun timeout(timeout: GrpcTimeout.Builder.() -> Unit)

    public fun weightedTargets(weightedTargets: List<WeightedTarget>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions.builder()

    override fun match(match: GrpcRouteMatch) {
      cdkBuilder.match(match.let(GrpcRouteMatch::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c443c125c7e307cde08650895cc490bd331f5b0f32fa1bb2e182e68d29ad7566")
    override fun match(match: GrpcRouteMatch.Builder.() -> Unit): Unit =
        match(GrpcRouteMatch(match))

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun retryPolicy(retryPolicy: GrpcRetryPolicy) {
      cdkBuilder.retryPolicy(retryPolicy.let(GrpcRetryPolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0eaf43c24ce77189ff2d04f1dd89d3653fbfd69c6bd04ac7856362d6837f8ed9")
    override fun retryPolicy(retryPolicy: GrpcRetryPolicy.Builder.() -> Unit): Unit =
        retryPolicy(GrpcRetryPolicy(retryPolicy))

    override fun timeout(timeout: GrpcTimeout) {
      cdkBuilder.timeout(timeout.let(GrpcTimeout::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("589c0e3c735f3163a5450e3579eda4be3603edf18107dca80bd9d145541d0582")
    override fun timeout(timeout: GrpcTimeout.Builder.() -> Unit): Unit =
        timeout(GrpcTimeout(timeout))

    override fun weightedTargets(weightedTargets: List<WeightedTarget>) {
      cdkBuilder.weightedTargets(weightedTargets.map(WeightedTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions,
  ) : GrpcRouteSpecOptions {
    override fun match(): GrpcRouteMatch = unwrap(this).getMatch().let(GrpcRouteMatch::wrap)

    override fun priority(): Number? = unwrap(this).getPriority()

    override fun retryPolicy(): GrpcRetryPolicy? =
        unwrap(this).getRetryPolicy()?.let(GrpcRetryPolicy::wrap)

    override fun timeout(): GrpcTimeout? = unwrap(this).getTimeout()?.let(GrpcTimeout::wrap)

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
