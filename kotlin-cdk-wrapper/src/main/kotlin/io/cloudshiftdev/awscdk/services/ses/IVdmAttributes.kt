@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Virtual Deliverablity Manager (VDM) attributes.
 */
public interface IVdmAttributes : IResource {
  /**
   * The name of the resource behind the Virtual Deliverablity Manager attributes.
   */
  public fun vdmAttributesName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.IVdmAttributes): IVdmAttributes
        = CdkObjectWrappers.wrap(cdkObject) as IVdmAttributes

    internal fun unwrap(wrapped: IVdmAttributes): software.amazon.awscdk.services.ses.IVdmAttributes
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.IVdmAttributes
  }
}
