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
import software.amazon.awscdk.services.ec2.VpnConnectionAttributes

/**
 * Attributes of an imported VpnConnection.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * VpnConnectionAttributes vpnConnectionAttributes = VpnConnectionAttributes.builder()
 * .customerGatewayAsn(123)
 * .customerGatewayId("customerGatewayId")
 * .customerGatewayIp("customerGatewayIp")
 * .vpnId("vpnId")
 * .build();
 * ```
 */
@CdkDslMarker
public class VpnConnectionAttributesDsl {
    private val cdkBuilder: VpnConnectionAttributes.Builder = VpnConnectionAttributes.builder()

    /** @param customerGatewayAsn The ASN of the customer gateway. */
    public fun customerGatewayAsn(customerGatewayAsn: Number) {
        cdkBuilder.customerGatewayAsn(customerGatewayAsn)
    }

    /** @param customerGatewayId The id of the customer gateway. */
    public fun customerGatewayId(customerGatewayId: String) {
        cdkBuilder.customerGatewayId(customerGatewayId)
    }

    /** @param customerGatewayIp The ip address of the customer gateway. */
    public fun customerGatewayIp(customerGatewayIp: String) {
        cdkBuilder.customerGatewayIp(customerGatewayIp)
    }

    /** @param vpnId The id of the VPN connection. */
    public fun vpnId(vpnId: String) {
        cdkBuilder.vpnId(vpnId)
    }

    public fun build(): VpnConnectionAttributes = cdkBuilder.build()
}
