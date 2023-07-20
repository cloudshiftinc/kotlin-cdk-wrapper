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
public class CfnDashboardPivotTableFieldCollapseStateOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableFieldCollapseStateOptionProperty.Builder =
        CfnDashboard.PivotTableFieldCollapseStateOptionProperty.builder()

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun target(target: IResolvable) {
        cdkBuilder.target(target)
    }

    public fun target(target: CfnDashboard.PivotTableFieldCollapseStateTargetProperty) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnDashboard.PivotTableFieldCollapseStateOptionProperty = cdkBuilder.build()
}
