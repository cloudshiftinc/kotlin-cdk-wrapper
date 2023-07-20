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
public class CfnDashboardScrollBarOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.ScrollBarOptionsProperty.Builder =
        CfnDashboard.ScrollBarOptionsProperty.builder()

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun visibleRange(visibleRange: IResolvable) {
        cdkBuilder.visibleRange(visibleRange)
    }

    public fun visibleRange(visibleRange: CfnDashboard.VisibleRangeOptionsProperty) {
        cdkBuilder.visibleRange(visibleRange)
    }

    public fun build(): CfnDashboard.ScrollBarOptionsProperty = cdkBuilder.build()
}
