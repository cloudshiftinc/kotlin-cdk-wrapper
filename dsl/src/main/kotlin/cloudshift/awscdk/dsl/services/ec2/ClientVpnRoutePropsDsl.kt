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
import software.amazon.awscdk.services.ec2.ClientVpnRouteProps
import software.amazon.awscdk.services.ec2.ClientVpnRouteTarget
import software.amazon.awscdk.services.ec2.IClientVpnEndpoint
import kotlin.String

@CdkDslMarker
public class ClientVpnRoutePropsDsl {
    private val cdkBuilder: ClientVpnRouteProps.Builder = ClientVpnRouteProps.builder()

    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
        cdkBuilder.clientVpnEndpoint(clientVpnEndpoint)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun target(target: ClientVpnRouteTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): ClientVpnRouteProps = cdkBuilder.build()
}
