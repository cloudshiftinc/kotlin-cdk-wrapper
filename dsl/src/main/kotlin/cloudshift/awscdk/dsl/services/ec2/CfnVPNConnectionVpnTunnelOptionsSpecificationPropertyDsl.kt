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
import software.amazon.awscdk.services.ec2.CfnVPNConnection
import kotlin.String

@CdkDslMarker
public class CfnVPNConnectionVpnTunnelOptionsSpecificationPropertyDsl {
    private val cdkBuilder: CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.Builder =
        CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.builder()

    public fun preSharedKey(preSharedKey: String) {
        cdkBuilder.preSharedKey(preSharedKey)
    }

    public fun tunnelInsideCidr(tunnelInsideCidr: String) {
        cdkBuilder.tunnelInsideCidr(tunnelInsideCidr)
    }

    public fun build(): CfnVPNConnection.VpnTunnelOptionsSpecificationProperty = cdkBuilder.build()
}
