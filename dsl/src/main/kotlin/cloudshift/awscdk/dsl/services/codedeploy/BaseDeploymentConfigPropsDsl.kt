@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.BaseDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.ComputePlatform
import software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts
import software.amazon.awscdk.services.codedeploy.TrafficRouting

@CdkDslMarker
public class BaseDeploymentConfigPropsDsl {
  private val cdkBuilder: BaseDeploymentConfigProps.Builder = BaseDeploymentConfigProps.builder()

  /**
   * @param computePlatform The destination compute platform for the deployment.
   */
  public fun computePlatform(computePlatform: ComputePlatform) {
    cdkBuilder.computePlatform(computePlatform)
  }

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

  /**
   * @param trafficRouting The configuration that specifies how traffic is shifted during a
   * deployment.
   * Only applicable to ECS and Lambda deployments, and must not be specified for Server
   * deployments.
   */
  public fun trafficRouting(trafficRouting: TrafficRouting) {
    cdkBuilder.trafficRouting(trafficRouting)
  }

  public fun build(): BaseDeploymentConfigProps = cdkBuilder.build()
}
