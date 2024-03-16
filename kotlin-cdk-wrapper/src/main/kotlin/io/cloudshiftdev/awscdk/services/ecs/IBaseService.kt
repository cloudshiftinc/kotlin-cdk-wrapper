@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * The interface for BaseService.
 */
public interface IBaseService : IService {
  /**
   * The cluster that hosts the service.
   */
  public fun cluster(): ICluster

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IBaseService): IBaseService =
        CdkObjectWrappers.wrap(cdkObject) as IBaseService

    internal fun unwrap(wrapped: IBaseService): software.amazon.awscdk.services.ecs.IBaseService =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.IBaseService
  }
}
