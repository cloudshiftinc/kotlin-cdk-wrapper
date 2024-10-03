@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represent the TCP Node Listener property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * HealthCheck healthCheck;
 * MutualTlsValidationTrust mutualTlsValidationTrust;
 * SubjectAlternativeNames subjectAlternativeNames;
 * TlsCertificate tlsCertificate;
 * TcpVirtualNodeListenerOptions tcpVirtualNodeListenerOptions =
 * TcpVirtualNodeListenerOptions.builder()
 * .connectionPool(TcpConnectionPool.builder()
 * .maxConnections(123)
 * .build())
 * .healthCheck(healthCheck)
 * .outlierDetection(OutlierDetection.builder()
 * .baseEjectionDuration(Duration.minutes(30))
 * .interval(Duration.minutes(30))
 * .maxEjectionPercent(123)
 * .maxServerErrors(123)
 * .build())
 * .port(123)
 * .timeout(TcpTimeout.builder()
 * .idle(Duration.minutes(30))
 * .build())
 * .tls(ListenerTlsOptions.builder()
 * .certificate(tlsCertificate)
 * .mode(TlsMode.STRICT)
 * // the properties below are optional
 * .mutualTlsValidation(MutualTlsValidation.builder()
 * .trust(mutualTlsValidationTrust)
 * // the properties below are optional
 * .subjectAlternativeNames(subjectAlternativeNames)
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface TcpVirtualNodeListenerOptions {
  /**
   * Connection pool for http listeners.
   *
   * Default: - None
   */
  public fun connectionPool(): TcpConnectionPool? =
      unwrap(this).getConnectionPool()?.let(TcpConnectionPool::wrap)

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
   * Timeout for TCP protocol.
   *
   * Default: - None
   */
  public fun timeout(): TcpTimeout? = unwrap(this).getTimeout()?.let(TcpTimeout::wrap)

  /**
   * Represents the configuration for enabling TLS on a listener.
   *
   * Default: - none
   */
  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  /**
   * A builder for [TcpVirtualNodeListenerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionPool Connection pool for http listeners.
     */
    public fun connectionPool(connectionPool: TcpConnectionPool)

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9417603406ad0ebf506640d551658d1d8a01f0cde7730d35257ba9956b6aa88c")
    public fun connectionPool(connectionPool: TcpConnectionPool.Builder.() -> Unit)

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
    @JvmName("e8cc3eef3c07ce80a3333305dee63ac379da21b90fb3dab4e5ec4bd6686e722b")
    public fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit)

    /**
     * @param port Port to listen for connections on.
     */
    public fun port(port: Number)

    /**
     * @param timeout Timeout for TCP protocol.
     */
    public fun timeout(timeout: TcpTimeout)

    /**
     * @param timeout Timeout for TCP protocol.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("969713d98d3d60f921746fba50266c9a022c7e67bea2353fc62f276e4b87cf02")
    public fun timeout(timeout: TcpTimeout.Builder.() -> Unit)

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    public fun tls(tls: ListenerTlsOptions)

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e59cc51715eec391954a3486c6272e68e768fb6a0e792d746a97e5f1ebf75130")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions.builder()

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    override fun connectionPool(connectionPool: TcpConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(TcpConnectionPool.Companion::unwrap))
    }

    /**
     * @param connectionPool Connection pool for http listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9417603406ad0ebf506640d551658d1d8a01f0cde7730d35257ba9956b6aa88c")
    override fun connectionPool(connectionPool: TcpConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(TcpConnectionPool(connectionPool))

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
    @JvmName("e8cc3eef3c07ce80a3333305dee63ac379da21b90fb3dab4e5ec4bd6686e722b")
    override fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit): Unit =
        outlierDetection(OutlierDetection(outlierDetection))

    /**
     * @param port Port to listen for connections on.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param timeout Timeout for TCP protocol.
     */
    override fun timeout(timeout: TcpTimeout) {
      cdkBuilder.timeout(timeout.let(TcpTimeout.Companion::unwrap))
    }

    /**
     * @param timeout Timeout for TCP protocol.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("969713d98d3d60f921746fba50266c9a022c7e67bea2353fc62f276e4b87cf02")
    override fun timeout(timeout: TcpTimeout.Builder.() -> Unit): Unit =
        timeout(TcpTimeout(timeout))

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
    @JvmName("e59cc51715eec391954a3486c6272e68e768fb6a0e792d746a97e5f1ebf75130")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions,
  ) : CdkObject(cdkObject),
      TcpVirtualNodeListenerOptions {
    /**
     * Connection pool for http listeners.
     *
     * Default: - None
     */
    override fun connectionPool(): TcpConnectionPool? =
        unwrap(this).getConnectionPool()?.let(TcpConnectionPool::wrap)

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
     * Timeout for TCP protocol.
     *
     * Default: - None
     */
    override fun timeout(): TcpTimeout? = unwrap(this).getTimeout()?.let(TcpTimeout::wrap)

    /**
     * Represents the configuration for enabling TLS on a listener.
     *
     * Default: - none
     */
    override fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TcpVirtualNodeListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions):
        TcpVirtualNodeListenerOptions = CdkObjectWrappers.wrap(cdkObject) as?
        TcpVirtualNodeListenerOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TcpVirtualNodeListenerOptions):
        software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions
  }
}
