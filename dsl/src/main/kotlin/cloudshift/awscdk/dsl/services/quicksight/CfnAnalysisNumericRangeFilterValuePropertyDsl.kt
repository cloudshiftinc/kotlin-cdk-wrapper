@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisNumericRangeFilterValuePropertyDsl {
  private val cdkBuilder: CfnAnalysis.NumericRangeFilterValueProperty.Builder =
      CfnAnalysis.NumericRangeFilterValueProperty.builder()

  public fun parameter(parameter: String) {
    cdkBuilder.parameter(parameter)
  }

  public fun staticValue(staticValue: Number) {
    cdkBuilder.staticValue(staticValue)
  }

  public fun build(): CfnAnalysis.NumericRangeFilterValueProperty = cdkBuilder.build()
}
