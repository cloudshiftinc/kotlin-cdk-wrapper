@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardDataPathSortPropertyDsl {
  private val cdkBuilder: CfnDashboard.DataPathSortProperty.Builder =
      CfnDashboard.DataPathSortProperty.builder()

  private val _sortPaths: MutableList<Any> = mutableListOf()

  /**
   * @param direction Determines the sort direction. 
   */
  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  /**
   * @param sortPaths The list of data paths that need to be sorted. 
   */
  public fun sortPaths(vararg sortPaths: Any) {
    _sortPaths.addAll(listOf(*sortPaths))
  }

  /**
   * @param sortPaths The list of data paths that need to be sorted. 
   */
  public fun sortPaths(sortPaths: Collection<Any>) {
    _sortPaths.addAll(sortPaths)
  }

  /**
   * @param sortPaths The list of data paths that need to be sorted. 
   */
  public fun sortPaths(sortPaths: IResolvable) {
    cdkBuilder.sortPaths(sortPaths)
  }

  public fun build(): CfnDashboard.DataPathSortProperty {
    if(_sortPaths.isNotEmpty()) cdkBuilder.sortPaths(_sortPaths)
    return cdkBuilder.build()
  }
}
