@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface GrpcRetryPolicy : HttpRetryPolicy {
  public fun grpcRetryEvents(): List<GrpcRetryEvent> =
      unwrap(this).getGrpcRetryEvents()?.map(GrpcRetryEvent::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun grpcRetryEvents(grpcRetryEvents: List<GrpcRetryEvent>)

    public fun grpcRetryEvents(vararg grpcRetryEvents: GrpcRetryEvent)

    public fun httpRetryEvents(httpRetryEvents: List<HttpRetryEvent>)

    public fun httpRetryEvents(vararg httpRetryEvents: HttpRetryEvent)

    public fun retryAttempts(retryAttempts: Number)

    public fun retryTimeout(retryTimeout: Duration)

    public fun tcpRetryEvents(tcpRetryEvents: List<TcpRetryEvent>)

    public fun tcpRetryEvents(vararg tcpRetryEvents: TcpRetryEvent)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcRetryPolicy.Builder =
        software.amazon.awscdk.services.appmesh.GrpcRetryPolicy.builder()

    override fun grpcRetryEvents(grpcRetryEvents: List<GrpcRetryEvent>) {
      cdkBuilder.grpcRetryEvents(grpcRetryEvents.map(GrpcRetryEvent::unwrap))
    }

    override fun grpcRetryEvents(vararg grpcRetryEvents: GrpcRetryEvent): Unit =
        grpcRetryEvents(grpcRetryEvents.toList())

    override fun httpRetryEvents(httpRetryEvents: List<HttpRetryEvent>) {
      cdkBuilder.httpRetryEvents(httpRetryEvents.map(HttpRetryEvent::unwrap))
    }

    override fun httpRetryEvents(vararg httpRetryEvents: HttpRetryEvent): Unit =
        httpRetryEvents(httpRetryEvents.toList())

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    override fun retryTimeout(retryTimeout: Duration) {
      cdkBuilder.retryTimeout(retryTimeout.let(Duration::unwrap))
    }

    override fun tcpRetryEvents(tcpRetryEvents: List<TcpRetryEvent>) {
      cdkBuilder.tcpRetryEvents(tcpRetryEvents.map(TcpRetryEvent::unwrap))
    }

    override fun tcpRetryEvents(vararg tcpRetryEvents: TcpRetryEvent): Unit =
        tcpRetryEvents(tcpRetryEvents.toList())

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcRetryPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GrpcRetryPolicy,
  ) : CdkObject(cdkObject), GrpcRetryPolicy {
    override fun grpcRetryEvents(): List<GrpcRetryEvent> =
        unwrap(this).getGrpcRetryEvents()?.map(GrpcRetryEvent::wrap) ?: emptyList()

    override fun httpRetryEvents(): List<HttpRetryEvent> =
        unwrap(this).getHttpRetryEvents()?.map(HttpRetryEvent::wrap) ?: emptyList()

    override fun retryAttempts(): Number = unwrap(this).getRetryAttempts()

    override fun retryTimeout(): Duration = unwrap(this).getRetryTimeout().let(Duration::wrap)

    override fun tcpRetryEvents(): List<TcpRetryEvent> =
        unwrap(this).getTcpRetryEvents()?.map(TcpRetryEvent::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRetryPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcRetryPolicy):
        GrpcRetryPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcRetryPolicy):
        software.amazon.awscdk.services.appmesh.GrpcRetryPolicy = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.GrpcRetryPolicy
  }
}
