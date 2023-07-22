@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * A list of origins (domain names) that CloudFront can use as the value for the
 * `Access-Control-Allow-Origin` HTTP response header.
 *
 * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
 * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
 * in the MDN Web Docs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * AccessControlAllowOriginsProperty accessControlAllowOriginsProperty =
 * AccessControlAllowOriginsProperty.builder()
 * .items(List.of("items"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolalloworigins.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyAccessControlAllowOriginsPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.Builder =
      CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.builder()

  private val _items: MutableList<String> = mutableListOf()

  /**
   * @param items The list of origins (domain names). 
   * You can specify `*` to allow all origins.
   */
  public fun items(vararg items: String) {
    _items.addAll(listOf(*items))
  }

  /**
   * @param items The list of origins (domain names). 
   * You can specify `*` to allow all origins.
   */
  public fun items(items: Collection<String>) {
    _items.addAll(items)
  }

  public fun build(): CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
