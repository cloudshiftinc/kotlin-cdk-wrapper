package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpVirtualNodeListenerOptions {
  public fun connectionPool(): HttpConnectionPool? =
      unwrap(this).getConnectionPool()?.let(HttpConnectionPool::wrap)

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun outlierDetection(): OutlierDetection? =
      unwrap(this).getOutlierDetection()?.let(OutlierDetection::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun timeout(): HttpTimeout? = unwrap(this).getTimeout()?.let(HttpTimeout::wrap)

  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  public interface Builder {
    public fun connectionPool(connectionPool: HttpConnectionPool) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef9371db3f733d8f230f0398252dda82ec29c7b1ec43ee2778c25a5c0a7f3edd")
    public fun connectionPool(connectionPool: HttpConnectionPool.Builder.() -> Unit) {
    }

    public fun healthCheck(healthCheck: HealthCheck) {
    }

    public fun outlierDetection(outlierDetection: OutlierDetection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df493893bc77ab8aa01ffdbfaf59365d39ed09295623ef4f1472d75df86d3976")
    public fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit) {
    }

    public fun port(port: Number) {
    }

    public fun timeout(timeout: HttpTimeout) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f787c4959117d44ccd037fba8eff29308199d8e80999a9818a24e9f3e2c1905")
    public fun timeout(timeout: HttpTimeout.Builder.() -> Unit) {
    }

    public fun tls(tls: ListenerTlsOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ee782159d8f74a6ea29a538f6cdd43a804806d916074d87ff61f512e6ec00a7")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions.builder()

    public override fun connectionPool(connectionPool: HttpConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(HttpConnectionPool::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef9371db3f733d8f230f0398252dda82ec29c7b1ec43ee2778c25a5c0a7f3edd")
    public override fun connectionPool(connectionPool: HttpConnectionPool.Builder.() -> Unit): Unit
        = connectionPool(HttpConnectionPool(connectionPool))

    public override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    public override fun outlierDetection(outlierDetection: OutlierDetection) {
      cdkBuilder.outlierDetection(outlierDetection.let(OutlierDetection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df493893bc77ab8aa01ffdbfaf59365d39ed09295623ef4f1472d75df86d3976")
    public override fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit):
        Unit = outlierDetection(OutlierDetection(outlierDetection))

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun timeout(timeout: HttpTimeout) {
      cdkBuilder.timeout(timeout.let(HttpTimeout::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f787c4959117d44ccd037fba8eff29308199d8e80999a9818a24e9f3e2c1905")
    public override fun timeout(timeout: HttpTimeout.Builder.() -> Unit): Unit =
        timeout(HttpTimeout(timeout))

    public override fun tls(tls: ListenerTlsOptions) {
      cdkBuilder.tls(tls.let(ListenerTlsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ee782159d8f74a6ea29a538f6cdd43a804806d916074d87ff61f512e6ec00a7")
    public override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions,
  ) : HttpVirtualNodeListenerOptions {
    public override fun connectionPool(): HttpConnectionPool? =
        unwrap(this).getConnectionPool()?.let(HttpConnectionPool::wrap)

    public override fun healthCheck(): HealthCheck? =
        unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    public override fun outlierDetection(): OutlierDetection? =
        unwrap(this).getOutlierDetection()?.let(OutlierDetection::wrap)

    public override fun port(): Number? = unwrap(this).getPort()

    public override fun timeout(): HttpTimeout? = unwrap(this).getTimeout()?.let(HttpTimeout::wrap)

    public override fun tls(): ListenerTlsOptions? =
        unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpVirtualNodeListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions):
        HttpVirtualNodeListenerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpVirtualNodeListenerOptions):
        software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions = (wrapped as
        Wrapper).cdkObject
  }
}
