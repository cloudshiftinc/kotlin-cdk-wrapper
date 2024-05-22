@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.TaskDefinition
import io.cloudshiftdev.awscdk.services.stepfunctions.ServiceIntegrationPattern
import kotlin.Unit
import kotlin.collections.List

/**
 * Basic properties for ECS Tasks.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Cluster cluster;
 * ContainerDefinition containerDefinition;
 * TaskDefinition taskDefinition;
 * CommonEcsRunTaskProps commonEcsRunTaskProps = CommonEcsRunTaskProps.builder()
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * // the properties below are optional
 * .containerOverrides(List.of(ContainerOverride.builder()
 * .containerDefinition(containerDefinition)
 * // the properties below are optional
 * .command(List.of("command"))
 * .cpu(123)
 * .environment(List.of(TaskEnvironmentVariable.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .memoryLimit(123)
 * .memoryReservation(123)
 * .build()))
 * .integrationPattern(ServiceIntegrationPattern.FIRE_AND_FORGET)
 * .build();
 * ```
 */
public interface CommonEcsRunTaskProps {
  /**
   * The topic to run the task on.
   */
  public fun cluster(): ICluster

  /**
   * Container setting overrides.
   *
   * Key is the name of the container to override, value is the
   * values you want to override.
   *
   * Default: - No overrides
   */
  public fun containerOverrides(): List<ContainerOverride> =
      unwrap(this).getContainerOverrides()?.map(ContainerOverride::wrap) ?: emptyList()

  /**
   * The service integration pattern indicates different ways to call RunTask in ECS.
   *
   * The valid value for Lambda is FIRE_AND_FORGET, SYNC and WAIT_FOR_TASK_TOKEN.
   *
   * Default: FIRE_AND_FORGET
   */
  public fun integrationPattern(): ServiceIntegrationPattern? =
      unwrap(this).getIntegrationPattern()?.let(ServiceIntegrationPattern::wrap)

  /**
   * Task Definition used for running tasks in the service.
   *
   * Note: this must be TaskDefinition, and not ITaskDefinition,
   * as it requires properties that are not known for imported task definitions
   * If you want to run a RunTask with an imported task definition,
   * consider using CustomState
   */
  public fun taskDefinition(): TaskDefinition

  /**
   * A builder for [CommonEcsRunTaskProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster The topic to run the task on. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param containerOverrides Container setting overrides.
     * Key is the name of the container to override, value is the
     * values you want to override.
     */
    public fun containerOverrides(containerOverrides: List<ContainerOverride>)

    /**
     * @param containerOverrides Container setting overrides.
     * Key is the name of the container to override, value is the
     * values you want to override.
     */
    public fun containerOverrides(vararg containerOverrides: ContainerOverride)

    /**
     * @param integrationPattern The service integration pattern indicates different ways to call
     * RunTask in ECS.
     * The valid value for Lambda is FIRE_AND_FORGET, SYNC and WAIT_FOR_TASK_TOKEN.
     */
    public fun integrationPattern(integrationPattern: ServiceIntegrationPattern)

    /**
     * @param taskDefinition Task Definition used for running tasks in the service. 
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using CustomState
     */
    public fun taskDefinition(taskDefinition: TaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps.builder()

    /**
     * @param cluster The topic to run the task on. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * @param containerOverrides Container setting overrides.
     * Key is the name of the container to override, value is the
     * values you want to override.
     */
    override fun containerOverrides(containerOverrides: List<ContainerOverride>) {
      cdkBuilder.containerOverrides(containerOverrides.map(ContainerOverride.Companion::unwrap))
    }

    /**
     * @param containerOverrides Container setting overrides.
     * Key is the name of the container to override, value is the
     * values you want to override.
     */
    override fun containerOverrides(vararg containerOverrides: ContainerOverride): Unit =
        containerOverrides(containerOverrides.toList())

    /**
     * @param integrationPattern The service integration pattern indicates different ways to call
     * RunTask in ECS.
     * The valid value for Lambda is FIRE_AND_FORGET, SYNC and WAIT_FOR_TASK_TOKEN.
     */
    override fun integrationPattern(integrationPattern: ServiceIntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(ServiceIntegrationPattern.Companion::unwrap))
    }

    /**
     * @param taskDefinition Task Definition used for running tasks in the service. 
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using CustomState
     */
    override fun taskDefinition(taskDefinition: TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(TaskDefinition.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps,
  ) : CdkObject(cdkObject), CommonEcsRunTaskProps {
    /**
     * The topic to run the task on.
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    /**
     * Container setting overrides.
     *
     * Key is the name of the container to override, value is the
     * values you want to override.
     *
     * Default: - No overrides
     */
    override fun containerOverrides(): List<ContainerOverride> =
        unwrap(this).getContainerOverrides()?.map(ContainerOverride::wrap) ?: emptyList()

    /**
     * The service integration pattern indicates different ways to call RunTask in ECS.
     *
     * The valid value for Lambda is FIRE_AND_FORGET, SYNC and WAIT_FOR_TASK_TOKEN.
     *
     * Default: FIRE_AND_FORGET
     */
    override fun integrationPattern(): ServiceIntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(ServiceIntegrationPattern::wrap)

    /**
     * Task Definition used for running tasks in the service.
     *
     * Note: this must be TaskDefinition, and not ITaskDefinition,
     * as it requires properties that are not known for imported task definitions
     * If you want to run a RunTask with an imported task definition,
     * consider using CustomState
     */
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
        CommonEcsRunTaskProps = CdkObjectWrappers.wrap(cdkObject) as? CommonEcsRunTaskProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonEcsRunTaskProps):
        software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps
  }
}
