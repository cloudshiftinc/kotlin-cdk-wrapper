@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cloudfront.ResponseCustomHeader

@CdkDslMarker
public class ResponseCustomHeaderDsl {
  private val cdkBuilder: ResponseCustomHeader.Builder = ResponseCustomHeader.builder()

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
   * @param value The value for the HTTP response header. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): ResponseCustomHeader = cdkBuilder.build()
}
