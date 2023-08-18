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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

/**
 * Describes an explanation code for an unreachable path.
 *
 * For more information, see
 * [Reachability Analyzer explanation codes](https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ExplanationProperty explanationProperty = ExplanationProperty.builder()
 * .acl(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .aclRule(AnalysisAclRuleProperty.builder()
 * .cidr("cidr")
 * .egress(false)
 * .portRange(PortRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .protocol("protocol")
 * .ruleAction("ruleAction")
 * .ruleNumber(123)
 * .build())
 * .address("address")
 * .addresses(List.of("addresses"))
 * .attachedTo(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .availabilityZones(List.of("availabilityZones"))
 * .cidrs(List.of("cidrs"))
 * .classicLoadBalancerListener(AnalysisLoadBalancerListenerProperty.builder()
 * .instancePort(123)
 * .loadBalancerPort(123)
 * .build())
 * .component(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .componentAccount("componentAccount")
 * .componentRegion("componentRegion")
 * .customerGateway(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .destination(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .destinationVpc(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .direction("direction")
 * .elasticLoadBalancerListener(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .explanationCode("explanationCode")
 * .ingressRouteTable(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .internetGateway(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .loadBalancerArn("loadBalancerArn")
 * .loadBalancerListenerPort(123)
 * .loadBalancerTarget(AnalysisLoadBalancerTargetProperty.builder()
 * .address("address")
 * .availabilityZone("availabilityZone")
 * .instance(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .port(123)
 * .build())
 * .loadBalancerTargetGroup(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .loadBalancerTargetGroups(List.of(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build()))
 * .loadBalancerTargetPort(123)
 * .missingComponent("missingComponent")
 * .natGateway(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .networkInterface(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .packetField("packetField")
 * .port(123)
 * .portRanges(List.of(PortRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build()))
 * .prefixList(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .protocols(List.of("protocols"))
 * .routeTable(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .routeTableRoute(AnalysisRouteTableRouteProperty.builder()
 * .destinationCidr("destinationCidr")
 * .destinationPrefixListId("destinationPrefixListId")
 * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
 * .gatewayId("gatewayId")
 * .instanceId("instanceId")
 * .natGatewayId("natGatewayId")
 * .networkInterfaceId("networkInterfaceId")
 * .origin("origin")
 * .state("state")
 * .transitGatewayId("transitGatewayId")
 * .vpcPeeringConnectionId("vpcPeeringConnectionId")
 * .build())
 * .securityGroup(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .securityGroupRule(AnalysisSecurityGroupRuleProperty.builder()
 * .cidr("cidr")
 * .direction("direction")
 * .portRange(PortRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .prefixListId("prefixListId")
 * .protocol("protocol")
 * .securityGroupId("securityGroupId")
 * .build())
 * .securityGroups(List.of(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build()))
 * .sourceVpc(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .state("state")
 * .subnet(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .subnetRouteTable(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .transitGateway(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .transitGatewayAttachment(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .transitGatewayRouteTable(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .transitGatewayRouteTableRoute(TransitGatewayRouteTableRouteProperty.builder()
 * .attachmentId("attachmentId")
 * .destinationCidr("destinationCidr")
 * .prefixListId("prefixListId")
 * .resourceId("resourceId")
 * .resourceType("resourceType")
 * .routeOrigin("routeOrigin")
 * .state("state")
 * .build())
 * .vpc(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .vpcEndpoint(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .vpcPeeringConnection(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .vpnConnection(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .vpnGateway(AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-explanation.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAnalysisExplanationPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.ExplanationProperty.Builder =
        CfnNetworkInsightsAnalysis.ExplanationProperty.builder()

    private val _addresses: MutableList<String> = mutableListOf()

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _cidrs: MutableList<String> = mutableListOf()

    private val _loadBalancerTargetGroups: MutableList<Any> = mutableListOf()

    private val _portRanges: MutableList<Any> = mutableListOf()

    private val _protocols: MutableList<String> = mutableListOf()

    private val _securityGroups: MutableList<Any> = mutableListOf()

    /** @param acl The network ACL. */
    public fun acl(acl: IResolvable) {
        cdkBuilder.acl(acl)
    }

    /** @param acl The network ACL. */
    public fun acl(acl: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.acl(acl)
    }

    /** @param aclRule The network ACL rule. */
    public fun aclRule(aclRule: IResolvable) {
        cdkBuilder.aclRule(aclRule)
    }

    /** @param aclRule The network ACL rule. */
    public fun aclRule(aclRule: CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty) {
        cdkBuilder.aclRule(aclRule)
    }

    /** @param address The IPv4 address, in CIDR notation. */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /** @param addresses The IPv4 addresses, in CIDR notation. */
    public fun addresses(vararg addresses: String) {
        _addresses.addAll(listOf(*addresses))
    }

    /** @param addresses The IPv4 addresses, in CIDR notation. */
    public fun addresses(addresses: Collection<String>) {
        _addresses.addAll(addresses)
    }

    /** @param attachedTo The resource to which the component is attached. */
    public fun attachedTo(attachedTo: IResolvable) {
        cdkBuilder.attachedTo(attachedTo)
    }

    /** @param attachedTo The resource to which the component is attached. */
    public fun attachedTo(attachedTo: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.attachedTo(attachedTo)
    }

    /** @param availabilityZones The Availability Zones. */
    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    /** @param availabilityZones The Availability Zones. */
    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    /** @param cidrs The CIDR ranges. */
    public fun cidrs(vararg cidrs: String) {
        _cidrs.addAll(listOf(*cidrs))
    }

    /** @param cidrs The CIDR ranges. */
    public fun cidrs(cidrs: Collection<String>) {
        _cidrs.addAll(cidrs)
    }

    /** @param classicLoadBalancerListener The listener for a Classic Load Balancer. */
    public fun classicLoadBalancerListener(classicLoadBalancerListener: IResolvable) {
        cdkBuilder.classicLoadBalancerListener(classicLoadBalancerListener)
    }

    /** @param classicLoadBalancerListener The listener for a Classic Load Balancer. */
    public fun classicLoadBalancerListener(
        classicLoadBalancerListener: CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty
    ) {
        cdkBuilder.classicLoadBalancerListener(classicLoadBalancerListener)
    }

    /** @param component The component. */
    public fun component(component: IResolvable) {
        cdkBuilder.component(component)
    }

    /** @param component The component. */
    public fun component(component: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.component(component)
    }

    /** @param componentAccount The AWS account for the component. */
    public fun componentAccount(componentAccount: String) {
        cdkBuilder.componentAccount(componentAccount)
    }

    /** @param componentRegion The Region for the component. */
    public fun componentRegion(componentRegion: String) {
        cdkBuilder.componentRegion(componentRegion)
    }

    /** @param customerGateway The customer gateway. */
    public fun customerGateway(customerGateway: IResolvable) {
        cdkBuilder.customerGateway(customerGateway)
    }

    /** @param customerGateway The customer gateway. */
    public fun customerGateway(
        customerGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.customerGateway(customerGateway)
    }

    /** @param destination The destination. */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /** @param destination The destination. */
    public fun destination(destination: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.destination(destination)
    }

    /** @param destinationVpc The destination VPC. */
    public fun destinationVpc(destinationVpc: IResolvable) {
        cdkBuilder.destinationVpc(destinationVpc)
    }

    /** @param destinationVpc The destination VPC. */
    public fun destinationVpc(
        destinationVpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.destinationVpc(destinationVpc)
    }

    /**
     * @param direction The direction. The following are the possible values:.
     * * egress
     * * ingress
     */
    public fun direction(direction: String) {
        cdkBuilder.direction(direction)
    }

    /** @param elasticLoadBalancerListener The load balancer listener. */
    public fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener)
    }

    /** @param elasticLoadBalancerListener The load balancer listener. */
    public fun elasticLoadBalancerListener(
        elasticLoadBalancerListener: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener)
    }

    /** @param explanationCode The explanation code. */
    public fun explanationCode(explanationCode: String) {
        cdkBuilder.explanationCode(explanationCode)
    }

    /** @param ingressRouteTable The route table. */
    public fun ingressRouteTable(ingressRouteTable: IResolvable) {
        cdkBuilder.ingressRouteTable(ingressRouteTable)
    }

    /** @param ingressRouteTable The route table. */
    public fun ingressRouteTable(
        ingressRouteTable: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.ingressRouteTable(ingressRouteTable)
    }

    /** @param internetGateway The internet gateway. */
    public fun internetGateway(internetGateway: IResolvable) {
        cdkBuilder.internetGateway(internetGateway)
    }

    /** @param internetGateway The internet gateway. */
    public fun internetGateway(
        internetGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.internetGateway(internetGateway)
    }

    /** @param loadBalancerArn The Amazon Resource Name (ARN) of the load balancer. */
    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    /** @param loadBalancerListenerPort The listener port of the load balancer. */
    public fun loadBalancerListenerPort(loadBalancerListenerPort: Number) {
        cdkBuilder.loadBalancerListenerPort(loadBalancerListenerPort)
    }

    /** @param loadBalancerTarget The target. */
    public fun loadBalancerTarget(loadBalancerTarget: IResolvable) {
        cdkBuilder.loadBalancerTarget(loadBalancerTarget)
    }

    /** @param loadBalancerTarget The target. */
    public fun loadBalancerTarget(
        loadBalancerTarget: CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty
    ) {
        cdkBuilder.loadBalancerTarget(loadBalancerTarget)
    }

    /** @param loadBalancerTargetGroup The target group. */
    public fun loadBalancerTargetGroup(loadBalancerTargetGroup: IResolvable) {
        cdkBuilder.loadBalancerTargetGroup(loadBalancerTargetGroup)
    }

    /** @param loadBalancerTargetGroup The target group. */
    public fun loadBalancerTargetGroup(
        loadBalancerTargetGroup: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.loadBalancerTargetGroup(loadBalancerTargetGroup)
    }

    /** @param loadBalancerTargetGroups The target groups. */
    public fun loadBalancerTargetGroups(vararg loadBalancerTargetGroups: Any) {
        _loadBalancerTargetGroups.addAll(listOf(*loadBalancerTargetGroups))
    }

    /** @param loadBalancerTargetGroups The target groups. */
    public fun loadBalancerTargetGroups(loadBalancerTargetGroups: Collection<Any>) {
        _loadBalancerTargetGroups.addAll(loadBalancerTargetGroups)
    }

    /** @param loadBalancerTargetGroups The target groups. */
    public fun loadBalancerTargetGroups(loadBalancerTargetGroups: IResolvable) {
        cdkBuilder.loadBalancerTargetGroups(loadBalancerTargetGroups)
    }

    /** @param loadBalancerTargetPort The target port. */
    public fun loadBalancerTargetPort(loadBalancerTargetPort: Number) {
        cdkBuilder.loadBalancerTargetPort(loadBalancerTargetPort)
    }

    /** @param missingComponent The missing component. */
    public fun missingComponent(missingComponent: String) {
        cdkBuilder.missingComponent(missingComponent)
    }

    /** @param natGateway The NAT gateway. */
    public fun natGateway(natGateway: IResolvable) {
        cdkBuilder.natGateway(natGateway)
    }

    /** @param natGateway The NAT gateway. */
    public fun natGateway(natGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.natGateway(natGateway)
    }

    /** @param networkInterface The network interface. */
    public fun networkInterface(networkInterface: IResolvable) {
        cdkBuilder.networkInterface(networkInterface)
    }

    /** @param networkInterface The network interface. */
    public fun networkInterface(
        networkInterface: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.networkInterface(networkInterface)
    }

    /** @param packetField The packet field. */
    public fun packetField(packetField: String) {
        cdkBuilder.packetField(packetField)
    }

    /** @param port The port. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param portRanges The port ranges. */
    public fun portRanges(vararg portRanges: Any) {
        _portRanges.addAll(listOf(*portRanges))
    }

    /** @param portRanges The port ranges. */
    public fun portRanges(portRanges: Collection<Any>) {
        _portRanges.addAll(portRanges)
    }

    /** @param portRanges The port ranges. */
    public fun portRanges(portRanges: IResolvable) {
        cdkBuilder.portRanges(portRanges)
    }

    /** @param prefixList The prefix list. */
    public fun prefixList(prefixList: IResolvable) {
        cdkBuilder.prefixList(prefixList)
    }

    /** @param prefixList The prefix list. */
    public fun prefixList(prefixList: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.prefixList(prefixList)
    }

    /** @param protocols The protocols. */
    public fun protocols(vararg protocols: String) {
        _protocols.addAll(listOf(*protocols))
    }

    /** @param protocols The protocols. */
    public fun protocols(protocols: Collection<String>) {
        _protocols.addAll(protocols)
    }

    /** @param routeTable The route table. */
    public fun routeTable(routeTable: IResolvable) {
        cdkBuilder.routeTable(routeTable)
    }

    /** @param routeTable The route table. */
    public fun routeTable(routeTable: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.routeTable(routeTable)
    }

    /** @param routeTableRoute The route table route. */
    public fun routeTableRoute(routeTableRoute: IResolvable) {
        cdkBuilder.routeTableRoute(routeTableRoute)
    }

    /** @param routeTableRoute The route table route. */
    public fun routeTableRoute(
        routeTableRoute: CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty
    ) {
        cdkBuilder.routeTableRoute(routeTableRoute)
    }

    /** @param securityGroup The security group. */
    public fun securityGroup(securityGroup: IResolvable) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /** @param securityGroup The security group. */
    public fun securityGroup(securityGroup: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /** @param securityGroupRule The security group rule. */
    public fun securityGroupRule(securityGroupRule: IResolvable) {
        cdkBuilder.securityGroupRule(securityGroupRule)
    }

    /** @param securityGroupRule The security group rule. */
    public fun securityGroupRule(
        securityGroupRule: CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty
    ) {
        cdkBuilder.securityGroupRule(securityGroupRule)
    }

    /** @param securityGroups The security groups. */
    public fun securityGroups(vararg securityGroups: Any) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups The security groups. */
    public fun securityGroups(securityGroups: Collection<Any>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param securityGroups The security groups. */
    public fun securityGroups(securityGroups: IResolvable) {
        cdkBuilder.securityGroups(securityGroups)
    }

    /** @param sourceVpc The source VPC. */
    public fun sourceVpc(sourceVpc: IResolvable) {
        cdkBuilder.sourceVpc(sourceVpc)
    }

    /** @param sourceVpc The source VPC. */
    public fun sourceVpc(sourceVpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.sourceVpc(sourceVpc)
    }

    /** @param state The state. */
    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    /** @param subnet The subnet. */
    public fun subnet(subnet: IResolvable) {
        cdkBuilder.subnet(subnet)
    }

    /** @param subnet The subnet. */
    public fun subnet(subnet: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.subnet(subnet)
    }

    /** @param subnetRouteTable The route table for the subnet. */
    public fun subnetRouteTable(subnetRouteTable: IResolvable) {
        cdkBuilder.subnetRouteTable(subnetRouteTable)
    }

    /** @param subnetRouteTable The route table for the subnet. */
    public fun subnetRouteTable(
        subnetRouteTable: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.subnetRouteTable(subnetRouteTable)
    }

    /** @param transitGateway The transit gateway. */
    public fun transitGateway(transitGateway: IResolvable) {
        cdkBuilder.transitGateway(transitGateway)
    }

    /** @param transitGateway The transit gateway. */
    public fun transitGateway(
        transitGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.transitGateway(transitGateway)
    }

    /** @param transitGatewayAttachment The transit gateway attachment. */
    public fun transitGatewayAttachment(transitGatewayAttachment: IResolvable) {
        cdkBuilder.transitGatewayAttachment(transitGatewayAttachment)
    }

    /** @param transitGatewayAttachment The transit gateway attachment. */
    public fun transitGatewayAttachment(
        transitGatewayAttachment: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.transitGatewayAttachment(transitGatewayAttachment)
    }

    /** @param transitGatewayRouteTable The transit gateway route table. */
    public fun transitGatewayRouteTable(transitGatewayRouteTable: IResolvable) {
        cdkBuilder.transitGatewayRouteTable(transitGatewayRouteTable)
    }

    /** @param transitGatewayRouteTable The transit gateway route table. */
    public fun transitGatewayRouteTable(
        transitGatewayRouteTable: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.transitGatewayRouteTable(transitGatewayRouteTable)
    }

    /** @param transitGatewayRouteTableRoute The transit gateway route table route. */
    public fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute)
    }

    /** @param transitGatewayRouteTableRoute The transit gateway route table route. */
    public fun transitGatewayRouteTableRoute(
        transitGatewayRouteTableRoute:
            CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty
    ) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute)
    }

    /** @param vpc The component VPC. */
    public fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpc The component VPC. */
    public fun vpc(vpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcEndpoint The VPC endpoint. */
    public fun vpcEndpoint(vpcEndpoint: IResolvable) {
        cdkBuilder.vpcEndpoint(vpcEndpoint)
    }

    /** @param vpcEndpoint The VPC endpoint. */
    public fun vpcEndpoint(vpcEndpoint: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.vpcEndpoint(vpcEndpoint)
    }

    /** @param vpcPeeringConnection The VPC peering connection. */
    public fun vpcPeeringConnection(vpcPeeringConnection: IResolvable) {
        cdkBuilder.vpcPeeringConnection(vpcPeeringConnection)
    }

    /** @param vpcPeeringConnection The VPC peering connection. */
    public fun vpcPeeringConnection(
        vpcPeeringConnection: CfnNetworkInsightsAnalysis.AnalysisComponentProperty
    ) {
        cdkBuilder.vpcPeeringConnection(vpcPeeringConnection)
    }

    /** @param vpnConnection The VPN connection. */
    public fun vpnConnection(vpnConnection: IResolvable) {
        cdkBuilder.vpnConnection(vpnConnection)
    }

    /** @param vpnConnection The VPN connection. */
    public fun vpnConnection(vpnConnection: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.vpnConnection(vpnConnection)
    }

    /** @param vpnGateway The VPN gateway. */
    public fun vpnGateway(vpnGateway: IResolvable) {
        cdkBuilder.vpnGateway(vpnGateway)
    }

    /** @param vpnGateway The VPN gateway. */
    public fun vpnGateway(vpnGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.vpnGateway(vpnGateway)
    }

    public fun build(): CfnNetworkInsightsAnalysis.ExplanationProperty {
        if (_addresses.isNotEmpty()) cdkBuilder.addresses(_addresses)
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_cidrs.isNotEmpty()) cdkBuilder.cidrs(_cidrs)
        if (_loadBalancerTargetGroups.isNotEmpty())
            cdkBuilder.loadBalancerTargetGroups(_loadBalancerTargetGroups)
        if (_portRanges.isNotEmpty()) cdkBuilder.portRanges(_portRanges)
        if (_protocols.isNotEmpty()) cdkBuilder.protocols(_protocols)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
