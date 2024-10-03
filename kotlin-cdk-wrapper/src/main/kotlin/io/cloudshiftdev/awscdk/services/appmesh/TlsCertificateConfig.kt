@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A wrapper for the tls config returned by `TlsCertificate.bind`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
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
public interface TlsCertificateConfig {
  /**
   * The CFN shape for a TLS certificate.
   */
  public fun tlsCertificate(): CfnVirtualNode.ListenerTlsCertificateProperty

  /**
   * A builder for [TlsCertificateConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tlsCertificate The CFN shape for a TLS certificate. 
     */
    public fun tlsCertificate(tlsCertificate: CfnVirtualNode.ListenerTlsCertificateProperty)

    /**
     * @param tlsCertificate The CFN shape for a TLS certificate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02dbfb837280fdac52206b09a351538961e07b762c00eb82064d2ea26299024e")
    public
        fun tlsCertificate(tlsCertificate: CfnVirtualNode.ListenerTlsCertificateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TlsCertificateConfig.Builder =
        software.amazon.awscdk.services.appmesh.TlsCertificateConfig.builder()

    /**
     * @param tlsCertificate The CFN shape for a TLS certificate. 
     */
    override fun tlsCertificate(tlsCertificate: CfnVirtualNode.ListenerTlsCertificateProperty) {
      cdkBuilder.tlsCertificate(tlsCertificate.let(CfnVirtualNode.ListenerTlsCertificateProperty.Companion::unwrap))
    }

    /**
     * @param tlsCertificate The CFN shape for a TLS certificate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02dbfb837280fdac52206b09a351538961e07b762c00eb82064d2ea26299024e")
    override
        fun tlsCertificate(tlsCertificate: CfnVirtualNode.ListenerTlsCertificateProperty.Builder.() -> Unit):
        Unit = tlsCertificate(CfnVirtualNode.ListenerTlsCertificateProperty(tlsCertificate))

    public fun build(): software.amazon.awscdk.services.appmesh.TlsCertificateConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.TlsCertificateConfig,
  ) : CdkObject(cdkObject),
      TlsCertificateConfig {
    /**
     * The CFN shape for a TLS certificate.
     */
    override fun tlsCertificate(): CfnVirtualNode.ListenerTlsCertificateProperty =
        unwrap(this).getTlsCertificate().let(CfnVirtualNode.ListenerTlsCertificateProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TlsCertificateConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsCertificateConfig):
        TlsCertificateConfig = CdkObjectWrappers.wrap(cdkObject) as? TlsCertificateConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsCertificateConfig):
        software.amazon.awscdk.services.appmesh.TlsCertificateConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.TlsCertificateConfig
  }
}
