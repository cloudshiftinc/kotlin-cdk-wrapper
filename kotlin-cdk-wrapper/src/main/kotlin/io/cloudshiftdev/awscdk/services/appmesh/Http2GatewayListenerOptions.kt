@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the properties needed to define HTTP2 Listeners for a VirtualGateway.
 *
 * Example:
 *
 * ```
 * // A Virtual Node with listener TLS from an ACM provided certificate
 * Certificate cert;
 * Mesh mesh;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.dns("node"))
 * .listeners(List.of(VirtualNodeListener.grpc(GrpcVirtualNodeListenerOptions.builder()
 * .port(80)
 * .tls(ListenerTlsOptions.builder()
 * .mode(TlsMode.STRICT)
 * .certificate(TlsCertificate.acm(cert))
 * .build())
 * .build())))
 * .build();
 * // A Virtual Gateway with listener TLS from a customer provided file certificate
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
 * .port(8080)
 * .tls(ListenerTlsOptions.builder()
 * .mode(TlsMode.STRICT)
 * .certificate(TlsCertificate.file("path/to/certChain", "path/to/privateKey"))
 * .build())
 * .build())))
 * .virtualGatewayName("gateway")
 * .build();
 * // A Virtual Gateway with listener TLS from a SDS provided certificate
 * VirtualGateway gateway2 = VirtualGateway.Builder.create(this, "gateway2")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.http2(Http2GatewayListenerOptions.builder()
 * .port(8080)
 * .tls(ListenerTlsOptions.builder()
 * .mode(TlsMode.STRICT)
 * .certificate(TlsCertificate.sds("secrete_certificate"))
 * .build())
 * .build())))
 * .virtualGatewayName("gateway2")
 * .build();
 * ```
 */
public interface Http2GatewayListenerOptions {
  /**
   * Connection pool for http listeners.
   *
   * Default: - None
   */
  public fun connectionPool(): Http2ConnectionPool? =
      unwrap(this).getConnectionPool()?.let(Http2ConnectionPool::wrap)

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
   * A builder for [Http2GatewayListenerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionPool Connection pool for http listeners.
     */
    public fun connectionPool(connectionPool: Http2ConnectionPool)

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cac8137abf16333a56f9061788721ce4b7a07d823920b31026bb9ccdef8f6f9")
    public fun connectionPool(connectionPool: Http2ConnectionPool.Builder.() -> Unit)

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
    @JvmName("c102f53c07b47df3e244c6c67bcc26dbf3703c3897a56d4edf16ca1d61cb1e72")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions.builder()

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    override fun connectionPool(connectionPool: Http2ConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(Http2ConnectionPool.Companion::unwrap))
    }

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cac8137abf16333a56f9061788721ce4b7a07d823920b31026bb9ccdef8f6f9")
    override fun connectionPool(connectionPool: Http2ConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(Http2ConnectionPool(connectionPool))

    /**
     * @param healthCheck The health check information for the listener.
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck.Companion::unwrap))
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
      cdkBuilder.tls(tls.let(ListenerTlsOptions.Companion::unwrap))
    }

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c102f53c07b47df3e244c6c67bcc26dbf3703c3897a56d4edf16ca1d61cb1e72")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions,
  ) : CdkObject(cdkObject), Http2GatewayListenerOptions {
    /**
     * Connection pool for http listeners.
     *
     * Default: - None
     */
    override fun connectionPool(): Http2ConnectionPool? =
        unwrap(this).getConnectionPool()?.let(Http2ConnectionPool::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): Http2GatewayListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions):
        Http2GatewayListenerOptions = CdkObjectWrappers.wrap(cdkObject) as?
        Http2GatewayListenerOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Http2GatewayListenerOptions):
        software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions
  }
}
