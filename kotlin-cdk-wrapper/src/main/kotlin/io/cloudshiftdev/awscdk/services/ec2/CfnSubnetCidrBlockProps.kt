@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnSubnetCidrBlockProps {
  public fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  public fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

  public fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

  public fun subnetId(): String

  @CdkDslMarker
  public interface Builder {
    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    public fun ipv6IpamPoolId(ipv6IpamPoolId: String)

    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps.builder()

    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps,
  ) : CdkObject(cdkObject), CfnSubnetCidrBlockProps {
    override fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

    override fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

    override fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubnetCidrBlockProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps):
        CfnSubnetCidrBlockProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetCidrBlockProps):
        software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps
  }
}
