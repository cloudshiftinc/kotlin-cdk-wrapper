@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicTopicFilterPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicFilterProperty.Builder =
      CfnTopic.TopicFilterProperty.builder()

  private val _filterSynonyms: MutableList<String> = mutableListOf()

  /**
   * @param categoryFilter The category filter that is associated with this filter.
   */
  public fun categoryFilter(categoryFilter: IResolvable) {
    cdkBuilder.categoryFilter(categoryFilter)
  }

  /**
   * @param categoryFilter The category filter that is associated with this filter.
   */
  public fun categoryFilter(categoryFilter: CfnTopic.TopicCategoryFilterProperty) {
    cdkBuilder.categoryFilter(categoryFilter)
  }

  /**
   * @param dateRangeFilter The date range filter.
   */
  public fun dateRangeFilter(dateRangeFilter: IResolvable) {
    cdkBuilder.dateRangeFilter(dateRangeFilter)
  }

  /**
   * @param dateRangeFilter The date range filter.
   */
  public fun dateRangeFilter(dateRangeFilter: CfnTopic.TopicDateRangeFilterProperty) {
    cdkBuilder.dateRangeFilter(dateRangeFilter)
  }

  /**
   * @param filterClass The class of the filter.
   * Valid values for this structure are `ENFORCED_VALUE_FILTER` , `CONDITIONAL_VALUE_FILTER` , and
   * `NAMED_VALUE_FILTER` .
   */
  public fun filterClass(filterClass: String) {
    cdkBuilder.filterClass(filterClass)
  }

  /**
   * @param filterDescription A description of the filter used to select items for a topic.
   */
  public fun filterDescription(filterDescription: String) {
    cdkBuilder.filterDescription(filterDescription)
  }

  /**
   * @param filterName The name of the filter. 
   */
  public fun filterName(filterName: String) {
    cdkBuilder.filterName(filterName)
  }

  /**
   * @param filterSynonyms The other names or aliases for the filter.
   */
  public fun filterSynonyms(vararg filterSynonyms: String) {
    _filterSynonyms.addAll(listOf(*filterSynonyms))
  }

  /**
   * @param filterSynonyms The other names or aliases for the filter.
   */
  public fun filterSynonyms(filterSynonyms: Collection<String>) {
    _filterSynonyms.addAll(filterSynonyms)
  }

  /**
   * @param filterType The type of the filter.
   * Valid values for this structure are `CATEGORY_FILTER` , `NUMERIC_EQUALITY_FILTER` ,
   * `NUMERIC_RANGE_FILTER` , `DATE_RANGE_FILTER` , and `RELATIVE_DATE_FILTER` .
   */
  public fun filterType(filterType: String) {
    cdkBuilder.filterType(filterType)
  }

  /**
   * @param numericEqualityFilter The numeric equality filter.
   */
  public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
    cdkBuilder.numericEqualityFilter(numericEqualityFilter)
  }

  /**
   * @param numericEqualityFilter The numeric equality filter.
   */
  public
      fun numericEqualityFilter(numericEqualityFilter: CfnTopic.TopicNumericEqualityFilterProperty) {
    cdkBuilder.numericEqualityFilter(numericEqualityFilter)
  }

  /**
   * @param numericRangeFilter The numeric range filter.
   */
  public fun numericRangeFilter(numericRangeFilter: IResolvable) {
    cdkBuilder.numericRangeFilter(numericRangeFilter)
  }

  /**
   * @param numericRangeFilter The numeric range filter.
   */
  public fun numericRangeFilter(numericRangeFilter: CfnTopic.TopicNumericRangeFilterProperty) {
    cdkBuilder.numericRangeFilter(numericRangeFilter)
  }

  /**
   * @param operandFieldName The name of the field that the filter operates on. 
   */
  public fun operandFieldName(operandFieldName: String) {
    cdkBuilder.operandFieldName(operandFieldName)
  }

  /**
   * @param relativeDateFilter The relative date filter.
   */
  public fun relativeDateFilter(relativeDateFilter: IResolvable) {
    cdkBuilder.relativeDateFilter(relativeDateFilter)
  }

  /**
   * @param relativeDateFilter The relative date filter.
   */
  public fun relativeDateFilter(relativeDateFilter: CfnTopic.TopicRelativeDateFilterProperty) {
    cdkBuilder.relativeDateFilter(relativeDateFilter)
  }

  public fun build(): CfnTopic.TopicFilterProperty {
    if(_filterSynonyms.isNotEmpty()) cdkBuilder.filterSynonyms(_filterSynonyms)
    return cdkBuilder.build()
  }
}
