package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface GrpcGatewayRouteSpecOptions : CommonGatewayRouteSpecOptions {
  public fun match(): GrpcGatewayRouteMatch

  public fun routeTarget(): IVirtualService

  public interface Builder {
    public fun match(match: GrpcGatewayRouteMatch) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("049afeb2582a8cfa99cbd2258b2fe194b372388321855c061f39eb552c7e795a")
    public fun match(match: GrpcGatewayRouteMatch.Builder.() -> Unit) {
    }

    public fun priority(priority: Number) {
    }

    public fun routeTarget(routeTarget: IVirtualService) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions.builder()

    public override fun match(match: GrpcGatewayRouteMatch) {
      cdkBuilder.match(match.let(GrpcGatewayRouteMatch::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("049afeb2582a8cfa99cbd2258b2fe194b372388321855c061f39eb552c7e795a")
    public override fun match(match: GrpcGatewayRouteMatch.Builder.() -> Unit): Unit =
        match(GrpcGatewayRouteMatch(match))

    public override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public override fun routeTarget(routeTarget: IVirtualService) {
      cdkBuilder.routeTarget(routeTarget.let(IVirtualService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions,
  ) : GrpcGatewayRouteSpecOptions {
    public override fun match(): GrpcGatewayRouteMatch =
        unwrap(this).getMatch().let(GrpcGatewayRouteMatch::wrap)

    public override fun priority(): Number? = unwrap(this).getPriority()

    public override fun routeTarget(): IVirtualService =
        unwrap(this).getRouteTarget().let(IVirtualService::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions):
        GrpcGatewayRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcGatewayRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions = (wrapped as
        Wrapper).cdkObject
  }
}
