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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDrillDownFilterPropertyDsl {
    private val cdkBuilder: CfnTemplate.DrillDownFilterProperty.Builder =
        CfnTemplate.DrillDownFilterProperty.builder()

    public fun categoryFilter(categoryFilter: IResolvable) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    public fun categoryFilter(categoryFilter: CfnTemplate.CategoryDrillDownFilterProperty) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    public fun numericEqualityFilter(numericEqualityFilter: CfnTemplate.NumericEqualityDrillDownFilterProperty) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    public fun timeRangeFilter(timeRangeFilter: IResolvable) {
        cdkBuilder.timeRangeFilter(timeRangeFilter)
    }

    public fun timeRangeFilter(timeRangeFilter: CfnTemplate.TimeRangeDrillDownFilterProperty) {
        cdkBuilder.timeRangeFilter(timeRangeFilter)
    }

    public fun build(): CfnTemplate.DrillDownFilterProperty = cdkBuilder.build()
}
