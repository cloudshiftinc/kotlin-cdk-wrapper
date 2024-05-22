@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represent the HTTP2 Node Listener property.
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
 * Http2VirtualNodeListenerOptions http2VirtualNodeListenerOptions =
 * Http2VirtualNodeListenerOptions.builder()
 * .connectionPool(Http2ConnectionPool.builder()
 * .maxRequests(123)
 * .build())
 * .healthCheck(healthCheck)
 * .outlierDetection(OutlierDetection.builder()
 * .baseEjectionDuration(Duration.minutes(30))
 * .interval(Duration.minutes(30))
 * .maxEjectionPercent(123)
 * .maxServerErrors(123)
 * .build())
 * .port(123)
 * .timeout(HttpTimeout.builder()
 * .idle(Duration.minutes(30))
 * .perRequest(Duration.minutes(30))
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
public interface Http2VirtualNodeListenerOptions {
  /**
   * Connection pool for http2 listeners.
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
   * A builder for [Http2VirtualNodeListenerOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionPool Connection pool for http2 listeners.
     */
    public fun connectionPool(connectionPool: Http2ConnectionPool)

    /**
     * @param connectionPool Connection pool for http2 listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe6401665426f13d46895854213abca2eccf1e3ee75d6a39341bc84d18f6fcfd")
    public fun connectionPool(connectionPool: Http2ConnectionPool.Builder.() -> Unit)

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
    @JvmName("4fbe80ebb3e1bd1c891ecd049c4e09e053342b6285851816fbcd162530832cc9")
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
    @JvmName("99155cad04b0d32ffb386b82bbd0c061051bf459c0e13606bbed51e62a28f9a7")
    public fun timeout(timeout: HttpTimeout.Builder.() -> Unit)

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    public fun tls(tls: ListenerTlsOptions)

    /**
     * @param tls Represents the configuration for enabling TLS on a listener.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24a22792e46ad601777dd1e915b68f6e3bd52b77ff60459e6b751f3e77566024")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions.builder()

    /**
     * @param connectionPool Connection pool for http2 listeners.
     */
    override fun connectionPool(connectionPool: Http2ConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(Http2ConnectionPool.Companion::unwrap))
    }

    /**
     * @param connectionPool Connection pool for http2 listeners.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe6401665426f13d46895854213abca2eccf1e3ee75d6a39341bc84d18f6fcfd")
    override fun connectionPool(connectionPool: Http2ConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(Http2ConnectionPool(connectionPool))

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
    @JvmName("4fbe80ebb3e1bd1c891ecd049c4e09e053342b6285851816fbcd162530832cc9")
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
    @JvmName("99155cad04b0d32ffb386b82bbd0c061051bf459c0e13606bbed51e62a28f9a7")
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
    @JvmName("24a22792e46ad601777dd1e915b68f6e3bd52b77ff60459e6b751f3e77566024")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions,
  ) : CdkObject(cdkObject), Http2VirtualNodeListenerOptions {
    /**
     * Connection pool for http2 listeners.
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
    public operator fun invoke(block: Builder.() -> Unit = {}): Http2VirtualNodeListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions):
        Http2VirtualNodeListenerOptions = CdkObjectWrappers.wrap(cdkObject) as?
        Http2VirtualNodeListenerOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Http2VirtualNodeListenerOptions):
        software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions
  }
}
