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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation
import software.constructs.Construct

/**
 * Enables a virtual private gateway (VGW) to propagate routes to the specified route table of a
 * VPC.
 *
 * If you reference a VPN gateway that is in the same template as your VPN gateway route
 * propagation, you must explicitly declare a dependency on the VPN gateway attachment. The
 * `AWS::EC2::VPNGatewayRoutePropagation` resource cannot use the VPN gateway until it has
 * successfully attached to the VPC. Add a
 * [DependsOn Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * in the `AWS::EC2::VPNGatewayRoutePropagation` resource to explicitly declare a dependency on the
 * VPN gateway attachment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPNGatewayRoutePropagation cfnVPNGatewayRoutePropagation =
 * CfnVPNGatewayRoutePropagation.Builder.create(this, "MyCfnVPNGatewayRoutePropagation")
 * .routeTableIds(List.of("routeTableIds"))
 * .vpnGatewayId("vpnGatewayId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html)
 */
@CdkDslMarker
public class CfnVPNGatewayRoutePropagationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPNGatewayRoutePropagation.Builder =
        CfnVPNGatewayRoutePropagation.Builder.create(scope, id)

    private val _routeTableIds: MutableList<String> = mutableListOf()

    /**
     * The ID of the route table.
     *
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-routetableids)
     *
     * @param routeTableIds The ID of the route table.
     */
    public fun routeTableIds(vararg routeTableIds: String) {
        _routeTableIds.addAll(listOf(*routeTableIds))
    }

    /**
     * The ID of the route table.
     *
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-routetableids)
     *
     * @param routeTableIds The ID of the route table.
     */
    public fun routeTableIds(routeTableIds: Collection<String>) {
        _routeTableIds.addAll(routeTableIds)
    }

    /**
     * The ID of the virtual private gateway that is attached to a VPC.
     *
     * The virtual private gateway must be attached to the same VPC that the routing tables are
     * associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-vpngatewayid)
     *
     * @param vpnGatewayId The ID of the virtual private gateway that is attached to a VPC.
     */
    public fun vpnGatewayId(vpnGatewayId: String) {
        cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): CfnVPNGatewayRoutePropagation {
        if (_routeTableIds.isNotEmpty()) cdkBuilder.routeTableIds(_routeTableIds)
        return cdkBuilder.build()
    }
}
