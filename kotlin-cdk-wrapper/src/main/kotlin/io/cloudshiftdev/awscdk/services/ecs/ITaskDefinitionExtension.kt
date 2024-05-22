@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * An extension for Task Definitions.
 *
 * Classes that want to make changes to a TaskDefinition (such as
 * adding helper containers) can implement this interface, and can
 * then be "added" to a TaskDefinition like so:
 *
 * taskDefinition.addExtension(new MyExtension("some_parameter"));
 */
public interface ITaskDefinitionExtension {
  /**
   * Apply the extension to the given TaskDefinition.
   *
   * @param taskDefinition [disable-awslint:ref-via-interface]. 
   */
  public fun extend(taskDefinition: TaskDefinition)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinitionExtension,
  ) : CdkObject(cdkObject), ITaskDefinitionExtension {
    /**
     * Apply the extension to the given TaskDefinition.
     *
     * @param taskDefinition [disable-awslint:ref-via-interface]. 
     */
    override fun extend(taskDefinition: TaskDefinition) {
      unwrap(this).extend(taskDefinition.let(TaskDefinition.Companion::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinitionExtension):
        ITaskDefinitionExtension = CdkObjectWrappers.wrap(cdkObject) as? ITaskDefinitionExtension ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaskDefinitionExtension):
        software.amazon.awscdk.services.ecs.ITaskDefinitionExtension = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ITaskDefinitionExtension
  }
}
