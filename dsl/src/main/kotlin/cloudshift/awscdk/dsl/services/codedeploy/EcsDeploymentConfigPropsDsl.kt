@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.TrafficRouting

@CdkDslMarker
public class EcsDeploymentConfigPropsDsl {
  private val cdkBuilder: EcsDeploymentConfigProps.Builder = EcsDeploymentConfigProps.builder()

  /**
   * @param deploymentConfigName The physical, human-readable name of the Deployment Configuration.
   */
  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  /**
   * @param trafficRouting The configuration that specifies how traffic is shifted from the 'blue'
   * target group to the 'green' target group during a deployment.
   */
  public fun trafficRouting(trafficRouting: TrafficRouting) {
    cdkBuilder.trafficRouting(trafficRouting)
  }

  public fun build(): EcsDeploymentConfigProps = cdkBuilder.build()
}
