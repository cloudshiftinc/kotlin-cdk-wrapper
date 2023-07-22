@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection

@CdkDslMarker
public class ResponseHeadersXSSProtectionDsl {
  private val cdkBuilder: ResponseHeadersXSSProtection.Builder =
      ResponseHeadersXSSProtection.builder()

  /**
   * @param modeBlock A Boolean that determines whether CloudFront includes the mode=block directive
   * in the X-XSS-Protection header.
   */
  public fun modeBlock(modeBlock: Boolean) {
    cdkBuilder.modeBlock(modeBlock)
  }

  /**
   * @param override A Boolean that determines whether CloudFront overrides the X-XSS-Protection
   * HTTP response header received from the origin with the one specified in this response headers
   * policy. 
   */
  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  /**
   * @param protection A Boolean that determines the value of the X-XSS-Protection HTTP response
   * header. 
   * When this setting is true, the value of the X-XSS-Protection header is 1.
   * When this setting is false, the value of the X-XSS-Protection header is 0.
   */
  public fun protection(protection: Boolean) {
    cdkBuilder.protection(protection)
  }

  /**
   * @param reportUri A reporting URI, which CloudFront uses as the value of the report directive in
   * the X-XSS-Protection header.
   * You cannot specify a ReportUri when ModeBlock is true.
   */
  public fun reportUri(reportUri: String) {
    cdkBuilder.reportUri(reportUri)
  }

  public fun build(): ResponseHeadersXSSProtection = cdkBuilder.build()
}
