@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.iot.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplateRateIncreaseCriteriaPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.RateIncreaseCriteriaProperty.Builder =
      CfnJobTemplate.RateIncreaseCriteriaProperty.builder()

  /**
   * @param numberOfNotifiedThings The threshold for number of notified things that will initiate
   * the increase in rate of rollout.
   */
  public fun numberOfNotifiedThings(numberOfNotifiedThings: Number) {
    cdkBuilder.numberOfNotifiedThings(numberOfNotifiedThings)
  }

  /**
   * @param numberOfSucceededThings The threshold for number of succeeded things that will initiate
   * the increase in rate of rollout.
   */
  public fun numberOfSucceededThings(numberOfSucceededThings: Number) {
    cdkBuilder.numberOfSucceededThings(numberOfSucceededThings)
  }

  public fun build(): CfnJobTemplate.RateIncreaseCriteriaProperty = cdkBuilder.build()
}
