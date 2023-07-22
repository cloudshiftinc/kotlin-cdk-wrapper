@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cloudfront.HeadersFrameOption
import software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions

@CdkDslMarker
public class ResponseHeadersFrameOptionsDsl {
  private val cdkBuilder: ResponseHeadersFrameOptions.Builder =
      ResponseHeadersFrameOptions.builder()

  /**
   * @param frameOption The value of the X-Frame-Options HTTP response header. 
   */
  public fun frameOption(frameOption: HeadersFrameOption) {
    cdkBuilder.frameOption(frameOption)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides the X-Frame-Options HTTP
   * response header received from the origin with the one specified in this response headers policy. 
   */
  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  public fun build(): ResponseHeadersFrameOptions = cdkBuilder.build()
}
