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
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute
import software.constructs.Construct

/**
 * Creates a static route for the specified local gateway route table. You must specify one of the
 * following targets:.
 * * `LocalGatewayVirtualInterfaceGroupId`
 * * `NetworkInterfaceId`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnLocalGatewayRoute cfnLocalGatewayRoute = CfnLocalGatewayRoute.Builder.create(this,
 * "MyCfnLocalGatewayRoute")
 * .destinationCidrBlock("destinationCidrBlock")
 * .localGatewayRouteTableId("localGatewayRouteTableId")
 * // the properties below are optional
 * .localGatewayVirtualInterfaceGroupId("localGatewayVirtualInterfaceGroupId")
 * .networkInterfaceId("networkInterfaceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html)
 */
@CdkDslMarker
public class CfnLocalGatewayRouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocalGatewayRoute.Builder =
        CfnLocalGatewayRoute.Builder.create(scope, id)

    /**
     * The CIDR block used for destination matches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-destinationcidrblock)
     *
     * @param destinationCidrBlock The CIDR block used for destination matches.
     */
    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * The ID of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayroutetableid)
     *
     * @param localGatewayRouteTableId The ID of the local gateway route table.
     */
    public fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
        cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    /**
     * The ID of the virtual interface group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayvirtualinterfacegroupid)
     *
     * @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group.
     */
    public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
        cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
    }

    /**
     * The ID of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-networkinterfaceid)
     *
     * @param networkInterfaceId The ID of the network interface.
     */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): CfnLocalGatewayRoute = cdkBuilder.build()
}
