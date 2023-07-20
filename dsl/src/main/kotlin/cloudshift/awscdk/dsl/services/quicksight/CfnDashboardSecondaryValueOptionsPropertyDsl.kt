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
public class CfnDashboardSecondaryValueOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.SecondaryValueOptionsProperty.Builder =
        CfnDashboard.SecondaryValueOptionsProperty.builder()

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.SecondaryValueOptionsProperty = cdkBuilder.build()
}
