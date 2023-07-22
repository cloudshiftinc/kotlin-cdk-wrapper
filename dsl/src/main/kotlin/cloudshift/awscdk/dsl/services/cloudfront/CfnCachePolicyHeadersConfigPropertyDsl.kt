@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy

@CdkDslMarker
public class CfnCachePolicyHeadersConfigPropertyDsl {
  private val cdkBuilder: CfnCachePolicy.HeadersConfigProperty.Builder =
      CfnCachePolicy.HeadersConfigProperty.builder()

  private val _headers: MutableList<String> = mutableListOf()

  /**
   * @param headerBehavior Determines whether any HTTP headers are included in the cache key and in
   * requests that CloudFront sends to the origin. 
   * Valid values are:
   *
   * * `none` – No HTTP headers are included in the cache key or in requests that CloudFront sends
   * to the origin. Even when this field is set to `none` , any headers that are listed in an
   * `OriginRequestPolicy` *are* included in origin requests.
   * * `whitelist` – Only the HTTP headers that are listed in the `Headers` type are included in the
   * cache key and in requests that CloudFront sends to the origin.
   */
  public fun headerBehavior(headerBehavior: String) {
    cdkBuilder.headerBehavior(headerBehavior)
  }

  /**
   * @param headers Contains a list of HTTP header names.
   */
  public fun headers(vararg headers: String) {
    _headers.addAll(listOf(*headers))
  }

  /**
   * @param headers Contains a list of HTTP header names.
   */
  public fun headers(headers: Collection<String>) {
    _headers.addAll(headers)
  }

  public fun build(): CfnCachePolicy.HeadersConfigProperty {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    return cdkBuilder.build()
  }
}
