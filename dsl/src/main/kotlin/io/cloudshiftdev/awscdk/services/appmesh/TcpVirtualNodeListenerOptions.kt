package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface TcpVirtualNodeListenerOptions {
  public fun connectionPool(): TcpConnectionPool? =
      unwrap(this).getConnectionPool()?.let(TcpConnectionPool::wrap)

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun outlierDetection(): OutlierDetection? =
      unwrap(this).getOutlierDetection()?.let(OutlierDetection::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun timeout(): TcpTimeout? = unwrap(this).getTimeout()?.let(TcpTimeout::wrap)

  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  public interface Builder {
    public fun connectionPool(connectionPool: TcpConnectionPool)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9417603406ad0ebf506640d551658d1d8a01f0cde7730d35257ba9956b6aa88c")
    public fun connectionPool(connectionPool: TcpConnectionPool.Builder.() -> Unit)

    public fun healthCheck(healthCheck: HealthCheck)

    public fun outlierDetection(outlierDetection: OutlierDetection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8cc3eef3c07ce80a3333305dee63ac379da21b90fb3dab4e5ec4bd6686e722b")
    public fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit)

    public fun port(port: Number)

    public fun timeout(timeout: TcpTimeout)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("969713d98d3d60f921746fba50266c9a022c7e67bea2353fc62f276e4b87cf02")
    public fun timeout(timeout: TcpTimeout.Builder.() -> Unit)

    public fun tls(tls: ListenerTlsOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e59cc51715eec391954a3486c6272e68e768fb6a0e792d746a97e5f1ebf75130")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions.builder()

    override fun connectionPool(connectionPool: TcpConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(TcpConnectionPool::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9417603406ad0ebf506640d551658d1d8a01f0cde7730d35257ba9956b6aa88c")
    override fun connectionPool(connectionPool: TcpConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(TcpConnectionPool(connectionPool))

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    override fun outlierDetection(outlierDetection: OutlierDetection) {
      cdkBuilder.outlierDetection(outlierDetection.let(OutlierDetection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8cc3eef3c07ce80a3333305dee63ac379da21b90fb3dab4e5ec4bd6686e722b")
    override fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit): Unit =
        outlierDetection(OutlierDetection(outlierDetection))

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun timeout(timeout: TcpTimeout) {
      cdkBuilder.timeout(timeout.let(TcpTimeout::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("969713d98d3d60f921746fba50266c9a022c7e67bea2353fc62f276e4b87cf02")
    override fun timeout(timeout: TcpTimeout.Builder.() -> Unit): Unit =
        timeout(TcpTimeout(timeout))

    override fun tls(tls: ListenerTlsOptions) {
      cdkBuilder.tls(tls.let(ListenerTlsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e59cc51715eec391954a3486c6272e68e768fb6a0e792d746a97e5f1ebf75130")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions,
  ) : TcpVirtualNodeListenerOptions {
    override fun connectionPool(): TcpConnectionPool? =
        unwrap(this).getConnectionPool()?.let(TcpConnectionPool::wrap)

    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    override fun outlierDetection(): OutlierDetection? =
        unwrap(this).getOutlierDetection()?.let(OutlierDetection::wrap)

    override fun port(): Number? = unwrap(this).getPort()

    override fun timeout(): TcpTimeout? = unwrap(this).getTimeout()?.let(TcpTimeout::wrap)

    override fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TcpVirtualNodeListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions):
        TcpVirtualNodeListenerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TcpVirtualNodeListenerOptions):
        software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions = (wrapped as
        Wrapper).cdkObject
  }
}
