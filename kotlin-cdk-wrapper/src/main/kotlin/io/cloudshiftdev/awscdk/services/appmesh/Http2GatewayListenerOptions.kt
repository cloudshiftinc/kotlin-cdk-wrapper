@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

public interface Http2GatewayListenerOptions {
  public fun connectionPool(): Http2ConnectionPool? =
      unwrap(this).getConnectionPool()?.let(Http2ConnectionPool::wrap)

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun connectionPool(connectionPool: Http2ConnectionPool)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cac8137abf16333a56f9061788721ce4b7a07d823920b31026bb9ccdef8f6f9")
    public fun connectionPool(connectionPool: Http2ConnectionPool.Builder.() -> Unit)

    public fun healthCheck(healthCheck: HealthCheck)

    public fun port(port: Number)

    public fun tls(tls: ListenerTlsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c102f53c07b47df3e244c6c67bcc26dbf3703c3897a56d4edf16ca1d61cb1e72")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions.builder()

    override fun connectionPool(connectionPool: Http2ConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(Http2ConnectionPool::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cac8137abf16333a56f9061788721ce4b7a07d823920b31026bb9ccdef8f6f9")
    override fun connectionPool(connectionPool: Http2ConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(Http2ConnectionPool(connectionPool))

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun tls(tls: ListenerTlsOptions) {
      cdkBuilder.tls(tls.let(ListenerTlsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c102f53c07b47df3e244c6c67bcc26dbf3703c3897a56d4edf16ca1d61cb1e72")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions,
  ) : CdkObject(cdkObject), Http2GatewayListenerOptions {
    override fun connectionPool(): Http2ConnectionPool? =
        unwrap(this).getConnectionPool()?.let(Http2ConnectionPool::wrap)

    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    override fun port(): Number? = unwrap(this).getPort()

    override fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Http2GatewayListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions):
        Http2GatewayListenerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Http2GatewayListenerOptions):
        software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions
  }
}
