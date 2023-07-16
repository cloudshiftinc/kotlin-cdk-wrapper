@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyServerTimingHeadersConfigPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.Builder =
      CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun samplingRate(samplingRate: Number) {
    cdkBuilder.samplingRate(samplingRate)
  }

  public fun build(): CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty =
      cdkBuilder.build()
}
