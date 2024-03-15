@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition
import kotlin.Unit

public interface ScheduledEc2TaskDefinitionOptions {
  public fun taskDefinition(): Ec2TaskDefinition

  @CdkDslMarker
  public interface Builder {
    public fun taskDefinition(taskDefinition: Ec2TaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions.builder()

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
        ScheduledEc2TaskDefinitionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledEc2TaskDefinitionOptions):
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions
  }
}
