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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents a listener for a virtual gateway.
 *
 * Example:
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
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerProperty.Builder =
        CfnVirtualGateway.VirtualGatewayListenerProperty.builder()

    /** @param connectionPool The connection pool information for the listener. */
    public fun connectionPool(connectionPool: IResolvable) {
        cdkBuilder.connectionPool(connectionPool)
    }

    /** @param connectionPool The connection pool information for the listener. */
    public fun connectionPool(
        connectionPool: CfnVirtualGateway.VirtualGatewayConnectionPoolProperty
    ) {
        cdkBuilder.connectionPool(connectionPool)
    }

    /** @param healthCheck The health check information for the listener. */
    public fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /** @param healthCheck The health check information for the listener. */
    public fun healthCheck(healthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /** @param portMapping The port mapping information for the listener. */
    public fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping)
    }

    /** @param portMapping The port mapping information for the listener. */
    public fun portMapping(portMapping: CfnVirtualGateway.VirtualGatewayPortMappingProperty) {
        cdkBuilder.portMapping(portMapping)
    }

    /**
     * @param tls A reference to an object that represents the Transport Layer Security (TLS)
     *   properties for the listener.
     */
    public fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls)
    }

    /**
     * @param tls A reference to an object that represents the Transport Layer Security (TLS)
     *   properties for the listener.
     */
    public fun tls(tls: CfnVirtualGateway.VirtualGatewayListenerTlsProperty) {
        cdkBuilder.tls(tls)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayListenerProperty = cdkBuilder.build()
}
