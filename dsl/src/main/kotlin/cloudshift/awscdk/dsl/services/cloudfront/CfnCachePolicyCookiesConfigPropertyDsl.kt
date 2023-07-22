@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy

/**
 * An object that determines whether any cookies in viewer requests (and if so, which cookies) are
 * included in the cache key and in requests that CloudFront sends to the origin.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CookiesConfigProperty cookiesConfigProperty = CookiesConfigProperty.builder()
 * .cookieBehavior("cookieBehavior")
 * // the properties below are optional
 * .cookies(List.of("cookies"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cookiesconfig.html)
 */
@CdkDslMarker
public class CfnCachePolicyCookiesConfigPropertyDsl {
  private val cdkBuilder: CfnCachePolicy.CookiesConfigProperty.Builder =
      CfnCachePolicy.CookiesConfigProperty.builder()

  private val _cookies: MutableList<String> = mutableListOf()

  /**
   * @param cookieBehavior Determines whether any cookies in viewer requests are included in the
   * cache key and in requests that CloudFront sends to the origin. 
   * Valid values are:
   *
   * * `none` – No cookies in viewer requests are included in the cache key or in requests that
   * CloudFront sends to the origin. Even when this field is set to `none` , any cookies that are
   * listed in an `OriginRequestPolicy` *are* included in origin requests.
   * * `whitelist` – Only the cookies in viewer requests that are listed in the `CookieNames` type
   * are included in the cache key and in requests that CloudFront sends to the origin.
   * * `allExcept` – All cookies in viewer requests are included in the cache key and in requests
   * that CloudFront sends to the origin, **except** for those that are listed in the `CookieNames`
   * type, which are not included.
   * * `all` – All cookies in viewer requests are included in the cache key and in requests that
   * CloudFront sends to the origin.
   */
  public fun cookieBehavior(cookieBehavior: String) {
    cdkBuilder.cookieBehavior(cookieBehavior)
  }

  /**
   * @param cookies Contains a list of cookie names.
   */
  public fun cookies(vararg cookies: String) {
    _cookies.addAll(listOf(*cookies))
  }

  /**
   * @param cookies Contains a list of cookie names.
   */
  public fun cookies(cookies: Collection<String>) {
    _cookies.addAll(cookies)
  }

  public fun build(): CfnCachePolicy.CookiesConfigProperty {
    if(_cookies.isNotEmpty()) cdkBuilder.cookies(_cookies)
    return cdkBuilder.build()
  }
}
