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
public class CfnDashboardDateAxisOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.DateAxisOptionsProperty.Builder =
        CfnDashboard.DateAxisOptionsProperty.builder()

    public fun missingDateVisibility(missingDateVisibility: String) {
        cdkBuilder.missingDateVisibility(missingDateVisibility)
    }

    public fun build(): CfnDashboard.DateAxisOptionsProperty = cdkBuilder.build()
}
