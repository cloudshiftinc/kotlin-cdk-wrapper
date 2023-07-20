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
public class CfnNetworkInsightsAnalysisPathComponentPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.PathComponentProperty.Builder =
        CfnNetworkInsightsAnalysis.PathComponentProperty.builder()

    private val _additionalDetails: MutableList<Any> = mutableListOf()

    private val _explanations: MutableList<Any> = mutableListOf()

    public fun aclRule(aclRule: IResolvable) {
        cdkBuilder.aclRule(aclRule)
    }

    public fun aclRule(aclRule: CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty) {
        cdkBuilder.aclRule(aclRule)
    }

    public fun additionalDetails(vararg additionalDetails: Any) {
        _additionalDetails.addAll(listOf(*additionalDetails))
    }

    public fun additionalDetails(additionalDetails: Collection<Any>) {
        _additionalDetails.addAll(additionalDetails)
    }

    public fun additionalDetails(additionalDetails: IResolvable) {
        cdkBuilder.additionalDetails(additionalDetails)
    }

    public fun component(component: IResolvable) {
        cdkBuilder.component(component)
    }

    public fun component(component: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.component(component)
    }

    public fun destinationVpc(destinationVpc: IResolvable) {
        cdkBuilder.destinationVpc(destinationVpc)
    }

    public fun destinationVpc(destinationVpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.destinationVpc(destinationVpc)
    }

    public fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener)
    }

    public fun elasticLoadBalancerListener(elasticLoadBalancerListener: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener)
    }

    public fun explanations(vararg explanations: Any) {
        _explanations.addAll(listOf(*explanations))
    }

    public fun explanations(explanations: Collection<Any>) {
        _explanations.addAll(explanations)
    }

    public fun explanations(explanations: IResolvable) {
        cdkBuilder.explanations(explanations)
    }

    public fun inboundHeader(inboundHeader: IResolvable) {
        cdkBuilder.inboundHeader(inboundHeader)
    }

    public fun inboundHeader(inboundHeader: CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty) {
        cdkBuilder.inboundHeader(inboundHeader)
    }

    public fun outboundHeader(outboundHeader: IResolvable) {
        cdkBuilder.outboundHeader(outboundHeader)
    }

    public fun outboundHeader(outboundHeader: CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty) {
        cdkBuilder.outboundHeader(outboundHeader)
    }

    public fun routeTableRoute(routeTableRoute: IResolvable) {
        cdkBuilder.routeTableRoute(routeTableRoute)
    }

    public fun routeTableRoute(routeTableRoute: CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty) {
        cdkBuilder.routeTableRoute(routeTableRoute)
    }

    public fun securityGroupRule(securityGroupRule: IResolvable) {
        cdkBuilder.securityGroupRule(securityGroupRule)
    }

    public fun securityGroupRule(securityGroupRule: CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty) {
        cdkBuilder.securityGroupRule(securityGroupRule)
    }

    public fun sequenceNumber(sequenceNumber: Number) {
        cdkBuilder.sequenceNumber(sequenceNumber)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun sourceVpc(sourceVpc: IResolvable) {
        cdkBuilder.sourceVpc(sourceVpc)
    }

    public fun sourceVpc(sourceVpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.sourceVpc(sourceVpc)
    }

    public fun subnet(subnet: IResolvable) {
        cdkBuilder.subnet(subnet)
    }

    public fun subnet(subnet: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.subnet(subnet)
    }

    public fun transitGateway(transitGateway: IResolvable) {
        cdkBuilder.transitGateway(transitGateway)
    }

    public fun transitGateway(transitGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
        cdkBuilder.transitGateway(transitGateway)
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

    public fun build(): CfnNetworkInsightsAnalysis.PathComponentProperty {
        if (_additionalDetails.isNotEmpty()) cdkBuilder.additionalDetails(_additionalDetails)
        if (_explanations.isNotEmpty()) cdkBuilder.explanations(_explanations)
        return cdkBuilder.build()
    }
}
