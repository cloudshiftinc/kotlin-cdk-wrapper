@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appmesh

import software.amazon.awscdk.services.appmesh.AccessLogConfig
import software.amazon.awscdk.services.appmesh.BackendConfig
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute
import software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps
import software.amazon.awscdk.services.appmesh.CfnMesh
import software.amazon.awscdk.services.appmesh.CfnMeshProps
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.CfnRouteProps
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps
import software.amazon.awscdk.services.appmesh.CfnVirtualService
import software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps
import software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions
import software.amazon.awscdk.services.appmesh.GatewayRoute
import software.amazon.awscdk.services.appmesh.GatewayRouteAttributes
import software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps
import software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig
import software.amazon.awscdk.services.appmesh.GatewayRouteProps
import software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig
import software.amazon.awscdk.services.appmesh.GrpcConnectionPool
import software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions
import software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch
import software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions
import software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions
import software.amazon.awscdk.services.appmesh.GrpcRetryPolicy
import software.amazon.awscdk.services.appmesh.GrpcRouteMatch
import software.amazon.awscdk.services.appmesh.GrpcRouteSpecOptions
import software.amazon.awscdk.services.appmesh.GrpcTimeout
import software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions
import software.amazon.awscdk.services.appmesh.HeaderMatchConfig
import software.amazon.awscdk.services.appmesh.HealthCheckBindOptions
import software.amazon.awscdk.services.appmesh.HealthCheckConfig
import software.amazon.awscdk.services.appmesh.Http2ConnectionPool
import software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions
import software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions
import software.amazon.awscdk.services.appmesh.HttpConnectionPool
import software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions
import software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch
import software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatchConfig
import software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions
import software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions
import software.amazon.awscdk.services.appmesh.HttpRetryPolicy
import software.amazon.awscdk.services.appmesh.HttpRouteMatch
import software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig
import software.amazon.awscdk.services.appmesh.HttpRouteSpecOptions
import software.amazon.awscdk.services.appmesh.HttpTimeout
import software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import software.amazon.awscdk.services.appmesh.LoggingFormatConfig
import software.amazon.awscdk.services.appmesh.Mesh
import software.amazon.awscdk.services.appmesh.MeshProps
import software.amazon.awscdk.services.appmesh.MeshServiceDiscovery
import software.amazon.awscdk.services.appmesh.MutualTlsValidation
import software.amazon.awscdk.services.appmesh.OutlierDetection
import software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig
import software.amazon.awscdk.services.appmesh.Route
import software.amazon.awscdk.services.appmesh.RouteAttributes
import software.amazon.awscdk.services.appmesh.RouteBaseProps
import software.amazon.awscdk.services.appmesh.RouteProps
import software.amazon.awscdk.services.appmesh.RouteSpecConfig
import software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase
import software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig
import software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig
import software.amazon.awscdk.services.appmesh.TcpConnectionPool
import software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions
import software.amazon.awscdk.services.appmesh.TcpRouteSpecOptions
import software.amazon.awscdk.services.appmesh.TcpTimeout
import software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions
import software.amazon.awscdk.services.appmesh.TlsCertificateConfig
import software.amazon.awscdk.services.appmesh.TlsClientPolicy
import software.amazon.awscdk.services.appmesh.TlsValidation
import software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig
import software.amazon.awscdk.services.appmesh.VirtualGateway
import software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes
import software.amazon.awscdk.services.appmesh.VirtualGatewayBaseProps
import software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig
import software.amazon.awscdk.services.appmesh.VirtualGatewayProps
import software.amazon.awscdk.services.appmesh.VirtualNode
import software.amazon.awscdk.services.appmesh.VirtualNodeAttributes
import software.amazon.awscdk.services.appmesh.VirtualNodeBaseProps
import software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig
import software.amazon.awscdk.services.appmesh.VirtualNodeProps
import software.amazon.awscdk.services.appmesh.VirtualRouter
import software.amazon.awscdk.services.appmesh.VirtualRouterAttributes
import software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps
import software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig
import software.amazon.awscdk.services.appmesh.VirtualRouterProps
import software.amazon.awscdk.services.appmesh.VirtualService
import software.amazon.awscdk.services.appmesh.VirtualServiceAttributes
import software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions
import software.amazon.awscdk.services.appmesh.VirtualServiceProps
import software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig
import software.amazon.awscdk.services.appmesh.WeightedTarget
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object appmesh {
    public inline fun accessLogConfig(block: AccessLogConfigDsl.() -> Unit = {}): AccessLogConfig {
        val builder = AccessLogConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun backendConfig(block: BackendConfigDsl.() -> Unit = {}): BackendConfig {
        val builder = BackendConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun backendDefaults(block: BackendDefaultsDsl.() -> Unit = {}): BackendDefaults {
        val builder = BackendDefaultsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRoute(
        scope: Construct,
        id: String,
        block: CfnGatewayRouteDsl.() -> Unit = {},
    ): CfnGatewayRoute {
        val builder = CfnGatewayRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGatewayRouteHostnameMatchProperty(
        block: CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GatewayRouteHostnameMatchProperty {
        val builder = CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGatewayRouteHostnameRewriteProperty(
        block: CfnGatewayRouteGatewayRouteHostnameRewritePropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GatewayRouteHostnameRewriteProperty {
        val builder = CfnGatewayRouteGatewayRouteHostnameRewritePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGatewayRouteMetadataMatchProperty(
        block: CfnGatewayRouteGatewayRouteMetadataMatchPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GatewayRouteMetadataMatchProperty {
        val builder = CfnGatewayRouteGatewayRouteMetadataMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGatewayRouteRangeMatchProperty(
        block: CfnGatewayRouteGatewayRouteRangeMatchPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GatewayRouteRangeMatchProperty {
        val builder = CfnGatewayRouteGatewayRouteRangeMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGatewayRouteSpecProperty(
        block: CfnGatewayRouteGatewayRouteSpecPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GatewayRouteSpecProperty {
        val builder = CfnGatewayRouteGatewayRouteSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGatewayRouteTargetProperty(
        block: CfnGatewayRouteGatewayRouteTargetPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GatewayRouteTargetProperty {
        val builder = CfnGatewayRouteGatewayRouteTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGatewayRouteVirtualServiceProperty(
        block: CfnGatewayRouteGatewayRouteVirtualServicePropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GatewayRouteVirtualServiceProperty {
        val builder = CfnGatewayRouteGatewayRouteVirtualServicePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGrpcGatewayRouteActionProperty(
        block: CfnGatewayRouteGrpcGatewayRouteActionPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GrpcGatewayRouteActionProperty {
        val builder = CfnGatewayRouteGrpcGatewayRouteActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGrpcGatewayRouteMatchProperty(
        block: CfnGatewayRouteGrpcGatewayRouteMatchPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GrpcGatewayRouteMatchProperty {
        val builder = CfnGatewayRouteGrpcGatewayRouteMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGrpcGatewayRouteMetadataProperty(
        block: CfnGatewayRouteGrpcGatewayRouteMetadataPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GrpcGatewayRouteMetadataProperty {
        val builder = CfnGatewayRouteGrpcGatewayRouteMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGrpcGatewayRouteProperty(
        block: CfnGatewayRouteGrpcGatewayRoutePropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GrpcGatewayRouteProperty {
        val builder = CfnGatewayRouteGrpcGatewayRoutePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteGrpcGatewayRouteRewriteProperty(
        block: CfnGatewayRouteGrpcGatewayRouteRewritePropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.GrpcGatewayRouteRewriteProperty {
        val builder = CfnGatewayRouteGrpcGatewayRouteRewritePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteHttpGatewayRouteActionProperty(
        block: CfnGatewayRouteHttpGatewayRouteActionPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.HttpGatewayRouteActionProperty {
        val builder = CfnGatewayRouteHttpGatewayRouteActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteHttpGatewayRouteHeaderMatchProperty(
        block: CfnGatewayRouteHttpGatewayRouteHeaderMatchPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty {
        val builder = CfnGatewayRouteHttpGatewayRouteHeaderMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteHttpGatewayRouteHeaderProperty(
        block: CfnGatewayRouteHttpGatewayRouteHeaderPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.HttpGatewayRouteHeaderProperty {
        val builder = CfnGatewayRouteHttpGatewayRouteHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteHttpGatewayRouteMatchProperty(
        block: CfnGatewayRouteHttpGatewayRouteMatchPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.HttpGatewayRouteMatchProperty {
        val builder = CfnGatewayRouteHttpGatewayRouteMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteHttpGatewayRoutePathRewriteProperty(
        block: CfnGatewayRouteHttpGatewayRoutePathRewritePropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty {
        val builder = CfnGatewayRouteHttpGatewayRoutePathRewritePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteHttpGatewayRoutePrefixRewriteProperty(
        block: CfnGatewayRouteHttpGatewayRoutePrefixRewritePropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty {
        val builder = CfnGatewayRouteHttpGatewayRoutePrefixRewritePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteHttpGatewayRouteProperty(
        block: CfnGatewayRouteHttpGatewayRoutePropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.HttpGatewayRouteProperty {
        val builder = CfnGatewayRouteHttpGatewayRoutePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteHttpGatewayRouteRewriteProperty(
        block: CfnGatewayRouteHttpGatewayRouteRewritePropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.HttpGatewayRouteRewriteProperty {
        val builder = CfnGatewayRouteHttpGatewayRouteRewritePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteHttpPathMatchProperty(
        block: CfnGatewayRouteHttpPathMatchPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.HttpPathMatchProperty {
        val builder = CfnGatewayRouteHttpPathMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteHttpQueryParameterMatchProperty(
        block: CfnGatewayRouteHttpQueryParameterMatchPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.HttpQueryParameterMatchProperty {
        val builder = CfnGatewayRouteHttpQueryParameterMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteProps(block: CfnGatewayRoutePropsDsl.() -> Unit = {}): CfnGatewayRouteProps {
        val builder = CfnGatewayRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnGatewayRouteQueryParameterProperty(
        block: CfnGatewayRouteQueryParameterPropertyDsl.() -> Unit =
            {},
    ): CfnGatewayRoute.QueryParameterProperty {
        val builder = CfnGatewayRouteQueryParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMesh(
        scope: Construct,
        id: String,
        block: CfnMeshDsl.() -> Unit = {},
    ): CfnMesh {
        val builder = CfnMeshDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMeshEgressFilterProperty(
        block: CfnMeshEgressFilterPropertyDsl.() -> Unit =
            {},
    ): CfnMesh.EgressFilterProperty {
        val builder = CfnMeshEgressFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMeshMeshServiceDiscoveryProperty(
        block: CfnMeshMeshServiceDiscoveryPropertyDsl.() -> Unit =
            {},
    ): CfnMesh.MeshServiceDiscoveryProperty {
        val builder = CfnMeshMeshServiceDiscoveryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMeshMeshSpecProperty(block: CfnMeshMeshSpecPropertyDsl.() -> Unit = {}): CfnMesh.MeshSpecProperty {
        val builder = CfnMeshMeshSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnMeshProps(block: CfnMeshPropsDsl.() -> Unit = {}): CfnMeshProps {
        val builder = CfnMeshPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRoute(
        scope: Construct,
        id: String,
        block: CfnRouteDsl.() -> Unit = {},
    ): CfnRoute {
        val builder = CfnRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteDurationProperty(block: CfnRouteDurationPropertyDsl.() -> Unit = {}): CfnRoute.DurationProperty {
        val builder = CfnRouteDurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteGrpcRetryPolicyProperty(
        block: CfnRouteGrpcRetryPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.GrpcRetryPolicyProperty {
        val builder = CfnRouteGrpcRetryPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteGrpcRouteActionProperty(
        block: CfnRouteGrpcRouteActionPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.GrpcRouteActionProperty {
        val builder = CfnRouteGrpcRouteActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteGrpcRouteMatchProperty(
        block: CfnRouteGrpcRouteMatchPropertyDsl.() -> Unit = {
        },
    ): CfnRoute.GrpcRouteMatchProperty {
        val builder = CfnRouteGrpcRouteMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteGrpcRouteMetadataMatchMethodProperty(
        block: CfnRouteGrpcRouteMetadataMatchMethodPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.GrpcRouteMetadataMatchMethodProperty {
        val builder = CfnRouteGrpcRouteMetadataMatchMethodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteGrpcRouteMetadataProperty(
        block: CfnRouteGrpcRouteMetadataPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.GrpcRouteMetadataProperty {
        val builder = CfnRouteGrpcRouteMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteGrpcRouteProperty(block: CfnRouteGrpcRoutePropertyDsl.() -> Unit = {}): CfnRoute.GrpcRouteProperty {
        val builder = CfnRouteGrpcRoutePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteGrpcTimeoutProperty(
        block: CfnRouteGrpcTimeoutPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.GrpcTimeoutProperty {
        val builder = CfnRouteGrpcTimeoutPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteHeaderMatchMethodProperty(
        block: CfnRouteHeaderMatchMethodPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.HeaderMatchMethodProperty {
        val builder = CfnRouteHeaderMatchMethodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteHttpPathMatchProperty(
        block: CfnRouteHttpPathMatchPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.HttpPathMatchProperty {
        val builder = CfnRouteHttpPathMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteHttpQueryParameterMatchProperty(
        block: CfnRouteHttpQueryParameterMatchPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.HttpQueryParameterMatchProperty {
        val builder = CfnRouteHttpQueryParameterMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteHttpRetryPolicyProperty(
        block: CfnRouteHttpRetryPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.HttpRetryPolicyProperty {
        val builder = CfnRouteHttpRetryPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteHttpRouteActionProperty(
        block: CfnRouteHttpRouteActionPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.HttpRouteActionProperty {
        val builder = CfnRouteHttpRouteActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteHttpRouteHeaderProperty(
        block: CfnRouteHttpRouteHeaderPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.HttpRouteHeaderProperty {
        val builder = CfnRouteHttpRouteHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteHttpRouteMatchProperty(
        block: CfnRouteHttpRouteMatchPropertyDsl.() -> Unit = {
        },
    ): CfnRoute.HttpRouteMatchProperty {
        val builder = CfnRouteHttpRouteMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteHttpRouteProperty(block: CfnRouteHttpRoutePropertyDsl.() -> Unit = {}): CfnRoute.HttpRouteProperty {
        val builder = CfnRouteHttpRoutePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteHttpTimeoutProperty(
        block: CfnRouteHttpTimeoutPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.HttpTimeoutProperty {
        val builder = CfnRouteHttpTimeoutPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteMatchRangeProperty(
        block: CfnRouteMatchRangePropertyDsl.() -> Unit =
            {},
    ): CfnRoute.MatchRangeProperty {
        val builder = CfnRouteMatchRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteProps(block: CfnRoutePropsDsl.() -> Unit = {}): CfnRouteProps {
        val builder = CfnRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteQueryParameterProperty(
        block: CfnRouteQueryParameterPropertyDsl.() -> Unit = {
        },
    ): CfnRoute.QueryParameterProperty {
        val builder = CfnRouteQueryParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteRouteSpecProperty(block: CfnRouteRouteSpecPropertyDsl.() -> Unit = {}): CfnRoute.RouteSpecProperty {
        val builder = CfnRouteRouteSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteTcpRouteActionProperty(
        block: CfnRouteTcpRouteActionPropertyDsl.() -> Unit = {
        },
    ): CfnRoute.TcpRouteActionProperty {
        val builder = CfnRouteTcpRouteActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteTcpRouteMatchProperty(
        block: CfnRouteTcpRouteMatchPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.TcpRouteMatchProperty {
        val builder = CfnRouteTcpRouteMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteTcpRouteProperty(block: CfnRouteTcpRoutePropertyDsl.() -> Unit = {}): CfnRoute.TcpRouteProperty {
        val builder = CfnRouteTcpRoutePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteTcpTimeoutProperty(
        block: CfnRouteTcpTimeoutPropertyDsl.() -> Unit =
            {},
    ): CfnRoute.TcpTimeoutProperty {
        val builder = CfnRouteTcpTimeoutPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRouteWeightedTargetProperty(
        block: CfnRouteWeightedTargetPropertyDsl.() -> Unit = {
        },
    ): CfnRoute.WeightedTargetProperty {
        val builder = CfnRouteWeightedTargetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGateway(
        scope: Construct,
        id: String,
        block: CfnVirtualGatewayDsl.() -> Unit = {},
    ): CfnVirtualGateway {
        val builder = CfnVirtualGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayJsonFormatRefProperty(
        block: CfnVirtualGatewayJsonFormatRefPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.JsonFormatRefProperty {
        val builder = CfnVirtualGatewayJsonFormatRefPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayLoggingFormatProperty(
        block: CfnVirtualGatewayLoggingFormatPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.LoggingFormatProperty {
        val builder = CfnVirtualGatewayLoggingFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayProps(block: CfnVirtualGatewayPropsDsl.() -> Unit = {}): CfnVirtualGatewayProps {
        val builder = CfnVirtualGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewaySubjectAlternativeNameMatchersProperty(
        block: CfnVirtualGatewaySubjectAlternativeNameMatchersPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.SubjectAlternativeNameMatchersProperty {
        val builder = CfnVirtualGatewaySubjectAlternativeNameMatchersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewaySubjectAlternativeNamesProperty(
        block: CfnVirtualGatewaySubjectAlternativeNamesPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.SubjectAlternativeNamesProperty {
        val builder = CfnVirtualGatewaySubjectAlternativeNamesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayAccessLogProperty(
        block: CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayAccessLogProperty {
        val builder = CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayBackendDefaultsProperty(
        block: CfnVirtualGatewayVirtualGatewayBackendDefaultsPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty {
        val builder = CfnVirtualGatewayVirtualGatewayBackendDefaultsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayClientPolicyProperty(
        block: CfnVirtualGatewayVirtualGatewayClientPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayClientPolicyProperty {
        val builder = CfnVirtualGatewayVirtualGatewayClientPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayClientPolicyTlsProperty(
        block: CfnVirtualGatewayVirtualGatewayClientPolicyTlsPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty {
        val builder = CfnVirtualGatewayVirtualGatewayClientPolicyTlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayClientTlsCertificateProperty(
        block: CfnVirtualGatewayVirtualGatewayClientTlsCertificatePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty {
        val builder = CfnVirtualGatewayVirtualGatewayClientTlsCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayConnectionPoolProperty(
        block: CfnVirtualGatewayVirtualGatewayConnectionPoolPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayConnectionPoolProperty {
        val builder = CfnVirtualGatewayVirtualGatewayConnectionPoolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayFileAccessLogProperty(
        block: CfnVirtualGatewayVirtualGatewayFileAccessLogPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayFileAccessLogProperty {
        val builder = CfnVirtualGatewayVirtualGatewayFileAccessLogPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayGrpcConnectionPoolProperty(
        block: CfnVirtualGatewayVirtualGatewayGrpcConnectionPoolPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty {
        val builder = CfnVirtualGatewayVirtualGatewayGrpcConnectionPoolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayHealthCheckPolicyProperty(
        block: CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty {
        val builder = CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayHttp2ConnectionPoolProperty(
        block: CfnVirtualGatewayVirtualGatewayHttp2ConnectionPoolPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty {
        val builder = CfnVirtualGatewayVirtualGatewayHttp2ConnectionPoolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayHttpConnectionPoolProperty(
        block: CfnVirtualGatewayVirtualGatewayHttpConnectionPoolPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty {
        val builder = CfnVirtualGatewayVirtualGatewayHttpConnectionPoolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayListenerProperty(
        block: CfnVirtualGatewayVirtualGatewayListenerPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayListenerProperty {
        val builder = CfnVirtualGatewayVirtualGatewayListenerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayListenerTlsAcmCertificateProperty(
        block: CfnVirtualGatewayVirtualGatewayListenerTlsAcmCertificatePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty {
        val builder = CfnVirtualGatewayVirtualGatewayListenerTlsAcmCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayListenerTlsCertificateProperty(
        block: CfnVirtualGatewayVirtualGatewayListenerTlsCertificatePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty {
        val builder = CfnVirtualGatewayVirtualGatewayListenerTlsCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayListenerTlsFileCertificateProperty(
        block: CfnVirtualGatewayVirtualGatewayListenerTlsFileCertificatePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty {
        val builder = CfnVirtualGatewayVirtualGatewayListenerTlsFileCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayListenerTlsProperty(
        block: CfnVirtualGatewayVirtualGatewayListenerTlsPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayListenerTlsProperty {
        val builder = CfnVirtualGatewayVirtualGatewayListenerTlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayListenerTlsSdsCertificateProperty(
        block: CfnVirtualGatewayVirtualGatewayListenerTlsSdsCertificatePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty {
        val builder = CfnVirtualGatewayVirtualGatewayListenerTlsSdsCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayListenerTlsValidationContextProperty(
        block: CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty {
        val builder = CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayListenerTlsValidationContextTrustProperty(
        block: CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextTrustPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty {
        val builder = CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextTrustPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayLoggingProperty(
        block: CfnVirtualGatewayVirtualGatewayLoggingPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayLoggingProperty {
        val builder = CfnVirtualGatewayVirtualGatewayLoggingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayPortMappingProperty(
        block: CfnVirtualGatewayVirtualGatewayPortMappingPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayPortMappingProperty {
        val builder = CfnVirtualGatewayVirtualGatewayPortMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewaySpecProperty(
        block: CfnVirtualGatewayVirtualGatewaySpecPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewaySpecProperty {
        val builder = CfnVirtualGatewayVirtualGatewaySpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayTlsValidationContextAcmTrustProperty(
        block: CfnVirtualGatewayVirtualGatewayTlsValidationContextAcmTrustPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty {
        val builder = CfnVirtualGatewayVirtualGatewayTlsValidationContextAcmTrustPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayTlsValidationContextFileTrustProperty(
        block: CfnVirtualGatewayVirtualGatewayTlsValidationContextFileTrustPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty {
        val builder = CfnVirtualGatewayVirtualGatewayTlsValidationContextFileTrustPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayTlsValidationContextProperty(
        block: CfnVirtualGatewayVirtualGatewayTlsValidationContextPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty {
        val builder = CfnVirtualGatewayVirtualGatewayTlsValidationContextPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayTlsValidationContextSdsTrustProperty(
        block: CfnVirtualGatewayVirtualGatewayTlsValidationContextSdsTrustPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty {
        val builder = CfnVirtualGatewayVirtualGatewayTlsValidationContextSdsTrustPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualGatewayVirtualGatewayTlsValidationContextTrustProperty(
        block: CfnVirtualGatewayVirtualGatewayTlsValidationContextTrustPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty {
        val builder = CfnVirtualGatewayVirtualGatewayTlsValidationContextTrustPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNode(
        scope: Construct,
        id: String,
        block: CfnVirtualNodeDsl.() -> Unit = {},
    ): CfnVirtualNode {
        val builder = CfnVirtualNodeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeAccessLogProperty(
        block: CfnVirtualNodeAccessLogPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.AccessLogProperty {
        val builder = CfnVirtualNodeAccessLogPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeAwsCloudMapInstanceAttributeProperty(
        block: CfnVirtualNodeAwsCloudMapInstanceAttributePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.AwsCloudMapInstanceAttributeProperty {
        val builder = CfnVirtualNodeAwsCloudMapInstanceAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeAwsCloudMapServiceDiscoveryProperty(
        block: CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty {
        val builder = CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeBackendDefaultsProperty(
        block: CfnVirtualNodeBackendDefaultsPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.BackendDefaultsProperty {
        val builder = CfnVirtualNodeBackendDefaultsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeBackendProperty(
        block: CfnVirtualNodeBackendPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.BackendProperty {
        val builder = CfnVirtualNodeBackendPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeClientPolicyProperty(
        block: CfnVirtualNodeClientPolicyPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ClientPolicyProperty {
        val builder = CfnVirtualNodeClientPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeClientPolicyTlsProperty(
        block: CfnVirtualNodeClientPolicyTlsPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ClientPolicyTlsProperty {
        val builder = CfnVirtualNodeClientPolicyTlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeClientTlsCertificateProperty(
        block: CfnVirtualNodeClientTlsCertificatePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ClientTlsCertificateProperty {
        val builder = CfnVirtualNodeClientTlsCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeDnsServiceDiscoveryProperty(
        block: CfnVirtualNodeDnsServiceDiscoveryPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.DnsServiceDiscoveryProperty {
        val builder = CfnVirtualNodeDnsServiceDiscoveryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeDurationProperty(
        block: CfnVirtualNodeDurationPropertyDsl.() -> Unit = {
        },
    ): CfnVirtualNode.DurationProperty {
        val builder = CfnVirtualNodeDurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeFileAccessLogProperty(
        block: CfnVirtualNodeFileAccessLogPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.FileAccessLogProperty {
        val builder = CfnVirtualNodeFileAccessLogPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeGrpcTimeoutProperty(
        block: CfnVirtualNodeGrpcTimeoutPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.GrpcTimeoutProperty {
        val builder = CfnVirtualNodeGrpcTimeoutPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeHealthCheckProperty(
        block: CfnVirtualNodeHealthCheckPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.HealthCheckProperty {
        val builder = CfnVirtualNodeHealthCheckPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeHttpTimeoutProperty(
        block: CfnVirtualNodeHttpTimeoutPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.HttpTimeoutProperty {
        val builder = CfnVirtualNodeHttpTimeoutPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeJsonFormatRefProperty(
        block: CfnVirtualNodeJsonFormatRefPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.JsonFormatRefProperty {
        val builder = CfnVirtualNodeJsonFormatRefPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeListenerProperty(
        block: CfnVirtualNodeListenerPropertyDsl.() -> Unit = {
        },
    ): CfnVirtualNode.ListenerProperty {
        val builder = CfnVirtualNodeListenerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeListenerTimeoutProperty(
        block: CfnVirtualNodeListenerTimeoutPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ListenerTimeoutProperty {
        val builder = CfnVirtualNodeListenerTimeoutPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeListenerTlsAcmCertificateProperty(
        block: CfnVirtualNodeListenerTlsAcmCertificatePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ListenerTlsAcmCertificateProperty {
        val builder = CfnVirtualNodeListenerTlsAcmCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeListenerTlsCertificateProperty(
        block: CfnVirtualNodeListenerTlsCertificatePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ListenerTlsCertificateProperty {
        val builder = CfnVirtualNodeListenerTlsCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeListenerTlsFileCertificateProperty(
        block: CfnVirtualNodeListenerTlsFileCertificatePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ListenerTlsFileCertificateProperty {
        val builder = CfnVirtualNodeListenerTlsFileCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeListenerTlsProperty(
        block: CfnVirtualNodeListenerTlsPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ListenerTlsProperty {
        val builder = CfnVirtualNodeListenerTlsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeListenerTlsSdsCertificateProperty(
        block: CfnVirtualNodeListenerTlsSdsCertificatePropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ListenerTlsSdsCertificateProperty {
        val builder = CfnVirtualNodeListenerTlsSdsCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeListenerTlsValidationContextProperty(
        block: CfnVirtualNodeListenerTlsValidationContextPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ListenerTlsValidationContextProperty {
        val builder = CfnVirtualNodeListenerTlsValidationContextPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeListenerTlsValidationContextTrustProperty(
        block: CfnVirtualNodeListenerTlsValidationContextTrustPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ListenerTlsValidationContextTrustProperty {
        val builder = CfnVirtualNodeListenerTlsValidationContextTrustPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeLoggingFormatProperty(
        block: CfnVirtualNodeLoggingFormatPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.LoggingFormatProperty {
        val builder = CfnVirtualNodeLoggingFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeLoggingProperty(
        block: CfnVirtualNodeLoggingPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.LoggingProperty {
        val builder = CfnVirtualNodeLoggingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeOutlierDetectionProperty(
        block: CfnVirtualNodeOutlierDetectionPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.OutlierDetectionProperty {
        val builder = CfnVirtualNodeOutlierDetectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodePortMappingProperty(
        block: CfnVirtualNodePortMappingPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.PortMappingProperty {
        val builder = CfnVirtualNodePortMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeProps(block: CfnVirtualNodePropsDsl.() -> Unit = {}): CfnVirtualNodeProps {
        val builder = CfnVirtualNodePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeServiceDiscoveryProperty(
        block: CfnVirtualNodeServiceDiscoveryPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.ServiceDiscoveryProperty {
        val builder = CfnVirtualNodeServiceDiscoveryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeSubjectAlternativeNameMatchersProperty(
        block: CfnVirtualNodeSubjectAlternativeNameMatchersPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.SubjectAlternativeNameMatchersProperty {
        val builder = CfnVirtualNodeSubjectAlternativeNameMatchersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeSubjectAlternativeNamesProperty(
        block: CfnVirtualNodeSubjectAlternativeNamesPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.SubjectAlternativeNamesProperty {
        val builder = CfnVirtualNodeSubjectAlternativeNamesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeTcpTimeoutProperty(
        block: CfnVirtualNodeTcpTimeoutPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.TcpTimeoutProperty {
        val builder = CfnVirtualNodeTcpTimeoutPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeTlsValidationContextAcmTrustProperty(
        block: CfnVirtualNodeTlsValidationContextAcmTrustPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.TlsValidationContextAcmTrustProperty {
        val builder = CfnVirtualNodeTlsValidationContextAcmTrustPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeTlsValidationContextFileTrustProperty(
        block: CfnVirtualNodeTlsValidationContextFileTrustPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.TlsValidationContextFileTrustProperty {
        val builder = CfnVirtualNodeTlsValidationContextFileTrustPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeTlsValidationContextProperty(
        block: CfnVirtualNodeTlsValidationContextPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.TlsValidationContextProperty {
        val builder = CfnVirtualNodeTlsValidationContextPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeTlsValidationContextSdsTrustProperty(
        block: CfnVirtualNodeTlsValidationContextSdsTrustPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.TlsValidationContextSdsTrustProperty {
        val builder = CfnVirtualNodeTlsValidationContextSdsTrustPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeTlsValidationContextTrustProperty(
        block: CfnVirtualNodeTlsValidationContextTrustPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.TlsValidationContextTrustProperty {
        val builder = CfnVirtualNodeTlsValidationContextTrustPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeVirtualNodeConnectionPoolProperty(
        block: CfnVirtualNodeVirtualNodeConnectionPoolPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.VirtualNodeConnectionPoolProperty {
        val builder = CfnVirtualNodeVirtualNodeConnectionPoolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeVirtualNodeGrpcConnectionPoolProperty(
        block: CfnVirtualNodeVirtualNodeGrpcConnectionPoolPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty {
        val builder = CfnVirtualNodeVirtualNodeGrpcConnectionPoolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeVirtualNodeHttp2ConnectionPoolProperty(
        block: CfnVirtualNodeVirtualNodeHttp2ConnectionPoolPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty {
        val builder = CfnVirtualNodeVirtualNodeHttp2ConnectionPoolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeVirtualNodeHttpConnectionPoolProperty(
        block: CfnVirtualNodeVirtualNodeHttpConnectionPoolPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty {
        val builder = CfnVirtualNodeVirtualNodeHttpConnectionPoolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeVirtualNodeSpecProperty(
        block: CfnVirtualNodeVirtualNodeSpecPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.VirtualNodeSpecProperty {
        val builder = CfnVirtualNodeVirtualNodeSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeVirtualNodeTcpConnectionPoolProperty(
        block: CfnVirtualNodeVirtualNodeTcpConnectionPoolPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty {
        val builder = CfnVirtualNodeVirtualNodeTcpConnectionPoolPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualNodeVirtualServiceBackendProperty(
        block: CfnVirtualNodeVirtualServiceBackendPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualNode.VirtualServiceBackendProperty {
        val builder = CfnVirtualNodeVirtualServiceBackendPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualRouter(
        scope: Construct,
        id: String,
        block: CfnVirtualRouterDsl.() -> Unit = {},
    ): CfnVirtualRouter {
        val builder = CfnVirtualRouterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualRouterPortMappingProperty(
        block: CfnVirtualRouterPortMappingPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualRouter.PortMappingProperty {
        val builder = CfnVirtualRouterPortMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualRouterProps(block: CfnVirtualRouterPropsDsl.() -> Unit = {}): CfnVirtualRouterProps {
        val builder = CfnVirtualRouterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualRouterVirtualRouterListenerProperty(
        block: CfnVirtualRouterVirtualRouterListenerPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualRouter.VirtualRouterListenerProperty {
        val builder = CfnVirtualRouterVirtualRouterListenerPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualRouterVirtualRouterSpecProperty(
        block: CfnVirtualRouterVirtualRouterSpecPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualRouter.VirtualRouterSpecProperty {
        val builder = CfnVirtualRouterVirtualRouterSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualService(
        scope: Construct,
        id: String,
        block: CfnVirtualServiceDsl.() -> Unit = {},
    ): CfnVirtualService {
        val builder = CfnVirtualServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualServiceProps(block: CfnVirtualServicePropsDsl.() -> Unit = {}): CfnVirtualServiceProps {
        val builder = CfnVirtualServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualServiceVirtualNodeServiceProviderProperty(
        block: CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualService.VirtualNodeServiceProviderProperty {
        val builder = CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualServiceVirtualRouterServiceProviderProperty(
        block: CfnVirtualServiceVirtualRouterServiceProviderPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualService.VirtualRouterServiceProviderProperty {
        val builder = CfnVirtualServiceVirtualRouterServiceProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualServiceVirtualServiceProviderProperty(
        block: CfnVirtualServiceVirtualServiceProviderPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualService.VirtualServiceProviderProperty {
        val builder = CfnVirtualServiceVirtualServiceProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnVirtualServiceVirtualServiceSpecProperty(
        block: CfnVirtualServiceVirtualServiceSpecPropertyDsl.() -> Unit =
            {},
    ): CfnVirtualService.VirtualServiceSpecProperty {
        val builder = CfnVirtualServiceVirtualServiceSpecPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun commonGatewayRouteSpecOptions(
        block: CommonGatewayRouteSpecOptionsDsl.() -> Unit =
            {},
    ): CommonGatewayRouteSpecOptions {
        val builder = CommonGatewayRouteSpecOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gatewayRoute(
        scope: Construct,
        id: String,
        block: GatewayRouteDsl.() -> Unit = {},
    ): GatewayRoute {
        val builder = GatewayRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun gatewayRouteAttributes(block: GatewayRouteAttributesDsl.() -> Unit = {}): GatewayRouteAttributes {
        val builder = GatewayRouteAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gatewayRouteBaseProps(block: GatewayRouteBasePropsDsl.() -> Unit = {}): GatewayRouteBaseProps {
        val builder = GatewayRouteBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gatewayRouteHostnameMatchConfig(
        block: GatewayRouteHostnameMatchConfigDsl.() -> Unit =
            {},
    ): GatewayRouteHostnameMatchConfig {
        val builder = GatewayRouteHostnameMatchConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gatewayRouteProps(block: GatewayRoutePropsDsl.() -> Unit = {}): GatewayRouteProps {
        val builder = GatewayRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun gatewayRouteSpecConfig(block: GatewayRouteSpecConfigDsl.() -> Unit = {}): GatewayRouteSpecConfig {
        val builder = GatewayRouteSpecConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun grpcConnectionPool(block: GrpcConnectionPoolDsl.() -> Unit = {}): GrpcConnectionPool {
        val builder = GrpcConnectionPoolDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun grpcGatewayListenerOptions(
        block: GrpcGatewayListenerOptionsDsl.() -> Unit =
            {},
    ): GrpcGatewayListenerOptions {
        val builder = GrpcGatewayListenerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun grpcGatewayRouteMatch(block: GrpcGatewayRouteMatchDsl.() -> Unit = {}): GrpcGatewayRouteMatch {
        val builder = GrpcGatewayRouteMatchDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun grpcGatewayRouteSpecOptions(
        block: GrpcGatewayRouteSpecOptionsDsl.() -> Unit =
            {},
    ): GrpcGatewayRouteSpecOptions {
        val builder = GrpcGatewayRouteSpecOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun grpcHealthCheckOptions(block: GrpcHealthCheckOptionsDsl.() -> Unit = {}): GrpcHealthCheckOptions {
        val builder = GrpcHealthCheckOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun grpcRetryPolicy(block: GrpcRetryPolicyDsl.() -> Unit = {}): GrpcRetryPolicy {
        val builder = GrpcRetryPolicyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun grpcRouteMatch(block: GrpcRouteMatchDsl.() -> Unit = {}): GrpcRouteMatch {
        val builder = GrpcRouteMatchDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun grpcRouteSpecOptions(block: GrpcRouteSpecOptionsDsl.() -> Unit = {}): GrpcRouteSpecOptions {
        val builder = GrpcRouteSpecOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun grpcTimeout(block: GrpcTimeoutDsl.() -> Unit = {}): GrpcTimeout {
        val builder = GrpcTimeoutDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun grpcVirtualNodeListenerOptions(block: GrpcVirtualNodeListenerOptionsDsl.() -> Unit = {}): GrpcVirtualNodeListenerOptions {
        val builder = GrpcVirtualNodeListenerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun headerMatchConfig(block: HeaderMatchConfigDsl.() -> Unit = {}): HeaderMatchConfig {
        val builder = HeaderMatchConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun healthCheckBindOptions(block: HealthCheckBindOptionsDsl.() -> Unit = {}): HealthCheckBindOptions {
        val builder = HealthCheckBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun healthCheckConfig(block: HealthCheckConfigDsl.() -> Unit = {}): HealthCheckConfig {
        val builder = HealthCheckConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun http2ConnectionPool(block: Http2ConnectionPoolDsl.() -> Unit = {}): Http2ConnectionPool {
        val builder = Http2ConnectionPoolDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun http2GatewayListenerOptions(
        block: Http2GatewayListenerOptionsDsl.() -> Unit =
            {},
    ): Http2GatewayListenerOptions {
        val builder = Http2GatewayListenerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun http2VirtualNodeListenerOptions(
        block: Http2VirtualNodeListenerOptionsDsl.() -> Unit =
            {},
    ): Http2VirtualNodeListenerOptions {
        val builder = Http2VirtualNodeListenerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpConnectionPool(block: HttpConnectionPoolDsl.() -> Unit = {}): HttpConnectionPool {
        val builder = HttpConnectionPoolDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpGatewayListenerOptions(
        block: HttpGatewayListenerOptionsDsl.() -> Unit =
            {},
    ): HttpGatewayListenerOptions {
        val builder = HttpGatewayListenerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpGatewayRouteMatch(block: HttpGatewayRouteMatchDsl.() -> Unit = {}): HttpGatewayRouteMatch {
        val builder = HttpGatewayRouteMatchDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpGatewayRoutePathMatchConfig(
        block: HttpGatewayRoutePathMatchConfigDsl.() -> Unit =
            {},
    ): HttpGatewayRoutePathMatchConfig {
        val builder = HttpGatewayRoutePathMatchConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpGatewayRouteSpecOptions(
        block: HttpGatewayRouteSpecOptionsDsl.() -> Unit =
            {},
    ): HttpGatewayRouteSpecOptions {
        val builder = HttpGatewayRouteSpecOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpHealthCheckOptions(block: HttpHealthCheckOptionsDsl.() -> Unit = {}): HttpHealthCheckOptions {
        val builder = HttpHealthCheckOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpRetryPolicy(block: HttpRetryPolicyDsl.() -> Unit = {}): HttpRetryPolicy {
        val builder = HttpRetryPolicyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpRouteMatch(block: HttpRouteMatchDsl.() -> Unit = {}): HttpRouteMatch {
        val builder = HttpRouteMatchDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpRoutePathMatchConfig(block: HttpRoutePathMatchConfigDsl.() -> Unit = {}): HttpRoutePathMatchConfig {
        val builder = HttpRoutePathMatchConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpRouteSpecOptions(block: HttpRouteSpecOptionsDsl.() -> Unit = {}): HttpRouteSpecOptions {
        val builder = HttpRouteSpecOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpTimeout(block: HttpTimeoutDsl.() -> Unit = {}): HttpTimeout {
        val builder = HttpTimeoutDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun httpVirtualNodeListenerOptions(block: HttpVirtualNodeListenerOptionsDsl.() -> Unit = {}): HttpVirtualNodeListenerOptions {
        val builder = HttpVirtualNodeListenerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun listenerTlsOptions(block: ListenerTlsOptionsDsl.() -> Unit = {}): ListenerTlsOptions {
        val builder = ListenerTlsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun loggingFormatConfig(block: LoggingFormatConfigDsl.() -> Unit = {}): LoggingFormatConfig {
        val builder = LoggingFormatConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun mesh(
        scope: Construct,
        id: String,
        block: MeshDsl.() -> Unit = {},
    ): Mesh {
        val builder = MeshDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun meshProps(block: MeshPropsDsl.() -> Unit = {}): MeshProps {
        val builder = MeshPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun meshServiceDiscovery(block: MeshServiceDiscoveryDsl.() -> Unit = {}): MeshServiceDiscovery {
        val builder = MeshServiceDiscoveryDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun mutualTlsValidation(block: MutualTlsValidationDsl.() -> Unit = {}): MutualTlsValidation {
        val builder = MutualTlsValidationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun outlierDetection(block: OutlierDetectionDsl.() -> Unit = {}): OutlierDetection {
        val builder = OutlierDetectionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun queryParameterMatchConfig(block: QueryParameterMatchConfigDsl.() -> Unit = {}): QueryParameterMatchConfig {
        val builder = QueryParameterMatchConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun route(
        scope: Construct,
        id: String,
        block: RouteDsl.() -> Unit = {},
    ): Route {
        val builder = RouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun routeAttributes(block: RouteAttributesDsl.() -> Unit = {}): RouteAttributes {
        val builder = RouteAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun routeBaseProps(block: RouteBasePropsDsl.() -> Unit = {}): RouteBaseProps {
        val builder = RouteBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun routeProps(block: RoutePropsDsl.() -> Unit = {}): RouteProps {
        val builder = RoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun routeSpecConfig(block: RouteSpecConfigDsl.() -> Unit = {}): RouteSpecConfig {
        val builder = RouteSpecConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun routeSpecOptionsBase(block: RouteSpecOptionsBaseDsl.() -> Unit = {}): RouteSpecOptionsBase {
        val builder = RouteSpecOptionsBaseDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun serviceDiscoveryConfig(block: ServiceDiscoveryConfigDsl.() -> Unit = {}): ServiceDiscoveryConfig {
        val builder = ServiceDiscoveryConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun subjectAlternativeNamesMatcherConfig(
        block: SubjectAlternativeNamesMatcherConfigDsl.() -> Unit =
            {},
    ): SubjectAlternativeNamesMatcherConfig {
        val builder = SubjectAlternativeNamesMatcherConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tcpConnectionPool(block: TcpConnectionPoolDsl.() -> Unit = {}): TcpConnectionPool {
        val builder = TcpConnectionPoolDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tcpHealthCheckOptions(block: TcpHealthCheckOptionsDsl.() -> Unit = {}): TcpHealthCheckOptions {
        val builder = TcpHealthCheckOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tcpRouteSpecOptions(block: TcpRouteSpecOptionsDsl.() -> Unit = {}): TcpRouteSpecOptions {
        val builder = TcpRouteSpecOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tcpTimeout(block: TcpTimeoutDsl.() -> Unit = {}): TcpTimeout {
        val builder = TcpTimeoutDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tcpVirtualNodeListenerOptions(
        block: TcpVirtualNodeListenerOptionsDsl.() -> Unit =
            {},
    ): TcpVirtualNodeListenerOptions {
        val builder = TcpVirtualNodeListenerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tlsCertificateConfig(block: TlsCertificateConfigDsl.() -> Unit = {}): TlsCertificateConfig {
        val builder = TlsCertificateConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tlsClientPolicy(block: TlsClientPolicyDsl.() -> Unit = {}): TlsClientPolicy {
        val builder = TlsClientPolicyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tlsValidation(block: TlsValidationDsl.() -> Unit = {}): TlsValidation {
        val builder = TlsValidationDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tlsValidationTrustConfig(block: TlsValidationTrustConfigDsl.() -> Unit = {}): TlsValidationTrustConfig {
        val builder = TlsValidationTrustConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualGateway(
        scope: Construct,
        id: String,
        block: VirtualGatewayDsl.() -> Unit = {},
    ): VirtualGateway {
        val builder = VirtualGatewayDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualGatewayAttributes(block: VirtualGatewayAttributesDsl.() -> Unit = {}): VirtualGatewayAttributes {
        val builder = VirtualGatewayAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualGatewayBaseProps(block: VirtualGatewayBasePropsDsl.() -> Unit = {}): VirtualGatewayBaseProps {
        val builder = VirtualGatewayBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualGatewayListenerConfig(
        block: VirtualGatewayListenerConfigDsl.() -> Unit =
            {},
    ): VirtualGatewayListenerConfig {
        val builder = VirtualGatewayListenerConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualGatewayProps(block: VirtualGatewayPropsDsl.() -> Unit = {}): VirtualGatewayProps {
        val builder = VirtualGatewayPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualNode(
        scope: Construct,
        id: String,
        block: VirtualNodeDsl.() -> Unit = {},
    ): VirtualNode {
        val builder = VirtualNodeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualNodeAttributes(block: VirtualNodeAttributesDsl.() -> Unit = {}): VirtualNodeAttributes {
        val builder = VirtualNodeAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualNodeBaseProps(block: VirtualNodeBasePropsDsl.() -> Unit = {}): VirtualNodeBaseProps {
        val builder = VirtualNodeBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualNodeListenerConfig(block: VirtualNodeListenerConfigDsl.() -> Unit = {}): VirtualNodeListenerConfig {
        val builder = VirtualNodeListenerConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualNodeProps(block: VirtualNodePropsDsl.() -> Unit = {}): VirtualNodeProps {
        val builder = VirtualNodePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualRouter(
        scope: Construct,
        id: String,
        block: VirtualRouterDsl.() -> Unit = {},
    ): VirtualRouter {
        val builder = VirtualRouterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualRouterAttributes(block: VirtualRouterAttributesDsl.() -> Unit = {}): VirtualRouterAttributes {
        val builder = VirtualRouterAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualRouterBaseProps(block: VirtualRouterBasePropsDsl.() -> Unit = {}): VirtualRouterBaseProps {
        val builder = VirtualRouterBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualRouterListenerConfig(
        block: VirtualRouterListenerConfigDsl.() -> Unit =
            {},
    ): VirtualRouterListenerConfig {
        val builder = VirtualRouterListenerConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualRouterProps(block: VirtualRouterPropsDsl.() -> Unit = {}): VirtualRouterProps {
        val builder = VirtualRouterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualService(
        scope: Construct,
        id: String,
        block: VirtualServiceDsl.() -> Unit = {},
    ): VirtualService {
        val builder = VirtualServiceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualServiceAttributes(block: VirtualServiceAttributesDsl.() -> Unit = {}): VirtualServiceAttributes {
        val builder = VirtualServiceAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualServiceBackendOptions(
        block: VirtualServiceBackendOptionsDsl.() -> Unit =
            {},
    ): VirtualServiceBackendOptions {
        val builder = VirtualServiceBackendOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualServiceProps(block: VirtualServicePropsDsl.() -> Unit = {}): VirtualServiceProps {
        val builder = VirtualServicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun virtualServiceProviderConfig(
        block: VirtualServiceProviderConfigDsl.() -> Unit =
            {},
    ): VirtualServiceProviderConfig {
        val builder = VirtualServiceProviderConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun weightedTarget(block: WeightedTargetDsl.() -> Unit = {}): WeightedTarget {
        val builder = WeightedTargetDsl()
        builder.apply(block)
        return builder.build()
    }
}
