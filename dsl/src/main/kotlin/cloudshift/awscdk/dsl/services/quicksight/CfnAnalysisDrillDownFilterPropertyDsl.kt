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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDrillDownFilterPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DrillDownFilterProperty.Builder =
        CfnAnalysis.DrillDownFilterProperty.builder()

    public fun categoryFilter(categoryFilter: IResolvable) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    public fun categoryFilter(categoryFilter: CfnAnalysis.CategoryDrillDownFilterProperty) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    public fun numericEqualityFilter(numericEqualityFilter: CfnAnalysis.NumericEqualityDrillDownFilterProperty) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    public fun timeRangeFilter(timeRangeFilter: IResolvable) {
        cdkBuilder.timeRangeFilter(timeRangeFilter)
    }

    public fun timeRangeFilter(timeRangeFilter: CfnAnalysis.TimeRangeDrillDownFilterProperty) {
        cdkBuilder.timeRangeFilter(timeRangeFilter)
    }

    public fun build(): CfnAnalysis.DrillDownFilterProperty = cdkBuilder.build()
}
