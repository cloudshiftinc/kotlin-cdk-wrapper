@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyFrameOptionsPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.FrameOptionsProperty.Builder =
      CfnResponseHeadersPolicy.FrameOptionsProperty.builder()

  /**
   * @param frameOption The value of the `X-Frame-Options` HTTP response header. Valid values are
   * `DENY` and `SAMEORIGIN` . 
   * For more information about these values, see
   * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
   * in the MDN Web Docs.
   */
  public fun frameOption(frameOption: String) {
    cdkBuilder.frameOption(frameOption)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides the `X-Frame-Options`
   * HTTP response header received from the origin with the one specified in this response headers
   * policy. 
   */
  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides the `X-Frame-Options`
   * HTTP response header received from the origin with the one specified in this response headers
   * policy. 
   */
  public fun `override`(`override`: IResolvable) {
    cdkBuilder.`override`(`override`)
  }

  public fun build(): CfnResponseHeadersPolicy.FrameOptionsProperty = cdkBuilder.build()
}
