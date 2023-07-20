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
public class CfnDashboardPivotTableConditionalFormattingScopePropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableConditionalFormattingScopeProperty.Builder =
        CfnDashboard.PivotTableConditionalFormattingScopeProperty.builder()

    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    public fun build(): CfnDashboard.PivotTableConditionalFormattingScopeProperty = cdkBuilder.build()
}
