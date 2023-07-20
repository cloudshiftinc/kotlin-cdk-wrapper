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
public class CfnDashboardSectionAfterPageBreakPropertyDsl {
    private val cdkBuilder: CfnDashboard.SectionAfterPageBreakProperty.Builder =
        CfnDashboard.SectionAfterPageBreakProperty.builder()

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDashboard.SectionAfterPageBreakProperty = cdkBuilder.build()
}
