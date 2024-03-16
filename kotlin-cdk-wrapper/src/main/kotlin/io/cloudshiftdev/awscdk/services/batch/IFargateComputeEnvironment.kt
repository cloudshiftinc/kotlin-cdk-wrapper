@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * A ManagedComputeEnvironment that uses ECS orchestration on Fargate instances.
 */
public interface IFargateComputeEnvironment : IManagedComputeEnvironment {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IFargateComputeEnvironment):
        IFargateComputeEnvironment = CdkObjectWrappers.wrap(cdkObject) as IFargateComputeEnvironment

    internal fun unwrap(wrapped: IFargateComputeEnvironment):
        software.amazon.awscdk.services.batch.IFargateComputeEnvironment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IFargateComputeEnvironment
  }
}
