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
import kotlin.String
import software.amazon.awscdk.services.ec2.ClientVpnRouteOptions
import software.amazon.awscdk.services.ec2.ClientVpnRouteTarget

/**
 * Options for a ClientVpnRoute.
 *
 * Example:
 * ```
 * ClientVpnEndpoint endpoint = vpc.addClientVpnEndpoint("Endpoint",
 * ClientVpnEndpointOptions.builder()
 * .cidr("10.100.0.0/16")
 * .serverCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/server-certificate-id")
 * .userBasedAuthentication(ClientVpnUserBasedAuthentication.federated(samlProvider))
 * .build());
 * // Client-to-client access
 * endpoint.addRoute("Route", ClientVpnRouteOptions.builder()
 * .cidr("10.100.0.0/16")
 * .target(ClientVpnRouteTarget.local())
 * .build());
 * ```
 */
@CdkDslMarker
public class ClientVpnRouteOptionsDsl {
    private val cdkBuilder: ClientVpnRouteOptions.Builder = ClientVpnRouteOptions.builder()

    /**
     * @param cidr The IPv4 address range, in CIDR notation, of the route destination. For example:
     * * To add a route for Internet access, enter 0.0.0.0/0
     * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4
     *   CIDR range
     * * To add a route for the local network, enter the client CIDR range
     */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /** @param description A brief description of the authorization rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param target The target for the route. */
    public fun target(target: ClientVpnRouteTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): ClientVpnRouteOptions = cdkBuilder.build()
}
