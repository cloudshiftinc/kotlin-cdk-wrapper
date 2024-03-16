@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition
import kotlin.Unit

/**
 * The properties for the ScheduledEc2Task using a task definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * Ec2TaskDefinition ec2TaskDefinition;
 * ScheduledEc2TaskDefinitionOptions scheduledEc2TaskDefinitionOptions =
 * ScheduledEc2TaskDefinitionOptions.builder()
 * .taskDefinition(ec2TaskDefinition)
 * .build();
 * ```
 */
public interface ScheduledEc2TaskDefinitionOptions {
  /**
   * The task definition to use for tasks in the service. One of image or taskDefinition must be
   * specified.
   *
   * [disable-awslint:ref-via-interface]
   *
   * Default: - none
   */
  public fun taskDefinition(): Ec2TaskDefinition

  /**
   * A builder for [ScheduledEc2TaskDefinitionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param taskDefinition The task definition to use for tasks in the service. One of image or
     * taskDefinition must be specified. 
     * [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: Ec2TaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions.builder()

    /**
     * @param taskDefinition The task definition to use for tasks in the service. One of image or
     * taskDefinition must be specified. 
     * [disable-awslint:ref-via-interface]
     */
    override fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(Ec2TaskDefinition::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions,
  ) : CdkObject(cdkObject), ScheduledEc2TaskDefinitionOptions {
    /**
     * The task definition to use for tasks in the service. One of image or taskDefinition must be
     * specified.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - none
     */
    override fun taskDefinition(): Ec2TaskDefinition =
        unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledEc2TaskDefinitionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions):
        ScheduledEc2TaskDefinitionOptions = CdkObjectWrappers.wrap(cdkObject) as
        ScheduledEc2TaskDefinitionOptions

    internal fun unwrap(wrapped: ScheduledEc2TaskDefinitionOptions):
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions
  }
}
