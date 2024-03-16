@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Configuration of the container used to host the model.
 *
 * [Documentation](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ContainerDefinition.html)
 */
public interface IContainerDefinition {
  /**
   * Called when the ContainerDefinition is used by a SageMaker task.
   *
   * @param task 
   */
  public fun bind(task: ISageMakerTask): ContainerDefinitionConfig

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition):
        IContainerDefinition = CdkObjectWrappers.wrap(cdkObject) as IContainerDefinition

    internal fun unwrap(wrapped: IContainerDefinition):
        software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.IContainerDefinition
  }
}
