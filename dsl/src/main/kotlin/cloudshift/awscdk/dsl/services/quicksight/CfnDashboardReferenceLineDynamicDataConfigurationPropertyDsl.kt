@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardReferenceLineDynamicDataConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ReferenceLineDynamicDataConfigurationProperty.Builder =
      CfnDashboard.ReferenceLineDynamicDataConfigurationProperty.builder()

  public fun calculation(calculation: IResolvable) {
    cdkBuilder.calculation(calculation)
  }

  public fun calculation(calculation: CfnDashboard.NumericalAggregationFunctionProperty) {
    cdkBuilder.calculation(calculation)
  }

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun measureAggregationFunction(measureAggregationFunction: IResolvable) {
    cdkBuilder.measureAggregationFunction(measureAggregationFunction)
  }

  public
      fun measureAggregationFunction(measureAggregationFunction: CfnDashboard.AggregationFunctionProperty) {
    cdkBuilder.measureAggregationFunction(measureAggregationFunction)
  }

  public fun build(): CfnDashboard.ReferenceLineDynamicDataConfigurationProperty =
      cdkBuilder.build()
}
