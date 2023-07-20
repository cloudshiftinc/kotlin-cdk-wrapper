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
public class CfnNetworkInsightsAccessScopeThroughResourcesStatementRequestPropertyDsl {
    private val cdkBuilder:
        CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty.Builder =
        CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty.builder()

    public fun resourceStatement(resourceStatement: IResolvable) {
        cdkBuilder.resourceStatement(resourceStatement)
    }

    public fun resourceStatement(resourceStatement: CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty) {
        cdkBuilder.resourceStatement(resourceStatement)
    }

    public fun build(): CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty =
        cdkBuilder.build()
}
