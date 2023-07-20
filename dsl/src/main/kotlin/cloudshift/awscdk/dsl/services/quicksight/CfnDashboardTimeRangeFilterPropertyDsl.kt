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
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnDashboardTimeRangeFilterPropertyDsl {
    private val cdkBuilder: CfnDashboard.TimeRangeFilterProperty.Builder =
        CfnDashboard.TimeRangeFilterProperty.builder()

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun excludePeriodConfiguration(excludePeriodConfiguration: IResolvable) {
        cdkBuilder.excludePeriodConfiguration(excludePeriodConfiguration)
    }

    public fun excludePeriodConfiguration(excludePeriodConfiguration: CfnDashboard.ExcludePeriodConfigurationProperty) {
        cdkBuilder.excludePeriodConfiguration(excludePeriodConfiguration)
    }

    public fun filterId(filterId: String) {
        cdkBuilder.filterId(filterId)
    }

    public fun includeMaximum(includeMaximum: Boolean) {
        cdkBuilder.includeMaximum(includeMaximum)
    }

    public fun includeMaximum(includeMaximum: IResolvable) {
        cdkBuilder.includeMaximum(includeMaximum)
    }

    public fun includeMinimum(includeMinimum: Boolean) {
        cdkBuilder.includeMinimum(includeMinimum)
    }

    public fun includeMinimum(includeMinimum: IResolvable) {
        cdkBuilder.includeMinimum(includeMinimum)
    }

    public fun nullOption(nullOption: String) {
        cdkBuilder.nullOption(nullOption)
    }

    public fun rangeMaximumValue(rangeMaximumValue: IResolvable) {
        cdkBuilder.rangeMaximumValue(rangeMaximumValue)
    }

    public fun rangeMaximumValue(rangeMaximumValue: CfnDashboard.TimeRangeFilterValueProperty) {
        cdkBuilder.rangeMaximumValue(rangeMaximumValue)
    }

    public fun rangeMinimumValue(rangeMinimumValue: IResolvable) {
        cdkBuilder.rangeMinimumValue(rangeMinimumValue)
    }

    public fun rangeMinimumValue(rangeMinimumValue: CfnDashboard.TimeRangeFilterValueProperty) {
        cdkBuilder.rangeMinimumValue(rangeMinimumValue)
    }

    public fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
    }

    public fun build(): CfnDashboard.TimeRangeFilterProperty = cdkBuilder.build()
}
