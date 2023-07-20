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
public class CfnDashboardBoxPlotFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.BoxPlotFieldWellsProperty.Builder =
        CfnDashboard.BoxPlotFieldWellsProperty.builder()

    public fun boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells: IResolvable) {
        cdkBuilder.boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells)
    }

    public fun boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells: CfnDashboard.BoxPlotAggregatedFieldWellsProperty) {
        cdkBuilder.boxPlotAggregatedFieldWells(boxPlotAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.BoxPlotFieldWellsProperty = cdkBuilder.build()
}
