@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A SubnetNetworkAclAssociation.
 */
public interface ISubnetNetworkAclAssociation : IResource {
  /**
   * ID for the current SubnetNetworkAclAssociation.
   */
  public fun subnetNetworkAclAssociationAssociationId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ISubnetNetworkAclAssociation):
        ISubnetNetworkAclAssociation = CdkObjectWrappers.wrap(cdkObject) as
        ISubnetNetworkAclAssociation

    internal fun unwrap(wrapped: ISubnetNetworkAclAssociation):
        software.amazon.awscdk.services.ec2.ISubnetNetworkAclAssociation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ISubnetNetworkAclAssociation
  }
}
