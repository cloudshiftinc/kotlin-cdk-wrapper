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
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps

/**
 * Properties for defining a `CfnTransitGatewayRegistration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnTransitGatewayRegistrationProps cfnTransitGatewayRegistrationProps =
 * CfnTransitGatewayRegistrationProps.builder()
 * .globalNetworkId("globalNetworkId")
 * .transitGatewayArn("transitGatewayArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayregistration.html)
 */
@CdkDslMarker
public class CfnTransitGatewayRegistrationPropsDsl {
    private val cdkBuilder: CfnTransitGatewayRegistrationProps.Builder =
        CfnTransitGatewayRegistrationProps.builder()

    /** @param globalNetworkId The ID of the global network. */
    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /** @param transitGatewayArn The Amazon Resource Name (ARN) of the transit gateway. */
    public fun transitGatewayArn(transitGatewayArn: String) {
        cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build(): CfnTransitGatewayRegistrationProps = cdkBuilder.build()
}
