@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisArcOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ArcOptionsProperty.Builder =
      CfnAnalysis.ArcOptionsProperty.builder()

  /**
   * @param arcThickness The arc thickness of a `GaugeChartVisual` .
   */
  public fun arcThickness(arcThickness: String) {
    cdkBuilder.arcThickness(arcThickness)
  }

  public fun build(): CfnAnalysis.ArcOptionsProperty = cdkBuilder.build()
}
