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

  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun aggregationFunction(aggregationFunction: CfnTemplate.AggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  public fun sortBy(sortBy: IResolvable) {
    cdkBuilder.sortBy(sortBy)
  }

  public fun sortBy(sortBy: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.sortBy(sortBy)
  }

  public fun build(): CfnTemplate.ColumnSortProperty = cdkBuilder.build()
}
