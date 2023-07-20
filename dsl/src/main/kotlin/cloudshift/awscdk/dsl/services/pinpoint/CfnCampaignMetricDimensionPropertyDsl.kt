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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnCampaignMetricDimensionPropertyDsl {
    private val cdkBuilder: CfnCampaign.MetricDimensionProperty.Builder =
        CfnCampaign.MetricDimensionProperty.builder()

    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCampaign.MetricDimensionProperty = cdkBuilder.build()
}
