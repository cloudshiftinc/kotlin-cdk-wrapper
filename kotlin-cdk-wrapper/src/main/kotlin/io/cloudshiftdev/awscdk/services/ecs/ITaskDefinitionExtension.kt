@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject

public interface ITaskDefinitionExtension {
  public fun extend(arg0: TaskDefinition)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinitionExtension,
  ) : CdkObject(cdkObject), ITaskDefinitionExtension {
    override fun extend(arg0: TaskDefinition) {
      unwrap(this).extend(arg0.let(TaskDefinition::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinitionExtension):
        ITaskDefinitionExtension = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaskDefinitionExtension):
        software.amazon.awscdk.services.ecs.ITaskDefinitionExtension = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ITaskDefinitionExtension
  }
}
