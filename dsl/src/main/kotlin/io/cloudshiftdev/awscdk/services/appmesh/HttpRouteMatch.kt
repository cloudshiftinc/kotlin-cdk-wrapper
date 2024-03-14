package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface HttpRouteMatch {
  public fun headers(): List<HeaderMatch> = unwrap(this).getHeaders()?.map(HeaderMatch::wrap) ?:
      emptyList()

  public fun method(): HttpRouteMethod? = unwrap(this).getMethod()?.let(HttpRouteMethod::wrap)

  public fun path(): HttpRoutePathMatch? = unwrap(this).getPath()?.let(HttpRoutePathMatch::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun protocol(): HttpRouteProtocol? =
      unwrap(this).getProtocol()?.let(HttpRouteProtocol::wrap)

  public fun queryParameters(): List<QueryParameterMatch> =
      unwrap(this).getQueryParameters()?.map(QueryParameterMatch::wrap) ?: emptyList()

  public interface Builder {
    public fun headers(headers: List<HeaderMatch>) {
    }

    public fun method(method: HttpRouteMethod) {
    }

    public fun path(path: HttpRoutePathMatch) {
    }

    public fun port(port: Number) {
    }

    public fun protocol(protocol: HttpRouteProtocol) {
    }

    public fun queryParameters(queryParameters: List<QueryParameterMatch>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpRouteMatch.Builder =
        software.amazon.awscdk.services.appmesh.HttpRouteMatch.builder()

    public override fun headers(headers: List<HeaderMatch>) {
      cdkBuilder.headers(headers.map(HeaderMatch::unwrap))
    }

    public override fun method(method: HttpRouteMethod) {
      cdkBuilder.method(method.let(HttpRouteMethod::unwrap))
    }

    public override fun path(path: HttpRoutePathMatch) {
      cdkBuilder.path(path.let(HttpRoutePathMatch::unwrap))
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun protocol(protocol: HttpRouteProtocol) {
      cdkBuilder.protocol(protocol.let(HttpRouteProtocol::unwrap))
    }

    public override fun queryParameters(queryParameters: List<QueryParameterMatch>) {
      cdkBuilder.queryParameters(queryParameters.map(QueryParameterMatch::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpRouteMatch = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteMatch,
  ) : HttpRouteMatch {
    public override fun headers(): List<HeaderMatch> =
        unwrap(this).getHeaders()?.map(HeaderMatch::wrap) ?: emptyList()

    public override fun method(): HttpRouteMethod? =
        unwrap(this).getMethod()?.let(HttpRouteMethod::wrap)

    public override fun path(): HttpRoutePathMatch? =
        unwrap(this).getPath()?.let(HttpRoutePathMatch::wrap)

    public override fun port(): Number? = unwrap(this).getPort()

    public override fun protocol(): HttpRouteProtocol? =
        unwrap(this).getProtocol()?.let(HttpRouteProtocol::wrap)

    public override fun queryParameters(): List<QueryParameterMatch> =
        unwrap(this).getQueryParameters()?.map(QueryParameterMatch::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteMatch {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteMatch):
        HttpRouteMatch = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteMatch):
        software.amazon.awscdk.services.appmesh.HttpRouteMatch = (wrapped as Wrapper).cdkObject
  }
}
