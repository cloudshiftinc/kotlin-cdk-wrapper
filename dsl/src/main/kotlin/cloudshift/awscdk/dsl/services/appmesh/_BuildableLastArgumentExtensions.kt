@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.CfnMesh
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import software.amazon.awscdk.services.appmesh.CfnVirtualService
import software.amazon.awscdk.services.appmesh.GatewayRoute
import software.amazon.awscdk.services.appmesh.Mesh
import software.amazon.awscdk.services.appmesh.Route
import software.amazon.awscdk.services.appmesh.VirtualGateway
import software.amazon.awscdk.services.appmesh.VirtualNode
import software.amazon.awscdk.services.appmesh.VirtualRouter

public inline fun CfnGatewayRoute.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnGatewayRoute.setSpec(block: CfnGatewayRouteGatewayRouteSpecPropertyDsl.() -> Unit = {}) {
  val builder = CfnGatewayRouteGatewayRouteSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun CfnMesh.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMesh.setSpec(block: CfnMeshMeshSpecPropertyDsl.() -> Unit = {}) {
  val builder = CfnMeshMeshSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun CfnRoute.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRoute.setSpec(block: CfnRouteRouteSpecPropertyDsl.() -> Unit = {}) {
  val builder = CfnRouteRouteSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun CfnVirtualGateway.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnVirtualGateway.setSpec(block: CfnVirtualGatewayVirtualGatewaySpecPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnVirtualGatewayVirtualGatewaySpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun CfnVirtualNode.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnVirtualNode.setSpec(block: CfnVirtualNodeVirtualNodeSpecPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVirtualNodeVirtualNodeSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun CfnVirtualRouter.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnVirtualRouter.setSpec(block: CfnVirtualRouterVirtualRouterSpecPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnVirtualRouterVirtualRouterSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun CfnVirtualService.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnVirtualService.setSpec(block: CfnVirtualServiceVirtualServiceSpecPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnVirtualServiceVirtualServiceSpecPropertyDsl()
  builder.apply(block)
  return setSpec(builder.build())
}

public inline fun Mesh.addVirtualGateway(arg0: String, block: VirtualGatewayBasePropsDsl.() -> Unit
    = {}): VirtualGateway {
  val builder = VirtualGatewayBasePropsDsl()
  builder.apply(block)
  return addVirtualGateway(arg0,builder.build())
}

public inline fun Mesh.addVirtualNode(arg0: String, block: VirtualNodeBasePropsDsl.() -> Unit = {}):
    VirtualNode {
  val builder = VirtualNodeBasePropsDsl()
  builder.apply(block)
  return addVirtualNode(arg0,builder.build())
}

public inline fun Mesh.addVirtualRouter(arg0: String, block: VirtualRouterBasePropsDsl.() -> Unit =
    {}): VirtualRouter {
  val builder = VirtualRouterBasePropsDsl()
  builder.apply(block)
  return addVirtualRouter(arg0,builder.build())
}

public inline fun VirtualGateway.addGatewayRoute(arg0: String,
    block: GatewayRouteBasePropsDsl.() -> Unit = {}): GatewayRoute {
  val builder = GatewayRouteBasePropsDsl()
  builder.apply(block)
  return addGatewayRoute(arg0,builder.build())
}

public inline fun VirtualRouter.addRoute(arg0: String, block: RouteBasePropsDsl.() -> Unit = {}):
    Route {
  val builder = RouteBasePropsDsl()
  builder.apply(block)
  return addRoute(arg0,builder.build())
}
