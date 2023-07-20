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
public class CfnAnalysisRadarChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.RadarChartFieldWellsProperty.Builder =
        CfnAnalysis.RadarChartFieldWellsProperty.builder()

    public fun radarChartAggregatedFieldWells(radarChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.radarChartAggregatedFieldWells(radarChartAggregatedFieldWells)
    }

    public fun radarChartAggregatedFieldWells(radarChartAggregatedFieldWells: CfnAnalysis.RadarChartAggregatedFieldWellsProperty) {
        cdkBuilder.radarChartAggregatedFieldWells(radarChartAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.RadarChartFieldWellsProperty = cdkBuilder.build()
}
