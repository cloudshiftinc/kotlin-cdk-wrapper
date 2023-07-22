@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.DeploymentControllerType

/**
 * The deployment controller to use for the service.
 *
 * Example:
 *
 * ```
 * EcsApplication myApplication;
 * Cluster cluster;
 * FargateTaskDefinition taskDefinition;
 * ITargetGroup blueTargetGroup;
 * ITargetGroup greenTargetGroup;
 * IApplicationListener listener;
 * FargateService service = FargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .deploymentController(DeploymentController.builder()
 * .type(DeploymentControllerType.CODE_DEPLOY)
 * .build())
 * .build();
 * EcsDeploymentGroup.Builder.create(this, "BlueGreenDG")
 * .service(service)
 * .blueGreenDeploymentConfig(EcsBlueGreenDeploymentConfig.builder()
 * .blueTargetGroup(blueTargetGroup)
 * .greenTargetGroup(greenTargetGroup)
 * .listener(listener)
 * .build())
 * .deploymentConfig(EcsDeploymentConfig.CANARY_10PERCENT_5MINUTES)
 * .build();
 * ```
 */
@CdkDslMarker
public class DeploymentControllerDsl {
  private val cdkBuilder: DeploymentController.Builder = DeploymentController.builder()

  /**
   * @param type The deployment controller type to use.
   */
  public fun type(type: DeploymentControllerType) {
    cdkBuilder.type(type)
  }

  public fun build(): DeploymentController = cdkBuilder.build()
}
