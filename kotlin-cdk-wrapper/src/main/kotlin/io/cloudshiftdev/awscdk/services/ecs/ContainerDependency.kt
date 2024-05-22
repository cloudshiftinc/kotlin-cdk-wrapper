@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * The details of a dependency on another container in the task definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * ContainerDefinition containerDefinition;
 * ContainerDependency containerDependency = ContainerDependency.builder()
 * .container(containerDefinition)
 * // the properties below are optional
 * .condition(ContainerDependencyCondition.START)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDependency.html)
 */
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
      cdkBuilder.condition(condition.let(ContainerDependencyCondition.Companion::unwrap))
    }

    /**
     * @param container The container to depend on. 
     */
    override fun container(container: ContainerDefinition) {
      cdkBuilder.container(container.let(ContainerDefinition.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ContainerDependency = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ContainerDependency,
  ) : CdkObject(cdkObject), ContainerDependency {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerDependency {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerDependency):
        ContainerDependency = CdkObjectWrappers.wrap(cdkObject) as? ContainerDependency ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerDependency):
        software.amazon.awscdk.services.ecs.ContainerDependency = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.ContainerDependency
  }
}
