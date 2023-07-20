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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnTransitGatewayMulticastGroupSourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransitGatewayMulticastGroupSource.Builder =
        CfnTransitGatewayMulticastGroupSource.Builder.create(scope, id)

    public fun groupIpAddress(groupIpAddress: String) {
        cdkBuilder.groupIpAddress(groupIpAddress)
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
        cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): CfnTransitGatewayMulticastGroupSource = cdkBuilder.build()
}
