@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPCEndpointService
import software.constructs.Construct

/**
 * Creates a VPC endpoint service configuration to which service consumers ( AWS accounts, users,
 * and IAM roles) can connect.
 *
 * To create an endpoint service configuration, you must first create one of the following for your
 * service:
 *
 * * A [Network Load
 * Balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/introduction.html) .
 * Service consumers connect to your service using an interface endpoint.
 * * A [Gateway Load
 * Balancer](https://docs.aws.amazon.com/elasticloadbalancing/latest/gateway/introduction.html) .
 * Service consumers connect to your service using a Gateway Load Balancer endpoint.
 *
 * For more information, see the [AWS PrivateLink User
 * Guide](https://docs.aws.amazon.com/vpc/latest/privatelink/) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPCEndpointService cfnVPCEndpointService = CfnVPCEndpointService.Builder.create(this,
 * "MyCfnVPCEndpointService")
 * .acceptanceRequired(false)
 * .contributorInsightsEnabled(false)
 * .gatewayLoadBalancerArns(List.of("gatewayLoadBalancerArns"))
 * .networkLoadBalancerArns(List.of("networkLoadBalancerArns"))
 * .payerResponsibility("payerResponsibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html)
 */
@CdkDslMarker
public class CfnVPCEndpointServiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVPCEndpointService.Builder =
      CfnVPCEndpointService.Builder.create(scope, id)

  private val _gatewayLoadBalancerArns: MutableList<String> = mutableListOf()

  private val _networkLoadBalancerArns: MutableList<String> = mutableListOf()

  /**
   * Indicates whether requests from service consumers to create an endpoint to your service must be
   * accepted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired)
   * @param acceptanceRequired Indicates whether requests from service consumers to create an
   * endpoint to your service must be accepted. 
   */
  public fun acceptanceRequired(acceptanceRequired: Boolean) {
    cdkBuilder.acceptanceRequired(acceptanceRequired)
  }

  /**
   * Indicates whether requests from service consumers to create an endpoint to your service must be
   * accepted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-acceptancerequired)
   * @param acceptanceRequired Indicates whether requests from service consumers to create an
   * endpoint to your service must be accepted. 
   */
  public fun acceptanceRequired(acceptanceRequired: IResolvable) {
    cdkBuilder.acceptanceRequired(acceptanceRequired)
  }

  /**
   * Indicates whether to enable the built-in Contributor Insights rules provided by AWS PrivateLink
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-contributorinsightsenabled)
   * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor Insights
   * rules provided by AWS PrivateLink . 
   */
  public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
    cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
  }

  /**
   * Indicates whether to enable the built-in Contributor Insights rules provided by AWS PrivateLink
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-contributorinsightsenabled)
   * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor Insights
   * rules provided by AWS PrivateLink . 
   */
  public fun contributorInsightsEnabled(contributorInsightsEnabled: IResolvable) {
    cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
  }

  /**
   * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-gatewayloadbalancerarns)
   * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load Balancers. 
   */
  public fun gatewayLoadBalancerArns(vararg gatewayLoadBalancerArns: String) {
    _gatewayLoadBalancerArns.addAll(listOf(*gatewayLoadBalancerArns))
  }

  /**
   * The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-gatewayloadbalancerarns)
   * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load Balancers. 
   */
  public fun gatewayLoadBalancerArns(gatewayLoadBalancerArns: Collection<String>) {
    _gatewayLoadBalancerArns.addAll(gatewayLoadBalancerArns)
  }

  /**
   * The Amazon Resource Names (ARNs) of the Network Load Balancers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns)
   * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load Balancers. 
   */
  public fun networkLoadBalancerArns(vararg networkLoadBalancerArns: String) {
    _networkLoadBalancerArns.addAll(listOf(*networkLoadBalancerArns))
  }

  /**
   * The Amazon Resource Names (ARNs) of the Network Load Balancers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-networkloadbalancerarns)
   * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load Balancers. 
   */
  public fun networkLoadBalancerArns(networkLoadBalancerArns: Collection<String>) {
    _networkLoadBalancerArns.addAll(networkLoadBalancerArns)
  }

  /**
   * The entity that is responsible for the endpoint costs.
   *
   * The default is the endpoint owner. If you set the payer responsibility to the service owner,
   * you cannot set it back to the endpoint owner.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservice.html#cfn-ec2-vpcendpointservice-payerresponsibility)
   * @param payerResponsibility The entity that is responsible for the endpoint costs. 
   */
  public fun payerResponsibility(payerResponsibility: String) {
    cdkBuilder.payerResponsibility(payerResponsibility)
  }

  public fun build(): CfnVPCEndpointService {
    if(_gatewayLoadBalancerArns.isNotEmpty())
        cdkBuilder.gatewayLoadBalancerArns(_gatewayLoadBalancerArns)
    if(_networkLoadBalancerArns.isNotEmpty())
        cdkBuilder.networkLoadBalancerArns(_networkLoadBalancerArns)
    return cdkBuilder.build()
  }
}
