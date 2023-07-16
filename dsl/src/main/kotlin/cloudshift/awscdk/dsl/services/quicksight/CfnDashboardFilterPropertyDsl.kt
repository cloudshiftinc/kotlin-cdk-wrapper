@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilterPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilterProperty.Builder =
      CfnDashboard.FilterProperty.builder()

  public fun categoryFilter(categoryFilter: IResolvable) {
    cdkBuilder.categoryFilter(categoryFilter)
  }

  public fun categoryFilter(categoryFilter: CfnDashboard.CategoryFilterProperty) {
    cdkBuilder.categoryFilter(categoryFilter)
  }

  public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
    cdkBuilder.numericEqualityFilter(numericEqualityFilter)
  }

  public
      fun numericEqualityFilter(numericEqualityFilter: CfnDashboard.NumericEqualityFilterProperty) {
    cdkBuilder.numericEqualityFilter(numericEqualityFilter)
  }

  public fun numericRangeFilter(numericRangeFilter: IResolvable) {
    cdkBuilder.numericRangeFilter(numericRangeFilter)
  }

  public fun numericRangeFilter(numericRangeFilter: CfnDashboard.NumericRangeFilterProperty) {
    cdkBuilder.numericRangeFilter(numericRangeFilter)
  }

  public fun relativeDatesFilter(relativeDatesFilter: IResolvable) {
    cdkBuilder.relativeDatesFilter(relativeDatesFilter)
  }

  public fun relativeDatesFilter(relativeDatesFilter: CfnDashboard.RelativeDatesFilterProperty) {
    cdkBuilder.relativeDatesFilter(relativeDatesFilter)
  }

  public fun timeEqualityFilter(timeEqualityFilter: IResolvable) {
    cdkBuilder.timeEqualityFilter(timeEqualityFilter)
  }

  public fun timeEqualityFilter(timeEqualityFilter: CfnDashboard.TimeEqualityFilterProperty) {
    cdkBuilder.timeEqualityFilter(timeEqualityFilter)
  }

  public fun timeRangeFilter(timeRangeFilter: IResolvable) {
    cdkBuilder.timeRangeFilter(timeRangeFilter)
  }

  public fun timeRangeFilter(timeRangeFilter: CfnDashboard.TimeRangeFilterProperty) {
    cdkBuilder.timeRangeFilter(timeRangeFilter)
  }

  public fun topBottomFilter(topBottomFilter: IResolvable) {
    cdkBuilder.topBottomFilter(topBottomFilter)
  }

  public fun topBottomFilter(topBottomFilter: CfnDashboard.TopBottomFilterProperty) {
    cdkBuilder.topBottomFilter(topBottomFilter)
  }

  public fun build(): CfnDashboard.FilterProperty = cdkBuilder.build()
}
