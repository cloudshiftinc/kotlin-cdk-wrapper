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
public class CfnDashboardTimeRangeFilterValuePropertyDsl {
    private val cdkBuilder: CfnDashboard.TimeRangeFilterValueProperty.Builder =
        CfnDashboard.TimeRangeFilterValueProperty.builder()

    public fun parameter(parameter: String) {
        cdkBuilder.parameter(parameter)
    }

    public fun rollingDate(rollingDate: IResolvable) {
        cdkBuilder.rollingDate(rollingDate)
    }

    public fun rollingDate(rollingDate: CfnDashboard.RollingDateConfigurationProperty) {
        cdkBuilder.rollingDate(rollingDate)
    }

    public fun staticValue(staticValue: String) {
        cdkBuilder.staticValue(staticValue)
    }

    public fun build(): CfnDashboard.TimeRangeFilterValueProperty = cdkBuilder.build()
}
