@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * A list of HTTP methods that CloudFront includes as values for the `Access-Control-Allow-Methods`
 * HTTP response header.
 *
 * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
 * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
 * in the MDN Web Docs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * AccessControlAllowMethodsProperty accessControlAllowMethodsProperty =
 * AccessControlAllowMethodsProperty.builder()
 * .items(List.of("items"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolallowmethods.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyAccessControlAllowMethodsPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty.Builder =
      CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty.builder()

  private val _items: MutableList<String> = mutableListOf()

  /**
   * @param items The list of HTTP methods. Valid values are:. 
   * * `GET`
   * * `DELETE`
   * * `HEAD`
   * * `OPTIONS`
   * * `PATCH`
   * * `POST`
   * * `PUT`
   * * `ALL`
   *
   * `ALL` is a special value that includes all of the listed HTTP methods.
   */
  public fun items(vararg items: String) {
    _items.addAll(listOf(*items))
  }

  /**
   * @param items The list of HTTP methods. Valid values are:. 
   * * `GET`
   * * `DELETE`
   * * `HEAD`
   * * `OPTIONS`
   * * `PATCH`
   * * `POST`
   * * `PUT`
   * * `ALL`
   *
   * `ALL` is a special value that includes all of the listed HTTP methods.
   */
  public fun items(items: Collection<String>) {
    _items.addAll(items)
  }

  public fun build(): CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
