@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardTableSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.TableSortConfigurationProperty.Builder =
      CfnDashboard.TableSortConfigurationProperty.builder()

  private val _rowSort: MutableList<Any> = mutableListOf()

  /**
   * @param paginationConfiguration The pagination configuration (page size, page number) for the
   * table.
   */
  public fun paginationConfiguration(paginationConfiguration: IResolvable) {
    cdkBuilder.paginationConfiguration(paginationConfiguration)
  }

  /**
   * @param paginationConfiguration The pagination configuration (page size, page number) for the
   * table.
   */
  public
      fun paginationConfiguration(paginationConfiguration: CfnDashboard.PaginationConfigurationProperty) {
    cdkBuilder.paginationConfiguration(paginationConfiguration)
  }

  /**
   * @param rowSort The field sort options for rows in the table.
   */
  public fun rowSort(vararg rowSort: Any) {
    _rowSort.addAll(listOf(*rowSort))
  }

  /**
   * @param rowSort The field sort options for rows in the table.
   */
  public fun rowSort(rowSort: Collection<Any>) {
    _rowSort.addAll(rowSort)
  }

  /**
   * @param rowSort The field sort options for rows in the table.
   */
  public fun rowSort(rowSort: IResolvable) {
    cdkBuilder.rowSort(rowSort)
  }

  public fun build(): CfnDashboard.TableSortConfigurationProperty {
    if(_rowSort.isNotEmpty()) cdkBuilder.rowSort(_rowSort)
    return cdkBuilder.build()
  }
}
