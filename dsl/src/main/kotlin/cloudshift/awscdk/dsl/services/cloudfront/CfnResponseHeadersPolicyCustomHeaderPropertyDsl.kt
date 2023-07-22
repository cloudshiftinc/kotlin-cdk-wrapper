@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * An HTTP response header name and its value.
 *
 * CloudFront includes this header in HTTP responses that it sends for requests that match a cache
 * behavior that's associated with this response headers policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CustomHeaderProperty customHeaderProperty = CustomHeaderProperty.builder()
 * .header("header")
 * .override(false)
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheader.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyCustomHeaderPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.CustomHeaderProperty.Builder =
      CfnResponseHeadersPolicy.CustomHeaderProperty.builder()

  /**
   * @param header The HTTP response header name. 
   */
  public fun `header`(`header`: String) {
    cdkBuilder.`header`(`header`)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides a response header with
   * the same name received from the origin with the header specified here. 
   */
  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides a response header with
   * the same name received from the origin with the header specified here. 
   */
  public fun `override`(`override`: IResolvable) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param value The value for the HTTP response header. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnResponseHeadersPolicy.CustomHeaderProperty = cdkBuilder.build()
}
