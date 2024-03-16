@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * A NetworkAclEntry.
 */
public interface INetworkAclEntry : IResource {
  /**
   * The network ACL.
   */
  public fun networkAcl(): INetworkAcl

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.INetworkAclEntry):
        INetworkAclEntry = CdkObjectWrappers.wrap(cdkObject) as INetworkAclEntry

    internal fun unwrap(wrapped: INetworkAclEntry):
        software.amazon.awscdk.services.ec2.INetworkAclEntry = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.INetworkAclEntry
  }
}
