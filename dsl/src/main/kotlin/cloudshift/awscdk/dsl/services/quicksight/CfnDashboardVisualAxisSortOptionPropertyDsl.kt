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
public class CfnDashboardVisualAxisSortOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.VisualAxisSortOptionProperty.Builder =
        CfnDashboard.VisualAxisSortOptionProperty.builder()

    public fun availabilityStatus(availabilityStatus: String) {
        cdkBuilder.availabilityStatus(availabilityStatus)
    }

    public fun build(): CfnDashboard.VisualAxisSortOptionProperty = cdkBuilder.build()
}
