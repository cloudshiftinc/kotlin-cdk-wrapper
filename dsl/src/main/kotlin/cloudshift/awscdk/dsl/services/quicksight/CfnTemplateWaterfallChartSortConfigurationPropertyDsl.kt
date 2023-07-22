@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateWaterfallChartSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.WaterfallChartSortConfigurationProperty.Builder =
      CfnTemplate.WaterfallChartSortConfigurationProperty.builder()

  private val _categorySort: MutableList<Any> = mutableListOf()

  /**
   * @param breakdownItemsLimit The limit on the number of bar groups that are displayed.
   */
  public fun breakdownItemsLimit(breakdownItemsLimit: IResolvable) {
    cdkBuilder.breakdownItemsLimit(breakdownItemsLimit)
  }

  /**
   * @param breakdownItemsLimit The limit on the number of bar groups that are displayed.
   */
  public fun breakdownItemsLimit(breakdownItemsLimit: CfnTemplate.ItemsLimitConfigurationProperty) {
    cdkBuilder.breakdownItemsLimit(breakdownItemsLimit)
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

  public fun build(): CfnTemplate.WaterfallChartSortConfigurationProperty {
    if(_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
    return cdkBuilder.build()
  }
}
