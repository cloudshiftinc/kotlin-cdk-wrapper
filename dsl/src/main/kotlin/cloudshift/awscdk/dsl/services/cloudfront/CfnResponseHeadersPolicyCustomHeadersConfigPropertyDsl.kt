@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * A list of HTTP response header names and their values.
 *
 * CloudFront includes these headers in HTTP responses that it sends for requests that match a cache
 * behavior that's associated with this response headers policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CustomHeadersConfigProperty customHeadersConfigProperty = CustomHeadersConfigProperty.builder()
 * .items(List.of(CustomHeaderProperty.builder()
 * .header("header")
 * .override(false)
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheadersconfig.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyCustomHeadersConfigPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.CustomHeadersConfigProperty.Builder =
      CfnResponseHeadersPolicy.CustomHeadersConfigProperty.builder()

  private val _items: MutableList<Any> = mutableListOf()

  /**
   * @param items The list of HTTP response headers and their values. 
   */
  public fun items(vararg items: Any) {
    _items.addAll(listOf(*items))
  }

  /**
   * @param items The list of HTTP response headers and their values. 
   */
  public fun items(items: Collection<Any>) {
    _items.addAll(items)
  }

  /**
   * @param items The list of HTTP response headers and their values. 
   */
  public fun items(items: IResolvable) {
    cdkBuilder.items(items)
  }

  public fun build(): CfnResponseHeadersPolicy.CustomHeadersConfigProperty {
    if(_items.isNotEmpty()) cdkBuilder.items(_items)
    return cdkBuilder.build()
  }
}
