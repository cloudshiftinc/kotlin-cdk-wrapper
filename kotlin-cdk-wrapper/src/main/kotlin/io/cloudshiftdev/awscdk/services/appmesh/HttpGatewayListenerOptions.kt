@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the properties needed to define HTTP Listeners for a VirtualGateway.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * String certificateAuthorityArn =
 * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012";
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.http(HttpGatewayListenerOptions.builder()
 * .port(443)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .interval(Duration.seconds(10))
 * .build()))
 * .build())))
 * .backendDefaults(BackendDefaults.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .ports(List.of(8080, 8081))
 * .validation(TlsValidation.builder()
 * .trust(TlsValidationTrust.acm(List.of(CertificateAuthority.fromCertificateAuthorityArn(this,
 * "certificate", certificateAuthorityArn))))
 * .build())
 * .build())
 * .build())
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .virtualGatewayName("virtualGateway")
 * .build();
 * ```
 */
public interface HttpGatewayListenerOptions {
  /**
   * Connection pool for http listeners.
   *
   * Default: - None
   */
  public fun connectionPool(): HttpConnectionPool? =
      unwrap(this).getConnectionPool()?.let(HttpConnectionPool::wrap)

  /**
   * The health check information for the listener.
   *
   * Default: - no healthcheck
   */
  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  /**
   * Port to listen for connections on.
   *
   * Default: - 8080
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * Represents the configuration for enabling TLS on a listener.
   *
   * Default: - none
   */
  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  /**
   * A builder for [HttpGatewayListenerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionPool Connection pool for http listeners.
     */
    public fun connectionPool(connectionPool: HttpConnectionPool)

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1456b4806c467b496e17dc162a206c03d4db27eea70e56e0a9f61313d7ef3f49")
    public fun connectionPool(connectionPool: HttpConnectionPool.Builder.() -> Unit)

    /**
     * @param healthCheck The health check information for the listener.
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * @param port Port to listen for connections on.
     */
    public fun port(port: Number)

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    public fun tls(tls: ListenerTlsOptions)

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7bba94bb4ff504931cd3491e0e09cc730140a309dcf29e2573741bb345649eb")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions.builder()

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    override fun connectionPool(connectionPool: HttpConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(HttpConnectionPool::unwrap))
    }

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1456b4806c467b496e17dc162a206c03d4db27eea70e56e0a9f61313d7ef3f49")
    override fun connectionPool(connectionPool: HttpConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(HttpConnectionPool(connectionPool))

    /**
     * @param healthCheck The health check information for the listener.
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    /**
     * @param port Port to listen for connections on.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    override fun tls(tls: ListenerTlsOptions) {
      cdkBuilder.tls(tls.let(ListenerTlsOptions::unwrap))
    }

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7bba94bb4ff504931cd3491e0e09cc730140a309dcf29e2573741bb345649eb")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions,
  ) : CdkObject(cdkObject), HttpGatewayListenerOptions {
    /**
     * Connection pool for http listeners.
     *
     * Default: - None
     */
    override fun connectionPool(): HttpConnectionPool? =
        unwrap(this).getConnectionPool()?.let(HttpConnectionPool::wrap)

    /**
     * The health check information for the listener.
     *
     * Default: - no healthcheck
     */
    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    /**
     * Port to listen for connections on.
     *
     * Default: - 8080
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * Represents the configuration for enabling TLS on a listener.
     *
     * Default: - none
     */
    override fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions):
        HttpGatewayListenerOptions = CdkObjectWrappers.wrap(cdkObject) as?
        HttpGatewayListenerOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayListenerOptions):
        software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions
  }
}
