package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BackendDefaults {
  /**
   * TLS properties for Client policy for backend defaults.
   *
   * Default: - none
   */
  public fun tlsClientPolicy(): TlsClientPolicy? =
      unwrap(this).getTlsClientPolicy()?.let(TlsClientPolicy::wrap)

  /**
   * A builder for [BackendDefaults]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tlsClientPolicy TLS properties for Client policy for backend defaults.
     */
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy)

    /**
     * @param tlsClientPolicy TLS properties for Client policy for backend defaults.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e996c14c629bc229d00dc4ace25d0993cc82bf53577c0120d82f87798f45e5ca")
    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.BackendDefaults.Builder =
        software.amazon.awscdk.services.appmesh.BackendDefaults.builder()

    /**
     * @param tlsClientPolicy TLS properties for Client policy for backend defaults.
     */
    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
      cdkBuilder.tlsClientPolicy(tlsClientPolicy.let(TlsClientPolicy::unwrap))
    }

    /**
     * @param tlsClientPolicy TLS properties for Client policy for backend defaults.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e996c14c629bc229d00dc4ace25d0993cc82bf53577c0120d82f87798f45e5ca")
    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit): Unit =
        tlsClientPolicy(TlsClientPolicy(tlsClientPolicy))

    public fun build(): software.amazon.awscdk.services.appmesh.BackendDefaults = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.BackendDefaults,
  ) : CdkObject(cdkObject), BackendDefaults {
    /**
     * TLS properties for Client policy for backend defaults.
     *
     * Default: - none
     */
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
