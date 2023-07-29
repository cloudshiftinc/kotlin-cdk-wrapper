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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ClientVpnRouteProps
import software.amazon.awscdk.services.ec2.ClientVpnRouteTarget
import software.amazon.awscdk.services.ec2.IClientVpnEndpoint

/**
 * Properties for a ClientVpnRoute.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ClientVpnEndpoint clientVpnEndpoint;
 * ClientVpnRouteTarget clientVpnRouteTarget;
 * ClientVpnRouteProps clientVpnRouteProps = ClientVpnRouteProps.builder()
 * .cidr("cidr")
 * .target(clientVpnRouteTarget)
 * // the properties below are optional
 * .clientVpnEndpoint(clientVpnEndpoint)
 * .description("description")
 * .build();
 * ```
 */
@CdkDslMarker
public class ClientVpnRoutePropsDsl {
    private val cdkBuilder: ClientVpnRouteProps.Builder = ClientVpnRouteProps.builder()

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

    /** @param clientVpnEndpoint The client VPN endpoint to which to add the route. */
    public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
        cdkBuilder.clientVpnEndpoint(clientVpnEndpoint)
    }

    /** @param description A brief description of the authorization rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param target The target for the route. */
    public fun target(target: ClientVpnRouteTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): ClientVpnRouteProps = cdkBuilder.build()
}
