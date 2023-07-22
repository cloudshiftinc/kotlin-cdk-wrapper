@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes

@CdkDslMarker
public class NetworkLoadBalancerAttributesDsl {
  private val cdkBuilder: NetworkLoadBalancerAttributes.Builder =
      NetworkLoadBalancerAttributes.builder()

  /**
   * @param loadBalancerArn ARN of the load balancer. 
   */
  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  /**
   * @param loadBalancerCanonicalHostedZoneId The canonical hosted zone ID of this load balancer.
   */
  public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
    cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
  }

  /**
   * @param loadBalancerDnsName The DNS name of this load balancer.
   */
  public fun loadBalancerDnsName(loadBalancerDnsName: String) {
    cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
  }

  /**
   * @param vpc The VPC to associate with the load balancer.
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): NetworkLoadBalancerAttributes = cdkBuilder.build()
}
