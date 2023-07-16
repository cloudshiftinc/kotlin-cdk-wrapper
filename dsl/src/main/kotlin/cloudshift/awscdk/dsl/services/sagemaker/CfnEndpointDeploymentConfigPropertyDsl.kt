@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@CdkDslMarker
public class CfnEndpointDeploymentConfigPropertyDsl {
  private val cdkBuilder: CfnEndpoint.DeploymentConfigProperty.Builder =
      CfnEndpoint.DeploymentConfigProperty.builder()

  public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
    cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration)
  }

  public
      fun autoRollbackConfiguration(autoRollbackConfiguration: CfnEndpoint.AutoRollbackConfigProperty) {
    cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration)
  }

  public fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: IResolvable) {
    cdkBuilder.blueGreenUpdatePolicy(blueGreenUpdatePolicy)
  }

  public
      fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: CfnEndpoint.BlueGreenUpdatePolicyProperty) {
    cdkBuilder.blueGreenUpdatePolicy(blueGreenUpdatePolicy)
  }

  public fun build(): CfnEndpoint.DeploymentConfigProperty = cdkBuilder.build()
}
