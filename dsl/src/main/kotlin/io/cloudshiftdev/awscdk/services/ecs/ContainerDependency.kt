package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Unit

public interface ContainerDependency {
  public fun condition(): ContainerDependencyCondition? =
      unwrap(this).getCondition()?.let(ContainerDependencyCondition::wrap)

  public fun container(): ContainerDefinition

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ContainerDependency,
  ) : ContainerDependency {
    override fun condition(): ContainerDependencyCondition? =
        unwrap(this).getCondition()?.let(ContainerDependencyCondition::wrap)

    override fun container(): ContainerDefinition =
        unwrap(this).getContainer().let(ContainerDefinition::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDependency {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerDependency):
        ContainerDependency = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerDependency):
        software.amazon.awscdk.services.ecs.ContainerDependency = (wrapped as Wrapper).cdkObject
  }
}
