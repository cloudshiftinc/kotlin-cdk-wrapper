@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * The interface for a service using the EC2 launch type on an ECS cluster.
 */
public interface IEc2Service : IService {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IEc2Service): IEc2Service =
        CdkObjectWrappers.wrap(cdkObject) as IEc2Service

    internal fun unwrap(wrapped: IEc2Service): software.amazon.awscdk.services.ecs.IEc2Service =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.IEc2Service
  }
}
