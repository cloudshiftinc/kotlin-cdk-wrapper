@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTimeRangeFilterValuePropertyDsl {
  private val cdkBuilder: CfnTemplate.TimeRangeFilterValueProperty.Builder =
      CfnTemplate.TimeRangeFilterValueProperty.builder()

  /**
   * @param parameter The parameter type input value.
   */
  public fun parameter(parameter: String) {
    cdkBuilder.parameter(parameter)
  }

  /**
   * @param rollingDate The rolling date input value.
   */
  public fun rollingDate(rollingDate: IResolvable) {
    cdkBuilder.rollingDate(rollingDate)
  }

  /**
   * @param rollingDate The rolling date input value.
   */
  public fun rollingDate(rollingDate: CfnTemplate.RollingDateConfigurationProperty) {
    cdkBuilder.rollingDate(rollingDate)
  }

  /**
   * @param staticValue The static input value.
   */
  public fun staticValue(staticValue: String) {
    cdkBuilder.staticValue(staticValue)
  }

  public fun build(): CfnTemplate.TimeRangeFilterValueProperty = cdkBuilder.build()
}
