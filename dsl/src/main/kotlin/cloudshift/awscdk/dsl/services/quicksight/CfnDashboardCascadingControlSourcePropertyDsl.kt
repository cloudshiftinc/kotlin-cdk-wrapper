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
public class CfnDashboardCascadingControlSourcePropertyDsl {
    private val cdkBuilder: CfnDashboard.CascadingControlSourceProperty.Builder =
        CfnDashboard.CascadingControlSourceProperty.builder()

    public fun columnToMatch(columnToMatch: IResolvable) {
        cdkBuilder.columnToMatch(columnToMatch)
    }

    public fun columnToMatch(columnToMatch: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.columnToMatch(columnToMatch)
    }

    public fun sourceSheetControlId(sourceSheetControlId: String) {
        cdkBuilder.sourceSheetControlId(sourceSheetControlId)
    }

    public fun build(): CfnDashboard.CascadingControlSourceProperty = cdkBuilder.build()
}
