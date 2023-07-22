@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps

@CdkDslMarker
public class CfnContinuousDeploymentPolicyPropsDsl {
  private val cdkBuilder: CfnContinuousDeploymentPolicyProps.Builder =
      CfnContinuousDeploymentPolicyProps.builder()

  /**
   * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous deployment
   * policy. 
   */
  public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
    cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
  }

  /**
   * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous deployment
   * policy. 
   */
  public
      fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty) {
    cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
  }

  public fun build(): CfnContinuousDeploymentPolicyProps = cdkBuilder.build()
}
