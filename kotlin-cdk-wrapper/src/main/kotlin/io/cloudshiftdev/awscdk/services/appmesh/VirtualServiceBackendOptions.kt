@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface VirtualServiceBackendOptions {
  public fun tlsClientPolicy(): TlsClientPolicy? =
      unwrap(this).getTlsClientPolicy()?.let(TlsClientPolicy::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7088fe453c32d32cf94952126da458090c76dae9149f3c2aedf01918c5d22594")
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions.Builder =
        software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions.builder()

    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
      cdkBuilder.tlsClientPolicy(tlsClientPolicy.let(TlsClientPolicy::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7088fe453c32d32cf94952126da458090c76dae9149f3c2aedf01918c5d22594")
    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit): Unit =
        tlsClientPolicy(TlsClientPolicy(tlsClientPolicy))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions,
  ) : CdkObject(cdkObject), VirtualServiceBackendOptions {
    override fun tlsClientPolicy(): TlsClientPolicy? =
        unwrap(this).getTlsClientPolicy()?.let(TlsClientPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceBackendOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions):
        VirtualServiceBackendOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualServiceBackendOptions):
        software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualServiceBackendOptions
  }
}
