@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Represents the properties needed to define client policy.
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
public interface TlsClientPolicy {
  /**
   * Whether the policy is enforced.
   *
   * Default: true
   */
  public fun enforce(): Boolean? = unwrap(this).getEnforce()

  /**
   * Represents a client TLS certificate.
   *
   * The certificate will be sent only if the server requests it, enabling mutual TLS.
   *
   * Default: - client TLS certificate is not provided
   */
  public fun mutualTlsCertificate(): MutualTlsCertificate? =
      unwrap(this).getMutualTlsCertificate()?.let(MutualTlsCertificate::wrap)

  /**
   * TLS is enforced on the ports specified here.
   *
   * If no ports are specified, TLS will be enforced on all the ports.
   *
   * Default: - all ports
   */
  public fun ports(): List<Number> = unwrap(this).getPorts() ?: emptyList()

  /**
   * Represents the object for TLS validation context.
   */
  public fun validation(): TlsValidation

  /**
   * A builder for [TlsClientPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enforce Whether the policy is enforced.
     */
    public fun enforce(enforce: Boolean)

    /**
     * @param mutualTlsCertificate Represents a client TLS certificate.
     * The certificate will be sent only if the server requests it, enabling mutual TLS.
     */
    public fun mutualTlsCertificate(mutualTlsCertificate: MutualTlsCertificate)

    /**
     * @param ports TLS is enforced on the ports specified here.
     * If no ports are specified, TLS will be enforced on all the ports.
     */
    public fun ports(ports: List<Number>)

    /**
     * @param ports TLS is enforced on the ports specified here.
     * If no ports are specified, TLS will be enforced on all the ports.
     */
    public fun ports(vararg ports: Number)

    /**
     * @param validation Represents the object for TLS validation context. 
     */
    public fun validation(validation: TlsValidation)

    /**
     * @param validation Represents the object for TLS validation context. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5dff341066282c8ab2a7042b826ea2289f0fd8205afe8a4d9debc6a31761dcca")
    public fun validation(validation: TlsValidation.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TlsClientPolicy.Builder =
        software.amazon.awscdk.services.appmesh.TlsClientPolicy.builder()

    /**
     * @param enforce Whether the policy is enforced.
     */
    override fun enforce(enforce: Boolean) {
      cdkBuilder.enforce(enforce)
    }

    /**
     * @param mutualTlsCertificate Represents a client TLS certificate.
     * The certificate will be sent only if the server requests it, enabling mutual TLS.
     */
    override fun mutualTlsCertificate(mutualTlsCertificate: MutualTlsCertificate) {
      cdkBuilder.mutualTlsCertificate(mutualTlsCertificate.let(MutualTlsCertificate::unwrap))
    }

    /**
     * @param ports TLS is enforced on the ports specified here.
     * If no ports are specified, TLS will be enforced on all the ports.
     */
    override fun ports(ports: List<Number>) {
      cdkBuilder.ports(ports)
    }

    /**
     * @param ports TLS is enforced on the ports specified here.
     * If no ports are specified, TLS will be enforced on all the ports.
     */
    override fun ports(vararg ports: Number): Unit = ports(ports.toList())

    /**
     * @param validation Represents the object for TLS validation context. 
     */
    override fun validation(validation: TlsValidation) {
      cdkBuilder.validation(validation.let(TlsValidation::unwrap))
    }

    /**
     * @param validation Represents the object for TLS validation context. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5dff341066282c8ab2a7042b826ea2289f0fd8205afe8a4d9debc6a31761dcca")
    override fun validation(validation: TlsValidation.Builder.() -> Unit): Unit =
        validation(TlsValidation(validation))

    public fun build(): software.amazon.awscdk.services.appmesh.TlsClientPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TlsClientPolicy,
  ) : CdkObject(cdkObject), TlsClientPolicy {
    /**
     * Whether the policy is enforced.
     *
     * Default: true
     */
    override fun enforce(): Boolean? = unwrap(this).getEnforce()

    /**
     * Represents a client TLS certificate.
     *
     * The certificate will be sent only if the server requests it, enabling mutual TLS.
     *
     * Default: - client TLS certificate is not provided
     */
    override fun mutualTlsCertificate(): MutualTlsCertificate? =
        unwrap(this).getMutualTlsCertificate()?.let(MutualTlsCertificate::wrap)

    /**
     * TLS is enforced on the ports specified here.
     *
     * If no ports are specified, TLS will be enforced on all the ports.
     *
     * Default: - all ports
     */
    override fun ports(): List<Number> = unwrap(this).getPorts() ?: emptyList()

    /**
     * Represents the object for TLS validation context.
     */
    override fun validation(): TlsValidation = unwrap(this).getValidation().let(TlsValidation::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TlsClientPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsClientPolicy):
        TlsClientPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TlsClientPolicy):
        software.amazon.awscdk.services.appmesh.TlsClientPolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.TlsClientPolicy
  }
}
