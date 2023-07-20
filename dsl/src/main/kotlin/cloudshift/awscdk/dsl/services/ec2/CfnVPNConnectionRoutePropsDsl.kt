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
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps
import kotlin.String

@CdkDslMarker
public class CfnVPNConnectionRoutePropsDsl {
    private val cdkBuilder: CfnVPNConnectionRouteProps.Builder = CfnVPNConnectionRouteProps.builder()

    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    public fun vpnConnectionId(vpnConnectionId: String) {
        cdkBuilder.vpnConnectionId(vpnConnectionId)
    }

    public fun build(): CfnVPNConnectionRouteProps = cdkBuilder.build()
}
