@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * The interface of the EndpointGroup.
 */
public interface IEndpointGroup : IResource {
  /**
   * EndpointGroup ARN.
   */
  public fun endpointGroupArn(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.IEndpointGroup):
        IEndpointGroup = CdkObjectWrappers.wrap(cdkObject) as IEndpointGroup

    internal fun unwrap(wrapped: IEndpointGroup):
        software.amazon.awscdk.services.globalaccelerator.IEndpointGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.IEndpointGroup
  }
}
