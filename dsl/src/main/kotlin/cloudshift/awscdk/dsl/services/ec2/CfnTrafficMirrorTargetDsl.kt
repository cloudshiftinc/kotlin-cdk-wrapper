@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

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

/**
 * Specifies a target for your Traffic Mirror session.
 *
 * A Traffic Mirror target is the destination for mirrored traffic. The Traffic Mirror source and
 * the Traffic Mirror target (monitoring appliances) can be in the same VPC, or in different VPCs
 * connected via VPC peering or a transit gateway.
 *
 * A Traffic Mirror target can be a network interface, a Network Load Balancer, or a Gateway Load
 * Balancer endpoint.
 *
 * To use the target in a Traffic Mirror session, use
 * [AWS::EC2::TrafficMirrorSession](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTrafficMirrorTarget cfnTrafficMirrorTarget = CfnTrafficMirrorTarget.Builder.create(this,
 * "MyCfnTrafficMirrorTarget")
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
     *
     * @param description The description of the Traffic Mirror target.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ID of the Gateway Load Balancer endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-gatewayloadbalancerendpointid)
     *
     * @param gatewayLoadBalancerEndpointId The ID of the Gateway Load Balancer endpoint.
     */
    public fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String) {
        cdkBuilder.gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId)
    }

    /**
     * The network interface ID that is associated with the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkinterfaceid)
     *
     * @param networkInterfaceId The network interface ID that is associated with the target.
     */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the
     * target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-networkloadbalancerarn)
     *
     * @param networkLoadBalancerArn The Amazon Resource Name (ARN) of the Network Load Balancer
     *   that is associated with the target.
     */
    public fun networkLoadBalancerArn(networkLoadBalancerArn: String) {
        cdkBuilder.networkLoadBalancerArn(networkLoadBalancerArn)
    }

    /**
     * The tags to assign to the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-tags)
     *
     * @param tags The tags to assign to the Traffic Mirror target.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to the Traffic Mirror target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrortarget.html#cfn-ec2-trafficmirrortarget-tags)
     *
     * @param tags The tags to assign to the Traffic Mirror target.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrafficMirrorTarget {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
