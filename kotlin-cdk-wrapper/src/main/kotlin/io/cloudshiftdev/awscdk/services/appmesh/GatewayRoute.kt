@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * GatewayRoute represents a new or existing gateway route attached to a VirtualGateway and Mesh.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * GatewayRouteSpec gatewayRouteSpec;
 * VirtualGateway virtualGateway;
 * GatewayRoute gatewayRoute = GatewayRoute.Builder.create(this, "MyGatewayRoute")
 * .routeSpec(gatewayRouteSpec)
 * .virtualGateway(virtualGateway)
 * // the properties below are optional
 * .gatewayRouteName("gatewayRouteName")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/gateway-routes.html)
 */
public open class GatewayRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRoute,
) : Resource(cdkObject), IGatewayRoute {
  /**
   * The Amazon Resource Name (ARN) for the GatewayRoute.
   */
  public override fun gatewayRouteArn(): String = unwrap(this).getGatewayRouteArn()

  /**
   * The name of the GatewayRoute.
   */
  public override fun gatewayRouteName(): String = unwrap(this).getGatewayRouteName()

  /**
   * The VirtualGateway this GatewayRoute is a part of.
   */
  public override fun virtualGateway(): IVirtualGateway =
      unwrap(this).getVirtualGateway().let(IVirtualGateway::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.GatewayRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the GatewayRoute.
     *
     * Default: - an automatically generated name
     *
     * @param gatewayRouteName The name of the GatewayRoute. 
     */
    public fun gatewayRouteName(gatewayRouteName: String)

    /**
     * What protocol the route uses.
     *
     * @param routeSpec What protocol the route uses. 
     */
    public fun routeSpec(routeSpec: GatewayRouteSpec)

    /**
     * The VirtualGateway this GatewayRoute is associated with.
     *
     * @param virtualGateway The VirtualGateway this GatewayRoute is associated with. 
     */
    public fun virtualGateway(virtualGateway: IVirtualGateway)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GatewayRoute.Builder =
        software.amazon.awscdk.services.appmesh.GatewayRoute.Builder.create(scope, id)

    /**
     * The name of the GatewayRoute.
     *
     * Default: - an automatically generated name
     *
     * @param gatewayRouteName The name of the GatewayRoute. 
     */
    override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    /**
     * What protocol the route uses.
     *
     * @param routeSpec What protocol the route uses. 
     */
    override fun routeSpec(routeSpec: GatewayRouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(GatewayRouteSpec::unwrap))
    }

    /**
     * The VirtualGateway this GatewayRoute is associated with.
     *
     * @param virtualGateway The VirtualGateway this GatewayRoute is associated with. 
     */
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
