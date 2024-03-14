package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface ContainerDependency {
  /**
   * The state the container needs to be in to satisfy the dependency and proceed with startup.
   *
   * Valid values are ContainerDependencyCondition.START, ContainerDependencyCondition.COMPLETE,
   * ContainerDependencyCondition.SUCCESS and ContainerDependencyCondition.HEALTHY.
   *
   * Default: ContainerDependencyCondition.HEALTHY
   */
  public fun condition(): ContainerDependencyCondition? =
      unwrap(this).getCondition()?.let(ContainerDependencyCondition::wrap)

  /**
   * The container to depend on.
   */
  public fun container(): ContainerDefinition

  /**
   * A builder for [ContainerDependency]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param condition The state the container needs to be in to satisfy the dependency and proceed
     * with startup.
     * Valid values are ContainerDependencyCondition.START, ContainerDependencyCondition.COMPLETE,
     * ContainerDependencyCondition.SUCCESS and ContainerDependencyCondition.HEALTHY.
     */
    public fun condition(condition: ContainerDependencyCondition)

    /**
     * @param container The container to depend on. 
     */
    public fun container(container: ContainerDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerDependency.Builder =
        software.amazon.awscdk.services.ecs.ContainerDependency.builder()

    /**
     * @param condition The state the container needs to be in to satisfy the dependency and proceed
     * with startup.
     * Valid values are ContainerDependencyCondition.START, ContainerDependencyCondition.COMPLETE,
     * ContainerDependencyCondition.SUCCESS and ContainerDependencyCondition.HEALTHY.
     */
    override fun condition(condition: ContainerDependencyCondition) {
      cdkBuilder.condition(condition.let(ContainerDependencyCondition::unwrap))
    }

    /**
     * @param container The container to depend on. 
     */
    override fun container(container: ContainerDefinition) {
      cdkBuilder.container(container.let(ContainerDefinition::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ContainerDependency = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ContainerDependency,
  ) : ContainerDependency {
    /**
     * The state the container needs to be in to satisfy the dependency and proceed with startup.
     *
     * Valid values are ContainerDependencyCondition.START, ContainerDependencyCondition.COMPLETE,
     * ContainerDependencyCondition.SUCCESS and ContainerDependencyCondition.HEALTHY.
     *
     * Default: ContainerDependencyCondition.HEALTHY
     */
    override fun condition(): ContainerDependencyCondition? =
        unwrap(this).getCondition()?.let(ContainerDependencyCondition::wrap)

    /**
     * The container to depend on.
     */
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
