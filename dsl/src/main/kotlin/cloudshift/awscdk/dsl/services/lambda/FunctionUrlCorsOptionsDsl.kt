@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions
import software.amazon.awscdk.services.lambda.HttpMethod

@CdkDslMarker
public class FunctionUrlCorsOptionsDsl {
  private val cdkBuilder: FunctionUrlCorsOptions.Builder = FunctionUrlCorsOptions.builder()

  private val _allowedHeaders: MutableList<String> = mutableListOf()

  private val _allowedMethods: MutableList<HttpMethod> = mutableListOf()

  private val _allowedOrigins: MutableList<String> = mutableListOf()

  private val _exposedHeaders: MutableList<String> = mutableListOf()

  /**
   * @param allowCredentials Whether to allow cookies or other credentials in requests to your
   * function URL.
   */
  public fun allowCredentials(allowCredentials: Boolean) {
    cdkBuilder.allowCredentials(allowCredentials)
  }

  /**
   * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers header.
   */
  public fun allowedHeaders(vararg allowedHeaders: String) {
    _allowedHeaders.addAll(listOf(*allowedHeaders))
  }

  /**
   * @param allowedHeaders Headers that are specified in the Access-Control-Request-Headers header.
   */
  public fun allowedHeaders(allowedHeaders: Collection<String>) {
    _allowedHeaders.addAll(allowedHeaders)
  }

  /**
   * @param allowedMethods An HTTP method that you allow the origin to execute.
   */
  public fun allowedMethods(vararg allowedMethods: HttpMethod) {
    _allowedMethods.addAll(listOf(*allowedMethods))
  }

  /**
   * @param allowedMethods An HTTP method that you allow the origin to execute.
   */
  public fun allowedMethods(allowedMethods: Collection<HttpMethod>) {
    _allowedMethods.addAll(allowedMethods)
  }

  /**
   * @param allowedOrigins One or more origins you want customers to be able to access the bucket
   * from.
   */
  public fun allowedOrigins(vararg allowedOrigins: String) {
    _allowedOrigins.addAll(listOf(*allowedOrigins))
  }

  /**
   * @param allowedOrigins One or more origins you want customers to be able to access the bucket
   * from.
   */
  public fun allowedOrigins(allowedOrigins: Collection<String>) {
    _allowedOrigins.addAll(allowedOrigins)
  }

  /**
   * @param exposedHeaders One or more headers in the response that you want customers to be able to
   * access from their applications.
   */
  public fun exposedHeaders(vararg exposedHeaders: String) {
    _exposedHeaders.addAll(listOf(*exposedHeaders))
  }

  /**
   * @param exposedHeaders One or more headers in the response that you want customers to be able to
   * access from their applications.
   */
  public fun exposedHeaders(exposedHeaders: Collection<String>) {
    _exposedHeaders.addAll(exposedHeaders)
  }

  /**
   * @param maxAge The time in seconds that your browser is to cache the preflight response for the
   * specified resource.
   */
  public fun maxAge(maxAge: Duration) {
    cdkBuilder.maxAge(maxAge)
  }

  public fun build(): FunctionUrlCorsOptions {
    if(_allowedHeaders.isNotEmpty()) cdkBuilder.allowedHeaders(_allowedHeaders)
    if(_allowedMethods.isNotEmpty()) cdkBuilder.allowedMethods(_allowedMethods)
    if(_allowedOrigins.isNotEmpty()) cdkBuilder.allowedOrigins(_allowedOrigins)
    if(_exposedHeaders.isNotEmpty()) cdkBuilder.exposedHeaders(_exposedHeaders)
    return cdkBuilder.build()
  }
}
