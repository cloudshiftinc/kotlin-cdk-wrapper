@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCustomFilterConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.CustomFilterConfigurationProperty.Builder =
      CfnDashboard.CustomFilterConfigurationProperty.builder()

  /**
   * @param categoryValue The category value for the filter.
   * This field is mutually exclusive to `ParameterName` .
   */
  public fun categoryValue(categoryValue: String) {
    cdkBuilder.categoryValue(categoryValue)
  }

  /**
   * @param matchOperator The match operator that is used to determine if a filter should be
   * applied. 
   */
  public fun matchOperator(matchOperator: String) {
    cdkBuilder.matchOperator(matchOperator)
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
   * @param parameterName The parameter whose value should be used for the filter value.
   * This field is mutually exclusive to `CategoryValue` .
   */
  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  /**
   * @param selectAllOptions Select all of the values. Null is not the assigned value of select all.
   * * `FILTER_ALL_VALUES`
   */
  public fun selectAllOptions(selectAllOptions: String) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun build(): CfnDashboard.CustomFilterConfigurationProperty = cdkBuilder.build()
}
