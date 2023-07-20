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
public class CfnDashboardPivotTableConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableConditionalFormattingOptionProperty.Builder =
        CfnDashboard.PivotTableConditionalFormattingOptionProperty.builder()

    public fun cell(cell: IResolvable) {
        cdkBuilder.cell(cell)
    }

    public fun cell(cell: CfnDashboard.PivotTableCellConditionalFormattingProperty) {
        cdkBuilder.cell(cell)
    }

    public fun build(): CfnDashboard.PivotTableConditionalFormattingOptionProperty =
        cdkBuilder.build()
}
