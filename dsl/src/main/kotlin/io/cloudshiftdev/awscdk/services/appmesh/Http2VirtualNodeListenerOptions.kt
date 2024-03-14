package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface Http2VirtualNodeListenerOptions {
  public fun connectionPool(): Http2ConnectionPool? =
      unwrap(this).getConnectionPool()?.let(Http2ConnectionPool::wrap)

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun outlierDetection(): OutlierDetection? =
      unwrap(this).getOutlierDetection()?.let(OutlierDetection::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun timeout(): HttpTimeout? = unwrap(this).getTimeout()?.let(HttpTimeout::wrap)

  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  public interface Builder {
    public fun connectionPool(connectionPool: Http2ConnectionPool)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe6401665426f13d46895854213abca2eccf1e3ee75d6a39341bc84d18f6fcfd")
    public fun connectionPool(connectionPool: Http2ConnectionPool.Builder.() -> Unit)

    public fun healthCheck(healthCheck: HealthCheck)

    public fun outlierDetection(outlierDetection: OutlierDetection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fbe80ebb3e1bd1c891ecd049c4e09e053342b6285851816fbcd162530832cc9")
    public fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit)

    public fun port(port: Number)

    public fun timeout(timeout: HttpTimeout)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99155cad04b0d32ffb386b82bbd0c061051bf459c0e13606bbed51e62a28f9a7")
    public fun timeout(timeout: HttpTimeout.Builder.() -> Unit)

    public fun tls(tls: ListenerTlsOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24a22792e46ad601777dd1e915b68f6e3bd52b77ff60459e6b751f3e77566024")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions.builder()

    override fun connectionPool(connectionPool: Http2ConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(Http2ConnectionPool::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe6401665426f13d46895854213abca2eccf1e3ee75d6a39341bc84d18f6fcfd")
    override fun connectionPool(connectionPool: Http2ConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(Http2ConnectionPool(connectionPool))

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    override fun outlierDetection(outlierDetection: OutlierDetection) {
      cdkBuilder.outlierDetection(outlierDetection.let(OutlierDetection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fbe80ebb3e1bd1c891ecd049c4e09e053342b6285851816fbcd162530832cc9")
    override fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit): Unit =
        outlierDetection(OutlierDetection(outlierDetection))

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun timeout(timeout: HttpTimeout) {
      cdkBuilder.timeout(timeout.let(HttpTimeout::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99155cad04b0d32ffb386b82bbd0c061051bf459c0e13606bbed51e62a28f9a7")
    override fun timeout(timeout: HttpTimeout.Builder.() -> Unit): Unit =
        timeout(HttpTimeout(timeout))

    override fun tls(tls: ListenerTlsOptions) {
      cdkBuilder.tls(tls.let(ListenerTlsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24a22792e46ad601777dd1e915b68f6e3bd52b77ff60459e6b751f3e77566024")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions,
  ) : Http2VirtualNodeListenerOptions {
    override fun connectionPool(): Http2ConnectionPool? =
        unwrap(this).getConnectionPool()?.let(Http2ConnectionPool::wrap)

    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    override fun outlierDetection(): OutlierDetection? =
        unwrap(this).getOutlierDetection()?.let(OutlierDetection::wrap)

    override fun port(): Number? = unwrap(this).getPort()

    override fun timeout(): HttpTimeout? = unwrap(this).getTimeout()?.let(HttpTimeout::wrap)

    override fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Http2VirtualNodeListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions):
        Http2VirtualNodeListenerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Http2VirtualNodeListenerOptions):
        software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions = (wrapped as
        Wrapper).cdkObject
  }
}
