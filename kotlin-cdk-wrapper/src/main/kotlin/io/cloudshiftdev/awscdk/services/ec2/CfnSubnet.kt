@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubnet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnSubnet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun assignIpv6AddressOnCreation(): Any? =
      unwrap(this).getAssignIpv6AddressOnCreation()

  public open fun assignIpv6AddressOnCreation(`value`: Boolean) {
    unwrap(this).setAssignIpv6AddressOnCreation(`value`)
  }

  public open fun assignIpv6AddressOnCreation(`value`: IResolvable) {
    unwrap(this).setAssignIpv6AddressOnCreation(`value`.let(IResolvable::unwrap))
  }

  public open fun attrAvailabilityZone(): String = unwrap(this).getAttrAvailabilityZone()

  public open fun attrAvailabilityZoneId(): String = unwrap(this).getAttrAvailabilityZoneId()

  public open fun attrCidrBlock(): String = unwrap(this).getAttrCidrBlock()

  public open fun attrIpv6CidrBlocks(): List<String> = unwrap(this).getAttrIpv6CidrBlocks()

  public open fun attrNetworkAclAssociationId(): String =
      unwrap(this).getAttrNetworkAclAssociationId()

  public open fun attrOutpostArn(): String = unwrap(this).getAttrOutpostArn()

  public open fun attrSubnetId(): String = unwrap(this).getAttrSubnetId()

  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

  public open fun availabilityZoneId(`value`: String) {
    unwrap(this).setAvailabilityZoneId(`value`)
  }

  public open fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public open fun cidrBlock(`value`: String) {
    unwrap(this).setCidrBlock(`value`)
  }

  public open fun enableDns64(): Any? = unwrap(this).getEnableDns64()

  public open fun enableDns64(`value`: Boolean) {
    unwrap(this).setEnableDns64(`value`)
  }

  public open fun enableDns64(`value`: IResolvable) {
    unwrap(this).setEnableDns64(`value`.let(IResolvable::unwrap))
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

  public open fun ipv6CidrBlocks(): List<String> = unwrap(this).getIpv6CidrBlocks() ?: emptyList()

  public open fun ipv6CidrBlocks(`value`: List<String>) {
    unwrap(this).setIpv6CidrBlocks(`value`)
  }

  public open fun ipv6CidrBlocks(vararg `value`: String): Unit = ipv6CidrBlocks(`value`.toList())

  public open fun ipv6IpamPoolId(): String? = unwrap(this).getIpv6IpamPoolId()

  public open fun ipv6IpamPoolId(`value`: String) {
    unwrap(this).setIpv6IpamPoolId(`value`)
  }

  public open fun ipv6Native(): Any? = unwrap(this).getIpv6Native()

  public open fun ipv6Native(`value`: Boolean) {
    unwrap(this).setIpv6Native(`value`)
  }

  public open fun ipv6Native(`value`: IResolvable) {
    unwrap(this).setIpv6Native(`value`.let(IResolvable::unwrap))
  }

  public open fun ipv6NetmaskLength(): Number? = unwrap(this).getIpv6NetmaskLength()

  public open fun ipv6NetmaskLength(`value`: Number) {
    unwrap(this).setIpv6NetmaskLength(`value`)
  }

  public open fun mapPublicIpOnLaunch(): Any? = unwrap(this).getMapPublicIpOnLaunch()

  public open fun mapPublicIpOnLaunch(`value`: Boolean) {
    unwrap(this).setMapPublicIpOnLaunch(`value`)
  }

  public open fun mapPublicIpOnLaunch(`value`: IResolvable) {
    unwrap(this).setMapPublicIpOnLaunch(`value`.let(IResolvable::unwrap))
  }

  public open fun outpostArn(): String? = unwrap(this).getOutpostArn()

  public open fun outpostArn(`value`: String) {
    unwrap(this).setOutpostArn(`value`)
  }

  public open fun privateDnsNameOptionsOnLaunch(): Any? =
      unwrap(this).getPrivateDnsNameOptionsOnLaunch()

  public open fun privateDnsNameOptionsOnLaunch(`value`: Any) {
    unwrap(this).setPrivateDnsNameOptionsOnLaunch(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean)

    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable)

    public fun availabilityZone(availabilityZone: String)

    public fun availabilityZoneId(availabilityZoneId: String)

    public fun cidrBlock(cidrBlock: String)

    public fun enableDns64(enableDns64: Boolean)

    public fun enableDns64(enableDns64: IResolvable)

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    public fun ipv6CidrBlocks(ipv6CidrBlocks: List<String>)

    public fun ipv6CidrBlocks(vararg ipv6CidrBlocks: String)

    public fun ipv6IpamPoolId(ipv6IpamPoolId: String)

    public fun ipv6Native(ipv6Native: Boolean)

    public fun ipv6Native(ipv6Native: IResolvable)

    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number)

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean)

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable)

    public fun outpostArn(outpostArn: String)

    public fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSubnet.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnet.Builder.create(scope, id)

    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    override fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable) {
      cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation.let(IResolvable::unwrap))
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun availabilityZoneId(availabilityZoneId: String) {
      cdkBuilder.availabilityZoneId(availabilityZoneId)
    }

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun enableDns64(enableDns64: Boolean) {
      cdkBuilder.enableDns64(enableDns64)
    }

    override fun enableDns64(enableDns64: IResolvable) {
      cdkBuilder.enableDns64(enableDns64.let(IResolvable::unwrap))
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

    override fun ipv6CidrBlocks(ipv6CidrBlocks: List<String>) {
      cdkBuilder.ipv6CidrBlocks(ipv6CidrBlocks)
    }

    override fun ipv6CidrBlocks(vararg ipv6CidrBlocks: String): Unit =
        ipv6CidrBlocks(ipv6CidrBlocks.toList())

    override fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
      cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    override fun ipv6Native(ipv6Native: Boolean) {
      cdkBuilder.ipv6Native(ipv6Native)
    }

    override fun ipv6Native(ipv6Native: IResolvable) {
      cdkBuilder.ipv6Native(ipv6Native.let(IResolvable::unwrap))
    }

    override fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
      cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    override fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable) {
      cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch.let(IResolvable::unwrap))
    }

    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    override fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any) {
      cdkBuilder.privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSubnet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnet): CfnSubnet =
        CfnSubnet(cdkObject)

    internal fun unwrap(wrapped: CfnSubnet): software.amazon.awscdk.services.ec2.CfnSubnet =
        wrapped.cdkObject
  }

  public interface PrivateDnsNameOptionsOnLaunchProperty {
    public fun enableResourceNameDnsARecord(): Any? = unwrap(this).getEnableResourceNameDnsARecord()

    public fun enableResourceNameDnsAaaaRecord(): Any? =
        unwrap(this).getEnableResourceNameDnsAaaaRecord()

    public fun hostnameType(): String? = unwrap(this).getHostnameType()

    @CdkDslMarker
    public interface Builder {
      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean)

      public fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable)

      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean)

      public fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable)

      public fun hostnameType(hostnameType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty.builder()

      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: Boolean) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord)
      }

      override fun enableResourceNameDnsARecord(enableResourceNameDnsARecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsARecord(enableResourceNameDnsARecord.let(IResolvable::unwrap))
      }

      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: Boolean) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord)
      }

      override fun enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord: IResolvable) {
        cdkBuilder.enableResourceNameDnsAaaaRecord(enableResourceNameDnsAaaaRecord.let(IResolvable::unwrap))
      }

      override fun hostnameType(hostnameType: String) {
        cdkBuilder.hostnameType(hostnameType)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty,
    ) : CdkObject(cdkObject), PrivateDnsNameOptionsOnLaunchProperty {
      override fun enableResourceNameDnsARecord(): Any? =
          unwrap(this).getEnableResourceNameDnsARecord()

      override fun enableResourceNameDnsAaaaRecord(): Any? =
          unwrap(this).getEnableResourceNameDnsAaaaRecord()

      override fun hostnameType(): String? = unwrap(this).getHostnameType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PrivateDnsNameOptionsOnLaunchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty):
          PrivateDnsNameOptionsOnLaunchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrivateDnsNameOptionsOnLaunchProperty):
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnSubnet.PrivateDnsNameOptionsOnLaunchProperty
    }
  }
}
