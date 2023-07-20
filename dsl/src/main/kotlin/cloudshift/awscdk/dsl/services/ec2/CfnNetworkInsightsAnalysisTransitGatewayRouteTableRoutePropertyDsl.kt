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
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis
import kotlin.String

@CdkDslMarker
public class CfnNetworkInsightsAnalysisTransitGatewayRouteTableRoutePropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty.Builder =
        CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty.builder()

    public fun attachmentId(attachmentId: String) {
        cdkBuilder.attachmentId(attachmentId)
    }

    public fun destinationCidr(destinationCidr: String) {
        cdkBuilder.destinationCidr(destinationCidr)
    }

    public fun prefixListId(prefixListId: String) {
        cdkBuilder.prefixListId(prefixListId)
    }

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    public fun routeOrigin(routeOrigin: String) {
        cdkBuilder.routeOrigin(routeOrigin)
    }

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty =
        cdkBuilder.build()
}
