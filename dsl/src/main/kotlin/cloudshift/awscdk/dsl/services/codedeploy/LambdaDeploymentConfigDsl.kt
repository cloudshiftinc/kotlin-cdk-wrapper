@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentConfig
import software.amazon.awscdk.services.codedeploy.TrafficRouting
import software.constructs.Construct

@CdkDslMarker
public class LambdaDeploymentConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LambdaDeploymentConfig.Builder =
      LambdaDeploymentConfig.Builder.create(scope, id)

  /**
   * The physical, human-readable name of the Deployment Configuration.
   *
   * Default: - automatically generated name
   *
   * @param deploymentConfigName The physical, human-readable name of the Deployment Configuration. 
   */
  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  /**
   * The configuration that specifies how traffic is shifted from the 'blue' target group to the
   * 'green' target group during a deployment.
   *
   * Default: AllAtOnce
   *
   * @param trafficRouting The configuration that specifies how traffic is shifted from the 'blue'
   * target group to the 'green' target group during a deployment. 
   */
  public fun trafficRouting(trafficRouting: TrafficRouting) {
    cdkBuilder.trafficRouting(trafficRouting)
  }

  public fun build(): LambdaDeploymentConfig = cdkBuilder.build()
}
