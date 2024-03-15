@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class GatewayRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRoute,
) : Resource(cdkObject), IGatewayRoute {
  public override fun gatewayRouteArn(): String = unwrap(this).getGatewayRouteArn()

  public override fun gatewayRouteName(): String = unwrap(this).getGatewayRouteName()

  public override fun virtualGateway(): IVirtualGateway =
      unwrap(this).getVirtualGateway().let(IVirtualGateway::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun gatewayRouteName(gatewayRouteName: String)

    public fun routeSpec(routeSpec: GatewayRouteSpec)

    public fun virtualGateway(virtualGateway: IVirtualGateway)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GatewayRoute.Builder =
        software.amazon.awscdk.services.appmesh.GatewayRoute.Builder.create(scope, id)

    override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    override fun routeSpec(routeSpec: GatewayRouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(GatewayRouteSpec::unwrap))
    }

    override fun virtualGateway(virtualGateway: IVirtualGateway) {
      cdkBuilder.virtualGateway(virtualGateway.let(IVirtualGateway::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GatewayRoute = cdkBuilder.build()
  }

  public companion object {
    public fun fromGatewayRouteArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      gatewayRouteArn: String,
    ): IGatewayRoute =
        software.amazon.awscdk.services.appmesh.GatewayRoute.fromGatewayRouteArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, gatewayRouteArn).let(IGatewayRoute::wrap)

    public fun fromGatewayRouteAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: GatewayRouteAttributes,
    ): IGatewayRoute =
        software.amazon.awscdk.services.appmesh.GatewayRoute.fromGatewayRouteAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(GatewayRouteAttributes::unwrap)).let(IGatewayRoute::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f71dbbf43002918748ca9a53d66214e1ac13030048b1218765fc33ac163c70a9")
    public fun fromGatewayRouteAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: GatewayRouteAttributes.Builder.() -> Unit,
    ): IGatewayRoute = fromGatewayRouteAttributes(scope, id, GatewayRouteAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): GatewayRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return GatewayRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRoute): GatewayRoute
        = GatewayRoute(cdkObject)

    internal fun unwrap(wrapped: GatewayRoute): software.amazon.awscdk.services.appmesh.GatewayRoute
        = wrapped.cdkObject
  }
}
