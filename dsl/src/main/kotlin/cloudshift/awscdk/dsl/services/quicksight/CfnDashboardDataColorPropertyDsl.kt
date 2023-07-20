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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDashboardDataColorPropertyDsl {
    private val cdkBuilder: CfnDashboard.DataColorProperty.Builder =
        CfnDashboard.DataColorProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun dataValue(dataValue: Number) {
        cdkBuilder.dataValue(dataValue)
    }

    public fun build(): CfnDashboard.DataColorProperty = cdkBuilder.build()
}
