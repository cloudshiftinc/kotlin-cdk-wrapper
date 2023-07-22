@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget
import software.constructs.Construct

@CdkDslMarker
public class CfnTrafficMirrorTargetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTrafficMirrorTarget.Builder =
      CfnTrafficMirrorTarget.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The description of the Traffic Mirror target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-description)
   * @param description The description of the Traffic Mirror target. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The ID of the Gateway Load Balancer endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-gatewayloadbalancerendpointid)
   * @param gatewayLoadBalancerEndpointId The ID of the Gateway Load Balancer endpoint. 
   */
  public fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String) {
    cdkBuilder.gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId)
  }

  /**
   * The network interface ID that is associated with the target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkinterfaceid)
   * @param networkInterfaceId The network interface ID that is associated with the target. 
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  /**
   * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkloadbalancerarn)
   * @param networkLoadBalancerArn The Amazon Resource Name (ARN) of the Network Load Balancer that
   * is associated with the target. 
   */
  public fun networkLoadBalancerArn(networkLoadBalancerArn: String) {
    cdkBuilder.networkLoadBalancerArn(networkLoadBalancerArn)
  }

  /**
   * The tags to assign to the Traffic Mirror target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-tags)
   * @param tags The tags to assign to the Traffic Mirror target. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to assign to the Traffic Mirror target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-tags)
   * @param tags The tags to assign to the Traffic Mirror target. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnTrafficMirrorTarget {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
