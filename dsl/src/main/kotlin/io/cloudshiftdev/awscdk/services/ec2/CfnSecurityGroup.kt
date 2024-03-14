package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrGroupId(): String = unwrap(this).getAttrGroupId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  public open fun groupDescription(): String = unwrap(this).getGroupDescription()

  public open fun groupDescription(`value`: String) {
    unwrap(this).setGroupDescription(`value`)
  }

  public open fun groupName(): String? = unwrap(this).getGroupName()

  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun securityGroupEgress(): Any? = unwrap(this).getSecurityGroupEgress()

  public open fun securityGroupEgress(`value`: IResolvable) {
    unwrap(this).setSecurityGroupEgress(`value`.let(IResolvable::unwrap))
  }

  public open fun securityGroupEgress(__idx_ac66f0: List<Any>) {
    unwrap(this).setSecurityGroupEgress(__idx_ac66f0)
  }

  public open fun securityGroupIngress(): Any? = unwrap(this).getSecurityGroupIngress()

  public open fun securityGroupIngress(`value`: IResolvable) {
    unwrap(this).setSecurityGroupIngress(`value`.let(IResolvable::unwrap))
  }

  public open fun securityGroupIngress(__idx_ac66f0: List<Any>) {
    unwrap(this).setSecurityGroupIngress(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcId(): String? = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public interface Builder {
    public fun groupDescription(groupDescription: String) {
    }

    public fun groupName(groupName: String) {
    }

    public fun securityGroupEgress(securityGroupEgress: IResolvable) {
    }

    public fun securityGroupEgress(securityGroupEgress: List<Any>) {
    }

    public fun securityGroupIngress(securityGroupIngress: IResolvable) {
    }

    public fun securityGroupIngress(securityGroupIngress: List<Any>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun vpcId(vpcId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroup.Builder =
        software.amazon.awscdk.services.ec2.CfnSecurityGroup.Builder.create(scope, id)

    public override fun groupDescription(groupDescription: String) {
      cdkBuilder.groupDescription(groupDescription)
    }

    public override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    public override fun securityGroupEgress(securityGroupEgress: IResolvable) {
      cdkBuilder.securityGroupEgress(securityGroupEgress.let(IResolvable::unwrap))
    }

    public override fun securityGroupEgress(securityGroupEgress: List<Any>) {
      cdkBuilder.securityGroupEgress(securityGroupEgress)
    }

    public override fun securityGroupIngress(securityGroupIngress: IResolvable) {
      cdkBuilder.securityGroupIngress(securityGroupIngress.let(IResolvable::unwrap))
    }

    public override fun securityGroupIngress(securityGroupIngress: List<Any>) {
      cdkBuilder.securityGroupIngress(securityGroupIngress)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup):
        CfnSecurityGroup = CfnSecurityGroup(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroup):
        software.amazon.awscdk.services.ec2.CfnSecurityGroup = wrapped.cdkObject
  }

  public interface IngressProperty {
    public fun cidrIp(): String? = unwrap(this).getCidrIp()

    public fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

    public fun description(): String? = unwrap(this).getDescription()

    public fun fromPort(): Number? = unwrap(this).getFromPort()

    public fun ipProtocol(): String

    public fun sourcePrefixListId(): String? = unwrap(this).getSourcePrefixListId()

    public fun sourceSecurityGroupId(): String? = unwrap(this).getSourceSecurityGroupId()

    public fun sourceSecurityGroupName(): String? = unwrap(this).getSourceSecurityGroupName()

    public fun sourceSecurityGroupOwnerId(): String? = unwrap(this).getSourceSecurityGroupOwnerId()

    public fun toPort(): Number? = unwrap(this).getToPort()

    public interface Builder {
      public fun cidrIp(cidrIp: String) {
      }

      public fun cidrIpv6(cidrIpv6: String) {
      }

      public fun description(description: String) {
      }

      public fun fromPort(fromPort: Number) {
      }

      public fun ipProtocol(ipProtocol: String) {
      }

      public fun sourcePrefixListId(sourcePrefixListId: String) {
      }

      public fun sourceSecurityGroupId(sourceSecurityGroupId: String) {
      }

      public fun sourceSecurityGroupName(sourceSecurityGroupName: String) {
      }

      public fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String) {
      }

      public fun toPort(toPort: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty.builder()

      public override fun cidrIp(cidrIp: String) {
        cdkBuilder.cidrIp(cidrIp)
      }

      public override fun cidrIpv6(cidrIpv6: String) {
        cdkBuilder.cidrIpv6(cidrIpv6)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      public override fun ipProtocol(ipProtocol: String) {
        cdkBuilder.ipProtocol(ipProtocol)
      }

      public override fun sourcePrefixListId(sourcePrefixListId: String) {
        cdkBuilder.sourcePrefixListId(sourcePrefixListId)
      }

      public override fun sourceSecurityGroupId(sourceSecurityGroupId: String) {
        cdkBuilder.sourceSecurityGroupId(sourceSecurityGroupId)
      }

      public override fun sourceSecurityGroupName(sourceSecurityGroupName: String) {
        cdkBuilder.sourceSecurityGroupName(sourceSecurityGroupName)
      }

      public override fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String) {
        cdkBuilder.sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId)
      }

      public override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty,
    ) : IngressProperty {
      public override fun cidrIp(): String? = unwrap(this).getCidrIp()

      public override fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun fromPort(): Number? = unwrap(this).getFromPort()

      public override fun ipProtocol(): String = unwrap(this).getIpProtocol()

      public override fun sourcePrefixListId(): String? = unwrap(this).getSourcePrefixListId()

      public override fun sourceSecurityGroupId(): String? = unwrap(this).getSourceSecurityGroupId()

      public override fun sourceSecurityGroupName(): String? =
          unwrap(this).getSourceSecurityGroupName()

      public override fun sourceSecurityGroupOwnerId(): String? =
          unwrap(this).getSourceSecurityGroupOwnerId()

      public override fun toPort(): Number? = unwrap(this).getToPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IngressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty):
          IngressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressProperty):
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.IngressProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EgressProperty {
    public fun cidrIp(): String? = unwrap(this).getCidrIp()

    public fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

    public fun description(): String? = unwrap(this).getDescription()

    public fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

    public fun destinationSecurityGroupId(): String? = unwrap(this).getDestinationSecurityGroupId()

    public fun fromPort(): Number? = unwrap(this).getFromPort()

    public fun ipProtocol(): String

    public fun toPort(): Number? = unwrap(this).getToPort()

    public interface Builder {
      public fun cidrIp(cidrIp: String) {
      }

      public fun cidrIpv6(cidrIpv6: String) {
      }

      public fun description(description: String) {
      }

      public fun destinationPrefixListId(destinationPrefixListId: String) {
      }

      public fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
      }

      public fun fromPort(fromPort: Number) {
      }

      public fun ipProtocol(ipProtocol: String) {
      }

      public fun toPort(toPort: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty.builder()

      public override fun cidrIp(cidrIp: String) {
        cdkBuilder.cidrIp(cidrIp)
      }

      public override fun cidrIpv6(cidrIpv6: String) {
        cdkBuilder.cidrIpv6(cidrIpv6)
      }

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun destinationPrefixListId(destinationPrefixListId: String) {
        cdkBuilder.destinationPrefixListId(destinationPrefixListId)
      }

      public override fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
        cdkBuilder.destinationSecurityGroupId(destinationSecurityGroupId)
      }

      public override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      public override fun ipProtocol(ipProtocol: String) {
        cdkBuilder.ipProtocol(ipProtocol)
      }

      public override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty,
    ) : EgressProperty {
      public override fun cidrIp(): String? = unwrap(this).getCidrIp()

      public override fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

      public override fun description(): String? = unwrap(this).getDescription()

      public override fun destinationPrefixListId(): String? =
          unwrap(this).getDestinationPrefixListId()

      public override fun destinationSecurityGroupId(): String? =
          unwrap(this).getDestinationSecurityGroupId()

      public override fun fromPort(): Number? = unwrap(this).getFromPort()

      public override fun ipProtocol(): String = unwrap(this).getIpProtocol()

      public override fun toPort(): Number? = unwrap(this).getToPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EgressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty):
          EgressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EgressProperty):
          software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
