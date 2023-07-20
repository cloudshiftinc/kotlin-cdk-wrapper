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
public class CfnAnalysisComboChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ComboChartFieldWellsProperty.Builder =
        CfnAnalysis.ComboChartFieldWellsProperty.builder()

    public fun comboChartAggregatedFieldWells(comboChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.comboChartAggregatedFieldWells(comboChartAggregatedFieldWells)
    }

    public fun comboChartAggregatedFieldWells(comboChartAggregatedFieldWells: CfnAnalysis.ComboChartAggregatedFieldWellsProperty) {
        cdkBuilder.comboChartAggregatedFieldWells(comboChartAggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.ComboChartFieldWellsProperty = cdkBuilder.build()
}
