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

  /**
   * @param headers The client request headers to match on.
   */
  public fun headers(vararg headers: Any) {
    _headers.addAll(listOf(*headers))
  }

  /**
   * @param headers The client request headers to match on.
   */
  public fun headers(headers: Collection<Any>) {
    _headers.addAll(headers)
  }

  /**
   * @param headers The client request headers to match on.
   */
  public fun headers(headers: IResolvable) {
    cdkBuilder.headers(headers)
  }

  /**
   * @param method The client request method to match on.
   * Specify only one.
   */
  public fun method(method: String) {
    cdkBuilder.method(method)
  }

  /**
   * @param path The client request path to match on.
   */
  public fun path(path: IResolvable) {
    cdkBuilder.path(path)
  }

  /**
   * @param path The client request path to match on.
   */
  public fun path(path: CfnRoute.HttpPathMatchProperty) {
    cdkBuilder.path(path)
  }

  /**
   * @param port The port number to match on.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param prefix Specifies the path to match requests with.
   * This parameter must always start with `/` , which by itself matches all requests to the virtual
   * service name. You can also match for path-based routing of requests. For example, if your virtual
   * service name is `my-service.local` and you want the route to match requests to
   * `my-service.local/metrics` , your prefix should be `/metrics` .
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param queryParameters The client request query parameters to match on.
   */
  public fun queryParameters(vararg queryParameters: Any) {
    _queryParameters.addAll(listOf(*queryParameters))
  }

  /**
   * @param queryParameters The client request query parameters to match on.
   */
  public fun queryParameters(queryParameters: Collection<Any>) {
    _queryParameters.addAll(queryParameters)
  }

  /**
   * @param queryParameters The client request query parameters to match on.
   */
  public fun queryParameters(queryParameters: IResolvable) {
    cdkBuilder.queryParameters(queryParameters)
  }

  /**
   * @param scheme The client request scheme to match on.
   * Specify only one. Applicable only for HTTP2 routes.
   */
  public fun scheme(scheme: String) {
    cdkBuilder.scheme(scheme)
  }

  public fun build(): CfnRoute.HttpRouteMatchProperty {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    if(_queryParameters.isNotEmpty()) cdkBuilder.queryParameters(_queryParameters)
    return cdkBuilder.build()
  }
}
