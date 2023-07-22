@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@CdkDslMarker
public class CfnNetworkInsightsAnalysisPathComponentPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.PathComponentProperty.Builder =
      CfnNetworkInsightsAnalysis.PathComponentProperty.builder()

  private val _additionalDetails: MutableList<Any> = mutableListOf()

  private val _explanations: MutableList<Any> = mutableListOf()

  /**
   * @param aclRule The network ACL rule.
   */
  public fun aclRule(aclRule: IResolvable) {
    cdkBuilder.aclRule(aclRule)
  }

  /**
   * @param aclRule The network ACL rule.
   */
  public fun aclRule(aclRule: CfnNetworkInsightsAnalysis.AnalysisAclRuleProperty) {
    cdkBuilder.aclRule(aclRule)
  }

  /**
   * @param additionalDetails The additional details.
   */
  public fun additionalDetails(vararg additionalDetails: Any) {
    _additionalDetails.addAll(listOf(*additionalDetails))
  }

  /**
   * @param additionalDetails The additional details.
   */
  public fun additionalDetails(additionalDetails: Collection<Any>) {
    _additionalDetails.addAll(additionalDetails)
  }

  /**
   * @param additionalDetails The additional details.
   */
  public fun additionalDetails(additionalDetails: IResolvable) {
    cdkBuilder.additionalDetails(additionalDetails)
  }

  /**
   * @param component The component.
   */
  public fun component(component: IResolvable) {
    cdkBuilder.component(component)
  }

  /**
   * @param component The component.
   */
  public fun component(component: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
    cdkBuilder.component(component)
  }

  /**
   * @param destinationVpc The destination VPC.
   */
  public fun destinationVpc(destinationVpc: IResolvable) {
    cdkBuilder.destinationVpc(destinationVpc)
  }

  /**
   * @param destinationVpc The destination VPC.
   */
  public fun destinationVpc(destinationVpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
    cdkBuilder.destinationVpc(destinationVpc)
  }

  /**
   * @param elasticLoadBalancerListener The load balancer listener.
   */
  public fun elasticLoadBalancerListener(elasticLoadBalancerListener: IResolvable) {
    cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener)
  }

  /**
   * @param elasticLoadBalancerListener The load balancer listener.
   */
  public
      fun elasticLoadBalancerListener(elasticLoadBalancerListener: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
    cdkBuilder.elasticLoadBalancerListener(elasticLoadBalancerListener)
  }

  /**
   * @param explanations The explanation codes.
   */
  public fun explanations(vararg explanations: Any) {
    _explanations.addAll(listOf(*explanations))
  }

  /**
   * @param explanations The explanation codes.
   */
  public fun explanations(explanations: Collection<Any>) {
    _explanations.addAll(explanations)
  }

  /**
   * @param explanations The explanation codes.
   */
  public fun explanations(explanations: IResolvable) {
    cdkBuilder.explanations(explanations)
  }

  /**
   * @param inboundHeader The inbound header.
   */
  public fun inboundHeader(inboundHeader: IResolvable) {
    cdkBuilder.inboundHeader(inboundHeader)
  }

  /**
   * @param inboundHeader The inbound header.
   */
  public fun inboundHeader(inboundHeader: CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty) {
    cdkBuilder.inboundHeader(inboundHeader)
  }

  /**
   * @param outboundHeader The outbound header.
   */
  public fun outboundHeader(outboundHeader: IResolvable) {
    cdkBuilder.outboundHeader(outboundHeader)
  }

  /**
   * @param outboundHeader The outbound header.
   */
  public
      fun outboundHeader(outboundHeader: CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty) {
    cdkBuilder.outboundHeader(outboundHeader)
  }

  /**
   * @param routeTableRoute The route table route.
   */
  public fun routeTableRoute(routeTableRoute: IResolvable) {
    cdkBuilder.routeTableRoute(routeTableRoute)
  }

  /**
   * @param routeTableRoute The route table route.
   */
  public
      fun routeTableRoute(routeTableRoute: CfnNetworkInsightsAnalysis.AnalysisRouteTableRouteProperty) {
    cdkBuilder.routeTableRoute(routeTableRoute)
  }

  /**
   * @param securityGroupRule The security group rule.
   */
  public fun securityGroupRule(securityGroupRule: IResolvable) {
    cdkBuilder.securityGroupRule(securityGroupRule)
  }

  /**
   * @param securityGroupRule The security group rule.
   */
  public
      fun securityGroupRule(securityGroupRule: CfnNetworkInsightsAnalysis.AnalysisSecurityGroupRuleProperty) {
    cdkBuilder.securityGroupRule(securityGroupRule)
  }

  /**
   * @param sequenceNumber The sequence number.
   */
  public fun sequenceNumber(sequenceNumber: Number) {
    cdkBuilder.sequenceNumber(sequenceNumber)
  }

  /**
   * @param serviceName The name of the VPC endpoint service.
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  /**
   * @param sourceVpc The source VPC.
   */
  public fun sourceVpc(sourceVpc: IResolvable) {
    cdkBuilder.sourceVpc(sourceVpc)
  }

  /**
   * @param sourceVpc The source VPC.
   */
  public fun sourceVpc(sourceVpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
    cdkBuilder.sourceVpc(sourceVpc)
  }

  /**
   * @param subnet The subnet.
   */
  public fun subnet(subnet: IResolvable) {
    cdkBuilder.subnet(subnet)
  }

  /**
   * @param subnet The subnet.
   */
  public fun subnet(subnet: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
    cdkBuilder.subnet(subnet)
  }

  /**
   * @param transitGateway The transit gateway.
   */
  public fun transitGateway(transitGateway: IResolvable) {
    cdkBuilder.transitGateway(transitGateway)
  }

  /**
   * @param transitGateway The transit gateway.
   */
  public fun transitGateway(transitGateway: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
    cdkBuilder.transitGateway(transitGateway)
  }

  /**
   * @param transitGatewayRouteTableRoute The route in a transit gateway route table.
   */
  public fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: IResolvable) {
    cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute)
  }

  /**
   * @param transitGatewayRouteTableRoute The route in a transit gateway route table.
   */
  public
      fun transitGatewayRouteTableRoute(transitGatewayRouteTableRoute: CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty) {
    cdkBuilder.transitGatewayRouteTableRoute(transitGatewayRouteTableRoute)
  }

  /**
   * @param vpc The component VPC.
   */
  public fun vpc(vpc: IResolvable) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * @param vpc The component VPC.
   */
  public fun vpc(vpc: CfnNetworkInsightsAnalysis.AnalysisComponentProperty) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): CfnNetworkInsightsAnalysis.PathComponentProperty {
    if(_additionalDetails.isNotEmpty()) cdkBuilder.additionalDetails(_additionalDetails)
    if(_explanations.isNotEmpty()) cdkBuilder.explanations(_explanations)
    return cdkBuilder.build()
  }
}
