@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateRadarChartAreaStyleSettingsPropertyDsl {
  private val cdkBuilder: CfnTemplate.RadarChartAreaStyleSettingsProperty.Builder =
      CfnTemplate.RadarChartAreaStyleSettingsProperty.builder()

  /**
   * @param visibility The visibility settings of a radar chart.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.RadarChartAreaStyleSettingsProperty = cdkBuilder.build()
}
