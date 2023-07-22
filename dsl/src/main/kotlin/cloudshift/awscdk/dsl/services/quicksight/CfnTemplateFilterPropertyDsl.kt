@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilterPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilterProperty.Builder = CfnTemplate.FilterProperty.builder()

  /**
   * @param categoryFilter A `CategoryFilter` filters text values.
   * For more information, see [Adding text
   * filters](https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html) in
   * the *Amazon QuickSight User Guide* .
   */
  public fun categoryFilter(categoryFilter: IResolvable) {
    cdkBuilder.categoryFilter(categoryFilter)
  }

  /**
   * @param categoryFilter A `CategoryFilter` filters text values.
   * For more information, see [Adding text
   * filters](https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html) in
   * the *Amazon QuickSight User Guide* .
   */
  public fun categoryFilter(categoryFilter: CfnTemplate.CategoryFilterProperty) {
    cdkBuilder.categoryFilter(categoryFilter)
  }

  /**
   * @param numericEqualityFilter A `NumericEqualityFilter` filters numeric values that equal or do
   * not equal a given numeric value.
   */
  public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
    cdkBuilder.numericEqualityFilter(numericEqualityFilter)
  }

  /**
   * @param numericEqualityFilter A `NumericEqualityFilter` filters numeric values that equal or do
   * not equal a given numeric value.
   */
  public
      fun numericEqualityFilter(numericEqualityFilter: CfnTemplate.NumericEqualityFilterProperty) {
    cdkBuilder.numericEqualityFilter(numericEqualityFilter)
  }

  /**
   * @param numericRangeFilter A `NumericRangeFilter` filters numeric values that are either inside
   * or outside a given numeric range.
   */
  public fun numericRangeFilter(numericRangeFilter: IResolvable) {
    cdkBuilder.numericRangeFilter(numericRangeFilter)
  }

  /**
   * @param numericRangeFilter A `NumericRangeFilter` filters numeric values that are either inside
   * or outside a given numeric range.
   */
  public fun numericRangeFilter(numericRangeFilter: CfnTemplate.NumericRangeFilterProperty) {
    cdkBuilder.numericRangeFilter(numericRangeFilter)
  }

  /**
   * @param relativeDatesFilter A `RelativeDatesFilter` filters date values that are relative to a
   * given date.
   */
  public fun relativeDatesFilter(relativeDatesFilter: IResolvable) {
    cdkBuilder.relativeDatesFilter(relativeDatesFilter)
  }

  /**
   * @param relativeDatesFilter A `RelativeDatesFilter` filters date values that are relative to a
   * given date.
   */
  public fun relativeDatesFilter(relativeDatesFilter: CfnTemplate.RelativeDatesFilterProperty) {
    cdkBuilder.relativeDatesFilter(relativeDatesFilter)
  }

  /**
   * @param timeEqualityFilter A `TimeEqualityFilter` filters date-time values that equal or do not
   * equal a given date/time value.
   */
  public fun timeEqualityFilter(timeEqualityFilter: IResolvable) {
    cdkBuilder.timeEqualityFilter(timeEqualityFilter)
  }

  /**
   * @param timeEqualityFilter A `TimeEqualityFilter` filters date-time values that equal or do not
   * equal a given date/time value.
   */
  public fun timeEqualityFilter(timeEqualityFilter: CfnTemplate.TimeEqualityFilterProperty) {
    cdkBuilder.timeEqualityFilter(timeEqualityFilter)
  }

  /**
   * @param timeRangeFilter A `TimeRangeFilter` filters date-time values that are either inside or
   * outside a given date/time range.
   */
  public fun timeRangeFilter(timeRangeFilter: IResolvable) {
    cdkBuilder.timeRangeFilter(timeRangeFilter)
  }

  /**
   * @param timeRangeFilter A `TimeRangeFilter` filters date-time values that are either inside or
   * outside a given date/time range.
   */
  public fun timeRangeFilter(timeRangeFilter: CfnTemplate.TimeRangeFilterProperty) {
    cdkBuilder.timeRangeFilter(timeRangeFilter)
  }

  /**
   * @param topBottomFilter A `TopBottomFilter` filters data to the top or bottom values for a given
   * column.
   */
  public fun topBottomFilter(topBottomFilter: IResolvable) {
    cdkBuilder.topBottomFilter(topBottomFilter)
  }

  /**
   * @param topBottomFilter A `TopBottomFilter` filters data to the top or bottom values for a given
   * column.
   */
  public fun topBottomFilter(topBottomFilter: CfnTemplate.TopBottomFilterProperty) {
    cdkBuilder.topBottomFilter(topBottomFilter)
  }

  public fun build(): CfnTemplate.FilterProperty = cdkBuilder.build()
}
