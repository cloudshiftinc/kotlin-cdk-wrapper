@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

public interface GrpcGatewayListenerOptions {
  public fun connectionPool(): GrpcConnectionPool? =
      unwrap(this).getConnectionPool()?.let(GrpcConnectionPool::wrap)

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun connectionPool(connectionPool: GrpcConnectionPool)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4f531d590af55743b246a88def835bdd691a7b6a6caa975821daa5a1cd9d137")
    public fun connectionPool(connectionPool: GrpcConnectionPool.Builder.() -> Unit)

    public fun healthCheck(healthCheck: HealthCheck)

    public fun port(port: Number)

    public fun tls(tls: ListenerTlsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6478d6ce08a9c5085d38889fb806b46d0c53f9bd461a36c8ea53fe6f49161bc")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions.builder()

    override fun connectionPool(connectionPool: GrpcConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(GrpcConnectionPool::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a4f531d590af55743b246a88def835bdd691a7b6a6caa975821daa5a1cd9d137")
    override fun connectionPool(connectionPool: GrpcConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(GrpcConnectionPool(connectionPool))

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
    @JvmName("e6478d6ce08a9c5085d38889fb806b46d0c53f9bd461a36c8ea53fe6f49161bc")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions,
  ) : CdkObject(cdkObject), GrpcGatewayListenerOptions {
    override fun connectionPool(): GrpcConnectionPool? =
        unwrap(this).getConnectionPool()?.let(GrpcConnectionPool::wrap)

    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    override fun port(): Number? = unwrap(this).getPort()

    override fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions):
        GrpcGatewayListenerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcGatewayListenerOptions):
        software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions
  }
}
