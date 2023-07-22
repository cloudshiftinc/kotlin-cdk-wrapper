@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnUsagePlan

@CdkDslMarker
public class CfnUsagePlanQuotaSettingsPropertyDsl {
  private val cdkBuilder: CfnUsagePlan.QuotaSettingsProperty.Builder =
      CfnUsagePlan.QuotaSettingsProperty.builder()

  /**
   * @param limit The target maximum number of requests that can be made in a given time period.
   */
  public fun limit(limit: Number) {
    cdkBuilder.limit(limit)
  }

  /**
   * @param offset The number of requests subtracted from the given limit in the initial time
   * period.
   */
  public fun offset(offset: Number) {
    cdkBuilder.offset(offset)
  }

  /**
   * @param period The time period in which the limit applies.
   * Valid values are "DAY", "WEEK" or "MONTH".
   */
  public fun period(period: String) {
    cdkBuilder.period(period)
  }

  public fun build(): CfnUsagePlan.QuotaSettingsProperty = cdkBuilder.build()
}
