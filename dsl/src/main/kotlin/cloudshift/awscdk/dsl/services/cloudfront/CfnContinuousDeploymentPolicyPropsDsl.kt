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

  public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
    cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
  }

  public
      fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty) {
    cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
  }

  public fun build(): CfnContinuousDeploymentPolicyProps = cdkBuilder.build()
}
