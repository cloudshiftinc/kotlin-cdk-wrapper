@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps

@CdkDslMarker
public class LambdaDeploymentConfigImportPropsDsl {
  private val cdkBuilder: LambdaDeploymentConfigImportProps.Builder =
      LambdaDeploymentConfigImportProps.builder()

  /**
   * @param deploymentConfigName The physical, human-readable name of the custom CodeDeploy Lambda
   * Deployment Configuration that we are referencing. 
   */
  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  public fun build(): LambdaDeploymentConfigImportProps = cdkBuilder.build()
}
