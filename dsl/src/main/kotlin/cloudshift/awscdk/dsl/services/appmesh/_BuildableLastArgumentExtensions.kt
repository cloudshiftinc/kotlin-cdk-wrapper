@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.CfnMesh
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import software.amazon.awscdk.services.appmesh.CfnVirtualService
import software.amazon.awscdk.services.appmesh.GatewayRoute
import software.amazon.awscdk.services.appmesh.HealthCheck
import software.amazon.awscdk.services.appmesh.HealthCheckConfig
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.IVirtualGateway
import software.amazon.awscdk.services.appmesh.IVirtualRouter
import software.amazon.awscdk.services.appmesh.Mesh
import software.amazon.awscdk.services.appmesh.Route
import software.amazon.awscdk.services.appmesh.VirtualGateway
import software.amazon.awscdk.services.appmesh.VirtualNode
import software.amazon.awscdk.services.appmesh.VirtualRouter
import software.constructs.Construct

public inline fun CfnRoute.setSpec(block: CfnRouteRouteSpecPropertyDsl.() -> Unit = {}) {
  val builder = CfnRouteRouteSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun IMesh.addVirtualGateway(arg0: String, block: VirtualGatewayBasePropsDsl.() -> Unit
    = {}): VirtualGateway {
  val builder = VirtualGatewayBasePropsDsl()
  builder.apply(block)
  return addVirtualGateway(arg0, builder.build())
}

public inline fun IMesh.addVirtualNode(arg0: String, block: VirtualNodeBasePropsDsl.() -> Unit =
    {}): VirtualNode {
  val builder = VirtualNodeBasePropsDsl()
  builder.apply(block)
  return addVirtualNode(arg0, builder.build())
}

public inline fun IMesh.addVirtualRouter(arg0: String, block: VirtualRouterBasePropsDsl.() -> Unit =
    {}): VirtualRouter {
  val builder = VirtualRouterBasePropsDsl()
  builder.apply(block)
  return addVirtualRouter(arg0, builder.build())
}

public inline
    fun CfnGatewayRoute.setSpec(block: CfnGatewayRouteGatewayRouteSpecPropertyDsl.() -> Unit = {}) {
  val builder = CfnGatewayRouteGatewayRouteSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun VirtualRouter.addRoute(id: String, block: RouteBasePropsDsl.() -> Unit = {}):
    Route {
  val builder = RouteBasePropsDsl()
  builder.apply(block)
  return addRoute(id, builder.build())
}

public inline fun IVirtualGateway.addGatewayRoute(arg0: String,
    block: GatewayRouteBasePropsDsl.() -> Unit = {}): GatewayRoute {
  val builder = GatewayRouteBasePropsDsl()
  builder.apply(block)
  return addGatewayRoute(arg0, builder.build())
}

public inline fun HealthCheck.bind(arg0: Construct, block: HealthCheckBindOptionsDsl.() -> Unit =
    {}): HealthCheckConfig {
  val builder = HealthCheckBindOptionsDsl()
  builder.apply(block)
  return bind(arg0, builder.build())
}

public inline fun IVirtualRouter.addRoute(arg0: String, block: RouteBasePropsDsl.() -> Unit = {}):
    Route {
  val builder = RouteBasePropsDsl()
  builder.apply(block)
  return addRoute(arg0, builder.build())
}

public inline
    fun CfnVirtualRouter.setSpec(block: CfnVirtualRouterVirtualRouterSpecPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnVirtualRouterVirtualRouterSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline
    fun CfnVirtualGateway.setSpec(block: CfnVirtualGatewayVirtualGatewaySpecPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnVirtualGatewayVirtualGatewaySpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun CfnVirtualNode.setSpec(block: CfnVirtualNodeVirtualNodeSpecPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVirtualNodeVirtualNodeSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline
    fun CfnVirtualService.setSpec(block: CfnVirtualServiceVirtualServiceSpecPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnVirtualServiceVirtualServiceSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun CfnMesh.setSpec(block: CfnMeshMeshSpecPropertyDsl.() -> Unit = {}) {
  val builder = CfnMeshMeshSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun Mesh.addVirtualGateway(id: String, block: VirtualGatewayBasePropsDsl.() -> Unit =
    {}): VirtualGateway {
  val builder = VirtualGatewayBasePropsDsl()
  builder.apply(block)
  return addVirtualGateway(id, builder.build())
}

public inline fun Mesh.addVirtualNode(id: String, block: VirtualNodeBasePropsDsl.() -> Unit = {}):
    VirtualNode {
  val builder = VirtualNodeBasePropsDsl()
  builder.apply(block)
  return addVirtualNode(id, builder.build())
}

public inline fun Mesh.addVirtualRouter(id: String, block: VirtualRouterBasePropsDsl.() -> Unit =
    {}): VirtualRouter {
  val builder = VirtualRouterBasePropsDsl()
  builder.apply(block)
  return addVirtualRouter(id, builder.build())
}

public inline fun VirtualGateway.addGatewayRoute(id: String,
    block: GatewayRouteBasePropsDsl.() -> Unit = {}): GatewayRoute {
  val builder = GatewayRouteBasePropsDsl()
  builder.apply(block)
  return addGatewayRoute(id, builder.build())
}
