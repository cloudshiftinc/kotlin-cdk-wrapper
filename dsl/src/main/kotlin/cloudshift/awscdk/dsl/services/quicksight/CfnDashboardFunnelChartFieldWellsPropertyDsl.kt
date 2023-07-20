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
public class CfnDashboardFunnelChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.FunnelChartFieldWellsProperty.Builder =
        CfnDashboard.FunnelChartFieldWellsProperty.builder()

    public fun funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells)
    }

    public fun funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells: CfnDashboard.FunnelChartAggregatedFieldWellsProperty) {
        cdkBuilder.funnelChartAggregatedFieldWells(funnelChartAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.FunnelChartFieldWellsProperty = cdkBuilder.build()
}
