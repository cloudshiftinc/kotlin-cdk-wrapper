@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateForecastConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ForecastConfigurationProperty.Builder =
      CfnTemplate.ForecastConfigurationProperty.builder()

  /**
   * @param forecastProperties The forecast properties setup of a forecast in the line chart.
   */
  public fun forecastProperties(forecastProperties: IResolvable) {
    cdkBuilder.forecastProperties(forecastProperties)
  }

  /**
   * @param forecastProperties The forecast properties setup of a forecast in the line chart.
   */
  public
      fun forecastProperties(forecastProperties: CfnTemplate.TimeBasedForecastPropertiesProperty) {
    cdkBuilder.forecastProperties(forecastProperties)
  }

  /**
   * @param scenario The forecast scenario of a forecast in the line chart.
   */
  public fun scenario(scenario: IResolvable) {
    cdkBuilder.scenario(scenario)
  }

  /**
   * @param scenario The forecast scenario of a forecast in the line chart.
   */
  public fun scenario(scenario: CfnTemplate.ForecastScenarioProperty) {
    cdkBuilder.scenario(scenario)
  }

  public fun build(): CfnTemplate.ForecastConfigurationProperty = cdkBuilder.build()
}
