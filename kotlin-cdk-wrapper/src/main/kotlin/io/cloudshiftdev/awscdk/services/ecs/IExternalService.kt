@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * The interface for a service using the External launch type on an ECS cluster.
 */
public interface IExternalService : IService {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IExternalService):
        IExternalService = CdkObjectWrappers.wrap(cdkObject) as IExternalService

    internal fun unwrap(wrapped: IExternalService):
        software.amazon.awscdk.services.ecs.IExternalService = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.IExternalService
  }
}
