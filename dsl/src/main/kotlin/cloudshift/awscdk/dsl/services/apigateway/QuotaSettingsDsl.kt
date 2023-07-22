@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.apigateway.Period
import software.amazon.awscdk.services.apigateway.QuotaSettings

@CdkDslMarker
public class QuotaSettingsDsl {
  private val cdkBuilder: QuotaSettings.Builder = QuotaSettings.builder()

  /**
   * @param limit The maximum number of requests that users can make within the specified time
   * period.
   */
  public fun limit(limit: Number) {
    cdkBuilder.limit(limit)
  }

  /**
   * @param offset For the initial time period, the number of requests to subtract from the
   * specified limit.
   */
  public fun offset(offset: Number) {
    cdkBuilder.offset(offset)
  }

  /**
   * @param period The time period for which the maximum limit of requests applies.
   */
  public fun period(period: Period) {
    cdkBuilder.period(period)
  }

  public fun build(): QuotaSettings = cdkBuilder.build()
}
