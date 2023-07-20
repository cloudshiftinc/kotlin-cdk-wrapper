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
public class CfnDashboardSpacingPropertyDsl {
    private val cdkBuilder: CfnDashboard.SpacingProperty.Builder =
        CfnDashboard.SpacingProperty.builder()

    public fun bottom(bottom: String) {
        cdkBuilder.bottom(bottom)
    }

    public fun left(left: String) {
        cdkBuilder.left(left)
    }

    public fun right(right: String) {
        cdkBuilder.right(right)
    }

    public fun top(top: String) {
        cdkBuilder.top(top)
    }

    public fun build(): CfnDashboard.SpacingProperty = cdkBuilder.build()
}
