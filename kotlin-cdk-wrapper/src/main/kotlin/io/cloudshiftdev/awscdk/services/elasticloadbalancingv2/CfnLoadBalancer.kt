@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an Application Load Balancer, a Network Load Balancer, or a Gateway Load Balancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * CfnLoadBalancer cfnLoadBalancer = CfnLoadBalancer.Builder.create(this, "MyCfnLoadBalancer")
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
public open class CfnLoadBalancer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
   *
   * For example, `Z2P70J7EXAMPLE` .
   */
  public open fun attrCanonicalHostedZoneId(): String = unwrap(this).getAttrCanonicalHostedZoneId()

  /**
   * The DNS name for the load balancer.
   *
   * For example, `my-load-balancer-424835706.us-west-2.elb.amazonaws.com` .
   */
  public open fun attrDnsName(): String = unwrap(this).getAttrDnsName()

  /**
   * The Amazon Resource Name (ARN) of the load balancer.
   */
  public open fun attrLoadBalancerArn(): String = unwrap(this).getAttrLoadBalancerArn()

  /**
   * The full name of the load balancer.
   *
   * For example, `app/my-load-balancer/50dc6c495c0c9188` .
   */
  public open fun attrLoadBalancerFullName(): String = unwrap(this).getAttrLoadBalancerFullName()

  /**
   * The name of the load balancer.
   *
   * For example, `my-load-balancer` .
   */
  public open fun attrLoadBalancerName(): String = unwrap(this).getAttrLoadBalancerName()

  /**
   * The IDs of the security groups for the load balancer.
   */
  public open fun attrSecurityGroups(): List<String> = unwrap(this).getAttrSecurityGroups()

  /**
   * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
   * Balancer through AWS PrivateLink .
   */
  public open fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(): String? =
      unwrap(this).getEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic()

  /**
   * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
   * Balancer through AWS PrivateLink .
   */
  public open fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(`value`: String) {
    unwrap(this).setEnforceSecurityGroupInboundRulesOnPrivateLinkTraffic(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IP address type.
   */
  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The IP address type.
   */
  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  /**
   * The load balancer attributes.
   */
  public open fun loadBalancerAttributes(): Any? = unwrap(this).getLoadBalancerAttributes()

  /**
   * The load balancer attributes.
   */
  public open fun loadBalancerAttributes(`value`: IResolvable) {
    unwrap(this).setLoadBalancerAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * The load balancer attributes.
   */
  public open fun loadBalancerAttributes(`value`: List<Any>) {
    unwrap(this).setLoadBalancerAttributes(`value`)
  }

  /**
   * The load balancer attributes.
   */
  public open fun loadBalancerAttributes(vararg `value`: Any): Unit =
      loadBalancerAttributes(`value`.toList())

  /**
   * The name of the load balancer.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the load balancer.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The nodes of an Internet-facing load balancer have public IP addresses.
   */
  public open fun scheme(): String? = unwrap(this).getScheme()

  /**
   * The nodes of an Internet-facing load balancer have public IP addresses.
   */
  public open fun scheme(`value`: String) {
    unwrap(this).setScheme(`value`)
  }

  /**
   * [Application Load Balancers and Network Load Balancers] The IDs of the security groups for the
   * load balancer.
   */
  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * [Application Load Balancers and Network Load Balancers] The IDs of the security groups for the
   * load balancer.
   */
  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  /**
   * [Application Load Balancers and Network Load Balancers] The IDs of the security groups for the
   * load balancer.
   */
  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  /**
   * The IDs of the subnets.
   */
  public open fun subnetMappings(): Any? = unwrap(this).getSubnetMappings()

  /**
   * The IDs of the subnets.
   */
  public open fun subnetMappings(`value`: IResolvable) {
    unwrap(this).setSubnetMappings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The IDs of the subnets.
   */
  public open fun subnetMappings(`value`: List<Any>) {
    unwrap(this).setSubnetMappings(`value`)
  }

  /**
   * The IDs of the subnets.
   */
  public open fun subnetMappings(vararg `value`: Any): Unit = subnetMappings(`value`.toList())

  /**
   * The IDs of the subnets.
   */
  public open fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  /**
   * The IDs of the subnets.
   */
  public open fun subnets(`value`: List<String>) {
    unwrap(this).setSubnets(`value`)
  }

  /**
   * The IDs of the subnets.
   */
  public open fun subnets(vararg `value`: String): Unit = subnets(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to assign to the load balancer.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to assign to the load balancer.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to assign to the load balancer.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of load balancer.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type of load balancer.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
     * Balancer through AWS PrivateLink .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-enforcesecuritygroupinboundrulesonprivatelinktraffic)
     * @param enforceSecurityGroupInboundRulesOnPrivateLinkTraffic Indicates whether to evaluate
     * inbound security group rules for traffic sent to a Network Load Balancer through AWS PrivateLink
     * . 
     */
    public
        fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic: String)

    /**
     * The IP address type.
     *
     * The possible values are `ipv4` (for IPv4 addresses) and `dualstack` (for IPv4 and IPv6
     * addresses). You can’t specify `dualstack` for a load balancer with a UDP or TCP_UDP listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-ipaddresstype)
     * @param ipAddressType The IP address type. 
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * The load balancer attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
     * @param loadBalancerAttributes The load balancer attributes. 
     */
    public fun loadBalancerAttributes(loadBalancerAttributes: IResolvable)

    /**
     * The load balancer attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
     * @param loadBalancerAttributes The load balancer attributes. 
     */
    public fun loadBalancerAttributes(loadBalancerAttributes: List<Any>)

    /**
     * The load balancer attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
     * @param loadBalancerAttributes The load balancer attributes. 
     */
    public fun loadBalancerAttributes(vararg loadBalancerAttributes: Any)

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
     * @param name The name of the load balancer. 
     */
    public fun name(name: String)

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
     * @param scheme The nodes of an Internet-facing load balancer have public IP addresses. 
     */
    public fun scheme(scheme: String)

    /**
     * [Application Load Balancers and Network Load Balancers] The IDs of the security groups for
     * the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-securitygroups)
     * @param securityGroups [Application Load Balancers and Network Load Balancers] The IDs of the
     * security groups for the load balancer. 
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * [Application Load Balancers and Network Load Balancers] The IDs of the security groups for
     * the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-securitygroups)
     * @param securityGroups [Application Load Balancers and Network Load Balancers] The IDs of the
     * security groups for the load balancer. 
     */
    public fun securityGroups(vararg securityGroups: String)

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
     * @param subnetMappings The IDs of the subnets. 
     */
    public fun subnetMappings(subnetMappings: IResolvable)

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
     * @param subnetMappings The IDs of the subnets. 
     */
    public fun subnetMappings(subnetMappings: List<Any>)

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
     * @param subnetMappings The IDs of the subnets. 
     */
    public fun subnetMappings(vararg subnetMappings: Any)

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
     * @param subnets The IDs of the subnets. 
     */
    public fun subnets(subnets: List<String>)

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
     * @param subnets The IDs of the subnets. 
     */
    public fun subnets(vararg subnets: String)

    /**
     * The tags to assign to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-tags)
     * @param tags The tags to assign to the load balancer. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to assign to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-tags)
     * @param tags The tags to assign to the load balancer. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of load balancer.
     *
     * The default is `application` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-type)
     * @param type The type of load balancer. 
     */
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

    /**
     * Indicates whether to evaluate inbound security group rules for traffic sent to a Network Load
     * Balancer through AWS PrivateLink .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-enforcesecuritygroupinboundrulesonprivatelinktraffic)
     * @param enforceSecurityGroupInboundRulesOnPrivateLinkTraffic Indicates whether to evaluate
     * inbound security group rules for traffic sent to a Network Load Balancer through AWS PrivateLink
     * . 
     */
    override
        fun enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic: String) {
      cdkBuilder.enforceSecurityGroupInboundRulesOnPrivateLinkTraffic(enforceSecurityGroupInboundRulesOnPrivateLinkTraffic)
    }

    /**
     * The IP address type.
     *
     * The possible values are `ipv4` (for IPv4 addresses) and `dualstack` (for IPv4 and IPv6
     * addresses). You can’t specify `dualstack` for a load balancer with a UDP or TCP_UDP listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-ipaddresstype)
     * @param ipAddressType The IP address type. 
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * The load balancer attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
     * @param loadBalancerAttributes The load balancer attributes. 
     */
    override fun loadBalancerAttributes(loadBalancerAttributes: IResolvable) {
      cdkBuilder.loadBalancerAttributes(loadBalancerAttributes.let(IResolvable::unwrap))
    }

    /**
     * The load balancer attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
     * @param loadBalancerAttributes The load balancer attributes. 
     */
    override fun loadBalancerAttributes(loadBalancerAttributes: List<Any>) {
      cdkBuilder.loadBalancerAttributes(loadBalancerAttributes)
    }

    /**
     * The load balancer attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattributes)
     * @param loadBalancerAttributes The load balancer attributes. 
     */
    override fun loadBalancerAttributes(vararg loadBalancerAttributes: Any): Unit =
        loadBalancerAttributes(loadBalancerAttributes.toList())

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
     * @param name The name of the load balancer. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param scheme The nodes of an Internet-facing load balancer have public IP addresses. 
     */
    override fun scheme(scheme: String) {
      cdkBuilder.scheme(scheme)
    }

    /**
     * [Application Load Balancers and Network Load Balancers] The IDs of the security groups for
     * the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-securitygroups)
     * @param securityGroups [Application Load Balancers and Network Load Balancers] The IDs of the
     * security groups for the load balancer. 
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * [Application Load Balancers and Network Load Balancers] The IDs of the security groups for
     * the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-securitygroups)
     * @param securityGroups [Application Load Balancers and Network Load Balancers] The IDs of the
     * security groups for the load balancer. 
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

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
     * @param subnetMappings The IDs of the subnets. 
     */
    override fun subnetMappings(subnetMappings: IResolvable) {
      cdkBuilder.subnetMappings(subnetMappings.let(IResolvable::unwrap))
    }

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
     * @param subnetMappings The IDs of the subnets. 
     */
    override fun subnetMappings(subnetMappings: List<Any>) {
      cdkBuilder.subnetMappings(subnetMappings)
    }

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
     * @param subnetMappings The IDs of the subnets. 
     */
    override fun subnetMappings(vararg subnetMappings: Any): Unit =
        subnetMappings(subnetMappings.toList())

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
     * @param subnets The IDs of the subnets. 
     */
    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

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
     * @param subnets The IDs of the subnets. 
     */
    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    /**
     * The tags to assign to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-tags)
     * @param tags The tags to assign to the load balancer. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to assign to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-tags)
     * @param tags The tags to assign to the load balancer. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of load balancer.
     *
     * The default is `application` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-loadbalancer.html#cfn-elasticloadbalancingv2-loadbalancer-type)
     * @param type The type of load balancer. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.CFN_RESOURCE_TYPE_NAME

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

  /**
   * Specifies a subnet for a load balancer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
   * SubnetMappingProperty subnetMappingProperty = SubnetMappingProperty.builder()
   * .subnetId("subnetId")
   * // the properties below are optional
   * .allocationId("allocationId")
   * .iPv6Address("iPv6Address")
   * .privateIPv4Address("privateIPv4Address")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html)
   */
  public interface SubnetMappingProperty {
    /**
     * [Network Load Balancers] The allocation ID of the Elastic IP address for an internet-facing
     * load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmapping-allocationid)
     */
    public fun allocationId(): String? = unwrap(this).getAllocationId()

    /**
     * [Network Load Balancers] The IPv6 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmapping-ipv6address)
     */
    public fun iPv6Address(): String? = unwrap(this).getIPv6Address()

    /**
     * [Network Load Balancers] The private IPv4 address for an internal load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmapping-privateipv4address)
     */
    public fun privateIPv4Address(): String? = unwrap(this).getPrivateIPv4Address()

    /**
     * The ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmapping-subnetid)
     */
    public fun subnetId(): String

    /**
     * A builder for [SubnetMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allocationId [Network Load Balancers] The allocation ID of the Elastic IP address
       * for an internet-facing load balancer.
       */
      public fun allocationId(allocationId: String)

      /**
       * @param iPv6Address [Network Load Balancers] The IPv6 address.
       */
      public fun iPv6Address(iPv6Address: String)

      /**
       * @param privateIPv4Address [Network Load Balancers] The private IPv4 address for an internal
       * load balancer.
       */
      public fun privateIPv4Address(privateIPv4Address: String)

      /**
       * @param subnetId The ID of the subnet. 
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty.builder()

      /**
       * @param allocationId [Network Load Balancers] The allocation ID of the Elastic IP address
       * for an internet-facing load balancer.
       */
      override fun allocationId(allocationId: String) {
        cdkBuilder.allocationId(allocationId)
      }

      /**
       * @param iPv6Address [Network Load Balancers] The IPv6 address.
       */
      override fun iPv6Address(iPv6Address: String) {
        cdkBuilder.iPv6Address(iPv6Address)
      }

      /**
       * @param privateIPv4Address [Network Load Balancers] The private IPv4 address for an internal
       * load balancer.
       */
      override fun privateIPv4Address(privateIPv4Address: String) {
        cdkBuilder.privateIPv4Address(privateIPv4Address)
      }

      /**
       * @param subnetId The ID of the subnet. 
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty,
    ) : CdkObject(cdkObject), SubnetMappingProperty {
      /**
       * [Network Load Balancers] The allocation ID of the Elastic IP address for an internet-facing
       * load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmapping-allocationid)
       */
      override fun allocationId(): String? = unwrap(this).getAllocationId()

      /**
       * [Network Load Balancers] The IPv6 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmapping-ipv6address)
       */
      override fun iPv6Address(): String? = unwrap(this).getIPv6Address()

      /**
       * [Network Load Balancers] The private IPv4 address for an internal load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmapping-privateipv4address)
       */
      override fun privateIPv4Address(): String? = unwrap(this).getPrivateIPv4Address()

      /**
       * The ID of the subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-subnetmapping.html#cfn-elasticloadbalancingv2-loadbalancer-subnetmapping-subnetid)
       */
      override fun subnetId(): String = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubnetMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty):
          SubnetMappingProperty = CdkObjectWrappers.wrap(cdkObject) as? SubnetMappingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubnetMappingProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.SubnetMappingProperty
    }
  }

  /**
   * Specifies an attribute for an Application Load Balancer, a Network Load Balancer, or a Gateway
   * Load Balancer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
   * LoadBalancerAttributeProperty loadBalancerAttributeProperty =
   * LoadBalancerAttributeProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html)
   */
  public interface LoadBalancerAttributeProperty {
    /**
     * The name of the attribute.
     *
     * The following attributes are supported by all load balancers:
     *
     * * `deletion_protection.enabled` - Indicates whether deletion protection is enabled. The value
     * is `true` or `false` . The default is `false` .
     * * `load_balancing.cross_zone.enabled` - Indicates whether cross-zone load balancing is
     * enabled. The possible values are `true` and `false` . The default for Network Load Balancers and
     * Gateway Load Balancers is `false` . The default for Application Load Balancers is `true` , and
     * cannot be changed.
     *
     * The following attributes are supported by both Application Load Balancers and Network Load
     * Balancers:
     *
     * * `access_logs.s3.enabled` - Indicates whether access logs are enabled. The value is `true`
     * or `false` . The default is `false` .
     * * `access_logs.s3.bucket` - The name of the S3 bucket for the access logs. This attribute is
     * required if access logs are enabled. The bucket must exist in the same region as the load
     * balancer and have a bucket policy that grants Elastic Load Balancing permissions to write to the
     * bucket.
     * * `access_logs.s3.prefix` - The prefix for the location in the S3 bucket for the access logs.
     * * `ipv6.deny_all_igw_traffic` - Blocks internet gateway (IGW) access to the load balancer. It
     * is set to `false` for internet-facing load balancers and `true` for internal load balancers,
     * preventing unintended access to your internal load balancer through an internet gateway.
     *
     * The following attributes are supported by only Application Load Balancers:
     *
     * * `idle_timeout.timeout_seconds` - The idle timeout value, in seconds. The valid range is
     * 1-4000 seconds. The default is 60 seconds.
     * * `connection_logs.s3.enabled` - Indicates whether connection logs are enabled. The value is
     * `true` or `false` . The default is `false` .
     * * `connection_logs.s3.bucket` - The name of the S3 bucket for the connection logs. This
     * attribute is required if connection logs are enabled. The bucket must exist in the same region
     * as the load balancer and have a bucket policy that grants Elastic Load Balancing permissions to
     * write to the bucket.
     * * `connection_logs.s3.prefix` - The prefix for the location in the S3 bucket for the
     * connection logs.
     * * `routing.http.desync_mitigation_mode` - Determines how the load balancer handles requests
     * that might pose a security risk to your application. The possible values are `monitor` ,
     * `defensive` , and `strictest` . The default is `defensive` .
     * * `routing.http.drop_invalid_header_fields.enabled` - Indicates whether HTTP headers with
     * invalid header fields are removed by the load balancer ( `true` ) or routed to targets ( `false`
     * ). The default is `false` .
     * * `routing.http.preserve_host_header.enabled` - Indicates whether the Application Load
     * Balancer should preserve the `Host` header in the HTTP request and send it to the target without
     * any change. The possible values are `true` and `false` . The default is `false` .
     * * `routing.http.x_amzn_tls_version_and_cipher_suite.enabled` - Indicates whether the two
     * headers ( `x-amzn-tls-version` and `x-amzn-tls-cipher-suite` ), which contain information about
     * the negotiated TLS version and cipher suite, are added to the client request before sending it
     * to the target. The `x-amzn-tls-version` header has information about the TLS protocol version
     * negotiated with the client, and the `x-amzn-tls-cipher-suite` header has information about the
     * cipher suite negotiated with the client. Both headers are in OpenSSL format. The possible values
     * for the attribute are `true` and `false` . The default is `false` .
     * * `routing.http.xff_client_port.enabled` - Indicates whether the `X-Forwarded-For` header
     * should preserve the source port that the client used to connect to the load balancer. The
     * possible values are `true` and `false` . The default is `false` .
     * * `routing.http.xff_header_processing.mode` - Enables you to modify, preserve, or remove the
     * `X-Forwarded-For` header in the HTTP request before the Application Load Balancer sends the
     * request to the target. The possible values are `append` , `preserve` , and `remove` . The
     * default is `append` .
     * * If the value is `append` , the Application Load Balancer adds the client IP address (of the
     * last hop) to the `X-Forwarded-For` header in the HTTP request before it sends it to targets.
     * * If the value is `preserve` the Application Load Balancer preserves the `X-Forwarded-For`
     * header in the HTTP request, and sends it to targets without any change.
     * * If the value is `remove` , the Application Load Balancer removes the `X-Forwarded-For`
     * header in the HTTP request before it sends it to targets.
     * * `routing.http2.enabled` - Indicates whether HTTP/2 is enabled. The possible values are
     * `true` and `false` . The default is `true` . Elastic Load Balancing requires that message header
     * names contain only alphanumeric characters and hyphens.
     * * `waf.fail_open.enabled` - Indicates whether to allow a WAF-enabled load balancer to route
     * requests to targets if it is unable to forward the request to AWS WAF. The possible values are
     * `true` and `false` . The default is `false` .
     *
     * The following attributes are supported by only Network Load Balancers:
     *
     * * `dns_record.client_routing_policy` - Indicates how traffic is distributed among the load
     * balancer Availability Zones. The possible values are `availability_zone_affinity` with 100
     * percent zonal affinity, `partial_availability_zone_affinity` with 85 percent zonal affinity, and
     * `any_availability_zone` with 0 percent zonal affinity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattribute-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value of the attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattribute-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [LoadBalancerAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The name of the attribute.
       * The following attributes are supported by all load balancers:
       *
       * * `deletion_protection.enabled` - Indicates whether deletion protection is enabled. The
       * value is `true` or `false` . The default is `false` .
       * * `load_balancing.cross_zone.enabled` - Indicates whether cross-zone load balancing is
       * enabled. The possible values are `true` and `false` . The default for Network Load Balancers
       * and Gateway Load Balancers is `false` . The default for Application Load Balancers is `true` ,
       * and cannot be changed.
       *
       * The following attributes are supported by both Application Load Balancers and Network Load
       * Balancers:
       *
       * * `access_logs.s3.enabled` - Indicates whether access logs are enabled. The value is `true`
       * or `false` . The default is `false` .
       * * `access_logs.s3.bucket` - The name of the S3 bucket for the access logs. This attribute
       * is required if access logs are enabled. The bucket must exist in the same region as the load
       * balancer and have a bucket policy that grants Elastic Load Balancing permissions to write to
       * the bucket.
       * * `access_logs.s3.prefix` - The prefix for the location in the S3 bucket for the access
       * logs.
       * * `ipv6.deny_all_igw_traffic` - Blocks internet gateway (IGW) access to the load balancer.
       * It is set to `false` for internet-facing load balancers and `true` for internal load
       * balancers, preventing unintended access to your internal load balancer through an internet
       * gateway.
       *
       * The following attributes are supported by only Application Load Balancers:
       *
       * * `idle_timeout.timeout_seconds` - The idle timeout value, in seconds. The valid range is
       * 1-4000 seconds. The default is 60 seconds.
       * * `connection_logs.s3.enabled` - Indicates whether connection logs are enabled. The value
       * is `true` or `false` . The default is `false` .
       * * `connection_logs.s3.bucket` - The name of the S3 bucket for the connection logs. This
       * attribute is required if connection logs are enabled. The bucket must exist in the same region
       * as the load balancer and have a bucket policy that grants Elastic Load Balancing permissions
       * to write to the bucket.
       * * `connection_logs.s3.prefix` - The prefix for the location in the S3 bucket for the
       * connection logs.
       * * `routing.http.desync_mitigation_mode` - Determines how the load balancer handles requests
       * that might pose a security risk to your application. The possible values are `monitor` ,
       * `defensive` , and `strictest` . The default is `defensive` .
       * * `routing.http.drop_invalid_header_fields.enabled` - Indicates whether HTTP headers with
       * invalid header fields are removed by the load balancer ( `true` ) or routed to targets (
       * `false` ). The default is `false` .
       * * `routing.http.preserve_host_header.enabled` - Indicates whether the Application Load
       * Balancer should preserve the `Host` header in the HTTP request and send it to the target
       * without any change. The possible values are `true` and `false` . The default is `false` .
       * * `routing.http.x_amzn_tls_version_and_cipher_suite.enabled` - Indicates whether the two
       * headers ( `x-amzn-tls-version` and `x-amzn-tls-cipher-suite` ), which contain information
       * about the negotiated TLS version and cipher suite, are added to the client request before
       * sending it to the target. The `x-amzn-tls-version` header has information about the TLS
       * protocol version negotiated with the client, and the `x-amzn-tls-cipher-suite` header has
       * information about the cipher suite negotiated with the client. Both headers are in OpenSSL
       * format. The possible values for the attribute are `true` and `false` . The default is `false`
       * .
       * * `routing.http.xff_client_port.enabled` - Indicates whether the `X-Forwarded-For` header
       * should preserve the source port that the client used to connect to the load balancer. The
       * possible values are `true` and `false` . The default is `false` .
       * * `routing.http.xff_header_processing.mode` - Enables you to modify, preserve, or remove
       * the `X-Forwarded-For` header in the HTTP request before the Application Load Balancer sends
       * the request to the target. The possible values are `append` , `preserve` , and `remove` . The
       * default is `append` .
       * * If the value is `append` , the Application Load Balancer adds the client IP address (of
       * the last hop) to the `X-Forwarded-For` header in the HTTP request before it sends it to
       * targets.
       * * If the value is `preserve` the Application Load Balancer preserves the `X-Forwarded-For`
       * header in the HTTP request, and sends it to targets without any change.
       * * If the value is `remove` , the Application Load Balancer removes the `X-Forwarded-For`
       * header in the HTTP request before it sends it to targets.
       * * `routing.http2.enabled` - Indicates whether HTTP/2 is enabled. The possible values are
       * `true` and `false` . The default is `true` . Elastic Load Balancing requires that message
       * header names contain only alphanumeric characters and hyphens.
       * * `waf.fail_open.enabled` - Indicates whether to allow a WAF-enabled load balancer to route
       * requests to targets if it is unable to forward the request to AWS WAF. The possible values are
       * `true` and `false` . The default is `false` .
       *
       * The following attributes are supported by only Network Load Balancers:
       *
       * * `dns_record.client_routing_policy` - Indicates how traffic is distributed among the load
       * balancer Availability Zones. The possible values are `availability_zone_affinity` with 100
       * percent zonal affinity, `partial_availability_zone_affinity` with 85 percent zonal affinity,
       * and `any_availability_zone` with 0 percent zonal affinity.
       */
      public fun key(key: String)

      /**
       * @param value The value of the attribute.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty.builder()

      /**
       * @param key The name of the attribute.
       * The following attributes are supported by all load balancers:
       *
       * * `deletion_protection.enabled` - Indicates whether deletion protection is enabled. The
       * value is `true` or `false` . The default is `false` .
       * * `load_balancing.cross_zone.enabled` - Indicates whether cross-zone load balancing is
       * enabled. The possible values are `true` and `false` . The default for Network Load Balancers
       * and Gateway Load Balancers is `false` . The default for Application Load Balancers is `true` ,
       * and cannot be changed.
       *
       * The following attributes are supported by both Application Load Balancers and Network Load
       * Balancers:
       *
       * * `access_logs.s3.enabled` - Indicates whether access logs are enabled. The value is `true`
       * or `false` . The default is `false` .
       * * `access_logs.s3.bucket` - The name of the S3 bucket for the access logs. This attribute
       * is required if access logs are enabled. The bucket must exist in the same region as the load
       * balancer and have a bucket policy that grants Elastic Load Balancing permissions to write to
       * the bucket.
       * * `access_logs.s3.prefix` - The prefix for the location in the S3 bucket for the access
       * logs.
       * * `ipv6.deny_all_igw_traffic` - Blocks internet gateway (IGW) access to the load balancer.
       * It is set to `false` for internet-facing load balancers and `true` for internal load
       * balancers, preventing unintended access to your internal load balancer through an internet
       * gateway.
       *
       * The following attributes are supported by only Application Load Balancers:
       *
       * * `idle_timeout.timeout_seconds` - The idle timeout value, in seconds. The valid range is
       * 1-4000 seconds. The default is 60 seconds.
       * * `connection_logs.s3.enabled` - Indicates whether connection logs are enabled. The value
       * is `true` or `false` . The default is `false` .
       * * `connection_logs.s3.bucket` - The name of the S3 bucket for the connection logs. This
       * attribute is required if connection logs are enabled. The bucket must exist in the same region
       * as the load balancer and have a bucket policy that grants Elastic Load Balancing permissions
       * to write to the bucket.
       * * `connection_logs.s3.prefix` - The prefix for the location in the S3 bucket for the
       * connection logs.
       * * `routing.http.desync_mitigation_mode` - Determines how the load balancer handles requests
       * that might pose a security risk to your application. The possible values are `monitor` ,
       * `defensive` , and `strictest` . The default is `defensive` .
       * * `routing.http.drop_invalid_header_fields.enabled` - Indicates whether HTTP headers with
       * invalid header fields are removed by the load balancer ( `true` ) or routed to targets (
       * `false` ). The default is `false` .
       * * `routing.http.preserve_host_header.enabled` - Indicates whether the Application Load
       * Balancer should preserve the `Host` header in the HTTP request and send it to the target
       * without any change. The possible values are `true` and `false` . The default is `false` .
       * * `routing.http.x_amzn_tls_version_and_cipher_suite.enabled` - Indicates whether the two
       * headers ( `x-amzn-tls-version` and `x-amzn-tls-cipher-suite` ), which contain information
       * about the negotiated TLS version and cipher suite, are added to the client request before
       * sending it to the target. The `x-amzn-tls-version` header has information about the TLS
       * protocol version negotiated with the client, and the `x-amzn-tls-cipher-suite` header has
       * information about the cipher suite negotiated with the client. Both headers are in OpenSSL
       * format. The possible values for the attribute are `true` and `false` . The default is `false`
       * .
       * * `routing.http.xff_client_port.enabled` - Indicates whether the `X-Forwarded-For` header
       * should preserve the source port that the client used to connect to the load balancer. The
       * possible values are `true` and `false` . The default is `false` .
       * * `routing.http.xff_header_processing.mode` - Enables you to modify, preserve, or remove
       * the `X-Forwarded-For` header in the HTTP request before the Application Load Balancer sends
       * the request to the target. The possible values are `append` , `preserve` , and `remove` . The
       * default is `append` .
       * * If the value is `append` , the Application Load Balancer adds the client IP address (of
       * the last hop) to the `X-Forwarded-For` header in the HTTP request before it sends it to
       * targets.
       * * If the value is `preserve` the Application Load Balancer preserves the `X-Forwarded-For`
       * header in the HTTP request, and sends it to targets without any change.
       * * If the value is `remove` , the Application Load Balancer removes the `X-Forwarded-For`
       * header in the HTTP request before it sends it to targets.
       * * `routing.http2.enabled` - Indicates whether HTTP/2 is enabled. The possible values are
       * `true` and `false` . The default is `true` . Elastic Load Balancing requires that message
       * header names contain only alphanumeric characters and hyphens.
       * * `waf.fail_open.enabled` - Indicates whether to allow a WAF-enabled load balancer to route
       * requests to targets if it is unable to forward the request to AWS WAF. The possible values are
       * `true` and `false` . The default is `false` .
       *
       * The following attributes are supported by only Network Load Balancers:
       *
       * * `dns_record.client_routing_policy` - Indicates how traffic is distributed among the load
       * balancer Availability Zones. The possible values are `availability_zone_affinity` with 100
       * percent zonal affinity, `partial_availability_zone_affinity` with 85 percent zonal affinity,
       * and `any_availability_zone` with 0 percent zonal affinity.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the attribute.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty,
    ) : CdkObject(cdkObject), LoadBalancerAttributeProperty {
      /**
       * The name of the attribute.
       *
       * The following attributes are supported by all load balancers:
       *
       * * `deletion_protection.enabled` - Indicates whether deletion protection is enabled. The
       * value is `true` or `false` . The default is `false` .
       * * `load_balancing.cross_zone.enabled` - Indicates whether cross-zone load balancing is
       * enabled. The possible values are `true` and `false` . The default for Network Load Balancers
       * and Gateway Load Balancers is `false` . The default for Application Load Balancers is `true` ,
       * and cannot be changed.
       *
       * The following attributes are supported by both Application Load Balancers and Network Load
       * Balancers:
       *
       * * `access_logs.s3.enabled` - Indicates whether access logs are enabled. The value is `true`
       * or `false` . The default is `false` .
       * * `access_logs.s3.bucket` - The name of the S3 bucket for the access logs. This attribute
       * is required if access logs are enabled. The bucket must exist in the same region as the load
       * balancer and have a bucket policy that grants Elastic Load Balancing permissions to write to
       * the bucket.
       * * `access_logs.s3.prefix` - The prefix for the location in the S3 bucket for the access
       * logs.
       * * `ipv6.deny_all_igw_traffic` - Blocks internet gateway (IGW) access to the load balancer.
       * It is set to `false` for internet-facing load balancers and `true` for internal load
       * balancers, preventing unintended access to your internal load balancer through an internet
       * gateway.
       *
       * The following attributes are supported by only Application Load Balancers:
       *
       * * `idle_timeout.timeout_seconds` - The idle timeout value, in seconds. The valid range is
       * 1-4000 seconds. The default is 60 seconds.
       * * `connection_logs.s3.enabled` - Indicates whether connection logs are enabled. The value
       * is `true` or `false` . The default is `false` .
       * * `connection_logs.s3.bucket` - The name of the S3 bucket for the connection logs. This
       * attribute is required if connection logs are enabled. The bucket must exist in the same region
       * as the load balancer and have a bucket policy that grants Elastic Load Balancing permissions
       * to write to the bucket.
       * * `connection_logs.s3.prefix` - The prefix for the location in the S3 bucket for the
       * connection logs.
       * * `routing.http.desync_mitigation_mode` - Determines how the load balancer handles requests
       * that might pose a security risk to your application. The possible values are `monitor` ,
       * `defensive` , and `strictest` . The default is `defensive` .
       * * `routing.http.drop_invalid_header_fields.enabled` - Indicates whether HTTP headers with
       * invalid header fields are removed by the load balancer ( `true` ) or routed to targets (
       * `false` ). The default is `false` .
       * * `routing.http.preserve_host_header.enabled` - Indicates whether the Application Load
       * Balancer should preserve the `Host` header in the HTTP request and send it to the target
       * without any change. The possible values are `true` and `false` . The default is `false` .
       * * `routing.http.x_amzn_tls_version_and_cipher_suite.enabled` - Indicates whether the two
       * headers ( `x-amzn-tls-version` and `x-amzn-tls-cipher-suite` ), which contain information
       * about the negotiated TLS version and cipher suite, are added to the client request before
       * sending it to the target. The `x-amzn-tls-version` header has information about the TLS
       * protocol version negotiated with the client, and the `x-amzn-tls-cipher-suite` header has
       * information about the cipher suite negotiated with the client. Both headers are in OpenSSL
       * format. The possible values for the attribute are `true` and `false` . The default is `false`
       * .
       * * `routing.http.xff_client_port.enabled` - Indicates whether the `X-Forwarded-For` header
       * should preserve the source port that the client used to connect to the load balancer. The
       * possible values are `true` and `false` . The default is `false` .
       * * `routing.http.xff_header_processing.mode` - Enables you to modify, preserve, or remove
       * the `X-Forwarded-For` header in the HTTP request before the Application Load Balancer sends
       * the request to the target. The possible values are `append` , `preserve` , and `remove` . The
       * default is `append` .
       * * If the value is `append` , the Application Load Balancer adds the client IP address (of
       * the last hop) to the `X-Forwarded-For` header in the HTTP request before it sends it to
       * targets.
       * * If the value is `preserve` the Application Load Balancer preserves the `X-Forwarded-For`
       * header in the HTTP request, and sends it to targets without any change.
       * * If the value is `remove` , the Application Load Balancer removes the `X-Forwarded-For`
       * header in the HTTP request before it sends it to targets.
       * * `routing.http2.enabled` - Indicates whether HTTP/2 is enabled. The possible values are
       * `true` and `false` . The default is `true` . Elastic Load Balancing requires that message
       * header names contain only alphanumeric characters and hyphens.
       * * `waf.fail_open.enabled` - Indicates whether to allow a WAF-enabled load balancer to route
       * requests to targets if it is unable to forward the request to AWS WAF. The possible values are
       * `true` and `false` . The default is `false` .
       *
       * The following attributes are supported by only Network Load Balancers:
       *
       * * `dns_record.client_routing_policy` - Indicates how traffic is distributed among the load
       * balancer Availability Zones. The possible values are `availability_zone_affinity` with 100
       * percent zonal affinity, `partial_availability_zone_affinity` with 85 percent zonal affinity,
       * and `any_availability_zone` with 0 percent zonal affinity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattribute-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value of the attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html#cfn-elasticloadbalancingv2-loadbalancer-loadbalancerattribute-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty):
          LoadBalancerAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoadBalancerAttributeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerAttributeProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer.LoadBalancerAttributeProperty
    }
  }
}
