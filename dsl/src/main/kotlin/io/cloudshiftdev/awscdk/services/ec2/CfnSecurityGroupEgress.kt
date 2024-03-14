package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityGroupEgress internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cidrIp(): String? = unwrap(this).getCidrIp()

  public open fun cidrIp(`value`: String) {
    unwrap(this).setCidrIp(`value`)
  }

  public open fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

  public open fun cidrIpv6(`value`: String) {
    unwrap(this).setCidrIpv6(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

  public open fun destinationPrefixListId(`value`: String) {
    unwrap(this).setDestinationPrefixListId(`value`)
  }

  public open fun destinationSecurityGroupId(): String? =
      unwrap(this).getDestinationSecurityGroupId()

  public open fun destinationSecurityGroupId(`value`: String) {
    unwrap(this).setDestinationSecurityGroupId(`value`)
  }

  public open fun fromPort(): Number? = unwrap(this).getFromPort()

  public open fun fromPort(`value`: Number) {
    unwrap(this).setFromPort(`value`)
  }

  public open fun groupId(): String = unwrap(this).getGroupId()

  public open fun groupId(`value`: String) {
    unwrap(this).setGroupId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipProtocol(): String = unwrap(this).getIpProtocol()

  public open fun ipProtocol(`value`: String) {
    unwrap(this).setIpProtocol(`value`)
  }

  public open fun toPort(): Number? = unwrap(this).getToPort()

  public open fun toPort(`value`: Number) {
    unwrap(this).setToPort(`value`)
  }

  public interface Builder {
    public fun cidrIp(cidrIp: String)

    public fun cidrIpv6(cidrIpv6: String)

    public fun description(description: String)

    public fun destinationPrefixListId(destinationPrefixListId: String)

    public fun destinationSecurityGroupId(destinationSecurityGroupId: String)

    public fun fromPort(fromPort: Number)

    public fun groupId(groupId: String)

    public fun ipProtocol(ipProtocol: String)

    public fun toPort(toPort: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress.Builder =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress.Builder.create(scope, id)

    override fun cidrIp(cidrIp: String) {
      cdkBuilder.cidrIp(cidrIp)
    }

    override fun cidrIpv6(cidrIpv6: String) {
      cdkBuilder.cidrIpv6(cidrIpv6)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destinationPrefixListId(destinationPrefixListId: String) {
      cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    override fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
      cdkBuilder.destinationSecurityGroupId(destinationSecurityGroupId)
    }

    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    override fun ipProtocol(ipProtocol: String) {
      cdkBuilder.ipProtocol(ipProtocol)
    }

    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityGroupEgress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityGroupEgress(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress):
        CfnSecurityGroupEgress = CfnSecurityGroupEgress(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupEgress):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress = wrapped.cdkObject
  }
}
