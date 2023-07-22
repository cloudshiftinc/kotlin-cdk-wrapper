@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplateJobExecutionsRolloutConfigPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.JobExecutionsRolloutConfigProperty.Builder =
      CfnJobTemplate.JobExecutionsRolloutConfigProperty.builder()

  /**
   * @param exponentialRolloutRate Allows you to create an exponential rate of rollout for a job.
   */
  public fun exponentialRolloutRate(exponentialRolloutRate: IResolvable) {
    cdkBuilder.exponentialRolloutRate(exponentialRolloutRate)
  }

  /**
   * @param exponentialRolloutRate Allows you to create an exponential rate of rollout for a job.
   */
  public
      fun exponentialRolloutRate(exponentialRolloutRate: CfnJobTemplate.ExponentialRolloutRateProperty) {
    cdkBuilder.exponentialRolloutRate(exponentialRolloutRate)
  }

  /**
   * @param maximumPerMinute The maximum number of things that will be notified of a pending job,
   * per minute.
   * This parameter allows you to create a staged rollout.
   */
  public fun maximumPerMinute(maximumPerMinute: Number) {
    cdkBuilder.maximumPerMinute(maximumPerMinute)
  }

  public fun build(): CfnJobTemplate.JobExecutionsRolloutConfigProperty = cdkBuilder.build()
}
