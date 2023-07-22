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

/**
 * An object that represents the criteria for determining a request match.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpGatewayRouteMatchProperty httpGatewayRouteMatchProperty =
 * HttpGatewayRouteMatchProperty.builder()
 * .headers(List.of(HttpGatewayRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HttpGatewayRouteHeaderMatchProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(GatewayRouteRangeMatchProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .hostname(GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build())
 * .method("method")
 * .path(HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build())
 * .port(123)
 * .prefix("prefix")
 * .queryParameters(List.of(QueryParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .match(HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayroutematch.html)
 */
@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRouteMatchPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteMatchProperty.Builder =
      CfnGatewayRoute.HttpGatewayRouteMatchProperty.builder()

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
   * @param hostname The host name to match on.
   */
  public fun hostname(hostname: IResolvable) {
    cdkBuilder.hostname(hostname)
  }

  /**
   * @param hostname The host name to match on.
   */
  public fun hostname(hostname: CfnGatewayRoute.GatewayRouteHostnameMatchProperty) {
    cdkBuilder.hostname(hostname)
  }

  /**
   * @param method The method to match on.
   */
  public fun method(method: String) {
    cdkBuilder.method(method)
  }

  /**
   * @param path The path to match on.
   */
  public fun path(path: IResolvable) {
    cdkBuilder.path(path)
  }

  /**
   * @param path The path to match on.
   */
  public fun path(path: CfnGatewayRoute.HttpPathMatchProperty) {
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
   * @param queryParameters The query parameter to match on.
   */
  public fun queryParameters(vararg queryParameters: Any) {
    _queryParameters.addAll(listOf(*queryParameters))
  }

  /**
   * @param queryParameters The query parameter to match on.
   */
  public fun queryParameters(queryParameters: Collection<Any>) {
    _queryParameters.addAll(queryParameters)
  }

  /**
   * @param queryParameters The query parameter to match on.
   */
  public fun queryParameters(queryParameters: IResolvable) {
    cdkBuilder.queryParameters(queryParameters)
  }

  public fun build(): CfnGatewayRoute.HttpGatewayRouteMatchProperty {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    if(_queryParameters.isNotEmpty()) cdkBuilder.queryParameters(_queryParameters)
    return cdkBuilder.build()
  }
}
