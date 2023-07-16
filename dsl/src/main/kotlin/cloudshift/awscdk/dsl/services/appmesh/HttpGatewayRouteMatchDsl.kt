@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch
import software.amazon.awscdk.services.appmesh.HeaderMatch
import software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch
import software.amazon.awscdk.services.appmesh.HttpGatewayRoutePathMatch
import software.amazon.awscdk.services.appmesh.HttpRouteMethod
import software.amazon.awscdk.services.appmesh.QueryParameterMatch

@CdkDslMarker
public class HttpGatewayRouteMatchDsl {
  private val cdkBuilder: HttpGatewayRouteMatch.Builder = HttpGatewayRouteMatch.builder()

  private val _headers: MutableList<HeaderMatch> = mutableListOf()

  private val _queryParameters: MutableList<QueryParameterMatch> = mutableListOf()

  public fun headers(vararg headers: HeaderMatch) {
    _headers.addAll(listOf(*headers))
  }

  public fun headers(headers: Collection<HeaderMatch>) {
    _headers.addAll(headers)
  }

  public fun hostname(hostname: GatewayRouteHostnameMatch) {
    cdkBuilder.hostname(hostname)
  }

  public fun method(method: HttpRouteMethod) {
    cdkBuilder.method(method)
  }

  public fun path(path: HttpGatewayRoutePathMatch) {
    cdkBuilder.path(path)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun queryParameters(vararg queryParameters: QueryParameterMatch) {
    _queryParameters.addAll(listOf(*queryParameters))
  }

  public fun queryParameters(queryParameters: Collection<QueryParameterMatch>) {
    _queryParameters.addAll(queryParameters)
  }

  public fun rewriteRequestHostname(rewriteRequestHostname: Boolean) {
    cdkBuilder.rewriteRequestHostname(rewriteRequestHostname)
  }

  public fun build(): HttpGatewayRouteMatch {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    if(_queryParameters.isNotEmpty()) cdkBuilder.queryParameters(_queryParameters)
    return cdkBuilder.build()
  }
}
