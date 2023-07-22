@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeployment.DeploymentIoTJobConfigurationProperty.Builder =
      CfnDeployment.DeploymentIoTJobConfigurationProperty.builder()

  /**
   * @param abortConfig The stop configuration for the job.
   * This configuration defines when and how to stop a job rollout.
   */
  public fun abortConfig(abortConfig: IResolvable) {
    cdkBuilder.abortConfig(abortConfig)
  }

  /**
   * @param abortConfig The stop configuration for the job.
   * This configuration defines when and how to stop a job rollout.
   */
  public fun abortConfig(abortConfig: CfnDeployment.IoTJobAbortConfigProperty) {
    cdkBuilder.abortConfig(abortConfig)
  }

  /**
   * @param jobExecutionsRolloutConfig The rollout configuration for the job.
   * This configuration defines the rate at which the job rolls out to the fleet of target devices.
   */
  public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IResolvable) {
    cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
  }

  /**
   * @param jobExecutionsRolloutConfig The rollout configuration for the job.
   * This configuration defines the rate at which the job rolls out to the fleet of target devices.
   */
  public
      fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: CfnDeployment.IoTJobExecutionsRolloutConfigProperty) {
    cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
  }

  /**
   * @param timeoutConfig The timeout configuration for the job.
   * This configuration defines the amount of time each device has to complete the job.
   */
  public fun timeoutConfig(timeoutConfig: IResolvable) {
    cdkBuilder.timeoutConfig(timeoutConfig)
  }

  /**
   * @param timeoutConfig The timeout configuration for the job.
   * This configuration defines the amount of time each device has to complete the job.
   */
  public fun timeoutConfig(timeoutConfig: CfnDeployment.IoTJobTimeoutConfigProperty) {
    cdkBuilder.timeoutConfig(timeoutConfig)
  }

  public fun build(): CfnDeployment.DeploymentIoTJobConfigurationProperty = cdkBuilder.build()
}
