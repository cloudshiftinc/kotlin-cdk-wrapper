@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisForecastScenarioPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ForecastScenarioProperty.Builder =
      CfnAnalysis.ForecastScenarioProperty.builder()

  /**
   * @param whatIfPointScenario The what-if analysis forecast setup with the target date.
   */
  public fun whatIfPointScenario(whatIfPointScenario: IResolvable) {
    cdkBuilder.whatIfPointScenario(whatIfPointScenario)
  }

  /**
   * @param whatIfPointScenario The what-if analysis forecast setup with the target date.
   */
  public fun whatIfPointScenario(whatIfPointScenario: CfnAnalysis.WhatIfPointScenarioProperty) {
    cdkBuilder.whatIfPointScenario(whatIfPointScenario)
  }

  /**
   * @param whatIfRangeScenario The what-if analysis forecast setup with the date range.
   */
  public fun whatIfRangeScenario(whatIfRangeScenario: IResolvable) {
    cdkBuilder.whatIfRangeScenario(whatIfRangeScenario)
  }

  /**
   * @param whatIfRangeScenario The what-if analysis forecast setup with the date range.
   */
  public fun whatIfRangeScenario(whatIfRangeScenario: CfnAnalysis.WhatIfRangeScenarioProperty) {
    cdkBuilder.whatIfRangeScenario(whatIfRangeScenario)
  }

  public fun build(): CfnAnalysis.ForecastScenarioProperty = cdkBuilder.build()
}
