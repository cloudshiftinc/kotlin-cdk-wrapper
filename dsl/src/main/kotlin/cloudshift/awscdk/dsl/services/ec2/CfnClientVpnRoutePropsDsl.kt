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
import software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps
import kotlin.String

@CdkDslMarker
public class CfnClientVpnRoutePropsDsl {
    private val cdkBuilder: CfnClientVpnRouteProps.Builder = CfnClientVpnRouteProps.builder()

    public fun clientVpnEndpointId(clientVpnEndpointId: String) {
        cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    public fun targetVpcSubnetId(targetVpcSubnetId: String) {
        cdkBuilder.targetVpcSubnetId(targetVpcSubnetId)
    }

    public fun build(): CfnClientVpnRouteProps = cdkBuilder.build()
}
