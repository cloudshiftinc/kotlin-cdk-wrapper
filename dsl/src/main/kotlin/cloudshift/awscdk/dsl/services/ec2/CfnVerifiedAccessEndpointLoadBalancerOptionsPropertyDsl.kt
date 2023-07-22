@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint

/**
 * Describes the load balancer options when creating an AWS Verified Access endpoint using the
 * `load-balancer` type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * LoadBalancerOptionsProperty loadBalancerOptionsProperty = LoadBalancerOptionsProperty.builder()
 * .loadBalancerArn("loadBalancerArn")
 * .port(123)
 * .protocol("protocol")
 * .subnetIds(List.of("subnetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessendpoint-loadbalanceroptions.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl {
  private val cdkBuilder: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.Builder =
      CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.builder()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param loadBalancerArn The ARN of the load balancer.
   */
  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  /**
   * @param port The IP port number.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The IP protocol.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param subnetIds The IDs of the subnets.
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds The IDs of the subnets.
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun build(): CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
