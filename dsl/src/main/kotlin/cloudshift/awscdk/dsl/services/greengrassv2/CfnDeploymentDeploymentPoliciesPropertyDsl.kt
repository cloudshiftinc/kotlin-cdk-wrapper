@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentDeploymentPoliciesPropertyDsl {
  private val cdkBuilder: CfnDeployment.DeploymentPoliciesProperty.Builder =
      CfnDeployment.DeploymentPoliciesProperty.builder()

  public fun componentUpdatePolicy(componentUpdatePolicy: IResolvable) {
    cdkBuilder.componentUpdatePolicy(componentUpdatePolicy)
  }

  public
      fun componentUpdatePolicy(componentUpdatePolicy: CfnDeployment.DeploymentComponentUpdatePolicyProperty) {
    cdkBuilder.componentUpdatePolicy(componentUpdatePolicy)
  }

  public fun configurationValidationPolicy(configurationValidationPolicy: IResolvable) {
    cdkBuilder.configurationValidationPolicy(configurationValidationPolicy)
  }

  public
      fun configurationValidationPolicy(configurationValidationPolicy: CfnDeployment.DeploymentConfigurationValidationPolicyProperty) {
    cdkBuilder.configurationValidationPolicy(configurationValidationPolicy)
  }

  public fun failureHandlingPolicy(failureHandlingPolicy: String) {
    cdkBuilder.failureHandlingPolicy(failureHandlingPolicy)
  }

  public fun build(): CfnDeployment.DeploymentPoliciesProperty = cdkBuilder.build()
}
