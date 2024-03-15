@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface TlsValidationTrustConfig {
  public fun tlsValidationTrust(): CfnVirtualNode.TlsValidationContextTrustProperty

  @CdkDslMarker
  public interface Builder {
    public
        fun tlsValidationTrust(tlsValidationTrust: CfnVirtualNode.TlsValidationContextTrustProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3761029aeee45f9e93536bbc797ae362b78e888146f6ea5e2b3da424f3578ec")
    public
        fun tlsValidationTrust(tlsValidationTrust: CfnVirtualNode.TlsValidationContextTrustProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig.Builder
        = software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig.builder()

    override
        fun tlsValidationTrust(tlsValidationTrust: CfnVirtualNode.TlsValidationContextTrustProperty) {
      cdkBuilder.tlsValidationTrust(tlsValidationTrust.let(CfnVirtualNode.TlsValidationContextTrustProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3761029aeee45f9e93536bbc797ae362b78e888146f6ea5e2b3da424f3578ec")
    override
        fun tlsValidationTrust(tlsValidationTrust: CfnVirtualNode.TlsValidationContextTrustProperty.Builder.() -> Unit):
        Unit =
        tlsValidationTrust(CfnVirtualNode.TlsValidationContextTrustProperty(tlsValidationTrust))

    public fun build(): software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig,
  ) : CdkObject(cdkObject), TlsValidationTrustConfig {
    override fun tlsValidationTrust(): CfnVirtualNode.TlsValidationContextTrustProperty =
        unwrap(this).getTlsValidationTrust().let(CfnVirtualNode.TlsValidationContextTrustProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TlsValidationTrustConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig):
        TlsValidationTrustConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsValidationTrustConfig):
        software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.TlsValidationTrustConfig
  }
}
