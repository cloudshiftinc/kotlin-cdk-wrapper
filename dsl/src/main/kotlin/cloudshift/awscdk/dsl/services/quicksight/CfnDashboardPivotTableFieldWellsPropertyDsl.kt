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
public class CfnDashboardPivotTableFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableFieldWellsProperty.Builder =
        CfnDashboard.PivotTableFieldWellsProperty.builder()

    public fun pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells: IResolvable) {
        cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
    }

    public fun pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells: CfnDashboard.PivotTableAggregatedFieldWellsProperty) {
        cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.PivotTableFieldWellsProperty = cdkBuilder.build()
}
