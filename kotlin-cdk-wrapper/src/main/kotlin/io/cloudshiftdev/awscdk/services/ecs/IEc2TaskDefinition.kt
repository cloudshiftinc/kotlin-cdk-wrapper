@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * The interface of a task definition run on an EC2 cluster.
 */
public interface IEc2TaskDefinition : ITaskDefinition {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IEc2TaskDefinition):
        IEc2TaskDefinition = CdkObjectWrappers.wrap(cdkObject) as IEc2TaskDefinition

    internal fun unwrap(wrapped: IEc2TaskDefinition):
        software.amazon.awscdk.services.ecs.IEc2TaskDefinition = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.IEc2TaskDefinition
  }
}
