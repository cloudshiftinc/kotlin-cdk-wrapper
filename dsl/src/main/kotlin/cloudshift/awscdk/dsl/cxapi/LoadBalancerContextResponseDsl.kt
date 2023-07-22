@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cxapi.LoadBalancerContextResponse
import software.amazon.awscdk.cxapi.LoadBalancerIpAddressType

@CdkDslMarker
public class LoadBalancerContextResponseDsl {
  private val cdkBuilder: LoadBalancerContextResponse.Builder =
      LoadBalancerContextResponse.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  /**
   * @param ipAddressType Type of IP address. 
   */
  public fun ipAddressType(ipAddressType: LoadBalancerIpAddressType) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  /**
   * @param loadBalancerArn The ARN of the load balancer. 
   */
  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  /**
   * @param loadBalancerCanonicalHostedZoneId The hosted zone ID of the load balancer's name. 
   */
  public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
    cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
  }

  /**
   * @param loadBalancerDnsName Load balancer's DNS name. 
   */
  public fun loadBalancerDnsName(loadBalancerDnsName: String) {
    cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
  }

  /**
   * @param securityGroupIds Load balancer's security groups. 
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds Load balancer's security groups. 
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param vpcId Load balancer's VPC. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): LoadBalancerContextResponse {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    return cdkBuilder.build()
  }
}
