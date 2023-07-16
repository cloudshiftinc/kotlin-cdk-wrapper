@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.IServerApplication
import software.amazon.awscdk.services.codedeploy.IServerDeploymentConfig
import software.amazon.awscdk.services.codedeploy.ServerDeploymentGroupAttributes

@CdkDslMarker
public class ServerDeploymentGroupAttributesDsl {
  private val cdkBuilder: ServerDeploymentGroupAttributes.Builder =
      ServerDeploymentGroupAttributes.builder()

  public fun application(application: IServerApplication) {
    cdkBuilder.application(application)
  }

  public fun deploymentConfig(deploymentConfig: IServerDeploymentConfig) {
    cdkBuilder.deploymentConfig(deploymentConfig)
  }

  public fun deploymentGroupName(deploymentGroupName: String) {
    cdkBuilder.deploymentGroupName(deploymentGroupName)
  }

  public fun build(): ServerDeploymentGroupAttributes = cdkBuilder.build()
}
