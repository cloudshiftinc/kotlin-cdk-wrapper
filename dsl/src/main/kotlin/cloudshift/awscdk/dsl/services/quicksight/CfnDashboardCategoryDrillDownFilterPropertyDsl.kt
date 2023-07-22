@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCategoryDrillDownFilterPropertyDsl {
  private val cdkBuilder: CfnDashboard.CategoryDrillDownFilterProperty.Builder =
      CfnDashboard.CategoryDrillDownFilterProperty.builder()

  private val _categoryValues: MutableList<String> = mutableListOf()

  /**
   * @param categoryValues A list of the string inputs that are the values of the category drill
   * down filter. 
   */
  public fun categoryValues(vararg categoryValues: String) {
    _categoryValues.addAll(listOf(*categoryValues))
  }

  /**
   * @param categoryValues A list of the string inputs that are the values of the category drill
   * down filter. 
   */
  public fun categoryValues(categoryValues: Collection<String>) {
    _categoryValues.addAll(categoryValues)
  }

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun build(): CfnDashboard.CategoryDrillDownFilterProperty {
    if(_categoryValues.isNotEmpty()) cdkBuilder.categoryValues(_categoryValues)
    return cdkBuilder.build()
  }
}
