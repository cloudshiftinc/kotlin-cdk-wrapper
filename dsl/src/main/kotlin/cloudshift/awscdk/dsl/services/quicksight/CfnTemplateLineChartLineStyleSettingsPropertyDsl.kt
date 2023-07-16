@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLineChartLineStyleSettingsPropertyDsl {
  private val cdkBuilder: CfnTemplate.LineChartLineStyleSettingsProperty.Builder =
      CfnTemplate.LineChartLineStyleSettingsProperty.builder()

  public fun lineInterpolation(lineInterpolation: String) {
    cdkBuilder.lineInterpolation(lineInterpolation)
  }

  public fun lineStyle(lineStyle: String) {
    cdkBuilder.lineStyle(lineStyle)
  }

  public fun lineVisibility(lineVisibility: String) {
    cdkBuilder.lineVisibility(lineVisibility)
  }

  public fun lineWidth(lineWidth: String) {
    cdkBuilder.lineWidth(lineWidth)
  }

  public fun build(): CfnTemplate.LineChartLineStyleSettingsProperty = cdkBuilder.build()
}
