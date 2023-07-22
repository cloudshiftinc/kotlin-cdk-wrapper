@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * A list of HTTP header names that CloudFront includes as values for the
 * `Access-Control-Allow-Headers` HTTP response header.
 *
 * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
 * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
 * in the MDN Web Docs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * AccessControlAllowHeadersProperty accessControlAllowHeadersProperty =
 * AccessControlAllowHeadersProperty.builder()
 * .items(List.of("items"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolallowheaders.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyAccessControlAllowHeadersPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty.Builder =
      CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty.builder()

  private val _items: MutableList<String> = mutableListOf()

  /**
   * @param items The list of HTTP header names. 
   * You can specify `*` to allow all headers.
   */
  public fun items(vararg items: String) {
    _items.addAll(listOf(*items))
  }

  /**
   * @param items The list of HTTP header names. 
   * You can specify `*` to allow all headers.
   */
  public fun items(items: Collection<String>) {
    _items.addAll(items)
  }

  public fun build(): CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
