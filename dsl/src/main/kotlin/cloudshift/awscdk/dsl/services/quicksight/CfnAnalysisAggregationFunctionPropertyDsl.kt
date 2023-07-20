@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAggregationFunctionPropertyDsl {
  private val cdkBuilder: CfnAnalysis.AggregationFunctionProperty.Builder =
      CfnAnalysis.AggregationFunctionProperty.builder()

  public fun categoricalAggregationFunction(categoricalAggregationFunction: String) {
    cdkBuilder.categoricalAggregationFunction(categoricalAggregationFunction)
  }

  public fun dateAggregationFunction(dateAggregationFunction: String) {
    cdkBuilder.dateAggregationFunction(dateAggregationFunction)
  }

  public fun numericalAggregationFunction(numericalAggregationFunction: IResolvable) {
    cdkBuilder.numericalAggregationFunction(numericalAggregationFunction)
  }

  public
      fun numericalAggregationFunction(numericalAggregationFunction: CfnAnalysis.NumericalAggregationFunctionProperty) {
    cdkBuilder.numericalAggregationFunction(numericalAggregationFunction)
  }

  public fun build(): CfnAnalysis.AggregationFunctionProperty = cdkBuilder.build()
}
