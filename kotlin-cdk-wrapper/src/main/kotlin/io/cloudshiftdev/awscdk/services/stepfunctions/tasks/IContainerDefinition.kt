@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IContainerDefinition {
  public fun bind(arg0: ISageMakerTask): ContainerDefinitionConfig

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition,
  ) : CdkObject(cdkObject), IContainerDefinition {
    override fun bind(arg0: ISageMakerTask): ContainerDefinitionConfig =
        unwrap(this).bind(arg0.let(ISageMakerTask::unwrap)).let(ContainerDefinitionConfig::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition):
        IContainerDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IContainerDefinition):
        software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition
  }
}
