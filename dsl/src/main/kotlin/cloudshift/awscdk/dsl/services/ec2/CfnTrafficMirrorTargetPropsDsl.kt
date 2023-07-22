@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps

/**
 * Properties for defining a `CfnTrafficMirrorTarget`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTrafficMirrorTargetProps cfnTrafficMirrorTargetProps = CfnTrafficMirrorTargetProps.builder()
 * .description("description")
 * .gatewayLoadBalancerEndpointId("gatewayLoadBalancerEndpointId")
 * .networkInterfaceId("networkInterfaceId")
 * .networkLoadBalancerArn("networkLoadBalancerArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html)
 */
@CdkDslMarker
public class CfnTrafficMirrorTargetPropsDsl {
  private val cdkBuilder: CfnTrafficMirrorTargetProps.Builder =
      CfnTrafficMirrorTargetProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The description of the Traffic Mirror target.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param gatewayLoadBalancerEndpointId The ID of the Gateway Load Balancer endpoint.
   */
  public fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String) {
    cdkBuilder.gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId)
  }

  /**
   * @param networkInterfaceId The network interface ID that is associated with the target.
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  /**
   * @param networkLoadBalancerArn The Amazon Resource Name (ARN) of the Network Load Balancer that
   * is associated with the target.
   */
  public fun networkLoadBalancerArn(networkLoadBalancerArn: String) {
    cdkBuilder.networkLoadBalancerArn(networkLoadBalancerArn)
  }

  /**
   * @param tags The tags to assign to the Traffic Mirror target.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to assign to the Traffic Mirror target.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnTrafficMirrorTargetProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
