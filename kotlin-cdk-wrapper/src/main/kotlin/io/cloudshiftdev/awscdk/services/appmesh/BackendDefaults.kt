@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the properties needed to define backend defaults.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * Service service;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(8080)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .healthyThreshold(3)
 * .interval(Duration.seconds(5))
 * .path("/ping")
 * .timeout(Duration.seconds(2))
 * .unhealthyThreshold(2)
 * .build()))
 * .timeout(HttpTimeout.builder()
 * .idle(Duration.seconds(5))
 * .build())
 * .build())))
 * .backendDefaults(BackendDefaults.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .validation(TlsValidation.builder()
 * .trust(TlsValidationTrust.file("/keys/local_cert_chain.pem"))
 * .build())
 * .build())
 * .build())
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .build();
 * Tags.of(node).add("Environment", "Dev");
 * ```
 */
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.tlsClientPolicy(tlsClientPolicy.let(TlsClientPolicy.Companion::unwrap))
    }

    /**
     * @param tlsClientPolicy TLS properties for Client policy for backend defaults.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e996c14c629bc229d00dc4ace25d0993cc82bf53577c0120d82f87798f45e5ca")
    override fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy.Builder.() -> Unit): Unit =
        tlsClientPolicy(TlsClientPolicy(tlsClientPolicy))

    public fun build(): software.amazon.awscdk.services.appmesh.BackendDefaults = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.BackendDefaults,
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
        BackendDefaults = CdkObjectWrappers.wrap(cdkObject) as? BackendDefaults ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackendDefaults):
        software.amazon.awscdk.services.appmesh.BackendDefaults = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.BackendDefaults
  }
}
