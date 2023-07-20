@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateNumericRangeFilterValuePropertyDsl {
  private val cdkBuilder: CfnTemplate.NumericRangeFilterValueProperty.Builder =
      CfnTemplate.NumericRangeFilterValueProperty.builder()

  public fun parameter(parameter: String) {
    cdkBuilder.parameter(parameter)
  }

  public fun staticValue(staticValue: Number) {
    cdkBuilder.staticValue(staticValue)
  }

  public fun build(): CfnTemplate.NumericRangeFilterValueProperty = cdkBuilder.build()
}
