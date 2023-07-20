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
public class CfnDashboardSheetControlsOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.SheetControlsOptionProperty.Builder =
        CfnDashboard.SheetControlsOptionProperty.builder()

    public fun visibilityState(visibilityState: String) {
        cdkBuilder.visibilityState(visibilityState)
    }

    public fun build(): CfnDashboard.SheetControlsOptionProperty = cdkBuilder.build()
}
