@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateColumnSortPropertyDsl {
  private val cdkBuilder: CfnTemplate.ColumnSortProperty.Builder =
      CfnTemplate.ColumnSortProperty.builder()

  /**
   * @param aggregationFunction The aggregation function that is defined in the column sort.
   */
  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param aggregationFunction The aggregation function that is defined in the column sort.
   */
  public fun aggregationFunction(aggregationFunction: CfnTemplate.AggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param direction The sort direction. 
   */
  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  /**
   * @param sortBy the value to be set. 
   */
  public fun sortBy(sortBy: IResolvable) {
    cdkBuilder.sortBy(sortBy)
  }

  /**
   * @param sortBy the value to be set. 
   */
  public fun sortBy(sortBy: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.sortBy(sortBy)
  }

  public fun build(): CfnTemplate.ColumnSortProperty = cdkBuilder.build()
}
