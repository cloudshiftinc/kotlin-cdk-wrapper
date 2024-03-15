@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface ContainerDependency {
  public fun condition(): ContainerDependencyCondition? =
      unwrap(this).getCondition()?.let(ContainerDependencyCondition::wrap)

  public fun container(): ContainerDefinition

  @CdkDslMarker
  public interface Builder {
    public fun condition(condition: ContainerDependencyCondition)

    public fun container(container: ContainerDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerDependency.Builder =
        software.amazon.awscdk.services.ecs.ContainerDependency.builder()

    override fun condition(condition: ContainerDependencyCondition) {
      cdkBuilder.condition(condition.let(ContainerDependencyCondition::unwrap))
    }

    override fun container(container: ContainerDefinition) {
      cdkBuilder.container(container.let(ContainerDefinition::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ContainerDependency = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ContainerDependency,
  ) : CdkObject(cdkObject), ContainerDependency {
    override fun condition(): ContainerDependencyCondition? =
        unwrap(this).getCondition()?.let(ContainerDependencyCondition::wrap)

    override fun container(): ContainerDefinition =
        unwrap(this).getContainer().let(ContainerDefinition::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDependency {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerDependency):
        ContainerDependency = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerDependency):
        software.amazon.awscdk.services.ecs.ContainerDependency = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.ContainerDependency
  }
}
