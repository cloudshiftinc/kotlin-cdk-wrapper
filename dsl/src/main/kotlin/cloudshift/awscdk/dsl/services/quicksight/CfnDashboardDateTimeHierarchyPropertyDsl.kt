@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The option that determines the hierarchy of any `DateTime` fields.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DateTimeHierarchyProperty dateTimeHierarchyProperty = DateTimeHierarchyProperty.builder()
 * .hierarchyId("hierarchyId")
 * // the properties below are optional
 * .drillDownFilters(List.of(DrillDownFilterProperty.builder()
 * .categoryFilter(CategoryDrillDownFilterProperty.builder()
 * .categoryValues(List.of("categoryValues"))
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .build())
 * .numericEqualityFilter(NumericEqualityDrillDownFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .value(123)
 * .build())
 * .timeRangeFilter(TimeRangeDrillDownFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .rangeMaximum("rangeMaximum")
 * .rangeMinimum("rangeMinimum")
 * .timeGranularity("timeGranularity")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datetimehierarchy.html)
 */
@CdkDslMarker
public class CfnDashboardDateTimeHierarchyPropertyDsl {
  private val cdkBuilder: CfnDashboard.DateTimeHierarchyProperty.Builder =
      CfnDashboard.DateTimeHierarchyProperty.builder()

  private val _drillDownFilters: MutableList<Any> = mutableListOf()

  /**
   * @param drillDownFilters The option that determines the drill down filters for the `DateTime`
   * hierarchy.
   */
  public fun drillDownFilters(vararg drillDownFilters: Any) {
    _drillDownFilters.addAll(listOf(*drillDownFilters))
  }

  /**
   * @param drillDownFilters The option that determines the drill down filters for the `DateTime`
   * hierarchy.
   */
  public fun drillDownFilters(drillDownFilters: Collection<Any>) {
    _drillDownFilters.addAll(drillDownFilters)
  }

  /**
   * @param drillDownFilters The option that determines the drill down filters for the `DateTime`
   * hierarchy.
   */
  public fun drillDownFilters(drillDownFilters: IResolvable) {
    cdkBuilder.drillDownFilters(drillDownFilters)
  }

  /**
   * @param hierarchyId The hierarchy ID of the `DateTime` hierarchy. 
   */
  public fun hierarchyId(hierarchyId: String) {
    cdkBuilder.hierarchyId(hierarchyId)
  }

  public fun build(): CfnDashboard.DateTimeHierarchyProperty {
    if(_drillDownFilters.isNotEmpty()) cdkBuilder.drillDownFilters(_drillDownFilters)
    return cdkBuilder.build()
  }
}
