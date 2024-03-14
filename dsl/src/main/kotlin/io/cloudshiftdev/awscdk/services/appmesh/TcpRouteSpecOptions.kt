package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TcpRouteSpecOptions : RouteSpecOptionsBase {
  public fun timeout(): TcpTimeout? = unwrap(this).getTimeout()?.let(TcpTimeout::wrap)

  public fun weightedTargets(): List<WeightedTarget>

  public interface Builder {
    public fun priority(priority: Number) {
    }

    public fun timeout(timeout: TcpTimeout) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed0fc7661ec7d2fa8aaa2777981dec7b3808ddf6ed35396e9d4d2225ecb7e430")
    public fun timeout(timeout: TcpTimeout.Builder.() -> Unit) {
    }

    public fun weightedTargets(weightedTargets: List<WeightedTarget>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions.builder()

    public override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public override fun timeout(timeout: TcpTimeout) {
      cdkBuilder.timeout(timeout.let(TcpTimeout::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed0fc7661ec7d2fa8aaa2777981dec7b3808ddf6ed35396e9d4d2225ecb7e430")
    public override fun timeout(timeout: TcpTimeout.Builder.() -> Unit): Unit =
        timeout(TcpTimeout(timeout))

    public override fun weightedTargets(weightedTargets: List<WeightedTarget>) {
      cdkBuilder.weightedTargets(weightedTargets.map(WeightedTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions,
  ) : TcpRouteSpecOptions {
    public override fun priority(): Number? = unwrap(this).getPriority()

    public override fun timeout(): TcpTimeout? = unwrap(this).getTimeout()?.let(TcpTimeout::wrap)

    public override fun weightedTargets(): List<WeightedTarget> =
        unwrap(this).getWeightedTargets().map(WeightedTarget::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions):
        TcpRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TcpRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions = (wrapped as Wrapper).cdkObject
  }
}
