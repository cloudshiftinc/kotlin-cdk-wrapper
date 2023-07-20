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

  public fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean) {
    cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
  }

  public fun accessControlAllowHeaders(vararg accessControlAllowHeaders: String) {
    _accessControlAllowHeaders.addAll(listOf(*accessControlAllowHeaders))
  }

  public fun accessControlAllowHeaders(accessControlAllowHeaders: Collection<String>) {
    _accessControlAllowHeaders.addAll(accessControlAllowHeaders)
  }

  public fun accessControlAllowMethods(vararg accessControlAllowMethods: String) {
    _accessControlAllowMethods.addAll(listOf(*accessControlAllowMethods))
  }

  public fun accessControlAllowMethods(accessControlAllowMethods: Collection<String>) {
    _accessControlAllowMethods.addAll(accessControlAllowMethods)
  }

  public fun accessControlAllowOrigins(vararg accessControlAllowOrigins: String) {
    _accessControlAllowOrigins.addAll(listOf(*accessControlAllowOrigins))
  }

  public fun accessControlAllowOrigins(accessControlAllowOrigins: Collection<String>) {
    _accessControlAllowOrigins.addAll(accessControlAllowOrigins)
  }

  public fun accessControlExposeHeaders(vararg accessControlExposeHeaders: String) {
    _accessControlExposeHeaders.addAll(listOf(*accessControlExposeHeaders))
  }

  public fun accessControlExposeHeaders(accessControlExposeHeaders: Collection<String>) {
    _accessControlExposeHeaders.addAll(accessControlExposeHeaders)
  }

  public fun accessControlMaxAge(accessControlMaxAge: Duration) {
    cdkBuilder.accessControlMaxAge(accessControlMaxAge)
  }

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
