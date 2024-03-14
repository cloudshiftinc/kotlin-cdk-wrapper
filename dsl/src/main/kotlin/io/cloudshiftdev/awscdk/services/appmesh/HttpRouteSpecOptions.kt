package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface HttpRouteSpecOptions : RouteSpecOptionsBase {
  public fun match(): HttpRouteMatch? = unwrap(this).getMatch()?.let(HttpRouteMatch::wrap)

  public fun retryPolicy(): HttpRetryPolicy? =
      unwrap(this).getRetryPolicy()?.let(HttpRetryPolicy::wrap)

  public fun timeout(): HttpTimeout? = unwrap(this).getTimeout()?.let(HttpTimeout::wrap)

  public fun weightedTargets(): List<WeightedTarget>

  public interface Builder {
    public fun match(match: HttpRouteMatch) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("301f518003ed6ad74203ddf01ec361a6a61f6458dd635278fcead69b7ace9080")
    public fun match(match: HttpRouteMatch.Builder.() -> Unit) {
    }

    public fun priority(priority: Number) {
    }

    public fun retryPolicy(retryPolicy: HttpRetryPolicy) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5eb15bd3c8b4a3fb74164bc800b27a4a5d7eb7eb7a7b91734dd3bdbc99ba802")
    public fun retryPolicy(retryPolicy: HttpRetryPolicy.Builder.() -> Unit) {
    }

    public fun timeout(timeout: HttpTimeout) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("023b62167188f1bd7405b427b8836a88452ebd20627fca527e0f23dbfb622f0a")
    public fun timeout(timeout: HttpTimeout.Builder.() -> Unit) {
    }

    public fun weightedTargets(weightedTargets: List<WeightedTarget>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions.builder()

    public override fun match(match: HttpRouteMatch) {
      cdkBuilder.match(match.let(HttpRouteMatch::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("301f518003ed6ad74203ddf01ec361a6a61f6458dd635278fcead69b7ace9080")
    public override fun match(match: HttpRouteMatch.Builder.() -> Unit): Unit =
        match(HttpRouteMatch(match))

    public override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public override fun retryPolicy(retryPolicy: HttpRetryPolicy) {
      cdkBuilder.retryPolicy(retryPolicy.let(HttpRetryPolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5eb15bd3c8b4a3fb74164bc800b27a4a5d7eb7eb7a7b91734dd3bdbc99ba802")
    public override fun retryPolicy(retryPolicy: HttpRetryPolicy.Builder.() -> Unit): Unit =
        retryPolicy(HttpRetryPolicy(retryPolicy))

    public override fun timeout(timeout: HttpTimeout) {
      cdkBuilder.timeout(timeout.let(HttpTimeout::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("023b62167188f1bd7405b427b8836a88452ebd20627fca527e0f23dbfb622f0a")
    public override fun timeout(timeout: HttpTimeout.Builder.() -> Unit): Unit =
        timeout(HttpTimeout(timeout))

    public override fun weightedTargets(weightedTargets: List<WeightedTarget>) {
      cdkBuilder.weightedTargets(weightedTargets.map(WeightedTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions,
  ) : HttpRouteSpecOptions {
    public override fun match(): HttpRouteMatch? =
        unwrap(this).getMatch()?.let(HttpRouteMatch::wrap)

    public override fun priority(): Number? = unwrap(this).getPriority()

    public override fun retryPolicy(): HttpRetryPolicy? =
        unwrap(this).getRetryPolicy()?.let(HttpRetryPolicy::wrap)

    public override fun timeout(): HttpTimeout? = unwrap(this).getTimeout()?.let(HttpTimeout::wrap)

    public override fun weightedTargets(): List<WeightedTarget> =
        unwrap(this).getWeightedTargets().map(WeightedTarget::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions):
        HttpRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions = (wrapped as
        Wrapper).cdkObject
  }
}
