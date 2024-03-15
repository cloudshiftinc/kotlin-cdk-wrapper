@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun headers(headers: List<HeaderMatch>)

    public fun headers(vararg headers: HeaderMatch)

    public fun method(method: HttpRouteMethod)

    public fun path(path: HttpRoutePathMatch)

    public fun port(port: Number)

    public fun protocol(protocol: HttpRouteProtocol)

    public fun queryParameters(queryParameters: List<QueryParameterMatch>)

    public fun queryParameters(vararg queryParameters: QueryParameterMatch)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpRouteMatch.Builder =
        software.amazon.awscdk.services.appmesh.HttpRouteMatch.builder()

    override fun headers(headers: List<HeaderMatch>) {
      cdkBuilder.headers(headers.map(HeaderMatch::unwrap))
    }

    override fun headers(vararg headers: HeaderMatch): Unit = headers(headers.toList())

    override fun method(method: HttpRouteMethod) {
      cdkBuilder.method(method.let(HttpRouteMethod::unwrap))
    }

    override fun path(path: HttpRoutePathMatch) {
      cdkBuilder.path(path.let(HttpRoutePathMatch::unwrap))
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: HttpRouteProtocol) {
      cdkBuilder.protocol(protocol.let(HttpRouteProtocol::unwrap))
    }

    override fun queryParameters(queryParameters: List<QueryParameterMatch>) {
      cdkBuilder.queryParameters(queryParameters.map(QueryParameterMatch::unwrap))
    }

    override fun queryParameters(vararg queryParameters: QueryParameterMatch): Unit =
        queryParameters(queryParameters.toList())

    public fun build(): software.amazon.awscdk.services.appmesh.HttpRouteMatch = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteMatch,
  ) : CdkObject(cdkObject), HttpRouteMatch {
    override fun headers(): List<HeaderMatch> = unwrap(this).getHeaders()?.map(HeaderMatch::wrap) ?:
        emptyList()

    override fun method(): HttpRouteMethod? = unwrap(this).getMethod()?.let(HttpRouteMethod::wrap)

    override fun path(): HttpRoutePathMatch? = unwrap(this).getPath()?.let(HttpRoutePathMatch::wrap)

    override fun port(): Number? = unwrap(this).getPort()

    override fun protocol(): HttpRouteProtocol? =
        unwrap(this).getProtocol()?.let(HttpRouteProtocol::wrap)

    override fun queryParameters(): List<QueryParameterMatch> =
        unwrap(this).getQueryParameters()?.map(QueryParameterMatch::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteMatch {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpRouteMatch):
        HttpRouteMatch = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteMatch):
        software.amazon.awscdk.services.appmesh.HttpRouteMatch = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.HttpRouteMatch
  }
}
