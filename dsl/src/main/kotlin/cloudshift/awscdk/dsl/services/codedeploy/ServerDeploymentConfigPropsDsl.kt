@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfigProps

/**
 * Construction properties of `ServerDeploymentConfig`.
 *
 * Example:
 *
 * ```
 * ServerDeploymentConfig deploymentConfig = ServerDeploymentConfig.Builder.create(this,
 * "DeploymentConfiguration")
 * .deploymentConfigName("MyDeploymentConfiguration") // optional property
 * // one of these is required, but both cannot be specified at the same time
 * .minimumHealthyHosts(MinimumHealthyHosts.count(2))
 * .build();
 * ```
 */
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
