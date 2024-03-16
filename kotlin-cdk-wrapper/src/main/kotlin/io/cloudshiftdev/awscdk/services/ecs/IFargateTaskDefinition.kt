@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * The interface of a task definition run on a Fargate cluster.
 */
public interface IFargateTaskDefinition : ITaskDefinition {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IFargateTaskDefinition):
        IFargateTaskDefinition = CdkObjectWrappers.wrap(cdkObject) as IFargateTaskDefinition

    internal fun unwrap(wrapped: IFargateTaskDefinition):
        software.amazon.awscdk.services.ecs.IFargateTaskDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.IFargateTaskDefinition
  }
}
