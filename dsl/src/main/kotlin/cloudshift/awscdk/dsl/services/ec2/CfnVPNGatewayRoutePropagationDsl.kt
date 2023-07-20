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
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVPNGatewayRoutePropagationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPNGatewayRoutePropagation.Builder =
        CfnVPNGatewayRoutePropagation.Builder.create(scope, id)

    private val _routeTableIds: MutableList<String> = mutableListOf()

    public fun routeTableIds(vararg routeTableIds: String) {
        _routeTableIds.addAll(listOf(*routeTableIds))
    }

    public fun routeTableIds(routeTableIds: Collection<String>) {
        _routeTableIds.addAll(routeTableIds)
    }

    public fun vpnGatewayId(vpnGatewayId: String) {
        cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): CfnVPNGatewayRoutePropagation {
        if (_routeTableIds.isNotEmpty()) cdkBuilder.routeTableIds(_routeTableIds)
        return cdkBuilder.build()
    }
}
