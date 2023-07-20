@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyRemoveHeaderPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.RemoveHeaderProperty.Builder =
      CfnResponseHeadersPolicy.RemoveHeaderProperty.builder()

  public fun `header`(`header`: String) {
    cdkBuilder.`header`(`header`)
  }

  public fun build(): CfnResponseHeadersPolicy.RemoveHeaderProperty = cdkBuilder.build()
}
