@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents the interface which all VirtualService based classes MUST implement.
 */
public interface IVirtualService : IResource {
  /**
   * The Mesh which the VirtualService belongs to.
   */
  public fun mesh(): IMesh

  /**
   * The Amazon Resource Name (ARN) for the virtual service.
   */
  public fun virtualServiceArn(): String

  /**
   * The name of the VirtualService.
   */
  public fun virtualServiceName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualService):
        IVirtualService = CdkObjectWrappers.wrap(cdkObject) as IVirtualService

    internal fun unwrap(wrapped: IVirtualService):
        software.amazon.awscdk.services.appmesh.IVirtualService = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.IVirtualService
  }
}
