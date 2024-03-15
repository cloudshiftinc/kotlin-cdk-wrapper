@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.TaskDefinition
import io.cloudshiftdev.awscdk.services.stepfunctions.ServiceIntegrationPattern
import kotlin.Unit
import kotlin.collections.List

public interface CommonEcsRunTaskProps {
  public fun cluster(): ICluster

  public fun containerOverrides(): List<ContainerOverride> =
      unwrap(this).getContainerOverrides()?.map(ContainerOverride::wrap) ?: emptyList()

  public fun integrationPattern(): ServiceIntegrationPattern? =
      unwrap(this).getIntegrationPattern()?.let(ServiceIntegrationPattern::wrap)

  public fun taskDefinition(): TaskDefinition

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: ICluster)

    public fun containerOverrides(containerOverrides: List<ContainerOverride>)

    public fun containerOverrides(vararg containerOverrides: ContainerOverride)

    public fun integrationPattern(integrationPattern: ServiceIntegrationPattern)

    public fun taskDefinition(taskDefinition: TaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps.builder()

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun containerOverrides(containerOverrides: List<ContainerOverride>) {
      cdkBuilder.containerOverrides(containerOverrides.map(ContainerOverride::unwrap))
    }

    override fun containerOverrides(vararg containerOverrides: ContainerOverride): Unit =
        containerOverrides(containerOverrides.toList())

    override fun integrationPattern(integrationPattern: ServiceIntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(ServiceIntegrationPattern::unwrap))
    }

    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps,
  ) : CdkObject(cdkObject), CommonEcsRunTaskProps {
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    override fun containerOverrides(): List<ContainerOverride> =
        unwrap(this).getContainerOverrides()?.map(ContainerOverride::wrap) ?: emptyList()

    override fun integrationPattern(): ServiceIntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(ServiceIntegrationPattern::wrap)

    override fun taskDefinition(): TaskDefinition =
        unwrap(this).getTaskDefinition().let(TaskDefinition::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonEcsRunTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps):
        CommonEcsRunTaskProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonEcsRunTaskProps):
        software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps
  }
}
