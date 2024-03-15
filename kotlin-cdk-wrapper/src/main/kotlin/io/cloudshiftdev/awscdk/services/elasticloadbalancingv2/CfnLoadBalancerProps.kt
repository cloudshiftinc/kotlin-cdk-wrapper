@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLoadBalancerProps {
  public fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(): String? =
      unwrap(this).getEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic()

  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public fun loadBalancerAttributes(): Any? = unwrap(this).getLoadBalancerAttributes()

  public fun name(): String? = unwrap(this).getName()

  public fun scheme(): String? = unwrap(this).getScheme()

  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public fun subnetMappings(): Any? = unwrap(this).getSubnetMappings()

  public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String? = unwrap(this).getType()

  @CdkDslMarker
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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps.builder()

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

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps,
  ) : CdkObject(cdkObject), CfnLoadBalancerProps {
    override fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(): String? =
        unwrap(this).getEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic()

    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    override fun loadBalancerAttributes(): Any? = unwrap(this).getLoadBalancerAttributes()

    override fun name(): String? = unwrap(this).getName()

    override fun scheme(): String? = unwrap(this).getScheme()

    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    override fun subnetMappings(): Any? = unwrap(this).getSubnetMappings()

    override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps):
        CfnLoadBalancerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps
  }
}
