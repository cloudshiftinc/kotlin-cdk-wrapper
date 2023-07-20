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
import software.amazon.awscdk.services.quicksight.CfnTopic
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTopicTopicFilterPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicFilterProperty.Builder =
        CfnTopic.TopicFilterProperty.builder()

    private val _filterSynonyms: MutableList<String> = mutableListOf()

    public fun categoryFilter(categoryFilter: IResolvable) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    public fun categoryFilter(categoryFilter: CfnTopic.TopicCategoryFilterProperty) {
        cdkBuilder.categoryFilter(categoryFilter)
    }

    public fun dateRangeFilter(dateRangeFilter: IResolvable) {
        cdkBuilder.dateRangeFilter(dateRangeFilter)
    }

    public fun dateRangeFilter(dateRangeFilter: CfnTopic.TopicDateRangeFilterProperty) {
        cdkBuilder.dateRangeFilter(dateRangeFilter)
    }

    public fun filterClass(filterClass: String) {
        cdkBuilder.filterClass(filterClass)
    }

    public fun filterDescription(filterDescription: String) {
        cdkBuilder.filterDescription(filterDescription)
    }

    public fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
    }

    public fun filterSynonyms(vararg filterSynonyms: String) {
        _filterSynonyms.addAll(listOf(*filterSynonyms))
    }

    public fun filterSynonyms(filterSynonyms: Collection<String>) {
        _filterSynonyms.addAll(filterSynonyms)
    }

    public fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
    }

    public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    public fun numericEqualityFilter(numericEqualityFilter: CfnTopic.TopicNumericEqualityFilterProperty) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter)
    }

    public fun numericRangeFilter(numericRangeFilter: IResolvable) {
        cdkBuilder.numericRangeFilter(numericRangeFilter)
    }

    public fun numericRangeFilter(numericRangeFilter: CfnTopic.TopicNumericRangeFilterProperty) {
        cdkBuilder.numericRangeFilter(numericRangeFilter)
    }

    public fun operandFieldName(operandFieldName: String) {
        cdkBuilder.operandFieldName(operandFieldName)
    }

    public fun relativeDateFilter(relativeDateFilter: IResolvable) {
        cdkBuilder.relativeDateFilter(relativeDateFilter)
    }

    public fun relativeDateFilter(relativeDateFilter: CfnTopic.TopicRelativeDateFilterProperty) {
        cdkBuilder.relativeDateFilter(relativeDateFilter)
    }

    public fun build(): CfnTopic.TopicFilterProperty {
        if (_filterSynonyms.isNotEmpty()) cdkBuilder.filterSynonyms(_filterSynonyms)
        return cdkBuilder.build()
    }
}
