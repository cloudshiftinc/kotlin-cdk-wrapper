@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 *
 */
public interface IInstance : IResource {
  /**
   * The id of the instance resource.
   */
  public fun instanceId(): String

  /**
   * The Cloudmap service this resource is registered to.
   */
  public fun service(): IService

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IInstance):
        IInstance = CdkObjectWrappers.wrap(cdkObject) as IInstance

    internal fun unwrap(wrapped: IInstance):
        software.amazon.awscdk.services.servicediscovery.IInstance = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.IInstance
  }
}
