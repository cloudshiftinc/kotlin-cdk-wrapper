@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardAggregationSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.AggregationSortConfigurationProperty.Builder =
      CfnDashboard.AggregationSortConfigurationProperty.builder()

  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun aggregationFunction(aggregationFunction: CfnDashboard.AggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun sortDirection(sortDirection: String) {
    cdkBuilder.sortDirection(sortDirection)
  }

  public fun build(): CfnDashboard.AggregationSortConfigurationProperty = cdkBuilder.build()
}
