@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represent the GRPC Node Listener property.
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
public interface GrpcVirtualNodeListenerOptions {
  /**
   * Connection pool for http listeners.
   *
   * Default: - None
   */
  public fun connectionPool(): GrpcConnectionPool? =
      unwrap(this).getConnectionPool()?.let(GrpcConnectionPool::wrap)

  /**
   * The health check information for the listener.
   *
   * Default: - no healthcheck
   */
  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  /**
   * Represents the configuration for enabling outlier detection.
   *
   * Default: - none
   */
  public fun outlierDetection(): OutlierDetection? =
      unwrap(this).getOutlierDetection()?.let(OutlierDetection::wrap)

  /**
   * Port to listen for connections on.
   *
   * Default: - 8080
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * Timeout for GRPC protocol.
   *
   * Default: - None
   */
  public fun timeout(): GrpcTimeout? = unwrap(this).getTimeout()?.let(GrpcTimeout::wrap)

  /**
   * Represents the configuration for enabling TLS on a listener.
   *
   * Default: - none
   */
  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  /**
   * A builder for [GrpcVirtualNodeListenerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionPool Connection pool for http listeners.
     */
    public fun connectionPool(connectionPool: GrpcConnectionPool)

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("029b9b62a41a94ab8c0a92ec47c8d2ac4af468328897cd9bfdc3cc663bc0c21a")
    public fun connectionPool(connectionPool: GrpcConnectionPool.Builder.() -> Unit)

    /**
     * @param healthCheck The health check information for the listener.
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * @param outlierDetection Represents the configuration for enabling outlier detection.
     */
    public fun outlierDetection(outlierDetection: OutlierDetection)

    /**
     * @param outlierDetection Represents the configuration for enabling outlier detection.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("201447d523681eb002639ce5f2ec486b6b3294da3aafbb099284643e2361499b")
    public fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit)

    /**
     * @param port Port to listen for connections on.
     */
    public fun port(port: Number)

    /**
     * @param timeout Timeout for GRPC protocol.
     */
    public fun timeout(timeout: GrpcTimeout)

    /**
     * @param timeout Timeout for GRPC protocol.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e438eb6d668b5fff2c0b4e6ceaade97973cb6fa8e313c1e450bf4e2ea74c6ee3")
    public fun timeout(timeout: GrpcTimeout.Builder.() -> Unit)

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    public fun tls(tls: ListenerTlsOptions)

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d5bac7408fcbf6e05a2c671fc54822659ebfcbcd553225b711b65904c360fb")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions.builder()

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    override fun connectionPool(connectionPool: GrpcConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(GrpcConnectionPool.Companion::unwrap))
    }

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("029b9b62a41a94ab8c0a92ec47c8d2ac4af468328897cd9bfdc3cc663bc0c21a")
    override fun connectionPool(connectionPool: GrpcConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(GrpcConnectionPool(connectionPool))

    /**
     * @param healthCheck The health check information for the listener.
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck.Companion::unwrap))
    }

    /**
     * @param outlierDetection Represents the configuration for enabling outlier detection.
     */
    override fun outlierDetection(outlierDetection: OutlierDetection) {
      cdkBuilder.outlierDetection(outlierDetection.let(OutlierDetection.Companion::unwrap))
    }

    /**
     * @param outlierDetection Represents the configuration for enabling outlier detection.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("201447d523681eb002639ce5f2ec486b6b3294da3aafbb099284643e2361499b")
    override fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit): Unit =
        outlierDetection(OutlierDetection(outlierDetection))

    /**
     * @param port Port to listen for connections on.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param timeout Timeout for GRPC protocol.
     */
    override fun timeout(timeout: GrpcTimeout) {
      cdkBuilder.timeout(timeout.let(GrpcTimeout.Companion::unwrap))
    }

    /**
     * @param timeout Timeout for GRPC protocol.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e438eb6d668b5fff2c0b4e6ceaade97973cb6fa8e313c1e450bf4e2ea74c6ee3")
    override fun timeout(timeout: GrpcTimeout.Builder.() -> Unit): Unit =
        timeout(GrpcTimeout(timeout))

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
    @JvmName("95d5bac7408fcbf6e05a2c671fc54822659ebfcbcd553225b711b65904c360fb")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions,
  ) : CdkObject(cdkObject),
      GrpcVirtualNodeListenerOptions {
    /**
     * Connection pool for http listeners.
     *
     * Default: - None
     */
    override fun connectionPool(): GrpcConnectionPool? =
        unwrap(this).getConnectionPool()?.let(GrpcConnectionPool::wrap)

    /**
     * The health check information for the listener.
     *
     * Default: - no healthcheck
     */
    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    /**
     * Represents the configuration for enabling outlier detection.
     *
     * Default: - none
     */
    override fun outlierDetection(): OutlierDetection? =
        unwrap(this).getOutlierDetection()?.let(OutlierDetection::wrap)

    /**
     * Port to listen for connections on.
     *
     * Default: - 8080
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * Timeout for GRPC protocol.
     *
     * Default: - None
     */
    override fun timeout(): GrpcTimeout? = unwrap(this).getTimeout()?.let(GrpcTimeout::wrap)

    /**
     * Represents the configuration for enabling TLS on a listener.
     *
     * Default: - none
     */
    override fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcVirtualNodeListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions):
        GrpcVirtualNodeListenerOptions = CdkObjectWrappers.wrap(cdkObject) as?
        GrpcVirtualNodeListenerOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcVirtualNodeListenerOptions):
        software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions
  }
}
