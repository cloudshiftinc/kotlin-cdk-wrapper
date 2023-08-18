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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.ec2.VpnTunnelOption

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * SecretValue secretValue;
 * VpnTunnelOption vpnTunnelOption = VpnTunnelOption.builder()
 * .preSharedKey("preSharedKey")
 * .preSharedKeySecret(secretValue)
 * .tunnelInsideCidr("tunnelInsideCidr")
 * .build();
 * ```
 */
@CdkDslMarker
public class VpnTunnelOptionDsl {
    private val cdkBuilder: VpnTunnelOption.Builder = VpnTunnelOption.builder()

    /**
     * @param preSharedKey The pre-shared key (PSK) to establish initial authentication between the
     *   virtual private gateway and customer gateway. Allowed characters are alphanumeric
     *   characters period `.` and underscores `_`. Must be between 8 and 64 characters in length
     *   and cannot start with zero (0).
     * @deprecated Use `preSharedKeySecret` instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun preSharedKey(preSharedKey: String) {
        cdkBuilder.preSharedKey(preSharedKey)
    }

    /**
     * @param preSharedKeySecret The pre-shared key (PSK) to establish initial authentication
     *   between the virtual private gateway and customer gateway. Allowed characters are
     *   alphanumeric characters period `.` and underscores `_`. Must be between 8 and 64 characters
     *   in length and cannot start with zero (0).
     */
    public fun preSharedKeySecret(preSharedKeySecret: SecretValue) {
        cdkBuilder.preSharedKeySecret(preSharedKeySecret)
    }

    /**
     * @param tunnelInsideCidr The range of inside IP addresses for the tunnel. Any specified CIDR
     *   blocks must be unique across all VPN connections that use the same virtual private gateway.
     *   A size /30 CIDR block from the 169.254.0.0/16 range.
     */
    public fun tunnelInsideCidr(tunnelInsideCidr: String) {
        cdkBuilder.tunnelInsideCidr(tunnelInsideCidr)
    }

    public fun build(): VpnTunnelOption = cdkBuilder.build()
}
