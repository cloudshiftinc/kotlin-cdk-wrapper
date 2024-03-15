@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface HttpGatewayRouteMatch {
  public fun headers(): List<HeaderMatch> = unwrap(this).getHeaders()?.map(HeaderMatch::wrap) ?:
      emptyList()

  public fun hostname(): GatewayRouteHostnameMatch? =
      unwrap(this).getHostname()?.let(GatewayRouteHostnameMatch::wrap)

  public fun method(): HttpRouteMethod? = unwrap(this).getMethod()?.let(HttpRouteMethod::wrap)

  public fun path(): HttpGatewayRoutePathMatch? =
      unwrap(this).getPath()?.let(HttpGatewayRoutePathMatch::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun queryParameters(): List<QueryParameterMatch> =
      unwrap(this).getQueryParameters()?.map(QueryParameterMatch::wrap) ?: emptyList()

  public fun rewriteRequestHostname(): Boolean? = unwrap(this).getRewriteRequestHostname()

  @CdkDslMarker
  public interface Builder {
    public fun headers(headers: List<HeaderMatch>)

    public fun headers(vararg headers: HeaderMatch)

    public fun hostname(hostname: GatewayRouteHostnameMatch)

    public fun method(method: HttpRouteMethod)

    public fun path(path: HttpGatewayRoutePathMatch)

    public fun port(port: Number)

    public fun queryParameters(queryParameters: List<QueryParameterMatch>)

    public fun queryParameters(vararg queryParameters: QueryParameterMatch)

    public fun rewriteRequestHostname(rewriteRequestHostname: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch.Builder =
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch.builder()

    override fun headers(headers: List<HeaderMatch>) {
      cdkBuilder.headers(headers.map(HeaderMatch::unwrap))
    }

    override fun headers(vararg headers: HeaderMatch): Unit = headers(headers.toList())

    override fun hostname(hostname: GatewayRouteHostnameMatch) {
      cdkBuilder.hostname(hostname.let(GatewayRouteHostnameMatch::unwrap))
    }

    override fun method(method: HttpRouteMethod) {
      cdkBuilder.method(method.let(HttpRouteMethod::unwrap))
    }

    override fun path(path: HttpGatewayRoutePathMatch) {
      cdkBuilder.path(path.let(HttpGatewayRoutePathMatch::unwrap))
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun queryParameters(queryParameters: List<QueryParameterMatch>) {
      cdkBuilder.queryParameters(queryParameters.map(QueryParameterMatch::unwrap))
    }

    override fun queryParameters(vararg queryParameters: QueryParameterMatch): Unit =
        queryParameters(queryParameters.toList())

    override fun rewriteRequestHostname(rewriteRequestHostname: Boolean) {
      cdkBuilder.rewriteRequestHostname(rewriteRequestHostname)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch,
  ) : CdkObject(cdkObject), HttpGatewayRouteMatch {
    override fun headers(): List<HeaderMatch> = unwrap(this).getHeaders()?.map(HeaderMatch::wrap) ?:
        emptyList()

    override fun hostname(): GatewayRouteHostnameMatch? =
        unwrap(this).getHostname()?.let(GatewayRouteHostnameMatch::wrap)

    override fun method(): HttpRouteMethod? = unwrap(this).getMethod()?.let(HttpRouteMethod::wrap)

    override fun path(): HttpGatewayRoutePathMatch? =
        unwrap(this).getPath()?.let(HttpGatewayRoutePathMatch::wrap)

    override fun port(): Number? = unwrap(this).getPort()

    override fun queryParameters(): List<QueryParameterMatch> =
        unwrap(this).getQueryParameters()?.map(QueryParameterMatch::wrap) ?: emptyList()

    override fun rewriteRequestHostname(): Boolean? = unwrap(this).getRewriteRequestHostname()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteMatch {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch):
        HttpGatewayRouteMatch = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayRouteMatch):
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch
  }
}
