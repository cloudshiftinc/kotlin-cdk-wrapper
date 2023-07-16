@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupAttributes
import software.amazon.awscdk.services.codedeploy.IEcsApplication
import software.amazon.awscdk.services.codedeploy.IEcsDeploymentConfig

@CdkDslMarker
public class EcsDeploymentGroupAttributesDsl {
  private val cdkBuilder: EcsDeploymentGroupAttributes.Builder =
      EcsDeploymentGroupAttributes.builder()

  public fun application(application: IEcsApplication) {
    cdkBuilder.application(application)
  }

  public fun deploymentConfig(deploymentConfig: IEcsDeploymentConfig) {
    cdkBuilder.deploymentConfig(deploymentConfig)
  }

  public fun deploymentGroupName(deploymentGroupName: String) {
    cdkBuilder.deploymentGroupName(deploymentGroupName)
  }

  public fun build(): EcsDeploymentGroupAttributes = cdkBuilder.build()
}
