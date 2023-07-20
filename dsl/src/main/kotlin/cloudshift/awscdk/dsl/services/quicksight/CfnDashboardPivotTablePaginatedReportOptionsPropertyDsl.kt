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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardPivotTablePaginatedReportOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTablePaginatedReportOptionsProperty.Builder =
        CfnDashboard.PivotTablePaginatedReportOptionsProperty.builder()

    public fun overflowColumnHeaderVisibility(overflowColumnHeaderVisibility: String) {
        cdkBuilder.overflowColumnHeaderVisibility(overflowColumnHeaderVisibility)
    }

    public fun verticalOverflowVisibility(verticalOverflowVisibility: String) {
        cdkBuilder.verticalOverflowVisibility(verticalOverflowVisibility)
    }

    public fun build(): CfnDashboard.PivotTablePaginatedReportOptionsProperty = cdkBuilder.build()
}
