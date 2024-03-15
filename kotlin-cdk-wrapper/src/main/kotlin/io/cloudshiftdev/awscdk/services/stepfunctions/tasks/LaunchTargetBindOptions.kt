@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.ITaskDefinition
import kotlin.Unit

public interface LaunchTargetBindOptions {
  public fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

  public fun taskDefinition(): ITaskDefinition

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: ICluster)

    public fun taskDefinition(taskDefinition: ITaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions.builder()

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun taskDefinition(taskDefinition: ITaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(ITaskDefinition::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions,
  ) : CdkObject(cdkObject), LaunchTargetBindOptions {
    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    override fun taskDefinition(): ITaskDefinition =
        unwrap(this).getTaskDefinition().let(ITaskDefinition::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTargetBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions):
        LaunchTargetBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTargetBindOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions
  }
}
