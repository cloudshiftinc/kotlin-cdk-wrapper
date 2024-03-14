package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDirection(): String = unwrap(this).getAttrDirection()

  public open fun attrHostVpcId(): String = unwrap(this).getAttrHostVpcId()

  public open fun attrIpAddressCount(): String = unwrap(this).getAttrIpAddressCount()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun attrOutpostArn(): String = unwrap(this).getAttrOutpostArn()

  public open fun attrPreferredInstanceType(): String = unwrap(this).getAttrPreferredInstanceType()

  public open fun attrResolverEndpointId(): String = unwrap(this).getAttrResolverEndpointId()

  public open fun attrResolverEndpointType(): String = unwrap(this).getAttrResolverEndpointType()

  public open fun direction(): String = unwrap(this).getDirection()

  public open fun direction(`value`: String) {
    unwrap(this).setDirection(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipAddresses(): Any = unwrap(this).getIpAddresses()

  public open fun ipAddresses(`value`: IResolvable) {
    unwrap(this).setIpAddresses(`value`.let(IResolvable::unwrap))
  }

  public open fun ipAddresses(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpAddresses(__idx_ac66f0)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun outpostArn(): String? = unwrap(this).getOutpostArn()

  public open fun outpostArn(`value`: String) {
    unwrap(this).setOutpostArn(`value`)
  }

  public open fun preferredInstanceType(): String? = unwrap(this).getPreferredInstanceType()

  public open fun preferredInstanceType(`value`: String) {
    unwrap(this).setPreferredInstanceType(`value`)
  }

  public open fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

  public open fun protocols(`value`: List<String>) {
    unwrap(this).setProtocols(`value`)
  }

  public open fun resolverEndpointType(): String? = unwrap(this).getResolverEndpointType()

  public open fun resolverEndpointType(`value`: String) {
    unwrap(this).setResolverEndpointType(`value`)
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun direction(direction: String)

    public fun ipAddresses(ipAddresses: IResolvable)

    public fun ipAddresses(ipAddresses: List<Any>)

    public fun name(name: String)

    public fun outpostArn(outpostArn: String)

    public fun preferredInstanceType(preferredInstanceType: String)

    public fun protocols(protocols: List<String>)

    public fun resolverEndpointType(resolverEndpointType: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.Builder.create(scope,
        id)

    override fun direction(direction: String) {
      cdkBuilder.direction(direction)
    }

    override fun ipAddresses(ipAddresses: IResolvable) {
      cdkBuilder.ipAddresses(ipAddresses.let(IResolvable::unwrap))
    }

    override fun ipAddresses(ipAddresses: List<Any>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    override fun preferredInstanceType(preferredInstanceType: String) {
      cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    override fun protocols(protocols: List<String>) {
      cdkBuilder.protocols(protocols)
    }

    override fun resolverEndpointType(resolverEndpointType: String) {
      cdkBuilder.resolverEndpointType(resolverEndpointType)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint):
        CfnResolverEndpoint = CfnResolverEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnResolverEndpoint):
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint = wrapped.cdkObject
  }

  public interface IpAddressRequestProperty {
    public fun ip(): String? = unwrap(this).getIp()

    public fun ipv6(): String? = unwrap(this).getIpv6()

    public fun subnetId(): String

    public interface Builder {
      public fun ip(ip: String)

      public fun ipv6(ipv6: String)

      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder
          =
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.builder()

      override fun ip(ip: String) {
        cdkBuilder.ip(ip)
      }

      override fun ipv6(ipv6: String) {
        cdkBuilder.ipv6(ipv6)
      }

      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty,
    ) : IpAddressRequestProperty {
      override fun ip(): String? = unwrap(this).getIp()

      override fun ipv6(): String? = unwrap(this).getIpv6()

      override fun subnetId(): String = unwrap(this).getSubnetId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IpAddressRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty):
          IpAddressRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpAddressRequestProperty):
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
