package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubnetCidrBlock internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  public open fun ipv6CidrBlock(`value`: String) {
    unwrap(this).setIpv6CidrBlock(`value`)
  }

  public open fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

  public open fun ipv6IpamPoolId(`value`: String) {
    unwrap(this).setIpv6IpamPoolId(`value`)
  }

  public open fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

  public open fun ipv6NetmaskLength(`value`: Number) {
    unwrap(this).setIpv6NetmaskLength(`value`)
  }

  public open fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public interface Builder {
    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
    }

    public fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
    }

    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
    }

    public fun subnetId(subnetId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock.Builder.create(scope, id)

    public override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    public override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    public override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    public override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnetCidrBlock {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnetCidrBlock(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock):
        CfnSubnetCidrBlock = CfnSubnetCidrBlock(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetCidrBlock):
        software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock = wrapped.cdkObject
  }
}
