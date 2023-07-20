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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateComboChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.ComboChartFieldWellsProperty.Builder =
        CfnTemplate.ComboChartFieldWellsProperty.builder()

    public fun comboChartAggregatedFieldWells(comboChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.comboChartAggregatedFieldWells(comboChartAggregatedFieldWells)
    }

    public fun comboChartAggregatedFieldWells(comboChartAggregatedFieldWells: CfnTemplate.ComboChartAggregatedFieldWellsProperty) {
        cdkBuilder.comboChartAggregatedFieldWells(comboChartAggregatedFieldWells)
    }

    public fun build(): CfnTemplate.ComboChartFieldWellsProperty = cdkBuilder.build()
}
