package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPC internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPC,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCidrBlock(): String = unwrap(this).getAttrCidrBlock()

  public open fun attrCidrBlockAssociations(): List<String> =
      unwrap(this).getAttrCidrBlockAssociations() ?: emptyList()

  public open fun attrDefaultNetworkAcl(): String = unwrap(this).getAttrDefaultNetworkAcl()

  public open fun attrDefaultSecurityGroup(): String = unwrap(this).getAttrDefaultSecurityGroup()

  public open fun attrIpv6CidrBlocks(): List<String> = unwrap(this).getAttrIpv6CidrBlocks() ?:
      emptyList()

  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  public open fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public open fun cidrBlock(`value`: String) {
    unwrap(this).setCidrBlock(`value`)
  }

  public open fun enableDnsHostnames(): Any? = unwrap(this).getEnableDnsHostnames()

  public open fun enableDnsHostnames(`value`: Boolean) {
    unwrap(this).setEnableDnsHostnames(`value`)
  }

  public open fun enableDnsHostnames(`value`: IResolvable) {
    unwrap(this).setEnableDnsHostnames(`value`.let(IResolvable::unwrap))
  }

  public open fun enableDnsSupport(): Any? = unwrap(this).getEnableDnsSupport()

  public open fun enableDnsSupport(`value`: Boolean) {
    unwrap(this).setEnableDnsSupport(`value`)
  }

  public open fun enableDnsSupport(`value`: IResolvable) {
    unwrap(this).setEnableDnsSupport(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceTenancy(): String? = unwrap(this).getInstanceTenancy()

  public open fun instanceTenancy(`value`: String) {
    unwrap(this).setInstanceTenancy(`value`)
  }

  public open fun ipv4IpamPoolId(): String? = unwrap(this).getIpv4IpamPoolId()

  public open fun ipv4IpamPoolId(`value`: String) {
    unwrap(this).setIpv4IpamPoolId(`value`)
  }

  public open fun ipv4NetmaskLength(): Number? = unwrap(this).getIpv4NetmaskLength()

  public open fun ipv4NetmaskLength(`value`: Number) {
    unwrap(this).setIpv4NetmaskLength(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun cidrBlock(cidrBlock: String)

    public fun enableDnsHostnames(enableDnsHostnames: Boolean)

    public fun enableDnsHostnames(enableDnsHostnames: IResolvable)

    public fun enableDnsSupport(enableDnsSupport: Boolean)

    public fun enableDnsSupport(enableDnsSupport: IResolvable)

    public fun instanceTenancy(instanceTenancy: String)

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String)

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPC.Builder =
        software.amazon.awscdk.services.ec2.CfnVPC.Builder.create(scope, id)

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun enableDnsHostnames(enableDnsHostnames: Boolean) {
      cdkBuilder.enableDnsHostnames(enableDnsHostnames)
    }

    override fun enableDnsHostnames(enableDnsHostnames: IResolvable) {
      cdkBuilder.enableDnsHostnames(enableDnsHostnames.let(IResolvable::unwrap))
    }

    override fun enableDnsSupport(enableDnsSupport: Boolean) {
      cdkBuilder.enableDnsSupport(enableDnsSupport)
    }

    override fun enableDnsSupport(enableDnsSupport: IResolvable) {
      cdkBuilder.enableDnsSupport(enableDnsSupport.let(IResolvable::unwrap))
    }

    override fun instanceTenancy(instanceTenancy: String) {
      cdkBuilder.instanceTenancy(instanceTenancy)
    }

    override fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
      cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    override fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
      cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPC = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPC {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPC(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPC): CfnVPC =
        CfnVPC(cdkObject)

    internal fun unwrap(wrapped: CfnVPC): software.amazon.awscdk.services.ec2.CfnVPC =
        wrapped.cdkObject
  }
}
