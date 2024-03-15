@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import kotlin.Unit

public interface ScheduledFargateTaskDefinitionOptions {
  public fun taskDefinition(): FargateTaskDefinition

  @CdkDslMarker
  public interface Builder {
    public fun taskDefinition(taskDefinition: FargateTaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions.builder()

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
