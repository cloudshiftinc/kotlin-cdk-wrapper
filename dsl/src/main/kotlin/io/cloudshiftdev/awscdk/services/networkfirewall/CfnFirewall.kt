package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFirewall internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewall,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrEndpointIds(): List<String> = unwrap(this).getAttrEndpointIds()

  public open fun attrFirewallArn(): String = unwrap(this).getAttrFirewallArn()

  public open fun attrFirewallId(): String = unwrap(this).getAttrFirewallId()

  public open fun deleteProtection(): Any? = unwrap(this).getDeleteProtection()

  public open fun deleteProtection(`value`: Boolean) {
    unwrap(this).setDeleteProtection(`value`)
  }

  public open fun deleteProtection(`value`: IResolvable) {
    unwrap(this).setDeleteProtection(`value`.let(IResolvable::unwrap))
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun firewallName(): String = unwrap(this).getFirewallName()

  public open fun firewallName(`value`: String) {
    unwrap(this).setFirewallName(`value`)
  }

  public open fun firewallPolicyArn(): String = unwrap(this).getFirewallPolicyArn()

  public open fun firewallPolicyArn(`value`: String) {
    unwrap(this).setFirewallPolicyArn(`value`)
  }

  public open fun firewallPolicyChangeProtection(): Any? =
      unwrap(this).getFirewallPolicyChangeProtection()

  public open fun firewallPolicyChangeProtection(`value`: Boolean) {
    unwrap(this).setFirewallPolicyChangeProtection(`value`)
  }

  public open fun firewallPolicyChangeProtection(`value`: IResolvable) {
    unwrap(this).setFirewallPolicyChangeProtection(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun subnetChangeProtection(): Any? = unwrap(this).getSubnetChangeProtection()

  public open fun subnetChangeProtection(`value`: Boolean) {
    unwrap(this).setSubnetChangeProtection(`value`)
  }

  public open fun subnetChangeProtection(`value`: IResolvable) {
    unwrap(this).setSubnetChangeProtection(`value`.let(IResolvable::unwrap))
  }

  public open fun subnetMappings(): Any = unwrap(this).getSubnetMappings()

  public open fun subnetMappings(`value`: IResolvable) {
    unwrap(this).setSubnetMappings(`value`.let(IResolvable::unwrap))
  }

  public open fun subnetMappings(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubnetMappings(__idx_ac66f0)
  }

  public open fun subnetMappings(vararg __idx_ac66f0: Any): Unit =
      subnetMappings(__idx_ac66f0.toList())

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

  public interface Builder {
    public fun deleteProtection(deleteProtection: Boolean)

    public fun deleteProtection(deleteProtection: IResolvable)

    public fun description(description: String)

    public fun firewallName(firewallName: String)

    public fun firewallPolicyArn(firewallPolicyArn: String)

    public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean)

    public fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable)

    public fun subnetChangeProtection(subnetChangeProtection: Boolean)

    public fun subnetChangeProtection(subnetChangeProtection: IResolvable)

    public fun subnetMappings(subnetMappings: IResolvable)

    public fun subnetMappings(subnetMappings: List<Any>)

    public fun subnetMappings(vararg subnetMappings: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkfirewall.CfnFirewall.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnFirewall.Builder.create(scope, id)

    override fun deleteProtection(deleteProtection: Boolean) {
      cdkBuilder.deleteProtection(deleteProtection)
    }

    override fun deleteProtection(deleteProtection: IResolvable) {
      cdkBuilder.deleteProtection(deleteProtection.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun firewallName(firewallName: String) {
      cdkBuilder.firewallName(firewallName)
    }

    override fun firewallPolicyArn(firewallPolicyArn: String) {
      cdkBuilder.firewallPolicyArn(firewallPolicyArn)
    }

    override fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: Boolean) {
      cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection)
    }

    override fun firewallPolicyChangeProtection(firewallPolicyChangeProtection: IResolvable) {
      cdkBuilder.firewallPolicyChangeProtection(firewallPolicyChangeProtection.let(IResolvable::unwrap))
    }

    override fun subnetChangeProtection(subnetChangeProtection: Boolean) {
      cdkBuilder.subnetChangeProtection(subnetChangeProtection)
    }

    override fun subnetChangeProtection(subnetChangeProtection: IResolvable) {
      cdkBuilder.subnetChangeProtection(subnetChangeProtection.let(IResolvable::unwrap))
    }

    override fun subnetMappings(subnetMappings: IResolvable) {
      cdkBuilder.subnetMappings(subnetMappings.let(IResolvable::unwrap))
    }

    override fun subnetMappings(subnetMappings: List<Any>) {
      cdkBuilder.subnetMappings(subnetMappings)
    }

    override fun subnetMappings(vararg subnetMappings: Any): Unit =
        subnetMappings(subnetMappings.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnFirewall =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFirewall {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFirewall(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewall):
        CfnFirewall = CfnFirewall(cdkObject)

    internal fun unwrap(wrapped: CfnFirewall):
        software.amazon.awscdk.services.networkfirewall.CfnFirewall = wrapped.cdkObject
  }

  public interface SubnetMappingProperty {
    public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    public fun subnetId(): String

    public interface Builder {
      public fun ipAddressType(ipAddressType: String)

      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty.builder()

      override fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
      }

      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty,
    ) : SubnetMappingProperty {
      override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

      override fun subnetId(): String = unwrap(this).getSubnetId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SubnetMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty):
          SubnetMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubnetMappingProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
