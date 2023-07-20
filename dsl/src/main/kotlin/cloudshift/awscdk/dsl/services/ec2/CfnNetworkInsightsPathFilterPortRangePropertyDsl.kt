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
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath
import kotlin.Number

@CdkDslMarker
public class CfnNetworkInsightsPathFilterPortRangePropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsPath.FilterPortRangeProperty.Builder =
        CfnNetworkInsightsPath.FilterPortRangeProperty.builder()

    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): CfnNetworkInsightsPath.FilterPortRangeProperty = cdkBuilder.build()
}
