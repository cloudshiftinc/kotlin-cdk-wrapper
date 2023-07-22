@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.iot.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplateTimeoutConfigPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.TimeoutConfigProperty.Builder =
      CfnJobTemplate.TimeoutConfigProperty.builder()

  /**
   * @param inProgressTimeoutInMinutes Specifies the amount of time, in minutes, this device has to
   * finish execution of this job. 
   * The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in
   * progress timer can't be updated and will apply to all job executions for the job. Whenever a job
   * execution remains in the IN_PROGRESS status for longer than this interval, the job execution will
   * fail and switch to the terminal `TIMED_OUT` status.
   */
  public fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number) {
    cdkBuilder.inProgressTimeoutInMinutes(inProgressTimeoutInMinutes)
  }

  public fun build(): CfnJobTemplate.TimeoutConfigProperty = cdkBuilder.build()
}
