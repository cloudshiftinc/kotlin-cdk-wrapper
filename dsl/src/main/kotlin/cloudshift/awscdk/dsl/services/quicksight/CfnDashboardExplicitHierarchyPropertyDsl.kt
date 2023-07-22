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
public class CfnDashboardExplicitHierarchyPropertyDsl {
  private val cdkBuilder: CfnDashboard.ExplicitHierarchyProperty.Builder =
      CfnDashboard.ExplicitHierarchyProperty.builder()

  private val _columns: MutableList<Any> = mutableListOf()

  private val _drillDownFilters: MutableList<Any> = mutableListOf()

  /**
   * @param columns The list of columns that define the explicit hierarchy. 
   */
  public fun columns(vararg columns: Any) {
    _columns.addAll(listOf(*columns))
  }

  /**
   * @param columns The list of columns that define the explicit hierarchy. 
   */
  public fun columns(columns: Collection<Any>) {
    _columns.addAll(columns)
  }

  /**
   * @param columns The list of columns that define the explicit hierarchy. 
   */
  public fun columns(columns: IResolvable) {
    cdkBuilder.columns(columns)
  }

  /**
   * @param drillDownFilters The option that determines the drill down filters for the explicit
   * hierarchy.
   */
  public fun drillDownFilters(vararg drillDownFilters: Any) {
    _drillDownFilters.addAll(listOf(*drillDownFilters))
  }

  /**
   * @param drillDownFilters The option that determines the drill down filters for the explicit
   * hierarchy.
   */
  public fun drillDownFilters(drillDownFilters: Collection<Any>) {
    _drillDownFilters.addAll(drillDownFilters)
  }

  /**
   * @param drillDownFilters The option that determines the drill down filters for the explicit
   * hierarchy.
   */
  public fun drillDownFilters(drillDownFilters: IResolvable) {
    cdkBuilder.drillDownFilters(drillDownFilters)
  }

  /**
   * @param hierarchyId The hierarchy ID of the explicit hierarchy. 
   */
  public fun hierarchyId(hierarchyId: String) {
    cdkBuilder.hierarchyId(hierarchyId)
  }

  public fun build(): CfnDashboard.ExplicitHierarchyProperty {
    if(_columns.isNotEmpty()) cdkBuilder.columns(_columns)
    if(_drillDownFilters.isNotEmpty()) cdkBuilder.drillDownFilters(_drillDownFilters)
    return cdkBuilder.build()
  }
}
