@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.DeploymentControllerType

@CdkDslMarker
public class DeploymentControllerDsl {
  private val cdkBuilder: DeploymentController.Builder = DeploymentController.builder()

  public fun type(type: DeploymentControllerType) {
    cdkBuilder.type(type)
  }

  public fun build(): DeploymentController = cdkBuilder.build()
}
