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
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.ec2.VpnTunnelOption
import kotlin.Deprecated
import kotlin.String

@CdkDslMarker
public class VpnTunnelOptionDsl {
    private val cdkBuilder: VpnTunnelOption.Builder = VpnTunnelOption.builder()

    @Deprecated(message = "deprecated in CDK")
    public fun preSharedKey(preSharedKey: String) {
        cdkBuilder.preSharedKey(preSharedKey)
    }

    public fun preSharedKeySecret(preSharedKeySecret: SecretValue) {
        cdkBuilder.preSharedKeySecret(preSharedKeySecret)
    }

    public fun tunnelInsideCidr(tunnelInsideCidr: String) {
        cdkBuilder.tunnelInsideCidr(tunnelInsideCidr)
    }

    public fun build(): VpnTunnelOption = cdkBuilder.build()
}
