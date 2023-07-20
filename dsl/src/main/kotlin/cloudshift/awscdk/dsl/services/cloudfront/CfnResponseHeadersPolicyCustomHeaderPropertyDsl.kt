@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyCustomHeaderPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.CustomHeaderProperty.Builder =
      CfnResponseHeadersPolicy.CustomHeaderProperty.builder()

  public fun `header`(`header`: String) {
    cdkBuilder.`header`(`header`)
  }

  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  public fun `override`(`override`: IResolvable) {
    cdkBuilder.`override`(`override`)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnResponseHeadersPolicy.CustomHeaderProperty = cdkBuilder.build()
}
