package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface HttpRetryPolicy {
  public fun httpRetryEvents(): List<HttpRetryEvent> =
      unwrap(this).getHttpRetryEvents()?.map(HttpRetryEvent::wrap) ?: emptyList()

  public fun retryAttempts(): Number

  public fun retryTimeout(): Duration

  public fun tcpRetryEvents(): List<TcpRetryEvent> =
      unwrap(this).getTcpRetryEvents()?.map(TcpRetryEvent::wrap) ?: emptyList()

  public interface Builder {
    public fun httpRetryEvents(httpRetryEvents: List<HttpRetryEvent>)

    public fun httpRetryEvents(vararg httpRetryEvents: HttpRetryEvent)

    public fun retryAttempts(retryAttempts: Number)

    public fun retryTimeout(retryTimeout: Duration)

    public fun tcpRetryEvents(tcpRetryEvents: List<TcpRetryEvent>)

    public fun tcpRetryEvents(vararg tcpRetryEvents: TcpRetryEvent)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpRetryPolicy.Builder =
        software.amazon.awscdk.services.appmesh.HttpRetryPolicy.builder()

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

    public fun build(): software.amazon.awscdk.services.appmesh.HttpRetryPolicy = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpRetryPolicy,
  ) : HttpRetryPolicy {
    override fun httpRetryEvents(): List<HttpRetryEvent> =
        unwrap(this).getHttpRetryEvents()?.map(HttpRetryEvent::wrap) ?: emptyList()

    override fun retryAttempts(): Number = unwrap(this).getRetryAttempts()

    override fun retryTimeout(): Duration = unwrap(this).getRetryTimeout().let(Duration::wrap)

    override fun tcpRetryEvents(): List<TcpRetryEvent> =
        unwrap(this).getTcpRetryEvents()?.map(TcpRetryEvent::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRetryPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRetryPolicy):
        HttpRetryPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRetryPolicy):
        software.amazon.awscdk.services.appmesh.HttpRetryPolicy = (wrapped as Wrapper).cdkObject
  }
}
