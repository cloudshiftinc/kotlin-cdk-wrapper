@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTimeRangeFilterValuePropertyDsl {
  private val cdkBuilder: CfnAnalysis.TimeRangeFilterValueProperty.Builder =
      CfnAnalysis.TimeRangeFilterValueProperty.builder()

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
  public fun rollingDate(rollingDate: CfnAnalysis.RollingDateConfigurationProperty) {
    cdkBuilder.rollingDate(rollingDate)
  }

  /**
   * @param staticValue The static input value.
   */
  public fun staticValue(staticValue: String) {
    cdkBuilder.staticValue(staticValue)
  }

  public fun build(): CfnAnalysis.TimeRangeFilterValueProperty = cdkBuilder.build()
}
