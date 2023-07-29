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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the specification of a virtual node.
 *
 * Example:
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
@CdkDslMarker
public class CfnVirtualNodeVirtualNodeSpecPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.VirtualNodeSpecProperty.Builder =
        CfnVirtualNode.VirtualNodeSpecProperty.builder()

    private val _backends: MutableList<Any> = mutableListOf()

    private val _listeners: MutableList<Any> = mutableListOf()

    /**
     * @param backendDefaults A reference to an object that represents the defaults for backends.
     */
    public fun backendDefaults(backendDefaults: IResolvable) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    /**
     * @param backendDefaults A reference to an object that represents the defaults for backends.
     */
    public fun backendDefaults(backendDefaults: CfnVirtualNode.BackendDefaultsProperty) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    /**
     * @param backends The backends that the virtual node is expected to send outbound traffic to.
     *
     * App Mesh doesn't validate the existence of those virtual services specified in backends. This
     * is to prevent a cyclic dependency between virtual nodes and virtual services creation. Make
     * sure the virtual service name is correct. The virtual service can be created afterwards if it
     * doesn't already exist.
     */
    public fun backends(vararg backends: Any) {
        _backends.addAll(listOf(*backends))
    }

    /**
     * @param backends The backends that the virtual node is expected to send outbound traffic to.
     *
     * App Mesh doesn't validate the existence of those virtual services specified in backends. This
     * is to prevent a cyclic dependency between virtual nodes and virtual services creation. Make
     * sure the virtual service name is correct. The virtual service can be created afterwards if it
     * doesn't already exist.
     */
    public fun backends(backends: Collection<Any>) {
        _backends.addAll(backends)
    }

    /**
     * @param backends The backends that the virtual node is expected to send outbound traffic to.
     *
     * App Mesh doesn't validate the existence of those virtual services specified in backends. This
     * is to prevent a cyclic dependency between virtual nodes and virtual services creation. Make
     * sure the virtual service name is correct. The virtual service can be created afterwards if it
     * doesn't already exist.
     */
    public fun backends(backends: IResolvable) {
        cdkBuilder.backends(backends)
    }

    /**
     * @param listeners The listener that the virtual node is expected to receive inbound traffic
     *   from. You can specify one listener.
     */
    public fun listeners(vararg listeners: Any) {
        _listeners.addAll(listOf(*listeners))
    }

    /**
     * @param listeners The listener that the virtual node is expected to receive inbound traffic
     *   from. You can specify one listener.
     */
    public fun listeners(listeners: Collection<Any>) {
        _listeners.addAll(listeners)
    }

    /**
     * @param listeners The listener that the virtual node is expected to receive inbound traffic
     *   from. You can specify one listener.
     */
    public fun listeners(listeners: IResolvable) {
        cdkBuilder.listeners(listeners)
    }

    /** @param logging The inbound and outbound access logging information for the virtual node. */
    public fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging)
    }

    /** @param logging The inbound and outbound access logging information for the virtual node. */
    public fun logging(logging: CfnVirtualNode.LoggingProperty) {
        cdkBuilder.logging(logging)
    }

    /**
     * @param serviceDiscovery The service discovery information for the virtual node. If your
     *   virtual node does not expect ingress traffic, you can omit this parameter. If you specify a
     *   `listener` , then you must specify service discovery information.
     */
    public fun serviceDiscovery(serviceDiscovery: IResolvable) {
        cdkBuilder.serviceDiscovery(serviceDiscovery)
    }

    /**
     * @param serviceDiscovery The service discovery information for the virtual node. If your
     *   virtual node does not expect ingress traffic, you can omit this parameter. If you specify a
     *   `listener` , then you must specify service discovery information.
     */
    public fun serviceDiscovery(serviceDiscovery: CfnVirtualNode.ServiceDiscoveryProperty) {
        cdkBuilder.serviceDiscovery(serviceDiscovery)
    }

    public fun build(): CfnVirtualNode.VirtualNodeSpecProperty {
        if (_backends.isNotEmpty()) cdkBuilder.backends(_backends)
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
