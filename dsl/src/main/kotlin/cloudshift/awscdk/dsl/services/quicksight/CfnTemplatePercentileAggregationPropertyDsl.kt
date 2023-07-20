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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Number

@CdkDslMarker
public class CfnTemplatePercentileAggregationPropertyDsl {
    private val cdkBuilder: CfnTemplate.PercentileAggregationProperty.Builder =
        CfnTemplate.PercentileAggregationProperty.builder()

    public fun percentileValue(percentileValue: Number) {
        cdkBuilder.percentileValue(percentileValue)
    }

    public fun build(): CfnTemplate.PercentileAggregationProperty = cdkBuilder.build()
}
