@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps

/**
 * Properties for defining a `CfnLoadBalancer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * CfnLoadBalancerProps cfnLoadBalancerProps = CfnLoadBalancerProps.builder()
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
@CdkDslMarker
public class CfnLoadBalancerPropsDsl {
    private val cdkBuilder: CfnLoadBalancerProps.Builder = CfnLoadBalancerProps.builder()

    private val _loadBalancerAttributes: MutableList<Any> = mutableListOf()

    private val _securityGroups: MutableList<String> = mutableListOf()

    private val _subnetMappings: MutableList<Any> = mutableListOf()

    private val _subnets: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param ipAddressType The IP address type. The possible values are `ipv4` (for IPv4 addresses)
     *   and `dualstack` (for IPv4 and IPv6 addresses). You can’t specify `dualstack` for a load
     *   balancer with a UDP or TCP_UDP listener.
     */
    public fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    /** @param loadBalancerAttributes The load balancer attributes. */
    public fun loadBalancerAttributes(vararg loadBalancerAttributes: Any) {
        _loadBalancerAttributes.addAll(listOf(*loadBalancerAttributes))
    }

    /** @param loadBalancerAttributes The load balancer attributes. */
    public fun loadBalancerAttributes(loadBalancerAttributes: Collection<Any>) {
        _loadBalancerAttributes.addAll(loadBalancerAttributes)
    }

    /** @param loadBalancerAttributes The load balancer attributes. */
    public fun loadBalancerAttributes(loadBalancerAttributes: IResolvable) {
        cdkBuilder.loadBalancerAttributes(loadBalancerAttributes)
    }

    /**
     * @param name The name of the load balancer. This name must be unique per region per account,
     *   can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens,
     *   must not begin or end with a hyphen, and must not begin with "internal-".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the load
     * balancer. If you specify a name, you cannot perform updates that require replacement of this
     * resource, but you can perform other updates. To replace the resource, specify a new name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param scheme The nodes of an Internet-facing load balancer have public IP addresses. The DNS
     *   name of an Internet-facing load balancer is publicly resolvable to the public IP addresses
     *   of the nodes. Therefore, Internet-facing load balancers can route requests from clients
     *   over the internet.
     *
     * The nodes of an internal load balancer have only private IP addresses. The DNS name of an
     * internal load balancer is publicly resolvable to the private IP addresses of the nodes.
     * Therefore, internal load balancers can route requests only from clients with access to the
     * VPC for the load balancer.
     *
     * The default is an Internet-facing load balancer.
     *
     * You cannot specify a scheme for a Gateway Load Balancer.
     */
    public fun scheme(scheme: String) {
        cdkBuilder.scheme(scheme)
    }

    /**
     * @param securityGroups [Application Load Balancers] The IDs of the security groups for the
     *   load balancer.
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups [Application Load Balancers] The IDs of the security groups for the
     *   load balancer.
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param subnetMappings The IDs of the public subnets. You can specify only one subnet per
     *   Availability Zone. You must specify either subnets or subnet mappings, but not both.
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
     * address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you
     * can specify one IPv6 address per subnet.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
     * cannot specify Elastic IP addresses for your subnets.
     */
    public fun subnetMappings(vararg subnetMappings: Any) {
        _subnetMappings.addAll(listOf(*subnetMappings))
    }

    /**
     * @param subnetMappings The IDs of the public subnets. You can specify only one subnet per
     *   Availability Zone. You must specify either subnets or subnet mappings, but not both.
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
     * address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you
     * can specify one IPv6 address per subnet.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
     * cannot specify Elastic IP addresses for your subnets.
     */
    public fun subnetMappings(subnetMappings: Collection<Any>) {
        _subnetMappings.addAll(subnetMappings)
    }

    /**
     * @param subnetMappings The IDs of the public subnets. You can specify only one subnet per
     *   Availability Zone. You must specify either subnets or subnet mappings, but not both.
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
     * address per subnet from the IPv4 range of the subnet. For internet-facing load balancer, you
     * can specify one IPv6 address per subnet.
     *
     * [Gateway Load Balancers] You can specify subnets from one or more Availability Zones. You
     * cannot specify Elastic IP addresses for your subnets.
     */
    public fun subnetMappings(subnetMappings: IResolvable) {
        cdkBuilder.subnetMappings(subnetMappings)
    }

    /**
     * @param subnets The IDs of the public subnets. You can specify only one subnet per
     *   Availability Zone. You must specify either subnets or subnet mappings, but not both. To
     *   specify an Elastic IP address, specify subnet mappings instead of subnets.
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
    public fun subnets(vararg subnets: String) {
        _subnets.addAll(listOf(*subnets))
    }

    /**
     * @param subnets The IDs of the public subnets. You can specify only one subnet per
     *   Availability Zone. You must specify either subnets or subnet mappings, but not both. To
     *   specify an Elastic IP address, specify subnet mappings instead of subnets.
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
    public fun subnets(subnets: Collection<String>) {
        _subnets.addAll(subnets)
    }

    /** @param tags The tags to assign to the load balancer. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to assign to the load balancer. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param type The type of load balancer. The default is `application` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLoadBalancerProps {
        if (_loadBalancerAttributes.isNotEmpty())
            cdkBuilder.loadBalancerAttributes(_loadBalancerAttributes)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_subnetMappings.isNotEmpty()) cdkBuilder.subnetMappings(_subnetMappings)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
