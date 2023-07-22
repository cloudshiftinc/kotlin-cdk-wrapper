@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplateExponentialRolloutRatePropertyDsl {
  private val cdkBuilder: CfnJobTemplate.ExponentialRolloutRateProperty.Builder =
      CfnJobTemplate.ExponentialRolloutRateProperty.builder()

  /**
   * @param baseRatePerMinute The minimum number of things that will be notified of a pending job,
   * per minute at the start of job rollout. 
   * This parameter allows you to define the initial rate of rollout.
   */
  public fun baseRatePerMinute(baseRatePerMinute: Number) {
    cdkBuilder.baseRatePerMinute(baseRatePerMinute)
  }

  /**
   * @param incrementFactor The exponential factor to increase the rate of rollout for a job. 
   * AWS IoT Core supports up to one digit after the decimal (for example, 1.5, but not 1.55).
   */
  public fun incrementFactor(incrementFactor: Number) {
    cdkBuilder.incrementFactor(incrementFactor)
  }

  /**
   * @param rateIncreaseCriteria The criteria to initiate the increase in rate of rollout for a job.
   * 
   */
  public fun rateIncreaseCriteria(rateIncreaseCriteria: IResolvable) {
    cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria)
  }

  /**
   * @param rateIncreaseCriteria The criteria to initiate the increase in rate of rollout for a job.
   * 
   */
  public
      fun rateIncreaseCriteria(rateIncreaseCriteria: CfnJobTemplate.RateIncreaseCriteriaProperty) {
    cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria)
  }

  public fun build(): CfnJobTemplate.ExponentialRolloutRateProperty = cdkBuilder.build()
}
