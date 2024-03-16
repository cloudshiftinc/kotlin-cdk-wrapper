@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * NodeGroup interface.
 */
public interface INodegroup : IResource {
  /**
   * Name of the nodegroup.
   */
  public fun nodegroupName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.INodegroup): INodegroup =
        CdkObjectWrappers.wrap(cdkObject) as INodegroup

    internal fun unwrap(wrapped: INodegroup): software.amazon.awscdk.services.eks.INodegroup =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.INodegroup
  }
}
