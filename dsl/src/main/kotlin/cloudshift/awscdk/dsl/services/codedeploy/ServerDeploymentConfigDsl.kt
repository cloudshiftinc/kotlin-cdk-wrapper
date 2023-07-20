@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.MinimumHealthyHosts
import software.amazon.awscdk.services.codedeploy.ServerDeploymentConfig
import software.constructs.Construct

@CdkDslMarker
public class ServerDeploymentConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ServerDeploymentConfig.Builder =
      ServerDeploymentConfig.Builder.create(scope, id)

  public fun deploymentConfigName(deploymentConfigName: String) {
    cdkBuilder.deploymentConfigName(deploymentConfigName)
  }

  public fun minimumHealthyHosts(minimumHealthyHosts: MinimumHealthyHosts) {
    cdkBuilder.minimumHealthyHosts(minimumHealthyHosts)
  }

  public fun build(): ServerDeploymentConfig = cdkBuilder.build()
}
