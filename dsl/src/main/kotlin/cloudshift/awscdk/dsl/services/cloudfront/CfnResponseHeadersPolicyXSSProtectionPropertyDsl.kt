@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyXSSProtectionPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.XSSProtectionProperty.Builder =
      CfnResponseHeadersPolicy.XSSProtectionProperty.builder()

  public fun modeBlock(modeBlock: Boolean) {
    cdkBuilder.modeBlock(modeBlock)
  }

  public fun modeBlock(modeBlock: IResolvable) {
    cdkBuilder.modeBlock(modeBlock)
  }

  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  public fun `override`(`override`: IResolvable) {
    cdkBuilder.`override`(`override`)
  }

  public fun protection(protection: Boolean) {
    cdkBuilder.protection(protection)
  }

  public fun protection(protection: IResolvable) {
    cdkBuilder.protection(protection)
  }

  public fun reportUri(reportUri: String) {
    cdkBuilder.reportUri(reportUri)
  }

  public fun build(): CfnResponseHeadersPolicy.XSSProtectionProperty = cdkBuilder.build()
}
