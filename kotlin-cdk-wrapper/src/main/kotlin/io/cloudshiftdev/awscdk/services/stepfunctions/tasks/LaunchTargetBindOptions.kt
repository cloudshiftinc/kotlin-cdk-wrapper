@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.ITaskDefinition
import kotlin.Unit

/**
 * Options for binding a launch target to an ECS run job task.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * LaunchTargetBindOptions launchTargetBindOptions = LaunchTargetBindOptions.builder()
 * .taskDefinition(taskDefinition)
 * // the properties below are optional
 * .cluster(cluster)
 * .build();
 * ```
 */
public interface LaunchTargetBindOptions {
  /**
   * A regional grouping of one or more container instances on which you can run tasks and services.
   *
   * Default: - No cluster
   */
  public fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

  /**
   * Task definition to run Docker containers in Amazon ECS.
   */
  public fun taskDefinition(): ITaskDefinition

  /**
   * A builder for [LaunchTargetBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster A regional grouping of one or more container instances on which you can run
     * tasks and services.
     */
    public fun cluster(cluster: ICluster)

    /**
     * @param taskDefinition Task definition to run Docker containers in Amazon ECS. 
     */
    public fun taskDefinition(taskDefinition: ITaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions.builder()

    /**
     * @param cluster A regional grouping of one or more container instances on which you can run
     * tasks and services.
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    /**
     * @param taskDefinition Task definition to run Docker containers in Amazon ECS. 
     */
    override fun taskDefinition(taskDefinition: ITaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(ITaskDefinition::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions,
  ) : CdkObject(cdkObject), LaunchTargetBindOptions {
    /**
     * A regional grouping of one or more container instances on which you can run tasks and
     * services.
     *
     * Default: - No cluster
     */
    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    /**
     * Task definition to run Docker containers in Amazon ECS.
     */
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
        LaunchTargetBindOptions = CdkObjectWrappers.wrap(cdkObject) as? LaunchTargetBindOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LaunchTargetBindOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.LaunchTargetBindOptions
  }
}
