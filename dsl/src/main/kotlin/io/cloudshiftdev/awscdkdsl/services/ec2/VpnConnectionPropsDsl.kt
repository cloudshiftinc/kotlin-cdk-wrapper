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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.VpnConnectionProps
import software.amazon.awscdk.services.ec2.VpnTunnelOption

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * SecretValue secretValue;
 * Vpc vpc;
 * VpnConnectionProps vpnConnectionProps = VpnConnectionProps.builder()
 * .ip("ip")
 * .vpc(vpc)
 * // the properties below are optional
 * .asn(123)
 * .staticRoutes(List.of("staticRoutes"))
 * .tunnelOptions(List.of(VpnTunnelOption.builder()
 * .preSharedKey("preSharedKey")
 * .preSharedKeySecret(secretValue)
 * .tunnelInsideCidr("tunnelInsideCidr")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class VpnConnectionPropsDsl {
    private val cdkBuilder: VpnConnectionProps.Builder = VpnConnectionProps.builder()

    private val _staticRoutes: MutableList<String> = mutableListOf()

    private val _tunnelOptions: MutableList<VpnTunnelOption> = mutableListOf()

    /** @param asn The ASN of the customer gateway. */
    public fun asn(asn: Number) {
        cdkBuilder.asn(asn)
    }

    /** @param ip The ip address of the customer gateway. */
    public fun ip(ip: String) {
        cdkBuilder.ip(ip)
    }

    /**
     * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
     *   gateway.
     */
    public fun staticRoutes(vararg staticRoutes: String) {
        _staticRoutes.addAll(listOf(*staticRoutes))
    }

    /**
     * @param staticRoutes The static routes to be routed from the VPN gateway to the customer
     *   gateway.
     */
    public fun staticRoutes(staticRoutes: Collection<String>) {
        _staticRoutes.addAll(staticRoutes)
    }

    /**
     * @param tunnelOptions The tunnel options for the VPN connection. At most two elements (one per
     *   tunnel). Duplicates not allowed.
     */
    public fun tunnelOptions(tunnelOptions: VpnTunnelOptionDsl.() -> Unit) {
        _tunnelOptions.add(VpnTunnelOptionDsl().apply(tunnelOptions).build())
    }

    /**
     * @param tunnelOptions The tunnel options for the VPN connection. At most two elements (one per
     *   tunnel). Duplicates not allowed.
     */
    public fun tunnelOptions(tunnelOptions: Collection<VpnTunnelOption>) {
        _tunnelOptions.addAll(tunnelOptions)
    }

    /** @param vpc The VPC to connect to. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): VpnConnectionProps {
        if (_staticRoutes.isNotEmpty()) cdkBuilder.staticRoutes(_staticRoutes)
        if (_tunnelOptions.isNotEmpty()) cdkBuilder.tunnelOptions(_tunnelOptions)
        return cdkBuilder.build()
    }
}
