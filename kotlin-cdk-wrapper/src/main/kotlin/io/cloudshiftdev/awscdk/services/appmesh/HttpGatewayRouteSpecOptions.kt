@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpGatewayRouteSpecOptions : CommonGatewayRouteSpecOptions {
  public fun match(): HttpGatewayRouteMatch? =
      unwrap(this).getMatch()?.let(HttpGatewayRouteMatch::wrap)

  public fun routeTarget(): IVirtualService

  @CdkDslMarker
  public interface Builder {
    public fun match(match: HttpGatewayRouteMatch)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5de161a09ed98413915fa38ce6d6951ffd9f0e0bb9393542cdd7752003239f5f")
    public fun match(match: HttpGatewayRouteMatch.Builder.() -> Unit)

    public fun priority(priority: Number)

    public fun routeTarget(routeTarget: IVirtualService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions.builder()

    override fun match(match: HttpGatewayRouteMatch) {
      cdkBuilder.match(match.let(HttpGatewayRouteMatch::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5de161a09ed98413915fa38ce6d6951ffd9f0e0bb9393542cdd7752003239f5f")
    override fun match(match: HttpGatewayRouteMatch.Builder.() -> Unit): Unit =
        match(HttpGatewayRouteMatch(match))

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun routeTarget(routeTarget: IVirtualService) {
      cdkBuilder.routeTarget(routeTarget.let(IVirtualService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions,
  ) : CdkObject(cdkObject), HttpGatewayRouteSpecOptions {
    override fun match(): HttpGatewayRouteMatch? =
        unwrap(this).getMatch()?.let(HttpGatewayRouteMatch::wrap)

    override fun priority(): Number? = unwrap(this).getPriority()

    override fun routeTarget(): IVirtualService =
        unwrap(this).getRouteTarget().let(IVirtualService::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions):
        HttpGatewayRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions
  }
}
