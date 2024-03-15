@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface TlsCertificateConfig {
  public fun tlsCertificate(): CfnVirtualNode.ListenerTlsCertificateProperty

  @CdkDslMarker
  public interface Builder {
    public fun tlsCertificate(tlsCertificate: CfnVirtualNode.ListenerTlsCertificateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02dbfb837280fdac52206b09a351538961e07b762c00eb82064d2ea26299024e")
    public
        fun tlsCertificate(tlsCertificate: CfnVirtualNode.ListenerTlsCertificateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TlsCertificateConfig.Builder =
        software.amazon.awscdk.services.appmesh.TlsCertificateConfig.builder()

    override fun tlsCertificate(tlsCertificate: CfnVirtualNode.ListenerTlsCertificateProperty) {
      cdkBuilder.tlsCertificate(tlsCertificate.let(CfnVirtualNode.ListenerTlsCertificateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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