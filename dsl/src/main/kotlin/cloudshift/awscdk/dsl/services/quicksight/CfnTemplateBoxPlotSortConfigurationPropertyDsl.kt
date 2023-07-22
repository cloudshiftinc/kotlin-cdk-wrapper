@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateBoxPlotSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.BoxPlotSortConfigurationProperty.Builder =
      CfnTemplate.BoxPlotSortConfigurationProperty.builder()

  private val _categorySort: MutableList<Any> = mutableListOf()

  /**
   * @param categorySort The sort configuration of a group by fields.
   */
  public fun categorySort(vararg categorySort: Any) {
    _categorySort.addAll(listOf(*categorySort))
  }

  /**
   * @param categorySort The sort configuration of a group by fields.
   */
  public fun categorySort(categorySort: Collection<Any>) {
    _categorySort.addAll(categorySort)
  }

  /**
   * @param categorySort The sort configuration of a group by fields.
   */
  public fun categorySort(categorySort: IResolvable) {
    cdkBuilder.categorySort(categorySort)
  }

  /**
   * @param paginationConfiguration The pagination configuration of a table visual or box plot.
   */
  public fun paginationConfiguration(paginationConfiguration: IResolvable) {
    cdkBuilder.paginationConfiguration(paginationConfiguration)
  }

  /**
   * @param paginationConfiguration The pagination configuration of a table visual or box plot.
   */
  public
      fun paginationConfiguration(paginationConfiguration: CfnTemplate.PaginationConfigurationProperty) {
    cdkBuilder.paginationConfiguration(paginationConfiguration)
  }

  public fun build(): CfnTemplate.BoxPlotSortConfigurationProperty {
    if(_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
    return cdkBuilder.build()
  }
}
