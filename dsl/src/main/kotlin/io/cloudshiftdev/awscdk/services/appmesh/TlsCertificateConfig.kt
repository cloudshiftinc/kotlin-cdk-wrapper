package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.tlsCertificate(tlsCertificate.let(CfnVirtualNode.ListenerTlsCertificateProperty::unwrap))
    }

    /**
     * @param tlsCertificate The CFN shape for a TLS certificate. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02dbfb837280fdac52206b09a351538961e07b762c00eb82064d2ea26299024e")
    override
        fun tlsCertificate(tlsCertificate: CfnVirtualNode.ListenerTlsCertificateProperty.Builder.() -> Unit):
        Unit = tlsCertificate(CfnVirtualNode.ListenerTlsCertificateProperty(tlsCertificate))

    public fun build(): software.amazon.awscdk.services.appmesh.TlsCertificateConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TlsCertificateConfig,
  ) : CdkObject(cdkObject), TlsCertificateConfig {
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
        TlsCertificateConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsCertificateConfig):
        software.amazon.awscdk.services.appmesh.TlsCertificateConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.TlsCertificateConfig
  }
}
