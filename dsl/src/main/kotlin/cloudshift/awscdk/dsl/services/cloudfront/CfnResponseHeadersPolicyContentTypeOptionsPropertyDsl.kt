@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

/**
 * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its
 * value set to `nosniff` .
 *
 * For more information about the `X-Content-Type-Options` HTTP response header, see
 * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
 * in the MDN Web Docs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * ContentTypeOptionsProperty contentTypeOptionsProperty = ContentTypeOptionsProperty.builder()
 * .override(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contenttypeoptions.html)
 */
@CdkDslMarker
public class CfnResponseHeadersPolicyContentTypeOptionsPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.ContentTypeOptionsProperty.Builder =
      CfnResponseHeadersPolicy.ContentTypeOptionsProperty.builder()

  /**
   * @param override A Boolean that determines whether CloudFront overrides the
   * `X-Content-Type-Options` HTTP response header received from the origin with the one specified in
   * this response headers policy. 
   */
  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides the
   * `X-Content-Type-Options` HTTP response header received from the origin with the one specified in
   * this response headers policy. 
   */
  public fun `override`(`override`: IResolvable) {
    cdkBuilder.`override`(`override`)
  }

  public fun build(): CfnResponseHeadersPolicy.ContentTypeOptionsProperty = cdkBuilder.build()
}
