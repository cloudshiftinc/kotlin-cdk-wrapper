@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * The interface for a service using the Fargate launch type on an ECS cluster.
 */
public interface IFargateService : IService {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IFargateService):
        IFargateService = CdkObjectWrappers.wrap(cdkObject) as IFargateService

    internal fun unwrap(wrapped: IFargateService):
        software.amazon.awscdk.services.ecs.IFargateService = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.IFargateService
  }
}
