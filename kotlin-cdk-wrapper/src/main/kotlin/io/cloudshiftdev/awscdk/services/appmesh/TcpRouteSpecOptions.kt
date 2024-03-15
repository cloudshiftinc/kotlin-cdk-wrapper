@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TcpRouteSpecOptions : RouteSpecOptionsBase {
  public fun timeout(): TcpTimeout? = unwrap(this).getTimeout()?.let(TcpTimeout::wrap)

  public fun weightedTargets(): List<WeightedTarget>

  @CdkDslMarker
  public interface Builder {
    public fun priority(priority: Number)

    public fun timeout(timeout: TcpTimeout)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed0fc7661ec7d2fa8aaa2777981dec7b3808ddf6ed35396e9d4d2225ecb7e430")
    public fun timeout(timeout: TcpTimeout.Builder.() -> Unit)

    public fun weightedTargets(weightedTargets: List<WeightedTarget>)

    public fun weightedTargets(vararg weightedTargets: WeightedTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions.builder()

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun timeout(timeout: TcpTimeout) {
      cdkBuilder.timeout(timeout.let(TcpTimeout::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed0fc7661ec7d2fa8aaa2777981dec7b3808ddf6ed35396e9d4d2225ecb7e430")
    override fun timeout(timeout: TcpTimeout.Builder.() -> Unit): Unit =
        timeout(TcpTimeout(timeout))

    override fun weightedTargets(weightedTargets: List<WeightedTarget>) {
      cdkBuilder.weightedTargets(weightedTargets.map(WeightedTarget::unwrap))
    }

    override fun weightedTargets(vararg weightedTargets: WeightedTarget): Unit =
        weightedTargets(weightedTargets.toList())

    public fun build(): software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions,
  ) : CdkObject(cdkObject), TcpRouteSpecOptions {
    override fun priority(): Number? = unwrap(this).getPriority()

    override fun timeout(): TcpTimeout? = unwrap(this).getTimeout()?.let(TcpTimeout::wrap)

    override fun weightedTargets(): List<WeightedTarget> =
        unwrap(this).getWeightedTargets().map(WeightedTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TcpRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions):
        TcpRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TcpRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions
  }
}
