@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentDeploymentIoTJobConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeployment.DeploymentIoTJobConfigurationProperty.Builder =
      CfnDeployment.DeploymentIoTJobConfigurationProperty.builder()

  public fun abortConfig(abortConfig: IResolvable) {
    cdkBuilder.abortConfig(abortConfig)
  }

  public fun abortConfig(abortConfig: CfnDeployment.IoTJobAbortConfigProperty) {
    cdkBuilder.abortConfig(abortConfig)
  }

  public fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: IResolvable) {
    cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
  }

  public
      fun jobExecutionsRolloutConfig(jobExecutionsRolloutConfig: CfnDeployment.IoTJobExecutionsRolloutConfigProperty) {
    cdkBuilder.jobExecutionsRolloutConfig(jobExecutionsRolloutConfig)
  }

  public fun timeoutConfig(timeoutConfig: IResolvable) {
    cdkBuilder.timeoutConfig(timeoutConfig)
  }

  public fun timeoutConfig(timeoutConfig: CfnDeployment.IoTJobTimeoutConfigProperty) {
    cdkBuilder.timeoutConfig(timeoutConfig)
  }

  public fun build(): CfnDeployment.DeploymentIoTJobConfigurationProperty = cdkBuilder.build()
}
