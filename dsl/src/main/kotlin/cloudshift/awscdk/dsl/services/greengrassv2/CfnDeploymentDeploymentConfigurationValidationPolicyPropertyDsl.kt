@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentDeploymentConfigurationValidationPolicyPropertyDsl {
  private val cdkBuilder: CfnDeployment.DeploymentConfigurationValidationPolicyProperty.Builder =
      CfnDeployment.DeploymentConfigurationValidationPolicyProperty.builder()

  /**
   * @param timeoutInSeconds The amount of time in seconds that a component can validate its
   * configuration updates.
   * If the validation time exceeds this timeout, then the deployment proceeds for the device.
   *
   * Default: `30`
   */
  public fun timeoutInSeconds(timeoutInSeconds: Number) {
    cdkBuilder.timeoutInSeconds(timeoutInSeconds)
  }

  public fun build(): CfnDeployment.DeploymentConfigurationValidationPolicyProperty =
      cdkBuilder.build()
}
