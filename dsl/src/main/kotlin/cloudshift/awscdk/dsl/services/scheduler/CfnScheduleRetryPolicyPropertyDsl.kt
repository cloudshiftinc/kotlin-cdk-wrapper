@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleRetryPolicyPropertyDsl {
  private val cdkBuilder: CfnSchedule.RetryPolicyProperty.Builder =
      CfnSchedule.RetryPolicyProperty.builder()

  /**
   * @param maximumEventAgeInSeconds The maximum amount of time, in seconds, to continue to make
   * retry attempts.
   */
  public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
    cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
  }

  /**
   * @param maximumRetryAttempts The maximum number of retry attempts to make before the request
   * fails.
   * Retry attempts with exponential backoff continue until either the maximum number of attempts is
   * made or until the duration of the `MaximumEventAgeInSeconds` is reached.
   */
  public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
    cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
  }

  public fun build(): CfnSchedule.RetryPolicyProperty = cdkBuilder.build()
}
