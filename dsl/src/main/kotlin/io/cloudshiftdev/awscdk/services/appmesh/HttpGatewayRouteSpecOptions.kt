package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpGatewayRouteSpecOptions : CommonGatewayRouteSpecOptions {
  public fun match(): HttpGatewayRouteMatch? =
      unwrap(this).getMatch()?.let(HttpGatewayRouteMatch::wrap)

  public fun routeTarget(): IVirtualService

  public interface Builder {
    public fun match(match: HttpGatewayRouteMatch) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5de161a09ed98413915fa38ce6d6951ffd9f0e0bb9393542cdd7752003239f5f")
    public fun match(match: HttpGatewayRouteMatch.Builder.() -> Unit) {
    }

    public fun priority(priority: Number) {
    }

    public fun routeTarget(routeTarget: IVirtualService) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions.builder()

    public override fun match(match: HttpGatewayRouteMatch) {
      cdkBuilder.match(match.let(HttpGatewayRouteMatch::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5de161a09ed98413915fa38ce6d6951ffd9f0e0bb9393542cdd7752003239f5f")
    public override fun match(match: HttpGatewayRouteMatch.Builder.() -> Unit): Unit =
        match(HttpGatewayRouteMatch(match))

    public override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public override fun routeTarget(routeTarget: IVirtualService) {
      cdkBuilder.routeTarget(routeTarget.let(IVirtualService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions,
  ) : HttpGatewayRouteSpecOptions {
    public override fun match(): HttpGatewayRouteMatch? =
        unwrap(this).getMatch()?.let(HttpGatewayRouteMatch::wrap)

    public override fun priority(): Number? = unwrap(this).getPriority()

    public override fun routeTarget(): IVirtualService =
        unwrap(this).getRouteTarget().let(IVirtualService::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions):
        HttpGatewayRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions = (wrapped as
        Wrapper).cdkObject
  }
}
