@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateWhatIfPointScenarioPropertyDsl {
  private val cdkBuilder: CfnTemplate.WhatIfPointScenarioProperty.Builder =
      CfnTemplate.WhatIfPointScenarioProperty.builder()

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

  public fun build(): CfnTemplate.WhatIfPointScenarioProperty = cdkBuilder.build()
}
