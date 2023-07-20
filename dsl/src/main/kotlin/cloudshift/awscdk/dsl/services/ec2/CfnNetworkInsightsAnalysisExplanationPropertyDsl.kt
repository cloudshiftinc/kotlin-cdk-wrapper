@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

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

    public fun acl(acl: IResolvable) {
        cdkBuilder.acl(acl)
    }

    public fun acl(acl: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.acl(acl)
    }

    public fun aclRule(aclRule: IResolvable) {
        cdkBuilder.aclRule(aclRule)
    }

    public fun aclRule(aclRule: CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty) {
        cdkBuilder.aclRule(aclRule)
    }

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun addresses(vararg addresses: String) {
        _addresses.addAll(listOf(*addresses))
    }

    public fun addresses(addresses: Collection<String>) {
        _addresses.addAll(addresses)
    }

    public fun attachedTo(attachedTo: IResolvable) {
        cdkBuilder.attachedTo(attachedTo)
    }

    public fun attachedTo(attachedTo: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.attachedTo(attachedTo)
    }

    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    public fun cidrs(vararg cidrs: String) {
        _cidrs.addAll(listOf(*cidrs))
    }

    public fun cidrs(cidrs: Collection<String>) {
        _cidrs.addAll(cidrs)
    }

    public fun classicLoadBalancerListener(classicLoadBalancerListener: IResolvable) {
        cdkBuilder.classicLoadBalancerListener(classicLoadBalancerListener)
    }

    public fun classicLoadBalancerListener(classicLoadBalancerListener: CfnNetworkInsightsAnalysis.AnalysisLoadBalancerListenerProperty) {
        cdkBuilder.classicLoadBalancerListener(classicLoadBalancerListener)
    }

    public fun component(component: IResolvable) {
        cdkBuilder.component(component)
    }

    public fun component(component: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.component(component)
    }

    public fun componentAccount(componentAccount: String) {
        cdkBuilder.componentAccount(componentAccount)
    }

    public fun componentRegion(componentRegion: String) {
        cdkBuilder.componentRegion(componentRegion)
    }

    public fun customerGateway(customerGateway: IResolvable) {
        cdkBuilder.customerGateway(customerGateway)
    }

    public fun customerGateway(customerGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.customerGateway(customerGateway)
    }

    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    public fun destination(destination: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.destination(destination)
    }

    public fun destinationVpc(destinationVpc: IResolvable) {
        cdkBuilder.destinationVpc(destinationVpc)
    }

    public fun destinationVpc(destinationVpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.destinationVpc(destinationVpc)
    }

    public fun direction(direction: String) {
        cdkBuilder.direction(direction)
    }

    public fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener)
    }

    public fun elasticLoadBalancerListener(elasticLoadBalancerListener: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener)
    }

    public fun explanationCode(explanationCode: String) {
        cdkBuilder.explanationCode(explanationCode)
    }

    public fun ingressRouteTable(ingressRouteTable: IResolvable) {
        cdkBuilder.ingressRouteTable(ingressRouteTable)
    }

    public fun ingressRouteTable(ingressRouteTable: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.ingressRouteTable(ingressRouteTable)
    }

    public fun internetGateway(internetGateway: IResolvable) {
        cdkBuilder.internetGateway(internetGateway)
    }

    public fun internetGateway(internetGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.internetGateway(internetGateway)
    }

    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public fun loadBalancerListenerPort(loadBalancerListenerPort: Number) {
        cdkBuilder.loadBalancerListenerPort(loadBalancerListenerPort)
    }

    public fun loadBalancerTarget(loadBalancerTarget: IResolvable) {
        cdkBuilder.loadBalancerTarget(loadBalancerTarget)
    }

    public fun loadBalancerTarget(loadBalancerTarget: CfnNetworkInsightsAnalysis.AnalysisLoadBalancerTargetProperty) {
        cdkBuilder.loadBalancerTarget(loadBalancerTarget)
    }

    public fun loadBalancerTargetGroup(loadBalancerTargetGroup: IResolvable) {
        cdkBuilder.loadBalancerTargetGroup(loadBalancerTargetGroup)
    }

    public fun loadBalancerTargetGroup(loadBalancerTargetGroup: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.loadBalancerTargetGroup(loadBalancerTargetGroup)
    }

    public fun loadBalancerTargetGroups(vararg loadBalancerTargetGroups: Any) {
        _loadBalancerTargetGroups.addAll(listOf(*loadBalancerTargetGroups))
    }

    public fun loadBalancerTargetGroups(loadBalancerTargetGroups: Collection<Any>) {
        _loadBalancerTargetGroups.addAll(loadBalancerTargetGroups)
    }

    public fun loadBalancerTargetGroups(loadBalancerTargetGroups: IResolvable) {
        cdkBuilder.loadBalancerTargetGroups(loadBalancerTargetGroups)
    }

    public fun loadBalancerTargetPort(loadBalancerTargetPort: Number) {
        cdkBuilder.loadBalancerTargetPort(loadBalancerTargetPort)
    }

    public fun missingComponent(missingComponent: String) {
        cdkBuilder.missingComponent(missingComponent)
    }

    public fun natGateway(natGateway: IResolvable) {
        cdkBuilder.natGateway(natGateway)
    }

    public fun natGateway(natGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.natGateway(natGateway)
    }

    public fun networkInterface(networkInterface: IResolvable) {
        cdkBuilder.networkInterface(networkInterface)
    }

    public fun networkInterface(networkInterface: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.networkInterface(networkInterface)
    }

    public fun packetField(packetField: String) {
        cdkBuilder.packetField(packetField)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun portRanges(vararg portRanges: Any) {
        _portRanges.addAll(listOf(*portRanges))
    }

    public fun portRanges(portRanges: Collection<Any>) {
        _portRanges.addAll(portRanges)
    }

    public fun portRanges(portRanges: IResolvable) {
        cdkBuilder.portRanges(portRanges)
    }

    public fun prefixList(prefixList: IResolvable) {
        cdkBuilder.prefixList(prefixList)
    }

    public fun prefixList(prefixList: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.prefixList(prefixList)
    }

    public fun protocols(vararg protocols: String) {
        _protocols.addAll(listOf(*protocols))
    }

    public fun protocols(protocols: Collection<String>) {
        _protocols.addAll(protocols)
    }

    public fun routeTable(routeTable: IResolvable) {
        cdkBuilder.routeTable(routeTable)
    }

    public fun routeTable(routeTable: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.routeTable(routeTable)
    }

    public fun routeTableRoute(routeTableRoute: IResolvable) {
        cdkBuilder.routeTableRoute(routeTableRoute)
    }

    public fun routeTableRoute(routeTableRoute: CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty) {
        cdkBuilder.routeTableRoute(routeTableRoute)
    }

    public fun securityGroup(securityGroup: IResolvable) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun securityGroup(securityGroup: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun securityGroupRule(securityGroupRule: IResolvable) {
        cdkBuilder.securityGroupRule(securityGroupRule)
    }

    public fun securityGroupRule(securityGroupRule: CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty) {
        cdkBuilder.securityGroupRule(securityGroupRule)
    }

    public fun securityGroups(vararg securityGroups: Any) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<Any>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun securityGroups(securityGroups: IResolvable) {
        cdkBuilder.securityGroups(securityGroups)
    }

    public fun sourceVpc(sourceVpc: IResolvable) {
        cdkBuilder.sourceVpc(sourceVpc)
    }

    public fun sourceVpc(sourceVpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.sourceVpc(sourceVpc)
    }

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun subnet(subnet: IResolvable) {
        cdkBuilder.subnet(subnet)
    }

    public fun subnet(subnet: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.subnet(subnet)
    }

    public fun subnetRouteTable(subnetRouteTable: IResolvable) {
        cdkBuilder.subnetRouteTable(subnetRouteTable)
    }

    public fun subnetRouteTable(subnetRouteTable: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.subnetRouteTable(subnetRouteTable)
    }

    public fun transitGateway(transitGateway: IResolvable) {
        cdkBuilder.transitGateway(transitGateway)
    }

    public fun transitGateway(transitGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.transitGateway(transitGateway)
    }

    public fun transitGatewayAttachment(transitGatewayAttachment: IResolvable) {
        cdkBuilder.transitGatewayAttachment(transitGatewayAttachment)
    }

    public fun transitGatewayAttachment(transitGatewayAttachment: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.transitGatewayAttachment(transitGatewayAttachment)
    }

    public fun transitGatewayRouteTable(transitGatewayRouteTable: IResolvable) {
        cdkBuilder.transitGatewayRouteTable(transitGatewayRouteTable)
    }

    public fun transitGatewayRouteTable(transitGatewayRouteTable: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.transitGatewayRouteTable(transitGatewayRouteTable)
    }

    public fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute)
    }

    public fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty) {
        cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute)
    }

    public fun vpc(vpc: IResolvable) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpc(vpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpcEndpoint(vpcEndpoint: IResolvable) {
        cdkBuilder.vpcEndpoint(vpcEndpoint)
    }

    public fun vpcEndpoint(vpcEndpoint: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.vpcEndpoint(vpcEndpoint)
    }

    public fun vpcPeeringConnection(vpcPeeringConnection: IResolvable) {
        cdkBuilder.vpcPeeringConnection(vpcPeeringConnection)
    }

    public fun vpcPeeringConnection(vpcPeeringConnection: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.vpcPeeringConnection(vpcPeeringConnection)
    }

    public fun vpnConnection(vpnConnection: IResolvable) {
        cdkBuilder.vpnConnection(vpnConnection)
    }

    public fun vpnConnection(vpnConnection: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.vpnConnection(vpnConnection)
    }

    public fun vpnGateway(vpnGateway: IResolvable) {
        cdkBuilder.vpnGateway(vpnGateway)
    }

    public fun vpnGateway(vpnGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.vpnGateway(vpnGateway)
    }

    public fun build(): CfnNetworkInsightsAnalysis.ExplanationProperty {
        if (_addresses.isNotEmpty()) cdkBuilder.addresses(_addresses)
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_cidrs.isNotEmpty()) cdkBuilder.cidrs(_cidrs)
        if (_loadBalancerTargetGroups.isNotEmpty()) {
            cdkBuilder.loadBalancerTargetGroups(_loadBalancerTargetGroups)
        }
        if (_portRanges.isNotEmpty()) cdkBuilder.portRanges(_portRanges)
        if (_protocols.isNotEmpty()) cdkBuilder.protocols(_protocols)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
