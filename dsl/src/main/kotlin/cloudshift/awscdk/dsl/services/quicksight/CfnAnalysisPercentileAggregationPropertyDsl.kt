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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number

@CdkDslMarker
public class CfnAnalysisPercentileAggregationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PercentileAggregationProperty.Builder =
        CfnAnalysis.PercentileAggregationProperty.builder()

    public fun percentileValue(percentileValue: Number) {
        cdkBuilder.percentileValue(percentileValue)
    }

    public fun build(): CfnAnalysis.PercentileAggregationProperty = cdkBuilder.build()
}
