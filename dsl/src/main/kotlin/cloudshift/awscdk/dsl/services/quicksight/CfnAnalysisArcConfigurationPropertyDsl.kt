@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisArcConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ArcConfigurationProperty.Builder =
      CfnAnalysis.ArcConfigurationProperty.builder()

  /**
   * @param arcAngle The option that determines the arc angle of a `GaugeChartVisual` .
   */
  public fun arcAngle(arcAngle: Number) {
    cdkBuilder.arcAngle(arcAngle)
  }

  /**
   * @param arcThickness The options that determine the arc thickness of a `GaugeChartVisual` .
   */
  public fun arcThickness(arcThickness: String) {
    cdkBuilder.arcThickness(arcThickness)
  }

  public fun build(): CfnAnalysis.ArcConfigurationProperty = cdkBuilder.build()
}
