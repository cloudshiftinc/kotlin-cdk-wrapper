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
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute
import software.constructs.Construct

/**
 * Specifies a static route for a VPN connection between an existing virtual private gateway and a
 * VPN customer gateway.
 *
 * The static route allows traffic to be routed from the virtual private gateway to the VPN customer
 * gateway.
 *
 * For more information, see
 * [AWS Site-to-Site VPN](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) in the *AWS
 * Site-to-Site VPN User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPNConnectionRoute cfnVPNConnectionRoute = CfnVPNConnectionRoute.Builder.create(this,
 * "MyCfnVPNConnectionRoute")
 * .destinationCidrBlock("destinationCidrBlock")
 * .vpnConnectionId("vpnConnectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html)
 */
@CdkDslMarker
public class CfnVPNConnectionRouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPNConnectionRoute.Builder =
        CfnVPNConnectionRoute.Builder.create(scope, id)

    /**
     * The CIDR block associated with the local subnet of the customer network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html#cfn-ec2-vpnconnectionroute-destinationcidrblock)
     *
     * @param destinationCidrBlock The CIDR block associated with the local subnet of the customer
     *   network.
     */
    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * The ID of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html#cfn-ec2-vpnconnectionroute-vpnconnectionid)
     *
     * @param vpnConnectionId The ID of the VPN connection.
     */
    public fun vpnConnectionId(vpnConnectionId: String) {
        cdkBuilder.vpnConnectionId(vpnConnectionId)
    }

    public fun build(): CfnVPNConnectionRoute = cdkBuilder.build()
}
