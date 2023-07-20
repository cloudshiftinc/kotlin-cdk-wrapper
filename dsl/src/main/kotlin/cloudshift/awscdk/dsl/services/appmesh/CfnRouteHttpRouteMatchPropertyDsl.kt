@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteHttpRouteMatchPropertyDsl {
  private val cdkBuilder: CfnRoute.HttpRouteMatchProperty.Builder =
      CfnRoute.HttpRouteMatchProperty.builder()

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

  public fun method(method: String) {
    cdkBuilder.method(method)
  }

  public fun path(path: IResolvable) {
    cdkBuilder.path(path)
  }

  public fun path(path: CfnRoute.HttpPathMatchProperty) {
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

  public fun scheme(scheme: String) {
    cdkBuilder.scheme(scheme)
  }

  public fun build(): CfnRoute.HttpRouteMatchProperty {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    if(_queryParameters.isNotEmpty()) cdkBuilder.queryParameters(_queryParameters)
    return cdkBuilder.build()
  }
}
