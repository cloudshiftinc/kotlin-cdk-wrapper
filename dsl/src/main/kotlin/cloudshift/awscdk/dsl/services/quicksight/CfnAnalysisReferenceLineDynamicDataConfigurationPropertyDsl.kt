@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisReferenceLineDynamicDataConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ReferenceLineDynamicDataConfigurationProperty.Builder =
      CfnAnalysis.ReferenceLineDynamicDataConfigurationProperty.builder()

  public fun calculation(calculation: IResolvable) {
    cdkBuilder.calculation(calculation)
  }

  public fun calculation(calculation: CfnAnalysis.NumericalAggregationFunctionProperty) {
    cdkBuilder.calculation(calculation)
  }

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun measureAggregationFunction(measureAggregationFunction: IResolvable) {
    cdkBuilder.measureAggregationFunction(measureAggregationFunction)
  }

  public
      fun measureAggregationFunction(measureAggregationFunction: CfnAnalysis.AggregationFunctionProperty) {
    cdkBuilder.measureAggregationFunction(measureAggregationFunction)
  }

  public fun build(): CfnAnalysis.ReferenceLineDynamicDataConfigurationProperty = cdkBuilder.build()
}
