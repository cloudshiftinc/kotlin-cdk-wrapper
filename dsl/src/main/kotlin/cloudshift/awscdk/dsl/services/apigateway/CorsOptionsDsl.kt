@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.CorsOptions

@CdkDslMarker
public class CorsOptionsDsl {
  private val cdkBuilder: CorsOptions.Builder = CorsOptions.builder()

  private val _allowHeaders: MutableList<String> = mutableListOf()

  private val _allowMethods: MutableList<String> = mutableListOf()

  private val _allowOrigins: MutableList<String> = mutableListOf()

  private val _exposeHeaders: MutableList<String> = mutableListOf()

  /**
   * @param allowCredentials The Access-Control-Allow-Credentials response header tells browsers
   * whether to expose the response to frontend JavaScript code when the request's credentials mode
   * (Request.credentials) is "include".
   * When a request's credentials mode (Request.credentials) is "include",
   * browsers will only expose the response to frontend JavaScript code if the
   * Access-Control-Allow-Credentials value is true.
   *
   * Credentials are cookies, authorization headers or TLS client certificates.
   */
  public fun allowCredentials(allowCredentials: Boolean) {
    cdkBuilder.allowCredentials(allowCredentials)
  }

  /**
   * @param allowHeaders The Access-Control-Allow-Headers response header is used in response to a
   * preflight request which includes the Access-Control-Request-Headers to indicate which HTTP headers
   * can be used during the actual request.
   */
  public fun allowHeaders(vararg allowHeaders: String) {
    _allowHeaders.addAll(listOf(*allowHeaders))
  }

  /**
   * @param allowHeaders The Access-Control-Allow-Headers response header is used in response to a
   * preflight request which includes the Access-Control-Request-Headers to indicate which HTTP headers
   * can be used during the actual request.
   */
  public fun allowHeaders(allowHeaders: Collection<String>) {
    _allowHeaders.addAll(allowHeaders)
  }

  /**
   * @param allowMethods The Access-Control-Allow-Methods response header specifies the method or
   * methods allowed when accessing the resource in response to a preflight request.
   * If `ANY` is specified, it will be expanded to `Cors.ALL_METHODS`.
   */
  public fun allowMethods(vararg allowMethods: String) {
    _allowMethods.addAll(listOf(*allowMethods))
  }

  /**
   * @param allowMethods The Access-Control-Allow-Methods response header specifies the method or
   * methods allowed when accessing the resource in response to a preflight request.
   * If `ANY` is specified, it will be expanded to `Cors.ALL_METHODS`.
   */
  public fun allowMethods(allowMethods: Collection<String>) {
    _allowMethods.addAll(allowMethods)
  }

  /**
   * @param allowOrigins Specifies the list of origins that are allowed to make requests to this
   * resource. 
   * If you wish to allow all origins, specify `Cors.ALL_ORIGINS` or
   * `[ * ]`.
   *
   * Responses will include the `Access-Control-Allow-Origin` response header.
   * If `Cors.ALL_ORIGINS` is specified, the `Vary: Origin` response header will
   * also be included.
   */
  public fun allowOrigins(vararg allowOrigins: String) {
    _allowOrigins.addAll(listOf(*allowOrigins))
  }

  /**
   * @param allowOrigins Specifies the list of origins that are allowed to make requests to this
   * resource. 
   * If you wish to allow all origins, specify `Cors.ALL_ORIGINS` or
   * `[ * ]`.
   *
   * Responses will include the `Access-Control-Allow-Origin` response header.
   * If `Cors.ALL_ORIGINS` is specified, the `Vary: Origin` response header will
   * also be included.
   */
  public fun allowOrigins(allowOrigins: Collection<String>) {
    _allowOrigins.addAll(allowOrigins)
  }

  /**
   * @param disableCache Sets Access-Control-Max-Age to -1, which means that caching is disabled.
   * This option cannot be used with `maxAge`.
   */
  public fun disableCache(disableCache: Boolean) {
    cdkBuilder.disableCache(disableCache)
  }

  /**
   * @param exposeHeaders The Access-Control-Expose-Headers response header indicates which headers
   * can be exposed as part of the response by listing their names.
   * If you want clients to be able to access other headers, you have to list
   * them using the Access-Control-Expose-Headers header.
   */
  public fun exposeHeaders(vararg exposeHeaders: String) {
    _exposeHeaders.addAll(listOf(*exposeHeaders))
  }

  /**
   * @param exposeHeaders The Access-Control-Expose-Headers response header indicates which headers
   * can be exposed as part of the response by listing their names.
   * If you want clients to be able to access other headers, you have to list
   * them using the Access-Control-Expose-Headers header.
   */
  public fun exposeHeaders(exposeHeaders: Collection<String>) {
    _exposeHeaders.addAll(exposeHeaders)
  }

  /**
   * @param maxAge The Access-Control-Max-Age response header indicates how long the results of a
   * preflight request (that is the information contained in the Access-Control-Allow-Methods and
   * Access-Control-Allow-Headers headers) can be cached.
   * To disable caching altogether use `disableCache: true`.
   */
  public fun maxAge(maxAge: Duration) {
    cdkBuilder.maxAge(maxAge)
  }

  /**
   * @param statusCode Specifies the response status code returned from the OPTIONS method.
   */
  public fun statusCode(statusCode: Number) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): CorsOptions {
    if(_allowHeaders.isNotEmpty()) cdkBuilder.allowHeaders(_allowHeaders)
    if(_allowMethods.isNotEmpty()) cdkBuilder.allowMethods(_allowMethods)
    if(_allowOrigins.isNotEmpty()) cdkBuilder.allowOrigins(_allowOrigins)
    if(_exposeHeaders.isNotEmpty()) cdkBuilder.exposeHeaders(_exposeHeaders)
    return cdkBuilder.build()
  }
}
