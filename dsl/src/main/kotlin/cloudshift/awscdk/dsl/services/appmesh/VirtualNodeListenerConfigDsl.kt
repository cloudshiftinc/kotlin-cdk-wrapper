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
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig

/**
 * Properties for a VirtualNode listener.
 *
 * Example:
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
@CdkDslMarker
public class VirtualNodeListenerConfigDsl {
    private val cdkBuilder: VirtualNodeListenerConfig.Builder = VirtualNodeListenerConfig.builder()

    /** @param listener Single listener config for a VirtualNode. */
    public fun listener(listener: CfnVirtualNodeListenerPropertyDsl.() -> Unit = {}) {
        val builder = CfnVirtualNodeListenerPropertyDsl()
        builder.apply(listener)
        cdkBuilder.listener(builder.build())
    }

    /** @param listener Single listener config for a VirtualNode. */
    public fun listener(listener: CfnVirtualNode.ListenerProperty) {
        cdkBuilder.listener(listener)
    }

    public fun build(): VirtualNodeListenerConfig = cdkBuilder.build()
}
