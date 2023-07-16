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

  public fun modeBlock(modeBlock: Boolean) {
    cdkBuilder.modeBlock(modeBlock)
  }

  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  public fun protection(protection: Boolean) {
    cdkBuilder.protection(protection)
  }

  public fun reportUri(reportUri: String) {
    cdkBuilder.reportUri(reportUri)
  }

  public fun build(): ResponseHeadersXSSProtection = cdkBuilder.build()
}
