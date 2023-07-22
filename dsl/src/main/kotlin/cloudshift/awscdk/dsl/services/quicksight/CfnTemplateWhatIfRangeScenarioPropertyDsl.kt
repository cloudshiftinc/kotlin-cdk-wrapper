@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateWhatIfRangeScenarioPropertyDsl {
  private val cdkBuilder: CfnTemplate.WhatIfRangeScenarioProperty.Builder =
      CfnTemplate.WhatIfRangeScenarioProperty.builder()

  /**
   * @param endDate The end date in the date range that you need the forecast results for. 
   */
  public fun endDate(endDate: String) {
    cdkBuilder.endDate(endDate)
  }

  /**
   * @param startDate The start date in the date range that you need the forecast results for. 
   */
  public fun startDate(startDate: String) {
    cdkBuilder.startDate(startDate)
  }

  /**
   * @param value The target value that you want to meet for the provided date range. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTemplate.WhatIfRangeScenarioProperty = cdkBuilder.build()
}
