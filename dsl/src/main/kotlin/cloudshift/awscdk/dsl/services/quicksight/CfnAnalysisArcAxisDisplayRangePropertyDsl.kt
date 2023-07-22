@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisArcAxisDisplayRangePropertyDsl {
  private val cdkBuilder: CfnAnalysis.ArcAxisDisplayRangeProperty.Builder =
      CfnAnalysis.ArcAxisDisplayRangeProperty.builder()

  /**
   * @param max The maximum value of the arc axis range.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum value of the arc axis range.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnAnalysis.ArcAxisDisplayRangeProperty = cdkBuilder.build()
}
