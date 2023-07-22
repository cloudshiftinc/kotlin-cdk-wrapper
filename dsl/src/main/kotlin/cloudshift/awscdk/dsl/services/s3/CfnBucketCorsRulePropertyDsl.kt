@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketCorsRulePropertyDsl {
  private val cdkBuilder: CfnBucket.CorsRuleProperty.Builder = CfnBucket.CorsRuleProperty.builder()

  private val _allowedHeaders: MutableList<String> = mutableListOf()

  private val _allowedMethods: MutableList<String> = mutableListOf()

  private val _allowedOrigins: MutableList<String> = mutableListOf()

  private val _exposedHeaders: MutableList<String> = mutableListOf()

  /**
   * @param allowedHeaders Headers that are specified in the `Access-Control-Request-Headers`
   * header.
   * These headers are allowed in a preflight OPTIONS request. In response to any preflight OPTIONS
   * request, Amazon S3 returns any requested headers that are allowed.
   */
  public fun allowedHeaders(vararg allowedHeaders: String) {
    _allowedHeaders.addAll(listOf(*allowedHeaders))
  }

  /**
   * @param allowedHeaders Headers that are specified in the `Access-Control-Request-Headers`
   * header.
   * These headers are allowed in a preflight OPTIONS request. In response to any preflight OPTIONS
   * request, Amazon S3 returns any requested headers that are allowed.
   */
  public fun allowedHeaders(allowedHeaders: Collection<String>) {
    _allowedHeaders.addAll(allowedHeaders)
  }

  /**
   * @param allowedMethods An HTTP method that you allow the origin to run. 
   * *Allowed values* : `GET` | `PUT` | `HEAD` | `POST` | `DELETE`
   */
  public fun allowedMethods(vararg allowedMethods: String) {
    _allowedMethods.addAll(listOf(*allowedMethods))
  }

  /**
   * @param allowedMethods An HTTP method that you allow the origin to run. 
   * *Allowed values* : `GET` | `PUT` | `HEAD` | `POST` | `DELETE`
   */
  public fun allowedMethods(allowedMethods: Collection<String>) {
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
   * access from their applications (for example, from a JavaScript `XMLHttpRequest` object).
   */
  public fun exposedHeaders(vararg exposedHeaders: String) {
    _exposedHeaders.addAll(listOf(*exposedHeaders))
  }

  /**
   * @param exposedHeaders One or more headers in the response that you want customers to be able to
   * access from their applications (for example, from a JavaScript `XMLHttpRequest` object).
   */
  public fun exposedHeaders(exposedHeaders: Collection<String>) {
    _exposedHeaders.addAll(exposedHeaders)
  }

  /**
   * @param id A unique identifier for this rule.
   * The value must be no more than 255 characters.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param maxAge The time in seconds that your browser is to cache the preflight response for the
   * specified resource.
   */
  public fun maxAge(maxAge: Number) {
    cdkBuilder.maxAge(maxAge)
  }

  public fun build(): CfnBucket.CorsRuleProperty {
    if(_allowedHeaders.isNotEmpty()) cdkBuilder.allowedHeaders(_allowedHeaders)
    if(_allowedMethods.isNotEmpty()) cdkBuilder.allowedMethods(_allowedMethods)
    if(_allowedOrigins.isNotEmpty()) cdkBuilder.allowedOrigins(_allowedOrigins)
    if(_exposedHeaders.isNotEmpty()) cdkBuilder.exposedHeaders(_exposedHeaders)
    return cdkBuilder.build()
  }
}
