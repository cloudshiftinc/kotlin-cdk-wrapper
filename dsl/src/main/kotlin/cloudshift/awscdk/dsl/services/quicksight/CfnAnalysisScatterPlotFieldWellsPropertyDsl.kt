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
public class CfnAnalysisScatterPlotFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ScatterPlotFieldWellsProperty.Builder =
        CfnAnalysis.ScatterPlotFieldWellsProperty.builder()

    public fun scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells: IResolvable) {
        cdkBuilder.scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells)
    }

    public fun scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells: CfnAnalysis.ScatterPlotCategoricallyAggregatedFieldWellsProperty) {
        cdkBuilder.scatterPlotCategoricallyAggregatedFieldWells(scatterPlotCategoricallyAggregatedFieldWells)
    }

    public fun scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells: IResolvable) {
        cdkBuilder.scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells)
    }

    public fun scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells: CfnAnalysis.ScatterPlotUnaggregatedFieldWellsProperty) {
        cdkBuilder.scatterPlotUnaggregatedFieldWells(scatterPlotUnaggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.ScatterPlotFieldWellsProperty = cdkBuilder.build()
}
