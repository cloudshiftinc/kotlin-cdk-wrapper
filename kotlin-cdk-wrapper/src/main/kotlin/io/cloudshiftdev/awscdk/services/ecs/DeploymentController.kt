@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

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
public interface DeploymentController {
  /**
   * The deployment controller type to use.
   *
   * Default: DeploymentControllerType.ECS
   */
  public fun type(): DeploymentControllerType? =
      unwrap(this).getType()?.let(DeploymentControllerType::wrap)

  /**
   * A builder for [DeploymentController]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param type The deployment controller type to use.
     */
    public fun type(type: DeploymentControllerType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.DeploymentController.Builder =
        software.amazon.awscdk.services.ecs.DeploymentController.builder()

    /**
     * @param type The deployment controller type to use.
     */
    override fun type(type: DeploymentControllerType) {
      cdkBuilder.type(type.let(DeploymentControllerType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.DeploymentController =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.DeploymentController,
  ) : CdkObject(cdkObject), DeploymentController {
    /**
     * The deployment controller type to use.
     *
     * Default: DeploymentControllerType.ECS
     */
    override fun type(): DeploymentControllerType? =
        unwrap(this).getType()?.let(DeploymentControllerType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentController {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DeploymentController):
        DeploymentController = CdkObjectWrappers.wrap(cdkObject) as? DeploymentController ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentController):
        software.amazon.awscdk.services.ecs.DeploymentController = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.DeploymentController
  }
}
