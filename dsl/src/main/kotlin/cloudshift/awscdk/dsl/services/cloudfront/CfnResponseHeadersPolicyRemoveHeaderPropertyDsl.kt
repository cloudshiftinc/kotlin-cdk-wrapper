@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * The name of an HTTP header that CloudFront removes from HTTP responses to requests that match the
 * cache behavior that this response headers policy is attached to.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * RemoveHeaderProperty removeHeaderProperty = RemoveHeaderProperty.builder()
 * .header("header")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-removeheader.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyRemoveHeaderPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.RemoveHeaderProperty.Builder =
      CfnResponseHeadersPolicy.RemoveHeaderProperty.builder()

  /**
   * @param header The HTTP header name. 
   */
  public fun `header`(`header`: String) {
    cdkBuilder.`header`(`header`)
  }

  public fun build(): CfnResponseHeadersPolicy.RemoveHeaderProperty = cdkBuilder.build()
}
