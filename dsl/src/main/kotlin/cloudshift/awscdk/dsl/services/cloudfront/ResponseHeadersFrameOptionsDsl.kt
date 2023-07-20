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

  public fun frameOption(frameOption: HeadersFrameOption) {
    cdkBuilder.frameOption(frameOption)
  }

  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  public fun build(): ResponseHeadersFrameOptions = cdkBuilder.build()
}
