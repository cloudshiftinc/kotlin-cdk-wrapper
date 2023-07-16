@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateNumericalAggregationFunctionPropertyDsl {
  private val cdkBuilder: CfnTemplate.NumericalAggregationFunctionProperty.Builder =
      CfnTemplate.NumericalAggregationFunctionProperty.builder()

  public fun percentileAggregation(percentileAggregation: IResolvable) {
    cdkBuilder.percentileAggregation(percentileAggregation)
  }

  public
      fun percentileAggregation(percentileAggregation: CfnTemplate.PercentileAggregationProperty) {
    cdkBuilder.percentileAggregation(percentileAggregation)
  }

  public fun simpleNumericalAggregation(simpleNumericalAggregation: String) {
    cdkBuilder.simpleNumericalAggregation(simpleNumericalAggregation)
  }

  public fun build(): CfnTemplate.NumericalAggregationFunctionProperty = cdkBuilder.build()
}
