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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents a listener for a virtual node.
 *
 * Example:
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
@CdkDslMarker
public class CfnVirtualNodeListenerPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerProperty.Builder =
        CfnVirtualNode.ListenerProperty.builder()

    /** @param connectionPool The connection pool information for the listener. */
    public fun connectionPool(connectionPool: IResolvable) {
        cdkBuilder.connectionPool(connectionPool)
    }

    /** @param connectionPool The connection pool information for the listener. */
    public fun connectionPool(connectionPool: CfnVirtualNode.VirtualNodeConnectionPoolProperty) {
        cdkBuilder.connectionPool(connectionPool)
    }

    /** @param healthCheck The health check information for the listener. */
    public fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /** @param healthCheck The health check information for the listener. */
    public fun healthCheck(healthCheck: CfnVirtualNode.HealthCheckProperty) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /** @param outlierDetection The outlier detection information for the listener. */
    public fun outlierDetection(outlierDetection: IResolvable) {
        cdkBuilder.outlierDetection(outlierDetection)
    }

    /** @param outlierDetection The outlier detection information for the listener. */
    public fun outlierDetection(outlierDetection: CfnVirtualNode.OutlierDetectionProperty) {
        cdkBuilder.outlierDetection(outlierDetection)
    }

    /** @param portMapping The port mapping information for the listener. */
    public fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping)
    }

    /** @param portMapping The port mapping information for the listener. */
    public fun portMapping(portMapping: CfnVirtualNode.PortMappingProperty) {
        cdkBuilder.portMapping(portMapping)
    }

    /** @param timeout An object that represents timeouts for different protocols. */
    public fun timeout(timeout: IResolvable) {
        cdkBuilder.timeout(timeout)
    }

    /** @param timeout An object that represents timeouts for different protocols. */
    public fun timeout(timeout: CfnVirtualNode.ListenerTimeoutProperty) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param tls A reference to an object that represents the Transport Layer Security (TLS)
     *   properties for a listener.
     */
    public fun tls(tls: IResolvable) {
        cdkBuilder.tls(tls)
    }

    /**
     * @param tls A reference to an object that represents the Transport Layer Security (TLS)
     *   properties for a listener.
     */
    public fun tls(tls: CfnVirtualNode.ListenerTlsProperty) {
        cdkBuilder.tls(tls)
    }

    public fun build(): CfnVirtualNode.ListenerProperty = cdkBuilder.build()
}
