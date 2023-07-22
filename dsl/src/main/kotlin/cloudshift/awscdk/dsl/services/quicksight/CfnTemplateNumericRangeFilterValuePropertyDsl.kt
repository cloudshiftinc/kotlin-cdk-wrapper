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

  /**
   * @param parameter The parameter that is used in the numeric range.
   */
  public fun parameter(parameter: String) {
    cdkBuilder.parameter(parameter)
  }

  /**
   * @param staticValue The static value of the numeric range filter.
   */
  public fun staticValue(staticValue: Number) {
    cdkBuilder.staticValue(staticValue)
  }

  public fun build(): CfnTemplate.NumericRangeFilterValueProperty = cdkBuilder.build()
}
