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
public class CfnAnalysisFilterPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilterProperty.Builder = CfnAnalysis.FilterProperty.builder()

    public fun categoryFilter(categoryFilter: IResolvable) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    public fun categoryFilter(categoryFilter: CfnAnalysis.CategoryFilterProperty) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    public fun numericEqualityFilter(numericEqualityFilter: CfnAnalysis.NumericEqualityFilterProperty) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    public fun numericRangeFilter(numericRangeFilter: IResolvable) {
        cdkBuilder.numericRangeFilter(numericRangeFilter)
    }

    public fun numericRangeFilter(numericRangeFilter: CfnAnalysis.NumericRangeFilterProperty) {
        cdkBuilder.numericRangeFilter(numericRangeFilter)
    }

    public fun relativeDatesFilter(relativeDatesFilter: IResolvable) {
        cdkBuilder.relativeDatesFilter(relativeDatesFilter)
    }

    public fun relativeDatesFilter(relativeDatesFilter: CfnAnalysis.RelativeDatesFilterProperty) {
        cdkBuilder.relativeDatesFilter(relativeDatesFilter)
    }

    public fun timeEqualityFilter(timeEqualityFilter: IResolvable) {
        cdkBuilder.timeEqualityFilter(timeEqualityFilter)
    }

    public fun timeEqualityFilter(timeEqualityFilter: CfnAnalysis.TimeEqualityFilterProperty) {
        cdkBuilder.timeEqualityFilter(timeEqualityFilter)
    }

    public fun timeRangeFilter(timeRangeFilter: IResolvable) {
        cdkBuilder.timeRangeFilter(timeRangeFilter)
    }

    public fun timeRangeFilter(timeRangeFilter: CfnAnalysis.TimeRangeFilterProperty) {
        cdkBuilder.timeRangeFilter(timeRangeFilter)
    }

    public fun topBottomFilter(topBottomFilter: IResolvable) {
        cdkBuilder.topBottomFilter(topBottomFilter)
    }

    public fun topBottomFilter(topBottomFilter: CfnAnalysis.TopBottomFilterProperty) {
        cdkBuilder.topBottomFilter(topBottomFilter)
    }

    public fun build(): CfnAnalysis.FilterProperty = cdkBuilder.build()
}
