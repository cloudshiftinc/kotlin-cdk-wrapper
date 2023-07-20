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
import kotlin.String

@CdkDslMarker
public class CfnDashboardPivotFieldSortOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotFieldSortOptionsProperty.Builder =
        CfnDashboard.PivotFieldSortOptionsProperty.builder()

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun sortBy(sortBy: IResolvable) {
        cdkBuilder.sortBy(sortBy)
    }

    public fun sortBy(sortBy: CfnDashboard.PivotTableSortByProperty) {
        cdkBuilder.sortBy(sortBy)
    }

    public fun build(): CfnDashboard.PivotFieldSortOptionsProperty = cdkBuilder.build()
}
