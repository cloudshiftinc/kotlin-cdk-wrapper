@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionForwardedValuesPropertyDsl {
  private val cdkBuilder: CfnDistribution.ForwardedValuesProperty.Builder =
      CfnDistribution.ForwardedValuesProperty.builder()

  private val _headers: MutableList<String> = mutableListOf()

  private val _queryStringCacheKeys: MutableList<String> = mutableListOf()

  /**
   * @param cookies This field is deprecated.
   * We recommend that you use a cache policy or an origin request policy instead of this field.
   *
   * If you want to include cookies in the cache key, use a cache policy. For more information, see
   * [Creating cache
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you want to send cookies to the origin but not include them in the cache key, use an origin
   * request policy. For more information, see [Creating origin request
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * A complex type that specifies whether you want CloudFront to forward cookies to the origin and,
   * if so, which ones. For more information about forwarding cookies to the origin, see [How
   * CloudFront Forwards, Caches, and Logs
   * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in the
   * *Amazon CloudFront Developer Guide* .
   */
  public fun cookies(cookies: IResolvable) {
    cdkBuilder.cookies(cookies)
  }

  /**
   * @param cookies This field is deprecated.
   * We recommend that you use a cache policy or an origin request policy instead of this field.
   *
   * If you want to include cookies in the cache key, use a cache policy. For more information, see
   * [Creating cache
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you want to send cookies to the origin but not include them in the cache key, use an origin
   * request policy. For more information, see [Creating origin request
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * A complex type that specifies whether you want CloudFront to forward cookies to the origin and,
   * if so, which ones. For more information about forwarding cookies to the origin, see [How
   * CloudFront Forwards, Caches, and Logs
   * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in the
   * *Amazon CloudFront Developer Guide* .
   */
  public fun cookies(cookies: CfnDistribution.CookiesProperty) {
    cdkBuilder.cookies(cookies)
  }

  /**
   * @param headers This field is deprecated.
   * We recommend that you use a cache policy or an origin request policy instead of this field.
   *
   * If you want to include headers in the cache key, use a cache policy. For more information, see
   * [Creating cache
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you want to send headers to the origin but not include them in the cache key, use an origin
   * request policy. For more information, see [Creating origin request
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * A complex type that specifies the `Headers` , if any, that you want CloudFront to forward to
   * the origin for this cache behavior (whitelisted headers). For the headers that you specify,
   * CloudFront also caches separate versions of a specified object that is based on the header values
   * in viewer requests.
   *
   * For more information, see [Caching Content Based on Request
   * Headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html)
   * in the *Amazon CloudFront Developer Guide* .
   */
  public fun headers(vararg headers: String) {
    _headers.addAll(listOf(*headers))
  }

  /**
   * @param headers This field is deprecated.
   * We recommend that you use a cache policy or an origin request policy instead of this field.
   *
   * If you want to include headers in the cache key, use a cache policy. For more information, see
   * [Creating cache
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you want to send headers to the origin but not include them in the cache key, use an origin
   * request policy. For more information, see [Creating origin request
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * A complex type that specifies the `Headers` , if any, that you want CloudFront to forward to
   * the origin for this cache behavior (whitelisted headers). For the headers that you specify,
   * CloudFront also caches separate versions of a specified object that is based on the header values
   * in viewer requests.
   *
   * For more information, see [Caching Content Based on Request
   * Headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html)
   * in the *Amazon CloudFront Developer Guide* .
   */
  public fun headers(headers: Collection<String>) {
    _headers.addAll(headers)
  }

  /**
   * @param queryString This field is deprecated. 
   * We recommend that you use a cache policy or an origin request policy instead of this field.
   *
   * If you want to include query strings in the cache key, use a cache policy. For more
   * information, see [Creating cache
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you want to send query strings to the origin but not include them in the cache key, use an
   * origin request policy. For more information, see [Creating origin request
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * Indicates whether you want CloudFront to forward query strings to the origin that is associated
   * with this cache behavior and cache based on the query string parameters. CloudFront behavior
   * depends on the value of `QueryString` and on the values that you specify for
   * `QueryStringCacheKeys` , if any:
   *
   * If you specify true for `QueryString` and you don't specify any values for
   * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin and caches
   * based on all query string parameters. Depending on how many query string parameters and values you
   * have, this can adversely affect performance because CloudFront must forward more requests to the
   * origin.
   *
   * If you specify true for `QueryString` and you specify one or more values for
   * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin, but it
   * only caches based on the query string parameters that you specify.
   *
   * If you specify false for `QueryString` , CloudFront doesn't forward any query string parameters
   * to the origin, and doesn't cache based on query string parameters.
   *
   * For more information, see [Configuring CloudFront to Cache Based on Query String
   * Parameters](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html)
   * in the *Amazon CloudFront Developer Guide* .
   */
  public fun queryString(queryString: Boolean) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * @param queryString This field is deprecated. 
   * We recommend that you use a cache policy or an origin request policy instead of this field.
   *
   * If you want to include query strings in the cache key, use a cache policy. For more
   * information, see [Creating cache
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you want to send query strings to the origin but not include them in the cache key, use an
   * origin request policy. For more information, see [Creating origin request
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * Indicates whether you want CloudFront to forward query strings to the origin that is associated
   * with this cache behavior and cache based on the query string parameters. CloudFront behavior
   * depends on the value of `QueryString` and on the values that you specify for
   * `QueryStringCacheKeys` , if any:
   *
   * If you specify true for `QueryString` and you don't specify any values for
   * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin and caches
   * based on all query string parameters. Depending on how many query string parameters and values you
   * have, this can adversely affect performance because CloudFront must forward more requests to the
   * origin.
   *
   * If you specify true for `QueryString` and you specify one or more values for
   * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin, but it
   * only caches based on the query string parameters that you specify.
   *
   * If you specify false for `QueryString` , CloudFront doesn't forward any query string parameters
   * to the origin, and doesn't cache based on query string parameters.
   *
   * For more information, see [Configuring CloudFront to Cache Based on Query String
   * Parameters](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html)
   * in the *Amazon CloudFront Developer Guide* .
   */
  public fun queryString(queryString: IResolvable) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * @param queryStringCacheKeys This field is deprecated.
   * We recommend that you use a cache policy or an origin request policy instead of this field.
   *
   * If you want to include query strings in the cache key, use a cache policy. For more
   * information, see [Creating cache
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you want to send query strings to the origin but not include them in the cache key, use an
   * origin request policy. For more information, see [Creating origin request
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * A complex type that contains information about the query string parameters that you want
   * CloudFront to use for caching for this cache behavior.
   */
  public fun queryStringCacheKeys(vararg queryStringCacheKeys: String) {
    _queryStringCacheKeys.addAll(listOf(*queryStringCacheKeys))
  }

  /**
   * @param queryStringCacheKeys This field is deprecated.
   * We recommend that you use a cache policy or an origin request policy instead of this field.
   *
   * If you want to include query strings in the cache key, use a cache policy. For more
   * information, see [Creating cache
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you want to send query strings to the origin but not include them in the cache key, use an
   * origin request policy. For more information, see [Creating origin request
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * A complex type that contains information about the query string parameters that you want
   * CloudFront to use for caching for this cache behavior.
   */
  public fun queryStringCacheKeys(queryStringCacheKeys: Collection<String>) {
    _queryStringCacheKeys.addAll(queryStringCacheKeys)
  }

  public fun build(): CfnDistribution.ForwardedValuesProperty {
    if(_headers.isNotEmpty()) cdkBuilder.headers(_headers)
    if(_queryStringCacheKeys.isNotEmpty()) cdkBuilder.queryStringCacheKeys(_queryStringCacheKeys)
    return cdkBuilder.build()
  }
}
