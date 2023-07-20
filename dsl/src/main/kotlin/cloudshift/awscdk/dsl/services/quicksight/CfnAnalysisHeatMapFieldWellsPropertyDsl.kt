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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisHeatMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.HeatMapFieldWellsProperty.Builder =
        CfnAnalysis.HeatMapFieldWellsProperty.builder()

    public fun heatMapAggregatedFieldWells(heatMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.heatMapAggregatedFieldWells(heatMapAggregatedFieldWells)
    }

    public fun heatMapAggregatedFieldWells(heatMapAggregatedFieldWells: CfnAnalysis.HeatMapAggregatedFieldWellsProperty) {
        cdkBuilder.heatMapAggregatedFieldWells(heatMapAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.HeatMapFieldWellsProperty = cdkBuilder.build()
}
