@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for a VirtualGateway listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
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
public interface VirtualGatewayListenerConfig {
  /**
   * Single listener config for a VirtualGateway.
   */
  public fun listener(): CfnVirtualGateway.VirtualGatewayListenerProperty

  /**
   * A builder for [VirtualGatewayListenerConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param listener Single listener config for a VirtualGateway. 
     */
    public fun listener(listener: CfnVirtualGateway.VirtualGatewayListenerProperty)

    /**
     * @param listener Single listener config for a VirtualGateway. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ae19caa59030aae0ac021b242b35f65b707171c469e9b1b6ea6443eaad8a0e5")
    public
        fun listener(listener: CfnVirtualGateway.VirtualGatewayListenerProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig.Builder =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig.builder()

    /**
     * @param listener Single listener config for a VirtualGateway. 
     */
    override fun listener(listener: CfnVirtualGateway.VirtualGatewayListenerProperty) {
      cdkBuilder.listener(listener.let(CfnVirtualGateway.VirtualGatewayListenerProperty::unwrap))
    }

    /**
     * @param listener Single listener config for a VirtualGateway. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ae19caa59030aae0ac021b242b35f65b707171c469e9b1b6ea6443eaad8a0e5")
    override
        fun listener(listener: CfnVirtualGateway.VirtualGatewayListenerProperty.Builder.() -> Unit):
        Unit = listener(CfnVirtualGateway.VirtualGatewayListenerProperty(listener))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig,
  ) : CdkObject(cdkObject), VirtualGatewayListenerConfig {
    /**
     * Single listener config for a VirtualGateway.
     */
    override fun listener(): CfnVirtualGateway.VirtualGatewayListenerProperty =
        unwrap(this).getListener().let(CfnVirtualGateway.VirtualGatewayListenerProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewayListenerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig):
        VirtualGatewayListenerConfig = CdkObjectWrappers.wrap(cdkObject) as?
        VirtualGatewayListenerConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualGatewayListenerConfig):
        software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig
  }
}
