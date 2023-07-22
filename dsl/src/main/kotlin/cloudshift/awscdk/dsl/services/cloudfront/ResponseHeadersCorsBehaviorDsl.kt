@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior

@CdkDslMarker
public class ResponseHeadersCorsBehaviorDsl {
  private val cdkBuilder: ResponseHeadersCorsBehavior.Builder =
      ResponseHeadersCorsBehavior.builder()

  private val _accessControlAllowHeaders: MutableList<String> = mutableListOf()

  private val _accessControlAllowMethods: MutableList<String> = mutableListOf()

  private val _accessControlAllowOrigins: MutableList<String> = mutableListOf()

  private val _accessControlExposeHeaders: MutableList<String> = mutableListOf()

  /**
   * @param accessControlAllowCredentials A Boolean that CloudFront uses as the value for the
   * Access-Control-Allow-Credentials HTTP response header. 
   */
  public fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean) {
    cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
  }

  /**
   * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as values
   * for the Access-Control-Allow-Headers HTTP response header. 
   * You can specify `['*']` to allow all headers.
   */
  public fun accessControlAllowHeaders(vararg accessControlAllowHeaders: String) {
    _accessControlAllowHeaders.addAll(listOf(*accessControlAllowHeaders))
  }

  /**
   * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as values
   * for the Access-Control-Allow-Headers HTTP response header. 
   * You can specify `['*']` to allow all headers.
   */
  public fun accessControlAllowHeaders(accessControlAllowHeaders: Collection<String>) {
    _accessControlAllowHeaders.addAll(accessControlAllowHeaders)
  }

  /**
   * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values for
   * the Access-Control-Allow-Methods HTTP response header. 
   */
  public fun accessControlAllowMethods(vararg accessControlAllowMethods: String) {
    _accessControlAllowMethods.addAll(listOf(*accessControlAllowMethods))
  }

  /**
   * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values for
   * the Access-Control-Allow-Methods HTTP response header. 
   */
  public fun accessControlAllowMethods(accessControlAllowMethods: Collection<String>) {
    _accessControlAllowMethods.addAll(accessControlAllowMethods)
  }

  /**
   * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use as
   * the value for the Access-Control-Allow-Origin HTTP response header. 
   * You can specify `['*']` to allow all origins.
   */
  public fun accessControlAllowOrigins(vararg accessControlAllowOrigins: String) {
    _accessControlAllowOrigins.addAll(listOf(*accessControlAllowOrigins))
  }

  /**
   * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use as
   * the value for the Access-Control-Allow-Origin HTTP response header. 
   * You can specify `['*']` to allow all origins.
   */
  public fun accessControlAllowOrigins(accessControlAllowOrigins: Collection<String>) {
    _accessControlAllowOrigins.addAll(accessControlAllowOrigins)
  }

  /**
   * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values for
   * the Access-Control-Expose-Headers HTTP response header.
   * You can specify `['*']` to expose all headers.
   */
  public fun accessControlExposeHeaders(vararg accessControlExposeHeaders: String) {
    _accessControlExposeHeaders.addAll(listOf(*accessControlExposeHeaders))
  }

  /**
   * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values for
   * the Access-Control-Expose-Headers HTTP response header.
   * You can specify `['*']` to expose all headers.
   */
  public fun accessControlExposeHeaders(accessControlExposeHeaders: Collection<String>) {
    _accessControlExposeHeaders.addAll(accessControlExposeHeaders)
  }

  /**
   * @param accessControlMaxAge A number that CloudFront uses as the value for the
   * Access-Control-Max-Age HTTP response header.
   */
  public fun accessControlMaxAge(accessControlMaxAge: Duration) {
    cdkBuilder.accessControlMaxAge(accessControlMaxAge)
  }

  /**
   * @param originOverride A Boolean that determines whether CloudFront overrides HTTP response
   * headers received from the origin with the ones specified in this response headers policy. 
   */
  public fun originOverride(originOverride: Boolean) {
    cdkBuilder.originOverride(originOverride)
  }

  public fun build(): ResponseHeadersCorsBehavior {
    if(_accessControlAllowHeaders.isNotEmpty())
        cdkBuilder.accessControlAllowHeaders(_accessControlAllowHeaders)
    if(_accessControlAllowMethods.isNotEmpty())
        cdkBuilder.accessControlAllowMethods(_accessControlAllowMethods)
    if(_accessControlAllowOrigins.isNotEmpty())
        cdkBuilder.accessControlAllowOrigins(_accessControlAllowOrigins)
    if(_accessControlExposeHeaders.isNotEmpty())
        cdkBuilder.accessControlExposeHeaders(_accessControlExposeHeaders)
    return cdkBuilder.build()
  }
}
