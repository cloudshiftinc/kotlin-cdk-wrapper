package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityGroupIngress internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress,
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

  public open fun fromPort(): Number? = unwrap(this).getFromPort()

  public open fun fromPort(`value`: Number) {
    unwrap(this).setFromPort(`value`)
  }

  public open fun groupId(): String? = unwrap(this).getGroupId()

  public open fun groupId(`value`: String) {
    unwrap(this).setGroupId(`value`)
  }

  public open fun groupName(): String? = unwrap(this).getGroupName()

  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipProtocol(): String = unwrap(this).getIpProtocol()

  public open fun ipProtocol(`value`: String) {
    unwrap(this).setIpProtocol(`value`)
  }

  public open fun sourcePrefixListId(): String? = unwrap(this).getSourcePrefixListId()

  public open fun sourcePrefixListId(`value`: String) {
    unwrap(this).setSourcePrefixListId(`value`)
  }

  public open fun sourceSecurityGroupId(): String? = unwrap(this).getSourceSecurityGroupId()

  public open fun sourceSecurityGroupId(`value`: String) {
    unwrap(this).setSourceSecurityGroupId(`value`)
  }

  public open fun sourceSecurityGroupName(): String? = unwrap(this).getSourceSecurityGroupName()

  public open fun sourceSecurityGroupName(`value`: String) {
    unwrap(this).setSourceSecurityGroupName(`value`)
  }

  public open fun sourceSecurityGroupOwnerId(): String? =
      unwrap(this).getSourceSecurityGroupOwnerId()

  public open fun sourceSecurityGroupOwnerId(`value`: String) {
    unwrap(this).setSourceSecurityGroupOwnerId(`value`)
  }

  public open fun toPort(): Number? = unwrap(this).getToPort()

  public open fun toPort(`value`: Number) {
    unwrap(this).setToPort(`value`)
  }

  public interface Builder {
    public fun cidrIp(cidrIp: String)

    public fun cidrIpv6(cidrIpv6: String)

    public fun description(description: String)

    public fun fromPort(fromPort: Number)

    public fun groupId(groupId: String)

    public fun groupName(groupName: String)

    public fun ipProtocol(ipProtocol: String)

    public fun sourcePrefixListId(sourcePrefixListId: String)

    public fun sourceSecurityGroupId(sourceSecurityGroupId: String)

    public fun sourceSecurityGroupName(sourceSecurityGroupName: String)

    public fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String)

    public fun toPort(toPort: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress.Builder =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress.Builder.create(scope, id)

    override fun cidrIp(cidrIp: String) {
      cdkBuilder.cidrIp(cidrIp)
    }

    override fun cidrIpv6(cidrIpv6: String) {
      cdkBuilder.cidrIpv6(cidrIpv6)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun ipProtocol(ipProtocol: String) {
      cdkBuilder.ipProtocol(ipProtocol)
    }

    override fun sourcePrefixListId(sourcePrefixListId: String) {
      cdkBuilder.sourcePrefixListId(sourcePrefixListId)
    }

    override fun sourceSecurityGroupId(sourceSecurityGroupId: String) {
      cdkBuilder.sourceSecurityGroupId(sourceSecurityGroupId)
    }

    override fun sourceSecurityGroupName(sourceSecurityGroupName: String) {
      cdkBuilder.sourceSecurityGroupName(sourceSecurityGroupName)
    }

    override fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String) {
      cdkBuilder.sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId)
    }

    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityGroupIngress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityGroupIngress(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress):
        CfnSecurityGroupIngress = CfnSecurityGroupIngress(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupIngress):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress = wrapped.cdkObject
  }
}
