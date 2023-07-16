@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDrillDownFilterPropertyDsl {
  private val cdkBuilder: CfnDashboard.DrillDownFilterProperty.Builder =
      CfnDashboard.DrillDownFilterProperty.builder()

  public fun categoryFilter(categoryFilter: IResolvable) {
    cdkBuilder.categoryFilter(categoryFilter)
  }

  public fun categoryFilter(categoryFilter: CfnDashboard.CategoryDrillDownFilterProperty) {
    cdkBuilder.categoryFilter(categoryFilter)
  }

  public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
    cdkBuilder.numericEqualityFilter(numericEqualityFilter)
  }

  public
      fun numericEqualityFilter(numericEqualityFilter: CfnDashboard.NumericEqualityDrillDownFilterProperty) {
    cdkBuilder.numericEqualityFilter(numericEqualityFilter)
  }

  public fun timeRangeFilter(timeRangeFilter: IResolvable) {
    cdkBuilder.timeRangeFilter(timeRangeFilter)
  }

  public fun timeRangeFilter(timeRangeFilter: CfnDashboard.TimeRangeDrillDownFilterProperty) {
    cdkBuilder.timeRangeFilter(timeRangeFilter)
  }

  public fun build(): CfnDashboard.DrillDownFilterProperty = cdkBuilder.build()
}
