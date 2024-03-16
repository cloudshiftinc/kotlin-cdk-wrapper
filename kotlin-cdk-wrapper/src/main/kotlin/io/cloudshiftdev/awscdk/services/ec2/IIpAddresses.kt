@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Implementations for ip address management.
 *
 * Note this is specific to the IPv4 CIDR.
 */
public interface IIpAddresses {
  /**
   * Called by the VPC to retrieve Subnet options from the Ipam.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param input 
   */
  public fun allocateSubnetsCidr(input: AllocateCidrRequest): SubnetIpamOptions

  /**
   * Called by the VPC to retrieve Subnet options from the Ipam.
   *
   * Don't call this directly, the VPC will call it automatically.
   *
   * @param input 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b0342e5517b6eaf50616712b0cc3dedcaaf80337137500e7b6c321aed0efab8")
  public fun allocateSubnetsCidr(input: AllocateCidrRequest.Builder.() -> Unit): SubnetIpamOptions

  /**
   * Called by the VPC to retrieve VPC options from the Ipam.
   *
   * Don't call this directly, the VPC will call it automatically.
   */
  public fun allocateVpcCidr(): VpcIpamOptions

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IIpAddresses): IIpAddresses =
        CdkObjectWrappers.wrap(cdkObject) as IIpAddresses

    internal fun unwrap(wrapped: IIpAddresses): software.amazon.awscdk.services.ec2.IIpAddresses =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IIpAddresses
  }
}
