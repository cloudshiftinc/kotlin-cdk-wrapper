package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject

public interface ITaskDefinitionExtension {
  /**
   * Apply the extension to the given TaskDefinition.
   *
   * @param taskDefinition [disable-awslint:ref-via-interface]. 
   */
  public fun extend(taskDefinition: TaskDefinition)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinitionExtension,
  ) : CdkObject(cdkObject), ITaskDefinitionExtension {
    /**
     * Apply the extension to the given TaskDefinition.
     *
     * @param taskDefinition [disable-awslint:ref-via-interface]. 
     */
    override fun extend(taskDefinition: TaskDefinition) {
      unwrap(this).extend(taskDefinition.let(TaskDefinition::unwrap))
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
