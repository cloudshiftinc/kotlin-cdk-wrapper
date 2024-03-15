@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

public interface GrpcVirtualNodeListenerOptions {
  public fun connectionPool(): GrpcConnectionPool? =
      unwrap(this).getConnectionPool()?.let(GrpcConnectionPool::wrap)

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun outlierDetection(): OutlierDetection? =
      unwrap(this).getOutlierDetection()?.let(OutlierDetection::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun timeout(): GrpcTimeout? = unwrap(this).getTimeout()?.let(GrpcTimeout::wrap)

  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun connectionPool(connectionPool: GrpcConnectionPool)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("029b9b62a41a94ab8c0a92ec47c8d2ac4af468328897cd9bfdc3cc663bc0c21a")
    public fun connectionPool(connectionPool: GrpcConnectionPool.Builder.() -> Unit)

    public fun healthCheck(healthCheck: HealthCheck)

    public fun outlierDetection(outlierDetection: OutlierDetection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("201447d523681eb002639ce5f2ec486b6b3294da3aafbb099284643e2361499b")
    public fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit)

    public fun port(port: Number)

    public fun timeout(timeout: GrpcTimeout)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e438eb6d668b5fff2c0b4e6ceaade97973cb6fa8e313c1e450bf4e2ea74c6ee3")
    public fun timeout(timeout: GrpcTimeout.Builder.() -> Unit)

    public fun tls(tls: ListenerTlsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d5bac7408fcbf6e05a2c671fc54822659ebfcbcd553225b711b65904c360fb")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions.builder()

    override fun connectionPool(connectionPool: GrpcConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(GrpcConnectionPool::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("029b9b62a41a94ab8c0a92ec47c8d2ac4af468328897cd9bfdc3cc663bc0c21a")
    override fun connectionPool(connectionPool: GrpcConnectionPool.Builder.() -> Unit): Unit =
        connectionPool(GrpcConnectionPool(connectionPool))

    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    override fun outlierDetection(outlierDetection: OutlierDetection) {
      cdkBuilder.outlierDetection(outlierDetection.let(OutlierDetection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("201447d523681eb002639ce5f2ec486b6b3294da3aafbb099284643e2361499b")
    override fun outlierDetection(outlierDetection: OutlierDetection.Builder.() -> Unit): Unit =
        outlierDetection(OutlierDetection(outlierDetection))

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun timeout(timeout: GrpcTimeout) {
      cdkBuilder.timeout(timeout.let(GrpcTimeout::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e438eb6d668b5fff2c0b4e6ceaade97973cb6fa8e313c1e450bf4e2ea74c6ee3")
    override fun timeout(timeout: GrpcTimeout.Builder.() -> Unit): Unit =
        timeout(GrpcTimeout(timeout))

    override fun tls(tls: ListenerTlsOptions) {
      cdkBuilder.tls(tls.let(ListenerTlsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95d5bac7408fcbf6e05a2c671fc54822659ebfcbcd553225b711b65904c360fb")
    override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions,
  ) : CdkObject(cdkObject), GrpcVirtualNodeListenerOptions {
    override fun connectionPool(): GrpcConnectionPool? =
        unwrap(this).getConnectionPool()?.let(GrpcConnectionPool::wrap)

    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    override fun outlierDetection(): OutlierDetection? =
        unwrap(this).getOutlierDetection()?.let(OutlierDetection::wrap)

    override fun port(): Number? = unwrap(this).getPort()

    override fun timeout(): GrpcTimeout? = unwrap(this).getTimeout()?.let(GrpcTimeout::wrap)

    override fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcVirtualNodeListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions):
        GrpcVirtualNodeListenerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcVirtualNodeListenerOptions):
        software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions
  }
}
