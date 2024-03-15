@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface DeploymentController {
  public fun type(): DeploymentControllerType? =
      unwrap(this).getType()?.let(DeploymentControllerType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun type(type: DeploymentControllerType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.DeploymentController.Builder =
        software.amazon.awscdk.services.ecs.DeploymentController.builder()

    override fun type(type: DeploymentControllerType) {
      cdkBuilder.type(type.let(DeploymentControllerType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.DeploymentController =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.DeploymentController,
  ) : CdkObject(cdkObject), DeploymentController {
    override fun type(): DeploymentControllerType? =
        unwrap(this).getType()?.let(DeploymentControllerType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentController {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DeploymentController):
        DeploymentController = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentController):
        software.amazon.awscdk.services.ecs.DeploymentController = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.DeploymentController
  }
}
