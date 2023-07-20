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
public class CfnTemplateBarChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.BarChartFieldWellsProperty.Builder =
        CfnTemplate.BarChartFieldWellsProperty.builder()

    public fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
    }

    public fun barChartAggregatedFieldWells(barChartAggregatedFieldWells: CfnTemplate.BarChartAggregatedFieldWellsProperty) {
        cdkBuilder.barChartAggregatedFieldWells(barChartAggregatedFieldWells)
    }

    public fun build(): CfnTemplate.BarChartFieldWellsProperty = cdkBuilder.build()
}
