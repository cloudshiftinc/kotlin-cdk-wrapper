@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps

@CdkDslMarker
public class ServerDeploymentConfigPropsDsl {
  private val cdkBuilder: ServerDeploymentConfigProps.Builder =
      ServerDeploymentConfigProps.builder()

  /**
   * @param deploymentConfigName The physical, human-readable name of the Deployment Configuration.
   */
  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  /**
   * @param minimumHealthyHosts Minimum number of healthy hosts. 
   */
  public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts) {
    cdkBuilder.minimumHealthyHosts(minimumHealthyHosts)
  }

  public fun build(): ServerDeploymentConfigProps = cdkBuilder.build()
}
