@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.iot.CfnJobTemplate

/**
 * Allows you to define a criteria to initiate the increase in rate of rollout for a job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * RateIncreaseCriteriaProperty rateIncreaseCriteriaProperty =
 * RateIncreaseCriteriaProperty.builder()
 * .numberOfNotifiedThings(123)
 * .numberOfSucceededThings(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-rateincreasecriteria.html)
 */
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
