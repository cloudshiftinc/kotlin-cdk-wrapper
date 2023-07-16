@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardColumnSortPropertyDsl {
  private val cdkBuilder: CfnDashboard.ColumnSortProperty.Builder =
      CfnDashboard.ColumnSortProperty.builder()

  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun aggregationFunction(aggregationFunction: CfnDashboard.AggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  public fun sortBy(sortBy: IResolvable) {
    cdkBuilder.sortBy(sortBy)
  }

  public fun sortBy(sortBy: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.sortBy(sortBy)
  }

  public fun build(): CfnDashboard.ColumnSortProperty = cdkBuilder.build()
}
