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
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnVPNConnectionRouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPNConnectionRoute.Builder =
        CfnVPNConnectionRoute.Builder.create(scope, id)

    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    public fun vpnConnectionId(vpnConnectionId: String) {
        cdkBuilder.vpnConnectionId(vpnConnectionId)
    }

    public fun build(): CfnVPNConnectionRoute = cdkBuilder.build()
}
