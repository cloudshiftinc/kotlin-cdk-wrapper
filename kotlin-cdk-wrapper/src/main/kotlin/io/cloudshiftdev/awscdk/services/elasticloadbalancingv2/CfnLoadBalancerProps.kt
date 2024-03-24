@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnLoadBalancer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * CfnLoadBalancerProps cfnLoadBalancerProps = CfnLoadBalancerProps.builder()
 * .enforceSecurityGroupInboundRulesOnPrivateLinkTraffic("enforceSecurityGroupInboundRulesOnPrivateLinkTraffic")
 * .ipAddressType("ipAddressType")
 * .loadBalancerAttributes(List.of(LoadBalancerAttributeProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .name("name")
 * .scheme("scheme")
 * .securityGroups(List.of("securityGroups"))
 * .subnetMappings(List.of(SubnetMappingProperty.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .allocationId("allocationId")
 * .iPv6Address("iPv6Address")
 * .privateIPv4Address("privateIPv4Address")
 * .build()))
 * .subnets(List.of("subnets"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html)
 */
public interface CfnLoadBalancerProps {
  /**
   * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
   * Balancer through AWS PrivateLink .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-enforcesecuritygroupinboundrulesonprivatelinktraffic)
   */
  public fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(): String? =
      unwrap(this).getEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic()

  /**
   * The IP address type.
   *
   * The possible values are `ipv4` (for IPv4 addresses) and `dualstack` (for IPv4 and IPv6
   * addresses). You can’t specify `dualstack` for a load balancer with a UDP or TCP_UDP listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-ipaddresstype)
   */
  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The load balancer attributes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
   */
  public fun loadBalancerAttributes(): Any? = unwrap(this).getLoadBalancerAttributes()

  /**
   * The name of the load balancer.
   *
   * This name must be unique per region per account, can have a maximum of 32 characters, must
   * contain only alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not
   * begin with "internal-".
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the load
   * balancer. If you specify a name, you cannot perform updates that require replacement of this
   * resource, but you can perform other updates. To replace the resource, specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The nodes of an Internet-facing load balancer have public IP addresses.
   *
   * The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP
   * addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients
   * over the internet.
   *
   * The nodes of an internal load balancer have only private IP addresses. The DNS name of an
   * internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore,
   * internal load balancers can route requests only from clients with access to the VPC for the load
   * balancer.
   *
   * The default is an Internet-facing load balancer.
   *
   * You cannot specify a scheme for a Gateway Load Balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-scheme)
   */
  public fun scheme(): String? = unwrap(this).getScheme()

  /**
   * [Application Load Balancers and Network Load Balancers] The IDs of the security groups for the
   * load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-securitygroups)
   */
  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * The IDs of the subnets.
   *
   * You can specify only one subnet per Availability Zone. You must specify either subnets or
   * subnet mappings, but not both.
   *
   * [Application Load Balancers] You must specify subnets from at least two Availability Zones. You
   * cannot specify Elastic IP addresses for your subnets.
   *
   * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
   *
   * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
   * Zones.
   *
   * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can
   * specify one Elastic IP address per subnet if you need static IP addresses for your internet-facing
   * load balancer. For internal load balancers, you can specify one private IP address per subnet from
   * the IPv4 range of the subnet. For internet-facing load balancer, you can specify one IPv6 address
   * per subnet.
   *
   * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
   * cannot specify Elastic IP addresses for your subnets.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmappings)
   */
  public fun subnetMappings(): Any? = unwrap(this).getSubnetMappings()

  /**
   * The IDs of the subnets.
   *
   * You can specify only one subnet per Availability Zone. You must specify either subnets or
   * subnet mappings, but not both. To specify an Elastic IP address, specify subnet mappings instead
   * of subnets.
   *
   * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
   *
   * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
   *
   * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
   * Zones.
   *
   * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
   *
   * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-subnets)
   */
  public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  /**
   * The tags to assign to the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of load balancer.
   *
   * The default is `application` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnLoadBalancerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enforceSecurityGroupInboundRulesOnPrivateLinkTraffic Indicates whether to evaluate
     * inbound security group rules for traffic sent to a Network Load Balancer through AWS PrivateLink
     * .
     */
    public
        fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic: String)

    /**
     * @param ipAddressType The IP address type.
     * The possible values are `ipv4` (for IPv4 addresses) and `dualstack` (for IPv4 and IPv6
     * addresses). You can’t specify `dualstack` for a load balancer with a UDP or TCP_UDP listener.
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * @param loadBalancerAttributes The load balancer attributes.
     */
    public fun loadBalancerAttributes(loadBalancerAttributes: IResolvable)

    /**
     * @param loadBalancerAttributes The load balancer attributes.
     */
    public fun loadBalancerAttributes(loadBalancerAttributes: List<Any>)

    /**
     * @param loadBalancerAttributes The load balancer attributes.
     */
    public fun loadBalancerAttributes(vararg loadBalancerAttributes: Any)

    /**
     * @param name The name of the load balancer.
     * This name must be unique per region per account, can have a maximum of 32 characters, must
     * contain only alphanumeric characters or hyphens, must not begin or end with a hyphen, and must
     * not begin with "internal-".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the load
     * balancer. If you specify a name, you cannot perform updates that require replacement of this
     * resource, but you can perform other updates. To replace the resource, specify a new name.
     */
    public fun name(name: String)

    /**
     * @param scheme The nodes of an Internet-facing load balancer have public IP addresses.
     * The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP
     * addresses of the nodes. Therefore, Internet-facing load balancers can route requests from
     * clients over the internet.
     *
     * The nodes of an internal load balancer have only private IP addresses. The DNS name of an
     * internal load balancer is publicly resolvable to the private IP addresses of the nodes.
     * Therefore, internal load balancers can route requests only from clients with access to the VPC
     * for the load balancer.
     *
     * The default is an Internet-facing load balancer.
     *
     * You cannot specify a scheme for a Gateway Load Balancer.
     */
    public fun scheme(scheme: String)

    /**
     * @param securityGroups [Application Load Balancers and Network Load Balancers] The IDs of the
     * security groups for the load balancer.
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * @param securityGroups [Application Load Balancers and Network Load Balancers] The IDs of the
     * security groups for the load balancer.
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * @param subnetMappings The IDs of the subnets.
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * You cannot specify Elastic IP addresses for your subnets.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can
     * specify one Elastic IP address per subnet if you need static IP addresses for your
     * internet-facing load balancer. For internal load balancers, you can specify one private IP
     * address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you can
     * specify one IPv6 address per subnet.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
     * cannot specify Elastic IP addresses for your subnets.
     */
    public fun subnetMappings(subnetMappings: IResolvable)

    /**
     * @param subnetMappings The IDs of the subnets.
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * You cannot specify Elastic IP addresses for your subnets.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can
     * specify one Elastic IP address per subnet if you need static IP addresses for your
     * internet-facing load balancer. For internal load balancers, you can specify one private IP
     * address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you can
     * specify one IPv6 address per subnet.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
     * cannot specify Elastic IP addresses for your subnets.
     */
    public fun subnetMappings(subnetMappings: List<Any>)

    /**
     * @param subnetMappings The IDs of the subnets.
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * You cannot specify Elastic IP addresses for your subnets.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can
     * specify one Elastic IP address per subnet if you need static IP addresses for your
     * internet-facing load balancer. For internal load balancers, you can specify one private IP
     * address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you can
     * specify one IPv6 address per subnet.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
     * cannot specify Elastic IP addresses for your subnets.
     */
    public fun subnetMappings(vararg subnetMappings: Any)

    /**
     * @param subnets The IDs of the subnets.
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both. To specify an Elastic IP address, specify subnet mappings instead
     * of subnets.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones.
     */
    public fun subnets(subnets: List<String>)

    /**
     * @param subnets The IDs of the subnets.
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both. To specify an Elastic IP address, specify subnet mappings instead
     * of subnets.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones.
     */
    public fun subnets(vararg subnets: String)

    /**
     * @param tags The tags to assign to the load balancer.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to the load balancer.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of load balancer.
     * The default is `application` .
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps.builder()

    /**
     * @param enforceSecurityGroupInboundRulesOnPrivateLinkTraffic Indicates whether to evaluate
     * inbound security group rules for traffic sent to a Network Load Balancer through AWS PrivateLink
     * .
     */
    override
        fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic: String) {
      cdkBuilder.enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic)
    }

    /**
     * @param ipAddressType The IP address type.
     * The possible values are `ipv4` (for IPv4 addresses) and `dualstack` (for IPv4 and IPv6
     * addresses). You can’t specify `dualstack` for a load balancer with a UDP or TCP_UDP listener.
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * @param loadBalancerAttributes The load balancer attributes.
     */
    override fun loadBalancerAttributes(loadBalancerAttributes: IResolvable) {
      cdkBuilder.loadBalancerAttributes(loadBalancerAttributes.let(IResolvable::unwrap))
    }

    /**
     * @param loadBalancerAttributes The load balancer attributes.
     */
    override fun loadBalancerAttributes(loadBalancerAttributes: List<Any>) {
      cdkBuilder.loadBalancerAttributes(loadBalancerAttributes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param loadBalancerAttributes The load balancer attributes.
     */
    override fun loadBalancerAttributes(vararg loadBalancerAttributes: Any): Unit =
        loadBalancerAttributes(loadBalancerAttributes.toList())

    /**
     * @param name The name of the load balancer.
     * This name must be unique per region per account, can have a maximum of 32 characters, must
     * contain only alphanumeric characters or hyphens, must not begin or end with a hyphen, and must
     * not begin with "internal-".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the load
     * balancer. If you specify a name, you cannot perform updates that require replacement of this
     * resource, but you can perform other updates. To replace the resource, specify a new name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param scheme The nodes of an Internet-facing load balancer have public IP addresses.
     * The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP
     * addresses of the nodes. Therefore, Internet-facing load balancers can route requests from
     * clients over the internet.
     *
     * The nodes of an internal load balancer have only private IP addresses. The DNS name of an
     * internal load balancer is publicly resolvable to the private IP addresses of the nodes.
     * Therefore, internal load balancers can route requests only from clients with access to the VPC
     * for the load balancer.
     *
     * The default is an Internet-facing load balancer.
     *
     * You cannot specify a scheme for a Gateway Load Balancer.
     */
    override fun scheme(scheme: String) {
      cdkBuilder.scheme(scheme)
    }

    /**
     * @param securityGroups [Application Load Balancers and Network Load Balancers] The IDs of the
     * security groups for the load balancer.
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param securityGroups [Application Load Balancers and Network Load Balancers] The IDs of the
     * security groups for the load balancer.
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnetMappings The IDs of the subnets.
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * You cannot specify Elastic IP addresses for your subnets.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can
     * specify one Elastic IP address per subnet if you need static IP addresses for your
     * internet-facing load balancer. For internal load balancers, you can specify one private IP
     * address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you can
     * specify one IPv6 address per subnet.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
     * cannot specify Elastic IP addresses for your subnets.
     */
    override fun subnetMappings(subnetMappings: IResolvable) {
      cdkBuilder.subnetMappings(subnetMappings.let(IResolvable::unwrap))
    }

    /**
     * @param subnetMappings The IDs of the subnets.
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * You cannot specify Elastic IP addresses for your subnets.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can
     * specify one Elastic IP address per subnet if you need static IP addresses for your
     * internet-facing load balancer. For internal load balancers, you can specify one private IP
     * address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you can
     * specify one IPv6 address per subnet.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
     * cannot specify Elastic IP addresses for your subnets.
     */
    override fun subnetMappings(subnetMappings: List<Any>) {
      cdkBuilder.subnetMappings(subnetMappings.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param subnetMappings The IDs of the subnets.
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * You cannot specify Elastic IP addresses for your subnets.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can
     * specify one Elastic IP address per subnet if you need static IP addresses for your
     * internet-facing load balancer. For internal load balancers, you can specify one private IP
     * address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you can
     * specify one IPv6 address per subnet.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
     * cannot specify Elastic IP addresses for your subnets.
     */
    override fun subnetMappings(vararg subnetMappings: Any): Unit =
        subnetMappings(subnetMappings.toList())

    /**
     * @param subnets The IDs of the subnets.
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both. To specify an Elastic IP address, specify subnet mappings instead
     * of subnets.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones.
     */
    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    /**
     * @param subnets The IDs of the subnets.
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both. To specify an Elastic IP address, specify subnet mappings instead
     * of subnets.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones.
     */
    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    /**
     * @param tags The tags to assign to the load balancer.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to assign to the load balancer.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of load balancer.
     * The default is `application` .
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps,
  ) : CdkObject(cdkObject), CfnLoadBalancerProps {
    /**
     * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
     * Balancer through AWS PrivateLink .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-enforcesecuritygroupinboundrulesonprivatelinktraffic)
     */
    override fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(): String? =
        unwrap(this).getEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic()

    /**
     * The IP address type.
     *
     * The possible values are `ipv4` (for IPv4 addresses) and `dualstack` (for IPv4 and IPv6
     * addresses). You can’t specify `dualstack` for a load balancer with a UDP or TCP_UDP listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-ipaddresstype)
     */
    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * The load balancer attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
     */
    override fun loadBalancerAttributes(): Any? = unwrap(this).getLoadBalancerAttributes()

    /**
     * The name of the load balancer.
     *
     * This name must be unique per region per account, can have a maximum of 32 characters, must
     * contain only alphanumeric characters or hyphens, must not begin or end with a hyphen, and must
     * not begin with "internal-".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the load
     * balancer. If you specify a name, you cannot perform updates that require replacement of this
     * resource, but you can perform other updates. To replace the resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The nodes of an Internet-facing load balancer have public IP addresses.
     *
     * The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP
     * addresses of the nodes. Therefore, Internet-facing load balancers can route requests from
     * clients over the internet.
     *
     * The nodes of an internal load balancer have only private IP addresses. The DNS name of an
     * internal load balancer is publicly resolvable to the private IP addresses of the nodes.
     * Therefore, internal load balancers can route requests only from clients with access to the VPC
     * for the load balancer.
     *
     * The default is an Internet-facing load balancer.
     *
     * You cannot specify a scheme for a Gateway Load Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-scheme)
     */
    override fun scheme(): String? = unwrap(this).getScheme()

    /**
     * [Application Load Balancers and Network Load Balancers] The IDs of the security groups for
     * the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-securitygroups)
     */
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * The IDs of the subnets.
     *
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * You cannot specify Elastic IP addresses for your subnets.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can
     * specify one Elastic IP address per subnet if you need static IP addresses for your
     * internet-facing load balancer. For internal load balancers, you can specify one private IP
     * address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you can
     * specify one IPv6 address per subnet.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
     * cannot specify Elastic IP addresses for your subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmappings)
     */
    override fun subnetMappings(): Any? = unwrap(this).getSubnetMappings()

    /**
     * The IDs of the subnets.
     *
     * You can specify only one subnet per Availability Zone. You must specify either subnets or
     * subnet mappings, but not both. To specify an Elastic IP address, specify subnet mappings instead
     * of subnets.
     *
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     *
     * [Application Load Balancers on Outposts] You must specify one Outpost subnet.
     *
     * [Application Load Balancers on Local Zones] You can specify subnets from one or more Local
     * Zones.
     *
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-subnets)
     */
    override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    /**
     * The tags to assign to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of load balancer.
     *
     * The default is `application` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps):
        CfnLoadBalancerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLoadBalancerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps
  }
}
