@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCCidrBlock internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCCidrBlock,
) : CfnResource(cdkObject), IInspectable {
  public open fun amazonProvidedIpv6CidrBlock(): Any? =
      unwrap(this).getAmazonProvidedIpv6CidrBlock()

  public open fun amazonProvidedIpv6CidrBlock(`value`: Boolean) {
    unwrap(this).setAmazonProvidedIpv6CidrBlock(`value`)
  }

  public open fun amazonProvidedIpv6CidrBlock(`value`: IResolvable) {
    unwrap(this).setAmazonProvidedIpv6CidrBlock(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public open fun cidrBlock(`value`: String) {
    unwrap(this).setCidrBlock(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  public open fun ipv4IpamPoolId(`value`: String) {
    unwrap(this).setIpv4IpamPoolId(`value`)
  }

  public open fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  public open fun ipv4NetmaskLength(`value`: Number) {
    unwrap(this).setIpv4NetmaskLength(`value`)
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

  public open fun ipv6Pool(): String? = unwrap(this).getIpv6Pool()

  public open fun ipv6Pool(`value`: String) {
    unwrap(this).setIpv6Pool(`value`)
  }

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCCidrBlock.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlock.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCCidrBlock = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlock.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCCidrBlock {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCCidrBlock(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCCidrBlock):
        CfnVPCCidrBlock = CfnVPCCidrBlock(cdkObject)

    internal fun unwrap(wrapped: CfnVPCCidrBlock):
        software.amazon.awscdk.services.ec2.CfnVPCCidrBlock = wrapped.cdkObject
  }
}
