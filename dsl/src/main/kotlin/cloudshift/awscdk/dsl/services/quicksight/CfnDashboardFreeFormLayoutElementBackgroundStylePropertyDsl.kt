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
public class CfnDashboardFreeFormLayoutElementBackgroundStylePropertyDsl {
    private val cdkBuilder: CfnDashboard.FreeFormLayoutElementBackgroundStyleProperty.Builder =
        CfnDashboard.FreeFormLayoutElementBackgroundStyleProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.FreeFormLayoutElementBackgroundStyleProperty = cdkBuilder.build()
}
