@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represent the HTTP Node Listener property.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * Vpc vpc = new Vpc(this, "vpc");
 * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
 * .vpc(vpc)
 * .name("domain.local")
 * .build();
 * Service service = namespace.createService("Svc");
 * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(8081)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .healthyThreshold(3)
 * .interval(Duration.seconds(5)) // minimum
 * .path("/health-check-path")
 * .timeout(Duration.seconds(2)) // minimum
 * .unhealthyThreshold(2)
 * .build()))
 * .build())))
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .build());
 * ```
 */
public interface HttpVirtualNodeListenerOptions {
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
   * Timeout for HTTP protocol.
   *
   * Default: - None
   */
  public fun timeout(): HttpTimeout? = unwrap(this).getTimeout()?.let(HttpTimeout::wrap)

  /**
   * Represents the configuration for enabling TLS on a listener.
   *
   * Default: - none
   */
  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  /**
   * A builder for [HttpVirtualNodeListenerOptions]
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
    @JvmName("ef9371db3f733d8f230f0398252dda82ec29c7b1ec43ee2778c25a5c0a7f3edd")
    public fun connectionPool(connectionPool: HttpConnectionPool.Builder.() -> Unit)

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
    @JvmName("df493893bc77ab8aa01ffdbfaf59365d39ed09295623ef4f1472d75df86d3976")
    public fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit)

    /**
     * @param port Port to listen for connections on.
     */
    public fun port(port: Number)

    /**
     * @param timeout Timeout for HTTP protocol.
     */
    public fun timeout(timeout: HttpTimeout)

    /**
     * @param timeout Timeout for HTTP protocol.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f787c4959117d44ccd037fba8eff29308199d8e80999a9818a24e9f3e2c1905")
    public fun timeout(timeout: HttpTimeout.Builder.() -> Unit)

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    public fun tls(tls: ListenerTlsOptions)

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ee782159d8f74a6ea29a538f6cdd43a804806d916074d87ff61f512e6ec00a7")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions.builder()

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    override fun connectionPool(connectionPool: HttpConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(HttpConnectionPool.Companion::unwrap))
    }

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef9371db3f733d8f230f0398252dda82ec29c7b1ec43ee2778c25a5c0a7f3edd")
    override fun connectionPool(connectionPool: HttpConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(HttpConnectionPool(connectionPool))

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
    @JvmName("df493893bc77ab8aa01ffdbfaf59365d39ed09295623ef4f1472d75df86d3976")
    override fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit): Unit =
        outlierDetection(OutlierDetection(outlierDetection))

    /**
     * @param port Port to listen for connections on.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param timeout Timeout for HTTP protocol.
     */
    override fun timeout(timeout: HttpTimeout) {
      cdkBuilder.timeout(timeout.let(HttpTimeout.Companion::unwrap))
    }

    /**
     * @param timeout Timeout for HTTP protocol.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f787c4959117d44ccd037fba8eff29308199d8e80999a9818a24e9f3e2c1905")
    override fun timeout(timeout: HttpTimeout.Builder.() -> Unit): Unit =
        timeout(HttpTimeout(timeout))

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
    @JvmName("9ee782159d8f74a6ea29a538f6cdd43a804806d916074d87ff61f512e6ec00a7")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions,
  ) : CdkObject(cdkObject),
      HttpVirtualNodeListenerOptions {
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
     * Timeout for HTTP protocol.
     *
     * Default: - None
     */
    override fun timeout(): HttpTimeout? = unwrap(this).getTimeout()?.let(HttpTimeout::wrap)

    /**
     * Represents the configuration for enabling TLS on a listener.
     *
     * Default: - none
     */
    override fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpVirtualNodeListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions):
        HttpVirtualNodeListenerOptions = CdkObjectWrappers.wrap(cdkObject) as?
        HttpVirtualNodeListenerOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpVirtualNodeListenerOptions):
        software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions
  }
}
