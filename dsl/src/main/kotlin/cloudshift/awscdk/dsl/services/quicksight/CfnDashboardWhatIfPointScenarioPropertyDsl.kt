@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardWhatIfPointScenarioPropertyDsl {
  private val cdkBuilder: CfnDashboard.WhatIfPointScenarioProperty.Builder =
      CfnDashboard.WhatIfPointScenarioProperty.builder()

  public fun date(date: String) {
    cdkBuilder.date(date)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.WhatIfPointScenarioProperty = cdkBuilder.build()
}
