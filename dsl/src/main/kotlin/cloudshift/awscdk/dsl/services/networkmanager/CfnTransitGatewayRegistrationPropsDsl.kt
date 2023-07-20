@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRegistrationProps
import kotlin.String

@CdkDslMarker
public class CfnTransitGatewayRegistrationPropsDsl {
    private val cdkBuilder: CfnTransitGatewayRegistrationProps.Builder =
        CfnTransitGatewayRegistrationProps.builder()

    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    public fun transitGatewayArn(transitGatewayArn: String) {
        cdkBuilder.transitGatewayArn(transitGatewayArn)
    }

    public fun build(): CfnTransitGatewayRegistrationProps = cdkBuilder.build()
}
