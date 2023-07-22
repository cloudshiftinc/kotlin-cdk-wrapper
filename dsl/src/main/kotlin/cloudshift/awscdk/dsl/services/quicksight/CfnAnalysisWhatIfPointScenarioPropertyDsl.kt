@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisWhatIfPointScenarioPropertyDsl {
  private val cdkBuilder: CfnAnalysis.WhatIfPointScenarioProperty.Builder =
      CfnAnalysis.WhatIfPointScenarioProperty.builder()

  /**
   * @param date The date that you need the forecast results for. 
   */
  public fun date(date: String) {
    cdkBuilder.date(date)
  }

  /**
   * @param value The target value that you want to meet for the provided date. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnalysis.WhatIfPointScenarioProperty = cdkBuilder.build()
}
