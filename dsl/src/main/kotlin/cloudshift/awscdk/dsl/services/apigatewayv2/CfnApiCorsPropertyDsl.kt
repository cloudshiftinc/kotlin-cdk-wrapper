@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnApi

/**
 * The `Cors` property specifies a CORS configuration for an API.
 *
 * Supported only for HTTP APIs. See [Configuring
 * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
 * information.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * CorsProperty corsProperty = CorsProperty.builder()
 * .allowCredentials(false)
 * .allowHeaders(List.of("allowHeaders"))
 * .allowMethods(List.of("allowMethods"))
 * .allowOrigins(List.of("allowOrigins"))
 * .exposeHeaders(List.of("exposeHeaders"))
 * .maxAge(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html)
 */
@CdkDslMarker
public class CfnApiCorsPropertyDsl {
  private val cdkBuilder: CfnApi.CorsProperty.Builder = CfnApi.CorsProperty.builder()

  private val _allowHeaders: MutableList<String> = mutableListOf()

  private val _allowMethods: MutableList<String> = mutableListOf()

  private val _allowOrigins: MutableList<String> = mutableListOf()

  private val _exposeHeaders: MutableList<String> = mutableListOf()

  /**
   * @param allowCredentials Specifies whether credentials are included in the CORS request.
   * Supported only for HTTP APIs.
   */
  public fun allowCredentials(allowCredentials: Boolean) {
    cdkBuilder.allowCredentials(allowCredentials)
  }

  /**
   * @param allowCredentials Specifies whether credentials are included in the CORS request.
   * Supported only for HTTP APIs.
   */
  public fun allowCredentials(allowCredentials: IResolvable) {
    cdkBuilder.allowCredentials(allowCredentials)
  }

  /**
   * @param allowHeaders Represents a collection of allowed headers.
   * Supported only for HTTP APIs.
   */
  public fun allowHeaders(vararg allowHeaders: String) {
    _allowHeaders.addAll(listOf(*allowHeaders))
  }

  /**
   * @param allowHeaders Represents a collection of allowed headers.
   * Supported only for HTTP APIs.
   */
  public fun allowHeaders(allowHeaders: Collection<String>) {
    _allowHeaders.addAll(allowHeaders)
  }

  /**
   * @param allowMethods Represents a collection of allowed HTTP methods.
   * Supported only for HTTP APIs.
   */
  public fun allowMethods(vararg allowMethods: String) {
    _allowMethods.addAll(listOf(*allowMethods))
  }

  /**
   * @param allowMethods Represents a collection of allowed HTTP methods.
   * Supported only for HTTP APIs.
   */
  public fun allowMethods(allowMethods: Collection<String>) {
    _allowMethods.addAll(allowMethods)
  }

  /**
   * @param allowOrigins Represents a collection of allowed origins.
   * Supported only for HTTP APIs.
   */
  public fun allowOrigins(vararg allowOrigins: String) {
    _allowOrigins.addAll(listOf(*allowOrigins))
  }

  /**
   * @param allowOrigins Represents a collection of allowed origins.
   * Supported only for HTTP APIs.
   */
  public fun allowOrigins(allowOrigins: Collection<String>) {
    _allowOrigins.addAll(allowOrigins)
  }

  /**
   * @param exposeHeaders Represents a collection of exposed headers.
   * Supported only for HTTP APIs.
   */
  public fun exposeHeaders(vararg exposeHeaders: String) {
    _exposeHeaders.addAll(listOf(*exposeHeaders))
  }

  /**
   * @param exposeHeaders Represents a collection of exposed headers.
   * Supported only for HTTP APIs.
   */
  public fun exposeHeaders(exposeHeaders: Collection<String>) {
    _exposeHeaders.addAll(exposeHeaders)
  }

  /**
   * @param maxAge The number of seconds that the browser should cache preflight request results.
   * Supported only for HTTP APIs.
   */
  public fun maxAge(maxAge: Number) {
    cdkBuilder.maxAge(maxAge)
  }

  public fun build(): CfnApi.CorsProperty {
    if(_allowHeaders.isNotEmpty()) cdkBuilder.allowHeaders(_allowHeaders)
    if(_allowMethods.isNotEmpty()) cdkBuilder.allowMethods(_allowMethods)
    if(_allowOrigins.isNotEmpty()) cdkBuilder.allowOrigins(_allowOrigins)
    if(_exposeHeaders.isNotEmpty()) cdkBuilder.exposeHeaders(_exposeHeaders)
    return cdkBuilder.build()
  }
}
