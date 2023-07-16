@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigImportProps

@CdkDslMarker
public class LambdaDeploymentConfigImportPropsDsl {
  private val cdkBuilder: LambdaDeploymentConfigImportProps.Builder =
      LambdaDeploymentConfigImportProps.builder()

  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  public fun build(): LambdaDeploymentConfigImportProps = cdkBuilder.build()
}
