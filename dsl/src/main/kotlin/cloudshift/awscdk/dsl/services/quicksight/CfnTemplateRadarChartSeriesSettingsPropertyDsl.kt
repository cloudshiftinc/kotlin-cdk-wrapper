@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateRadarChartSeriesSettingsPropertyDsl {
  private val cdkBuilder: CfnTemplate.RadarChartSeriesSettingsProperty.Builder =
      CfnTemplate.RadarChartSeriesSettingsProperty.builder()

  public fun areaStyleSettings(areaStyleSettings: IResolvable) {
    cdkBuilder.areaStyleSettings(areaStyleSettings)
  }

  public fun areaStyleSettings(areaStyleSettings: CfnTemplate.RadarChartAreaStyleSettingsProperty) {
    cdkBuilder.areaStyleSettings(areaStyleSettings)
  }

  public fun build(): CfnTemplate.RadarChartSeriesSettingsProperty = cdkBuilder.build()
}
