@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDrillDownFilterPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DrillDownFilterProperty.Builder =
      CfnAnalysis.DrillDownFilterProperty.builder()

  /**
   * @param categoryFilter The category type drill down filter.
   * This filter is used for string type columns.
   */
  public fun categoryFilter(categoryFilter: IResolvable) {
    cdkBuilder.categoryFilter(categoryFilter)
  }

  /**
   * @param categoryFilter The category type drill down filter.
   * This filter is used for string type columns.
   */
  public fun categoryFilter(categoryFilter: CfnAnalysis.CategoryDrillDownFilterProperty) {
    cdkBuilder.categoryFilter(categoryFilter)
  }

  /**
   * @param numericEqualityFilter The numeric equality type drill down filter.
   * This filter is used for number type columns.
   */
  public fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
    cdkBuilder.numericEqualityFilter(numericEqualityFilter)
  }

  /**
   * @param numericEqualityFilter The numeric equality type drill down filter.
   * This filter is used for number type columns.
   */
  public
      fun numericEqualityFilter(numericEqualityFilter: CfnAnalysis.NumericEqualityDrillDownFilterProperty) {
    cdkBuilder.numericEqualityFilter(numericEqualityFilter)
  }

  /**
   * @param timeRangeFilter The time range drill down filter.
   * This filter is used for date time columns.
   */
  public fun timeRangeFilter(timeRangeFilter: IResolvable) {
    cdkBuilder.timeRangeFilter(timeRangeFilter)
  }

  /**
   * @param timeRangeFilter The time range drill down filter.
   * This filter is used for date time columns.
   */
  public fun timeRangeFilter(timeRangeFilter: CfnAnalysis.TimeRangeDrillDownFilterProperty) {
    cdkBuilder.timeRangeFilter(timeRangeFilter)
  }

  public fun build(): CfnAnalysis.DrillDownFilterProperty = cdkBuilder.build()
}
