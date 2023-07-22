@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnContinuousDeploymentPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnContinuousDeploymentPolicy.Builder =
      CfnContinuousDeploymentPolicy.Builder.create(scope, id)

  /**
   * Contains the configuration for a continuous deployment policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
   * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous deployment
   * policy. 
   */
  public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
    cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
  }

  /**
   * Contains the configuration for a continuous deployment policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
   * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous deployment
   * policy. 
   */
  public
      fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty) {
    cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
  }

  public fun build(): CfnContinuousDeploymentPolicy = cdkBuilder.build()
}
