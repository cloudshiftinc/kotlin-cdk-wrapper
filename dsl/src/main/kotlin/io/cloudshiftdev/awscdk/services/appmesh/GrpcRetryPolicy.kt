package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface GrpcRetryPolicy : HttpRetryPolicy {
  /**
   * gRPC events on which to retry.
   *
   * You must specify at least one value
   * for at least one types of retry events.
   *
   * Default: - no retries for gRPC events
   */
  public fun grpcRetryEvents(): List<GrpcRetryEvent> =
      unwrap(this).getGrpcRetryEvents()?.map(GrpcRetryEvent::wrap) ?: emptyList()

  /**
   * A builder for [GrpcRetryPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param grpcRetryEvents gRPC events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    public fun grpcRetryEvents(grpcRetryEvents: List<GrpcRetryEvent>)

    /**
     * @param grpcRetryEvents gRPC events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    public fun grpcRetryEvents(vararg grpcRetryEvents: GrpcRetryEvent)

    /**
     * @param httpRetryEvents Specify HTTP events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    public fun httpRetryEvents(httpRetryEvents: List<HttpRetryEvent>)

    /**
     * @param httpRetryEvents Specify HTTP events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    public fun httpRetryEvents(vararg httpRetryEvents: HttpRetryEvent)

    /**
     * @param retryAttempts The maximum number of retry attempts. 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param retryTimeout The timeout for each retry attempt. 
     */
    public fun retryTimeout(retryTimeout: Duration)

    /**
     * @param tcpRetryEvents TCP events on which to retry.
     * The event occurs before any processing of a
     * request has started and is encountered when the upstream is temporarily or
     * permanently unavailable. You must specify at least one value for at least
     * one types of retry events.
     */
    public fun tcpRetryEvents(tcpRetryEvents: List<TcpRetryEvent>)

    /**
     * @param tcpRetryEvents TCP events on which to retry.
     * The event occurs before any processing of a
     * request has started and is encountered when the upstream is temporarily or
     * permanently unavailable. You must specify at least one value for at least
     * one types of retry events.
     */
    public fun tcpRetryEvents(vararg tcpRetryEvents: TcpRetryEvent)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcRetryPolicy.Builder =
        software.amazon.awscdk.services.appmesh.GrpcRetryPolicy.builder()

    /**
     * @param grpcRetryEvents gRPC events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    override fun grpcRetryEvents(grpcRetryEvents: List<GrpcRetryEvent>) {
      cdkBuilder.grpcRetryEvents(grpcRetryEvents.map(GrpcRetryEvent::unwrap))
    }

    /**
     * @param grpcRetryEvents gRPC events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    override fun grpcRetryEvents(vararg grpcRetryEvents: GrpcRetryEvent): Unit =
        grpcRetryEvents(grpcRetryEvents.toList())

    /**
     * @param httpRetryEvents Specify HTTP events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    override fun httpRetryEvents(httpRetryEvents: List<HttpRetryEvent>) {
      cdkBuilder.httpRetryEvents(httpRetryEvents.map(HttpRetryEvent::unwrap))
    }

    /**
     * @param httpRetryEvents Specify HTTP events on which to retry.
     * You must specify at least one value
     * for at least one types of retry events.
     */
    override fun httpRetryEvents(vararg httpRetryEvents: HttpRetryEvent): Unit =
        httpRetryEvents(httpRetryEvents.toList())

    /**
     * @param retryAttempts The maximum number of retry attempts. 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param retryTimeout The timeout for each retry attempt. 
     */
    override fun retryTimeout(retryTimeout: Duration) {
      cdkBuilder.retryTimeout(retryTimeout.let(Duration::unwrap))
    }

    /**
     * @param tcpRetryEvents TCP events on which to retry.
     * The event occurs before any processing of a
     * request has started and is encountered when the upstream is temporarily or
     * permanently unavailable. You must specify at least one value for at least
     * one types of retry events.
     */
    override fun tcpRetryEvents(tcpRetryEvents: List<TcpRetryEvent>) {
      cdkBuilder.tcpRetryEvents(tcpRetryEvents.map(TcpRetryEvent::unwrap))
    }

    /**
     * @param tcpRetryEvents TCP events on which to retry.
     * The event occurs before any processing of a
     * request has started and is encountered when the upstream is temporarily or
     * permanently unavailable. You must specify at least one value for at least
     * one types of retry events.
     */
    override fun tcpRetryEvents(vararg tcpRetryEvents: TcpRetryEvent): Unit =
        tcpRetryEvents(tcpRetryEvents.toList())

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcRetryPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GrpcRetryPolicy,
  ) : CdkObject(cdkObject), GrpcRetryPolicy {
    /**
     * gRPC events on which to retry.
     *
     * You must specify at least one value
     * for at least one types of retry events.
     *
     * Default: - no retries for gRPC events
     */
    override fun grpcRetryEvents(): List<GrpcRetryEvent> =
        unwrap(this).getGrpcRetryEvents()?.map(GrpcRetryEvent::wrap) ?: emptyList()

    /**
     * Specify HTTP events on which to retry.
     *
     * You must specify at least one value
     * for at least one types of retry events.
     *
     * Default: - no retries for http events
     */
    override fun httpRetryEvents(): List<HttpRetryEvent> =
        unwrap(this).getHttpRetryEvents()?.map(HttpRetryEvent::wrap) ?: emptyList()

    /**
     * The maximum number of retry attempts.
     */
    override fun retryAttempts(): Number = unwrap(this).getRetryAttempts()

    /**
     * The timeout for each retry attempt.
     */
    override fun retryTimeout(): Duration = unwrap(this).getRetryTimeout().let(Duration::wrap)

    /**
     * TCP events on which to retry.
     *
     * The event occurs before any processing of a
     * request has started and is encountered when the upstream is temporarily or
     * permanently unavailable. You must specify at least one value for at least
     * one types of retry events.
     *
     * Default: - no retries for tcp events
     */
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
