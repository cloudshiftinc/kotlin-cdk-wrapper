@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentDeploymentComponentUpdatePolicyPropertyDsl {
  private val cdkBuilder: CfnDeployment.DeploymentComponentUpdatePolicyProperty.Builder =
      CfnDeployment.DeploymentComponentUpdatePolicyProperty.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun timeoutInSeconds(timeoutInSeconds: Number) {
    cdkBuilder.timeoutInSeconds(timeoutInSeconds)
  }

  public fun build(): CfnDeployment.DeploymentComponentUpdatePolicyProperty = cdkBuilder.build()
}
