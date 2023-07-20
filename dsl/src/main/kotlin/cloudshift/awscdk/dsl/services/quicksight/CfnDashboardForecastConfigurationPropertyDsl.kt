@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardForecastConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.ForecastConfigurationProperty.Builder =
      CfnDashboard.ForecastConfigurationProperty.builder()

  public fun forecastProperties(forecastProperties: IResolvable) {
    cdkBuilder.forecastProperties(forecastProperties)
  }

  public
      fun forecastProperties(forecastProperties: CfnDashboard.TimeBasedForecastPropertiesProperty) {
    cdkBuilder.forecastProperties(forecastProperties)
  }

  public fun scenario(scenario: IResolvable) {
    cdkBuilder.scenario(scenario)
  }

  public fun scenario(scenario: CfnDashboard.ForecastScenarioProperty) {
    cdkBuilder.scenario(scenario)
  }

  public fun build(): CfnDashboard.ForecastConfigurationProperty = cdkBuilder.build()
}
