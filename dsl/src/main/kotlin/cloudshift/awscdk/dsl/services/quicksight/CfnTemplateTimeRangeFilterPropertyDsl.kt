@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTimeRangeFilterPropertyDsl {
  private val cdkBuilder: CfnTemplate.TimeRangeFilterProperty.Builder =
      CfnTemplate.TimeRangeFilterProperty.builder()

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param excludePeriodConfiguration The exclude period of the time range filter.
   */
  public fun excludePeriodConfiguration(excludePeriodConfiguration: IResolvable) {
    cdkBuilder.excludePeriodConfiguration(excludePeriodConfiguration)
  }

  /**
   * @param excludePeriodConfiguration The exclude period of the time range filter.
   */
  public
      fun excludePeriodConfiguration(excludePeriodConfiguration: CfnTemplate.ExcludePeriodConfigurationProperty) {
    cdkBuilder.excludePeriodConfiguration(excludePeriodConfiguration)
  }

  /**
   * @param filterId An identifier that uniquely identifies a filter within a dashboard, analysis,
   * or template. 
   */
  public fun filterId(filterId: String) {
    cdkBuilder.filterId(filterId)
  }

  /**
   * @param includeMaximum Determines whether the maximum value in the filter value range should be
   * included in the filtered results.
   */
  public fun includeMaximum(includeMaximum: Boolean) {
    cdkBuilder.includeMaximum(includeMaximum)
  }

  /**
   * @param includeMaximum Determines whether the maximum value in the filter value range should be
   * included in the filtered results.
   */
  public fun includeMaximum(includeMaximum: IResolvable) {
    cdkBuilder.includeMaximum(includeMaximum)
  }

  /**
   * @param includeMinimum Determines whether the minimum value in the filter value range should be
   * included in the filtered results.
   */
  public fun includeMinimum(includeMinimum: Boolean) {
    cdkBuilder.includeMinimum(includeMinimum)
  }

  /**
   * @param includeMinimum Determines whether the minimum value in the filter value range should be
   * included in the filtered results.
   */
  public fun includeMinimum(includeMinimum: IResolvable) {
    cdkBuilder.includeMinimum(includeMinimum)
  }

  /**
   * @param nullOption This option determines how null values should be treated when filtering data.
   * 
   * * `ALL_VALUES` : Include null values in filtered results.
   * * `NULLS_ONLY` : Only include null values in filtered results.
   * * `NON_NULLS_ONLY` : Exclude null values from filtered results.
   */
  public fun nullOption(nullOption: String) {
    cdkBuilder.nullOption(nullOption)
  }

  /**
   * @param rangeMaximumValue The maximum value for the filter value range.
   */
  public fun rangeMaximumValue(rangeMaximumValue: IResolvable) {
    cdkBuilder.rangeMaximumValue(rangeMaximumValue)
  }

  /**
   * @param rangeMaximumValue The maximum value for the filter value range.
   */
  public fun rangeMaximumValue(rangeMaximumValue: CfnTemplate.TimeRangeFilterValueProperty) {
    cdkBuilder.rangeMaximumValue(rangeMaximumValue)
  }

  /**
   * @param rangeMinimumValue The minimum value for the filter value range.
   */
  public fun rangeMinimumValue(rangeMinimumValue: IResolvable) {
    cdkBuilder.rangeMinimumValue(rangeMinimumValue)
  }

  /**
   * @param rangeMinimumValue The minimum value for the filter value range.
   */
  public fun rangeMinimumValue(rangeMinimumValue: CfnTemplate.TimeRangeFilterValueProperty) {
    cdkBuilder.rangeMinimumValue(rangeMinimumValue)
  }

  /**
   * @param timeGranularity The level of time precision that is used to aggregate `DateTime` values.
   */
  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnTemplate.TimeRangeFilterProperty = cdkBuilder.build()
}
