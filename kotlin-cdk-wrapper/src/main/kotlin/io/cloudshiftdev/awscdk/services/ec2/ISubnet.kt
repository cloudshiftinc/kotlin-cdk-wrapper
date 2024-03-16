@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IDependable
import kotlin.String

/**
 *
 */
public interface ISubnet : IResource {
  /**
   * Associate a Network ACL with this subnet.
   *
   * @param id 
   * @param acl The Network ACL to associate. 
   */
  public fun associateNetworkAcl(id: String, acl: INetworkAcl)

  /**
   * The Availability Zone the subnet is located in.
   */
  public fun availabilityZone(): String

  /**
   * Dependable that can be depended upon to force internet connectivity established on the VPC.
   */
  public fun internetConnectivityEstablished(): IDependable

  /**
   * The IPv4 CIDR block for this subnet.
   */
  public fun ipv4CidrBlock(): String

  /**
   * The route table for this subnet.
   */
  public fun routeTable(): IRouteTable

  /**
   * The subnetId for this particular subnet.
   */
  public fun subnetId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ISubnet): ISubnet =
        CdkObjectWrappers.wrap(cdkObject) as ISubnet

    internal fun unwrap(wrapped: ISubnet): software.amazon.awscdk.services.ec2.ISubnet = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ISubnet
  }
}
