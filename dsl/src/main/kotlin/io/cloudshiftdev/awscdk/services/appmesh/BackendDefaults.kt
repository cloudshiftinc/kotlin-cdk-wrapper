package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BackendDefaults {
  public fun tlsClientPolicy(): TlsClientPolicy? =
      unwrap(this).getTlsClientPolicy()?.let(TlsClientPolicy::wrap)

  public interface Builder {
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e996c14c629bc229d00dc4ace25d0993cc82bf53577c0120d82f87798f45e5ca")
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.BackendDefaults.Builder =
        software.amazon.awscdk.services.appmesh.BackendDefaults.builder()

    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
      cdkBuilder.tlsClientPolicy(tlsClientPolicy.let(TlsClientPolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e996c14c629bc229d00dc4ace25d0993cc82bf53577c0120d82f87798f45e5ca")
    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit): Unit =
        tlsClientPolicy(TlsClientPolicy(tlsClientPolicy))

    public fun build(): software.amazon.awscdk.services.appmesh.BackendDefaults = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.BackendDefaults,
  ) : BackendDefaults {
    override fun tlsClientPolicy(): TlsClientPolicy? =
        unwrap(this).getTlsClientPolicy()?.let(TlsClientPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BackendDefaults {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.BackendDefaults):
        BackendDefaults = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackendDefaults):
        software.amazon.awscdk.services.appmesh.BackendDefaults = (wrapped as Wrapper).cdkObject
  }
}
