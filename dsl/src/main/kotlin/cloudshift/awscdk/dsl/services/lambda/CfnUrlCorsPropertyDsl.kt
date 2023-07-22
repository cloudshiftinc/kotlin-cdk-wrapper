@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnUrl

@CdkDslMarker
public class CfnUrlCorsPropertyDsl {
  private val cdkBuilder: CfnUrl.CorsProperty.Builder = CfnUrl.CorsProperty.builder()

  private val _allowHeaders: MutableList<String> = mutableListOf()

  private val _allowMethods: MutableList<String> = mutableListOf()

  private val _allowOrigins: MutableList<String> = mutableListOf()

  private val _exposeHeaders: MutableList<String> = mutableListOf()

  /**
   * @param allowCredentials Whether you want to allow cookies or other credentials in requests to
   * your function URL.
   * The default is `false` .
   */
  public fun allowCredentials(allowCredentials: Boolean) {
    cdkBuilder.allowCredentials(allowCredentials)
  }

  /**
   * @param allowCredentials Whether you want to allow cookies or other credentials in requests to
   * your function URL.
   * The default is `false` .
   */
  public fun allowCredentials(allowCredentials: IResolvable) {
    cdkBuilder.allowCredentials(allowCredentials)
  }

  /**
   * @param allowHeaders The HTTP headers that origins can include in requests to your function URL.
   * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
   */
  public fun allowHeaders(vararg allowHeaders: String) {
    _allowHeaders.addAll(listOf(*allowHeaders))
  }

  /**
   * @param allowHeaders The HTTP headers that origins can include in requests to your function URL.
   * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
   */
  public fun allowHeaders(allowHeaders: Collection<String>) {
    _allowHeaders.addAll(allowHeaders)
  }

  /**
   * @param allowMethods The HTTP methods that are allowed when calling your function URL.
   * For example: `GET` , `POST` , `DELETE` , or the wildcard character ( `*` ).
   */
  public fun allowMethods(vararg allowMethods: String) {
    _allowMethods.addAll(listOf(*allowMethods))
  }

  /**
   * @param allowMethods The HTTP methods that are allowed when calling your function URL.
   * For example: `GET` , `POST` , `DELETE` , or the wildcard character ( `*` ).
   */
  public fun allowMethods(allowMethods: Collection<String>) {
    _allowMethods.addAll(allowMethods)
  }

  /**
   * @param allowOrigins The origins that can access your function URL.
   * You can list any number of specific origins, separated by a comma. For example:
   * `https://www.example.com` , `http://localhost:60905` .
   *
   * Alternatively, you can grant access to all origins with the wildcard character ( `*` ).
   */
  public fun allowOrigins(vararg allowOrigins: String) {
    _allowOrigins.addAll(listOf(*allowOrigins))
  }

  /**
   * @param allowOrigins The origins that can access your function URL.
   * You can list any number of specific origins, separated by a comma. For example:
   * `https://www.example.com` , `http://localhost:60905` .
   *
   * Alternatively, you can grant access to all origins with the wildcard character ( `*` ).
   */
  public fun allowOrigins(allowOrigins: Collection<String>) {
    _allowOrigins.addAll(allowOrigins)
  }

  /**
   * @param exposeHeaders The HTTP headers in your function response that you want to expose to
   * origins that call your function URL.
   * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
   */
  public fun exposeHeaders(vararg exposeHeaders: String) {
    _exposeHeaders.addAll(listOf(*exposeHeaders))
  }

  /**
   * @param exposeHeaders The HTTP headers in your function response that you want to expose to
   * origins that call your function URL.
   * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
   */
  public fun exposeHeaders(exposeHeaders: Collection<String>) {
    _exposeHeaders.addAll(exposeHeaders)
  }

  /**
   * @param maxAge The maximum amount of time, in seconds, that browsers can cache results of a
   * preflight request.
   * By default, this is set to `0` , which means the browser will not cache results.
   */
  public fun maxAge(maxAge: Number) {
    cdkBuilder.maxAge(maxAge)
  }

  public fun build(): CfnUrl.CorsProperty {
    if(_allowHeaders.isNotEmpty()) cdkBuilder.allowHeaders(_allowHeaders)
    if(_allowMethods.isNotEmpty()) cdkBuilder.allowMethods(_allowMethods)
    if(_allowOrigins.isNotEmpty()) cdkBuilder.allowOrigins(_allowOrigins)
    if(_exposeHeaders.isNotEmpty()) cdkBuilder.exposeHeaders(_exposeHeaders)
    return cdkBuilder.build()
  }
}
