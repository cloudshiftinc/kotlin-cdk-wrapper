@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardForecastScenarioPropertyDsl {
  private val cdkBuilder: CfnDashboard.ForecastScenarioProperty.Builder =
      CfnDashboard.ForecastScenarioProperty.builder()

  public fun whatIfPointScenario(whatIfPointScenario: IResolvable) {
    cdkBuilder.whatIfPointScenario(whatIfPointScenario)
  }

  public fun whatIfPointScenario(whatIfPointScenario: CfnDashboard.WhatIfPointScenarioProperty) {
    cdkBuilder.whatIfPointScenario(whatIfPointScenario)
  }

  public fun whatIfRangeScenario(whatIfRangeScenario: IResolvable) {
    cdkBuilder.whatIfRangeScenario(whatIfRangeScenario)
  }

  public fun whatIfRangeScenario(whatIfRangeScenario: CfnDashboard.WhatIfRangeScenarioProperty) {
    cdkBuilder.whatIfRangeScenario(whatIfRangeScenario)
  }

  public fun build(): CfnDashboard.ForecastScenarioProperty = cdkBuilder.build()
}
