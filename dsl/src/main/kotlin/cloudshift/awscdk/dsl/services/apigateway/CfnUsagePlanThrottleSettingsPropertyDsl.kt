@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

@CdkDslMarker
public class CfnUsagePlanThrottleSettingsPropertyDsl {
  private val cdkBuilder: CfnUsagePlan.ThrottleSettingsProperty.Builder =
      CfnUsagePlan.ThrottleSettingsProperty.builder()

  /**
   * @param burstLimit The API target request burst rate limit.
   * This allows more requests through for a period of time than the target rate limit.
   */
  public fun burstLimit(burstLimit: Number) {
    cdkBuilder.burstLimit(burstLimit)
  }

  /**
   * @param rateLimit The API target request rate limit.
   */
  public fun rateLimit(rateLimit: Number) {
    cdkBuilder.rateLimit(rateLimit)
  }

  public fun build(): CfnUsagePlan.ThrottleSettingsProperty = cdkBuilder.build()
}
