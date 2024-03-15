@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnVPCCidrBlockProps {
  public fun amazonProvidedIpv6CidrBlock(): Any? = unwrap(this).getAmazonProvidedIpv6CidrBlock()

  public fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  public fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  public fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

  public fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

  public fun ipv6Pool(): String? = unwrap(this).getIpv6Pool()

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean)

    public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: IResolvable)

    public fun cidrBlock(cidrBlock: String)

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    public fun ipv6IpamPoolId(ipv6IpamPoolId: String)

    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number)

    public fun ipv6Pool(ipv6Pool: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps.builder()

    override fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean) {
      cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock)
    }

    override fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: IResolvable) {
      cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock.let(IResolvable::unwrap))
    }

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    override fun ipv6Pool(ipv6Pool: String) {
      cdkBuilder.ipv6Pool(ipv6Pool)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps,
  ) : CdkObject(cdkObject), CfnVPCCidrBlockProps {
    override fun amazonProvidedIpv6CidrBlock(): Any? = unwrap(this).getAmazonProvidedIpv6CidrBlock()

    override fun cidrBlock(): String? = unwrap(this).getCidrBlock()

    override fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

    override fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

    override fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

    override fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

    override fun ipv6Pool(): String? = unwrap(this).getIpv6Pool()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCCidrBlockProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps):
        CfnVPCCidrBlockProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCCidrBlockProps):
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps
  }
}
