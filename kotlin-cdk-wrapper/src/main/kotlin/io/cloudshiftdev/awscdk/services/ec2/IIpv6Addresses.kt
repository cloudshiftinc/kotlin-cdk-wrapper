@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IIpv6Addresses {
  public fun allocateSubnetsIpv6Cidr(arg0: AllocateIpv6CidrRequest): SubnetIpamOptions

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b11eafea023bf232cdcf7b16ae5e1c33fde28cdffb7726ed3679ccbd5c38e319")
  public fun allocateSubnetsIpv6Cidr(arg0: AllocateIpv6CidrRequest.Builder.() -> Unit):
      SubnetIpamOptions

  public fun allocateVpcIpv6Cidr(arg0: AllocateVpcIpv6CidrRequest): CfnVPCCidrBlock

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("543a72d089263d71a3d77af2e66d9e0082d97d5c4b524095d1b8e9d1acaca31c")
  public fun allocateVpcIpv6Cidr(arg0: AllocateVpcIpv6CidrRequest.Builder.() -> Unit):
      CfnVPCCidrBlock

  public fun amazonProvided(): Boolean

  public fun amazonProvided(arg0: Boolean)

  public fun createIpv6CidrBlocks(arg0: CreateIpv6CidrBlocksRequest): List<String>

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d2abe7832c051bc6bb30a8c48bbd31a9320e5be2c4c7819500bd41b1f161a206")
  public fun createIpv6CidrBlocks(arg0: CreateIpv6CidrBlocksRequest.Builder.() -> Unit):
      List<String>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IIpv6Addresses,
  ) : CdkObject(cdkObject), IIpv6Addresses {
    override fun allocateSubnetsIpv6Cidr(arg0: AllocateIpv6CidrRequest): SubnetIpamOptions =
        unwrap(this).allocateSubnetsIpv6Cidr(arg0.let(AllocateIpv6CidrRequest::unwrap)).let(SubnetIpamOptions::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b11eafea023bf232cdcf7b16ae5e1c33fde28cdffb7726ed3679ccbd5c38e319")
    override fun allocateSubnetsIpv6Cidr(arg0: AllocateIpv6CidrRequest.Builder.() -> Unit):
        SubnetIpamOptions = allocateSubnetsIpv6Cidr(AllocateIpv6CidrRequest(arg0))

    override fun allocateVpcIpv6Cidr(arg0: AllocateVpcIpv6CidrRequest): CfnVPCCidrBlock =
        unwrap(this).allocateVpcIpv6Cidr(arg0.let(AllocateVpcIpv6CidrRequest::unwrap)).let(CfnVPCCidrBlock::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("543a72d089263d71a3d77af2e66d9e0082d97d5c4b524095d1b8e9d1acaca31c")
    override fun allocateVpcIpv6Cidr(arg0: AllocateVpcIpv6CidrRequest.Builder.() -> Unit):
        CfnVPCCidrBlock = allocateVpcIpv6Cidr(AllocateVpcIpv6CidrRequest(arg0))

    override fun amazonProvided(): Boolean = unwrap(this).getAmazonProvided()

    override fun amazonProvided(arg0: Boolean) {
      unwrap(this).setAmazonProvided(arg0)
    }

    override fun createIpv6CidrBlocks(arg0: CreateIpv6CidrBlocksRequest): List<String> =
        unwrap(this).createIpv6CidrBlocks(arg0.let(CreateIpv6CidrBlocksRequest::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2abe7832c051bc6bb30a8c48bbd31a9320e5be2c4c7819500bd41b1f161a206")
    override fun createIpv6CidrBlocks(arg0: CreateIpv6CidrBlocksRequest.Builder.() -> Unit):
        List<String> = createIpv6CidrBlocks(CreateIpv6CidrBlocksRequest(arg0))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IIpv6Addresses): IIpv6Addresses
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IIpv6Addresses): software.amazon.awscdk.services.ec2.IIpv6Addresses
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IIpv6Addresses
  }
}
