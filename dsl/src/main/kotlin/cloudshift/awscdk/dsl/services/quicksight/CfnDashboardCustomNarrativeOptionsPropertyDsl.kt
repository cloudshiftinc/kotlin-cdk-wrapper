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
public class CfnDashboardCustomNarrativeOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.CustomNarrativeOptionsProperty.Builder =
        CfnDashboard.CustomNarrativeOptionsProperty.builder()

    public fun narrative(narrative: String) {
        cdkBuilder.narrative(narrative)
    }

    public fun build(): CfnDashboard.CustomNarrativeOptionsProperty = cdkBuilder.build()
}
