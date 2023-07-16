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

  public fun limit(limit: Number) {
    cdkBuilder.limit(limit)
  }

  public fun offset(offset: Number) {
    cdkBuilder.offset(offset)
  }

  public fun period(period: String) {
    cdkBuilder.period(period)
  }

  public fun build(): CfnUsagePlan.QuotaSettingsProperty = cdkBuilder.build()
}
