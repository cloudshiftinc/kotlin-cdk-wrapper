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

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistration
import software.constructs.Construct

/**
 * Registers a transit gateway in your global network.
 *
 * Not all Regions support transit gateways for global networks. For a list of the supported
 * Regions, see
 * [Region Availability](https://docs.aws.amazon.com/network-manager/latest/tgwnm/what-are-global-networks.html#nm-available-regions)
 * in the *AWS Transit Gateways for Global Networks User Guide* . The transit gateway can be in any
 * of the supported AWS Regions, but it must be owned by the same AWS account that owns the global
 * network. You cannot register a transit gateway in more than one global network.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnTransitGatewayRegistration cfnTransitGatewayRegistration =
 * CfnTransitGatewayRegistration.Builder.create(this, "MyCfnTransitGatewayRegistration")
 * .globalNetworkId("globalNetworkId")
 * .transitGatewayArn("transitGatewayArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html)
 */
@CdkDslMarker
public class CfnTransitGatewayRegistrationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransitGatewayRegistration.Builder =
        CfnTransitGatewayRegistration.Builder.create(scope, id)

    /**
     * The ID of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-globalnetworkid)
     *
     * @param globalNetworkId The ID of the global network.
     */
    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * The Amazon Resource Name (ARN) of the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html#cfn-networkmanager-transitgatewayregistration-transitgatewayarn)
     *
     * @param transitGatewayArn The Amazon Resource Name (ARN) of the transit gateway.
     */
    public fun transitGatewayArn(transitGatewayArn: String) {
        cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build(): CfnTransitGatewayRegistration = cdkBuilder.build()
}
