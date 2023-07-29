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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

/**
 * Describes a through resource statement.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ThroughResourcesStatementRequestProperty throughResourcesStatementRequestProperty =
 * ThroughResourcesStatementRequestProperty.builder()
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-throughresourcesstatementrequest.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAccessScopeThroughResourcesStatementRequestPropertyDsl {
    private val cdkBuilder:
        CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty.Builder =
        CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty.builder()

    /** @param resourceStatement The resource statement. */
    public fun resourceStatement(resourceStatement: IResolvable) {
        cdkBuilder.resourceStatement(resourceStatement)
    }

    /** @param resourceStatement The resource statement. */
    public fun resourceStatement(
        resourceStatement: CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty
    ) {
        cdkBuilder.resourceStatement(resourceStatement)
    }

    public fun build(): CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty =
        cdkBuilder.build()
}
