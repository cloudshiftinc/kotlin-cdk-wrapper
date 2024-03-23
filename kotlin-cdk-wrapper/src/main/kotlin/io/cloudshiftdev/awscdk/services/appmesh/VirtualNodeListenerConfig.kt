@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for a VirtualNode listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
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
public interface VirtualNodeListenerConfig {
  /**
   * Single listener config for a VirtualNode.
   */
  public fun listener(): CfnVirtualNode.ListenerProperty

  /**
   * A builder for [VirtualNodeListenerConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param listener Single listener config for a VirtualNode. 
     */
    public fun listener(listener: CfnVirtualNode.ListenerProperty)

    /**
     * @param listener Single listener config for a VirtualNode. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a3f8b2f835cee2bab65592bbbe7a640bd1efacf36487c07f3a471b288d59450")
    public fun listener(listener: CfnVirtualNode.ListenerProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig.Builder =
        software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig.builder()

    /**
     * @param listener Single listener config for a VirtualNode. 
     */
    override fun listener(listener: CfnVirtualNode.ListenerProperty) {
      cdkBuilder.listener(listener.let(CfnVirtualNode.ListenerProperty::unwrap))
    }

    /**
     * @param listener Single listener config for a VirtualNode. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a3f8b2f835cee2bab65592bbbe7a640bd1efacf36487c07f3a471b288d59450")
    override fun listener(listener: CfnVirtualNode.ListenerProperty.Builder.() -> Unit): Unit =
        listener(CfnVirtualNode.ListenerProperty(listener))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig,
  ) : CdkObject(cdkObject), VirtualNodeListenerConfig {
    /**
     * Single listener config for a VirtualNode.
     */
    override fun listener(): CfnVirtualNode.ListenerProperty =
        unwrap(this).getListener().let(CfnVirtualNode.ListenerProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualNodeListenerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig):
        VirtualNodeListenerConfig = CdkObjectWrappers.wrap(cdkObject) as? VirtualNodeListenerConfig
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualNodeListenerConfig):
        software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig
  }
}
