@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps

@CdkDslMarker
public class CfnVPCEndpointServicePropsDsl {
  private val cdkBuilder: CfnVPCEndpointServiceProps.Builder = CfnVPCEndpointServiceProps.builder()

  private val _gatewayLoadBalancerArns: MutableList<String> = mutableListOf()

  private val _networkLoadBalancerArns: MutableList<String> = mutableListOf()

  /**
   * @param acceptanceRequired Indicates whether requests from service consumers to create an
   * endpoint to your service must be accepted.
   */
  public fun acceptanceRequired(acceptanceRequired: Boolean) {
    cdkBuilder.acceptanceRequired(acceptanceRequired)
  }

  /**
   * @param acceptanceRequired Indicates whether requests from service consumers to create an
   * endpoint to your service must be accepted.
   */
  public fun acceptanceRequired(acceptanceRequired: IResolvable) {
    cdkBuilder.acceptanceRequired(acceptanceRequired)
  }

  /**
   * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor Insights
   * rules provided by AWS PrivateLink .
   */
  public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
    cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
  }

  /**
   * @param contributorInsightsEnabled Indicates whether to enable the built-in Contributor Insights
   * rules provided by AWS PrivateLink .
   */
  public fun contributorInsightsEnabled(contributorInsightsEnabled: IResolvable) {
    cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
  }

  /**
   * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
   */
  public fun gatewayLoadBalancerArns(vararg gatewayLoadBalancerArns: String) {
    _gatewayLoadBalancerArns.addAll(listOf(*gatewayLoadBalancerArns))
  }

  /**
   * @param gatewayLoadBalancerArns The Amazon Resource Names (ARNs) of the Gateway Load Balancers.
   */
  public fun gatewayLoadBalancerArns(gatewayLoadBalancerArns: Collection<String>) {
    _gatewayLoadBalancerArns.addAll(gatewayLoadBalancerArns)
  }

  /**
   * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load Balancers.
   */
  public fun networkLoadBalancerArns(vararg networkLoadBalancerArns: String) {
    _networkLoadBalancerArns.addAll(listOf(*networkLoadBalancerArns))
  }

  /**
   * @param networkLoadBalancerArns The Amazon Resource Names (ARNs) of the Network Load Balancers.
   */
  public fun networkLoadBalancerArns(networkLoadBalancerArns: Collection<String>) {
    _networkLoadBalancerArns.addAll(networkLoadBalancerArns)
  }

  /**
   * @param payerResponsibility The entity that is responsible for the endpoint costs.
   * The default is the endpoint owner. If you set the payer responsibility to the service owner,
   * you cannot set it back to the endpoint owner.
   */
  public fun payerResponsibility(payerResponsibility: String) {
    cdkBuilder.payerResponsibility(payerResponsibility)
  }

  public fun build(): CfnVPCEndpointServiceProps {
    if(_gatewayLoadBalancerArns.isNotEmpty())
        cdkBuilder.gatewayLoadBalancerArns(_gatewayLoadBalancerArns)
    if(_networkLoadBalancerArns.isNotEmpty())
        cdkBuilder.networkLoadBalancerArns(_networkLoadBalancerArns)
    return cdkBuilder.build()
  }
}
