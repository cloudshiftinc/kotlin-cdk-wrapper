@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import kotlin.String
import kotlin.Unit
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

public object appmesh {
  /**
   * All Properties for Envoy Access logs for mesh endpoints.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * AccessLogConfig accessLogConfig = AccessLogConfig.builder()
   * .virtualGatewayAccessLog(VirtualGatewayAccessLogProperty.builder()
   * .file(VirtualGatewayFileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .virtualNodeAccessLog(AccessLogProperty.builder()
   * .file(FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun accessLogConfig(block: AccessLogConfigDsl.() -> Unit = {}): AccessLogConfig {
    val builder = AccessLogConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a backend.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * BackendConfig backendConfig = BackendConfig.builder()
   * .virtualServiceBackend(BackendProperty.builder()
   * .virtualService(VirtualServiceBackendProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun backendConfig(block: BackendConfigDsl.() -> Unit = {}): BackendConfig {
    val builder = BackendConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the properties needed to define backend defaults.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * Service service;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(8080)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .healthyThreshold(3)
   * .interval(Duration.seconds(5))
   * .path("/ping")
   * .timeout(Duration.seconds(2))
   * .unhealthyThreshold(2)
   * .build()))
   * .timeout(HttpTimeout.builder()
   * .idle(Duration.seconds(5))
   * .build())
   * .build())))
   * .backendDefaults(BackendDefaults.builder()
   * .tlsClientPolicy(TlsClientPolicy.builder()
   * .validation(TlsValidation.builder()
   * .trust(TlsValidationTrust.file("/keys/local_cert_chain.pem"))
   * .build())
   * .build())
   * .build())
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .build();
   * Tags.of(node).add("Environment", "Dev");
   * ```
   */
  public inline fun backendDefaults(block: BackendDefaultsDsl.() -> Unit = {}): BackendDefaults {
    val builder = BackendDefaultsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a gateway route.
   *
   * A gateway route is attached to a virtual gateway and routes traffic to an existing virtual
   * service. If a route matches a request, it can distribute traffic to a target virtual service.
   *
   * For more information about gateway routes, see [Gateway
   * routes](https://docs.aws.amazon.com/app-mesh/latest/userguide/gateway-routes.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnGatewayRoute cfnGatewayRoute = CfnGatewayRoute.Builder.create(this, "MyCfnGatewayRoute")
   * .meshName("meshName")
   * .spec(GatewayRouteSpecProperty.builder()
   * .grpcRoute(GrpcGatewayRouteProperty.builder()
   * .action(GrpcGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build())
   * .build())
   * .match(GrpcGatewayRouteMatchProperty.builder()
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * .build())
   * .http2Route(HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .build())
   * .build())
   * .httpRoute(HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .build())
   * .build())
   * .priority(123)
   * .build())
   * .virtualGatewayName("virtualGatewayName")
   * // the properties below are optional
   * .gatewayRouteName("gatewayRouteName")
   * .meshOwner("meshOwner")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html)
   */
  public inline fun cfnGatewayRoute(
    scope: Construct,
    id: String,
    block: CfnGatewayRouteDsl.() -> Unit = {},
  ): CfnGatewayRoute {
    val builder = CfnGatewayRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the gateway route host name to match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GatewayRouteHostnameMatchProperty gatewayRouteHostnameMatchProperty =
   * GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamematch.html)
   */
  public inline
      fun cfnGatewayRouteGatewayRouteHostnameMatchProperty(block: CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GatewayRouteHostnameMatchProperty {
    val builder = CfnGatewayRouteGatewayRouteHostnameMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the gateway route host name to rewrite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GatewayRouteHostnameRewriteProperty gatewayRouteHostnameRewriteProperty =
   * GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutehostnamerewrite.html)
   */
  public inline
      fun cfnGatewayRouteGatewayRouteHostnameRewriteProperty(block: CfnGatewayRouteGatewayRouteHostnameRewritePropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GatewayRouteHostnameRewriteProperty {
    val builder = CfnGatewayRouteGatewayRouteHostnameRewritePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the method header to be matched.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GatewayRouteMetadataMatchProperty gatewayRouteMetadataMatchProperty =
   * GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html)
   */
  public inline
      fun cfnGatewayRouteGatewayRouteMetadataMatchProperty(block: CfnGatewayRouteGatewayRouteMetadataMatchPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GatewayRouteMetadataMatchProperty {
    val builder = CfnGatewayRouteGatewayRouteMetadataMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the range of values to match on.
   *
   * The first character of the range is included in the range, though the last character is not.
   * For example, if the range specified were 1-100, only values 1-99 would be matched.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GatewayRouteRangeMatchProperty gatewayRouteRangeMatchProperty =
   * GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayrouterangematch.html)
   */
  public inline
      fun cfnGatewayRouteGatewayRouteRangeMatchProperty(block: CfnGatewayRouteGatewayRouteRangeMatchPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GatewayRouteRangeMatchProperty {
    val builder = CfnGatewayRouteGatewayRouteRangeMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a gateway route specification.
   *
   * Specify one gateway route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GatewayRouteSpecProperty gatewayRouteSpecProperty = GatewayRouteSpecProperty.builder()
   * .grpcRoute(GrpcGatewayRouteProperty.builder()
   * .action(GrpcGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build())
   * .build())
   * .match(GrpcGatewayRouteMatchProperty.builder()
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * .build())
   * .http2Route(HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .build())
   * .build())
   * .httpRoute(HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .build())
   * .build())
   * .priority(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutespec.html)
   */
  public inline
      fun cfnGatewayRouteGatewayRouteSpecProperty(block: CfnGatewayRouteGatewayRouteSpecPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GatewayRouteSpecProperty {
    val builder = CfnGatewayRouteGatewayRouteSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a gateway route target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GatewayRouteTargetProperty gatewayRouteTargetProperty = GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutetarget.html)
   */
  public inline
      fun cfnGatewayRouteGatewayRouteTargetProperty(block: CfnGatewayRouteGatewayRouteTargetPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GatewayRouteTargetProperty {
    val builder = CfnGatewayRouteGatewayRouteTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the virtual service that traffic is routed to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GatewayRouteVirtualServiceProperty gatewayRouteVirtualServiceProperty =
   * GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutevirtualservice.html)
   */
  public inline
      fun cfnGatewayRouteGatewayRouteVirtualServiceProperty(block: CfnGatewayRouteGatewayRouteVirtualServicePropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GatewayRouteVirtualServiceProperty {
    val builder = CfnGatewayRouteGatewayRouteVirtualServicePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the action to take if a match is determined.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcGatewayRouteActionProperty grpcGatewayRouteActionProperty =
   * GrpcGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouteaction.html)
   */
  public inline
      fun cfnGatewayRouteGrpcGatewayRouteActionProperty(block: CfnGatewayRouteGrpcGatewayRouteActionPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GrpcGatewayRouteActionProperty {
    val builder = CfnGatewayRouteGrpcGatewayRouteActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the criteria for determining a request match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcGatewayRouteMatchProperty grpcGatewayRouteMatchProperty =
   * GrpcGatewayRouteMatchProperty.builder()
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .port(123)
   * .serviceName("serviceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html)
   */
  public inline
      fun cfnGatewayRouteGrpcGatewayRouteMatchProperty(block: CfnGatewayRouteGrpcGatewayRouteMatchPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GrpcGatewayRouteMatchProperty {
    val builder = CfnGatewayRouteGrpcGatewayRouteMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the metadata of the gateway route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcGatewayRouteMetadataProperty grpcGatewayRouteMetadataProperty =
   * GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutemetadata.html)
   */
  public inline
      fun cfnGatewayRouteGrpcGatewayRouteMetadataProperty(block: CfnGatewayRouteGrpcGatewayRouteMetadataPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GrpcGatewayRouteMetadataProperty {
    val builder = CfnGatewayRouteGrpcGatewayRouteMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a gRPC gateway route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcGatewayRouteProperty grpcGatewayRouteProperty = GrpcGatewayRouteProperty.builder()
   * .action(GrpcGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build())
   * .build())
   * .match(GrpcGatewayRouteMatchProperty.builder()
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroute.html)
   */
  public inline
      fun cfnGatewayRouteGrpcGatewayRouteProperty(block: CfnGatewayRouteGrpcGatewayRoutePropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GrpcGatewayRouteProperty {
    val builder = CfnGatewayRouteGrpcGatewayRoutePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the gateway route to rewrite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcGatewayRouteRewriteProperty grpcGatewayRouteRewriteProperty =
   * GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayrouterewrite.html)
   */
  public inline
      fun cfnGatewayRouteGrpcGatewayRouteRewriteProperty(block: CfnGatewayRouteGrpcGatewayRouteRewritePropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.GrpcGatewayRouteRewriteProperty {
    val builder = CfnGatewayRouteGrpcGatewayRouteRewritePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the action to take if a match is determined.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpGatewayRouteActionProperty httpGatewayRouteActionProperty =
   * HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteaction.html)
   */
  public inline
      fun cfnGatewayRouteHttpGatewayRouteActionProperty(block: CfnGatewayRouteHttpGatewayRouteActionPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.HttpGatewayRouteActionProperty {
    val builder = CfnGatewayRouteHttpGatewayRouteActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the method and value to match with the header value sent in a
   * request.
   *
   * Specify one match method.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpGatewayRouteHeaderMatchProperty httpGatewayRouteHeaderMatchProperty =
   * HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheadermatch.html)
   */
  public inline
      fun cfnGatewayRouteHttpGatewayRouteHeaderMatchProperty(block: CfnGatewayRouteHttpGatewayRouteHeaderMatchPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty {
    val builder = CfnGatewayRouteHttpGatewayRouteHeaderMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the HTTP header in the gateway route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpGatewayRouteHeaderProperty httpGatewayRouteHeaderProperty =
   * HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheader.html)
   */
  public inline
      fun cfnGatewayRouteHttpGatewayRouteHeaderProperty(block: CfnGatewayRouteHttpGatewayRouteHeaderPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.HttpGatewayRouteHeaderProperty {
    val builder = CfnGatewayRouteHttpGatewayRouteHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the criteria for determining a request match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpGatewayRouteMatchProperty httpGatewayRouteMatchProperty =
   * HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html)
   */
  public inline
      fun cfnGatewayRouteHttpGatewayRouteMatchProperty(block: CfnGatewayRouteHttpGatewayRouteMatchPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.HttpGatewayRouteMatchProperty {
    val builder = CfnGatewayRouteHttpGatewayRouteMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the path to rewrite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpGatewayRoutePathRewriteProperty httpGatewayRoutePathRewriteProperty =
   * HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutepathrewrite.html)
   */
  public inline
      fun cfnGatewayRouteHttpGatewayRoutePathRewriteProperty(block: CfnGatewayRouteHttpGatewayRoutePathRewritePropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty {
    val builder = CfnGatewayRouteHttpGatewayRoutePathRewritePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the beginning characters of the route to rewrite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpGatewayRoutePrefixRewriteProperty httpGatewayRoutePrefixRewriteProperty =
   * HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteprefixrewrite.html)
   */
  public inline
      fun cfnGatewayRouteHttpGatewayRoutePrefixRewriteProperty(block: CfnGatewayRouteHttpGatewayRoutePrefixRewritePropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty {
    val builder = CfnGatewayRouteHttpGatewayRoutePrefixRewritePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents an HTTP gateway route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpGatewayRouteProperty httpGatewayRouteProperty = HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroute.html)
   */
  public inline
      fun cfnGatewayRouteHttpGatewayRouteProperty(block: CfnGatewayRouteHttpGatewayRoutePropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.HttpGatewayRouteProperty {
    val builder = CfnGatewayRouteHttpGatewayRoutePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the gateway route to rewrite.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpGatewayRouteRewriteProperty httpGatewayRouteRewriteProperty =
   * HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouterewrite.html)
   */
  public inline
      fun cfnGatewayRouteHttpGatewayRouteRewriteProperty(block: CfnGatewayRouteHttpGatewayRouteRewritePropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.HttpGatewayRouteRewriteProperty {
    val builder = CfnGatewayRouteHttpGatewayRouteRewritePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the path to match in the request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpPathMatchProperty httpPathMatchProperty = HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httppathmatch.html)
   */
  public inline
      fun cfnGatewayRouteHttpPathMatchProperty(block: CfnGatewayRouteHttpPathMatchPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.HttpPathMatchProperty {
    val builder = CfnGatewayRouteHttpPathMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the query parameter to match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpQueryParameterMatchProperty httpQueryParameterMatchProperty =
   * HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpqueryparametermatch.html)
   */
  public inline
      fun cfnGatewayRouteHttpQueryParameterMatchProperty(block: CfnGatewayRouteHttpQueryParameterMatchPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.HttpQueryParameterMatchProperty {
    val builder = CfnGatewayRouteHttpQueryParameterMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnGatewayRoute`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnGatewayRouteProps cfnGatewayRouteProps = CfnGatewayRouteProps.builder()
   * .meshName("meshName")
   * .spec(GatewayRouteSpecProperty.builder()
   * .grpcRoute(GrpcGatewayRouteProperty.builder()
   * .action(GrpcGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build())
   * .build())
   * .match(GrpcGatewayRouteMatchProperty.builder()
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * .build())
   * .http2Route(HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .build())
   * .build())
   * .httpRoute(HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .build())
   * .build())
   * .priority(123)
   * .build())
   * .virtualGatewayName("virtualGatewayName")
   * // the properties below are optional
   * .gatewayRouteName("gatewayRouteName")
   * .meshOwner("meshOwner")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html)
   */
  public inline fun cfnGatewayRouteProps(block: CfnGatewayRoutePropsDsl.() -> Unit = {}):
      CfnGatewayRouteProps {
    val builder = CfnGatewayRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the query parameter in the request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * QueryParameterProperty queryParameterProperty = QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-queryparameter.html)
   */
  public inline
      fun cfnGatewayRouteQueryParameterProperty(block: CfnGatewayRouteQueryParameterPropertyDsl.() -> Unit
      = {}): CfnGatewayRoute.QueryParameterProperty {
    val builder = CfnGatewayRouteQueryParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a service mesh.
   *
   * A service mesh is a logical boundary for network traffic between services that are represented
   * by resources within the mesh. After you create your service mesh, you can create virtual services,
   * virtual nodes, virtual routers, and routes to distribute traffic between the applications in your
   * mesh.
   *
   * For more information about service meshes, see [Service
   * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/meshes.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnMesh cfnMesh = CfnMesh.Builder.create(this, "MyCfnMesh")
   * .meshName("meshName")
   * .spec(MeshSpecProperty.builder()
   * .egressFilter(EgressFilterProperty.builder()
   * .type("type")
   * .build())
   * .serviceDiscovery(MeshServiceDiscoveryProperty.builder()
   * .ipPreference("ipPreference")
   * .build())
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html)
   */
  public inline fun cfnMesh(
    scope: Construct,
    id: String,
    block: CfnMeshDsl.() -> Unit = {},
  ): CfnMesh {
    val builder = CfnMeshDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the egress filter rules for a service mesh.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * EgressFilterProperty egressFilterProperty = EgressFilterProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-egressfilter.html)
   */
  public inline fun cfnMeshEgressFilterProperty(block: CfnMeshEgressFilterPropertyDsl.() -> Unit =
      {}): CfnMesh.EgressFilterProperty {
    val builder = CfnMeshEgressFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the service discovery information for a service mesh.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * MeshServiceDiscoveryProperty meshServiceDiscoveryProperty =
   * MeshServiceDiscoveryProperty.builder()
   * .ipPreference("ipPreference")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshservicediscovery.html)
   */
  public inline
      fun cfnMeshMeshServiceDiscoveryProperty(block: CfnMeshMeshServiceDiscoveryPropertyDsl.() -> Unit
      = {}): CfnMesh.MeshServiceDiscoveryProperty {
    val builder = CfnMeshMeshServiceDiscoveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the specification of a service mesh.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * MeshSpecProperty meshSpecProperty = MeshSpecProperty.builder()
   * .egressFilter(EgressFilterProperty.builder()
   * .type("type")
   * .build())
   * .serviceDiscovery(MeshServiceDiscoveryProperty.builder()
   * .ipPreference("ipPreference")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshspec.html)
   */
  public inline fun cfnMeshMeshSpecProperty(block: CfnMeshMeshSpecPropertyDsl.() -> Unit = {}):
      CfnMesh.MeshSpecProperty {
    val builder = CfnMeshMeshSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnMesh`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnMeshProps cfnMeshProps = CfnMeshProps.builder()
   * .meshName("meshName")
   * .spec(MeshSpecProperty.builder()
   * .egressFilter(EgressFilterProperty.builder()
   * .type("type")
   * .build())
   * .serviceDiscovery(MeshServiceDiscoveryProperty.builder()
   * .ipPreference("ipPreference")
   * .build())
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html)
   */
  public inline fun cfnMeshProps(block: CfnMeshPropsDsl.() -> Unit = {}): CfnMeshProps {
    val builder = CfnMeshPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a route that is associated with a virtual router.
   *
   * You can route several different protocols and define a retry policy for a route. Traffic can be
   * routed to one or more virtual nodes.
   *
   * For more information about routes, see
   * [Routes](https://docs.aws.amazon.com/app-mesh/latest/userguide/routes.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnRoute cfnRoute = CfnRoute.Builder.create(this, "MyCfnRoute")
   * .meshName("meshName")
   * .spec(RouteSpecProperty.builder()
   * .grpcRoute(GrpcRouteProperty.builder()
   * .action(GrpcRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(GrpcRouteMatchProperty.builder()
   * .metadata(List.of(GrpcRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GrpcRouteMetadataMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .methodName("methodName")
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * // the properties below are optional
   * .retryPolicy(GrpcRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .grpcRetryEvents(List.of("grpcRetryEvents"))
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .http2Route(HttpRouteProperty.builder()
   * .action(HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(HttpRouteMatchProperty.builder()
   * .headers(List.of(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .scheme("scheme")
   * .build())
   * // the properties below are optional
   * .retryPolicy(HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .httpRoute(HttpRouteProperty.builder()
   * .action(HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(HttpRouteMatchProperty.builder()
   * .headers(List.of(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .scheme("scheme")
   * .build())
   * // the properties below are optional
   * .retryPolicy(HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .priority(123)
   * .tcpRoute(TcpRouteProperty.builder()
   * .action(TcpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * // the properties below are optional
   * .match(TcpRouteMatchProperty.builder()
   * .port(123)
   * .build())
   * .timeout(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .build())
   * .virtualRouterName("virtualRouterName")
   * // the properties below are optional
   * .meshOwner("meshOwner")
   * .routeName("routeName")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html)
   */
  public inline fun cfnRoute(
    scope: Construct,
    id: String,
    block: CfnRouteDsl.() -> Unit = {},
  ): CfnRoute {
    val builder = CfnRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a duration of time.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * DurationProperty durationProperty = DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-duration.html)
   */
  public inline fun cfnRouteDurationProperty(block: CfnRouteDurationPropertyDsl.() -> Unit = {}):
      CfnRoute.DurationProperty {
    val builder = CfnRouteDurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a retry policy.
   *
   * Specify at least one value for at least one of the types of `RetryEvents` , a value for
   * `maxRetries` , and a value for `perRetryTimeout` . Both `server-error` and `gateway-error` under
   * `httpRetryEvents` include the Envoy `reset` policy. For more information on the `reset` policy,
   * see the [Envoy
   * documentation](https://docs.aws.amazon.com/https://www.envoyproxy.io/docs/envoy/latest/configuration/http/http_filters/router_filter#x-envoy-retry-on)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcRetryPolicyProperty grpcRetryPolicyProperty = GrpcRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .grpcRetryEvents(List.of("grpcRetryEvents"))
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcretrypolicy.html)
   */
  public inline
      fun cfnRouteGrpcRetryPolicyProperty(block: CfnRouteGrpcRetryPolicyPropertyDsl.() -> Unit =
      {}): CfnRoute.GrpcRetryPolicyProperty {
    val builder = CfnRouteGrpcRetryPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the action to take if a match is determined.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcRouteActionProperty grpcRouteActionProperty = GrpcRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcrouteaction.html)
   */
  public inline
      fun cfnRouteGrpcRouteActionProperty(block: CfnRouteGrpcRouteActionPropertyDsl.() -> Unit =
      {}): CfnRoute.GrpcRouteActionProperty {
    val builder = CfnRouteGrpcRouteActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the criteria for determining a request match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcRouteMatchProperty grpcRouteMatchProperty = GrpcRouteMatchProperty.builder()
   * .metadata(List.of(GrpcRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GrpcRouteMetadataMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .methodName("methodName")
   * .port(123)
   * .serviceName("serviceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutematch.html)
   */
  public inline
      fun cfnRouteGrpcRouteMatchProperty(block: CfnRouteGrpcRouteMatchPropertyDsl.() -> Unit = {}):
      CfnRoute.GrpcRouteMatchProperty {
    val builder = CfnRouteGrpcRouteMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the match method.
   *
   * Specify one of the match values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcRouteMetadataMatchMethodProperty grpcRouteMetadataMatchMethodProperty =
   * GrpcRouteMetadataMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadatamatchmethod.html)
   */
  public inline
      fun cfnRouteGrpcRouteMetadataMatchMethodProperty(block: CfnRouteGrpcRouteMetadataMatchMethodPropertyDsl.() -> Unit
      = {}): CfnRoute.GrpcRouteMetadataMatchMethodProperty {
    val builder = CfnRouteGrpcRouteMetadataMatchMethodPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the match metadata for the route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcRouteMetadataProperty grpcRouteMetadataProperty = GrpcRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GrpcRouteMetadataMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroutemetadata.html)
   */
  public inline
      fun cfnRouteGrpcRouteMetadataProperty(block: CfnRouteGrpcRouteMetadataPropertyDsl.() -> Unit =
      {}): CfnRoute.GrpcRouteMetadataProperty {
    val builder = CfnRouteGrpcRouteMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a gRPC route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcRouteProperty grpcRouteProperty = GrpcRouteProperty.builder()
   * .action(GrpcRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(GrpcRouteMatchProperty.builder()
   * .metadata(List.of(GrpcRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GrpcRouteMetadataMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .methodName("methodName")
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * // the properties below are optional
   * .retryPolicy(GrpcRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .grpcRetryEvents(List.of("grpcRetryEvents"))
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpcroute.html)
   */
  public inline fun cfnRouteGrpcRouteProperty(block: CfnRouteGrpcRoutePropertyDsl.() -> Unit = {}):
      CfnRoute.GrpcRouteProperty {
    val builder = CfnRouteGrpcRoutePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents types of timeouts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcTimeoutProperty grpcTimeoutProperty = GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-grpctimeout.html)
   */
  public inline fun cfnRouteGrpcTimeoutProperty(block: CfnRouteGrpcTimeoutPropertyDsl.() -> Unit =
      {}): CfnRoute.GrpcTimeoutProperty {
    val builder = CfnRouteGrpcTimeoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the method and value to match with the header value sent in a
   * request.
   *
   * Specify one match method.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HeaderMatchMethodProperty headerMatchMethodProperty = HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-headermatchmethod.html)
   */
  public inline
      fun cfnRouteHeaderMatchMethodProperty(block: CfnRouteHeaderMatchMethodPropertyDsl.() -> Unit =
      {}): CfnRoute.HeaderMatchMethodProperty {
    val builder = CfnRouteHeaderMatchMethodPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the path to match in the request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpPathMatchProperty httpPathMatchProperty = HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httppathmatch.html)
   */
  public inline fun cfnRouteHttpPathMatchProperty(block: CfnRouteHttpPathMatchPropertyDsl.() -> Unit
      = {}): CfnRoute.HttpPathMatchProperty {
    val builder = CfnRouteHttpPathMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the query parameter to match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpQueryParameterMatchProperty httpQueryParameterMatchProperty =
   * HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpqueryparametermatch.html)
   */
  public inline
      fun cfnRouteHttpQueryParameterMatchProperty(block: CfnRouteHttpQueryParameterMatchPropertyDsl.() -> Unit
      = {}): CfnRoute.HttpQueryParameterMatchProperty {
    val builder = CfnRouteHttpQueryParameterMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a retry policy.
   *
   * Specify at least one value for at least one of the types of `RetryEvents` , a value for
   * `maxRetries` , and a value for `perRetryTimeout` . Both `server-error` and `gateway-error` under
   * `httpRetryEvents` include the Envoy `reset` policy. For more information on the `reset` policy,
   * see the [Envoy
   * documentation](https://docs.aws.amazon.com/https://www.envoyproxy.io/docs/envoy/latest/configuration/http/http_filters/router_filter#x-envoy-retry-on)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpRetryPolicyProperty httpRetryPolicyProperty = HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httpretrypolicy.html)
   */
  public inline
      fun cfnRouteHttpRetryPolicyProperty(block: CfnRouteHttpRetryPolicyPropertyDsl.() -> Unit =
      {}): CfnRoute.HttpRetryPolicyProperty {
    val builder = CfnRouteHttpRetryPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the action to take if a match is determined.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpRouteActionProperty httpRouteActionProperty = HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteaction.html)
   */
  public inline
      fun cfnRouteHttpRouteActionProperty(block: CfnRouteHttpRouteActionPropertyDsl.() -> Unit =
      {}): CfnRoute.HttpRouteActionProperty {
    val builder = CfnRouteHttpRouteActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the HTTP header in the request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpRouteHeaderProperty httpRouteHeaderProperty = HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httprouteheader.html)
   */
  public inline
      fun cfnRouteHttpRouteHeaderProperty(block: CfnRouteHttpRouteHeaderPropertyDsl.() -> Unit =
      {}): CfnRoute.HttpRouteHeaderProperty {
    val builder = CfnRouteHttpRouteHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the requirements for a route to match HTTP requests for a virtual
   * router.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpRouteMatchProperty httpRouteMatchProperty = HttpRouteMatchProperty.builder()
   * .headers(List.of(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .scheme("scheme")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproutematch.html)
   */
  public inline
      fun cfnRouteHttpRouteMatchProperty(block: CfnRouteHttpRouteMatchPropertyDsl.() -> Unit = {}):
      CfnRoute.HttpRouteMatchProperty {
    val builder = CfnRouteHttpRouteMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents an HTTP or HTTP/2 route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpRouteProperty httpRouteProperty = HttpRouteProperty.builder()
   * .action(HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(HttpRouteMatchProperty.builder()
   * .headers(List.of(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .scheme("scheme")
   * .build())
   * // the properties below are optional
   * .retryPolicy(HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httproute.html)
   */
  public inline fun cfnRouteHttpRouteProperty(block: CfnRouteHttpRoutePropertyDsl.() -> Unit = {}):
      CfnRoute.HttpRouteProperty {
    val builder = CfnRouteHttpRoutePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents types of timeouts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpTimeoutProperty httpTimeoutProperty = HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html)
   */
  public inline fun cfnRouteHttpTimeoutProperty(block: CfnRouteHttpTimeoutPropertyDsl.() -> Unit =
      {}): CfnRoute.HttpTimeoutProperty {
    val builder = CfnRouteHttpTimeoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the range of values to match on.
   *
   * The first character of the range is included in the range, though the last character is not.
   * For example, if the range specified were 1-100, only values 1-99 would be matched.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * MatchRangeProperty matchRangeProperty = MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-matchrange.html)
   */
  public inline fun cfnRouteMatchRangeProperty(block: CfnRouteMatchRangePropertyDsl.() -> Unit =
      {}): CfnRoute.MatchRangeProperty {
    val builder = CfnRouteMatchRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRoute`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnRouteProps cfnRouteProps = CfnRouteProps.builder()
   * .meshName("meshName")
   * .spec(RouteSpecProperty.builder()
   * .grpcRoute(GrpcRouteProperty.builder()
   * .action(GrpcRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(GrpcRouteMatchProperty.builder()
   * .metadata(List.of(GrpcRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GrpcRouteMetadataMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .methodName("methodName")
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * // the properties below are optional
   * .retryPolicy(GrpcRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .grpcRetryEvents(List.of("grpcRetryEvents"))
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .http2Route(HttpRouteProperty.builder()
   * .action(HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(HttpRouteMatchProperty.builder()
   * .headers(List.of(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .scheme("scheme")
   * .build())
   * // the properties below are optional
   * .retryPolicy(HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .httpRoute(HttpRouteProperty.builder()
   * .action(HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(HttpRouteMatchProperty.builder()
   * .headers(List.of(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .scheme("scheme")
   * .build())
   * // the properties below are optional
   * .retryPolicy(HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .priority(123)
   * .tcpRoute(TcpRouteProperty.builder()
   * .action(TcpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * // the properties below are optional
   * .match(TcpRouteMatchProperty.builder()
   * .port(123)
   * .build())
   * .timeout(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .build())
   * .virtualRouterName("virtualRouterName")
   * // the properties below are optional
   * .meshOwner("meshOwner")
   * .routeName("routeName")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-route.html)
   */
  public inline fun cfnRouteProps(block: CfnRoutePropsDsl.() -> Unit = {}): CfnRouteProps {
    val builder = CfnRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the query parameter in the request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * QueryParameterProperty queryParameterProperty = QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-queryparameter.html)
   */
  public inline
      fun cfnRouteQueryParameterProperty(block: CfnRouteQueryParameterPropertyDsl.() -> Unit = {}):
      CfnRoute.QueryParameterProperty {
    val builder = CfnRouteQueryParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a route specification.
   *
   * Specify one route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * RouteSpecProperty routeSpecProperty = RouteSpecProperty.builder()
   * .grpcRoute(GrpcRouteProperty.builder()
   * .action(GrpcRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(GrpcRouteMatchProperty.builder()
   * .metadata(List.of(GrpcRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GrpcRouteMetadataMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .methodName("methodName")
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * // the properties below are optional
   * .retryPolicy(GrpcRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .grpcRetryEvents(List.of("grpcRetryEvents"))
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .http2Route(HttpRouteProperty.builder()
   * .action(HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(HttpRouteMatchProperty.builder()
   * .headers(List.of(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .scheme("scheme")
   * .build())
   * // the properties below are optional
   * .retryPolicy(HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .httpRoute(HttpRouteProperty.builder()
   * .action(HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(HttpRouteMatchProperty.builder()
   * .headers(List.of(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .scheme("scheme")
   * .build())
   * // the properties below are optional
   * .retryPolicy(HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .priority(123)
   * .tcpRoute(TcpRouteProperty.builder()
   * .action(TcpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * // the properties below are optional
   * .match(TcpRouteMatchProperty.builder()
   * .port(123)
   * .build())
   * .timeout(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-routespec.html)
   */
  public inline fun cfnRouteRouteSpecProperty(block: CfnRouteRouteSpecPropertyDsl.() -> Unit = {}):
      CfnRoute.RouteSpecProperty {
    val builder = CfnRouteRouteSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the action to take if a match is determined.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TcpRouteActionProperty tcpRouteActionProperty = TcpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcprouteaction.html)
   */
  public inline
      fun cfnRouteTcpRouteActionProperty(block: CfnRouteTcpRouteActionPropertyDsl.() -> Unit = {}):
      CfnRoute.TcpRouteActionProperty {
    val builder = CfnRouteTcpRouteActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing the TCP route to match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TcpRouteMatchProperty tcpRouteMatchProperty = TcpRouteMatchProperty.builder()
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproutematch.html)
   */
  public inline fun cfnRouteTcpRouteMatchProperty(block: CfnRouteTcpRouteMatchPropertyDsl.() -> Unit
      = {}): CfnRoute.TcpRouteMatchProperty {
    val builder = CfnRouteTcpRouteMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a TCP route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TcpRouteProperty tcpRouteProperty = TcpRouteProperty.builder()
   * .action(TcpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * // the properties below are optional
   * .match(TcpRouteMatchProperty.builder()
   * .port(123)
   * .build())
   * .timeout(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcproute.html)
   */
  public inline fun cfnRouteTcpRouteProperty(block: CfnRouteTcpRoutePropertyDsl.() -> Unit = {}):
      CfnRoute.TcpRouteProperty {
    val builder = CfnRouteTcpRoutePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents types of timeouts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TcpTimeoutProperty tcpTimeoutProperty = TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-tcptimeout.html)
   */
  public inline fun cfnRouteTcpTimeoutProperty(block: CfnRouteTcpTimeoutPropertyDsl.() -> Unit =
      {}): CfnRoute.TcpTimeoutProperty {
    val builder = CfnRouteTcpTimeoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a target and its relative weight.
   *
   * Traffic is distributed across targets according to their relative weight. For example, a
   * weighted target with a relative weight of 50 receives five times as much traffic as one with a
   * relative weight of 10. The total weight for all targets combined must be less than or equal to
   * 100.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * WeightedTargetProperty weightedTargetProperty = WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-weightedtarget.html)
   */
  public inline
      fun cfnRouteWeightedTargetProperty(block: CfnRouteWeightedTargetPropertyDsl.() -> Unit = {}):
      CfnRoute.WeightedTargetProperty {
    val builder = CfnRouteWeightedTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a virtual gateway.
   *
   * A virtual gateway allows resources outside your mesh to communicate to resources that are
   * inside your mesh. The virtual gateway represents an Envoy proxy running in an Amazon ECS task, in
   * a Kubernetes service, or on an Amazon EC2 instance. Unlike a virtual node, which represents an
   * Envoy running with an application, a virtual gateway represents Envoy deployed by itself.
   *
   * For more information about virtual gateways, see [Virtual
   * gateways](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_gateways.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnVirtualGateway cfnVirtualGateway = CfnVirtualGateway.Builder.create(this,
   * "MyCfnVirtualGateway")
   * .meshName("meshName")
   * .spec(VirtualGatewaySpecProperty.builder()
   * .listeners(List.of(VirtualGatewayListenerProperty.builder()
   * .portMapping(VirtualGatewayPortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualGatewayConnectionPoolProperty.builder()
   * .grpc(VirtualGatewayGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualGatewayHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualGatewayHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .build())
   * .healthCheck(VirtualGatewayHealthCheckPolicyProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .tls(VirtualGatewayListenerTlsProperty.builder()
   * .certificate(VirtualGatewayListenerTlsCertificateProperty.builder()
   * .acm(VirtualGatewayListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(VirtualGatewayListenerTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build()))
   * // the properties below are optional
   * .backendDefaults(VirtualGatewayBackendDefaultsProperty.builder()
   * .clientPolicy(VirtualGatewayClientPolicyProperty.builder()
   * .tls(VirtualGatewayClientPolicyTlsProperty.builder()
   * .validation(VirtualGatewayTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayTlsValidationContextTrustProperty.builder()
   * .acm(VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(VirtualGatewayClientTlsCertificateProperty.builder()
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .logging(VirtualGatewayLoggingProperty.builder()
   * .accessLog(VirtualGatewayAccessLogProperty.builder()
   * .file(VirtualGatewayFileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .meshOwner("meshOwner")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .virtualGatewayName("virtualGatewayName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html)
   */
  public inline fun cfnVirtualGateway(
    scope: Construct,
    id: String,
    block: CfnVirtualGatewayDsl.() -> Unit = {},
  ): CfnVirtualGateway {
    val builder = CfnVirtualGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the key value pairs for the JSON.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * JsonFormatRefProperty jsonFormatRefProperty = JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-jsonformatref.html)
   */
  public inline
      fun cfnVirtualGatewayJsonFormatRefProperty(block: CfnVirtualGatewayJsonFormatRefPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.JsonFormatRefProperty {
    val builder = CfnVirtualGatewayJsonFormatRefPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the format for the logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * LoggingFormatProperty loggingFormatProperty = LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-loggingformat.html)
   */
  public inline
      fun cfnVirtualGatewayLoggingFormatProperty(block: CfnVirtualGatewayLoggingFormatPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.LoggingFormatProperty {
    val builder = CfnVirtualGatewayLoggingFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnVirtualGateway`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnVirtualGatewayProps cfnVirtualGatewayProps = CfnVirtualGatewayProps.builder()
   * .meshName("meshName")
   * .spec(VirtualGatewaySpecProperty.builder()
   * .listeners(List.of(VirtualGatewayListenerProperty.builder()
   * .portMapping(VirtualGatewayPortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualGatewayConnectionPoolProperty.builder()
   * .grpc(VirtualGatewayGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualGatewayHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualGatewayHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .build())
   * .healthCheck(VirtualGatewayHealthCheckPolicyProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .tls(VirtualGatewayListenerTlsProperty.builder()
   * .certificate(VirtualGatewayListenerTlsCertificateProperty.builder()
   * .acm(VirtualGatewayListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(VirtualGatewayListenerTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build()))
   * // the properties below are optional
   * .backendDefaults(VirtualGatewayBackendDefaultsProperty.builder()
   * .clientPolicy(VirtualGatewayClientPolicyProperty.builder()
   * .tls(VirtualGatewayClientPolicyTlsProperty.builder()
   * .validation(VirtualGatewayTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayTlsValidationContextTrustProperty.builder()
   * .acm(VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(VirtualGatewayClientTlsCertificateProperty.builder()
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .logging(VirtualGatewayLoggingProperty.builder()
   * .accessLog(VirtualGatewayAccessLogProperty.builder()
   * .file(VirtualGatewayFileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .meshOwner("meshOwner")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .virtualGatewayName("virtualGatewayName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html)
   */
  public inline fun cfnVirtualGatewayProps(block: CfnVirtualGatewayPropsDsl.() -> Unit = {}):
      CfnVirtualGatewayProps {
    val builder = CfnVirtualGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the methods by which a subject alternative name on a peer Transport
   * Layer Security (TLS) certificate can be matched.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * SubjectAlternativeNameMatchersProperty subjectAlternativeNameMatchersProperty =
   * SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-subjectalternativenamematchers.html)
   */
  public inline
      fun cfnVirtualGatewaySubjectAlternativeNameMatchersProperty(block: CfnVirtualGatewaySubjectAlternativeNameMatchersPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.SubjectAlternativeNameMatchersProperty {
    val builder = CfnVirtualGatewaySubjectAlternativeNameMatchersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the subject alternative names secured by the certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * SubjectAlternativeNamesProperty subjectAlternativeNamesProperty =
   * SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-subjectalternativenames.html)
   */
  public inline
      fun cfnVirtualGatewaySubjectAlternativeNamesProperty(block: CfnVirtualGatewaySubjectAlternativeNamesPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.SubjectAlternativeNamesProperty {
    val builder = CfnVirtualGatewaySubjectAlternativeNamesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The access log configuration for a virtual gateway.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayAccessLogProperty virtualGatewayAccessLogProperty =
   * VirtualGatewayAccessLogProperty.builder()
   * .file(VirtualGatewayFileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayaccesslog.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayAccessLogProperty(block: CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayAccessLogProperty {
    val builder = CfnVirtualGatewayVirtualGatewayAccessLogPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the default properties for a backend.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayBackendDefaultsProperty virtualGatewayBackendDefaultsProperty =
   * VirtualGatewayBackendDefaultsProperty.builder()
   * .clientPolicy(VirtualGatewayClientPolicyProperty.builder()
   * .tls(VirtualGatewayClientPolicyTlsProperty.builder()
   * .validation(VirtualGatewayTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayTlsValidationContextTrustProperty.builder()
   * .acm(VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(VirtualGatewayClientTlsCertificateProperty.builder()
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaybackenddefaults.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayBackendDefaultsProperty(block: CfnVirtualGatewayVirtualGatewayBackendDefaultsPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty {
    val builder = CfnVirtualGatewayVirtualGatewayBackendDefaultsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a client policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayClientPolicyProperty virtualGatewayClientPolicyProperty =
   * VirtualGatewayClientPolicyProperty.builder()
   * .tls(VirtualGatewayClientPolicyTlsProperty.builder()
   * .validation(VirtualGatewayTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayTlsValidationContextTrustProperty.builder()
   * .acm(VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(VirtualGatewayClientTlsCertificateProperty.builder()
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicy.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayClientPolicyProperty(block: CfnVirtualGatewayVirtualGatewayClientPolicyPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayClientPolicyProperty {
    val builder = CfnVirtualGatewayVirtualGatewayClientPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a Transport Layer Security (TLS) client policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayClientPolicyTlsProperty virtualGatewayClientPolicyTlsProperty =
   * VirtualGatewayClientPolicyTlsProperty.builder()
   * .validation(VirtualGatewayTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayTlsValidationContextTrustProperty.builder()
   * .acm(VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(VirtualGatewayClientTlsCertificateProperty.builder()
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicytls.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayClientPolicyTlsProperty(block: CfnVirtualGatewayVirtualGatewayClientPolicyTlsPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty {
    val builder = CfnVirtualGatewayVirtualGatewayClientPolicyTlsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the virtual gateway's client's Transport Layer Security (TLS)
   * certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayClientTlsCertificateProperty virtualGatewayClientTlsCertificateProperty =
   * VirtualGatewayClientTlsCertificateProperty.builder()
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclienttlscertificate.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayClientTlsCertificateProperty(block: CfnVirtualGatewayVirtualGatewayClientTlsCertificatePropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty {
    val builder = CfnVirtualGatewayVirtualGatewayClientTlsCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the type of virtual gateway connection pool.
   *
   * Only one protocol is used at a time and should be the same protocol as the one chosen under
   * port mapping.
   *
   * If not present the default value for `maxPendingRequests` is `2147483647` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayConnectionPoolProperty virtualGatewayConnectionPoolProperty =
   * VirtualGatewayConnectionPoolProperty.builder()
   * .grpc(VirtualGatewayGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualGatewayHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualGatewayHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayconnectionpool.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayConnectionPoolProperty(block: CfnVirtualGatewayVirtualGatewayConnectionPoolPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayConnectionPoolProperty {
    val builder = CfnVirtualGatewayVirtualGatewayConnectionPoolPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents an access log file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayFileAccessLogProperty virtualGatewayFileAccessLogProperty =
   * VirtualGatewayFileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayfileaccesslog.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayFileAccessLogProperty(block: CfnVirtualGatewayVirtualGatewayFileAccessLogPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayFileAccessLogProperty {
    val builder = CfnVirtualGatewayVirtualGatewayFileAccessLogPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayGrpcConnectionPoolProperty virtualGatewayGrpcConnectionPoolProperty =
   * VirtualGatewayGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaygrpcconnectionpool.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayGrpcConnectionPoolProperty(block: CfnVirtualGatewayVirtualGatewayGrpcConnectionPoolPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayGrpcConnectionPoolProperty {
    val builder = CfnVirtualGatewayVirtualGatewayGrpcConnectionPoolPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the health check policy for a virtual gateway's listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayHealthCheckPolicyProperty virtualGatewayHealthCheckPolicyProperty =
   * VirtualGatewayHealthCheckPolicyProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhealthcheckpolicy.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayHealthCheckPolicyProperty(block: CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty {
    val builder = CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayHttp2ConnectionPoolProperty virtualGatewayHttp2ConnectionPoolProperty =
   * VirtualGatewayHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhttp2connectionpool.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayHttp2ConnectionPoolProperty(block: CfnVirtualGatewayVirtualGatewayHttp2ConnectionPoolPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayHttp2ConnectionPoolProperty {
    val builder = CfnVirtualGatewayVirtualGatewayHttp2ConnectionPoolPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayHttpConnectionPoolProperty virtualGatewayHttpConnectionPoolProperty =
   * VirtualGatewayHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayhttpconnectionpool.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayHttpConnectionPoolProperty(block: CfnVirtualGatewayVirtualGatewayHttpConnectionPoolPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayHttpConnectionPoolProperty {
    val builder = CfnVirtualGatewayVirtualGatewayHttpConnectionPoolPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a listener for a virtual gateway.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayListenerProperty virtualGatewayListenerProperty =
   * VirtualGatewayListenerProperty.builder()
   * .portMapping(VirtualGatewayPortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualGatewayConnectionPoolProperty.builder()
   * .grpc(VirtualGatewayGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualGatewayHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualGatewayHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .build())
   * .healthCheck(VirtualGatewayHealthCheckPolicyProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .tls(VirtualGatewayListenerTlsProperty.builder()
   * .certificate(VirtualGatewayListenerTlsCertificateProperty.builder()
   * .acm(VirtualGatewayListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(VirtualGatewayListenerTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistener.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayListenerProperty(block: CfnVirtualGatewayVirtualGatewayListenerPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayListenerProperty {
    val builder = CfnVirtualGatewayVirtualGatewayListenerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents an AWS Certificate Manager certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayListenerTlsAcmCertificateProperty virtualGatewayListenerTlsAcmCertificateProperty
   * = VirtualGatewayListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsacmcertificate.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayListenerTlsAcmCertificateProperty(block: CfnVirtualGatewayVirtualGatewayListenerTlsAcmCertificatePropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayListenerTlsAcmCertificateProperty {
    val builder = CfnVirtualGatewayVirtualGatewayListenerTlsAcmCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a listener's Transport Layer Security (TLS) certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayListenerTlsCertificateProperty virtualGatewayListenerTlsCertificateProperty =
   * VirtualGatewayListenerTlsCertificateProperty.builder()
   * .acm(VirtualGatewayListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlscertificate.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayListenerTlsCertificateProperty(block: CfnVirtualGatewayVirtualGatewayListenerTlsCertificatePropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty {
    val builder = CfnVirtualGatewayVirtualGatewayListenerTlsCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a local file certificate.
   *
   * The certificate must meet specific requirements and you must have proxy authorization enabled.
   * For more information, see [Transport Layer Security
   * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayListenerTlsFileCertificateProperty
   * virtualGatewayListenerTlsFileCertificateProperty =
   * VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsfilecertificate.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayListenerTlsFileCertificateProperty(block: CfnVirtualGatewayVirtualGatewayListenerTlsFileCertificatePropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayListenerTlsFileCertificateProperty {
    val builder = CfnVirtualGatewayVirtualGatewayListenerTlsFileCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the Transport Layer Security (TLS) properties for a listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayListenerTlsProperty virtualGatewayListenerTlsProperty =
   * VirtualGatewayListenerTlsProperty.builder()
   * .certificate(VirtualGatewayListenerTlsCertificateProperty.builder()
   * .acm(VirtualGatewayListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(VirtualGatewayListenerTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertls.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayListenerTlsProperty(block: CfnVirtualGatewayVirtualGatewayListenerTlsPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayListenerTlsProperty {
    val builder = CfnVirtualGatewayVirtualGatewayListenerTlsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the virtual gateway's listener's Secret Discovery Service
   * certificate.The proxy must be configured with a local SDS provider via a Unix Domain Socket. See
   * App Mesh [TLS documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) for
   * more info.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayListenerTlsSdsCertificateProperty virtualGatewayListenerTlsSdsCertificateProperty
   * = VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlssdscertificate.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayListenerTlsSdsCertificateProperty(block: CfnVirtualGatewayVirtualGatewayListenerTlsSdsCertificatePropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayListenerTlsSdsCertificateProperty {
    val builder = CfnVirtualGatewayVirtualGatewayListenerTlsSdsCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a virtual gateway's listener's Transport Layer Security (TLS)
   * validation context.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayListenerTlsValidationContextProperty
   * virtualGatewayListenerTlsValidationContextProperty =
   * VirtualGatewayListenerTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontext.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayListenerTlsValidationContextProperty(block: CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty {
    val builder = CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a virtual gateway's listener's Transport Layer Security (TLS)
   * validation context trust.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayListenerTlsValidationContextTrustProperty
   * virtualGatewayListenerTlsValidationContextTrustProperty =
   * VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertlsvalidationcontexttrust.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayListenerTlsValidationContextTrustProperty(block: CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextTrustPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextTrustProperty {
    val builder = CfnVirtualGatewayVirtualGatewayListenerTlsValidationContextTrustPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents logging information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayLoggingProperty virtualGatewayLoggingProperty =
   * VirtualGatewayLoggingProperty.builder()
   * .accessLog(VirtualGatewayAccessLogProperty.builder()
   * .file(VirtualGatewayFileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylogging.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayLoggingProperty(block: CfnVirtualGatewayVirtualGatewayLoggingPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayLoggingProperty {
    val builder = CfnVirtualGatewayVirtualGatewayLoggingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a port mapping.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayPortMappingProperty virtualGatewayPortMappingProperty =
   * VirtualGatewayPortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayportmapping.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayPortMappingProperty(block: CfnVirtualGatewayVirtualGatewayPortMappingPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayPortMappingProperty {
    val builder = CfnVirtualGatewayVirtualGatewayPortMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the specification of a service mesh resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewaySpecProperty virtualGatewaySpecProperty = VirtualGatewaySpecProperty.builder()
   * .listeners(List.of(VirtualGatewayListenerProperty.builder()
   * .portMapping(VirtualGatewayPortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualGatewayConnectionPoolProperty.builder()
   * .grpc(VirtualGatewayGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualGatewayHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualGatewayHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .build())
   * .healthCheck(VirtualGatewayHealthCheckPolicyProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .tls(VirtualGatewayListenerTlsProperty.builder()
   * .certificate(VirtualGatewayListenerTlsCertificateProperty.builder()
   * .acm(VirtualGatewayListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(VirtualGatewayListenerTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build()))
   * // the properties below are optional
   * .backendDefaults(VirtualGatewayBackendDefaultsProperty.builder()
   * .clientPolicy(VirtualGatewayClientPolicyProperty.builder()
   * .tls(VirtualGatewayClientPolicyTlsProperty.builder()
   * .validation(VirtualGatewayTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayTlsValidationContextTrustProperty.builder()
   * .acm(VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(VirtualGatewayClientTlsCertificateProperty.builder()
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .logging(VirtualGatewayLoggingProperty.builder()
   * .accessLog(VirtualGatewayAccessLogProperty.builder()
   * .file(VirtualGatewayFileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayspec.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewaySpecProperty(block: CfnVirtualGatewayVirtualGatewaySpecPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewaySpecProperty {
    val builder = CfnVirtualGatewayVirtualGatewaySpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a Transport Layer Security (TLS) validation context trust for an AWS
   * Certificate Manager certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayTlsValidationContextAcmTrustProperty
   * virtualGatewayTlsValidationContextAcmTrustProperty =
   * VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextacmtrust.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayTlsValidationContextAcmTrustProperty(block: CfnVirtualGatewayVirtualGatewayTlsValidationContextAcmTrustPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayTlsValidationContextAcmTrustProperty {
    val builder = CfnVirtualGatewayVirtualGatewayTlsValidationContextAcmTrustPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a Transport Layer Security (TLS) validation context trust for a local
   * file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayTlsValidationContextFileTrustProperty
   * virtualGatewayTlsValidationContextFileTrustProperty =
   * VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextfiletrust.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayTlsValidationContextFileTrustProperty(block: CfnVirtualGatewayVirtualGatewayTlsValidationContextFileTrustPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayTlsValidationContextFileTrustProperty {
    val builder = CfnVirtualGatewayVirtualGatewayTlsValidationContextFileTrustPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a Transport Layer Security (TLS) validation context.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayTlsValidationContextProperty virtualGatewayTlsValidationContextProperty =
   * VirtualGatewayTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayTlsValidationContextTrustProperty.builder()
   * .acm(VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontext.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayTlsValidationContextProperty(block: CfnVirtualGatewayVirtualGatewayTlsValidationContextPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty {
    val builder = CfnVirtualGatewayVirtualGatewayTlsValidationContextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a virtual gateway's listener's Transport Layer Security (TLS) Secret
   * Discovery Service validation context trust.
   *
   * The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh
   * [TLS documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) for more info.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayTlsValidationContextSdsTrustProperty
   * virtualGatewayTlsValidationContextSdsTrustProperty =
   * VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontextsdstrust.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayTlsValidationContextSdsTrustProperty(block: CfnVirtualGatewayVirtualGatewayTlsValidationContextSdsTrustPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayTlsValidationContextSdsTrustProperty {
    val builder = CfnVirtualGatewayVirtualGatewayTlsValidationContextSdsTrustPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a Transport Layer Security (TLS) validation context trust.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayTlsValidationContextTrustProperty virtualGatewayTlsValidationContextTrustProperty
   * = VirtualGatewayTlsValidationContextTrustProperty.builder()
   * .acm(VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaytlsvalidationcontexttrust.html)
   */
  public inline
      fun cfnVirtualGatewayVirtualGatewayTlsValidationContextTrustProperty(block: CfnVirtualGatewayVirtualGatewayTlsValidationContextTrustPropertyDsl.() -> Unit
      = {}): CfnVirtualGateway.VirtualGatewayTlsValidationContextTrustProperty {
    val builder = CfnVirtualGatewayVirtualGatewayTlsValidationContextTrustPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a virtual node within a service mesh.
   *
   * A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS
   * service or a Kubernetes deployment. When you create a virtual node, you can specify the service
   * discovery information for your task group, and whether the proxy running in a task group will
   * communicate with other proxies using Transport Layer Security (TLS).
   *
   * You define a `listener` for any inbound traffic that your virtual node expects. Any virtual
   * service that your virtual node expects to communicate to is specified as a `backend` .
   *
   * The response metadata for your new virtual node contains the `arn` that is associated with the
   * virtual node. Set this value to the full ARN; for example,
   * `arn:aws:appmesh:us-west-2:123456789012:myMesh/default/virtualNode/myApp` ) as the
   * `APPMESH_RESOURCE_ARN` environment variable for your task group's Envoy proxy container in your
   * task definition or pod spec. This is then mapped to the `node.id` and `node.cluster` Envoy
   * parameters.
   *
   *
   * By default, App Mesh uses the name of the resource you specified in `APPMESH_RESOURCE_ARN` when
   * Envoy is referring to itself in metrics and traces. You can override this behavior by setting the
   * `APPMESH_RESOURCE_CLUSTER` environment variable with your own name.
   *
   *
   * For more information about virtual nodes, see [Virtual
   * nodes](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_nodes.html) . You must be
   * using `1.15.0` or later of the Envoy image when setting these variables. For more information
   * about App Mesh Envoy variables, see [Envoy
   * image](https://docs.aws.amazon.com/app-mesh/latest/userguide/envoy.html) in the AWS App Mesh User
   * Guide.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnVirtualNode cfnVirtualNode = CfnVirtualNode.Builder.create(this, "MyCfnVirtualNode")
   * .meshName("meshName")
   * .spec(VirtualNodeSpecProperty.builder()
   * .backendDefaults(BackendDefaultsProperty.builder()
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .backends(List.of(BackendProperty.builder()
   * .virtualService(VirtualServiceBackendProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .build()))
   * .listeners(List.of(ListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualNodeConnectionPoolProperty.builder()
   * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build())
   * .build())
   * .healthCheck(HealthCheckProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .outlierDetection(OutlierDetectionProperty.builder()
   * .baseEjectionDuration(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .interval(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build())
   * .timeout(ListenerTimeoutProperty.builder()
   * .grpc(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http2(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .tcp(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .tls(ListenerTlsProperty.builder()
   * .certificate(ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build()))
   * .logging(LoggingProperty.builder()
   * .accessLog(AccessLogProperty.builder()
   * .file(FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build())
   * .serviceDiscovery(ServiceDiscoveryProperty.builder()
   * .awsCloudMap(AwsCloudMapServiceDiscoveryProperty.builder()
   * .namespaceName("namespaceName")
   * .serviceName("serviceName")
   * // the properties below are optional
   * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .ipPreference("ipPreference")
   * .build())
   * .dns(DnsServiceDiscoveryProperty.builder()
   * .hostname("hostname")
   * // the properties below are optional
   * .ipPreference("ipPreference")
   * .responseType("responseType")
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .meshOwner("meshOwner")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .virtualNodeName("virtualNodeName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html)
   */
  public inline fun cfnVirtualNode(
    scope: Construct,
    id: String,
    block: CfnVirtualNodeDsl.() -> Unit = {},
  ): CfnVirtualNode {
    val builder = CfnVirtualNodeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the access logging information for a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * AccessLogProperty accessLogProperty = AccessLogProperty.builder()
   * .file(FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-accesslog.html)
   */
  public inline
      fun cfnVirtualNodeAccessLogProperty(block: CfnVirtualNodeAccessLogPropertyDsl.() -> Unit =
      {}): CfnVirtualNode.AccessLogProperty {
    val builder = CfnVirtualNodeAccessLogPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the AWS Cloud Map attribute information for your virtual node.
   *
   *
   * AWS Cloud Map is not available in the eu-south-1 Region.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * AwsCloudMapInstanceAttributeProperty awsCloudMapInstanceAttributeProperty =
   * AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapinstanceattribute.html)
   */
  public inline
      fun cfnVirtualNodeAwsCloudMapInstanceAttributeProperty(block: CfnVirtualNodeAwsCloudMapInstanceAttributePropertyDsl.() -> Unit
      = {}): CfnVirtualNode.AwsCloudMapInstanceAttributeProperty {
    val builder = CfnVirtualNodeAwsCloudMapInstanceAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the AWS Cloud Map service discovery information for your virtual
   * node.
   *
   *
   * AWS Cloud Map is not available in the eu-south-1 Region.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * AwsCloudMapServiceDiscoveryProperty awsCloudMapServiceDiscoveryProperty =
   * AwsCloudMapServiceDiscoveryProperty.builder()
   * .namespaceName("namespaceName")
   * .serviceName("serviceName")
   * // the properties below are optional
   * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .ipPreference("ipPreference")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-awscloudmapservicediscovery.html)
   */
  public inline
      fun cfnVirtualNodeAwsCloudMapServiceDiscoveryProperty(block: CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty {
    val builder = CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the default properties for a backend.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * BackendDefaultsProperty backendDefaultsProperty = BackendDefaultsProperty.builder()
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backenddefaults.html)
   */
  public inline
      fun cfnVirtualNodeBackendDefaultsProperty(block: CfnVirtualNodeBackendDefaultsPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.BackendDefaultsProperty {
    val builder = CfnVirtualNodeBackendDefaultsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the backends that a virtual node is expected to send outbound traffic
   * to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * BackendProperty backendProperty = BackendProperty.builder()
   * .virtualService(VirtualServiceBackendProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backend.html)
   */
  public inline fun cfnVirtualNodeBackendProperty(block: CfnVirtualNodeBackendPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.BackendProperty {
    val builder = CfnVirtualNodeBackendPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a client policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ClientPolicyProperty clientPolicyProperty = ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicy.html)
   */
  public inline
      fun cfnVirtualNodeClientPolicyProperty(block: CfnVirtualNodeClientPolicyPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ClientPolicyProperty {
    val builder = CfnVirtualNodeClientPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A reference to an object that represents a Transport Layer Security (TLS) client policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ClientPolicyTlsProperty clientPolicyTlsProperty = ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html)
   */
  public inline
      fun cfnVirtualNodeClientPolicyTlsProperty(block: CfnVirtualNodeClientPolicyTlsPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ClientPolicyTlsProperty {
    val builder = CfnVirtualNodeClientPolicyTlsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the client's certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ClientTlsCertificateProperty clientTlsCertificateProperty =
   * ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clienttlscertificate.html)
   */
  public inline
      fun cfnVirtualNodeClientTlsCertificateProperty(block: CfnVirtualNodeClientTlsCertificatePropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ClientTlsCertificateProperty {
    val builder = CfnVirtualNodeClientTlsCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the DNS service discovery information for your virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * DnsServiceDiscoveryProperty dnsServiceDiscoveryProperty = DnsServiceDiscoveryProperty.builder()
   * .hostname("hostname")
   * // the properties below are optional
   * .ipPreference("ipPreference")
   * .responseType("responseType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html)
   */
  public inline
      fun cfnVirtualNodeDnsServiceDiscoveryProperty(block: CfnVirtualNodeDnsServiceDiscoveryPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.DnsServiceDiscoveryProperty {
    val builder = CfnVirtualNodeDnsServiceDiscoveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a duration of time.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * DurationProperty durationProperty = DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-duration.html)
   */
  public inline
      fun cfnVirtualNodeDurationProperty(block: CfnVirtualNodeDurationPropertyDsl.() -> Unit = {}):
      CfnVirtualNode.DurationProperty {
    val builder = CfnVirtualNodeDurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents an access log file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * FileAccessLogProperty fileAccessLogProperty = FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-fileaccesslog.html)
   */
  public inline
      fun cfnVirtualNodeFileAccessLogProperty(block: CfnVirtualNodeFileAccessLogPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.FileAccessLogProperty {
    val builder = CfnVirtualNodeFileAccessLogPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents types of timeouts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcTimeoutProperty grpcTimeoutProperty = GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-grpctimeout.html)
   */
  public inline
      fun cfnVirtualNodeGrpcTimeoutProperty(block: CfnVirtualNodeGrpcTimeoutPropertyDsl.() -> Unit =
      {}): CfnVirtualNode.GrpcTimeoutProperty {
    val builder = CfnVirtualNodeGrpcTimeoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the health check policy for a virtual node's listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HealthCheckProperty healthCheckProperty = HealthCheckProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-healthcheck.html)
   */
  public inline
      fun cfnVirtualNodeHealthCheckProperty(block: CfnVirtualNodeHealthCheckPropertyDsl.() -> Unit =
      {}): CfnVirtualNode.HealthCheckProperty {
    val builder = CfnVirtualNodeHealthCheckPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents types of timeouts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpTimeoutProperty httpTimeoutProperty = HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-httptimeout.html)
   */
  public inline
      fun cfnVirtualNodeHttpTimeoutProperty(block: CfnVirtualNodeHttpTimeoutPropertyDsl.() -> Unit =
      {}): CfnVirtualNode.HttpTimeoutProperty {
    val builder = CfnVirtualNodeHttpTimeoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the key value pairs for the JSON.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * JsonFormatRefProperty jsonFormatRefProperty = JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-jsonformatref.html)
   */
  public inline
      fun cfnVirtualNodeJsonFormatRefProperty(block: CfnVirtualNodeJsonFormatRefPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.JsonFormatRefProperty {
    val builder = CfnVirtualNodeJsonFormatRefPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a listener for a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ListenerProperty listenerProperty = ListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualNodeConnectionPoolProperty.builder()
   * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build())
   * .build())
   * .healthCheck(HealthCheckProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .outlierDetection(OutlierDetectionProperty.builder()
   * .baseEjectionDuration(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .interval(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build())
   * .timeout(ListenerTimeoutProperty.builder()
   * .grpc(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http2(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .tcp(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .tls(ListenerTlsProperty.builder()
   * .certificate(ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listener.html)
   */
  public inline
      fun cfnVirtualNodeListenerProperty(block: CfnVirtualNodeListenerPropertyDsl.() -> Unit = {}):
      CfnVirtualNode.ListenerProperty {
    val builder = CfnVirtualNodeListenerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents timeouts for different protocols.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ListenerTimeoutProperty listenerTimeoutProperty = ListenerTimeoutProperty.builder()
   * .grpc(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http2(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .tcp(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html)
   */
  public inline
      fun cfnVirtualNodeListenerTimeoutProperty(block: CfnVirtualNodeListenerTimeoutPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ListenerTimeoutProperty {
    val builder = CfnVirtualNodeListenerTimeoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents an AWS Certificate Manager certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ListenerTlsAcmCertificateProperty listenerTlsAcmCertificateProperty =
   * ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsacmcertificate.html)
   */
  public inline
      fun cfnVirtualNodeListenerTlsAcmCertificateProperty(block: CfnVirtualNodeListenerTlsAcmCertificatePropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ListenerTlsAcmCertificateProperty {
    val builder = CfnVirtualNodeListenerTlsAcmCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a listener's Transport Layer Security (TLS) certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ListenerTlsCertificateProperty listenerTlsCertificateProperty =
   * ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlscertificate.html)
   */
  public inline
      fun cfnVirtualNodeListenerTlsCertificateProperty(block: CfnVirtualNodeListenerTlsCertificatePropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ListenerTlsCertificateProperty {
    val builder = CfnVirtualNodeListenerTlsCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a local file certificate.
   *
   * The certificate must meet specific requirements and you must have proxy authorization enabled.
   * For more information, see [Transport Layer Security
   * (TLS)](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ListenerTlsFileCertificateProperty listenerTlsFileCertificateProperty =
   * ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsfilecertificate.html)
   */
  public inline
      fun cfnVirtualNodeListenerTlsFileCertificateProperty(block: CfnVirtualNodeListenerTlsFileCertificatePropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ListenerTlsFileCertificateProperty {
    val builder = CfnVirtualNodeListenerTlsFileCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the Transport Layer Security (TLS) properties for a listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ListenerTlsProperty listenerTlsProperty = ListenerTlsProperty.builder()
   * .certificate(ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html)
   */
  public inline
      fun cfnVirtualNodeListenerTlsProperty(block: CfnVirtualNodeListenerTlsPropertyDsl.() -> Unit =
      {}): CfnVirtualNode.ListenerTlsProperty {
    val builder = CfnVirtualNodeListenerTlsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the listener's Secret Discovery Service certificate.
   *
   * The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh
   * [TLS documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) for more info.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ListenerTlsSdsCertificateProperty listenerTlsSdsCertificateProperty =
   * ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlssdscertificate.html)
   */
  public inline
      fun cfnVirtualNodeListenerTlsSdsCertificateProperty(block: CfnVirtualNodeListenerTlsSdsCertificatePropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ListenerTlsSdsCertificateProperty {
    val builder = CfnVirtualNodeListenerTlsSdsCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a listener's Transport Layer Security (TLS) validation context.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ListenerTlsValidationContextProperty listenerTlsValidationContextProperty =
   * ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontext.html)
   */
  public inline
      fun cfnVirtualNodeListenerTlsValidationContextProperty(block: CfnVirtualNodeListenerTlsValidationContextPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ListenerTlsValidationContextProperty {
    val builder = CfnVirtualNodeListenerTlsValidationContextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a listener's Transport Layer Security (TLS) validation context trust.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ListenerTlsValidationContextTrustProperty listenerTlsValidationContextTrustProperty =
   * ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertlsvalidationcontexttrust.html)
   */
  public inline
      fun cfnVirtualNodeListenerTlsValidationContextTrustProperty(block: CfnVirtualNodeListenerTlsValidationContextTrustPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ListenerTlsValidationContextTrustProperty {
    val builder = CfnVirtualNodeListenerTlsValidationContextTrustPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the format for the logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * LoggingFormatProperty loggingFormatProperty = LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-loggingformat.html)
   */
  public inline
      fun cfnVirtualNodeLoggingFormatProperty(block: CfnVirtualNodeLoggingFormatPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.LoggingFormatProperty {
    val builder = CfnVirtualNodeLoggingFormatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the logging information for a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * LoggingProperty loggingProperty = LoggingProperty.builder()
   * .accessLog(AccessLogProperty.builder()
   * .file(FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-logging.html)
   */
  public inline fun cfnVirtualNodeLoggingProperty(block: CfnVirtualNodeLoggingPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.LoggingProperty {
    val builder = CfnVirtualNodeLoggingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the outlier detection for a virtual node's listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * OutlierDetectionProperty outlierDetectionProperty = OutlierDetectionProperty.builder()
   * .baseEjectionDuration(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .interval(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html)
   */
  public inline
      fun cfnVirtualNodeOutlierDetectionProperty(block: CfnVirtualNodeOutlierDetectionPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.OutlierDetectionProperty {
    val builder = CfnVirtualNodeOutlierDetectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing a virtual node or virtual router listener port mapping.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * PortMappingProperty portMappingProperty = PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-portmapping.html)
   */
  public inline
      fun cfnVirtualNodePortMappingProperty(block: CfnVirtualNodePortMappingPropertyDsl.() -> Unit =
      {}): CfnVirtualNode.PortMappingProperty {
    val builder = CfnVirtualNodePortMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnVirtualNode`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnVirtualNodeProps cfnVirtualNodeProps = CfnVirtualNodeProps.builder()
   * .meshName("meshName")
   * .spec(VirtualNodeSpecProperty.builder()
   * .backendDefaults(BackendDefaultsProperty.builder()
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .backends(List.of(BackendProperty.builder()
   * .virtualService(VirtualServiceBackendProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .build()))
   * .listeners(List.of(ListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualNodeConnectionPoolProperty.builder()
   * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build())
   * .build())
   * .healthCheck(HealthCheckProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .outlierDetection(OutlierDetectionProperty.builder()
   * .baseEjectionDuration(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .interval(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build())
   * .timeout(ListenerTimeoutProperty.builder()
   * .grpc(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http2(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .tcp(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .tls(ListenerTlsProperty.builder()
   * .certificate(ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build()))
   * .logging(LoggingProperty.builder()
   * .accessLog(AccessLogProperty.builder()
   * .file(FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build())
   * .serviceDiscovery(ServiceDiscoveryProperty.builder()
   * .awsCloudMap(AwsCloudMapServiceDiscoveryProperty.builder()
   * .namespaceName("namespaceName")
   * .serviceName("serviceName")
   * // the properties below are optional
   * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .ipPreference("ipPreference")
   * .build())
   * .dns(DnsServiceDiscoveryProperty.builder()
   * .hostname("hostname")
   * // the properties below are optional
   * .ipPreference("ipPreference")
   * .responseType("responseType")
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .meshOwner("meshOwner")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .virtualNodeName("virtualNodeName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualnode.html)
   */
  public inline fun cfnVirtualNodeProps(block: CfnVirtualNodePropsDsl.() -> Unit = {}):
      CfnVirtualNodeProps {
    val builder = CfnVirtualNodePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the service discovery information for a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ServiceDiscoveryProperty serviceDiscoveryProperty = ServiceDiscoveryProperty.builder()
   * .awsCloudMap(AwsCloudMapServiceDiscoveryProperty.builder()
   * .namespaceName("namespaceName")
   * .serviceName("serviceName")
   * // the properties below are optional
   * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .ipPreference("ipPreference")
   * .build())
   * .dns(DnsServiceDiscoveryProperty.builder()
   * .hostname("hostname")
   * // the properties below are optional
   * .ipPreference("ipPreference")
   * .responseType("responseType")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html)
   */
  public inline
      fun cfnVirtualNodeServiceDiscoveryProperty(block: CfnVirtualNodeServiceDiscoveryPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.ServiceDiscoveryProperty {
    val builder = CfnVirtualNodeServiceDiscoveryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the methods by which a subject alternative name on a peer Transport
   * Layer Security (TLS) certificate can be matched.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * SubjectAlternativeNameMatchersProperty subjectAlternativeNameMatchersProperty =
   * SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-subjectalternativenamematchers.html)
   */
  public inline
      fun cfnVirtualNodeSubjectAlternativeNameMatchersProperty(block: CfnVirtualNodeSubjectAlternativeNameMatchersPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.SubjectAlternativeNameMatchersProperty {
    val builder = CfnVirtualNodeSubjectAlternativeNameMatchersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the subject alternative names secured by the certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * SubjectAlternativeNamesProperty subjectAlternativeNamesProperty =
   * SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-subjectalternativenames.html)
   */
  public inline
      fun cfnVirtualNodeSubjectAlternativeNamesProperty(block: CfnVirtualNodeSubjectAlternativeNamesPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.SubjectAlternativeNamesProperty {
    val builder = CfnVirtualNodeSubjectAlternativeNamesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents types of timeouts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TcpTimeoutProperty tcpTimeoutProperty = TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tcptimeout.html)
   */
  public inline
      fun cfnVirtualNodeTcpTimeoutProperty(block: CfnVirtualNodeTcpTimeoutPropertyDsl.() -> Unit =
      {}): CfnVirtualNode.TcpTimeoutProperty {
    val builder = CfnVirtualNodeTcpTimeoutPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a Transport Layer Security (TLS) validation context trust for an AWS
   * Certificate Manager certificate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TlsValidationContextAcmTrustProperty tlsValidationContextAcmTrustProperty =
   * TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextacmtrust.html)
   */
  public inline
      fun cfnVirtualNodeTlsValidationContextAcmTrustProperty(block: CfnVirtualNodeTlsValidationContextAcmTrustPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.TlsValidationContextAcmTrustProperty {
    val builder = CfnVirtualNodeTlsValidationContextAcmTrustPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a Transport Layer Security (TLS) validation context trust for a local
   * file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TlsValidationContextFileTrustProperty tlsValidationContextFileTrustProperty =
   * TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextfiletrust.html)
   */
  public inline
      fun cfnVirtualNodeTlsValidationContextFileTrustProperty(block: CfnVirtualNodeTlsValidationContextFileTrustPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.TlsValidationContextFileTrustProperty {
    val builder = CfnVirtualNodeTlsValidationContextFileTrustPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents how the proxy will validate its peer during Transport Layer Security
   * (TLS) negotiation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TlsValidationContextProperty tlsValidationContextProperty =
   * TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontext.html)
   */
  public inline
      fun cfnVirtualNodeTlsValidationContextProperty(block: CfnVirtualNodeTlsValidationContextPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.TlsValidationContextProperty {
    val builder = CfnVirtualNodeTlsValidationContextPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a Transport Layer Security (TLS) Secret Discovery Service validation
   * context trust.
   *
   * The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh
   * [TLS documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html) for more info.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TlsValidationContextSdsTrustProperty tlsValidationContextSdsTrustProperty =
   * TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontextsdstrust.html)
   */
  public inline
      fun cfnVirtualNodeTlsValidationContextSdsTrustProperty(block: CfnVirtualNodeTlsValidationContextSdsTrustPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.TlsValidationContextSdsTrustProperty {
    val builder = CfnVirtualNodeTlsValidationContextSdsTrustPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a Transport Layer Security (TLS) validation context trust.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TlsValidationContextTrustProperty tlsValidationContextTrustProperty =
   * TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tlsvalidationcontexttrust.html)
   */
  public inline
      fun cfnVirtualNodeTlsValidationContextTrustProperty(block: CfnVirtualNodeTlsValidationContextTrustPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.TlsValidationContextTrustProperty {
    val builder = CfnVirtualNodeTlsValidationContextTrustPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the type of virtual node connection pool.
   *
   * Only one protocol is used at a time and should be the same protocol as the one chosen under
   * port mapping.
   *
   * If not present the default value for `maxPendingRequests` is `2147483647` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualNodeConnectionPoolProperty virtualNodeConnectionPoolProperty =
   * VirtualNodeConnectionPoolProperty.builder()
   * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodeconnectionpool.html)
   */
  public inline
      fun cfnVirtualNodeVirtualNodeConnectionPoolProperty(block: CfnVirtualNodeVirtualNodeConnectionPoolPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.VirtualNodeConnectionPoolProperty {
    val builder = CfnVirtualNodeVirtualNodeConnectionPoolPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualNodeGrpcConnectionPoolProperty virtualNodeGrpcConnectionPoolProperty =
   * VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodegrpcconnectionpool.html)
   */
  public inline
      fun cfnVirtualNodeVirtualNodeGrpcConnectionPoolProperty(block: CfnVirtualNodeVirtualNodeGrpcConnectionPoolPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.VirtualNodeGrpcConnectionPoolProperty {
    val builder = CfnVirtualNodeVirtualNodeGrpcConnectionPoolPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualNodeHttp2ConnectionPoolProperty virtualNodeHttp2ConnectionPoolProperty =
   * VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodehttp2connectionpool.html)
   */
  public inline
      fun cfnVirtualNodeVirtualNodeHttp2ConnectionPoolProperty(block: CfnVirtualNodeVirtualNodeHttp2ConnectionPoolPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.VirtualNodeHttp2ConnectionPoolProperty {
    val builder = CfnVirtualNodeVirtualNodeHttp2ConnectionPoolPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualNodeHttpConnectionPoolProperty virtualNodeHttpConnectionPoolProperty =
   * VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodehttpconnectionpool.html)
   */
  public inline
      fun cfnVirtualNodeVirtualNodeHttpConnectionPoolProperty(block: CfnVirtualNodeVirtualNodeHttpConnectionPoolPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.VirtualNodeHttpConnectionPoolProperty {
    val builder = CfnVirtualNodeVirtualNodeHttpConnectionPoolPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the specification of a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualNodeSpecProperty virtualNodeSpecProperty = VirtualNodeSpecProperty.builder()
   * .backendDefaults(BackendDefaultsProperty.builder()
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .backends(List.of(BackendProperty.builder()
   * .virtualService(VirtualServiceBackendProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build())
   * .build()))
   * .listeners(List.of(ListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualNodeConnectionPoolProperty.builder()
   * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build())
   * .build())
   * .healthCheck(HealthCheckProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .outlierDetection(OutlierDetectionProperty.builder()
   * .baseEjectionDuration(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .interval(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build())
   * .timeout(ListenerTimeoutProperty.builder()
   * .grpc(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http2(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .tcp(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .tls(ListenerTlsProperty.builder()
   * .certificate(ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build()))
   * .logging(LoggingProperty.builder()
   * .accessLog(AccessLogProperty.builder()
   * .file(FileAccessLogProperty.builder()
   * .path("path")
   * // the properties below are optional
   * .format(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build())
   * .build())
   * .build())
   * .serviceDiscovery(ServiceDiscoveryProperty.builder()
   * .awsCloudMap(AwsCloudMapServiceDiscoveryProperty.builder()
   * .namespaceName("namespaceName")
   * .serviceName("serviceName")
   * // the properties below are optional
   * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .ipPreference("ipPreference")
   * .build())
   * .dns(DnsServiceDiscoveryProperty.builder()
   * .hostname("hostname")
   * // the properties below are optional
   * .ipPreference("ipPreference")
   * .responseType("responseType")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodespec.html)
   */
  public inline
      fun cfnVirtualNodeVirtualNodeSpecProperty(block: CfnVirtualNodeVirtualNodeSpecPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.VirtualNodeSpecProperty {
    val builder = CfnVirtualNodeVirtualNodeSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a type of connection pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualNodeTcpConnectionPoolProperty virtualNodeTcpConnectionPoolProperty =
   * VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualnodetcpconnectionpool.html)
   */
  public inline
      fun cfnVirtualNodeVirtualNodeTcpConnectionPoolProperty(block: CfnVirtualNodeVirtualNodeTcpConnectionPoolPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.VirtualNodeTcpConnectionPoolProperty {
    val builder = CfnVirtualNodeVirtualNodeTcpConnectionPoolPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a virtual service backend for a virtual node.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualServiceBackendProperty virtualServiceBackendProperty =
   * VirtualServiceBackendProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .clientPolicy(ClientPolicyProperty.builder()
   * .tls(ClientPolicyTlsProperty.builder()
   * .validation(TlsValidationContextProperty.builder()
   * .trust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .certificate(ClientTlsCertificateProperty.builder()
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .enforce(false)
   * .ports(List.of(123))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html)
   */
  public inline
      fun cfnVirtualNodeVirtualServiceBackendProperty(block: CfnVirtualNodeVirtualServiceBackendPropertyDsl.() -> Unit
      = {}): CfnVirtualNode.VirtualServiceBackendProperty {
    val builder = CfnVirtualNodeVirtualServiceBackendPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a virtual router within a service mesh.
   *
   * Specify a `listener` for any inbound traffic that your virtual router receives. Create a
   * virtual router for each protocol and port that you need to route. Virtual routers handle traffic
   * for one or more virtual services within your mesh. After you create your virtual router, create
   * and associate routes for your virtual router that direct incoming requests to different virtual
   * nodes.
   *
   * For more information about virtual routers, see [Virtual
   * routers](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_routers.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnVirtualRouter cfnVirtualRouter = CfnVirtualRouter.Builder.create(this, "MyCfnVirtualRouter")
   * .meshName("meshName")
   * .spec(VirtualRouterSpecProperty.builder()
   * .listeners(List.of(VirtualRouterListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * .build()))
   * .build())
   * // the properties below are optional
   * .meshOwner("meshOwner")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .virtualRouterName("virtualRouterName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html)
   */
  public inline fun cfnVirtualRouter(
    scope: Construct,
    id: String,
    block: CfnVirtualRouterDsl.() -> Unit = {},
  ): CfnVirtualRouter {
    val builder = CfnVirtualRouterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object representing a virtual router listener port mapping.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * PortMappingProperty portMappingProperty = PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html)
   */
  public inline
      fun cfnVirtualRouterPortMappingProperty(block: CfnVirtualRouterPortMappingPropertyDsl.() -> Unit
      = {}): CfnVirtualRouter.PortMappingProperty {
    val builder = CfnVirtualRouterPortMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnVirtualRouter`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnVirtualRouterProps cfnVirtualRouterProps = CfnVirtualRouterProps.builder()
   * .meshName("meshName")
   * .spec(VirtualRouterSpecProperty.builder()
   * .listeners(List.of(VirtualRouterListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * .build()))
   * .build())
   * // the properties below are optional
   * .meshOwner("meshOwner")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .virtualRouterName("virtualRouterName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html)
   */
  public inline fun cfnVirtualRouterProps(block: CfnVirtualRouterPropsDsl.() -> Unit = {}):
      CfnVirtualRouterProps {
    val builder = CfnVirtualRouterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a virtual router listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualRouterListenerProperty virtualRouterListenerProperty =
   * VirtualRouterListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterlistener.html)
   */
  public inline
      fun cfnVirtualRouterVirtualRouterListenerProperty(block: CfnVirtualRouterVirtualRouterListenerPropertyDsl.() -> Unit
      = {}): CfnVirtualRouter.VirtualRouterListenerProperty {
    val builder = CfnVirtualRouterVirtualRouterListenerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the specification of a virtual router.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualRouterSpecProperty virtualRouterSpecProperty = VirtualRouterSpecProperty.builder()
   * .listeners(List.of(VirtualRouterListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html)
   */
  public inline
      fun cfnVirtualRouterVirtualRouterSpecProperty(block: CfnVirtualRouterVirtualRouterSpecPropertyDsl.() -> Unit
      = {}): CfnVirtualRouter.VirtualRouterSpecProperty {
    val builder = CfnVirtualRouterVirtualRouterSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a virtual service within a service mesh.
   *
   * A virtual service is an abstraction of a real service that is provided by a virtual node
   * directly or indirectly by means of a virtual router. Dependent services call your virtual service
   * by its `virtualServiceName` , and those requests are routed to the virtual node or virtual router
   * that is specified as the provider for the virtual service.
   *
   * For more information about virtual services, see [Virtual
   * services](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_services.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnVirtualService cfnVirtualService = CfnVirtualService.Builder.create(this,
   * "MyCfnVirtualService")
   * .meshName("meshName")
   * .spec(VirtualServiceSpecProperty.builder()
   * .provider(VirtualServiceProviderProperty.builder()
   * .virtualNode(VirtualNodeServiceProviderProperty.builder()
   * .virtualNodeName("virtualNodeName")
   * .build())
   * .virtualRouter(VirtualRouterServiceProviderProperty.builder()
   * .virtualRouterName("virtualRouterName")
   * .build())
   * .build())
   * .build())
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .meshOwner("meshOwner")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html)
   */
  public inline fun cfnVirtualService(
    scope: Construct,
    id: String,
    block: CfnVirtualServiceDsl.() -> Unit = {},
  ): CfnVirtualService {
    val builder = CfnVirtualServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnVirtualService`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CfnVirtualServiceProps cfnVirtualServiceProps = CfnVirtualServiceProps.builder()
   * .meshName("meshName")
   * .spec(VirtualServiceSpecProperty.builder()
   * .provider(VirtualServiceProviderProperty.builder()
   * .virtualNode(VirtualNodeServiceProviderProperty.builder()
   * .virtualNodeName("virtualNodeName")
   * .build())
   * .virtualRouter(VirtualRouterServiceProviderProperty.builder()
   * .virtualRouterName("virtualRouterName")
   * .build())
   * .build())
   * .build())
   * .virtualServiceName("virtualServiceName")
   * // the properties below are optional
   * .meshOwner("meshOwner")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html)
   */
  public inline fun cfnVirtualServiceProps(block: CfnVirtualServicePropsDsl.() -> Unit = {}):
      CfnVirtualServiceProps {
    val builder = CfnVirtualServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a virtual node service provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualNodeServiceProviderProperty virtualNodeServiceProviderProperty =
   * VirtualNodeServiceProviderProperty.builder()
   * .virtualNodeName("virtualNodeName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html)
   */
  public inline
      fun cfnVirtualServiceVirtualNodeServiceProviderProperty(block: CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl.() -> Unit
      = {}): CfnVirtualService.VirtualNodeServiceProviderProperty {
    val builder = CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents a virtual node service provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualRouterServiceProviderProperty virtualRouterServiceProviderProperty =
   * VirtualRouterServiceProviderProperty.builder()
   * .virtualRouterName("virtualRouterName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html)
   */
  public inline
      fun cfnVirtualServiceVirtualRouterServiceProviderProperty(block: CfnVirtualServiceVirtualRouterServiceProviderPropertyDsl.() -> Unit
      = {}): CfnVirtualService.VirtualRouterServiceProviderProperty {
    val builder = CfnVirtualServiceVirtualRouterServiceProviderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the provider for a virtual service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualServiceProviderProperty virtualServiceProviderProperty =
   * VirtualServiceProviderProperty.builder()
   * .virtualNode(VirtualNodeServiceProviderProperty.builder()
   * .virtualNodeName("virtualNodeName")
   * .build())
   * .virtualRouter(VirtualRouterServiceProviderProperty.builder()
   * .virtualRouterName("virtualRouterName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html)
   */
  public inline
      fun cfnVirtualServiceVirtualServiceProviderProperty(block: CfnVirtualServiceVirtualServiceProviderPropertyDsl.() -> Unit
      = {}): CfnVirtualService.VirtualServiceProviderProperty {
    val builder = CfnVirtualServiceVirtualServiceProviderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An object that represents the specification of a virtual service.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualServiceSpecProperty virtualServiceSpecProperty = VirtualServiceSpecProperty.builder()
   * .provider(VirtualServiceProviderProperty.builder()
   * .virtualNode(VirtualNodeServiceProviderProperty.builder()
   * .virtualNodeName("virtualNodeName")
   * .build())
   * .virtualRouter(VirtualRouterServiceProviderProperty.builder()
   * .virtualRouterName("virtualRouterName")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualservicespec.html)
   */
  public inline
      fun cfnVirtualServiceVirtualServiceSpecProperty(block: CfnVirtualServiceVirtualServiceSpecPropertyDsl.() -> Unit
      = {}): CfnVirtualService.VirtualServiceSpecProperty {
    val builder = CfnVirtualServiceVirtualServiceSpecPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Base options for all gateway route specs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * CommonGatewayRouteSpecOptions commonGatewayRouteSpecOptions =
   * CommonGatewayRouteSpecOptions.builder()
   * .priority(123)
   * .build();
   * ```
   */
  public inline fun commonGatewayRouteSpecOptions(block: CommonGatewayRouteSpecOptionsDsl.() -> Unit
      = {}): CommonGatewayRouteSpecOptions {
    val builder = CommonGatewayRouteSpecOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * GatewayRoute represents a new or existing gateway route attached to a VirtualGateway and Mesh.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
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
  public inline fun gatewayRoute(
    scope: Construct,
    id: String,
    block: GatewayRouteDsl.() -> Unit = {},
  ): GatewayRoute {
    val builder = GatewayRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Interface with properties necessary to import a reusable GatewayRoute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGateway virtualGateway;
   * GatewayRouteAttributes gatewayRouteAttributes = GatewayRouteAttributes.builder()
   * .gatewayRouteName("gatewayRouteName")
   * .virtualGateway(virtualGateway)
   * .build();
   * ```
   */
  public inline fun gatewayRouteAttributes(block: GatewayRouteAttributesDsl.() -> Unit = {}):
      GatewayRouteAttributes {
    val builder = GatewayRouteAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Basic configuration properties for a GatewayRoute.
   *
   * Example:
   *
   * ```
   * VirtualGateway gateway;
   * VirtualService virtualService;
   * gateway.addGatewayRoute("gateway-route-grpc", GatewayRouteBaseProps.builder()
   * .routeSpec(GatewayRouteSpec.grpc(GrpcGatewayRouteSpecOptions.builder()
   * .routeTarget(virtualService)
   * .match(GrpcGatewayRouteMatch.builder()
   * .hostname(GatewayRouteHostnameMatch.exactly("example.com"))
   * // This disables the default rewrite to virtual service name and retain original request.
   * .rewriteRequestHostname(false)
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun gatewayRouteBaseProps(block: GatewayRouteBasePropsDsl.() -> Unit = {}):
      GatewayRouteBaseProps {
    val builder = GatewayRouteBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Configuration for gateway route host name match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GatewayRouteHostnameMatchConfig gatewayRouteHostnameMatchConfig =
   * GatewayRouteHostnameMatchConfig.builder()
   * .hostnameMatch(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .build();
   * ```
   */
  public inline
      fun gatewayRouteHostnameMatchConfig(block: GatewayRouteHostnameMatchConfigDsl.() -> Unit =
      {}): GatewayRouteHostnameMatchConfig {
    val builder = GatewayRouteHostnameMatchConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties to define a new GatewayRoute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GatewayRouteSpec gatewayRouteSpec;
   * VirtualGateway virtualGateway;
   * GatewayRouteProps gatewayRouteProps = GatewayRouteProps.builder()
   * .routeSpec(gatewayRouteSpec)
   * .virtualGateway(virtualGateway)
   * // the properties below are optional
   * .gatewayRouteName("gatewayRouteName")
   * .build();
   * ```
   */
  public inline fun gatewayRouteProps(block: GatewayRoutePropsDsl.() -> Unit = {}):
      GatewayRouteProps {
    val builder = GatewayRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * All Properties for GatewayRoute Specs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * GatewayRouteSpecConfig gatewayRouteSpecConfig = GatewayRouteSpecConfig.builder()
   * .grpcSpecConfig(GrpcGatewayRouteProperty.builder()
   * .action(GrpcGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .build())
   * .build())
   * .match(GrpcGatewayRouteMatchProperty.builder()
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GatewayRouteMetadataMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * .build())
   * .http2SpecConfig(HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .build())
   * .build())
   * .httpSpecConfig(HttpGatewayRouteProperty.builder()
   * .action(HttpGatewayRouteActionProperty.builder()
   * .target(GatewayRouteTargetProperty.builder()
   * .virtualService(GatewayRouteVirtualServiceProperty.builder()
   * .virtualServiceName("virtualServiceName")
   * .build())
   * // the properties below are optional
   * .port(123)
   * .build())
   * // the properties below are optional
   * .rewrite(HttpGatewayRouteRewriteProperty.builder()
   * .hostname(GatewayRouteHostnameRewriteProperty.builder()
   * .defaultTargetHostname("defaultTargetHostname")
   * .build())
   * .path(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .prefix(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .build())
   * .build())
   * .match(HttpGatewayRouteMatchProperty.builder()
   * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HttpGatewayRouteHeaderMatchProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(GatewayRouteRangeMatchProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .hostname(GatewayRouteHostnameMatchProperty.builder()
   * .exact("exact")
   * .suffix("suffix")
   * .build())
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .build())
   * .build())
   * .priority(123)
   * .build();
   * ```
   */
  public inline fun gatewayRouteSpecConfig(block: GatewayRouteSpecConfigDsl.() -> Unit = {}):
      GatewayRouteSpecConfig {
    val builder = GatewayRouteSpecConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Connection pool properties for gRPC listeners.
   *
   * Example:
   *
   * ```
   * // A Virtual Node with a gRPC listener with a connection pool set
   * Mesh mesh;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * // DNS service discovery can optionally specify the DNS response type as either LOAD_BALANCER
   * or ENDPOINTS.
   * // LOAD_BALANCER means that the DNS resolver returns a loadbalanced set of endpoints,
   * // whereas ENDPOINTS means that the DNS resolver is returning all the endpoints.
   * // By default, the response type is assumed to be LOAD_BALANCER
   * .serviceDiscovery(ServiceDiscovery.dns("node", DnsResponseType.ENDPOINTS))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(80)
   * .connectionPool(HttpConnectionPool.builder()
   * .maxConnections(100)
   * .maxPendingRequests(10)
   * .build())
   * .build())))
   * .build();
   * // A Virtual Gateway with a gRPC listener with a connection pool set
   * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
   * .port(8080)
   * .connectionPool(GrpcConnectionPool.builder()
   * .maxRequests(10)
   * .build())
   * .build())))
   * .virtualGatewayName("gateway")
   * .build();
   * ```
   */
  public inline fun grpcConnectionPool(block: GrpcConnectionPoolDsl.() -> Unit = {}):
      GrpcConnectionPool {
    val builder = GrpcConnectionPoolDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the properties needed to define GRPC Listeners for a VirtualGateway.
   *
   * Example:
   *
   * ```
   * // A Virtual Node with listener TLS from an ACM provided certificate
   * Certificate cert;
   * Mesh mesh;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.dns("node"))
   * .listeners(List.of(VirtualNodeListener.grpc(GrpcVirtualNodeListenerOptions.builder()
   * .port(80)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.acm(cert))
   * .build())
   * .build())))
   * .build();
   * // A Virtual Gateway with listener TLS from a customer provided file certificate
   * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
   * .port(8080)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.file("path/to/certChain", "path/to/privateKey"))
   * .build())
   * .build())))
   * .virtualGatewayName("gateway")
   * .build();
   * // A Virtual Gateway with listener TLS from a SDS provided certificate
   * VirtualGateway gateway2 = VirtualGateway.Builder.create(this, "gateway2")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.http2(Http2GatewayListenerOptions.builder()
   * .port(8080)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.sds("secrete_certificate"))
   * .build())
   * .build())))
   * .virtualGatewayName("gateway2")
   * .build();
   * ```
   */
  public inline fun grpcGatewayListenerOptions(block: GrpcGatewayListenerOptionsDsl.() -> Unit =
      {}): GrpcGatewayListenerOptions {
    val builder = GrpcGatewayListenerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The criterion for determining a request match for this GatewayRoute.
   *
   * Example:
   *
   * ```
   * VirtualGateway gateway;
   * VirtualService virtualService;
   * gateway.addGatewayRoute("gateway-route-grpc", GatewayRouteBaseProps.builder()
   * .routeSpec(GatewayRouteSpec.grpc(GrpcGatewayRouteSpecOptions.builder()
   * .routeTarget(virtualService)
   * .match(GrpcGatewayRouteMatch.builder()
   * .hostname(GatewayRouteHostnameMatch.endsWith(".example.com"))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun grpcGatewayRouteMatch(block: GrpcGatewayRouteMatchDsl.() -> Unit = {}):
      GrpcGatewayRouteMatch {
    val builder = GrpcGatewayRouteMatchDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties specific for a gRPC GatewayRoute.
   *
   * Example:
   *
   * ```
   * VirtualGateway gateway;
   * VirtualService virtualService;
   * gateway.addGatewayRoute("gateway-route-grpc", GatewayRouteBaseProps.builder()
   * .routeSpec(GatewayRouteSpec.grpc(GrpcGatewayRouteSpecOptions.builder()
   * .routeTarget(virtualService)
   * .match(GrpcGatewayRouteMatch.builder()
   * .hostname(GatewayRouteHostnameMatch.endsWith(".example.com"))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun grpcGatewayRouteSpecOptions(block: GrpcGatewayRouteSpecOptionsDsl.() -> Unit =
      {}): GrpcGatewayRouteSpecOptions {
    val builder = GrpcGatewayRouteSpecOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties used to define GRPC Based healthchecks.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.appmesh.*;
   * GrpcHealthCheckOptions grpcHealthCheckOptions = GrpcHealthCheckOptions.builder()
   * .healthyThreshold(123)
   * .interval(Duration.minutes(30))
   * .timeout(Duration.minutes(30))
   * .unhealthyThreshold(123)
   * .build();
   * ```
   */
  public inline fun grpcHealthCheckOptions(block: GrpcHealthCheckOptionsDsl.() -> Unit = {}):
      GrpcHealthCheckOptions {
    val builder = GrpcHealthCheckOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * gRPC retry policy.
   *
   * Example:
   *
   * ```
   * VirtualRouter router;
   * VirtualNode node;
   * router.addRoute("route-grpc-retry", RouteBaseProps.builder()
   * .routeSpec(RouteSpec.grpc(GrpcRouteSpecOptions.builder()
   * .weightedTargets(List.of(WeightedTarget.builder().virtualNode(node).build()))
   * .match(GrpcRouteMatch.builder().serviceName("servicename").build())
   * .retryPolicy(GrpcRetryPolicy.builder()
   * .tcpRetryEvents(List.of(TcpRetryEvent.CONNECTION_ERROR))
   * .httpRetryEvents(List.of(HttpRetryEvent.GATEWAY_ERROR))
   * // Retry if gRPC responds that the request was cancelled, a resource
   * // was exhausted, or if the service is unavailable
   * .grpcRetryEvents(List.of(GrpcRetryEvent.CANCELLED, GrpcRetryEvent.RESOURCE_EXHAUSTED,
   * GrpcRetryEvent.UNAVAILABLE))
   * .retryAttempts(5)
   * .retryTimeout(Duration.seconds(1))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun grpcRetryPolicy(block: GrpcRetryPolicyDsl.() -> Unit = {}): GrpcRetryPolicy {
    val builder = GrpcRetryPolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The criterion for determining a request match for this Route.
   *
   * At least one match type must be selected.
   *
   * Example:
   *
   * ```
   * VirtualRouter router;
   * VirtualNode node;
   * router.addRoute("route-grpc-retry", RouteBaseProps.builder()
   * .routeSpec(RouteSpec.grpc(GrpcRouteSpecOptions.builder()
   * .weightedTargets(List.of(WeightedTarget.builder().virtualNode(node).build()))
   * .match(GrpcRouteMatch.builder()
   * // When method name is specified, service name must be also specified.
   * .methodName("methodname")
   * .serviceName("servicename")
   * .metadata(List.of(HeaderMatch.valueStartsWith("Content-Type", "application/"),
   * HeaderMatch.valueDoesNotStartWith("Content-Type", "text/")))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun grpcRouteMatch(block: GrpcRouteMatchDsl.() -> Unit = {}): GrpcRouteMatch {
    val builder = GrpcRouteMatchDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties specific for a GRPC Based Routes.
   *
   * Example:
   *
   * ```
   * VirtualRouter router;
   * VirtualNode node;
   * router.addRoute("route-grpc-retry", RouteBaseProps.builder()
   * .routeSpec(RouteSpec.grpc(GrpcRouteSpecOptions.builder()
   * .weightedTargets(List.of(WeightedTarget.builder().virtualNode(node).build()))
   * .match(GrpcRouteMatch.builder()
   * // When method name is specified, service name must be also specified.
   * .methodName("methodname")
   * .serviceName("servicename")
   * .metadata(List.of(HeaderMatch.valueStartsWith("Content-Type", "application/"),
   * HeaderMatch.valueDoesNotStartWith("Content-Type", "text/")))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun grpcRouteSpecOptions(block: GrpcRouteSpecOptionsDsl.() -> Unit = {}):
      GrpcRouteSpecOptions {
    val builder = GrpcRouteSpecOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents timeouts for GRPC protocols.
   *
   * Example:
   *
   * ```
   * VirtualRouter router;
   * VirtualNode node;
   * router.addRoute("route-http", RouteBaseProps.builder()
   * .routeSpec(RouteSpec.grpc(GrpcRouteSpecOptions.builder()
   * .weightedTargets(List.of(WeightedTarget.builder()
   * .virtualNode(node)
   * .build()))
   * .match(GrpcRouteMatch.builder()
   * .serviceName("my-service.default.svc.cluster.local")
   * .build())
   * .timeout(GrpcTimeout.builder()
   * .idle(Duration.seconds(2))
   * .perRequest(Duration.seconds(1))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun grpcTimeout(block: GrpcTimeoutDsl.() -> Unit = {}): GrpcTimeout {
    val builder = GrpcTimeoutDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represent the GRPC Node Listener property.
   *
   * Example:
   *
   * ```
   * // A Virtual Node with listener TLS from an ACM provided certificate
   * Certificate cert;
   * Mesh mesh;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.dns("node"))
   * .listeners(List.of(VirtualNodeListener.grpc(GrpcVirtualNodeListenerOptions.builder()
   * .port(80)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.acm(cert))
   * .build())
   * .build())))
   * .build();
   * // A Virtual Gateway with listener TLS from a customer provided file certificate
   * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
   * .port(8080)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.file("path/to/certChain", "path/to/privateKey"))
   * .build())
   * .build())))
   * .virtualGatewayName("gateway")
   * .build();
   * // A Virtual Gateway with listener TLS from a SDS provided certificate
   * VirtualGateway gateway2 = VirtualGateway.Builder.create(this, "gateway2")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.http2(Http2GatewayListenerOptions.builder()
   * .port(8080)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.sds("secrete_certificate"))
   * .build())
   * .build())))
   * .virtualGatewayName("gateway2")
   * .build();
   * ```
   */
  public inline
      fun grpcVirtualNodeListenerOptions(block: GrpcVirtualNodeListenerOptionsDsl.() -> Unit = {}):
      GrpcVirtualNodeListenerOptions {
    val builder = GrpcVirtualNodeListenerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Configuration for `HeaderMatch`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HeaderMatchConfig headerMatchConfig = HeaderMatchConfig.builder()
   * .headerMatch(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun headerMatchConfig(block: HeaderMatchConfigDsl.() -> Unit = {}):
      HeaderMatchConfig {
    val builder = HeaderMatchConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options used for creating the Health Check object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HealthCheckBindOptions healthCheckBindOptions = HealthCheckBindOptions.builder()
   * .defaultPort(123)
   * .build();
   * ```
   */
  public inline fun healthCheckBindOptions(block: HealthCheckBindOptionsDsl.() -> Unit = {}):
      HealthCheckBindOptions {
    val builder = HealthCheckBindOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * All Properties for Health Checks for mesh endpoints.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HealthCheckConfig healthCheckConfig = HealthCheckConfig.builder()
   * .virtualGatewayHealthCheck(VirtualGatewayHealthCheckPolicyProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .virtualNodeHealthCheck(HealthCheckProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .build();
   * ```
   */
  public inline fun healthCheckConfig(block: HealthCheckConfigDsl.() -> Unit = {}):
      HealthCheckConfig {
    val builder = HealthCheckConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Connection pool properties for HTTP2 listeners.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * Http2ConnectionPool http2ConnectionPool = Http2ConnectionPool.builder()
   * .maxRequests(123)
   * .build();
   * ```
   */
  public inline fun http2ConnectionPool(block: Http2ConnectionPoolDsl.() -> Unit = {}):
      Http2ConnectionPool {
    val builder = Http2ConnectionPoolDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the properties needed to define HTTP2 Listeners for a VirtualGateway.
   *
   * Example:
   *
   * ```
   * // A Virtual Node with listener TLS from an ACM provided certificate
   * Certificate cert;
   * Mesh mesh;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.dns("node"))
   * .listeners(List.of(VirtualNodeListener.grpc(GrpcVirtualNodeListenerOptions.builder()
   * .port(80)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.acm(cert))
   * .build())
   * .build())))
   * .build();
   * // A Virtual Gateway with listener TLS from a customer provided file certificate
   * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
   * .port(8080)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.file("path/to/certChain", "path/to/privateKey"))
   * .build())
   * .build())))
   * .virtualGatewayName("gateway")
   * .build();
   * // A Virtual Gateway with listener TLS from a SDS provided certificate
   * VirtualGateway gateway2 = VirtualGateway.Builder.create(this, "gateway2")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.http2(Http2GatewayListenerOptions.builder()
   * .port(8080)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.sds("secrete_certificate"))
   * .build())
   * .build())))
   * .virtualGatewayName("gateway2")
   * .build();
   * ```
   */
  public inline fun http2GatewayListenerOptions(block: Http2GatewayListenerOptionsDsl.() -> Unit =
      {}): Http2GatewayListenerOptions {
    val builder = Http2GatewayListenerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represent the HTTP2 Node Listener property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.appmesh.*;
   * HealthCheck healthCheck;
   * MutualTlsValidationTrust mutualTlsValidationTrust;
   * SubjectAlternativeNames subjectAlternativeNames;
   * TlsCertificate tlsCertificate;
   * Http2VirtualNodeListenerOptions http2VirtualNodeListenerOptions =
   * Http2VirtualNodeListenerOptions.builder()
   * .connectionPool(Http2ConnectionPool.builder()
   * .maxRequests(123)
   * .build())
   * .healthCheck(healthCheck)
   * .outlierDetection(OutlierDetection.builder()
   * .baseEjectionDuration(Duration.minutes(30))
   * .interval(Duration.minutes(30))
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build())
   * .port(123)
   * .timeout(HttpTimeout.builder()
   * .idle(Duration.minutes(30))
   * .perRequest(Duration.minutes(30))
   * .build())
   * .tls(ListenerTlsOptions.builder()
   * .certificate(tlsCertificate)
   * .mode(TlsMode.STRICT)
   * // the properties below are optional
   * .mutualTlsValidation(MutualTlsValidation.builder()
   * .trust(mutualTlsValidationTrust)
   * // the properties below are optional
   * .subjectAlternativeNames(subjectAlternativeNames)
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline
      fun http2VirtualNodeListenerOptions(block: Http2VirtualNodeListenerOptionsDsl.() -> Unit =
      {}): Http2VirtualNodeListenerOptions {
    val builder = Http2VirtualNodeListenerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Connection pool properties for HTTP listeners.
   *
   * Example:
   *
   * ```
   * // A Virtual Node with a gRPC listener with a connection pool set
   * Mesh mesh;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * // DNS service discovery can optionally specify the DNS response type as either LOAD_BALANCER
   * or ENDPOINTS.
   * // LOAD_BALANCER means that the DNS resolver returns a loadbalanced set of endpoints,
   * // whereas ENDPOINTS means that the DNS resolver is returning all the endpoints.
   * // By default, the response type is assumed to be LOAD_BALANCER
   * .serviceDiscovery(ServiceDiscovery.dns("node", DnsResponseType.ENDPOINTS))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(80)
   * .connectionPool(HttpConnectionPool.builder()
   * .maxConnections(100)
   * .maxPendingRequests(10)
   * .build())
   * .build())))
   * .build();
   * // A Virtual Gateway with a gRPC listener with a connection pool set
   * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
   * .port(8080)
   * .connectionPool(GrpcConnectionPool.builder()
   * .maxRequests(10)
   * .build())
   * .build())))
   * .virtualGatewayName("gateway")
   * .build();
   * ```
   */
  public inline fun httpConnectionPool(block: HttpConnectionPoolDsl.() -> Unit = {}):
      HttpConnectionPool {
    val builder = HttpConnectionPoolDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the properties needed to define HTTP Listeners for a VirtualGateway.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * String certificateAuthorityArn =
   * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012";
   * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.http(HttpGatewayListenerOptions.builder()
   * .port(443)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .interval(Duration.seconds(10))
   * .build()))
   * .build())))
   * .backendDefaults(BackendDefaults.builder()
   * .tlsClientPolicy(TlsClientPolicy.builder()
   * .ports(List.of(8080, 8081))
   * .validation(TlsValidation.builder()
   * .trust(TlsValidationTrust.acm(List.of(CertificateAuthority.fromCertificateAuthorityArn(this,
   * "certificate", certificateAuthorityArn))))
   * .build())
   * .build())
   * .build())
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .virtualGatewayName("virtualGateway")
   * .build();
   * ```
   */
  public inline fun httpGatewayListenerOptions(block: HttpGatewayListenerOptionsDsl.() -> Unit =
      {}): HttpGatewayListenerOptions {
    val builder = HttpGatewayListenerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The criterion for determining a request match for this GatewayRoute.
   *
   * Example:
   *
   * ```
   * VirtualGateway gateway;
   * VirtualService virtualService;
   * gateway.addGatewayRoute("gateway-route-http-2", GatewayRouteBaseProps.builder()
   * .routeSpec(GatewayRouteSpec.http(HttpGatewayRouteSpecOptions.builder()
   * .routeTarget(virtualService)
   * .match(HttpGatewayRouteMatch.builder()
   * // This rewrites the path from '/test' to '/rewrittenPath'.
   * .path(HttpGatewayRoutePathMatch.exactly("/test", "/rewrittenPath"))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun httpGatewayRouteMatch(block: HttpGatewayRouteMatchDsl.() -> Unit = {}):
      HttpGatewayRouteMatch {
    val builder = HttpGatewayRouteMatchDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The type returned from the `bind()` method in `HttpGatewayRoutePathMatch`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpGatewayRoutePathMatchConfig httpGatewayRoutePathMatchConfig =
   * HttpGatewayRoutePathMatchConfig.builder()
   * .prefixPathMatch("prefixPathMatch")
   * .prefixPathRewrite(HttpGatewayRoutePrefixRewriteProperty.builder()
   * .defaultPrefix("defaultPrefix")
   * .value("value")
   * .build())
   * .wholePathMatch(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .wholePathRewrite(HttpGatewayRoutePathRewriteProperty.builder()
   * .exact("exact")
   * .build())
   * .build();
   * ```
   */
  public inline
      fun httpGatewayRoutePathMatchConfig(block: HttpGatewayRoutePathMatchConfigDsl.() -> Unit =
      {}): HttpGatewayRoutePathMatchConfig {
    val builder = HttpGatewayRoutePathMatchConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties specific for HTTP Based GatewayRoutes.
   *
   * Example:
   *
   * ```
   * VirtualGateway gateway;
   * VirtualService virtualService;
   * gateway.addGatewayRoute("gateway-route-http-2", GatewayRouteBaseProps.builder()
   * .routeSpec(GatewayRouteSpec.http(HttpGatewayRouteSpecOptions.builder()
   * .routeTarget(virtualService)
   * .match(HttpGatewayRouteMatch.builder()
   * // This rewrites the path from '/test' to '/rewrittenPath'.
   * .path(HttpGatewayRoutePathMatch.exactly("/test", "/rewrittenPath"))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun httpGatewayRouteSpecOptions(block: HttpGatewayRouteSpecOptionsDsl.() -> Unit =
      {}): HttpGatewayRouteSpecOptions {
    val builder = HttpGatewayRouteSpecOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties used to define HTTP Based healthchecks.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * Vpc vpc = new Vpc(this, "vpc");
   * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
   * .vpc(vpc)
   * .name("domain.local")
   * .build();
   * Service service = namespace.createService("Svc");
   * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
   * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(8081)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .healthyThreshold(3)
   * .interval(Duration.seconds(5)) // minimum
   * .path("/health-check-path")
   * .timeout(Duration.seconds(2)) // minimum
   * .unhealthyThreshold(2)
   * .build()))
   * .build())))
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .build());
   * ```
   */
  public inline fun httpHealthCheckOptions(block: HttpHealthCheckOptionsDsl.() -> Unit = {}):
      HttpHealthCheckOptions {
    val builder = HttpHealthCheckOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * HTTP retry policy.
   *
   * Example:
   *
   * ```
   * VirtualRouter router;
   * VirtualNode node;
   * router.addRoute("route-http2-retry", RouteBaseProps.builder()
   * .routeSpec(RouteSpec.http2(HttpRouteSpecOptions.builder()
   * .weightedTargets(List.of(WeightedTarget.builder().virtualNode(node).build()))
   * .retryPolicy(HttpRetryPolicy.builder()
   * // Retry if the connection failed
   * .tcpRetryEvents(List.of(TcpRetryEvent.CONNECTION_ERROR))
   * // Retry if HTTP responds with a gateway error (502, 503, 504)
   * .httpRetryEvents(List.of(HttpRetryEvent.GATEWAY_ERROR))
   * // Retry five times
   * .retryAttempts(5)
   * // Use a 1 second timeout per retry
   * .retryTimeout(Duration.seconds(1))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun httpRetryPolicy(block: HttpRetryPolicyDsl.() -> Unit = {}): HttpRetryPolicy {
    val builder = HttpRetryPolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The criterion for determining a request match for this Route.
   *
   * Example:
   *
   * ```
   * VirtualRouter router;
   * VirtualNode node;
   * router.addRoute("route-http", RouteBaseProps.builder()
   * .routeSpec(RouteSpec.http(HttpRouteSpecOptions.builder()
   * .weightedTargets(List.of(WeightedTarget.builder()
   * .virtualNode(node)
   * .weight(50)
   * .build(), WeightedTarget.builder()
   * .virtualNode(node)
   * .weight(50)
   * .build()))
   * .match(HttpRouteMatch.builder()
   * .path(HttpRoutePathMatch.startsWith("/path-to-app"))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun httpRouteMatch(block: HttpRouteMatchDsl.() -> Unit = {}): HttpRouteMatch {
    val builder = HttpRouteMatchDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The type returned from the `bind()` method in `HttpRoutePathMatch`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * HttpRoutePathMatchConfig httpRoutePathMatchConfig = HttpRoutePathMatchConfig.builder()
   * .prefixPathMatch("prefixPathMatch")
   * .wholePathMatch(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .build();
   * ```
   */
  public inline fun httpRoutePathMatchConfig(block: HttpRoutePathMatchConfigDsl.() -> Unit = {}):
      HttpRoutePathMatchConfig {
    val builder = HttpRoutePathMatchConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties specific for HTTP Based Routes.
   *
   * Example:
   *
   * ```
   * VirtualRouter router;
   * VirtualNode node;
   * router.addRoute("route-http2-retry", RouteBaseProps.builder()
   * .routeSpec(RouteSpec.http2(HttpRouteSpecOptions.builder()
   * .weightedTargets(List.of(WeightedTarget.builder().virtualNode(node).build()))
   * .retryPolicy(HttpRetryPolicy.builder()
   * // Retry if the connection failed
   * .tcpRetryEvents(List.of(TcpRetryEvent.CONNECTION_ERROR))
   * // Retry if HTTP responds with a gateway error (502, 503, 504)
   * .httpRetryEvents(List.of(HttpRetryEvent.GATEWAY_ERROR))
   * // Retry five times
   * .retryAttempts(5)
   * // Use a 1 second timeout per retry
   * .retryTimeout(Duration.seconds(1))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun httpRouteSpecOptions(block: HttpRouteSpecOptionsDsl.() -> Unit = {}):
      HttpRouteSpecOptions {
    val builder = HttpRouteSpecOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents timeouts for HTTP protocols.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * Service service;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(8080)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .healthyThreshold(3)
   * .interval(Duration.seconds(5))
   * .path("/ping")
   * .timeout(Duration.seconds(2))
   * .unhealthyThreshold(2)
   * .build()))
   * .timeout(HttpTimeout.builder()
   * .idle(Duration.seconds(5))
   * .build())
   * .build())))
   * .backendDefaults(BackendDefaults.builder()
   * .tlsClientPolicy(TlsClientPolicy.builder()
   * .validation(TlsValidation.builder()
   * .trust(TlsValidationTrust.file("/keys/local_cert_chain.pem"))
   * .build())
   * .build())
   * .build())
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .build();
   * Tags.of(node).add("Environment", "Dev");
   * ```
   */
  public inline fun httpTimeout(block: HttpTimeoutDsl.() -> Unit = {}): HttpTimeout {
    val builder = HttpTimeoutDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represent the HTTP Node Listener property.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * Vpc vpc = new Vpc(this, "vpc");
   * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
   * .vpc(vpc)
   * .name("domain.local")
   * .build();
   * Service service = namespace.createService("Svc");
   * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
   * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(8081)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .healthyThreshold(3)
   * .interval(Duration.seconds(5)) // minimum
   * .path("/health-check-path")
   * .timeout(Duration.seconds(2)) // minimum
   * .unhealthyThreshold(2)
   * .build()))
   * .build())))
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .build());
   * ```
   */
  public inline
      fun httpVirtualNodeListenerOptions(block: HttpVirtualNodeListenerOptionsDsl.() -> Unit = {}):
      HttpVirtualNodeListenerOptions {
    val builder = HttpVirtualNodeListenerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents TLS properties for listener.
   *
   * Example:
   *
   * ```
   * // A Virtual Node with listener TLS from an ACM provided certificate
   * Certificate cert;
   * Mesh mesh;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.dns("node"))
   * .listeners(List.of(VirtualNodeListener.grpc(GrpcVirtualNodeListenerOptions.builder()
   * .port(80)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.acm(cert))
   * .build())
   * .build())))
   * .build();
   * // A Virtual Gateway with listener TLS from a customer provided file certificate
   * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
   * .port(8080)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.file("path/to/certChain", "path/to/privateKey"))
   * .build())
   * .build())))
   * .virtualGatewayName("gateway")
   * .build();
   * // A Virtual Gateway with listener TLS from a SDS provided certificate
   * VirtualGateway gateway2 = VirtualGateway.Builder.create(this, "gateway2")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.http2(Http2GatewayListenerOptions.builder()
   * .port(8080)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.sds("secrete_certificate"))
   * .build())
   * .build())))
   * .virtualGatewayName("gateway2")
   * .build();
   * ```
   */
  public inline fun listenerTlsOptions(block: ListenerTlsOptionsDsl.() -> Unit = {}):
      ListenerTlsOptions {
    val builder = ListenerTlsOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * All Properties for Envoy Access Logging Format for mesh endpoints.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * LoggingFormatConfig loggingFormatConfig = LoggingFormatConfig.builder()
   * .formatConfig(LoggingFormatProperty.builder()
   * .json(List.of(JsonFormatRefProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .text("text")
   * .build())
   * .build();
   * ```
   */
  public inline fun loggingFormatConfig(block: LoggingFormatConfigDsl.() -> Unit = {}):
      LoggingFormatConfig {
    val builder = LoggingFormatConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Define a new AppMesh mesh.
   *
   * Example:
   *
   * ```
   * // This is the ARN for the mesh from different AWS IAM account ID.
   * // Ensure mesh is properly shared with your account. For more details, see:
   * https://github.com/aws/aws-cdk/issues/15404
   * String arn = "arn:aws:appmesh:us-east-1:123456789012:mesh/testMesh";
   * IMesh sharedMesh = Mesh.fromMeshArn(this, "imported-mesh", arn);
   * // This VirtualNode resource can communicate with the resources in the mesh from different AWS
   * IAM account ID.
   * // This VirtualNode resource can communicate with the resources in the mesh from different AWS
   * IAM account ID.
   * VirtualNode.Builder.create(this, "test-node")
   * .mesh(sharedMesh)
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/meshes.html)
   */
  public inline fun mesh(
    scope: Construct,
    id: String,
    block: MeshDsl.() -> Unit = {},
  ): Mesh {
    val builder = MeshDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The set of properties used when creating a Mesh.
   *
   * Example:
   *
   * ```
   * Stack infraStack;
   * Stack appStack;
   * Mesh mesh = Mesh.Builder.create(infraStack, "AppMesh")
   * .meshName("myAwsMesh")
   * .egressFilter(MeshFilterType.ALLOW_ALL)
   * .build();
   * // the VirtualRouter will belong to 'appStack',
   * // even though the Mesh belongs to 'infraStack'
   * VirtualRouter router = VirtualRouter.Builder.create(appStack, "router")
   * .mesh(mesh) // notice that mesh is a required property when creating a router with the 'new'
   * statement
   * .listeners(List.of(VirtualRouterListener.http(8081)))
   * .build();
   * ```
   */
  public inline fun meshProps(block: MeshPropsDsl.() -> Unit = {}): MeshProps {
    val builder = MeshPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for Mesh Service Discovery.
   *
   * Example:
   *
   * ```
   * Mesh mesh = Mesh.Builder.create(this, "AppMesh")
   * .meshName("myAwsMesh")
   * .serviceDiscovery(MeshServiceDiscovery.builder()
   * .ipPreference(IpPreference.IPV4_ONLY)
   * .build())
   * .build();
   * ```
   */
  public inline fun meshServiceDiscovery(block: MeshServiceDiscoveryDsl.() -> Unit = {}):
      MeshServiceDiscovery {
    val builder = MeshServiceDiscoveryDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the properties needed to define TLS Validation context that is supported for mutual
   * TLS authentication.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * VirtualNode node1 = VirtualNode.Builder.create(this, "node1")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.dns("node"))
   * .listeners(List.of(VirtualNodeListener.grpc(GrpcVirtualNodeListenerOptions.builder()
   * .port(80)
   * .tls(ListenerTlsOptions.builder()
   * .mode(TlsMode.STRICT)
   * .certificate(TlsCertificate.file("path/to/certChain", "path/to/privateKey"))
   * // Validate a file client certificates to enable mutual TLS authentication when a client
   * provides a certificate.
   * .mutualTlsValidation(MutualTlsValidation.builder()
   * .trust(TlsValidationTrust.file("path-to-certificate"))
   * .build())
   * .build())
   * .build())))
   * .build();
   * String certificateAuthorityArn =
   * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012";
   * VirtualNode node2 = VirtualNode.Builder.create(this, "node2")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.dns("node2"))
   * .backendDefaults(BackendDefaults.builder()
   * .tlsClientPolicy(TlsClientPolicy.builder()
   * .ports(List.of(8080, 8081))
   * .validation(TlsValidation.builder()
   * .subjectAlternativeNames(SubjectAlternativeNames.matchingExactly("mesh-endpoint.apps.local"))
   * .trust(TlsValidationTrust.acm(List.of(CertificateAuthority.fromCertificateAuthorityArn(this,
   * "certificate", certificateAuthorityArn))))
   * .build())
   * // Provide a SDS client certificate when a server requests it and enable mutual TLS
   * authentication.
   * .mutualTlsCertificate(TlsCertificate.sds("secret_certificate"))
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun mutualTlsValidation(block: MutualTlsValidationDsl.() -> Unit = {}):
      MutualTlsValidation {
    val builder = MutualTlsValidationDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the outlier detection for a listener.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * // Cloud Map service discovery is currently required for host ejection by outlier detection
   * Vpc vpc = new Vpc(this, "vpc");
   * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
   * .vpc(vpc)
   * .name("domain.local")
   * .build();
   * Service service = namespace.createService("Svc");
   * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
   * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .outlierDetection(OutlierDetection.builder()
   * .baseEjectionDuration(Duration.seconds(10))
   * .interval(Duration.seconds(30))
   * .maxEjectionPercent(50)
   * .maxServerErrors(5)
   * .build())
   * .build())))
   * .build());
   * ```
   */
  public inline fun outlierDetection(block: OutlierDetectionDsl.() -> Unit = {}): OutlierDetection {
    val builder = OutlierDetectionDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Configuration for `QueryParameterMatch`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * QueryParameterMatchConfig queryParameterMatchConfig = QueryParameterMatchConfig.builder()
   * .queryParameterMatch(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun queryParameterMatchConfig(block: QueryParameterMatchConfigDsl.() -> Unit = {}):
      QueryParameterMatchConfig {
    val builder = QueryParameterMatchConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Route represents a new or existing route attached to a VirtualRouter and Mesh.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * Mesh mesh;
   * RouteSpec routeSpec;
   * VirtualRouter virtualRouter;
   * Route route = Route.Builder.create(this, "MyRoute")
   * .mesh(mesh)
   * .routeSpec(routeSpec)
   * .virtualRouter(virtualRouter)
   * // the properties below are optional
   * .routeName("routeName")
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/routes.html)
   */
  public inline fun route(
    scope: Construct,
    id: String,
    block: RouteDsl.() -> Unit = {},
  ): Route {
    val builder = RouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Interface with properties ncecessary to import a reusable Route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualRouter virtualRouter;
   * RouteAttributes routeAttributes = RouteAttributes.builder()
   * .routeName("routeName")
   * .virtualRouter(virtualRouter)
   * .build();
   * ```
   */
  public inline fun routeAttributes(block: RouteAttributesDsl.() -> Unit = {}): RouteAttributes {
    val builder = RouteAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Base interface properties for all Routes.
   *
   * Example:
   *
   * ```
   * VirtualRouter router;
   * VirtualNode node;
   * router.addRoute("route-http2-retry", RouteBaseProps.builder()
   * .routeSpec(RouteSpec.http2(HttpRouteSpecOptions.builder()
   * .weightedTargets(List.of(WeightedTarget.builder().virtualNode(node).build()))
   * .retryPolicy(HttpRetryPolicy.builder()
   * // Retry if the connection failed
   * .tcpRetryEvents(List.of(TcpRetryEvent.CONNECTION_ERROR))
   * // Retry if HTTP responds with a gateway error (502, 503, 504)
   * .httpRetryEvents(List.of(HttpRetryEvent.GATEWAY_ERROR))
   * // Retry five times
   * .retryAttempts(5)
   * // Use a 1 second timeout per retry
   * .retryTimeout(Duration.seconds(1))
   * .build())
   * .build()))
   * .build());
   * ```
   */
  public inline fun routeBaseProps(block: RouteBasePropsDsl.() -> Unit = {}): RouteBaseProps {
    val builder = RouteBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties to define new Routes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * Mesh mesh;
   * RouteSpec routeSpec;
   * VirtualRouter virtualRouter;
   * RouteProps routeProps = RouteProps.builder()
   * .mesh(mesh)
   * .routeSpec(routeSpec)
   * .virtualRouter(virtualRouter)
   * // the properties below are optional
   * .routeName("routeName")
   * .build();
   * ```
   */
  public inline fun routeProps(block: RoutePropsDsl.() -> Unit = {}): RouteProps {
    val builder = RoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * All Properties for Route Specs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * RouteSpecConfig routeSpecConfig = RouteSpecConfig.builder()
   * .grpcRouteSpec(GrpcRouteProperty.builder()
   * .action(GrpcRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(GrpcRouteMatchProperty.builder()
   * .metadata(List.of(GrpcRouteMetadataProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(GrpcRouteMetadataMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .methodName("methodName")
   * .port(123)
   * .serviceName("serviceName")
   * .build())
   * // the properties below are optional
   * .retryPolicy(GrpcRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .grpcRetryEvents(List.of("grpcRetryEvents"))
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .http2RouteSpec(HttpRouteProperty.builder()
   * .action(HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(HttpRouteMatchProperty.builder()
   * .headers(List.of(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .scheme("scheme")
   * .build())
   * // the properties below are optional
   * .retryPolicy(HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .httpRouteSpec(HttpRouteProperty.builder()
   * .action(HttpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * .match(HttpRouteMatchProperty.builder()
   * .headers(List.of(HttpRouteHeaderProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .invert(false)
   * .match(HeaderMatchMethodProperty.builder()
   * .exact("exact")
   * .prefix("prefix")
   * .range(MatchRangeProperty.builder()
   * .end(123)
   * .start(123)
   * .build())
   * .regex("regex")
   * .suffix("suffix")
   * .build())
   * .build()))
   * .method("method")
   * .path(HttpPathMatchProperty.builder()
   * .exact("exact")
   * .regex("regex")
   * .build())
   * .port(123)
   * .prefix("prefix")
   * .queryParameters(List.of(QueryParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .match(HttpQueryParameterMatchProperty.builder()
   * .exact("exact")
   * .build())
   * .build()))
   * .scheme("scheme")
   * .build())
   * // the properties below are optional
   * .retryPolicy(HttpRetryPolicyProperty.builder()
   * .maxRetries(123)
   * .perRetryTimeout(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * // the properties below are optional
   * .httpRetryEvents(List.of("httpRetryEvents"))
   * .tcpRetryEvents(List.of("tcpRetryEvents"))
   * .build())
   * .timeout(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .priority(123)
   * .tcpRouteSpec(TcpRouteProperty.builder()
   * .action(TcpRouteActionProperty.builder()
   * .weightedTargets(List.of(WeightedTargetProperty.builder()
   * .virtualNode("virtualNode")
   * .weight(123)
   * // the properties below are optional
   * .port(123)
   * .build()))
   * .build())
   * // the properties below are optional
   * .match(TcpRouteMatchProperty.builder()
   * .port(123)
   * .build())
   * .timeout(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun routeSpecConfig(block: RouteSpecConfigDsl.() -> Unit = {}): RouteSpecConfig {
    val builder = RouteSpecConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Base options for all route specs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * RouteSpecOptionsBase routeSpecOptionsBase = RouteSpecOptionsBase.builder()
   * .priority(123)
   * .build();
   * ```
   */
  public inline fun routeSpecOptionsBase(block: RouteSpecOptionsBaseDsl.() -> Unit = {}):
      RouteSpecOptionsBase {
    val builder = RouteSpecOptionsBaseDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for VirtualNode Service Discovery.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * ServiceDiscoveryConfig serviceDiscoveryConfig = ServiceDiscoveryConfig.builder()
   * .cloudmap(AwsCloudMapServiceDiscoveryProperty.builder()
   * .namespaceName("namespaceName")
   * .serviceName("serviceName")
   * // the properties below are optional
   * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .ipPreference("ipPreference")
   * .build())
   * .dns(DnsServiceDiscoveryProperty.builder()
   * .hostname("hostname")
   * // the properties below are optional
   * .ipPreference("ipPreference")
   * .responseType("responseType")
   * .build())
   * .build();
   * ```
   */
  public inline fun serviceDiscoveryConfig(block: ServiceDiscoveryConfigDsl.() -> Unit = {}):
      ServiceDiscoveryConfig {
    val builder = ServiceDiscoveryConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * All Properties for Subject Alternative Names Matcher for both Client Policy and Listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * SubjectAlternativeNamesMatcherConfig subjectAlternativeNamesMatcherConfig =
   * SubjectAlternativeNamesMatcherConfig.builder()
   * .subjectAlternativeNamesMatch(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build();
   * ```
   */
  public inline
      fun subjectAlternativeNamesMatcherConfig(block: SubjectAlternativeNamesMatcherConfigDsl.() -> Unit
      = {}): SubjectAlternativeNamesMatcherConfig {
    val builder = SubjectAlternativeNamesMatcherConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Connection pool properties for TCP listeners.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TcpConnectionPool tcpConnectionPool = TcpConnectionPool.builder()
   * .maxConnections(123)
   * .build();
   * ```
   */
  public inline fun tcpConnectionPool(block: TcpConnectionPoolDsl.() -> Unit = {}):
      TcpConnectionPool {
    val builder = TcpConnectionPoolDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties used to define TCP Based healthchecks.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.appmesh.*;
   * TcpHealthCheckOptions tcpHealthCheckOptions = TcpHealthCheckOptions.builder()
   * .healthyThreshold(123)
   * .interval(Duration.minutes(30))
   * .timeout(Duration.minutes(30))
   * .unhealthyThreshold(123)
   * .build();
   * ```
   */
  public inline fun tcpHealthCheckOptions(block: TcpHealthCheckOptionsDsl.() -> Unit = {}):
      TcpHealthCheckOptions {
    val builder = TcpHealthCheckOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties specific for a TCP Based Routes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualNode virtualNode;
   * TcpRouteSpecOptions tcpRouteSpecOptions = TcpRouteSpecOptions.builder()
   * .weightedTargets(List.of(WeightedTarget.builder()
   * .virtualNode(virtualNode)
   * // the properties below are optional
   * .port(123)
   * .weight(123)
   * .build()))
   * // the properties below are optional
   * .priority(123)
   * .timeout(TcpTimeout.builder()
   * .idle(Duration.minutes(30))
   * .build())
   * .build();
   * ```
   */
  public inline fun tcpRouteSpecOptions(block: TcpRouteSpecOptionsDsl.() -> Unit = {}):
      TcpRouteSpecOptions {
    val builder = TcpRouteSpecOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents timeouts for TCP protocols.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.appmesh.*;
   * TcpTimeout tcpTimeout = TcpTimeout.builder()
   * .idle(Duration.minutes(30))
   * .build();
   * ```
   */
  public inline fun tcpTimeout(block: TcpTimeoutDsl.() -> Unit = {}): TcpTimeout {
    val builder = TcpTimeoutDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represent the TCP Node Listener property.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.appmesh.*;
   * HealthCheck healthCheck;
   * MutualTlsValidationTrust mutualTlsValidationTrust;
   * SubjectAlternativeNames subjectAlternativeNames;
   * TlsCertificate tlsCertificate;
   * TcpVirtualNodeListenerOptions tcpVirtualNodeListenerOptions =
   * TcpVirtualNodeListenerOptions.builder()
   * .connectionPool(TcpConnectionPool.builder()
   * .maxConnections(123)
   * .build())
   * .healthCheck(healthCheck)
   * .outlierDetection(OutlierDetection.builder()
   * .baseEjectionDuration(Duration.minutes(30))
   * .interval(Duration.minutes(30))
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build())
   * .port(123)
   * .timeout(TcpTimeout.builder()
   * .idle(Duration.minutes(30))
   * .build())
   * .tls(ListenerTlsOptions.builder()
   * .certificate(tlsCertificate)
   * .mode(TlsMode.STRICT)
   * // the properties below are optional
   * .mutualTlsValidation(MutualTlsValidation.builder()
   * .trust(mutualTlsValidationTrust)
   * // the properties below are optional
   * .subjectAlternativeNames(subjectAlternativeNames)
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun tcpVirtualNodeListenerOptions(block: TcpVirtualNodeListenerOptionsDsl.() -> Unit
      = {}): TcpVirtualNodeListenerOptions {
    val builder = TcpVirtualNodeListenerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A wrapper for the tls config returned by `TlsCertificate.bind`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TlsCertificateConfig tlsCertificateConfig = TlsCertificateConfig.builder()
   * .tlsCertificate(ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun tlsCertificateConfig(block: TlsCertificateConfigDsl.() -> Unit = {}):
      TlsCertificateConfig {
    val builder = TlsCertificateConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the properties needed to define client policy.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * Service service;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(8080)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .healthyThreshold(3)
   * .interval(Duration.seconds(5))
   * .path("/ping")
   * .timeout(Duration.seconds(2))
   * .unhealthyThreshold(2)
   * .build()))
   * .timeout(HttpTimeout.builder()
   * .idle(Duration.seconds(5))
   * .build())
   * .build())))
   * .backendDefaults(BackendDefaults.builder()
   * .tlsClientPolicy(TlsClientPolicy.builder()
   * .validation(TlsValidation.builder()
   * .trust(TlsValidationTrust.file("/keys/local_cert_chain.pem"))
   * .build())
   * .build())
   * .build())
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .build();
   * Tags.of(node).add("Environment", "Dev");
   * ```
   */
  public inline fun tlsClientPolicy(block: TlsClientPolicyDsl.() -> Unit = {}): TlsClientPolicy {
    val builder = TlsClientPolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the properties needed to define TLS Validation context.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * Service service;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(8080)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .healthyThreshold(3)
   * .interval(Duration.seconds(5))
   * .path("/ping")
   * .timeout(Duration.seconds(2))
   * .unhealthyThreshold(2)
   * .build()))
   * .timeout(HttpTimeout.builder()
   * .idle(Duration.seconds(5))
   * .build())
   * .build())))
   * .backendDefaults(BackendDefaults.builder()
   * .tlsClientPolicy(TlsClientPolicy.builder()
   * .validation(TlsValidation.builder()
   * .trust(TlsValidationTrust.file("/keys/local_cert_chain.pem"))
   * .build())
   * .build())
   * .build())
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .build();
   * Tags.of(node).add("Environment", "Dev");
   * ```
   */
  public inline fun tlsValidation(block: TlsValidationDsl.() -> Unit = {}): TlsValidation {
    val builder = TlsValidationDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * All Properties for TLS Validation Trusts for both Client Policy and Listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * TlsValidationTrustConfig tlsValidationTrustConfig = TlsValidationTrustConfig.builder()
   * .tlsValidationTrust(TlsValidationContextTrustProperty.builder()
   * .acm(TlsValidationContextAcmTrustProperty.builder()
   * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
   * .build())
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun tlsValidationTrustConfig(block: TlsValidationTrustConfigDsl.() -> Unit = {}):
      TlsValidationTrustConfig {
    val builder = TlsValidationTrustConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * VirtualGateway represents a newly defined App Mesh Virtual Gateway.
   *
   * A virtual gateway allows resources that are outside of your mesh to communicate to resources
   * that
   * are inside of your mesh.
   *
   * Example:
   *
   * ```
   * // A Virtual Node with a gRPC listener with a connection pool set
   * Mesh mesh;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * // DNS service discovery can optionally specify the DNS response type as either LOAD_BALANCER
   * or ENDPOINTS.
   * // LOAD_BALANCER means that the DNS resolver returns a loadbalanced set of endpoints,
   * // whereas ENDPOINTS means that the DNS resolver is returning all the endpoints.
   * // By default, the response type is assumed to be LOAD_BALANCER
   * .serviceDiscovery(ServiceDiscovery.dns("node", DnsResponseType.ENDPOINTS))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(80)
   * .connectionPool(HttpConnectionPool.builder()
   * .maxConnections(100)
   * .maxPendingRequests(10)
   * .build())
   * .build())))
   * .build();
   * // A Virtual Gateway with a gRPC listener with a connection pool set
   * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
   * .port(8080)
   * .connectionPool(GrpcConnectionPool.builder()
   * .maxRequests(10)
   * .build())
   * .build())))
   * .virtualGatewayName("gateway")
   * .build();
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_gateways.html)
   */
  public inline fun virtualGateway(
    scope: Construct,
    id: String,
    block: VirtualGatewayDsl.() -> Unit = {},
  ): VirtualGateway {
    val builder = VirtualGatewayDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Unterface with properties necessary to import a reusable VirtualGateway.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * Mesh mesh;
   * VirtualGatewayAttributes virtualGatewayAttributes = VirtualGatewayAttributes.builder()
   * .mesh(mesh)
   * .virtualGatewayName("virtualGatewayName")
   * .build();
   * ```
   */
  public inline fun virtualGatewayAttributes(block: VirtualGatewayAttributesDsl.() -> Unit = {}):
      VirtualGatewayAttributes {
    val builder = VirtualGatewayAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Basic configuration properties for a VirtualGateway.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * VirtualGateway gateway = mesh.addVirtualGateway("gateway", VirtualGatewayBaseProps.builder()
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .virtualGatewayName("virtualGateway")
   * .listeners(List.of(VirtualGatewayListener.http(HttpGatewayListenerOptions.builder()
   * .port(443)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .interval(Duration.seconds(10))
   * .build()))
   * .build())))
   * .build());
   * ```
   */
  public inline fun virtualGatewayBaseProps(block: VirtualGatewayBasePropsDsl.() -> Unit = {}):
      VirtualGatewayBaseProps {
    val builder = VirtualGatewayBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a VirtualGateway listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualGatewayListenerConfig virtualGatewayListenerConfig =
   * VirtualGatewayListenerConfig.builder()
   * .listener(VirtualGatewayListenerProperty.builder()
   * .portMapping(VirtualGatewayPortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualGatewayConnectionPoolProperty.builder()
   * .grpc(VirtualGatewayGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualGatewayHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualGatewayHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .build())
   * .healthCheck(VirtualGatewayHealthCheckPolicyProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .tls(VirtualGatewayListenerTlsProperty.builder()
   * .certificate(VirtualGatewayListenerTlsCertificateProperty.builder()
   * .acm(VirtualGatewayListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(VirtualGatewayListenerTlsValidationContextProperty.builder()
   * .trust(VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
   * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun virtualGatewayListenerConfig(block: VirtualGatewayListenerConfigDsl.() -> Unit =
      {}): VirtualGatewayListenerConfig {
    val builder = VirtualGatewayListenerConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties used when creating a new VirtualGateway.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * String certificateAuthorityArn =
   * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012";
   * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
   * .mesh(mesh)
   * .listeners(List.of(VirtualGatewayListener.http(HttpGatewayListenerOptions.builder()
   * .port(443)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .interval(Duration.seconds(10))
   * .build()))
   * .build())))
   * .backendDefaults(BackendDefaults.builder()
   * .tlsClientPolicy(TlsClientPolicy.builder()
   * .ports(List.of(8080, 8081))
   * .validation(TlsValidation.builder()
   * .trust(TlsValidationTrust.acm(List.of(CertificateAuthority.fromCertificateAuthorityArn(this,
   * "certificate", certificateAuthorityArn))))
   * .build())
   * .build())
   * .build())
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .virtualGatewayName("virtualGateway")
   * .build();
   * ```
   */
  public inline fun virtualGatewayProps(block: VirtualGatewayPropsDsl.() -> Unit = {}):
      VirtualGatewayProps {
    val builder = VirtualGatewayPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * VirtualNode represents a newly defined AppMesh VirtualNode.
   *
   * Any inbound traffic that your virtual node expects should be specified as a
   * listener. Any outbound traffic that your virtual node expects to reach
   * should be specified as a backend.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * // Cloud Map service discovery is currently required for host ejection by outlier detection
   * Vpc vpc = new Vpc(this, "vpc");
   * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
   * .vpc(vpc)
   * .name("domain.local")
   * .build();
   * Service service = namespace.createService("Svc");
   * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
   * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .outlierDetection(OutlierDetection.builder()
   * .baseEjectionDuration(Duration.seconds(10))
   * .interval(Duration.seconds(30))
   * .maxEjectionPercent(50)
   * .maxServerErrors(5)
   * .build())
   * .build())))
   * .build());
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_nodes.html)
   */
  public inline fun virtualNode(
    scope: Construct,
    id: String,
    block: VirtualNodeDsl.() -> Unit = {},
  ): VirtualNode {
    val builder = VirtualNodeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Interface with properties necessary to import a reusable VirtualNode.
   *
   * Example:
   *
   * ```
   * String virtualNodeName = "my-virtual-node";
   * VirtualNode.fromVirtualNodeAttributes(this, "imported-virtual-node",
   * VirtualNodeAttributes.builder()
   * .mesh(Mesh.fromMeshName(this, "Mesh", "testMesh"))
   * .virtualNodeName(virtualNodeName)
   * .build());
   * ```
   */
  public inline fun virtualNodeAttributes(block: VirtualNodeAttributesDsl.() -> Unit = {}):
      VirtualNodeAttributes {
    val builder = VirtualNodeAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Basic configuration properties for a VirtualNode.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * Vpc vpc = new Vpc(this, "vpc");
   * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
   * .vpc(vpc)
   * .name("domain.local")
   * .build();
   * Service service = namespace.createService("Svc");
   * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
   * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(8081)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .healthyThreshold(3)
   * .interval(Duration.seconds(5)) // minimum
   * .path("/health-check-path")
   * .timeout(Duration.seconds(2)) // minimum
   * .unhealthyThreshold(2)
   * .build()))
   * .build())))
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .build());
   * ```
   */
  public inline fun virtualNodeBaseProps(block: VirtualNodeBasePropsDsl.() -> Unit = {}):
      VirtualNodeBaseProps {
    val builder = VirtualNodeBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a VirtualNode listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualNodeListenerConfig virtualNodeListenerConfig = VirtualNodeListenerConfig.builder()
   * .listener(ListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * // the properties below are optional
   * .connectionPool(VirtualNodeConnectionPoolProperty.builder()
   * .grpc(VirtualNodeGrpcConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .http(VirtualNodeHttpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * // the properties below are optional
   * .maxPendingRequests(123)
   * .build())
   * .http2(VirtualNodeHttp2ConnectionPoolProperty.builder()
   * .maxRequests(123)
   * .build())
   * .tcp(VirtualNodeTcpConnectionPoolProperty.builder()
   * .maxConnections(123)
   * .build())
   * .build())
   * .healthCheck(HealthCheckProperty.builder()
   * .healthyThreshold(123)
   * .intervalMillis(123)
   * .protocol("protocol")
   * .timeoutMillis(123)
   * .unhealthyThreshold(123)
   * // the properties below are optional
   * .path("path")
   * .port(123)
   * .build())
   * .outlierDetection(OutlierDetectionProperty.builder()
   * .baseEjectionDuration(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .interval(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .maxEjectionPercent(123)
   * .maxServerErrors(123)
   * .build())
   * .timeout(ListenerTimeoutProperty.builder()
   * .grpc(GrpcTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .http2(HttpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .perRequest(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .tcp(TcpTimeoutProperty.builder()
   * .idle(DurationProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .build())
   * .build())
   * .tls(ListenerTlsProperty.builder()
   * .certificate(ListenerTlsCertificateProperty.builder()
   * .acm(ListenerTlsAcmCertificateProperty.builder()
   * .certificateArn("certificateArn")
   * .build())
   * .file(ListenerTlsFileCertificateProperty.builder()
   * .certificateChain("certificateChain")
   * .privateKey("privateKey")
   * .build())
   * .sds(ListenerTlsSdsCertificateProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * .mode("mode")
   * // the properties below are optional
   * .validation(ListenerTlsValidationContextProperty.builder()
   * .trust(ListenerTlsValidationContextTrustProperty.builder()
   * .file(TlsValidationContextFileTrustProperty.builder()
   * .certificateChain("certificateChain")
   * .build())
   * .sds(TlsValidationContextSdsTrustProperty.builder()
   * .secretName("secretName")
   * .build())
   * .build())
   * // the properties below are optional
   * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
   * .match(SubjectAlternativeNameMatchersProperty.builder()
   * .exact(List.of("exact"))
   * .build())
   * .build())
   * .build())
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun virtualNodeListenerConfig(block: VirtualNodeListenerConfigDsl.() -> Unit = {}):
      VirtualNodeListenerConfig {
    val builder = VirtualNodeListenerConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties used when creating a new VirtualNode.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * Service service;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
   * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
   * .port(8080)
   * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
   * .healthyThreshold(3)
   * .interval(Duration.seconds(5))
   * .path("/ping")
   * .timeout(Duration.seconds(2))
   * .unhealthyThreshold(2)
   * .build()))
   * .timeout(HttpTimeout.builder()
   * .idle(Duration.seconds(5))
   * .build())
   * .build())))
   * .backendDefaults(BackendDefaults.builder()
   * .tlsClientPolicy(TlsClientPolicy.builder()
   * .validation(TlsValidation.builder()
   * .trust(TlsValidationTrust.file("/keys/local_cert_chain.pem"))
   * .build())
   * .build())
   * .build())
   * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
   * .build();
   * Tags.of(node).add("Environment", "Dev");
   * ```
   */
  public inline fun virtualNodeProps(block: VirtualNodePropsDsl.() -> Unit = {}): VirtualNodeProps {
    val builder = VirtualNodePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * Mesh mesh;
   * VirtualRouter router = mesh.addVirtualRouter("router", VirtualRouterBaseProps.builder()
   * .listeners(List.of(VirtualRouterListener.http(8080)))
   * .build());
   * ```
   */
  public inline fun virtualRouter(
    scope: Construct,
    id: String,
    block: VirtualRouterDsl.() -> Unit = {},
  ): VirtualRouter {
    val builder = VirtualRouterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Interface with properties ncecessary to import a reusable VirtualRouter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * Mesh mesh;
   * VirtualRouterAttributes virtualRouterAttributes = VirtualRouterAttributes.builder()
   * .mesh(mesh)
   * .virtualRouterName("virtualRouterName")
   * .build();
   * ```
   */
  public inline fun virtualRouterAttributes(block: VirtualRouterAttributesDsl.() -> Unit = {}):
      VirtualRouterAttributes {
    val builder = VirtualRouterAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Interface with base properties all routers willl inherit.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * VirtualRouter router = mesh.addVirtualRouter("router", VirtualRouterBaseProps.builder()
   * .listeners(List.of(VirtualRouterListener.http(8080)))
   * .build());
   * ```
   */
  public inline fun virtualRouterBaseProps(block: VirtualRouterBasePropsDsl.() -> Unit = {}):
      VirtualRouterBaseProps {
    val builder = VirtualRouterBasePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a VirtualRouter listener.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualRouterListenerConfig virtualRouterListenerConfig = VirtualRouterListenerConfig.builder()
   * .listener(VirtualRouterListenerProperty.builder()
   * .portMapping(PortMappingProperty.builder()
   * .port(123)
   * .protocol("protocol")
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun virtualRouterListenerConfig(block: VirtualRouterListenerConfigDsl.() -> Unit =
      {}): VirtualRouterListenerConfig {
    val builder = VirtualRouterListenerConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties used when creating a new VirtualRouter.
   *
   * Example:
   *
   * ```
   * Stack infraStack;
   * Stack appStack;
   * Mesh mesh = Mesh.Builder.create(infraStack, "AppMesh")
   * .meshName("myAwsMesh")
   * .egressFilter(MeshFilterType.ALLOW_ALL)
   * .build();
   * // the VirtualRouter will belong to 'appStack',
   * // even though the Mesh belongs to 'infraStack'
   * VirtualRouter router = VirtualRouter.Builder.create(appStack, "router")
   * .mesh(mesh) // notice that mesh is a required property when creating a router with the 'new'
   * statement
   * .listeners(List.of(VirtualRouterListener.http(8081)))
   * .build();
   * ```
   */
  public inline fun virtualRouterProps(block: VirtualRouterPropsDsl.() -> Unit = {}):
      VirtualRouterProps {
    val builder = VirtualRouterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * VirtualService represents a service inside an AppMesh.
   *
   * It routes traffic either to a Virtual Node or to a Virtual Router.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.dns("node"))
   * .build();
   * VirtualService virtualService = VirtualService.Builder.create(this, "service-1")
   * .virtualServiceProvider(VirtualServiceProvider.virtualNode(node))
   * .virtualServiceName("service1.domain.local")
   * .build();
   * node.addBackend(Backend.virtualService(virtualService));
   * ```
   *
   * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_services.html)
   */
  public inline fun virtualService(
    scope: Construct,
    id: String,
    block: VirtualServiceDsl.() -> Unit = {},
  ): VirtualService {
    val builder = VirtualServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Interface with properties ncecessary to import a reusable VirtualService.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * Mesh mesh;
   * VirtualServiceAttributes virtualServiceAttributes = VirtualServiceAttributes.builder()
   * .mesh(mesh)
   * .virtualServiceName("virtualServiceName")
   * .build();
   * ```
   */
  public inline fun virtualServiceAttributes(block: VirtualServiceAttributesDsl.() -> Unit = {}):
      VirtualServiceAttributes {
    val builder = VirtualServiceAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents the properties needed to define a Virtual Service backend.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * MutualTlsCertificate mutualTlsCertificate;
   * SubjectAlternativeNames subjectAlternativeNames;
   * TlsValidationTrust tlsValidationTrust;
   * VirtualServiceBackendOptions virtualServiceBackendOptions =
   * VirtualServiceBackendOptions.builder()
   * .tlsClientPolicy(TlsClientPolicy.builder()
   * .validation(TlsValidation.builder()
   * .trust(tlsValidationTrust)
   * // the properties below are optional
   * .subjectAlternativeNames(subjectAlternativeNames)
   * .build())
   * // the properties below are optional
   * .enforce(false)
   * .mutualTlsCertificate(mutualTlsCertificate)
   * .ports(List.of(123))
   * .build())
   * .build();
   * ```
   */
  public inline fun virtualServiceBackendOptions(block: VirtualServiceBackendOptionsDsl.() -> Unit =
      {}): VirtualServiceBackendOptions {
    val builder = VirtualServiceBackendOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The properties applied to the VirtualService being defined.
   *
   * Example:
   *
   * ```
   * Mesh mesh;
   * VirtualNode node = VirtualNode.Builder.create(this, "node")
   * .mesh(mesh)
   * .serviceDiscovery(ServiceDiscovery.dns("node"))
   * .build();
   * VirtualService virtualService = VirtualService.Builder.create(this, "service-1")
   * .virtualServiceProvider(VirtualServiceProvider.virtualNode(node))
   * .virtualServiceName("service1.domain.local")
   * .build();
   * node.addBackend(Backend.virtualService(virtualService));
   * ```
   */
  public inline fun virtualServiceProps(block: VirtualServicePropsDsl.() -> Unit = {}):
      VirtualServiceProps {
    val builder = VirtualServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a VirtualService provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * Mesh mesh;
   * VirtualServiceProviderConfig virtualServiceProviderConfig =
   * VirtualServiceProviderConfig.builder()
   * .mesh(mesh)
   * // the properties below are optional
   * .virtualNodeProvider(VirtualNodeServiceProviderProperty.builder()
   * .virtualNodeName("virtualNodeName")
   * .build())
   * .virtualRouterProvider(VirtualRouterServiceProviderProperty.builder()
   * .virtualRouterName("virtualRouterName")
   * .build())
   * .build();
   * ```
   */
  public inline fun virtualServiceProviderConfig(block: VirtualServiceProviderConfigDsl.() -> Unit =
      {}): VirtualServiceProviderConfig {
    val builder = VirtualServiceProviderConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for the Weighted Targets in the route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.appmesh.*;
   * VirtualNode virtualNode;
   * WeightedTarget weightedTarget = WeightedTarget.builder()
   * .virtualNode(virtualNode)
   * // the properties below are optional
   * .port(123)
   * .weight(123)
   * .build();
   * ```
   */
  public inline fun weightedTarget(block: WeightedTargetDsl.() -> Unit = {}): WeightedTarget {
    val builder = WeightedTargetDsl()
    builder.apply(block)
    return builder.build()
  }
}
