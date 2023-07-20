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
import software.amazon.awscdk.services.ec2.ClientVpnRouteOptions
import software.amazon.awscdk.services.ec2.ClientVpnRouteTarget
import kotlin.String

@CdkDslMarker
public class ClientVpnRouteOptionsDsl {
    private val cdkBuilder: ClientVpnRouteOptions.Builder = ClientVpnRouteOptions.builder()

    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun target(target: ClientVpnRouteTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): ClientVpnRouteOptions = cdkBuilder.build()
}
