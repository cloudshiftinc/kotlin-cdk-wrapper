@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfigProps
import software.amazon.awscdk.services.codedeploy.TrafficRouting

@CdkDslMarker
public class LambdaDeploymentConfigPropsDsl {
  private val cdkBuilder: LambdaDeploymentConfigProps.Builder =
      LambdaDeploymentConfigProps.builder()

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

  public fun build(): LambdaDeploymentConfigProps = cdkBuilder.build()
}
