@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@CdkDslMarker
public class CfnEndpointDeploymentConfigPropertyDsl {
  private val cdkBuilder: CfnEndpoint.DeploymentConfigProperty.Builder =
      CfnEndpoint.DeploymentConfigProperty.builder()

  /**
   * @param autoRollbackConfiguration Automatic rollback configuration for handling endpoint
   * deployment failures and recovery.
   */
  public fun autoRollbackConfiguration(autoRollbackConfiguration: IResolvable) {
    cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration)
  }

  /**
   * @param autoRollbackConfiguration Automatic rollback configuration for handling endpoint
   * deployment failures and recovery.
   */
  public
      fun autoRollbackConfiguration(autoRollbackConfiguration: CfnEndpoint.AutoRollbackConfigProperty) {
    cdkBuilder.autoRollbackConfiguration(autoRollbackConfiguration)
  }

  /**
   * @param blueGreenUpdatePolicy Update policy for a blue/green deployment. 
   * If this update policy is specified, SageMaker creates a new fleet during the deployment while
   * maintaining the old fleet. SageMaker flips traffic to the new fleet according to the specified
   * traffic routing configuration. Only one update policy should be used in the deployment
   * configuration. If no update policy is specified, SageMaker uses a blue/green deployment strategy
   * with all at once traffic shifting by default.
   */
  public fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: IResolvable) {
    cdkBuilder.blueGreenUpdatePolicy(blueGreenUpdatePolicy)
  }

  /**
   * @param blueGreenUpdatePolicy Update policy for a blue/green deployment. 
   * If this update policy is specified, SageMaker creates a new fleet during the deployment while
   * maintaining the old fleet. SageMaker flips traffic to the new fleet according to the specified
   * traffic routing configuration. Only one update policy should be used in the deployment
   * configuration. If no update policy is specified, SageMaker uses a blue/green deployment strategy
   * with all at once traffic shifting by default.
   */
  public
      fun blueGreenUpdatePolicy(blueGreenUpdatePolicy: CfnEndpoint.BlueGreenUpdatePolicyProperty) {
    cdkBuilder.blueGreenUpdatePolicy(blueGreenUpdatePolicy)
  }

  public fun build(): CfnEndpoint.DeploymentConfigProperty = cdkBuilder.build()
}
