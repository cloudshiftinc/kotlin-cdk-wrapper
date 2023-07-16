@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions

@CdkDslMarker
public class ResponseHeadersContentTypeOptionsDsl {
  private val cdkBuilder: ResponseHeadersContentTypeOptions.Builder =
      ResponseHeadersContentTypeOptions.builder()

  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  public fun build(): ResponseHeadersContentTypeOptions = cdkBuilder.build()
}
