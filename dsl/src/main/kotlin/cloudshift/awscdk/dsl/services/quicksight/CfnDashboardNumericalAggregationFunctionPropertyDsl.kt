@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardNumericalAggregationFunctionPropertyDsl {
  private val cdkBuilder: CfnDashboard.NumericalAggregationFunctionProperty.Builder =
      CfnDashboard.NumericalAggregationFunctionProperty.builder()

  public fun percentileAggregation(percentileAggregation: IResolvable) {
    cdkBuilder.percentileAggregation(percentileAggregation)
  }

  public
      fun percentileAggregation(percentileAggregation: CfnDashboard.PercentileAggregationProperty) {
    cdkBuilder.percentileAggregation(percentileAggregation)
  }

  public fun simpleNumericalAggregation(simpleNumericalAggregation: String) {
    cdkBuilder.simpleNumericalAggregation(simpleNumericalAggregation)
  }

  public fun build(): CfnDashboard.NumericalAggregationFunctionProperty = cdkBuilder.build()
}
