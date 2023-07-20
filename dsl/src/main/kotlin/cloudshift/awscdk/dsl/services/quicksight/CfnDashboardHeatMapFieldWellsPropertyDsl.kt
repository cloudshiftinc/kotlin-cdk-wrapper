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
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardHeatMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.HeatMapFieldWellsProperty.Builder =
        CfnDashboard.HeatMapFieldWellsProperty.builder()

    public fun heatMapAggregatedFieldWells(heatMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.heatMapAggregatedFieldWells(heatMapAggregatedFieldWells)
    }

    public fun heatMapAggregatedFieldWells(heatMapAggregatedFieldWells: CfnDashboard.HeatMapAggregatedFieldWellsProperty) {
        cdkBuilder.heatMapAggregatedFieldWells(heatMapAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.HeatMapFieldWellsProperty = cdkBuilder.build()
}
