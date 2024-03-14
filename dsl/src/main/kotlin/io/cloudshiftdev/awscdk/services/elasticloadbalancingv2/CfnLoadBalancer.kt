package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

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

public open class CfnLoadBalancer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCanonicalHostedZoneId(): String = unwrap(this).getAttrCanonicalHostedZoneId()

  public open fun attrDnsName(): String = unwrap(this).getAttrDnsName()

  public open fun attrLoadBalancerArn(): String = unwrap(this).getAttrLoadBalancerArn()

  public open fun attrLoadBalancerFullName(): String = unwrap(this).getAttrLoadBalancerFullName()

  public open fun attrLoadBalancerName(): String = unwrap(this).getAttrLoadBalancerName()

  public open fun attrSecurityGroups(): List<String> = unwrap(this).getAttrSecurityGroups()

  public open fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(): String? =
      unwrap(this).getEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic()

  public open fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(`value`: String) {
    unwrap(this).setEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  public open fun loadBalancerAttributes(): Any? = unwrap(this).getLoadBalancerAttributes()

  public open fun loadBalancerAttributes(`value`: IResolvable) {
    unwrap(this).setLoadBalancerAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun loadBalancerAttributes(__idx_ac66f0: List<Any>) {
    unwrap(this).setLoadBalancerAttributes(__idx_ac66f0)
  }

  public open fun loadBalancerAttributes(vararg __idx_ac66f0: Any): Unit =
      loadBalancerAttributes(__idx_ac66f0.toList())

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun scheme(): String? = unwrap(this).getScheme()

  public open fun scheme(`value`: String) {
    unwrap(this).setScheme(`value`)
  }

  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  public open fun subnetMappings(): Any? = unwrap(this).getSubnetMappings()

  public open fun subnetMappings(`value`: IResolvable) {
    unwrap(this).setSubnetMappings(`value`.let(IResolvable::unwrap))
  }

  public open fun subnetMappings(__idx_ac66f0: List<Any>) {
    unwrap(this).setSubnetMappings(__idx_ac66f0)
  }

  public open fun subnetMappings(vararg __idx_ac66f0: Any): Unit =
      subnetMappings(__idx_ac66f0.toList())

  public open fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  public open fun subnets(`value`: List<String>) {
    unwrap(this).setSubnets(`value`)
  }

  public open fun subnets(vararg `value`: String): Unit = subnets(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public
        fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic: String)

    public fun ipAddressType(ipAddressType: String)

    public fun loadBalancerAttributes(loadBalancerAttributes: IResolvable)

    public fun loadBalancerAttributes(loadBalancerAttributes: List<Any>)

    public fun loadBalancerAttributes(vararg loadBalancerAttributes: Any)

    public fun name(name: String)

    public fun scheme(scheme: String)

    public fun securityGroups(securityGroups: List<String>)

    public fun securityGroups(vararg securityGroups: String)

    public fun subnetMappings(subnetMappings: IResolvable)

    public fun subnetMappings(subnetMappings: List<Any>)

    public fun subnetMappings(vararg subnetMappings: Any)

    public fun subnets(subnets: List<String>)

    public fun subnets(vararg subnets: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.Builder.create(scope,
        id)

    override
        fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic: String) {
      cdkBuilder.enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic)
    }

    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    override fun loadBalancerAttributes(loadBalancerAttributes: IResolvable) {
      cdkBuilder.loadBalancerAttributes(loadBalancerAttributes.let(IResolvable::unwrap))
    }

    override fun loadBalancerAttributes(loadBalancerAttributes: List<Any>) {
      cdkBuilder.loadBalancerAttributes(loadBalancerAttributes)
    }

    override fun loadBalancerAttributes(vararg loadBalancerAttributes: Any): Unit =
        loadBalancerAttributes(loadBalancerAttributes.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun scheme(scheme: String) {
      cdkBuilder.scheme(scheme)
    }

    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    override fun subnetMappings(subnetMappings: IResolvable) {
      cdkBuilder.subnetMappings(subnetMappings.let(IResolvable::unwrap))
    }

    override fun subnetMappings(subnetMappings: List<Any>) {
      cdkBuilder.subnetMappings(subnetMappings)
    }

    override fun subnetMappings(vararg subnetMappings: Any): Unit =
        subnetMappings(subnetMappings.toList())

    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoadBalancer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoadBalancer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer):
        CfnLoadBalancer = CfnLoadBalancer(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer = wrapped.cdkObject
  }

  public interface SubnetMappingProperty {
    public fun allocationId(): String? = unwrap(this).getAllocationId()

    public fun iPv6Address(): String? = unwrap(this).getIPv6Address()

    public fun privateIPv4Address(): String? = unwrap(this).getPrivateIPv4Address()

    public fun subnetId(): String

    public interface Builder {
      public fun allocationId(allocationId: String)

      public fun iPv6Address(iPv6Address: String)

      public fun privateIPv4Address(privateIPv4Address: String)

      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty.builder()

      override fun allocationId(allocationId: String) {
        cdkBuilder.allocationId(allocationId)
      }

      override fun iPv6Address(iPv6Address: String) {
        cdkBuilder.iPv6Address(iPv6Address)
      }

      override fun privateIPv4Address(privateIPv4Address: String) {
        cdkBuilder.privateIPv4Address(privateIPv4Address)
      }

      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty,
    ) : SubnetMappingProperty {
      override fun allocationId(): String? = unwrap(this).getAllocationId()

      override fun iPv6Address(): String? = unwrap(this).getIPv6Address()

      override fun privateIPv4Address(): String? = unwrap(this).getPrivateIPv4Address()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty):
          SubnetMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubnetMappingProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoadBalancerAttributeProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty,
    ) : LoadBalancerAttributeProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty):
          LoadBalancerAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerAttributeProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
