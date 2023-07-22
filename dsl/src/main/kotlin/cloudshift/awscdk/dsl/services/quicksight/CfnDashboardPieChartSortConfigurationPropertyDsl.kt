@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPieChartSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.PieChartSortConfigurationProperty.Builder =
      CfnDashboard.PieChartSortConfigurationProperty.builder()

  private val _categorySort: MutableList<Any> = mutableListOf()

  private val _smallMultiplesSort: MutableList<Any> = mutableListOf()

  /**
   * @param categoryItemsLimit The limit on the number of categories that are displayed in a pie
   * chart.
   */
  public fun categoryItemsLimit(categoryItemsLimit: IResolvable) {
    cdkBuilder.categoryItemsLimit(categoryItemsLimit)
  }

  /**
   * @param categoryItemsLimit The limit on the number of categories that are displayed in a pie
   * chart.
   */
  public fun categoryItemsLimit(categoryItemsLimit: CfnDashboard.ItemsLimitConfigurationProperty) {
    cdkBuilder.categoryItemsLimit(categoryItemsLimit)
  }

  /**
   * @param categorySort The sort configuration of the category fields.
   */
  public fun categorySort(vararg categorySort: Any) {
    _categorySort.addAll(listOf(*categorySort))
  }

  /**
   * @param categorySort The sort configuration of the category fields.
   */
  public fun categorySort(categorySort: Collection<Any>) {
    _categorySort.addAll(categorySort)
  }

  /**
   * @param categorySort The sort configuration of the category fields.
   */
  public fun categorySort(categorySort: IResolvable) {
    cdkBuilder.categorySort(categorySort)
  }

  /**
   * @param smallMultiplesLimitConfiguration The limit on the number of small multiples panels that
   * are displayed.
   */
  public fun smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration: IResolvable) {
    cdkBuilder.smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration)
  }

  /**
   * @param smallMultiplesLimitConfiguration The limit on the number of small multiples panels that
   * are displayed.
   */
  public
      fun smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration: CfnDashboard.ItemsLimitConfigurationProperty) {
    cdkBuilder.smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration)
  }

  /**
   * @param smallMultiplesSort The sort configuration of the small multiples field.
   */
  public fun smallMultiplesSort(vararg smallMultiplesSort: Any) {
    _smallMultiplesSort.addAll(listOf(*smallMultiplesSort))
  }

  /**
   * @param smallMultiplesSort The sort configuration of the small multiples field.
   */
  public fun smallMultiplesSort(smallMultiplesSort: Collection<Any>) {
    _smallMultiplesSort.addAll(smallMultiplesSort)
  }

  /**
   * @param smallMultiplesSort The sort configuration of the small multiples field.
   */
  public fun smallMultiplesSort(smallMultiplesSort: IResolvable) {
    cdkBuilder.smallMultiplesSort(smallMultiplesSort)
  }

  public fun build(): CfnDashboard.PieChartSortConfigurationProperty {
    if(_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
    if(_smallMultiplesSort.isNotEmpty()) cdkBuilder.smallMultiplesSort(_smallMultiplesSort)
    return cdkBuilder.build()
  }
}
