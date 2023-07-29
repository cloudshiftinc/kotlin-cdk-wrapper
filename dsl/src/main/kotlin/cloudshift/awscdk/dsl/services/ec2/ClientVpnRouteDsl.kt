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
import software.amazon.awscdk.services.ec2.ClientVpnRoute
import software.amazon.awscdk.services.ec2.ClientVpnRouteTarget
import software.amazon.awscdk.services.ec2.IClientVpnEndpoint
import software.constructs.Construct

/**
 * A client VPN route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ClientVpnEndpoint clientVpnEndpoint;
 * ClientVpnRouteTarget clientVpnRouteTarget;
 * ClientVpnRoute clientVpnRoute = ClientVpnRoute.Builder.create(this, "MyClientVpnRoute")
 * .cidr("cidr")
 * .target(clientVpnRouteTarget)
 * // the properties below are optional
 * .clientVpnEndpoint(clientVpnEndpoint)
 * .description("description")
 * .build();
 * ```
 */
@CdkDslMarker
public class ClientVpnRouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ClientVpnRoute.Builder = ClientVpnRoute.Builder.create(scope, id)

    /**
     * The IPv4 address range, in CIDR notation, of the route destination.
     *
     * For example:
     * * To add a route for Internet access, enter 0.0.0.0/0
     * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4
     *   CIDR range
     * * To add a route for the local network, enter the client CIDR range
     *
     * @param cidr The IPv4 address range, in CIDR notation, of the route destination.
     */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /**
     * The client VPN endpoint to which to add the route.
     *
     * Default: clientVpnEndpoint is required
     *
     * @param clientVpnEndpoint The client VPN endpoint to which to add the route.
     */
    public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
        cdkBuilder.clientVpnEndpoint(clientVpnEndpoint)
    }

    /**
     * A brief description of the authorization rule.
     *
     * Default: - no description
     *
     * @param description A brief description of the authorization rule.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The target for the route.
     *
     * @param target The target for the route.
     */
    public fun target(target: ClientVpnRouteTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): ClientVpnRoute = cdkBuilder.build()
}
