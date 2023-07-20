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
public class CfnDashboardNumericRangeFilterValuePropertyDsl {
    private val cdkBuilder: CfnDashboard.NumericRangeFilterValueProperty.Builder =
        CfnDashboard.NumericRangeFilterValueProperty.builder()

    public fun parameter(parameter: String) {
        cdkBuilder.parameter(parameter)
    }

    public fun staticValue(staticValue: Number) {
        cdkBuilder.staticValue(staticValue)
    }

    public fun build(): CfnDashboard.NumericRangeFilterValueProperty = cdkBuilder.build()
}
