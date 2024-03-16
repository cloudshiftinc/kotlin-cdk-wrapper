@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Implementations for IPv6 address management.
 *
 * Note this is specific to the IPv6 CIDR.
 */
public interface IIpv6Addresses {
  /**
   * Allocates Subnets IPv6 CIDRs. Called by VPC when creating subnets with IPv6 enabled.
   *
   * Note this is specific to the IPv6 CIDR.
   *
   * @param input 
   */
  public fun allocateSubnetsIpv6Cidr(input: AllocateIpv6CidrRequest): SubnetIpamOptions

  /**
   * Allocates Subnets IPv6 CIDRs. Called by VPC when creating subnets with IPv6 enabled.
   *
   * Note this is specific to the IPv6 CIDR.
   *
   * @param input 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b11eafea023bf232cdcf7b16ae5e1c33fde28cdffb7726ed3679ccbd5c38e319")
  public fun allocateSubnetsIpv6Cidr(input: AllocateIpv6CidrRequest.Builder.() -> Unit):
      SubnetIpamOptions

  /**
   * Called by VPC to allocate IPv6 CIDR.
   *
   * Note this is specific to the IPv6 CIDR.
   *
   * @param input 
   */
  public fun allocateVpcIpv6Cidr(input: AllocateVpcIpv6CidrRequest): CfnVPCCidrBlock

  /**
   * Called by VPC to allocate IPv6 CIDR.
   *
   * Note this is specific to the IPv6 CIDR.
   *
   * @param input 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("543a72d089263d71a3d77af2e66d9e0082d97d5c4b524095d1b8e9d1acaca31c")
  public fun allocateVpcIpv6Cidr(input: AllocateVpcIpv6CidrRequest.Builder.() -> Unit):
      CfnVPCCidrBlock

  /**
   * Whether the IPv6 CIDR is Amazon provided or not.
   *
   * Note this is specific to the IPv6 CIDR.
   */
  public fun amazonProvided(): Boolean

  /**
   * Whether the IPv6 CIDR is Amazon provided or not.
   *
   * Note this is specific to the IPv6 CIDR.
   */
  public fun amazonProvided(`value`: Boolean)

  /**
   * Split IPv6 CIDR block up for subnets.
   *
   * Note this is specific to the IPv6 CIDR.
   *
   * @param input 
   */
  public fun createIpv6CidrBlocks(input: CreateIpv6CidrBlocksRequest): List<String>

  /**
   * Split IPv6 CIDR block up for subnets.
   *
   * Note this is specific to the IPv6 CIDR.
   *
   * @param input 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2abe7832c051bc6bb30a8c48bbd31a9320e5be2c4c7819500bd41b1f161a206")
  public fun createIpv6CidrBlocks(input: CreateIpv6CidrBlocksRequest.Builder.() -> Unit):
      List<String>

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IIpv6Addresses): IIpv6Addresses
        = CdkObjectWrappers.wrap(cdkObject) as IIpv6Addresses

    internal fun unwrap(wrapped: IIpv6Addresses): software.amazon.awscdk.services.ec2.IIpv6Addresses
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IIpv6Addresses
  }
}
