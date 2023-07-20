@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRouteMatchPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteMatchProperty.Builder =
      CfnGatewayRoute.HttpGatewayRouteMatchProperty.builder()

  private val _headers: MutableList<Any> = mutableListOf()

  private val _queryParameters: MutableList<Any> = mutableListOf()

  public fun headers(vararg headers: Any) {
    _headers.addAll(listOf(*headers))
  }

  public fun headers(headers: Collection<Any>) {
    _headers.addAll(headers)
  }

  public fun headers(headers: IResolvable) {
    cdkBuilder.headers(headers)
  }

  public fun hostname(hostname: IResolvable) {
    cdkBuilder.hostname(hostname)
  }

  public fun hostname(hostname: CfnGatewayRoute.GatewayRouteHostnameMatchProperty) {
    cdkBuilder.hostname(hostname)
  }

  public fun method(method: String) {
    cdkBuilder.method(method)
  }

  public fun path(path: IResolvable) {
    cdkBuilder.path(path)
  }

  public fun path(path: CfnGatewayRoute.HttpPathMatchProperty) {
    cdkBuilder.path(path)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun queryParameters(vararg queryParameters: Any) {
    _queryParameters.addAll(listOf(*queryParameters))
  }

  public fun queryParameters(queryParameters: Collection<Any>) {
    _queryParameters.addAll(queryParameters)
  }

  public fun queryParameters(queryParameters: IResolvable) {
    cdkBuilder.queryParameters(queryParameters)
  }

  public fun build(): CfnGatewayRoute.HttpGatewayRouteMatchProperty {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    if(_queryParameters.isNotEmpty()) cdkBuilder.queryParameters(_queryParameters)
    return cdkBuilder.build()
  }
}
