@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyStrictTransportSecurityPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.StrictTransportSecurityProperty.Builder =
      CfnResponseHeadersPolicy.StrictTransportSecurityProperty.builder()

  public fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number) {
    cdkBuilder.accessControlMaxAgeSec(accessControlMaxAgeSec)
  }

  public fun includeSubdomains(includeSubdomains: Boolean) {
    cdkBuilder.includeSubdomains(includeSubdomains)
  }

  public fun includeSubdomains(includeSubdomains: IResolvable) {
    cdkBuilder.includeSubdomains(includeSubdomains)
  }

  public fun `override`(`override`: Boolean) {
    cdkBuilder.`override`(`override`)
  }

  public fun `override`(`override`: IResolvable) {
    cdkBuilder.`override`(`override`)
  }

  public fun preload(preload: Boolean) {
    cdkBuilder.preload(preload)
  }

  public fun preload(preload: IResolvable) {
    cdkBuilder.preload(preload)
  }

  public fun build(): CfnResponseHeadersPolicy.StrictTransportSecurityProperty = cdkBuilder.build()
}
