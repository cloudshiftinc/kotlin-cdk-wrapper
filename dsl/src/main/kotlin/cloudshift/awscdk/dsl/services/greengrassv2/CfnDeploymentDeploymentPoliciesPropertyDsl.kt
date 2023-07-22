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

  /**
   * @param componentUpdatePolicy The component update policy for the configuration deployment.
   * This policy defines when it's safe to deploy the configuration to devices.
   */
  public fun componentUpdatePolicy(componentUpdatePolicy: IResolvable) {
    cdkBuilder.componentUpdatePolicy(componentUpdatePolicy)
  }

  /**
   * @param componentUpdatePolicy The component update policy for the configuration deployment.
   * This policy defines when it's safe to deploy the configuration to devices.
   */
  public
      fun componentUpdatePolicy(componentUpdatePolicy: CfnDeployment.DeploymentComponentUpdatePolicyProperty) {
    cdkBuilder.componentUpdatePolicy(componentUpdatePolicy)
  }

  /**
   * @param configurationValidationPolicy The configuration validation policy for the configuration
   * deployment.
   * This policy defines how long each component has to validate its configure updates.
   */
  public fun configurationValidationPolicy(configurationValidationPolicy: IResolvable) {
    cdkBuilder.configurationValidationPolicy(configurationValidationPolicy)
  }

  /**
   * @param configurationValidationPolicy The configuration validation policy for the configuration
   * deployment.
   * This policy defines how long each component has to validate its configure updates.
   */
  public
      fun configurationValidationPolicy(configurationValidationPolicy: CfnDeployment.DeploymentConfigurationValidationPolicyProperty) {
    cdkBuilder.configurationValidationPolicy(configurationValidationPolicy)
  }

  /**
   * @param failureHandlingPolicy The failure handling policy for the configuration deployment. This
   * policy defines what to do if the deployment fails.
   * Default: `ROLLBACK`
   */
  public fun failureHandlingPolicy(failureHandlingPolicy: String) {
    cdkBuilder.failureHandlingPolicy(failureHandlingPolicy)
  }

  public fun build(): CfnDeployment.DeploymentPoliciesProperty = cdkBuilder.build()
}
