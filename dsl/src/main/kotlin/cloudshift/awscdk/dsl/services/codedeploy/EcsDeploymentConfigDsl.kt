@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.EcsDeploymentConfig
import software.amazon.awscdk.services.codedeploy.TrafficRouting
import software.constructs.Construct

@CdkDslMarker
public class EcsDeploymentConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EcsDeploymentConfig.Builder = EcsDeploymentConfig.Builder.create(scope,
      id)

  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  public fun trafficRouting(trafficRouting: TrafficRouting) {
    cdkBuilder.trafficRouting(trafficRouting)
  }

  public fun build(): EcsDeploymentConfig = cdkBuilder.build()
}
