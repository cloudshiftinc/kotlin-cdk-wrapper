@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisWhatIfRangeScenarioPropertyDsl {
  private val cdkBuilder: CfnAnalysis.WhatIfRangeScenarioProperty.Builder =
      CfnAnalysis.WhatIfRangeScenarioProperty.builder()

  public fun endDate(endDate: String) {
    cdkBuilder.endDate(endDate)
  }

  public fun startDate(startDate: String) {
    cdkBuilder.startDate(startDate)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnalysis.WhatIfRangeScenarioProperty = cdkBuilder.build()
}
