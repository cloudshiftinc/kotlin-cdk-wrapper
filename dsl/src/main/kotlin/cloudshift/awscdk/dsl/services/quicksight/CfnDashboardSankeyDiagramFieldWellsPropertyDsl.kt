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
public class CfnDashboardSankeyDiagramFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.SankeyDiagramFieldWellsProperty.Builder =
        CfnDashboard.SankeyDiagramFieldWellsProperty.builder()

    public fun sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells: IResolvable) {
        cdkBuilder.sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells)
    }

    public fun sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells: CfnDashboard.SankeyDiagramAggregatedFieldWellsProperty) {
        cdkBuilder.sankeyDiagramAggregatedFieldWells(sankeyDiagramAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.SankeyDiagramFieldWellsProperty = cdkBuilder.build()
}
