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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

@CdkDslMarker
public class CfnNetworkInsightsAccessScopePathStatementRequestPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAccessScope.PathStatementRequestProperty.Builder =
        CfnNetworkInsightsAccessScope.PathStatementRequestProperty.builder()

    public fun packetHeaderStatement(packetHeaderStatement: IResolvable) {
        cdkBuilder.packetHeaderStatement(packetHeaderStatement)
    }

    public fun packetHeaderStatement(packetHeaderStatement: CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty) {
        cdkBuilder.packetHeaderStatement(packetHeaderStatement)
    }

    public fun resourceStatement(resourceStatement: IResolvable) {
        cdkBuilder.resourceStatement(resourceStatement)
    }

    public fun resourceStatement(resourceStatement: CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty) {
        cdkBuilder.resourceStatement(resourceStatement)
    }

    public fun build(): CfnNetworkInsightsAccessScope.PathStatementRequestProperty =
        cdkBuilder.build()
}
