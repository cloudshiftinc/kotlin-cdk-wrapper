@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCategoryFilterConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.CategoryFilterConfigurationProperty.Builder =
      CfnDashboard.CategoryFilterConfigurationProperty.builder()

  /**
   * @param customFilterConfiguration A custom filter that filters based on a single value.
   * This filter can be partially matched.
   */
  public fun customFilterConfiguration(customFilterConfiguration: IResolvable) {
    cdkBuilder.customFilterConfiguration(customFilterConfiguration)
  }

  /**
   * @param customFilterConfiguration A custom filter that filters based on a single value.
   * This filter can be partially matched.
   */
  public
      fun customFilterConfiguration(customFilterConfiguration: CfnDashboard.CustomFilterConfigurationProperty) {
    cdkBuilder.customFilterConfiguration(customFilterConfiguration)
  }

  /**
   * @param customFilterListConfiguration A list of custom filter values.
   * In the Amazon QuickSight console, this filter type is called a custom filter list.
   */
  public fun customFilterListConfiguration(customFilterListConfiguration: IResolvable) {
    cdkBuilder.customFilterListConfiguration(customFilterListConfiguration)
  }

  /**
   * @param customFilterListConfiguration A list of custom filter values.
   * In the Amazon QuickSight console, this filter type is called a custom filter list.
   */
  public
      fun customFilterListConfiguration(customFilterListConfiguration: CfnDashboard.CustomFilterListConfigurationProperty) {
    cdkBuilder.customFilterListConfiguration(customFilterListConfiguration)
  }

  /**
   * @param filterListConfiguration A list of filter configurations.
   * In the Amazon QuickSight console, this filter type is called a filter list.
   */
  public fun filterListConfiguration(filterListConfiguration: IResolvable) {
    cdkBuilder.filterListConfiguration(filterListConfiguration)
  }

  /**
   * @param filterListConfiguration A list of filter configurations.
   * In the Amazon QuickSight console, this filter type is called a filter list.
   */
  public
      fun filterListConfiguration(filterListConfiguration: CfnDashboard.FilterListConfigurationProperty) {
    cdkBuilder.filterListConfiguration(filterListConfiguration)
  }

  public fun build(): CfnDashboard.CategoryFilterConfigurationProperty = cdkBuilder.build()
}
