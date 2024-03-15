@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BackendDefaults {
  public fun tlsClientPolicy(): TlsClientPolicy? =
      unwrap(this).getTlsClientPolicy()?.let(TlsClientPolicy::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e996c14c629bc229d00dc4ace25d0993cc82bf53577c0120d82f87798f45e5ca")
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.BackendDefaults.Builder =
        software.amazon.awscdk.services.appmesh.BackendDefaults.builder()

    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
      cdkBuilder.tlsClientPolicy(tlsClientPolicy.let(TlsClientPolicy::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e996c14c629bc229d00dc4ace25d0993cc82bf53577c0120d82f87798f45e5ca")
    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit): Unit =
        tlsClientPolicy(TlsClientPolicy(tlsClientPolicy))

    public fun build(): software.amazon.awscdk.services.appmesh.BackendDefaults = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.BackendDefaults,
  ) : CdkObject(cdkObject), BackendDefaults {
    override fun tlsClientPolicy(): TlsClientPolicy? =
        unwrap(this).getTlsClientPolicy()?.let(TlsClientPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackendDefaults {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.BackendDefaults):
        BackendDefaults = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackendDefaults):
        software.amazon.awscdk.services.appmesh.BackendDefaults = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.BackendDefaults
  }
}
