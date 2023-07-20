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
public class CfnDashboardSheetElementConfigurationOverridesPropertyDsl {
    private val cdkBuilder: CfnDashboard.SheetElementConfigurationOverridesProperty.Builder =
        CfnDashboard.SheetElementConfigurationOverridesProperty.builder()

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.SheetElementConfigurationOverridesProperty = cdkBuilder.build()
}
