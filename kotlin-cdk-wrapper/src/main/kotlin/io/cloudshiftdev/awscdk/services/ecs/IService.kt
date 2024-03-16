@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * The interface for a service.
 */
public interface IService : IResource {
  /**
   * The Amazon Resource Name (ARN) of the service.
   */
  public fun serviceArn(): String

  /**
   * The name of the service.
   */
  public fun serviceName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IService): IService =
        CdkObjectWrappers.wrap(cdkObject) as IService

    internal fun unwrap(wrapped: IService): software.amazon.awscdk.services.ecs.IService = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.IService
  }
}
