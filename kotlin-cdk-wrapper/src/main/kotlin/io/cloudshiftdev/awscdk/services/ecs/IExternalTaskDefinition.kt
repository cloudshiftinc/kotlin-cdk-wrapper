@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * The interface of a task definition run on an External cluster.
 */
public interface IExternalTaskDefinition : ITaskDefinition {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IExternalTaskDefinition):
        IExternalTaskDefinition = CdkObjectWrappers.wrap(cdkObject) as IExternalTaskDefinition

    internal fun unwrap(wrapped: IExternalTaskDefinition):
        software.amazon.awscdk.services.ecs.IExternalTaskDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.IExternalTaskDefinition
  }
}
