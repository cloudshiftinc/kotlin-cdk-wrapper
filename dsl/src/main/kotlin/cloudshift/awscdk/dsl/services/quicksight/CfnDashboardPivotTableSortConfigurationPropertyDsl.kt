@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPivotTableSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTableSortConfigurationProperty.Builder =
      CfnDashboard.PivotTableSortConfigurationProperty.builder()

  private val _fieldSortOptions: MutableList<Any> = mutableListOf()

  /**
   * @param fieldSortOptions The field sort options for a pivot table sort configuration.
   */
  public fun fieldSortOptions(vararg fieldSortOptions: Any) {
    _fieldSortOptions.addAll(listOf(*fieldSortOptions))
  }

  /**
   * @param fieldSortOptions The field sort options for a pivot table sort configuration.
   */
  public fun fieldSortOptions(fieldSortOptions: Collection<Any>) {
    _fieldSortOptions.addAll(fieldSortOptions)
  }

  /**
   * @param fieldSortOptions The field sort options for a pivot table sort configuration.
   */
  public fun fieldSortOptions(fieldSortOptions: IResolvable) {
    cdkBuilder.fieldSortOptions(fieldSortOptions)
  }

  public fun build(): CfnDashboard.PivotTableSortConfigurationProperty {
    if(_fieldSortOptions.isNotEmpty()) cdkBuilder.fieldSortOptions(_fieldSortOptions)
    return cdkBuilder.build()
  }
}
