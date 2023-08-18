@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appmesh

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

/** The specifications of the gateway route. */
public inline fun CfnGatewayRoute.setSpec(
    block: CfnGatewayRouteGatewayRouteSpecPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGatewayRouteGatewayRouteSpecPropertyDsl()
    builder.apply(block)
    return setSpec(builder.build())
}

/** The service mesh specification to apply. */
public inline fun CfnMesh.setSpec(block: CfnMeshMeshSpecPropertyDsl.() -> Unit = {}) {
    val builder = CfnMeshMeshSpecPropertyDsl()
    builder.apply(block)
    return setSpec(builder.build())
}

/** The route specification to apply. */
public inline fun CfnRoute.setSpec(block: CfnRouteRouteSpecPropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteRouteSpecPropertyDsl()
    builder.apply(block)
    return setSpec(builder.build())
}

/** The specifications of the virtual gateway. */
public inline fun CfnVirtualGateway.setSpec(
    block: CfnVirtualGatewayVirtualGatewaySpecPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVirtualGatewayVirtualGatewaySpecPropertyDsl()
    builder.apply(block)
    return setSpec(builder.build())
}

/** The virtual node specification to apply. */
public inline fun CfnVirtualNode.setSpec(
    block: CfnVirtualNodeVirtualNodeSpecPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVirtualNodeVirtualNodeSpecPropertyDsl()
    builder.apply(block)
    return setSpec(builder.build())
}

/** The virtual router specification to apply. */
public inline fun CfnVirtualRouter.setSpec(
    block: CfnVirtualRouterVirtualRouterSpecPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVirtualRouterVirtualRouterSpecPropertyDsl()
    builder.apply(block)
    return setSpec(builder.build())
}

/** The virtual service specification to apply. */
public inline fun CfnVirtualService.setSpec(
    block: CfnVirtualServiceVirtualServiceSpecPropertyDsl.() -> Unit = {}
) {
    val builder = CfnVirtualServiceVirtualServiceSpecPropertyDsl()
    builder.apply(block)
    return setSpec(builder.build())
}

/**
 * Called when the AccessLog type is initialized.
 *
 * Can be used to enforce mutual exclusivity with future properties
 *
 * @param scope
 * @param options
 */
public inline fun HealthCheck.bind(
    arg0: Construct,
    block: HealthCheckBindOptionsDsl.() -> Unit = {}
): HealthCheckConfig {
    val builder = HealthCheckBindOptionsDsl()
    builder.apply(block)
    return bind(arg0, builder.build())
}

/**
 * Creates a new VirtualGateway in this Mesh.
 *
 * Note that the Gateway is created in the same Stack that this Mesh belongs to, which might be
 * different than the current stack.
 *
 * @param id
 * @param props
 */
public inline fun IMesh.addVirtualGateway(
    arg0: String,
    block: VirtualGatewayBasePropsDsl.() -> Unit = {}
): VirtualGateway {
    val builder = VirtualGatewayBasePropsDsl()
    builder.apply(block)
    return addVirtualGateway(arg0, builder.build())
}

/**
 * Creates a new VirtualNode in this Mesh.
 *
 * Note that the Node is created in the same Stack that this Mesh belongs to, which might be
 * different than the current stack.
 *
 * @param id
 * @param props
 */
public inline fun IMesh.addVirtualNode(
    arg0: String,
    block: VirtualNodeBasePropsDsl.() -> Unit = {}
): VirtualNode {
    val builder = VirtualNodeBasePropsDsl()
    builder.apply(block)
    return addVirtualNode(arg0, builder.build())
}

/**
 * Creates a new VirtualRouter in this Mesh.
 *
 * Note that the Router is created in the same Stack that this Mesh belongs to, which might be
 * different than the current stack.
 *
 * @param id
 * @param props
 */
public inline fun IMesh.addVirtualRouter(
    arg0: String,
    block: VirtualRouterBasePropsDsl.() -> Unit = {}
): VirtualRouter {
    val builder = VirtualRouterBasePropsDsl()
    builder.apply(block)
    return addVirtualRouter(arg0, builder.build())
}

/**
 * Utility method to add a new GatewayRoute to the VirtualGateway.
 *
 * @param id
 * @param route
 */
public inline fun IVirtualGateway.addGatewayRoute(
    arg0: String,
    block: GatewayRouteBasePropsDsl.() -> Unit = {}
): GatewayRoute {
    val builder = GatewayRouteBasePropsDsl()
    builder.apply(block)
    return addGatewayRoute(arg0, builder.build())
}

/**
 * Add a single route to the router.
 *
 * @param id
 * @param props
 */
public inline fun IVirtualRouter.addRoute(
    arg0: String,
    block: RouteBasePropsDsl.() -> Unit = {}
): Route {
    val builder = RouteBasePropsDsl()
    builder.apply(block)
    return addRoute(arg0, builder.build())
}

/**
 * Adds a VirtualGateway to the Mesh.
 *
 * @param id
 * @param props
 */
public inline fun Mesh.addVirtualGateway(
    id: String,
    block: VirtualGatewayBasePropsDsl.() -> Unit = {}
): VirtualGateway {
    val builder = VirtualGatewayBasePropsDsl()
    builder.apply(block)
    return addVirtualGateway(id, builder.build())
}

/**
 * Adds a VirtualNode to the Mesh.
 *
 * @param id
 * @param props
 */
public inline fun Mesh.addVirtualNode(
    id: String,
    block: VirtualNodeBasePropsDsl.() -> Unit = {}
): VirtualNode {
    val builder = VirtualNodeBasePropsDsl()
    builder.apply(block)
    return addVirtualNode(id, builder.build())
}

/**
 * Adds a VirtualRouter to the Mesh with the given id and props.
 *
 * @param id
 * @param props
 */
public inline fun Mesh.addVirtualRouter(
    id: String,
    block: VirtualRouterBasePropsDsl.() -> Unit = {}
): VirtualRouter {
    val builder = VirtualRouterBasePropsDsl()
    builder.apply(block)
    return addVirtualRouter(id, builder.build())
}

/**
 * Utility method to add a new GatewayRoute to the VirtualGateway.
 *
 * @param id
 * @param props
 */
public inline fun VirtualGateway.addGatewayRoute(
    id: String,
    block: GatewayRouteBasePropsDsl.() -> Unit = {}
): GatewayRoute {
    val builder = GatewayRouteBasePropsDsl()
    builder.apply(block)
    return addGatewayRoute(id, builder.build())
}

/**
 * Add a single route to the router.
 *
 * @param id
 * @param props
 */
public inline fun VirtualRouter.addRoute(
    id: String,
    block: RouteBasePropsDsl.() -> Unit = {}
): Route {
    val builder = RouteBasePropsDsl()
    builder.apply(block)
    return addRoute(id, builder.build())
}
