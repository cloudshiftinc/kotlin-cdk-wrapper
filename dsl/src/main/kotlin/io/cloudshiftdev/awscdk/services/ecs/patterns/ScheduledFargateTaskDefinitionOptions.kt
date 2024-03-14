package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import kotlin.Unit

public interface ScheduledFargateTaskDefinitionOptions {
  /**
   * The task definition to use for tasks in the service. Image or taskDefinition must be specified,
   * but not both.
   *
   * [disable-awslint:ref-via-interface]
   *
   * Default: - none
   */
  public fun taskDefinition(): FargateTaskDefinition

  /**
   * A builder for [ScheduledFargateTaskDefinitionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param taskDefinition The task definition to use for tasks in the service. Image or
     * taskDefinition must be specified, but not both. 
     * [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: FargateTaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions.builder()

    /**
     * @param taskDefinition The task definition to use for tasks in the service. Image or
     * taskDefinition must be specified, but not both. 
     * [disable-awslint:ref-via-interface]
     */
    override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions,
  ) : CdkObject(cdkObject), ScheduledFargateTaskDefinitionOptions {
    /**
     * The task definition to use for tasks in the service. Image or taskDefinition must be
     * specified, but not both.
     *
     * [disable-awslint:ref-via-interface]
     *
     * Default: - none
     */
    override fun taskDefinition(): FargateTaskDefinition =
        unwrap(this).getTaskDefinition().let(FargateTaskDefinition::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        ScheduledFargateTaskDefinitionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions):
        ScheduledFargateTaskDefinitionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledFargateTaskDefinitionOptions):
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions
  }
}
