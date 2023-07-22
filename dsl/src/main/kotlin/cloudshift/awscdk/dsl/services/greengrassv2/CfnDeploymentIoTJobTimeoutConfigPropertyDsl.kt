@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentIoTJobTimeoutConfigPropertyDsl {
  private val cdkBuilder: CfnDeployment.IoTJobTimeoutConfigProperty.Builder =
      CfnDeployment.IoTJobTimeoutConfigProperty.builder()

  /**
   * @param inProgressTimeoutInMinutes The amount of time, in minutes, that devices have to complete
   * the job.
   * The timer starts when the job status is set to `IN_PROGRESS` . If the job status doesn't change
   * to a terminal state before the time expires, then the job status is set to `TIMED_OUT` .
   *
   * The timeout interval must be between 1 minute and 7 days (10080 minutes).
   */
  public fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number) {
    cdkBuilder.inProgressTimeoutInMinutes(inProgressTimeoutInMinutes)
  }

  public fun build(): CfnDeployment.IoTJobTimeoutConfigProperty = cdkBuilder.build()
}
