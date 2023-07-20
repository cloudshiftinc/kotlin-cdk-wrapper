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
public class CfnTemplateFilterPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilterProperty.Builder = CfnTemplate.FilterProperty.builder()

    public fun categoryFilter(categoryFilter: IResolvable) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    public fun categoryFilter(categoryFilter: CfnTemplate.CategoryFilterProperty) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    public fun numericEqualityFilter(numericEqualityFilter: CfnTemplate.NumericEqualityFilterProperty) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    public fun numericRangeFilter(numericRangeFilter: IResolvable) {
        cdkBuilder.numericRangeFilter(numericRangeFilter)
    }

    public fun numericRangeFilter(numericRangeFilter: CfnTemplate.NumericRangeFilterProperty) {
        cdkBuilder.numericRangeFilter(numericRangeFilter)
    }

    public fun relativeDatesFilter(relativeDatesFilter: IResolvable) {
        cdkBuilder.relativeDatesFilter(relativeDatesFilter)
    }

    public fun relativeDatesFilter(relativeDatesFilter: CfnTemplate.RelativeDatesFilterProperty) {
        cdkBuilder.relativeDatesFilter(relativeDatesFilter)
    }

    public fun timeEqualityFilter(timeEqualityFilter: IResolvable) {
        cdkBuilder.timeEqualityFilter(timeEqualityFilter)
    }

    public fun timeEqualityFilter(timeEqualityFilter: CfnTemplate.TimeEqualityFilterProperty) {
        cdkBuilder.timeEqualityFilter(timeEqualityFilter)
    }

    public fun timeRangeFilter(timeRangeFilter: IResolvable) {
        cdkBuilder.timeRangeFilter(timeRangeFilter)
    }

    public fun timeRangeFilter(timeRangeFilter: CfnTemplate.TimeRangeFilterProperty) {
        cdkBuilder.timeRangeFilter(timeRangeFilter)
    }

    public fun topBottomFilter(topBottomFilter: IResolvable) {
        cdkBuilder.topBottomFilter(topBottomFilter)
    }

    public fun topBottomFilter(topBottomFilter: CfnTemplate.TopBottomFilterProperty) {
        cdkBuilder.topBottomFilter(topBottomFilter)
    }

    public fun build(): CfnTemplate.FilterProperty = cdkBuilder.build()
}
